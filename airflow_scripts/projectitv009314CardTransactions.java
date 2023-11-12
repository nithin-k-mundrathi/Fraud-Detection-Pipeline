// ORM class for table 'projectitv009314CardTransactions'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Sun Oct 22 15:57:37 EDT 2023
// For connector: org.apache.sqoop.manager.MySQLManager
import org.apache.hadoop.io.BytesWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.Writable;
import org.apache.hadoop.mapred.lib.db.DBWritable;
import com.cloudera.sqoop.lib.JdbcWritableBridge;
import com.cloudera.sqoop.lib.DelimiterSet;
import com.cloudera.sqoop.lib.FieldFormatter;
import com.cloudera.sqoop.lib.RecordParser;
import com.cloudera.sqoop.lib.BooleanParser;
import com.cloudera.sqoop.lib.BlobRef;
import com.cloudera.sqoop.lib.ClobRef;
import com.cloudera.sqoop.lib.LargeObjectLoader;
import com.cloudera.sqoop.lib.SqoopRecord;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class projectitv009314CardTransactions extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("card_id", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        projectitv009314CardTransactions.this.card_id = (Long)value;
      }
    });
    setters.put("member_id", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        projectitv009314CardTransactions.this.member_id = (Long)value;
      }
    });
    setters.put("amount", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        projectitv009314CardTransactions.this.amount = (Integer)value;
      }
    });
    setters.put("postcode", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        projectitv009314CardTransactions.this.postcode = (Integer)value;
      }
    });
    setters.put("pos_id", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        projectitv009314CardTransactions.this.pos_id = (Long)value;
      }
    });
    setters.put("transaction_dt", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        projectitv009314CardTransactions.this.transaction_dt = (String)value;
      }
    });
    setters.put("status", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        projectitv009314CardTransactions.this.status = (String)value;
      }
    });
  }
  public projectitv009314CardTransactions() {
    init0();
  }
  private Long card_id;
  public Long get_card_id() {
    return card_id;
  }
  public void set_card_id(Long card_id) {
    this.card_id = card_id;
  }
  public projectitv009314CardTransactions with_card_id(Long card_id) {
    this.card_id = card_id;
    return this;
  }
  private Long member_id;
  public Long get_member_id() {
    return member_id;
  }
  public void set_member_id(Long member_id) {
    this.member_id = member_id;
  }
  public projectitv009314CardTransactions with_member_id(Long member_id) {
    this.member_id = member_id;
    return this;
  }
  private Integer amount;
  public Integer get_amount() {
    return amount;
  }
  public void set_amount(Integer amount) {
    this.amount = amount;
  }
  public projectitv009314CardTransactions with_amount(Integer amount) {
    this.amount = amount;
    return this;
  }
  private Integer postcode;
  public Integer get_postcode() {
    return postcode;
  }
  public void set_postcode(Integer postcode) {
    this.postcode = postcode;
  }
  public projectitv009314CardTransactions with_postcode(Integer postcode) {
    this.postcode = postcode;
    return this;
  }
  private Long pos_id;
  public Long get_pos_id() {
    return pos_id;
  }
  public void set_pos_id(Long pos_id) {
    this.pos_id = pos_id;
  }
  public projectitv009314CardTransactions with_pos_id(Long pos_id) {
    this.pos_id = pos_id;
    return this;
  }
  private String transaction_dt;
  public String get_transaction_dt() {
    return transaction_dt;
  }
  public void set_transaction_dt(String transaction_dt) {
    this.transaction_dt = transaction_dt;
  }
  public projectitv009314CardTransactions with_transaction_dt(String transaction_dt) {
    this.transaction_dt = transaction_dt;
    return this;
  }
  private String status;
  public String get_status() {
    return status;
  }
  public void set_status(String status) {
    this.status = status;
  }
  public projectitv009314CardTransactions with_status(String status) {
    this.status = status;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof projectitv009314CardTransactions)) {
      return false;
    }
    projectitv009314CardTransactions that = (projectitv009314CardTransactions) o;
    boolean equal = true;
    equal = equal && (this.card_id == null ? that.card_id == null : this.card_id.equals(that.card_id));
    equal = equal && (this.member_id == null ? that.member_id == null : this.member_id.equals(that.member_id));
    equal = equal && (this.amount == null ? that.amount == null : this.amount.equals(that.amount));
    equal = equal && (this.postcode == null ? that.postcode == null : this.postcode.equals(that.postcode));
    equal = equal && (this.pos_id == null ? that.pos_id == null : this.pos_id.equals(that.pos_id));
    equal = equal && (this.transaction_dt == null ? that.transaction_dt == null : this.transaction_dt.equals(that.transaction_dt));
    equal = equal && (this.status == null ? that.status == null : this.status.equals(that.status));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof projectitv009314CardTransactions)) {
      return false;
    }
    projectitv009314CardTransactions that = (projectitv009314CardTransactions) o;
    boolean equal = true;
    equal = equal && (this.card_id == null ? that.card_id == null : this.card_id.equals(that.card_id));
    equal = equal && (this.member_id == null ? that.member_id == null : this.member_id.equals(that.member_id));
    equal = equal && (this.amount == null ? that.amount == null : this.amount.equals(that.amount));
    equal = equal && (this.postcode == null ? that.postcode == null : this.postcode.equals(that.postcode));
    equal = equal && (this.pos_id == null ? that.pos_id == null : this.pos_id.equals(that.pos_id));
    equal = equal && (this.transaction_dt == null ? that.transaction_dt == null : this.transaction_dt.equals(that.transaction_dt));
    equal = equal && (this.status == null ? that.status == null : this.status.equals(that.status));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.card_id = JdbcWritableBridge.readLong(1, __dbResults);
    this.member_id = JdbcWritableBridge.readLong(2, __dbResults);
    this.amount = JdbcWritableBridge.readInteger(3, __dbResults);
    this.postcode = JdbcWritableBridge.readInteger(4, __dbResults);
    this.pos_id = JdbcWritableBridge.readLong(5, __dbResults);
    this.transaction_dt = JdbcWritableBridge.readString(6, __dbResults);
    this.status = JdbcWritableBridge.readString(7, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.card_id = JdbcWritableBridge.readLong(1, __dbResults);
    this.member_id = JdbcWritableBridge.readLong(2, __dbResults);
    this.amount = JdbcWritableBridge.readInteger(3, __dbResults);
    this.postcode = JdbcWritableBridge.readInteger(4, __dbResults);
    this.pos_id = JdbcWritableBridge.readLong(5, __dbResults);
    this.transaction_dt = JdbcWritableBridge.readString(6, __dbResults);
    this.status = JdbcWritableBridge.readString(7, __dbResults);
  }
  public void loadLargeObjects(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void loadLargeObjects0(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void write(PreparedStatement __dbStmt) throws SQLException {
    write(__dbStmt, 0);
  }

  public int write(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeLong(card_id, 1 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeLong(member_id, 2 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeInteger(amount, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(postcode, 4 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeLong(pos_id, 5 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeString(transaction_dt, 6 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(status, 7 + __off, 12, __dbStmt);
    return 7;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeLong(card_id, 1 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeLong(member_id, 2 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeInteger(amount, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(postcode, 4 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeLong(pos_id, 5 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeString(transaction_dt, 6 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(status, 7 + __off, 12, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.card_id = null;
    } else {
    this.card_id = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.member_id = null;
    } else {
    this.member_id = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.amount = null;
    } else {
    this.amount = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.postcode = null;
    } else {
    this.postcode = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.pos_id = null;
    } else {
    this.pos_id = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.transaction_dt = null;
    } else {
    this.transaction_dt = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.status = null;
    } else {
    this.status = Text.readString(__dataIn);
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.card_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.card_id);
    }
    if (null == this.member_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.member_id);
    }
    if (null == this.amount) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.amount);
    }
    if (null == this.postcode) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.postcode);
    }
    if (null == this.pos_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.pos_id);
    }
    if (null == this.transaction_dt) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, transaction_dt);
    }
    if (null == this.status) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, status);
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.card_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.card_id);
    }
    if (null == this.member_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.member_id);
    }
    if (null == this.amount) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.amount);
    }
    if (null == this.postcode) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.postcode);
    }
    if (null == this.pos_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.pos_id);
    }
    if (null == this.transaction_dt) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, transaction_dt);
    }
    if (null == this.status) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, status);
    }
  }
  private static final DelimiterSet __outputDelimiters = new DelimiterSet((char) 44, (char) 10, (char) 0, (char) 0, false);
  public String toString() {
    return toString(__outputDelimiters, true);
  }
  public String toString(DelimiterSet delimiters) {
    return toString(delimiters, true);
  }
  public String toString(boolean useRecordDelim) {
    return toString(__outputDelimiters, useRecordDelim);
  }
  public String toString(DelimiterSet delimiters, boolean useRecordDelim) {
    StringBuilder __sb = new StringBuilder();
    char fieldDelim = delimiters.getFieldsTerminatedBy();
    __sb.append(FieldFormatter.escapeAndEnclose(card_id==null?"null":"" + card_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(member_id==null?"null":"" + member_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(amount==null?"null":"" + amount, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(postcode==null?"null":"" + postcode, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(pos_id==null?"null":"" + pos_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(transaction_dt==null?"null":transaction_dt, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(status==null?"null":status, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(card_id==null?"null":"" + card_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(member_id==null?"null":"" + member_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(amount==null?"null":"" + amount, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(postcode==null?"null":"" + postcode, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(pos_id==null?"null":"" + pos_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(transaction_dt==null?"null":transaction_dt, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(status==null?"null":status, delimiters));
  }
  private static final DelimiterSet __inputDelimiters = new DelimiterSet((char) 44, (char) 10, (char) 0, (char) 0, false);
  private RecordParser __parser;
  public void parse(Text __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharSequence __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(byte [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(char [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(ByteBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  private void __loadFromFields(List<String> fields) {
    Iterator<String> __it = fields.listIterator();
    String __cur_str = null;
    try {
    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.card_id = null; } else {
      this.card_id = Long.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.member_id = null; } else {
      this.member_id = Long.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.amount = null; } else {
      this.amount = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.postcode = null; } else {
      this.postcode = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.pos_id = null; } else {
      this.pos_id = Long.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.transaction_dt = null; } else {
      this.transaction_dt = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.status = null; } else {
      this.status = __cur_str;
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  private void __loadFromFields0(Iterator<String> __it) {
    String __cur_str = null;
    try {
    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.card_id = null; } else {
      this.card_id = Long.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.member_id = null; } else {
      this.member_id = Long.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.amount = null; } else {
      this.amount = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.postcode = null; } else {
      this.postcode = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.pos_id = null; } else {
      this.pos_id = Long.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.transaction_dt = null; } else {
      this.transaction_dt = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.status = null; } else {
      this.status = __cur_str;
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    projectitv009314CardTransactions o = (projectitv009314CardTransactions) super.clone();
    return o;
  }

  public void clone0(projectitv009314CardTransactions o) throws CloneNotSupportedException {
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("card_id", this.card_id);
    __sqoop$field_map.put("member_id", this.member_id);
    __sqoop$field_map.put("amount", this.amount);
    __sqoop$field_map.put("postcode", this.postcode);
    __sqoop$field_map.put("pos_id", this.pos_id);
    __sqoop$field_map.put("transaction_dt", this.transaction_dt);
    __sqoop$field_map.put("status", this.status);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("card_id", this.card_id);
    __sqoop$field_map.put("member_id", this.member_id);
    __sqoop$field_map.put("amount", this.amount);
    __sqoop$field_map.put("postcode", this.postcode);
    __sqoop$field_map.put("pos_id", this.pos_id);
    __sqoop$field_map.put("transaction_dt", this.transaction_dt);
    __sqoop$field_map.put("status", this.status);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if (!setters.containsKey(__fieldName)) {
      throw new RuntimeException("No such field:"+__fieldName);
    }
    setters.get(__fieldName).setField(__fieldVal);
  }

}
