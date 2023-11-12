#!/bin/sh
# Shell script loading card_transactions data to Hive!
# Call command - ./sqoop_import_card_txns.sh quickstart.cloudera:3306 bigdataproject root card_transactions
DBSERVER=${1}
DBNAME=${2}
DBUSER=${3}
DBTABLE=${4}

sqoop import \
-Dhadoop.security.credential.provider.path=jceks://hdfs/user/itv009314/aws.db.password.jceks \
--connect jdbc:mysql://${DBSERVER}/${DBNAME} \
--username ${DBUSER} \
--password-alias aws.db.password \
--table ${DBTABLE} \
-m 1 \
--target-dir /user/itv009314/project_input/airflow/card_transactions \
--delete-target-dir
