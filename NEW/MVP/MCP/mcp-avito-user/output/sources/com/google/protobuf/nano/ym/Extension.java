package com.google.protobuf.nano.ym;

import androidx.compose.ui.graphics.colorspace.e;
import androidx.media3.exoplayer.analytics.m;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes7.dex */
public class Extension {
    public static final int TYPE_BOOL = 8;
    public static final int TYPE_BYTES = 12;
    public static final int TYPE_DOUBLE = 1;
    public static final int TYPE_ENUM = 14;
    public static final int TYPE_FIXED32 = 7;
    public static final int TYPE_FIXED64 = 6;
    public static final int TYPE_FLOAT = 2;
    public static final int TYPE_GROUP = 10;
    public static final int TYPE_INT32 = 5;
    public static final int TYPE_INT64 = 3;
    public static final int TYPE_MESSAGE = 11;
    public static final int TYPE_SFIXED32 = 15;
    public static final int TYPE_SFIXED64 = 16;
    public static final int TYPE_SINT32 = 17;
    public static final int TYPE_SINT64 = 18;
    public static final int TYPE_STRING = 9;
    public static final int TYPE_UINT32 = 13;
    public static final int TYPE_UINT64 = 4;
    protected final Class clazz;
    protected final boolean repeated;
    protected final int tag;
    protected final int type;

    class PrimitiveExtension extends Extension {
        private final int nonPackedTag;
        private final int packedTag;

        public PrimitiveExtension(int i12, Class cls, int i13, boolean z12, int i14, int i15) {
            super(i12, cls, i13, z12);
            this.nonPackedTag = i14;
            this.packedTag = i15;
        }

        private int computePackedDataSize(Object obj) {
            int iComputeInt64SizeNoTag;
            int length = Array.getLength(obj);
            int i12 = 0;
            switch (this.type) {
                case 1:
                case 6:
                case 16:
                    return length * 8;
                case 2:
                case 7:
                case 15:
                    return length * 4;
                case 3:
                    iComputeInt64SizeNoTag = 0;
                    while (i12 < length) {
                        iComputeInt64SizeNoTag += CodedOutputByteBufferNano.computeInt64SizeNoTag(Array.getLong(obj, i12));
                        i12++;
                    }
                    break;
                case 4:
                    iComputeInt64SizeNoTag = 0;
                    while (i12 < length) {
                        iComputeInt64SizeNoTag += CodedOutputByteBufferNano.computeUInt64SizeNoTag(Array.getLong(obj, i12));
                        i12++;
                    }
                    break;
                case 5:
                    iComputeInt64SizeNoTag = 0;
                    while (i12 < length) {
                        iComputeInt64SizeNoTag += CodedOutputByteBufferNano.computeInt32SizeNoTag(Array.getInt(obj, i12));
                        i12++;
                    }
                    break;
                case 8:
                    return length;
                case 9:
                case 10:
                case 11:
                case 12:
                default:
                    throw new IllegalArgumentException("Unexpected non-packable type " + this.type);
                case 13:
                    iComputeInt64SizeNoTag = 0;
                    while (i12 < length) {
                        iComputeInt64SizeNoTag += CodedOutputByteBufferNano.computeUInt32SizeNoTag(Array.getInt(obj, i12));
                        i12++;
                    }
                    break;
                case 14:
                    iComputeInt64SizeNoTag = 0;
                    while (i12 < length) {
                        iComputeInt64SizeNoTag += CodedOutputByteBufferNano.computeEnumSizeNoTag(Array.getInt(obj, i12));
                        i12++;
                    }
                    break;
                case 17:
                    iComputeInt64SizeNoTag = 0;
                    while (i12 < length) {
                        iComputeInt64SizeNoTag += CodedOutputByteBufferNano.computeSInt32SizeNoTag(Array.getInt(obj, i12));
                        i12++;
                    }
                    break;
                case 18:
                    iComputeInt64SizeNoTag = 0;
                    while (i12 < length) {
                        iComputeInt64SizeNoTag += CodedOutputByteBufferNano.computeSInt64SizeNoTag(Array.getLong(obj, i12));
                        i12++;
                    }
                    break;
            }
            return iComputeInt64SizeNoTag;
        }

