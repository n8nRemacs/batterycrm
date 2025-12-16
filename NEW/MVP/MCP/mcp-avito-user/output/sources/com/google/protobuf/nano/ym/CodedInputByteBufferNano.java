package com.google.protobuf.nano.ym;

import AK.c;
import androidx.camera.camera2.internal.G;
import com.adjust.sdk.Constants;

/* loaded from: classes7.dex */
public final class CodedInputByteBufferNano {
    private static final int DEFAULT_RECURSION_LIMIT = 64;
    private static final int DEFAULT_SIZE_LIMIT = 67108864;
    private final byte[] buffer;
    private int bufferPos;
    private int bufferSize;
    private int bufferSizeAfterLimit;
    private int bufferStart;
    private int lastTag;
    private int recursionDepth;
    private int currentLimit = Integer.MAX_VALUE;
    private int recursionLimit = 64;
    private int sizeLimit = DEFAULT_SIZE_LIMIT;

    private CodedInputByteBufferNano(byte[] bArr, int i12, int i13) {
        this.buffer = bArr;
        this.bufferStart = i12;
        this.bufferSize = i13 + i12;
        this.bufferPos = i12;
    }

    public static int decodeZigZag32(int i12) {
        return (-(i12 & 1)) ^ (i12 >>> 1);
    }

    public static long decodeZigZag64(long j12) {
        return (-(j12 & 1)) ^ (j12 >>> 1);
    }

    public static CodedInputByteBufferNano newInstance(byte[] bArr) {
        return newInstance(bArr, 0, bArr.length);
    }

    private void recomputeBufferSizeAfterLimit() {
        int i12 = this.bufferSize + this.bufferSizeAfterLimit;
        this.bufferSize = i12;
        int i13 = this.currentLimit;
        if (i12 <= i13) {
            this.bufferSizeAfterLimit = 0;
            return;
        }
        int i14 = i12 - i13;
        this.bufferSizeAfterLimit = i14;
        this.bufferSize = i12 - i14;
    }

    public void checkLastTagWas(int i12) throws InvalidProtocolBufferNanoException {
        if (this.lastTag != i12) {
            throw InvalidProtocolBufferNanoException.invalidEndTag();
        }
    }

    public int getBytesUntilLimit() {
        int i12 = this.currentLimit;
        if (i12 == Integer.MAX_VALUE) {
            return -1;
        }
        return i12 - this.bufferPos;
    }

    public byte[] getData(int i12, int i13) {
        if (i13 == 0) {
            return WireFormatNano.EMPTY_BYTES;
        }
        byte[] bArr = new byte[i13];
        System.arraycopy(this.buffer, this.bufferStart + i12, bArr, 0, i13);
        return bArr;
    }

    public int getPosition() {
        return this.bufferPos - this.bufferStart;
    }

    public boolean isAtEnd() {
        return this.bufferPos == this.bufferSize;
    }

    public void popLimit(int i12) {
        this.currentLimit = i12;
        recomputeBufferSizeAfterLimit();
    }

    public int pushLimit(int i12) throws InvalidProtocolBufferNanoException {
        if (i12 < 0) {
            throw InvalidProtocolBufferNanoException.negativeSize();
        }
        int i13 = i12 + this.bufferPos;
        int i14 = this.currentLimit;
        if (i13 > i14) {
            throw InvalidProtocolBufferNanoException.truncatedMessage();
        }
        this.currentLimit = i13;
        recomputeBufferSizeAfterLimit();
        return i14;
    }

    public boolean readBool() {
        return readRawVarint32() != 0;
    }

    public byte[] readBytes() throws InvalidProtocolBufferNanoException {
        int rawVarint32 = readRawVarint32();
        int i12 = this.bufferSize;
        int i13 = this.bufferPos;
        if (rawVarint32 > i12 - i13 || rawVarint32 <= 0) {
            return readRawBytes(rawVarint32);
        }
        byte[] bArr = new byte[rawVarint32];
        System.arraycopy(this.buffer, i13, bArr, 0, rawVarint32);
        this.bufferPos += rawVarint32;
        return bArr;
    }

    public double readDouble() {
        return Double.longBitsToDouble(readRawLittleEndian64());
    }

    public int readEnum() {
        return readRawVarint32();
    }

    public int readFixed32() {
        return readRawLittleEndian32();
    }

    public long readFixed64() {
        return readRawLittleEndian64();
    }

