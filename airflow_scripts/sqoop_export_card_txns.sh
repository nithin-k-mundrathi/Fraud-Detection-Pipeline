#!/bin/sh
# Shell script loading card_transactions data to MySQL!
# Call command - ./sqoop_export_card_txns.sh quickstart.cloudera:3306 bigdataproject root card_transactions
DBSERVER=${1}
DBNAME=${2}
DBUSER=${3}
DBSTGTABLE=${4}
DBTABLE=${5}


sqoop export \
-Dhadoop.security.credential.provider.path=jceks://hdfs/user/itv009314/aws.db.password.jceks \
--connect jdbc:mysql://${DBSERVER}/${DBNAME} \
--username ${DBUSER} \
--password-alias aws.db.password \
--staging-table ${DBSTGTABLE} \
--table ${DBTABLE} \
--export-dir /user/itv009314/project_input/card_transactions_recent.csv \
-m 1 \
--fields-terminated-by ','