        @Override // com.google.protobuf.nano.ym.Extension
        public int computeRepeatedSerializedSize(Object obj) {
            int i12 = this.tag;
            if (i12 == this.nonPackedTag) {
                return super.computeRepeatedSerializedSize(obj);
            }
            if (i12 == this.packedTag) {
                int iComputePackedDataSize = computePackedDataSize(obj);
                return CodedOutputByteBufferNano.computeRawVarint32Size(this.tag) + CodedOutputByteBufferNano.computeRawVarint32Size(iComputePackedDataSize) + iComputePackedDataSize;
            }
            throw new IllegalArgumentException("Unexpected repeated extension tag " + this.tag + ", unequal to both non-packed variant " + this.nonPackedTag + " and packed variant " + this.packedTag);
        }

        @Override // com.google.protobuf.nano.ym.Extension
        public final int computeSingularSerializedSize(Object obj) {
            int tagFieldNumber = WireFormatNano.getTagFieldNumber(this.tag);
            switch (this.type) {
                case 1:
                    return CodedOutputByteBufferNano.computeDoubleSize(tagFieldNumber, ((Double) obj).doubleValue());
                case 2:
                    return CodedOutputByteBufferNano.computeFloatSize(tagFieldNumber, ((Float) obj).floatValue());
                case 3:
                    return CodedOutputByteBufferNano.computeInt64Size(tagFieldNumber, ((Long) obj).longValue());
                case 4:
                    return CodedOutputByteBufferNano.computeUInt64Size(tagFieldNumber, ((Long) obj).longValue());
                case 5:
                    return CodedOutputByteBufferNano.computeInt32Size(tagFieldNumber, ((Integer) obj).intValue());
                case 6:
                    return CodedOutputByteBufferNano.computeFixed64Size(tagFieldNumber, ((Long) obj).longValue());
                case 7:
                    return CodedOutputByteBufferNano.computeFixed32Size(tagFieldNumber, ((Integer) obj).intValue());
                case 8:
                    return CodedOutputByteBufferNano.computeBoolSize(tagFieldNumber, ((Boolean) obj).booleanValue());
                case 9:
                    return CodedOutputByteBufferNano.computeStringSize(tagFieldNumber, (String) obj);
                case 10:
                case 11:
                default:
                    throw new IllegalArgumentException("Unknown type " + this.type);
                case 12:
                    return CodedOutputByteBufferNano.computeBytesSize(tagFieldNumber, (byte[]) obj);
                case 13:
                    return CodedOutputByteBufferNano.computeUInt32Size(tagFieldNumber, ((Integer) obj).intValue());
                case 14:
                    return CodedOutputByteBufferNano.computeEnumSize(tagFieldNumber, ((Integer) obj).intValue());
                case 15:
                    return CodedOutputByteBufferNano.computeSFixed32Size(tagFieldNumber, ((Integer) obj).intValue());
                case 16:
                    return CodedOutputByteBufferNano.computeSFixed64Size(tagFieldNumber, ((Long) obj).longValue());
                case 17:
                    return CodedOutputByteBufferNano.computeSInt32Size(tagFieldNumber, ((Integer) obj).intValue());
                case 18:
                    return CodedOutputByteBufferNano.computeSInt64Size(tagFieldNumber, ((Long) obj).longValue());
            }
        }

        @Override // com.google.protobuf.nano.ym.Extension
        public Object readData(CodedInputByteBufferNano codedInputByteBufferNano) {
            try {
                switch (this.type) {
                    case 1:
                        return Double.valueOf(codedInputByteBufferNano.readDouble());
                    case 2:
                        return Float.valueOf(codedInputByteBufferNano.readFloat());
                    case 3:
                        return Long.valueOf(codedInputByteBufferNano.readInt64());
                    case 4:
                        return Long.valueOf(codedInputByteBufferNano.readUInt64());
                    case 5:
                        return Integer.valueOf(codedInputByteBufferNano.readInt32());
                    case 6:
                        return Long.valueOf(codedInputByteBufferNano.readFixed64());
                    case 7:
                        return Integer.valueOf(codedInputByteBufferNano.readFixed32());
                    case 8:
                        return Boolean.valueOf(codedInputByteBufferNano.readBool());
                    case 9:
                        return codedInputByteBufferNano.readString();
                    case 10:
                    case 11:
                    default:
                        throw new IllegalArgumentException("Unknown type " + this.type);
                    case 12:
                        return codedInputByteBufferNano.readBytes();
                    case 13:
                        return Integer.valueOf(codedInputByteBufferNano.readUInt32());
                    case 14:
                        return Integer.valueOf(codedInputByteBufferNano.readEnum());
                    case 15:
                        return Integer.valueOf(codedInputByteBufferNano.readSFixed32());
                    case 16:
                        return Long.valueOf(codedInputByteBufferNano.readSFixed64());
                    case 17:
                        return Integer.valueOf(codedInputByteBufferNano.readSInt32());
                    case 18:
                        return Long.valueOf(codedInputByteBufferNano.readSInt64());
                }
            } catch (IOException e12) {
                throw new IllegalArgumentException("Error reading extension field", e12);
            }
        }