    public float readFloat() {
        return Float.intBitsToFloat(readRawLittleEndian32());
    }

    public void readGroup(MessageNano messageNano, int i12) throws InvalidProtocolBufferNanoException {
        int i13 = this.recursionDepth;
        if (i13 >= this.recursionLimit) {
            throw InvalidProtocolBufferNanoException.recursionLimitExceeded();
        }
        this.recursionDepth = i13 + 1;
        messageNano.mergeFrom(this);
        checkLastTagWas(WireFormatNano.makeTag(i12, 4));
        this.recursionDepth--;
    }

    public int readInt32() {
        return readRawVarint32();
    }

    public long readInt64() {
        return readRawVarint64();
    }

    public void readMessage(MessageNano messageNano) throws InvalidProtocolBufferNanoException {
        int rawVarint32 = readRawVarint32();
        if (this.recursionDepth >= this.recursionLimit) {
            throw InvalidProtocolBufferNanoException.recursionLimitExceeded();
        }
        int iPushLimit = pushLimit(rawVarint32);
        this.recursionDepth++;
        messageNano.mergeFrom(this);
        checkLastTagWas(0);
        this.recursionDepth--;
        popLimit(iPushLimit);
    }

    public byte readRawByte() throws InvalidProtocolBufferNanoException {
        int i12 = this.bufferPos;
        if (i12 == this.bufferSize) {
            throw InvalidProtocolBufferNanoException.truncatedMessage();
        }
        byte[] bArr = this.buffer;
        this.bufferPos = i12 + 1;
        return bArr[i12];
    }

    public byte[] readRawBytes(int i12) throws InvalidProtocolBufferNanoException {
        if (i12 < 0) {
            throw InvalidProtocolBufferNanoException.negativeSize();
        }
        int i13 = this.bufferPos;
        int i14 = i13 + i12;
        int i15 = this.currentLimit;
        if (i14 > i15) {
            skipRawBytes(i15 - i13);
            throw InvalidProtocolBufferNanoException.truncatedMessage();
        }
        if (i12 > this.bufferSize - i13) {
            throw InvalidProtocolBufferNanoException.truncatedMessage();
        }
        byte[] bArr = new byte[i12];
        System.arraycopy(this.buffer, i13, bArr, 0, i12);
        this.bufferPos += i12;
        return bArr;
    }

    public int readRawLittleEndian32() throws InvalidProtocolBufferNanoException {
        return (readRawByte() & 255) | ((readRawByte() & 255) << 8) | ((readRawByte() & 255) << 16) | ((readRawByte() & 255) << 24);
    }

    public long readRawLittleEndian64() throws InvalidProtocolBufferNanoException {
        return ((readRawByte() & 255) << 8) | (readRawByte() & 255) | ((readRawByte() & 255) << 16) | ((readRawByte() & 255) << 24) | ((readRawByte() & 255) << 32) | ((readRawByte() & 255) << 40) | ((readRawByte() & 255) << 48) | ((readRawByte() & 255) << 56);
    }

    public int readRawVarint32() throws InvalidProtocolBufferNanoException {
        int i12;
        byte rawByte = readRawByte();
        if (rawByte >= 0) {
            return rawByte;
        }
        int i13 = rawByte & 127;
        byte rawByte2 = readRawByte();
        if (rawByte2 >= 0) {
            i12 = rawByte2 << 7;
        } else {
            i13 |= (rawByte2 & 127) << 7;
            byte rawByte3 = readRawByte();
            if (rawByte3 >= 0) {
                i12 = rawByte3 << 14;
            } else {
                i13 |= (rawByte3 & 127) << 14;
                byte rawByte4 = readRawByte();
                if (rawByte4 < 0) {
                    int i14 = i13 | ((rawByte4 & 127) << 21);
                    byte rawByte5 = readRawByte();
                    int i15 = i14 | (rawByte5 << 28);
                    if (rawByte5 >= 0) {
                        return i15;
                    }
                    for (int i16 = 0; i16 < 5; i16++) {
                        if (readRawByte() >= 0) {
                            return i15;
                        }
                    }
                    throw InvalidProtocolBufferNanoException.malformedVarint();
                }
                i12 = rawByte4 << 21;
            }
        }
        return i13 | i12;
    }

    public long readRawVarint64() throws InvalidProtocolBufferNanoException {
        long j12 = 0;
        for (int i12 = 0; i12 < 64; i12 += 7) {
            j12 |= (r3 & 127) << i12;
            if ((readRawByte() & 128) == 0) {
                return j12;
            }
        }
        throw InvalidProtocolBufferNanoException.malformedVarint();
    }

