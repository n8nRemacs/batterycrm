package com.google.protobuf.nano.ym;

import androidx.appcompat.app.r;
import com.adjust.sdk.Constants;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

/* loaded from: classes7.dex */
public final class CodedOutputByteBufferNano {
    public static final int LITTLE_ENDIAN_32_SIZE = 4;
    public static final int LITTLE_ENDIAN_64_SIZE = 8;
    private final byte[] buffer;
    private final int limit;
    private int position;

    public class OutOfSpaceException extends IOException {
        private static final long serialVersionUID = -6947486886997889499L;

        public OutOfSpaceException(int i12, int i13) {
            super(r.l(i12, i13, "CodedOutputStream was writing to a flat byte array and ran out of space (pos ", " limit ", ")."));
        }
    }

    private CodedOutputByteBufferNano(byte[] bArr, int i12, int i13) {
        this.buffer = bArr;
        this.position = i12;
        this.limit = i12 + i13;
    }

    public static int computeBoolSize(int i12, boolean z12) {
        return computeBoolSizeNoTag(z12) + computeTagSize(i12);
    }

    public static int computeBoolSizeNoTag(boolean z12) {
        return 1;
    }

    public static int computeBytesSize(int i12, byte[] bArr) {
        return computeBytesSizeNoTag(bArr) + computeTagSize(i12);
    }

    public static int computeBytesSizeNoTag(byte[] bArr) {
        return computeRawVarint32Size(bArr.length) + bArr.length;
    }

    public static int computeDoubleSize(int i12, double d12) {
        return computeDoubleSizeNoTag(d12) + computeTagSize(i12);
    }

    public static int computeDoubleSizeNoTag(double d12) {
        return 8;
    }

    public static int computeEnumSize(int i12, int i13) {
        return computeEnumSizeNoTag(i13) + computeTagSize(i12);
    }

    public static int computeEnumSizeNoTag(int i12) {
        return computeRawVarint32Size(i12);
    }

    public static int computeFixed32Size(int i12, int i13) {
        return computeFixed32SizeNoTag(i13) + computeTagSize(i12);
    }

    public static int computeFixed32SizeNoTag(int i12) {
        return 4;
    }

    public static int computeFixed64Size(int i12, long j12) {
        return computeFixed64SizeNoTag(j12) + computeTagSize(i12);
    }

    public static int computeFixed64SizeNoTag(long j12) {
        return 8;
    }

    public static int computeFloatSize(int i12, float f12) {
        return computeFloatSizeNoTag(f12) + computeTagSize(i12);
    }

    public static int computeFloatSizeNoTag(float f12) {
        return 4;
    }

    public static int computeGroupSize(int i12, MessageNano messageNano) {
        return computeGroupSizeNoTag(messageNano) + (computeTagSize(i12) * 2);
    }

    public static int computeGroupSizeNoTag(MessageNano messageNano) {
        return messageNano.getSerializedSize();
    }

    public static int computeInt32Size(int i12, int i13) {
        return computeInt32SizeNoTag(i13) + computeTagSize(i12);
    }

    public static int computeInt32SizeNoTag(int i12) {
        if (i12 >= 0) {
            return computeRawVarint32Size(i12);
        }
        return 10;
    }

    public static int computeInt64Size(int i12, long j12) {
        return computeInt64SizeNoTag(j12) + computeTagSize(i12);
    }

    public static int computeInt64SizeNoTag(long j12) {
        return computeRawVarint64Size(j12);
    }

    public static int computeMessageSize(int i12, MessageNano messageNano) {
        return computeMessageSizeNoTag(messageNano) + computeTagSize(i12);
    }

    public static int computeMessageSizeNoTag(MessageNano messageNano) {
        int serializedSize = messageNano.getSerializedSize();
        return computeRawVarint32Size(serializedSize) + serializedSize;
    }