        @Override // com.google.protobuf.nano.ym.Extension
        public void readDataInto(UnknownFieldData unknownFieldData, List list) {
            int i12 = unknownFieldData.tag;
            int i13 = this.nonPackedTag;
            byte[] bArr = unknownFieldData.bytes;
            if (i12 == i13) {
                list.add(readData(CodedInputByteBufferNano.newInstance(bArr)));
                return;
            }
            CodedInputByteBufferNano codedInputByteBufferNanoNewInstance = CodedInputByteBufferNano.newInstance(bArr);
            try {
                codedInputByteBufferNanoNewInstance.pushLimit(codedInputByteBufferNanoNewInstance.readRawVarint32());
                while (!codedInputByteBufferNanoNewInstance.isAtEnd()) {
                    list.add(readData(codedInputByteBufferNanoNewInstance));
                }
            } catch (IOException e12) {
                throw new IllegalArgumentException("Error reading extension field", e12);
            }
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        @Override // com.google.protobuf.nano.ym.Extension
        public void writeRepeatedData(Object obj, CodedOutputByteBufferNano codedOutputByteBufferNano) throws ArrayIndexOutOfBoundsException, IllegalArgumentException {
            int i12 = this.tag;
            if (i12 == this.nonPackedTag) {
                super.writeRepeatedData(obj, codedOutputByteBufferNano);
                return;
            }
            if (i12 != this.packedTag) {
                throw new IllegalArgumentException("Unexpected repeated extension tag " + this.tag + ", unequal to both non-packed variant " + this.nonPackedTag + " and packed variant " + this.packedTag);
            }
            int length = Array.getLength(obj);
            int iComputePackedDataSize = computePackedDataSize(obj);
            try {
                codedOutputByteBufferNano.writeRawVarint32(this.tag);
                codedOutputByteBufferNano.writeRawVarint32(iComputePackedDataSize);
                int i13 = 0;
                switch (this.type) {
                    case 1:
                        while (i13 < length) {
                            codedOutputByteBufferNano.writeDoubleNoTag(Array.getDouble(obj, i13));
                            i13++;
                        }
                        return;
                    case 2:
                        while (i13 < length) {
                            codedOutputByteBufferNano.writeFloatNoTag(Array.getFloat(obj, i13));
                            i13++;
                        }
                        return;
                    case 3:
                        while (i13 < length) {
                            codedOutputByteBufferNano.writeInt64NoTag(Array.getLong(obj, i13));
                            i13++;
                        }
                        return;
                    case 4:
                        while (i13 < length) {
                            codedOutputByteBufferNano.writeUInt64NoTag(Array.getLong(obj, i13));
                            i13++;
                        }
                        return;
                    case 5:
                        while (i13 < length) {
                            codedOutputByteBufferNano.writeInt32NoTag(Array.getInt(obj, i13));
                            i13++;
                        }
                        return;
                    case 6:
                        while (i13 < length) {
                            codedOutputByteBufferNano.writeFixed64NoTag(Array.getLong(obj, i13));
                            i13++;
                        }
                        return;
                    case 7:
                        while (i13 < length) {
                            codedOutputByteBufferNano.writeFixed32NoTag(Array.getInt(obj, i13));
                            i13++;
                        }
                        return;
                    case 8:
                        while (i13 < length) {
                            codedOutputByteBufferNano.writeBoolNoTag(Array.getBoolean(obj, i13));
                            i13++;
                        }
                        return;
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    default:
                        throw new IllegalArgumentException("Unpackable type " + this.type);
                    case 13:
                        while (i13 < length) {
                            codedOutputByteBufferNano.writeUInt32NoTag(Array.getInt(obj, i13));
                            i13++;
                        }
                        return;
                    case 14:
                        while (i13 < length) {
                            codedOutputByteBufferNano.writeEnumNoTag(Array.getInt(obj, i13));
                            i13++;
                        }
                        return;
                    case 15:
                        while (i13 < length) {
                            codedOutputByteBufferNano.writeSFixed32NoTag(Array.getInt(obj, i13));
                            i13++;
                        }
                        return;
                    case 16:
                        while (i13 < length) {
                            codedOutputByteBufferNano.writeSFixed64NoTag(Array.getLong(obj, i13));
                            i13++;
                        }
                        return;
                    case 17:
                        while (i13 < length) {
                            codedOutputByteBufferNano.writeSInt32NoTag(Array.getInt(obj, i13));
                            i13++;
                        }
                        return;
                    case 18:
                        while (i13 < length) {
                            codedOutputByteBufferNano.writeSInt64NoTag(Array.getLong(obj, i13));
                            i13++;
                        }
                        return;
                }
            } catch (IOException e12) {
                throw new IllegalStateException(e12);
            }
        }

        @Override // com.google.protobuf.nano.ym.Extension
        public final void writeSingularData(Object obj, CodedOutputByteBufferNano codedOutputByteBufferNano) {
            try {
                codedOutputByteBufferNano.writeRawVarint32(this.tag);
                switch (this.type) {
                    case 1:
                        codedOutputByteBufferNano.writeDoubleNoTag(((Double) obj).doubleValue());
                        return;
                    case 2:
                        codedOutputByteBufferNano.writeFloatNoTag(((Float) obj).floatValue());
                        return;
                    case 3:
                        codedOutputByteBufferNano.writeInt64NoTag(((Long) obj).longValue());
                        return;
                    case 4:
                        codedOutputByteBufferNano.writeUInt64NoTag(((Long) obj).longValue());
                        return;
                    case 5:
                        codedOutputByteBufferNano.writeInt32NoTag(((Integer) obj).intValue());
                        return;
                    case 6:
                        codedOutputByteBufferNano.writeFixed64NoTag(((Long) obj).longValue());
                        return;
                    case 7:
                        codedOutputByteBufferNano.writeFixed32NoTag(((Integer) obj).intValue());
                        return;
                    case 8:
                        codedOutputByteBufferNano.writeBoolNoTag(((Boolean) obj).booleanValue());
                        return;
                    case 9:
                        codedOutputByteBufferNano.writeStringNoTag((String) obj);
                        return;
                    case 10:
                    case 11:
                    default:
                        throw new IllegalArgumentException("Unknown type " + this.type);
                    case 12:
                        codedOutputByteBufferNano.writeBytesNoTag((byte[]) obj);
                        return;
                    case 13:
                        codedOutputByteBufferNano.writeUInt32NoTag(((Integer) obj).intValue());
                        return;
                    case 14:
                        codedOutputByteBufferNano.writeEnumNoTag(((Integer) obj).intValue());
                        return;
                    case 15:
                        codedOutputByteBufferNano.writeSFixed32NoTag(((Integer) obj).intValue());
                        return;
                    case 16:
                        codedOutputByteBufferNano.writeSFixed64NoTag(((Long) obj).longValue());
                        return;
                    case 17:
                        codedOutputByteBufferNano.writeSInt32NoTag(((Integer) obj).intValue());
                        return;
                    case 18:
                        codedOutputByteBufferNano.writeSInt64NoTag(((Long) obj).longValue());
                        return;
                }
            } catch (IOException e12) {
                throw new IllegalStateException(e12);
            }
        }
    }

