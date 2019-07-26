/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.ikea.cataloguemanagement.itemcategorizer.avro;

import org.apache.avro.specific.SpecificData;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class testItemVO extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -5253502512683423607L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"testItemVO\",\"namespace\":\"com.ikea.cataloguemanagement.itemcategorizer.avro\",\"fields\":[{\"name\":\"itemNo\",\"type\":\"string\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<testItemVO> ENCODER =
      new BinaryMessageEncoder<testItemVO>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<testItemVO> DECODER =
      new BinaryMessageDecoder<testItemVO>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   */
  public static BinaryMessageDecoder<testItemVO> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   */
  public static BinaryMessageDecoder<testItemVO> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<testItemVO>(MODEL$, SCHEMA$, resolver);
  }

  /** Serializes this testItemVO to a ByteBuffer. */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /** Deserializes a testItemVO from a ByteBuffer. */
  public static testItemVO fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  @Deprecated public java.lang.CharSequence itemNo;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public testItemVO() {}

  /**
   * All-args constructor.
   * @param itemNo The new value for itemNo
   */
  public testItemVO(java.lang.CharSequence itemNo) {
    this.itemNo = itemNo;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return itemNo;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: itemNo = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'itemNo' field.
   * @return The value of the 'itemNo' field.
   */
  public java.lang.CharSequence getItemNo() {
    return itemNo;
  }

  /**
   * Sets the value of the 'itemNo' field.
   * @param value the value to set.
   */
  public void setItemNo(java.lang.CharSequence value) {
    this.itemNo = value;
  }

  /**
   * Creates a new testItemVO RecordBuilder.
   * @return A new testItemVO RecordBuilder
   */
  public static com.ikea.cataloguemanagement.itemcategorizer.avro.testItemVO.Builder newBuilder() {
    return new com.ikea.cataloguemanagement.itemcategorizer.avro.testItemVO.Builder();
  }

  /**
   * Creates a new testItemVO RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new testItemVO RecordBuilder
   */
  public static com.ikea.cataloguemanagement.itemcategorizer.avro.testItemVO.Builder newBuilder(com.ikea.cataloguemanagement.itemcategorizer.avro.testItemVO.Builder other) {
    return new com.ikea.cataloguemanagement.itemcategorizer.avro.testItemVO.Builder(other);
  }

  /**
   * Creates a new testItemVO RecordBuilder by copying an existing testItemVO instance.
   * @param other The existing instance to copy.
   * @return A new testItemVO RecordBuilder
   */
  public static com.ikea.cataloguemanagement.itemcategorizer.avro.testItemVO.Builder newBuilder(com.ikea.cataloguemanagement.itemcategorizer.avro.testItemVO other) {
    return new com.ikea.cataloguemanagement.itemcategorizer.avro.testItemVO.Builder(other);
  }

  /**
   * RecordBuilder for testItemVO instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<testItemVO>
    implements org.apache.avro.data.RecordBuilder<testItemVO> {

    private java.lang.CharSequence itemNo;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.ikea.cataloguemanagement.itemcategorizer.avro.testItemVO.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.itemNo)) {
        this.itemNo = data().deepCopy(fields()[0].schema(), other.itemNo);
        fieldSetFlags()[0] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing testItemVO instance
     * @param other The existing instance to copy.
     */
    private Builder(com.ikea.cataloguemanagement.itemcategorizer.avro.testItemVO other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.itemNo)) {
        this.itemNo = data().deepCopy(fields()[0].schema(), other.itemNo);
        fieldSetFlags()[0] = true;
      }
    }

    /**
      * Gets the value of the 'itemNo' field.
      * @return The value.
      */
    public java.lang.CharSequence getItemNo() {
      return itemNo;
    }

    /**
      * Sets the value of the 'itemNo' field.
      * @param value The value of 'itemNo'.
      * @return This builder.
      */
    public com.ikea.cataloguemanagement.itemcategorizer.avro.testItemVO.Builder setItemNo(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.itemNo = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'itemNo' field has been set.
      * @return True if the 'itemNo' field has been set, false otherwise.
      */
    public boolean hasItemNo() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'itemNo' field.
      * @return This builder.
      */
    public com.ikea.cataloguemanagement.itemcategorizer.avro.testItemVO.Builder clearItemNo() {
      itemNo = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public testItemVO build() {
      try {
        testItemVO record = new testItemVO();
        record.itemNo = fieldSetFlags()[0] ? this.itemNo : (java.lang.CharSequence) defaultValue(fields()[0]);
        return record;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<testItemVO>
    WRITER$ = (org.apache.avro.io.DatumWriter<testItemVO>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<testItemVO>
    READER$ = (org.apache.avro.io.DatumReader<testItemVO>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}
