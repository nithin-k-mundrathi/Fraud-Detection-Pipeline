// ORM class for table 'member_details'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Tue Oct 24 19:14:38 EDT 2023
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

public class member_details extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("card_id", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        member_details.this.card_id = (Long)value;
      }
    });
    setters.put("member_id", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        member_details.this.member_id = (Long)value;
      }
    });
    setters.put("member_joining_dt", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        member_details.this.member_joining_dt = (String)value;
      }
    });
    setters.put("card_purchase_dt", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        member_details.this.card_purchase_dt = (String)value;
      }
    });
    setters.put("country", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        member_details.this.country = (String)value;
      }
    });
    setters.put("city", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        member_details.this.city = (String)value;
      }
    });
    setters.put("score", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        member_details.this.score = (Float)value;
      }
    });
  }
  public member_details() {
    init0();
  }
  private Long card_id;
  public Long get_card_id() {
    return card_id;
  }
  public void set_card_id(Long card_id) {
    this.card_id = card_id;
  }
  public member_details with_card_id(Long card_id) {
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
  public member_details with_member_id(Long member_id) {
    this.member_id = member_id;
    return this;
  }
  private String member_joining_dt;
  public String get_member_joining_dt() {
    return member_joining_dt;
  }
  public void set_member_joining_dt(String member_joining_dt) {
    this.member_joining_dt = member_joining_dt;
  }
  public member_details with_member_joining_dt(String member_joining_dt) {
    this.member_joining_dt = member_joining_dt;
    return this;
  }
  private String card_purchase_dt;
  public String get_card_purchase_dt() {
    return card_purchase_dt;
  }
  public void set_card_purchase_dt(String card_purchase_dt) {
    this.card_purchase_dt = card_purchase_dt;
  }
  public member_details with_card_purchase_dt(String card_purchase_dt) {
    this.card_purchase_dt = card_purchase_dt;
    return this;
  }
  private String country;
  public String get_country() {
    return country;
  }
  public void set_country(String country) {
    this.country = country;
  }
  public member_details with_country(String country) {
    this.country = country;
    return this;
  }
  private String city;
  public String get_city() {
    return city;
  }
  public void set_city(String city) {
    this.city = city;
  }
  public member_details with_city(String city) {
    this.city = city;
    return this;
  }
  private Float score;
  public Float get_score() {
    return score;
  }
  public void set_score(Float score) {
    this.score = score;
  }
  public member_details with_score(Float score) {
    this.score = score;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof member_details)) {
      return false;
    }
    member_details that = (member_details) o;
    boolean equal = true;
    equal = equal && (this.card_id == null ? that.card_id == null : this.card_id.equals(that.card_id));
    equal = equal && (this.member_id == null ? that.member_id == null : this.member_id.equals(that.member_id));
    equal = equal && (this.member_joining_dt == null ? that.member_joining_dt == null : this.member_joining_dt.equals(that.member_joining_dt));
    equal = equal && (this.card_purchase_dt == null ? that.card_purchase_dt == null : this.card_purchase_dt.equals(that.card_purchase_dt));
    equal = equal && (this.country == null ? that.country == null : this.country.equals(that.country));
    equal = equal && (this.city == null ? that.city == null : this.city.equals(that.city));
    equal = equal && (this.score == null ? that.score == null : this.score.equals(that.score));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof member_details)) {
      return false;
    }
    member_details that = (member_details) o;
    boolean equal = true;
    equal = equal && (this.card_id == null ? that.card_id == null : this.card_id.equals(that.card_id));
    equal = equal && (this.member_id == null ? that.member_id == null : this.member_id.equals(that.member_id));
    equal = equal && (this.member_joining_dt == null ? that.member_joining_dt == null : this.member_joining_dt.equals(that.member_joining_dt));
    equal = equal && (this.card_purchase_dt == null ? that.card_purchase_dt == null : this.card_purchase_dt.equals(that.card_purchase_dt));
    equal = equal && (this.country == null ? that.country == null : this.country.equals(that.country));
    equal = equal && (this.city == null ? that.city == null : this.city.equals(that.city));
    equal = equal && (this.score == null ? that.score == null : this.score.equals(that.score));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.card_id = JdbcWritableBridge.readLong(1, __dbResults);
    this.member_id = JdbcWritableBridge.readLong(2, __dbResults);
    this.member_joining_dt = JdbcWritableBridge.readString(3, __dbResults);
    this.card_purchase_dt = JdbcWritableBridge.readString(4, __dbResults);
    this.country = JdbcWritableBridge.readString(5, __dbResults);
    this.city = JdbcWritableBridge.readString(6, __dbResults);
    this.score = JdbcWritableBridge.readFloat(7, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.card_id = JdbcWritableBridge.readLong(1, __dbResults);
    this.member_id = JdbcWritableBridge.readLong(2, __dbResults);
    this.member_joining_dt = JdbcWritableBridge.readString(3, __dbResults);
    this.card_purchase_dt = JdbcWritableBridge.readString(4, __dbResults);
    this.country = JdbcWritableBridge.readString(5, __dbResults);
    this.city = JdbcWritableBridge.readString(6, __dbResults);
    this.score = JdbcWritableBridge.readFloat(7, __dbResults);
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
    JdbcWritableBridge.writeString(member_joining_dt, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(card_purchase_dt, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(country, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(city, 6 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeFloat(score, 7 + __off, 7, __dbStmt);
    return 7;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeLong(card_id, 1 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeLong(member_id, 2 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeString(member_joining_dt, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(card_purchase_dt, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(country, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(city, 6 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeFloat(score, 7 + __off, 7, __dbStmt);
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
        this.member_joining_dt = null;
    } else {
    this.member_joining_dt = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.card_purchase_dt = null;
    } else {
    this.card_purchase_dt = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.country = null;
    } else {
    this.country = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.city = null;
    } else {
    this.city = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.score = null;
    } else {
    this.score = Float.valueOf(__dataIn.readFloat());
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
    if (null == this.member_joining_dt) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, member_joining_dt);
    }
    if (null == this.card_purchase_dt) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, card_purchase_dt);
    }
    if (null == this.country) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, country);
    }
    if (null == this.city) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, city);
    }
    if (null == this.score) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeFloat(this.score);
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
    if (null == this.member_joining_dt) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, member_joining_dt);
    }
    if (null == this.card_purchase_dt) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, card_purchase_dt);
    }
    if (null == this.country) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, country);
    }
    if (null == this.city) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, city);
    }
    if (null == this.score) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeFloat(this.score);
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
    __sb.append(FieldFormatter.escapeAndEnclose(member_joining_dt==null?"null":member_joining_dt, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(card_purchase_dt==null?"null":card_purchase_dt, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(country==null?"null":country, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(city==null?"null":city, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(score==null?"null":"" + score, delimiters));
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
    __sb.append(FieldFormatter.escapeAndEnclose(member_joining_dt==null?"null":member_joining_dt, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(card_purchase_dt==null?"null":card_purchase_dt, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(country==null?"null":country, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(city==null?"null":city, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(score==null?"null":"" + score, delimiters));
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
    if (__cur_str.equals("null")) { this.member_joining_dt = null; } else {
      this.member_joining_dt = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.card_purchase_dt = null; } else {
      this.card_purchase_dt = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.country = null; } else {
      this.country = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.city = null; } else {
      this.city = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.score = null; } else {
      this.score = Float.valueOf(__cur_str);
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
    if (__cur_str.equals("null")) { this.member_joining_dt = null; } else {
      this.member_joining_dt = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.card_purchase_dt = null; } else {
      this.card_purchase_dt = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.country = null; } else {
      this.country = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.city = null; } else {
      this.city = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.score = null; } else {
      this.score = Float.valueOf(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    member_details o = (member_details) super.clone();
    return o;
  }

  public void clone0(member_details o) throws CloneNotSupportedException {
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("card_id", this.card_id);
    __sqoop$field_map.put("member_id", this.member_id);
    __sqoop$field_map.put("member_joining_dt", this.member_joining_dt);
    __sqoop$field_map.put("card_purchase_dt", this.card_purchase_dt);
    __sqoop$field_map.put("country", this.country);
    __sqoop$field_map.put("city", this.city);
    __sqoop$field_map.put("score", this.score);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("card_id", this.card_id);
    __sqoop$field_map.put("member_id", this.member_id);
    __sqoop$field_map.put("member_joining_dt", this.member_joining_dt);
    __sqoop$field_map.put("card_purchase_dt", this.card_purchase_dt);
    __sqoop$field_map.put("country", this.country);
    __sqoop$field_map.put("city", this.city);
    __sqoop$field_map.put("score", this.score);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if (!setters.containsKey(__fieldName)) {
      throw new RuntimeException("No such field:"+__fieldName);
    }
    setters.get(__fieldName).setField(__fieldVal);
  }

}