    private Extension(int i12, Class cls, int i13, boolean z12) {
        this.type = i12;
        this.clazz = cls;
        this.tag = i13;
        this.repeated = z12;
    }

    public static Extension createMessageTyped(int i12, Class cls, int i13) {
        return new Extension(i12, cls, i13, false);
    }

    public static Extension createPrimitiveTyped(int i12, Class cls, int i13) {
        return new PrimitiveExtension(i12, cls, i13, false, 0, 0);
    }

    public static Extension createRepeatedMessageTyped(int i12, Class cls, int i13) {
        return new Extension(i12, cls, i13, true);
    }

    public static Extension createRepeatedPrimitiveTyped(int i12, Class cls, int i13, int i14, int i15) {
        return new PrimitiveExtension(i12, cls, i13, true, i14, i15);
    }

    private Object getRepeatedValueFrom(List list) throws ArrayIndexOutOfBoundsException, IllegalArgumentException {
        ArrayList arrayList = new ArrayList();
        for (int i12 = 0; i12 < list.size(); i12++) {
            UnknownFieldData unknownFieldData = (UnknownFieldData) list.get(i12);
            if (unknownFieldData.bytes.length != 0) {
                readDataInto(unknownFieldData, arrayList);
            }
        }
        int size = arrayList.size();
        if (size == 0) {
            return null;
        }
        Class cls = this.clazz;
        Object objCast = cls.cast(Array.newInstance(cls.getComponentType(), size));
        for (int i13 = 0; i13 < size; i13++) {
            Array.set(objCast, i13, arrayList.get(i13));
        }
        return objCast;
    }