    public static int computeRawVarint32Size(int i12) {
        if ((i12 & (-128)) == 0) {
            return 1;
        }
        if ((i12 & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i12) == 0) {
            return 3;
        }
        return (i12 & (-268435456)) == 0 ? 4 : 5;
    }

    public static int computeRawVarint64Size(long j12) {
        if (((-128) & j12) == 0) {
            return 1;
        }
        if (((-16384) & j12) == 0) {
            return 2;
        }
        if (((-2097152) & j12) == 0) {
            return 3;
        }
        if (((-268435456) & j12) == 0) {
            return 4;
        }
        if (((-34359738368L) & j12) == 0) {
            return 5;
        }
        if (((-4398046511104L) & j12) == 0) {
            return 6;
        }
        if (((-562949953421312L) & j12) == 0) {
            return 7;
        }
        if (((-72057594037927936L) & j12) == 0) {
            return 8;
        }
        return (j12 & Long.MIN_VALUE) == 0 ? 9 : 10;
    }

    public static int computeSFixed32Size(int i12, int i13) {
        return computeSFixed32SizeNoTag(i13) + computeTagSize(i12);
    }

    public static int computeSFixed32SizeNoTag(int i12) {
        return 4;
    }

    public static int computeSFixed64Size(int i12, long j12) {
        return computeSFixed64SizeNoTag(j12) + computeTagSize(i12);
    }

    public static int computeSFixed64SizeNoTag(long j12) {
        return 8;
    }

    public static int computeSInt32Size(int i12, int i13) {
        return computeSInt32SizeNoTag(i13) + computeTagSize(i12);
    }

    public static int computeSInt32SizeNoTag(int i12) {
        return computeRawVarint32Size(encodeZigZag32(i12));
    }

    public static int computeSInt64Size(int i12, long j12) {
        return computeSInt64SizeNoTag(j12) + computeTagSize(i12);
    }

    public static int computeSInt64SizeNoTag(long j12) {
        return computeRawVarint64Size(encodeZigZag64(j12));
    }

    public static int computeStringSize(int i12, String str) {
        return computeStringSizeNoTag(str) + computeTagSize(i12);
    }

    public static int computeStringSizeNoTag(String str) throws UnsupportedEncodingException {
        try {
            byte[] bytes = str.getBytes(Constants.ENCODING);
            return computeRawVarint32Size(bytes.length) + bytes.length;
        } catch (UnsupportedEncodingException unused) {
            throw new RuntimeException("UTF-8 not supported.");
        }
    }

    public static int computeTagSize(int i12) {
        return computeRawVarint32Size(WireFormatNano.makeTag(i12, 0));
    }

    public static int computeUInt32Size(int i12, int i13) {
        return computeUInt32SizeNoTag(i13) + computeTagSize(i12);
    }

    public static int computeUInt32SizeNoTag(int i12) {
        return computeRawVarint32Size(i12);
    }

    public static int computeUInt64Size(int i12, long j12) {
        return computeUInt64SizeNoTag(j12) + computeTagSize(i12);
    }

    public static int computeUInt64SizeNoTag(long j12) {
        return computeRawVarint64Size(j12);
    }

    public static int encodeZigZag32(int i12) {
        return (i12 >> 31) ^ (i12 << 1);
    }

    public static long encodeZigZag64(long j12) {
        return (j12 >> 63) ^ (j12 << 1);
    }

    public static CodedOutputByteBufferNano newInstance(byte[] bArr) {
        return newInstance(bArr, 0, bArr.length);
    }

