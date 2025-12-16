package com.google.crypto.tink.shaded.protobuf;

@CheckReturnValue
/* loaded from: classes6.dex */
abstract class UnknownFieldSchema<T, B> {
    public abstract void addFixed32(B b12, int i12, int i13);

    public abstract void addFixed64(B b12, int i12, long j12);

    public abstract void addGroup(B b12, int i12, T t12);

    public abstract void addLengthDelimited(B b12, int i12, ByteString byteString);

    public abstract void addVarint(B b12, int i12, long j12);

    public abstract B getBuilderFromMessage(Object obj);

    public abstract T getFromMessage(Object obj);

    public abstract int getSerializedSize(T t12);

    public abstract int getSerializedSizeAsMessageSet(T t12);

    public abstract void makeImmutable(Object obj);

    public abstract T merge(T t12, T t13);

    public final void mergeFrom(B b12, Reader reader) {
        while (reader.getFieldNumber() != Integer.MAX_VALUE && mergeOneFieldFrom(b12, reader)) {
        }
    }

    public final boolean mergeOneFieldFrom(B b12, Reader reader) throws InvalidProtocolBufferException {
        int tag = reader.getTag();
        int tagFieldNumber = WireFormat.getTagFieldNumber(tag);
        int tagWireType = WireFormat.getTagWireType(tag);
        if (tagWireType == 0) {
            addVarint(b12, tagFieldNumber, reader.readInt64());
            return true;
        }
        if (tagWireType == 1) {
            addFixed64(b12, tagFieldNumber, reader.readFixed64());
            return true;
        }
        if (tagWireType == 2) {
            addLengthDelimited(b12, tagFieldNumber, reader.readBytes());
            return true;
        }
        if (tagWireType != 3) {
            if (tagWireType == 4) {
                return false;
            }
            if (tagWireType != 5) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            addFixed32(b12, tagFieldNumber, reader.readFixed32());
            return true;
        }
        B bNewBuilder = newBuilder();
        int iMakeTag = WireFormat.makeTag(tagFieldNumber, 4);
        mergeFrom(bNewBuilder, reader);
        if (iMakeTag != reader.getTag()) {
            throw InvalidProtocolBufferException.invalidEndTag();
        }
        addGroup(b12, tagFieldNumber, toImmutable(bNewBuilder));
        return true;
    }

    public abstract B newBuilder();

    public abstract void setBuilderToMessage(Object obj, B b12);

    public abstract void setToMessage(Object obj, T t12);

    public abstract boolean shouldDiscardUnknownFields(Reader reader);

    public abstract T toImmutable(B b12);

    public abstract void writeAsMessageSetTo(T t12, Writer writer);

    public abstract void writeTo(T t12, Writer writer);
}