    public int readSFixed32() {
        return readRawLittleEndian32();
    }

    public long readSFixed64() {
        return readRawLittleEndian64();
    }

    public int readSInt32() {
        return decodeZigZag32(readRawVarint32());
    }

    public long readSInt64() {
        return decodeZigZag64(readRawVarint64());
    }

    public String readString() throws InvalidProtocolBufferNanoException {
        int rawVarint32 = readRawVarint32();
        int i12 = this.bufferSize;
        int i13 = this.bufferPos;
        if (rawVarint32 > i12 - i13 || rawVarint32 <= 0) {
            return new String(readRawBytes(rawVarint32), Constants.ENCODING);
        }
        String str = new String(this.buffer, i13, rawVarint32, Constants.ENCODING);
        this.bufferPos += rawVarint32;
        return str;
    }

    public int readTag() throws InvalidProtocolBufferNanoException {
        if (isAtEnd()) {
            this.lastTag = 0;
            return 0;
        }
        int rawVarint32 = readRawVarint32();
        this.lastTag = rawVarint32;
        if (rawVarint32 != 0) {
            return rawVarint32;
        }
        throw InvalidProtocolBufferNanoException.invalidTag();
    }

    public int readUInt32() {
        return readRawVarint32();
    }

    public long readUInt64() {
        return readRawVarint64();
    }

    public void rewindToPosition(int i12) {
        int i13 = this.bufferPos;
        int i14 = this.bufferStart;
        if (i12 > i13 - i14) {
            StringBuilder sbJ = G.j(i12, "Position ", " is beyond current ");
            sbJ.append(this.bufferPos - this.bufferStart);
            throw new IllegalArgumentException(sbJ.toString());
        }
        if (i12 < 0) {
            throw new IllegalArgumentException(c.g(i12, "Bad position "));
        }
        this.bufferPos = i14 + i12;
    }

    public int setRecursionLimit(int i12) {
        if (i12 < 0) {
            throw new IllegalArgumentException(c.g(i12, "Recursion limit cannot be negative: "));
        }
        int i13 = this.recursionLimit;
        this.recursionLimit = i12;
        return i13;
    }

    public int setSizeLimit(int i12) {
        if (i12 < 0) {
            throw new IllegalArgumentException(c.g(i12, "Size limit cannot be negative: "));
        }
        int i13 = this.sizeLimit;
        this.sizeLimit = i12;
        return i13;
    }

    public boolean skipField(int i12) throws InvalidProtocolBufferNanoException {
        int tagWireType = WireFormatNano.getTagWireType(i12);
        if (tagWireType == 0) {
            readInt32();
            return true;
        }
        if (tagWireType == 1) {
            readRawLittleEndian64();
            return true;
        }
        if (tagWireType == 2) {
            skipRawBytes(readRawVarint32());
            return true;
        }
        if (tagWireType == 3) {
            skipMessage();
            checkLastTagWas(WireFormatNano.makeTag(WireFormatNano.getTagFieldNumber(i12), 4));
            return true;
        }
        if (tagWireType == 4) {
            return false;
        }
        if (tagWireType != 5) {
            throw InvalidProtocolBufferNanoException.invalidWireType();
        }
        readRawLittleEndian32();
        return true;
    }

    public void skipMessage() throws InvalidProtocolBufferNanoException {
        int tag;
        do {
            tag = readTag();
            if (tag == 0) {
                return;
            }
        } while (skipField(tag));
    }

    public void skipRawBytes(int i12) throws InvalidProtocolBufferNanoException {
        if (i12 < 0) {
            throw InvalidProtocolBufferNanoException.negativeSize();
        }
        int i13 = this.bufferPos;
        int i14 = i13 + i12;
        int i15 = this.currentLimit;
        if (i14 > i15) {
            skipRawBytes(i15 - i13);
            throw InvalidProtocolBufferNanoException.truncatedMessage();
        }
        if (i12 > this.bufferSize - i13) {
            throw InvalidProtocolBufferNanoException.truncatedMessage();
        }
        this.bufferPos = i14;
    }

    public static CodedInputByteBufferNano newInstance(byte[] bArr, int i12, int i13) {
        return new CodedInputByteBufferNano(bArr, i12, i13);
    }

    public void resetSizeCounter() {
    }
}
