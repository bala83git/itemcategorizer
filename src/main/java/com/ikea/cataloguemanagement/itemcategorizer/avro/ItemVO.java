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
public class ItemVO extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -4485200767882026714L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"ItemVO\",\"namespace\":\"com.ikea.cataloguemanagement.itemcategorizer.avro\",\"fields\":[{\"name\":\"itemNo\",\"type\":\"string\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<ItemVO> ENCODER =
      new BinaryMessageEncoder<ItemVO>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<ItemVO> DECODER =
      new BinaryMessageDecoder<ItemVO>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   */
  public static BinaryMessageDecoder<ItemVO> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   */
  public static BinaryMessageDecoder<ItemVO> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<ItemVO>(MODEL$, SCHEMA$, resolver);
  }

  /** Serializes this ItemVO to a ByteBuffer. */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /** Deserializes a ItemVO from a ByteBuffer. */
  public static ItemVO fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  @Deprecated public java.lang.CharSequence itemNo;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public ItemVO() {}

  /**
   * All-args constructor.
   * @param itemNo The new value for itemNo
   */
  public ItemVO(java.lang.CharSequence itemNo) {
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
   * Creates a new ItemVO RecordBuilder.
   * @return A new ItemVO RecordBuilder
   */
  public static com.ikea.cataloguemanagement.itemcategorizer.avro.ItemVO.Builder newBuilder() {
    return new com.ikea.cataloguemanagement.itemcategorizer.avro.ItemVO.Builder();
  }

  /**
   * Creates a new ItemVO RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new ItemVO RecordBuilder
   */
  public static com.ikea.cataloguemanagement.itemcategorizer.avro.ItemVO.Builder newBuilder(com.ikea.cataloguemanagement.itemcategorizer.avro.ItemVO.Builder other) {
    return new com.ikea.cataloguemanagement.itemcategorizer.avro.ItemVO.Builder(other);
  }

  /**
   * Creates a new ItemVO RecordBuilder by copying an existing ItemVO instance.
   * @param other The existing instance to copy.
   * @return A new ItemVO RecordBuilder
   */
  public static com.ikea.cataloguemanagement.itemcategorizer.avro.ItemVO.Builder newBuilder(com.ikea.cataloguemanagement.itemcategorizer.avro.ItemVO other) {
    return new com.ikea.cataloguemanagement.itemcategorizer.avro.ItemVO.Builder(other);
  }

  /**
   * RecordBuilder for ItemVO instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<ItemVO>
    implements org.apache.avro.data.RecordBuilder<ItemVO> {

    private java.lang.CharSequence itemNo;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.ikea.cataloguemanagement.itemcategorizer.avro.ItemVO.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.itemNo)) {
        this.itemNo = data().deepCopy(fields()[0].schema(), other.itemNo);
        fieldSetFlags()[0] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing ItemVO instance
     * @param other The existing instance to copy.
     */
    private Builder(com.ikea.cataloguemanagement.itemcategorizer.avro.ItemVO other) {
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
    public com.ikea.cataloguemanagement.itemcategorizer.avro.ItemVO.Builder setItemNo(java.lang.CharSequence value) {
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
    public com.ikea.cataloguemanagement.itemcategorizer.avro.ItemVO.Builder clearItemNo() {
      itemNo = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public ItemVO build() {
      try {
        ItemVO record = new ItemVO();
        record.itemNo = fieldSetFlags()[0] ? this.itemNo : (java.lang.CharSequence) defaultValue(fields()[0]);
        return record;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<ItemVO>
    WRITER$ = (org.apache.avro.io.DatumWriter<ItemVO>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<ItemVO>
    READER$ = (org.apache.avro.io.DatumReader<ItemVO>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}