    public void checkNoSpaceLeft() {
        if (spaceLeft() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public int spaceLeft() {
        return this.limit - this.position;
    }

    public void writeBool(int i12, boolean z12) throws OutOfSpaceException {
        writeTag(i12, 0);
        writeBoolNoTag(z12);
    }

    public void writeBoolNoTag(boolean z12) throws OutOfSpaceException {
        writeRawByte(z12 ? 1 : 0);
    }

    public void writeBytes(int i12, byte[] bArr) throws OutOfSpaceException {
        writeTag(i12, 2);
        writeBytesNoTag(bArr);
    }

    public void writeBytesNoTag(byte[] bArr) throws OutOfSpaceException {
        writeRawVarint32(bArr.length);
        writeRawBytes(bArr);
    }

    public void writeDouble(int i12, double d12) throws OutOfSpaceException {
        writeTag(i12, 1);
        writeDoubleNoTag(d12);
    }

    public void writeDoubleNoTag(double d12) throws OutOfSpaceException {
        writeRawLittleEndian64(Double.doubleToLongBits(d12));
    }

    public void writeEnum(int i12, int i13) throws OutOfSpaceException {
        writeTag(i12, 0);
        writeEnumNoTag(i13);
    }

    public void writeEnumNoTag(int i12) throws OutOfSpaceException {
        writeRawVarint32(i12);
    }

    public void writeFixed32(int i12, int i13) throws OutOfSpaceException {
        writeTag(i12, 5);
        writeFixed32NoTag(i13);
    }

    public void writeFixed32NoTag(int i12) throws OutOfSpaceException {
        writeRawLittleEndian32(i12);
    }

    public void writeFixed64(int i12, long j12) throws OutOfSpaceException {
        writeTag(i12, 1);
        writeFixed64NoTag(j12);
    }

    public void writeFixed64NoTag(long j12) throws OutOfSpaceException {
        writeRawLittleEndian64(j12);
    }

    public void writeFloat(int i12, float f12) throws OutOfSpaceException {
        writeTag(i12, 5);
        writeFloatNoTag(f12);
    }

    public void writeFloatNoTag(float f12) throws OutOfSpaceException {
        writeRawLittleEndian32(Float.floatToIntBits(f12));
    }

    public void writeGroup(int i12, MessageNano messageNano) throws OutOfSpaceException {
        writeTag(i12, 3);
        writeGroupNoTag(messageNano);
        writeTag(i12, 4);
    }

    public void writeGroupNoTag(MessageNano messageNano) {
        messageNano.writeTo(this);
    }

    public void writeInt32(int i12, int i13) throws OutOfSpaceException {
        writeTag(i12, 0);
        writeInt32NoTag(i13);
    }

    public void writeInt32NoTag(int i12) throws OutOfSpaceException {
        if (i12 >= 0) {
            writeRawVarint32(i12);
        } else {
            writeRawVarint64(i12);
        }
    }

    public void writeInt64(int i12, long j12) throws OutOfSpaceException {
        writeTag(i12, 0);
        writeInt64NoTag(j12);
    }

    public void writeInt64NoTag(long j12) throws OutOfSpaceException {
        writeRawVarint64(j12);
    }

    public void writeMessage(int i12, MessageNano messageNano) throws OutOfSpaceException {
        writeTag(i12, 2);
        writeMessageNoTag(messageNano);
    }

    public void writeMessageNoTag(MessageNano messageNano) throws OutOfSpaceException {
        writeRawVarint32(messageNano.getCachedSize());
        messageNano.writeTo(this);
    }

    public void writeRawByte(byte b12) throws OutOfSpaceException {
        int i12 = this.position;
        if (i12 == this.limit) {
            throw new OutOfSpaceException(this.position, this.limit);
        }
        byte[] bArr = this.buffer;
        this.position = i12 + 1;
        bArr[i12] = b12;
    }

    public void writeRawBytes(byte[] bArr) throws OutOfSpaceException {
        writeRawBytes(bArr, 0, bArr.length);
    }

    public void writeRawLittleEndian32(int i12) throws OutOfSpaceException {
        writeRawByte(i12 & 255);
        writeRawByte((i12 >> 8) & 255);
        writeRawByte((i12 >> 16) & 255);
        writeRawByte((i12 >> 24) & 255);
    }

    public void writeRawLittleEndian64(long j12) throws OutOfSpaceException {
        writeRawByte(((int) j12) & 255);
        writeRawByte(((int) (j12 >> 8)) & 255);
        writeRawByte(((int) (j12 >> 16)) & 255);
        writeRawByte(((int) (j12 >> 24)) & 255);
        writeRawByte(((int) (j12 >> 32)) & 255);
        writeRawByte(((int) (j12 >> 40)) & 255);
        writeRawByte(((int) (j12 >> 48)) & 255);
        writeRawByte(((int) (j12 >> 56)) & 255);
    }

    public void writeRawVarint32(int i12) throws OutOfSpaceException {
        while ((i12 & (-128)) != 0) {
            writeRawByte((i12 & 127) | 128);
            i12 >>>= 7;
        }
        writeRawByte(i12);
    }

    public void writeRawVarint64(long j12) throws OutOfSpaceException {
        while (((-128) & j12) != 0) {
            writeRawByte((((int) j12) & 127) | 128);
            j12 >>>= 7;
        }
        writeRawByte((int) j12);
    }

    public void writeSFixed32(int i12, int i13) throws OutOfSpaceException {
        writeTag(i12, 5);
        writeSFixed32NoTag(i13);
    }

    public void writeSFixed32NoTag(int i12) throws OutOfSpaceException {
        writeRawLittleEndian32(i12);
    }

    public void writeSFixed64(int i12, long j12) throws OutOfSpaceException {
        writeTag(i12, 1);
        writeSFixed64NoTag(j12);
    }

    public void writeSFixed64NoTag(long j12) throws OutOfSpaceException {
        writeRawLittleEndian64(j12);
    }

    public void writeSInt32(int i12, int i13) throws OutOfSpaceException {
        writeTag(i12, 0);
        writeSInt32NoTag(i13);
    }

    public void writeSInt32NoTag(int i12) throws OutOfSpaceException {
        writeRawVarint32(encodeZigZag32(i12));
    }

    public void writeSInt64(int i12, long j12) throws OutOfSpaceException {
        writeTag(i12, 0);
        writeSInt64NoTag(j12);
    }

    public void writeSInt64NoTag(long j12) throws OutOfSpaceException {
        writeRawVarint64(encodeZigZag64(j12));
    }

    public void writeString(int i12, String str) throws OutOfSpaceException, UnsupportedEncodingException {
        writeTag(i12, 2);
        writeStringNoTag(str);
    }

    public void writeStringNoTag(String str) throws OutOfSpaceException, UnsupportedEncodingException {
        byte[] bytes = str.getBytes(Constants.ENCODING);
        writeRawVarint32(bytes.length);
        writeRawBytes(bytes);
    }

    public void writeTag(int i12, int i13) throws OutOfSpaceException {
        writeRawVarint32(WireFormatNano.makeTag(i12, i13));
    }

    public void writeUInt32(int i12, int i13) throws OutOfSpaceException {
        writeTag(i12, 0);
        writeUInt32NoTag(i13);
    }

    public void writeUInt32NoTag(int i12) throws OutOfSpaceException {
        writeRawVarint32(i12);
    }

    public void writeUInt64(int i12, long j12) throws OutOfSpaceException {
        writeTag(i12, 0);
        writeUInt64NoTag(j12);
    }

    public void writeUInt64NoTag(long j12) throws OutOfSpaceException {
        writeRawVarint64(j12);
    }

    public static CodedOutputByteBufferNano newInstance(byte[] bArr, int i12, int i13) {
        return new CodedOutputByteBufferNano(bArr, i12, i13);
    }

    public void writeRawByte(int i12) throws OutOfSpaceException {
        writeRawByte((byte) i12);
    }

    public void writeRawBytes(byte[] bArr, int i12, int i13) throws OutOfSpaceException {
        int i14 = this.limit;
        int i15 = this.position;
        if (i14 - i15 < i13) {
            throw new OutOfSpaceException(this.position, this.limit);
        }
        System.arraycopy(bArr, i12, this.buffer, i15, i13);
        this.position += i13;
    }
}