    private Object getSingularValueFrom(List list) {
        if (list.isEmpty()) {
            return null;
        }
        return this.clazz.cast(readData(CodedInputByteBufferNano.newInstance(((UnknownFieldData) m.h(1, list)).bytes)));
    }

    public int computeRepeatedSerializedSize(Object obj) {
        int length = Array.getLength(obj);
        int iComputeSingularSerializedSize = 0;
        for (int i12 = 0; i12 < length; i12++) {
            if (Array.get(obj, i12) != null) {
                iComputeSingularSerializedSize = computeSingularSerializedSize(Array.get(obj, i12)) + iComputeSingularSerializedSize;
            }
        }
        return iComputeSingularSerializedSize;
    }

    public int computeSerializedSize(Object obj) {
        return this.repeated ? computeRepeatedSerializedSize(obj) : computeSingularSerializedSize(obj);
    }

    public int computeSingularSerializedSize(Object obj) {
        int tagFieldNumber = WireFormatNano.getTagFieldNumber(this.tag);
        int i12 = this.type;
        if (i12 == 10) {
            return CodedOutputByteBufferNano.computeGroupSize(tagFieldNumber, (MessageNano) obj);
        }
        if (i12 == 11) {
            return CodedOutputByteBufferNano.computeMessageSize(tagFieldNumber, (MessageNano) obj);
        }
        throw new IllegalArgumentException("Unknown type " + this.type);
    }

    public final Object getValueFrom(List list) {
        if (list == null) {
            return null;
        }
        return this.repeated ? getRepeatedValueFrom(list) : getSingularValueFrom(list);
    }

    public Object readData(CodedInputByteBufferNano codedInputByteBufferNano) {
        Class<?> componentType = this.repeated ? this.clazz.getComponentType() : this.clazz;
        try {
            int i12 = this.type;
            if (i12 == 10) {
                MessageNano messageNano = (MessageNano) componentType.newInstance();
                codedInputByteBufferNano.readGroup(messageNano, WireFormatNano.getTagFieldNumber(this.tag));
                return messageNano;
            }
            if (i12 == 11) {
                MessageNano messageNano2 = (MessageNano) componentType.newInstance();
                codedInputByteBufferNano.readMessage(messageNano2);
                return messageNano2;
            }
            throw new IllegalArgumentException("Unknown type " + this.type);
        } catch (IOException e12) {
            throw new IllegalArgumentException("Error reading extension field", e12);
        } catch (IllegalAccessException e13) {
            throw new IllegalArgumentException(e.k(componentType, "Error creating instance of class "), e13);
        } catch (InstantiationException e14) {
            throw new IllegalArgumentException(e.k(componentType, "Error creating instance of class "), e14);
        }
    }

    public void readDataInto(UnknownFieldData unknownFieldData, List list) {
        list.add(readData(CodedInputByteBufferNano.newInstance(unknownFieldData.bytes)));
    }

    public void writeRepeatedData(Object obj, CodedOutputByteBufferNano codedOutputByteBufferNano) throws ArrayIndexOutOfBoundsException, IllegalArgumentException {
        int length = Array.getLength(obj);
        for (int i12 = 0; i12 < length; i12++) {
            Object obj2 = Array.get(obj, i12);
            if (obj2 != null) {
                writeSingularData(obj2, codedOutputByteBufferNano);
            }
        }
    }

    public void writeSingularData(Object obj, CodedOutputByteBufferNano codedOutputByteBufferNano) {
        try {
            codedOutputByteBufferNano.writeRawVarint32(this.tag);
            int i12 = this.type;
            if (i12 == 10) {
                int tagFieldNumber = WireFormatNano.getTagFieldNumber(this.tag);
                codedOutputByteBufferNano.writeGroupNoTag((MessageNano) obj);
                codedOutputByteBufferNano.writeTag(tagFieldNumber, 4);
            } else if (i12 == 11) {
                codedOutputByteBufferNano.writeMessageNoTag((MessageNano) obj);
            } else {
                throw new IllegalArgumentException("Unknown type " + this.type);
            }
        } catch (IOException e12) {
            throw new IllegalStateException(e12);
        }
    }

    public void writeTo(Object obj, CodedOutputByteBufferNano codedOutputByteBufferNano) throws ArrayIndexOutOfBoundsException, IllegalArgumentException {
        if (this.repeated) {
            writeRepeatedData(obj, codedOutputByteBufferNano);
        } else {
            writeSingularData(obj, codedOutputByteBufferNano);
        }
    }
}
