package com.google.crypto.tink.shaded.protobuf;

import AK.c;
import androidx.camera.camera2.internal.G;
import com.google.crypto.tink.shaded.protobuf.MessageLite;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes6.dex */
public abstract class CodedInputStream {
    private static final int DEFAULT_BUFFER_SIZE = 4096;
    private static final int DEFAULT_SIZE_LIMIT = Integer.MAX_VALUE;
    private static volatile int defaultRecursionLimit = 100;
    int recursionDepth;
    int recursionLimit;
    private boolean shouldDiscardUnknownFields;
    int sizeLimit;
    CodedInputStreamReader wrapper;

    public static final class ArrayDecoder extends CodedInputStream {
        private final byte[] buffer;
        private int bufferSizeAfterLimit;
        private int currentLimit;
        private boolean enableAliasing;
        private final boolean immutable;
        private int lastTag;
        private int limit;
        private int pos;
        private int startPos;

        private void recomputeBufferSizeAfterLimit() {
            int i12 = this.limit + this.bufferSizeAfterLimit;
            this.limit = i12;
            int i13 = i12 - this.startPos;
            int i14 = this.currentLimit;
            if (i13 <= i14) {
                this.bufferSizeAfterLimit = 0;
                return;
            }
            int i15 = i13 - i14;
            this.bufferSizeAfterLimit = i15;
            this.limit = i12 - i15;
        }

        private void skipRawVarint() throws InvalidProtocolBufferException {
            if (this.limit - this.pos >= 10) {
                skipRawVarintFastPath();
            } else {
                skipRawVarintSlowPath();
            }
        }

        private void skipRawVarintFastPath() throws InvalidProtocolBufferException {
            for (int i12 = 0; i12 < 10; i12++) {
                byte[] bArr = this.buffer;
                int i13 = this.pos;
                this.pos = i13 + 1;
                if (bArr[i13] >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        private void skipRawVarintSlowPath() throws InvalidProtocolBufferException {
            for (int i12 = 0; i12 < 10; i12++) {
                if (readRawByte() >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public void checkLastTagWas(int i12) throws InvalidProtocolBufferException {
            if (this.lastTag != i12) {
                throw InvalidProtocolBufferException.invalidEndTag();
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public void enableAliasing(boolean z12) {
            this.enableAliasing = z12;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public int getBytesUntilLimit() {
            int i12 = this.currentLimit;
            if (i12 == Integer.MAX_VALUE) {
                return -1;
            }
            return i12 - getTotalBytesRead();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public int getLastTag() {
            return this.lastTag;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public int getTotalBytesRead() {
            return this.pos - this.startPos;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public boolean isAtEnd() {
            return this.pos == this.limit;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public void popLimit(int i12) {
            this.currentLimit = i12;
            recomputeBufferSizeAfterLimit();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public int pushLimit(int i12) throws InvalidProtocolBufferException {
            if (i12 < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            int totalBytesRead = i12 + getTotalBytesRead();
            if (totalBytesRead < 0) {
                throw InvalidProtocolBufferException.parseFailure();
            }
            int i13 = this.currentLimit;
            if (totalBytesRead > i13) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            this.currentLimit = totalBytesRead;
            recomputeBufferSizeAfterLimit();
            return i13;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public boolean readBool() {
            return readRawVarint64() != 0;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public byte[] readByteArray() {
            return readRawBytes(readRawVarint32());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public ByteBuffer readByteBuffer() throws InvalidProtocolBufferException {
            int rawVarint32 = readRawVarint32();
            if (rawVarint32 > 0) {
                int i12 = this.limit;
                int i13 = this.pos;
                if (rawVarint32 <= i12 - i13) {
                    ByteBuffer byteBufferWrap = (this.immutable || !this.enableAliasing) ? ByteBuffer.wrap(Arrays.copyOfRange(this.buffer, i13, i13 + rawVarint32)) : ByteBuffer.wrap(this.buffer, i13, rawVarint32).slice();
                    this.pos += rawVarint32;
                    return byteBufferWrap;
                }
            }
            if (rawVarint32 == 0) {
                return Internal.EMPTY_BYTE_BUFFER;
            }
            if (rawVarint32 < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public ByteString readBytes() {
            int rawVarint32 = readRawVarint32();
            if (rawVarint32 > 0) {
                int i12 = this.limit;
                int i13 = this.pos;
                if (rawVarint32 <= i12 - i13) {
                    ByteString byteStringWrap = (this.immutable && this.enableAliasing) ? ByteString.wrap(this.buffer, i13, rawVarint32) : ByteString.copyFrom(this.buffer, i13, rawVarint32);
                    this.pos += rawVarint32;
                    return byteStringWrap;
                }
            }
            return rawVarint32 == 0 ? ByteString.EMPTY : ByteString.wrap(readRawBytes(rawVarint32));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public double readDouble() {
            return Double.longBitsToDouble(readRawLittleEndian64());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public int readEnum() {
            return readRawVarint32();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public int readFixed32() {
            return readRawLittleEndian32();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public long readFixed64() {
            return readRawLittleEndian64();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public float readFloat() {
            return Float.intBitsToFloat(readRawLittleEndian32());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public void readGroup(int i12, MessageLite.Builder builder, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            checkRecursionLimit();
            this.recursionDepth++;
            builder.mergeFrom(this, extensionRegistryLite);
            checkLastTagWas(WireFormat.makeTag(i12, 4));
            this.recursionDepth--;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public int readInt32() {
            return readRawVarint32();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public long readInt64() {
            return readRawVarint64();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public void readMessage(MessageLite.Builder builder, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            int rawVarint32 = readRawVarint32();
            checkRecursionLimit();
            int iPushLimit = pushLimit(rawVarint32);
            this.recursionDepth++;
            builder.mergeFrom(this, extensionRegistryLite);
            checkLastTagWas(0);
            this.recursionDepth--;
            if (getBytesUntilLimit() != 0) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            popLimit(iPushLimit);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public byte readRawByte() throws InvalidProtocolBufferException {
            int i12 = this.pos;
            if (i12 == this.limit) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            byte[] bArr = this.buffer;
            this.pos = i12 + 1;
            return bArr[i12];
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public byte[] readRawBytes(int i12) throws InvalidProtocolBufferException {
            if (i12 > 0) {
                int i13 = this.limit;
                int i14 = this.pos;
                if (i12 <= i13 - i14) {
                    int i15 = i12 + i14;
                    this.pos = i15;
                    return Arrays.copyOfRange(this.buffer, i14, i15);
                }
            }
            if (i12 > 0) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            if (i12 == 0) {
                return Internal.EMPTY_BYTE_ARRAY;
            }
            throw InvalidProtocolBufferException.negativeSize();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public int readRawLittleEndian32() throws InvalidProtocolBufferException {
            int i12 = this.pos;
            if (this.limit - i12 < 4) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            byte[] bArr = this.buffer;
            this.pos = i12 + 4;
            return ((bArr[i12 + 3] & 255) << 24) | (bArr[i12] & 255) | ((bArr[i12 + 1] & 255) << 8) | ((bArr[i12 + 2] & 255) << 16);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public long readRawLittleEndian64() throws InvalidProtocolBufferException {
            int i12 = this.pos;
            if (this.limit - i12 < 8) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            byte[] bArr = this.buffer;
            this.pos = i12 + 8;
            return ((bArr[i12 + 7] & 255) << 56) | (bArr[i12] & 255) | ((bArr[i12 + 1] & 255) << 8) | ((bArr[i12 + 2] & 255) << 16) | ((bArr[i12 + 3] & 255) << 24) | ((bArr[i12 + 4] & 255) << 32) | ((bArr[i12 + 5] & 255) << 40) | ((bArr[i12 + 6] & 255) << 48);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public int readRawVarint32() {
            int i12;
            int i13 = this.pos;
            int i14 = this.limit;
            if (i14 != i13) {
                byte[] bArr = this.buffer;
                int i15 = i13 + 1;
                byte b12 = bArr[i13];
                if (b12 >= 0) {
                    this.pos = i15;
                    return b12;
                }
                if (i14 - i15 >= 9) {
                    int i16 = i13 + 2;
                    int i17 = (bArr[i15] << 7) ^ b12;
                    if (i17 < 0) {
                        i12 = i17 ^ (-128);
                    } else {
                        int i18 = i13 + 3;
                        int i19 = (bArr[i16] << 14) ^ i17;
                        if (i19 >= 0) {
                            i12 = i19 ^ 16256;
                        } else {
                            int i22 = i13 + 4;
                            int i23 = i19 ^ (bArr[i18] << 21);
                            if (i23 < 0) {
                                i12 = (-2080896) ^ i23;
                            } else {
                                i18 = i13 + 5;
                                byte b13 = bArr[i22];
                                int i24 = (i23 ^ (b13 << 28)) ^ 266354560;
                                if (b13 < 0) {
                                    i22 = i13 + 6;
                                    if (bArr[i18] < 0) {
                                        i18 = i13 + 7;
                                        if (bArr[i22] < 0) {
                                            i22 = i13 + 8;
                                            if (bArr[i18] < 0) {
                                                i18 = i13 + 9;
                                                if (bArr[i22] < 0) {
                                                    int i25 = i13 + 10;
                                                    if (bArr[i18] >= 0) {
                                                        i16 = i25;
                                                        i12 = i24;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    i12 = i24;
                                }
                                i12 = i24;
                            }
                            i16 = i22;
                        }
                        i16 = i18;
                    }
                    this.pos = i16;
                    return i12;
                }
            }
            return (int) readRawVarint64SlowPath();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public long readRawVarint64() {
            long j12;
            long j13;
            long j14;
            int i12 = this.pos;
            int i13 = this.limit;
            if (i13 != i12) {
                byte[] bArr = this.buffer;
                int i14 = i12 + 1;
                byte b12 = bArr[i12];
                if (b12 >= 0) {
                    this.pos = i14;
                    return b12;
                }
                if (i13 - i14 >= 9) {
                    int i15 = i12 + 2;
                    int i16 = (bArr[i14] << 7) ^ b12;
                    if (i16 < 0) {
                        j12 = i16 ^ (-128);
                    } else {
                        int i17 = i12 + 3;
                        int i18 = (bArr[i15] << 14) ^ i16;
                        if (i18 >= 0) {
                            j12 = i18 ^ 16256;
                            i15 = i17;
                        } else {
                            int i19 = i12 + 4;
                            int i22 = i18 ^ (bArr[i17] << 21);
                            if (i22 < 0) {
                                long j15 = (-2080896) ^ i22;
                                i15 = i19;
                                j12 = j15;
                            } else {
                                long j16 = i22;
                                i15 = i12 + 5;
                                long j17 = j16 ^ (bArr[i19] << 28);
                                if (j17 >= 0) {
                                    j14 = 266354560;
                                } else {
                                    int i23 = i12 + 6;
                                    long j18 = j17 ^ (bArr[i15] << 35);
                                    if (j18 < 0) {
                                        j13 = -34093383808L;
                                    } else {
                                        i15 = i12 + 7;
                                        j17 = j18 ^ (bArr[i23] << 42);
                                        if (j17 >= 0) {
                                            j14 = 4363953127296L;
                                        } else {
                                            i23 = i12 + 8;
                                            j18 = j17 ^ (bArr[i15] << 49);
                                            if (j18 < 0) {
                                                j13 = -558586000294016L;
                                            } else {
                                                i15 = i12 + 9;
                                                long j19 = (j18 ^ (bArr[i23] << 56)) ^ 71499008037633920L;
                                                if (j19 < 0) {
                                                    int i24 = i12 + 10;
                                                    if (bArr[i15] >= 0) {
                                                        i15 = i24;
                                                    }
                                                }
                                                j12 = j19;
                                            }
                                        }
                                    }
                                    j12 = j18 ^ j13;
                                    i15 = i23;
                                }
                                j12 = j17 ^ j14;
                            }
                        }
                    }
                    this.pos = i15;
                    return j12;
                }
            }
            return readRawVarint64SlowPath();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public long readRawVarint64SlowPath() throws InvalidProtocolBufferException {
            long j12 = 0;
            for (int i12 = 0; i12 < 64; i12 += 7) {
                j12 |= (r3 & 127) << i12;
                if ((readRawByte() & 128) == 0) {
                    return j12;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public int readSFixed32() {
            return readRawLittleEndian32();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public long readSFixed64() {
            return readRawLittleEndian64();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public int readSInt32() {
            return CodedInputStream.decodeZigZag32(readRawVarint32());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public long readSInt64() {
            return CodedInputStream.decodeZigZag64(readRawVarint64());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public String readString() throws InvalidProtocolBufferException {
            int rawVarint32 = readRawVarint32();
            if (rawVarint32 > 0) {
                int i12 = this.limit;
                int i13 = this.pos;
                if (rawVarint32 <= i12 - i13) {
                    String str = new String(this.buffer, i13, rawVarint32, Internal.UTF_8);
                    this.pos += rawVarint32;
                    return str;
                }
            }
            if (rawVarint32 == 0) {
                return "";
            }
            if (rawVarint32 < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public String readStringRequireUtf8() throws InvalidProtocolBufferException {
            int rawVarint32 = readRawVarint32();
            if (rawVarint32 > 0) {
                int i12 = this.limit;
                int i13 = this.pos;
                if (rawVarint32 <= i12 - i13) {
                    String strDecodeUtf8 = Utf8.decodeUtf8(this.buffer, i13, rawVarint32);
                    this.pos += rawVarint32;
                    return strDecodeUtf8;
                }
            }
            if (rawVarint32 == 0) {
                return "";
            }
            if (rawVarint32 <= 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public int readTag() throws InvalidProtocolBufferException {
            if (isAtEnd()) {
                this.lastTag = 0;
                return 0;
            }
            int rawVarint32 = readRawVarint32();
            this.lastTag = rawVarint32;
            if (WireFormat.getTagFieldNumber(rawVarint32) != 0) {
                return this.lastTag;
            }
            throw InvalidProtocolBufferException.invalidTag();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public int readUInt32() {
            return readRawVarint32();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public long readUInt64() {
            return readRawVarint64();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        @Deprecated
        public void readUnknownGroup(int i12, MessageLite.Builder builder) throws InvalidProtocolBufferException {
            readGroup(i12, builder, ExtensionRegistryLite.getEmptyRegistry());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public void resetSizeCounter() {
            this.startPos = this.pos;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public boolean skipField(int i12) throws InvalidProtocolBufferException {
            int tagWireType = WireFormat.getTagWireType(i12);
            if (tagWireType == 0) {
                skipRawVarint();
                return true;
            }
            if (tagWireType == 1) {
                skipRawBytes(8);
                return true;
            }
            if (tagWireType == 2) {
                skipRawBytes(readRawVarint32());
                return true;
            }
            if (tagWireType == 3) {
                skipMessage();
                checkLastTagWas(WireFormat.makeTag(WireFormat.getTagFieldNumber(i12), 4));
                return true;
            }
            if (tagWireType == 4) {
                return false;
            }
            if (tagWireType != 5) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            skipRawBytes(4);
            return true;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public void skipMessage() throws InvalidProtocolBufferException {
            int tag;
            do {
                tag = readTag();
                if (tag == 0) {
                    return;
                }
            } while (skipField(tag));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public void skipRawBytes(int i12) throws InvalidProtocolBufferException {
            if (i12 >= 0) {
                int i13 = this.limit;
                int i14 = this.pos;
                if (i12 <= i13 - i14) {
                    this.pos = i14 + i12;
                    return;
                }
            }
            if (i12 >= 0) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            throw InvalidProtocolBufferException.negativeSize();
        }

        private ArrayDecoder(byte[] bArr, int i12, int i13, boolean z12) {
            super();
            this.currentLimit = Integer.MAX_VALUE;
            this.buffer = bArr;
            this.limit = i13 + i12;
            this.pos = i12;
            this.startPos = i12;
            this.immutable = z12;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public void skipMessage(CodedOutputStream codedOutputStream) throws InvalidProtocolBufferException {
            int tag;
            do {
                tag = readTag();
                if (tag == 0) {
                    return;
                }
            } while (skipField(tag, codedOutputStream));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public <T extends MessageLite> T readGroup(int i12, Parser<T> parser, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            checkRecursionLimit();
            this.recursionDepth++;
            T partialFrom = parser.parsePartialFrom(this, extensionRegistryLite);
            checkLastTagWas(WireFormat.makeTag(i12, 4));
            this.recursionDepth--;
            return partialFrom;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public boolean skipField(int i12, CodedOutputStream codedOutputStream) throws InvalidProtocolBufferException {
            int tagWireType = WireFormat.getTagWireType(i12);
            if (tagWireType == 0) {
                long int64 = readInt64();
                codedOutputStream.writeUInt32NoTag(i12);
                codedOutputStream.writeUInt64NoTag(int64);
                return true;
            }
            if (tagWireType == 1) {
                long rawLittleEndian64 = readRawLittleEndian64();
                codedOutputStream.writeUInt32NoTag(i12);
                codedOutputStream.writeFixed64NoTag(rawLittleEndian64);
                return true;
            }
            if (tagWireType == 2) {
                ByteString bytes = readBytes();
                codedOutputStream.writeUInt32NoTag(i12);
                codedOutputStream.writeBytesNoTag(bytes);
                return true;
            }
            if (tagWireType == 3) {
                codedOutputStream.writeUInt32NoTag(i12);
                skipMessage(codedOutputStream);
                int iMakeTag = WireFormat.makeTag(WireFormat.getTagFieldNumber(i12), 4);
                checkLastTagWas(iMakeTag);
                codedOutputStream.writeUInt32NoTag(iMakeTag);
                return true;
            }
            if (tagWireType == 4) {
                return false;
            }
            if (tagWireType == 5) {
                int rawLittleEndian32 = readRawLittleEndian32();
                codedOutputStream.writeUInt32NoTag(i12);
                codedOutputStream.writeFixed32NoTag(rawLittleEndian32);
                return true;
            }
            throw InvalidProtocolBufferException.invalidWireType();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public <T extends MessageLite> T readMessage(Parser<T> parser, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            int rawVarint32 = readRawVarint32();
            checkRecursionLimit();
            int iPushLimit = pushLimit(rawVarint32);
            this.recursionDepth++;
            T partialFrom = parser.parsePartialFrom(this, extensionRegistryLite);
            checkLastTagWas(0);
            this.recursionDepth--;
            if (getBytesUntilLimit() == 0) {
                popLimit(iPushLimit);
                return partialFrom;
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }
    }

    public static final class IterableDirectByteBufferDecoder extends CodedInputStream {
        private int bufferSizeAfterCurrentLimit;
        private long currentAddress;
        private ByteBuffer currentByteBuffer;
        private long currentByteBufferLimit;
        private long currentByteBufferPos;
        private long currentByteBufferStartPos;
        private int currentLimit;
        private boolean enableAliasing;
        private final boolean immutable;
        private final Iterable<ByteBuffer> input;
        private final Iterator<ByteBuffer> iterator;
        private int lastTag;
        private int startOffset;
        private int totalBufferSize;
        private int totalBytesRead;

        private long currentRemaining() {
            return this.currentByteBufferLimit - this.currentByteBufferPos;
        }

        private void getNextByteBuffer() throws InvalidProtocolBufferException {
            if (!this.iterator.hasNext()) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            tryGetNextByteBuffer();
        }

        private void readRawBytesTo(byte[] bArr, int i12, int i13) throws InvalidProtocolBufferException {
            if (i13 < 0 || i13 > remaining()) {
                if (i13 > 0) {
                    throw InvalidProtocolBufferException.truncatedMessage();
                }
                if (i13 != 0) {
                    throw InvalidProtocolBufferException.negativeSize();
                }
                return;
            }
            int i14 = i13;
            while (i14 > 0) {
                if (currentRemaining() == 0) {
                    getNextByteBuffer();
                }
                int iMin = Math.min(i14, (int) currentRemaining());
                long j12 = iMin;
                UnsafeUtil.copyMemory(this.currentByteBufferPos, bArr, (i13 - i14) + i12, j12);
                i14 -= iMin;
                this.currentByteBufferPos += j12;
            }
        }

        private void recomputeBufferSizeAfterLimit() {
            int i12 = this.totalBufferSize + this.bufferSizeAfterCurrentLimit;
            this.totalBufferSize = i12;
            int i13 = i12 - this.startOffset;
            int i14 = this.currentLimit;
            if (i13 <= i14) {
                this.bufferSizeAfterCurrentLimit = 0;
                return;
            }
            int i15 = i13 - i14;
            this.bufferSizeAfterCurrentLimit = i15;
            this.totalBufferSize = i12 - i15;
        }

        private int remaining() {
            return (int) (((this.totalBufferSize - this.totalBytesRead) - this.currentByteBufferPos) + this.currentByteBufferStartPos);
        }

        private void skipRawVarint() throws InvalidProtocolBufferException {
            for (int i12 = 0; i12 < 10; i12++) {
                if (readRawByte() >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        private ByteBuffer slice(int i12, int i13) {
            int iPosition = this.currentByteBuffer.position();
            int iLimit = this.currentByteBuffer.limit();
            ByteBuffer byteBuffer = this.currentByteBuffer;
            try {
                try {
                    byteBuffer.position(i12);
                    byteBuffer.limit(i13);
                    return this.currentByteBuffer.slice();
                } catch (IllegalArgumentException unused) {
                    throw InvalidProtocolBufferException.truncatedMessage();
                }
            } finally {
                byteBuffer.position(iPosition);
                byteBuffer.limit(iLimit);
            }
        }

        private void tryGetNextByteBuffer() {
            ByteBuffer next = this.iterator.next();
            this.currentByteBuffer = next;
            this.totalBytesRead += (int) (this.currentByteBufferPos - this.currentByteBufferStartPos);
            long jPosition = next.position();
            this.currentByteBufferPos = jPosition;
            this.currentByteBufferStartPos = jPosition;
            this.currentByteBufferLimit = this.currentByteBuffer.limit();
            long jAddressOffset = UnsafeUtil.addressOffset(this.currentByteBuffer);
            this.currentAddress = jAddressOffset;
            this.currentByteBufferPos += jAddressOffset;
            this.currentByteBufferStartPos += jAddressOffset;
            this.currentByteBufferLimit += jAddressOffset;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public void checkLastTagWas(int i12) throws InvalidProtocolBufferException {
            if (this.lastTag != i12) {
                throw InvalidProtocolBufferException.invalidEndTag();
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public void enableAliasing(boolean z12) {
            this.enableAliasing = z12;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public int getBytesUntilLimit() {
            int i12 = this.currentLimit;
            if (i12 == Integer.MAX_VALUE) {
                return -1;
            }
            return i12 - getTotalBytesRead();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public int getLastTag() {
            return this.lastTag;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public int getTotalBytesRead() {
            return (int) (((this.totalBytesRead - this.startOffset) + this.currentByteBufferPos) - this.currentByteBufferStartPos);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public boolean isAtEnd() {
            return (((long) this.totalBytesRead) + this.currentByteBufferPos) - this.currentByteBufferStartPos == ((long) this.totalBufferSize);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public void popLimit(int i12) {
            this.currentLimit = i12;
            recomputeBufferSizeAfterLimit();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public int pushLimit(int i12) throws InvalidProtocolBufferException {
            if (i12 < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            int totalBytesRead = i12 + getTotalBytesRead();
            int i13 = this.currentLimit;
            if (totalBytesRead > i13) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            this.currentLimit = totalBytesRead;
            recomputeBufferSizeAfterLimit();
            return i13;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public boolean readBool() {
            return readRawVarint64() != 0;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public byte[] readByteArray() {
            return readRawBytes(readRawVarint32());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public ByteBuffer readByteBuffer() throws InvalidProtocolBufferException {
            int rawVarint32 = readRawVarint32();
            if (rawVarint32 > 0) {
                long j12 = rawVarint32;
                if (j12 <= currentRemaining()) {
                    if (this.immutable || !this.enableAliasing) {
                        byte[] bArr = new byte[rawVarint32];
                        UnsafeUtil.copyMemory(this.currentByteBufferPos, bArr, 0L, j12);
                        this.currentByteBufferPos += j12;
                        return ByteBuffer.wrap(bArr);
                    }
                    long j13 = this.currentByteBufferPos + j12;
                    this.currentByteBufferPos = j13;
                    long j14 = this.currentAddress;
                    return slice((int) ((j13 - j14) - j12), (int) (j13 - j14));
                }
            }
            if (rawVarint32 > 0 && rawVarint32 <= remaining()) {
                byte[] bArr2 = new byte[rawVarint32];
                readRawBytesTo(bArr2, 0, rawVarint32);
                return ByteBuffer.wrap(bArr2);
            }
            if (rawVarint32 == 0) {
                return Internal.EMPTY_BYTE_BUFFER;
            }
            if (rawVarint32 < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public ByteString readBytes() throws InvalidProtocolBufferException {
            int rawVarint32 = readRawVarint32();
            if (rawVarint32 > 0) {
                long j12 = rawVarint32;
                long j13 = this.currentByteBufferLimit;
                long j14 = this.currentByteBufferPos;
                if (j12 <= j13 - j14) {
                    if (this.immutable && this.enableAliasing) {
                        int i12 = (int) (j14 - this.currentAddress);
                        ByteString byteStringWrap = ByteString.wrap(slice(i12, rawVarint32 + i12));
                        this.currentByteBufferPos += j12;
                        return byteStringWrap;
                    }
                    byte[] bArr = new byte[rawVarint32];
                    UnsafeUtil.copyMemory(j14, bArr, 0L, j12);
                    this.currentByteBufferPos += j12;
                    return ByteString.wrap(bArr);
                }
            }
            if (rawVarint32 <= 0 || rawVarint32 > remaining()) {
                if (rawVarint32 == 0) {
                    return ByteString.EMPTY;
                }
                if (rawVarint32 < 0) {
                    throw InvalidProtocolBufferException.negativeSize();
                }
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            if (!this.immutable || !this.enableAliasing) {
                byte[] bArr2 = new byte[rawVarint32];
                readRawBytesTo(bArr2, 0, rawVarint32);
                return ByteString.wrap(bArr2);
            }
            ArrayList arrayList = new ArrayList();
            while (rawVarint32 > 0) {
                if (currentRemaining() == 0) {
                    getNextByteBuffer();
                }
                int iMin = Math.min(rawVarint32, (int) currentRemaining());
                int i13 = (int) (this.currentByteBufferPos - this.currentAddress);
                arrayList.add(ByteString.wrap(slice(i13, i13 + iMin)));
                rawVarint32 -= iMin;
                this.currentByteBufferPos += iMin;
            }
            return ByteString.copyFrom(arrayList);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public double readDouble() {
            return Double.longBitsToDouble(readRawLittleEndian64());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public int readEnum() {
            return readRawVarint32();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public int readFixed32() {
            return readRawLittleEndian32();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public long readFixed64() {
            return readRawLittleEndian64();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public float readFloat() {
            return Float.intBitsToFloat(readRawLittleEndian32());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public void readGroup(int i12, MessageLite.Builder builder, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            checkRecursionLimit();
            this.recursionDepth++;
            builder.mergeFrom(this, extensionRegistryLite);
            checkLastTagWas(WireFormat.makeTag(i12, 4));
            this.recursionDepth--;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public int readInt32() {
            return readRawVarint32();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public long readInt64() {
            return readRawVarint64();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public void readMessage(MessageLite.Builder builder, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            int rawVarint32 = readRawVarint32();
            checkRecursionLimit();
            int iPushLimit = pushLimit(rawVarint32);
            this.recursionDepth++;
            builder.mergeFrom(this, extensionRegistryLite);
            checkLastTagWas(0);
            this.recursionDepth--;
            if (getBytesUntilLimit() != 0) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            popLimit(iPushLimit);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public byte readRawByte() throws InvalidProtocolBufferException {
            if (currentRemaining() == 0) {
                getNextByteBuffer();
            }
            long j12 = this.currentByteBufferPos;
            this.currentByteBufferPos = 1 + j12;
            return UnsafeUtil.getByte(j12);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public byte[] readRawBytes(int i12) throws InvalidProtocolBufferException {
            if (i12 >= 0) {
                long j12 = i12;
                if (j12 <= currentRemaining()) {
                    byte[] bArr = new byte[i12];
                    UnsafeUtil.copyMemory(this.currentByteBufferPos, bArr, 0L, j12);
                    this.currentByteBufferPos += j12;
                    return bArr;
                }
            }
            if (i12 >= 0 && i12 <= remaining()) {
                byte[] bArr2 = new byte[i12];
                readRawBytesTo(bArr2, 0, i12);
                return bArr2;
            }
            if (i12 > 0) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            if (i12 == 0) {
                return Internal.EMPTY_BYTE_ARRAY;
            }
            throw InvalidProtocolBufferException.negativeSize();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public int readRawLittleEndian32() {
            if (currentRemaining() < 4) {
                return (readRawByte() & 255) | ((readRawByte() & 255) << 8) | ((readRawByte() & 255) << 16) | ((readRawByte() & 255) << 24);
            }
            long j12 = this.currentByteBufferPos;
            this.currentByteBufferPos = 4 + j12;
            return ((UnsafeUtil.getByte(j12 + 3) & 255) << 24) | (UnsafeUtil.getByte(j12) & 255) | ((UnsafeUtil.getByte(1 + j12) & 255) << 8) | ((UnsafeUtil.getByte(2 + j12) & 255) << 16);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public long readRawLittleEndian64() throws InvalidProtocolBufferException {
            long rawByte;
            byte rawByte2;
            if (currentRemaining() >= 8) {
                long j12 = this.currentByteBufferPos;
                this.currentByteBufferPos = 8 + j12;
                rawByte = (UnsafeUtil.getByte(j12) & 255) | ((UnsafeUtil.getByte(1 + j12) & 255) << 8) | ((UnsafeUtil.getByte(2 + j12) & 255) << 16) | ((UnsafeUtil.getByte(3 + j12) & 255) << 24) | ((UnsafeUtil.getByte(4 + j12) & 255) << 32) | ((UnsafeUtil.getByte(5 + j12) & 255) << 40) | ((UnsafeUtil.getByte(6 + j12) & 255) << 48);
                rawByte2 = UnsafeUtil.getByte(j12 + 7);
            } else {
                rawByte = (readRawByte() & 255) | ((readRawByte() & 255) << 8) | ((readRawByte() & 255) << 16) | ((readRawByte() & 255) << 24) | ((readRawByte() & 255) << 32) | ((readRawByte() & 255) << 40) | ((readRawByte() & 255) << 48);
                rawByte2 = readRawByte();
            }
            return ((rawByte2 & 255) << 56) | rawByte;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public int readRawVarint32() {
            int i12;
            long j12 = this.currentByteBufferPos;
            if (this.currentByteBufferLimit != j12) {
                long j13 = j12 + 1;
                byte b12 = UnsafeUtil.getByte(j12);
                if (b12 >= 0) {
                    this.currentByteBufferPos++;
                    return b12;
                }
                if (this.currentByteBufferLimit - this.currentByteBufferPos >= 10) {
                    long j14 = 2 + j12;
                    int i13 = (UnsafeUtil.getByte(j13) << 7) ^ b12;
                    if (i13 < 0) {
                        i12 = i13 ^ (-128);
                    } else {
                        long j15 = 3 + j12;
                        int i14 = (UnsafeUtil.getByte(j14) << 14) ^ i13;
                        if (i14 >= 0) {
                            i12 = i14 ^ 16256;
                        } else {
                            long j16 = 4 + j12;
                            int i15 = i14 ^ (UnsafeUtil.getByte(j15) << 21);
                            if (i15 < 0) {
                                i12 = (-2080896) ^ i15;
                            } else {
                                j15 = 5 + j12;
                                byte b13 = UnsafeUtil.getByte(j16);
                                int i16 = (i15 ^ (b13 << 28)) ^ 266354560;
                                if (b13 < 0) {
                                    j16 = 6 + j12;
                                    if (UnsafeUtil.getByte(j15) < 0) {
                                        j15 = 7 + j12;
                                        if (UnsafeUtil.getByte(j16) < 0) {
                                            j16 = 8 + j12;
                                            if (UnsafeUtil.getByte(j15) < 0) {
                                                j15 = 9 + j12;
                                                if (UnsafeUtil.getByte(j16) < 0) {
                                                    long j17 = j12 + 10;
                                                    if (UnsafeUtil.getByte(j15) >= 0) {
                                                        i12 = i16;
                                                        j14 = j17;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    i12 = i16;
                                }
                                i12 = i16;
                            }
                            j14 = j16;
                        }
                        j14 = j15;
                    }
                    this.currentByteBufferPos = j14;
                    return i12;
                }
            }
            return (int) readRawVarint64SlowPath();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public long readRawVarint64() {
            long j12;
            long j13;
            long j14;
            long j15 = this.currentByteBufferPos;
            if (this.currentByteBufferLimit != j15) {
                long j16 = j15 + 1;
                byte b12 = UnsafeUtil.getByte(j15);
                if (b12 >= 0) {
                    this.currentByteBufferPos++;
                    return b12;
                }
                if (this.currentByteBufferLimit - this.currentByteBufferPos >= 10) {
                    long j17 = 2 + j15;
                    int i12 = (UnsafeUtil.getByte(j16) << 7) ^ b12;
                    if (i12 < 0) {
                        j12 = i12 ^ (-128);
                    } else {
                        long j18 = 3 + j15;
                        int i13 = (UnsafeUtil.getByte(j17) << 14) ^ i12;
                        if (i13 >= 0) {
                            j12 = i13 ^ 16256;
                            j17 = j18;
                        } else {
                            long j19 = 4 + j15;
                            int i14 = i13 ^ (UnsafeUtil.getByte(j18) << 21);
                            if (i14 < 0) {
                                j12 = (-2080896) ^ i14;
                                j17 = j19;
                            } else {
                                long j22 = 5 + j15;
                                long j23 = (UnsafeUtil.getByte(j19) << 28) ^ i14;
                                if (j23 >= 0) {
                                    j14 = 266354560;
                                } else {
                                    long j24 = 6 + j15;
                                    long j25 = j23 ^ (UnsafeUtil.getByte(j22) << 35);
                                    if (j25 < 0) {
                                        j13 = -34093383808L;
                                    } else {
                                        j22 = 7 + j15;
                                        j23 = j25 ^ (UnsafeUtil.getByte(j24) << 42);
                                        if (j23 >= 0) {
                                            j14 = 4363953127296L;
                                        } else {
                                            j24 = 8 + j15;
                                            j25 = j23 ^ (UnsafeUtil.getByte(j22) << 49);
                                            if (j25 < 0) {
                                                j13 = -558586000294016L;
                                            } else {
                                                j22 = 9 + j15;
                                                long j26 = (j25 ^ (UnsafeUtil.getByte(j24) << 56)) ^ 71499008037633920L;
                                                if (j26 < 0) {
                                                    long j27 = j15 + 10;
                                                    if (UnsafeUtil.getByte(j22) >= 0) {
                                                        j12 = j26;
                                                        j17 = j27;
                                                    }
                                                } else {
                                                    j12 = j26;
                                                    j17 = j22;
                                                }
                                            }
                                        }
                                    }
                                    j12 = j13 ^ j25;
                                    j17 = j24;
                                }
                                j12 = j14 ^ j23;
                                j17 = j22;
                            }
                        }
                    }
                    this.currentByteBufferPos = j17;
                    return j12;
                }
            }
            return readRawVarint64SlowPath();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public long readRawVarint64SlowPath() throws InvalidProtocolBufferException {
            long j12 = 0;
            for (int i12 = 0; i12 < 64; i12 += 7) {
                j12 |= (r3 & 127) << i12;
                if ((readRawByte() & 128) == 0) {
                    return j12;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public int readSFixed32() {
            return readRawLittleEndian32();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public long readSFixed64() {
            return readRawLittleEndian64();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public int readSInt32() {
            return CodedInputStream.decodeZigZag32(readRawVarint32());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public long readSInt64() {
            return CodedInputStream.decodeZigZag64(readRawVarint64());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public String readString() throws InvalidProtocolBufferException {
            int rawVarint32 = readRawVarint32();
            if (rawVarint32 > 0) {
                long j12 = rawVarint32;
                long j13 = this.currentByteBufferLimit;
                long j14 = this.currentByteBufferPos;
                if (j12 <= j13 - j14) {
                    byte[] bArr = new byte[rawVarint32];
                    UnsafeUtil.copyMemory(j14, bArr, 0L, j12);
                    String str = new String(bArr, Internal.UTF_8);
                    this.currentByteBufferPos += j12;
                    return str;
                }
            }
            if (rawVarint32 > 0 && rawVarint32 <= remaining()) {
                byte[] bArr2 = new byte[rawVarint32];
                readRawBytesTo(bArr2, 0, rawVarint32);
                return new String(bArr2, Internal.UTF_8);
            }
            if (rawVarint32 == 0) {
                return "";
            }
            if (rawVarint32 < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public String readStringRequireUtf8() throws InvalidProtocolBufferException {
            int rawVarint32 = readRawVarint32();
            if (rawVarint32 > 0) {
                long j12 = rawVarint32;
                long j13 = this.currentByteBufferLimit;
                long j14 = this.currentByteBufferPos;
                if (j12 <= j13 - j14) {
                    String strDecodeUtf8 = Utf8.decodeUtf8(this.currentByteBuffer, (int) (j14 - this.currentByteBufferStartPos), rawVarint32);
                    this.currentByteBufferPos += j12;
                    return strDecodeUtf8;
                }
            }
            if (rawVarint32 >= 0 && rawVarint32 <= remaining()) {
                byte[] bArr = new byte[rawVarint32];
                readRawBytesTo(bArr, 0, rawVarint32);
                return Utf8.decodeUtf8(bArr, 0, rawVarint32);
            }
            if (rawVarint32 == 0) {
                return "";
            }
            if (rawVarint32 <= 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public int readTag() throws InvalidProtocolBufferException {
            if (isAtEnd()) {
                this.lastTag = 0;
                return 0;
            }
            int rawVarint32 = readRawVarint32();
            this.lastTag = rawVarint32;
            if (WireFormat.getTagFieldNumber(rawVarint32) != 0) {
                return this.lastTag;
            }
            throw InvalidProtocolBufferException.invalidTag();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public int readUInt32() {
            return readRawVarint32();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public long readUInt64() {
            return readRawVarint64();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        @Deprecated
        public void readUnknownGroup(int i12, MessageLite.Builder builder) throws InvalidProtocolBufferException {
            readGroup(i12, builder, ExtensionRegistryLite.getEmptyRegistry());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public void resetSizeCounter() {
            this.startOffset = (int) ((this.totalBytesRead + this.currentByteBufferPos) - this.currentByteBufferStartPos);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public boolean skipField(int i12) throws InvalidProtocolBufferException {
            int tagWireType = WireFormat.getTagWireType(i12);
            if (tagWireType == 0) {
                skipRawVarint();
                return true;
            }
            if (tagWireType == 1) {
                skipRawBytes(8);
                return true;
            }
            if (tagWireType == 2) {
                skipRawBytes(readRawVarint32());
                return true;
            }
            if (tagWireType == 3) {
                skipMessage();
                checkLastTagWas(WireFormat.makeTag(WireFormat.getTagFieldNumber(i12), 4));
                return true;
            }
            if (tagWireType == 4) {
                return false;
            }
            if (tagWireType != 5) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            skipRawBytes(4);
            return true;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public void skipMessage() throws InvalidProtocolBufferException {
            int tag;
            do {
                tag = readTag();
                if (tag == 0) {
                    return;
                }
            } while (skipField(tag));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public void skipRawBytes(int i12) throws InvalidProtocolBufferException {
            if (i12 < 0 || i12 > ((this.totalBufferSize - this.totalBytesRead) - this.currentByteBufferPos) + this.currentByteBufferStartPos) {
                if (i12 >= 0) {
                    throw InvalidProtocolBufferException.truncatedMessage();
                }
                throw InvalidProtocolBufferException.negativeSize();
            }
            while (i12 > 0) {
                if (currentRemaining() == 0) {
                    getNextByteBuffer();
                }
                int iMin = Math.min(i12, (int) currentRemaining());
                i12 -= iMin;
                this.currentByteBufferPos += iMin;
            }
        }

        private IterableDirectByteBufferDecoder(Iterable<ByteBuffer> iterable, int i12, boolean z12) {
            super();
            this.currentLimit = Integer.MAX_VALUE;
            this.totalBufferSize = i12;
            this.input = iterable;
            this.iterator = iterable.iterator();
            this.immutable = z12;
            this.totalBytesRead = 0;
            this.startOffset = 0;
            if (i12 != 0) {
                tryGetNextByteBuffer();
                return;
            }
            this.currentByteBuffer = Internal.EMPTY_BYTE_BUFFER;
            this.currentByteBufferPos = 0L;
            this.currentByteBufferStartPos = 0L;
            this.currentByteBufferLimit = 0L;
            this.currentAddress = 0L;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public void skipMessage(CodedOutputStream codedOutputStream) throws InvalidProtocolBufferException {
            int tag;
            do {
                tag = readTag();
                if (tag == 0) {
                    return;
                }
            } while (skipField(tag, codedOutputStream));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public <T extends MessageLite> T readGroup(int i12, Parser<T> parser, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            checkRecursionLimit();
            this.recursionDepth++;
            T partialFrom = parser.parsePartialFrom(this, extensionRegistryLite);
            checkLastTagWas(WireFormat.makeTag(i12, 4));
            this.recursionDepth--;
            return partialFrom;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public boolean skipField(int i12, CodedOutputStream codedOutputStream) throws InvalidProtocolBufferException {
            int tagWireType = WireFormat.getTagWireType(i12);
            if (tagWireType == 0) {
                long int64 = readInt64();
                codedOutputStream.writeUInt32NoTag(i12);
                codedOutputStream.writeUInt64NoTag(int64);
                return true;
            }
            if (tagWireType == 1) {
                long rawLittleEndian64 = readRawLittleEndian64();
                codedOutputStream.writeUInt32NoTag(i12);
                codedOutputStream.writeFixed64NoTag(rawLittleEndian64);
                return true;
            }
            if (tagWireType == 2) {
                ByteString bytes = readBytes();
                codedOutputStream.writeUInt32NoTag(i12);
                codedOutputStream.writeBytesNoTag(bytes);
                return true;
            }
            if (tagWireType == 3) {
                codedOutputStream.writeUInt32NoTag(i12);
                skipMessage(codedOutputStream);
                int iMakeTag = WireFormat.makeTag(WireFormat.getTagFieldNumber(i12), 4);
                checkLastTagWas(iMakeTag);
                codedOutputStream.writeUInt32NoTag(iMakeTag);
                return true;
            }
            if (tagWireType == 4) {
                return false;
            }
            if (tagWireType == 5) {
                int rawLittleEndian32 = readRawLittleEndian32();
                codedOutputStream.writeUInt32NoTag(i12);
                codedOutputStream.writeFixed32NoTag(rawLittleEndian32);
                return true;
            }
            throw InvalidProtocolBufferException.invalidWireType();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public <T extends MessageLite> T readMessage(Parser<T> parser, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            int rawVarint32 = readRawVarint32();
            checkRecursionLimit();
            int iPushLimit = pushLimit(rawVarint32);
            this.recursionDepth++;
            T partialFrom = parser.parsePartialFrom(this, extensionRegistryLite);
            checkLastTagWas(0);
            this.recursionDepth--;
            if (getBytesUntilLimit() == 0) {
                popLimit(iPushLimit);
                return partialFrom;
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }
    }

    public static final class StreamDecoder extends CodedInputStream {
        private final byte[] buffer;
        private int bufferSize;
        private int bufferSizeAfterLimit;
        private int currentLimit;
        private final InputStream input;
        private int lastTag;
        private int pos;
        private RefillCallback refillCallback;
        private int totalBytesRetired;

        public interface RefillCallback {
            void onRefill();
        }

        public class SkippedDataSink implements RefillCallback {
            private ByteArrayOutputStream byteArrayStream;
            private int lastPos;

            private SkippedDataSink() {
                this.lastPos = StreamDecoder.this.pos;
            }

            public ByteBuffer getSkippedData() {
                ByteArrayOutputStream byteArrayOutputStream = this.byteArrayStream;
                if (byteArrayOutputStream == null) {
                    return ByteBuffer.wrap(StreamDecoder.this.buffer, this.lastPos, StreamDecoder.this.pos - this.lastPos);
                }
                byteArrayOutputStream.write(StreamDecoder.this.buffer, this.lastPos, StreamDecoder.this.pos);
                return ByteBuffer.wrap(this.byteArrayStream.toByteArray());
            }

            @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream.StreamDecoder.RefillCallback
            public void onRefill() {
                if (this.byteArrayStream == null) {
                    this.byteArrayStream = new ByteArrayOutputStream();
                }
                this.byteArrayStream.write(StreamDecoder.this.buffer, this.lastPos, StreamDecoder.this.pos - this.lastPos);
                this.lastPos = 0;
            }
        }

        private static int available(InputStream inputStream) throws InvalidProtocolBufferException {
            try {
                return inputStream.available();
            } catch (InvalidProtocolBufferException e12) {
                e12.setThrownFromInputStream();
                throw e12;
            }
        }

        private static int read(InputStream inputStream, byte[] bArr, int i12, int i13) throws InvalidProtocolBufferException {
            try {
                return inputStream.read(bArr, i12, i13);
            } catch (InvalidProtocolBufferException e12) {
                e12.setThrownFromInputStream();
                throw e12;
            }
        }

        private ByteString readBytesSlowPath(int i12) throws IOException {
            byte[] rawBytesSlowPathOneChunk = readRawBytesSlowPathOneChunk(i12);
            if (rawBytesSlowPathOneChunk != null) {
                return ByteString.copyFrom(rawBytesSlowPathOneChunk);
            }
            int i13 = this.pos;
            int i14 = this.bufferSize;
            int length = i14 - i13;
            this.totalBytesRetired += i14;
            this.pos = 0;
            this.bufferSize = 0;
            List<byte[]> rawBytesSlowPathRemainingChunks = readRawBytesSlowPathRemainingChunks(i12 - length);
            byte[] bArr = new byte[i12];
            System.arraycopy(this.buffer, i13, bArr, 0, length);
            for (byte[] bArr2 : rawBytesSlowPathRemainingChunks) {
                System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
                length += bArr2.length;
            }
            return ByteString.wrap(bArr);
        }

        private byte[] readRawBytesSlowPath(int i12, boolean z12) throws IOException {
            byte[] rawBytesSlowPathOneChunk = readRawBytesSlowPathOneChunk(i12);
            if (rawBytesSlowPathOneChunk != null) {
                return z12 ? (byte[]) rawBytesSlowPathOneChunk.clone() : rawBytesSlowPathOneChunk;
            }
            int i13 = this.pos;
            int i14 = this.bufferSize;
            int length = i14 - i13;
            this.totalBytesRetired += i14;
            this.pos = 0;
            this.bufferSize = 0;
            List<byte[]> rawBytesSlowPathRemainingChunks = readRawBytesSlowPathRemainingChunks(i12 - length);
            byte[] bArr = new byte[i12];
            System.arraycopy(this.buffer, i13, bArr, 0, length);
            for (byte[] bArr2 : rawBytesSlowPathRemainingChunks) {
                System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
                length += bArr2.length;
            }
            return bArr;
        }

        private byte[] readRawBytesSlowPathOneChunk(int i12) throws InvalidProtocolBufferException {
            if (i12 == 0) {
                return Internal.EMPTY_BYTE_ARRAY;
            }
            if (i12 < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            int i13 = this.totalBytesRetired;
            int i14 = this.pos;
            int i15 = i13 + i14 + i12;
            if (i15 - this.sizeLimit > 0) {
                throw InvalidProtocolBufferException.sizeLimitExceeded();
            }
            int i16 = this.currentLimit;
            if (i15 > i16) {
                skipRawBytes((i16 - i13) - i14);
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            int i17 = this.bufferSize - i14;
            int i18 = i12 - i17;
            if (i18 >= 4096 && i18 > available(this.input)) {
                return null;
            }
            byte[] bArr = new byte[i12];
            System.arraycopy(this.buffer, this.pos, bArr, 0, i17);
            this.totalBytesRetired += this.bufferSize;
            this.pos = 0;
            this.bufferSize = 0;
            while (i17 < i12) {
                int i19 = read(this.input, bArr, i17, i12 - i17);
                if (i19 == -1) {
                    throw InvalidProtocolBufferException.truncatedMessage();
                }
                this.totalBytesRetired += i19;
                i17 += i19;
            }
            return bArr;
        }

        private List<byte[]> readRawBytesSlowPathRemainingChunks(int i12) throws IOException {
            ArrayList arrayList = new ArrayList();
            while (i12 > 0) {
                int iMin = Math.min(i12, 4096);
                byte[] bArr = new byte[iMin];
                int i13 = 0;
                while (i13 < iMin) {
                    int i14 = this.input.read(bArr, i13, iMin - i13);
                    if (i14 == -1) {
                        throw InvalidProtocolBufferException.truncatedMessage();
                    }
                    this.totalBytesRetired += i14;
                    i13 += i14;
                }
                i12 -= iMin;
                arrayList.add(bArr);
            }
            return arrayList;
        }

        private void recomputeBufferSizeAfterLimit() {
            int i12 = this.bufferSize + this.bufferSizeAfterLimit;
            this.bufferSize = i12;
            int i13 = this.totalBytesRetired + i12;
            int i14 = this.currentLimit;
            if (i13 <= i14) {
                this.bufferSizeAfterLimit = 0;
                return;
            }
            int i15 = i13 - i14;
            this.bufferSizeAfterLimit = i15;
            this.bufferSize = i12 - i15;
        }

        private void refillBuffer(int i12) throws InvalidProtocolBufferException {
            if (tryRefillBuffer(i12)) {
                return;
            }
            if (i12 <= (this.sizeLimit - this.totalBytesRetired) - this.pos) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            throw InvalidProtocolBufferException.sizeLimitExceeded();
        }

        private static long skip(InputStream inputStream, long j12) throws InvalidProtocolBufferException {
            try {
                return inputStream.skip(j12);
            } catch (InvalidProtocolBufferException e12) {
                e12.setThrownFromInputStream();
                throw e12;
            }
        }

        private void skipRawBytesSlowPath(int i12) throws InvalidProtocolBufferException {
            if (i12 < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            int i13 = this.totalBytesRetired;
            int i14 = this.pos;
            int i15 = i13 + i14 + i12;
            int i16 = this.currentLimit;
            if (i15 > i16) {
                skipRawBytes((i16 - i13) - i14);
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            int i17 = 0;
            if (this.refillCallback == null) {
                this.totalBytesRetired = i13 + i14;
                int i18 = this.bufferSize - i14;
                this.bufferSize = 0;
                this.pos = 0;
                i17 = i18;
                while (i17 < i12) {
                    try {
                        long j12 = i12 - i17;
                        long jSkip = skip(this.input, j12);
                        if (jSkip < 0 || jSkip > j12) {
                            throw new IllegalStateException(this.input.getClass() + "#skip returned invalid result: " + jSkip + "\nThe InputStream implementation is buggy.");
                        }
                        if (jSkip == 0) {
                            break;
                        } else {
                            i17 += (int) jSkip;
                        }
                    } finally {
                        this.totalBytesRetired += i17;
                        recomputeBufferSizeAfterLimit();
                    }
                }
            }
            if (i17 >= i12) {
                return;
            }
            int i19 = this.bufferSize;
            int i22 = i19 - this.pos;
            this.pos = i19;
            refillBuffer(1);
            while (true) {
                int i23 = i12 - i22;
                int i24 = this.bufferSize;
                if (i23 <= i24) {
                    this.pos = i23;
                    return;
                } else {
                    i22 += i24;
                    this.pos = i24;
                    refillBuffer(1);
                }
            }
        }

        private void skipRawVarint() throws InvalidProtocolBufferException {
            if (this.bufferSize - this.pos >= 10) {
                skipRawVarintFastPath();
            } else {
                skipRawVarintSlowPath();
            }
        }

        private void skipRawVarintFastPath() throws InvalidProtocolBufferException {
            for (int i12 = 0; i12 < 10; i12++) {
                byte[] bArr = this.buffer;
                int i13 = this.pos;
                this.pos = i13 + 1;
                if (bArr[i13] >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        private void skipRawVarintSlowPath() throws InvalidProtocolBufferException {
            for (int i12 = 0; i12 < 10; i12++) {
                if (readRawByte() >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        private boolean tryRefillBuffer(int i12) throws InvalidProtocolBufferException {
            int i13 = this.pos;
            if (i13 + i12 <= this.bufferSize) {
                throw new IllegalStateException(G.e(i12, "refillBuffer() called when ", " bytes were already available in buffer"));
            }
            int i14 = this.sizeLimit;
            int i15 = this.totalBytesRetired;
            if (i12 > (i14 - i15) - i13 || i15 + i13 + i12 > this.currentLimit) {
                return false;
            }
            RefillCallback refillCallback = this.refillCallback;
            if (refillCallback != null) {
                refillCallback.onRefill();
            }
            int i16 = this.pos;
            if (i16 > 0) {
                int i17 = this.bufferSize;
                if (i17 > i16) {
                    byte[] bArr = this.buffer;
                    System.arraycopy(bArr, i16, bArr, 0, i17 - i16);
                }
                this.totalBytesRetired += i16;
                this.bufferSize -= i16;
                this.pos = 0;
            }
            InputStream inputStream = this.input;
            byte[] bArr2 = this.buffer;
            int i18 = this.bufferSize;
            int i19 = read(inputStream, bArr2, i18, Math.min(bArr2.length - i18, (this.sizeLimit - this.totalBytesRetired) - i18));
            if (i19 == 0 || i19 < -1 || i19 > this.buffer.length) {
                throw new IllegalStateException(this.input.getClass() + "#read(byte[]) returned invalid result: " + i19 + "\nThe InputStream implementation is buggy.");
            }
            if (i19 <= 0) {
                return false;
            }
            this.bufferSize += i19;
            recomputeBufferSizeAfterLimit();
            if (this.bufferSize >= i12) {
                return true;
            }
            return tryRefillBuffer(i12);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public void checkLastTagWas(int i12) throws InvalidProtocolBufferException {
            if (this.lastTag != i12) {
                throw InvalidProtocolBufferException.invalidEndTag();
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public int getBytesUntilLimit() {
            int i12 = this.currentLimit;
            if (i12 == Integer.MAX_VALUE) {
                return -1;
            }
            return i12 - (this.totalBytesRetired + this.pos);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public int getLastTag() {
            return this.lastTag;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public int getTotalBytesRead() {
            return this.totalBytesRetired + this.pos;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public boolean isAtEnd() {
            return this.pos == this.bufferSize && !tryRefillBuffer(1);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public void popLimit(int i12) {
            this.currentLimit = i12;
            recomputeBufferSizeAfterLimit();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public int pushLimit(int i12) throws InvalidProtocolBufferException {
            if (i12 < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            int i13 = this.totalBytesRetired + this.pos + i12;
            int i14 = this.currentLimit;
            if (i13 > i14) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            this.currentLimit = i13;
            recomputeBufferSizeAfterLimit();
            return i14;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public boolean readBool() {
            return readRawVarint64() != 0;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public byte[] readByteArray() {
            int rawVarint32 = readRawVarint32();
            int i12 = this.bufferSize;
            int i13 = this.pos;
            if (rawVarint32 > i12 - i13 || rawVarint32 <= 0) {
                return readRawBytesSlowPath(rawVarint32, false);
            }
            byte[] bArrCopyOfRange = Arrays.copyOfRange(this.buffer, i13, i13 + rawVarint32);
            this.pos += rawVarint32;
            return bArrCopyOfRange;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public ByteBuffer readByteBuffer() {
            int rawVarint32 = readRawVarint32();
            int i12 = this.bufferSize;
            int i13 = this.pos;
            if (rawVarint32 > i12 - i13 || rawVarint32 <= 0) {
                return rawVarint32 == 0 ? Internal.EMPTY_BYTE_BUFFER : ByteBuffer.wrap(readRawBytesSlowPath(rawVarint32, true));
            }
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(Arrays.copyOfRange(this.buffer, i13, i13 + rawVarint32));
            this.pos += rawVarint32;
            return byteBufferWrap;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public ByteString readBytes() {
            int rawVarint32 = readRawVarint32();
            int i12 = this.bufferSize;
            int i13 = this.pos;
            if (rawVarint32 > i12 - i13 || rawVarint32 <= 0) {
                return rawVarint32 == 0 ? ByteString.EMPTY : readBytesSlowPath(rawVarint32);
            }
            ByteString byteStringCopyFrom = ByteString.copyFrom(this.buffer, i13, rawVarint32);
            this.pos += rawVarint32;
            return byteStringCopyFrom;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public double readDouble() {
            return Double.longBitsToDouble(readRawLittleEndian64());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public int readEnum() {
            return readRawVarint32();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public int readFixed32() {
            return readRawLittleEndian32();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public long readFixed64() {
            return readRawLittleEndian64();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public float readFloat() {
            return Float.intBitsToFloat(readRawLittleEndian32());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public void readGroup(int i12, MessageLite.Builder builder, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            checkRecursionLimit();
            this.recursionDepth++;
            builder.mergeFrom(this, extensionRegistryLite);
            checkLastTagWas(WireFormat.makeTag(i12, 4));
            this.recursionDepth--;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public int readInt32() {
            return readRawVarint32();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public long readInt64() {
            return readRawVarint64();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public void readMessage(MessageLite.Builder builder, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            int rawVarint32 = readRawVarint32();
            checkRecursionLimit();
            int iPushLimit = pushLimit(rawVarint32);
            this.recursionDepth++;
            builder.mergeFrom(this, extensionRegistryLite);
            checkLastTagWas(0);
            this.recursionDepth--;
            if (getBytesUntilLimit() != 0) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            popLimit(iPushLimit);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public byte readRawByte() throws InvalidProtocolBufferException {
            if (this.pos == this.bufferSize) {
                refillBuffer(1);
            }
            byte[] bArr = this.buffer;
            int i12 = this.pos;
            this.pos = i12 + 1;
            return bArr[i12];
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public byte[] readRawBytes(int i12) {
            int i13 = this.pos;
            if (i12 > this.bufferSize - i13 || i12 <= 0) {
                return readRawBytesSlowPath(i12, false);
            }
            int i14 = i12 + i13;
            this.pos = i14;
            return Arrays.copyOfRange(this.buffer, i13, i14);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public int readRawLittleEndian32() throws InvalidProtocolBufferException {
            int i12 = this.pos;
            if (this.bufferSize - i12 < 4) {
                refillBuffer(4);
                i12 = this.pos;
            }
            byte[] bArr = this.buffer;
            this.pos = i12 + 4;
            return ((bArr[i12 + 3] & 255) << 24) | (bArr[i12] & 255) | ((bArr[i12 + 1] & 255) << 8) | ((bArr[i12 + 2] & 255) << 16);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public long readRawLittleEndian64() throws InvalidProtocolBufferException {
            int i12 = this.pos;
            if (this.bufferSize - i12 < 8) {
                refillBuffer(8);
                i12 = this.pos;
            }
            byte[] bArr = this.buffer;
            this.pos = i12 + 8;
            return ((bArr[i12 + 7] & 255) << 56) | (bArr[i12] & 255) | ((bArr[i12 + 1] & 255) << 8) | ((bArr[i12 + 2] & 255) << 16) | ((bArr[i12 + 3] & 255) << 24) | ((bArr[i12 + 4] & 255) << 32) | ((bArr[i12 + 5] & 255) << 40) | ((bArr[i12 + 6] & 255) << 48);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public int readRawVarint32() {
            int i12;
            int i13 = this.pos;
            int i14 = this.bufferSize;
            if (i14 != i13) {
                byte[] bArr = this.buffer;
                int i15 = i13 + 1;
                byte b12 = bArr[i13];
                if (b12 >= 0) {
                    this.pos = i15;
                    return b12;
                }
                if (i14 - i15 >= 9) {
                    int i16 = i13 + 2;
                    int i17 = (bArr[i15] << 7) ^ b12;
                    if (i17 < 0) {
                        i12 = i17 ^ (-128);
                    } else {
                        int i18 = i13 + 3;
                        int i19 = (bArr[i16] << 14) ^ i17;
                        if (i19 >= 0) {
                            i12 = i19 ^ 16256;
                        } else {
                            int i22 = i13 + 4;
                            int i23 = i19 ^ (bArr[i18] << 21);
                            if (i23 < 0) {
                                i12 = (-2080896) ^ i23;
                            } else {
                                i18 = i13 + 5;
                                byte b13 = bArr[i22];
                                int i24 = (i23 ^ (b13 << 28)) ^ 266354560;
                                if (b13 < 0) {
                                    i22 = i13 + 6;
                                    if (bArr[i18] < 0) {
                                        i18 = i13 + 7;
                                        if (bArr[i22] < 0) {
                                            i22 = i13 + 8;
                                            if (bArr[i18] < 0) {
                                                i18 = i13 + 9;
                                                if (bArr[i22] < 0) {
                                                    int i25 = i13 + 10;
                                                    if (bArr[i18] >= 0) {
                                                        i16 = i25;
                                                        i12 = i24;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    i12 = i24;
                                }
                                i12 = i24;
                            }
                            i16 = i22;
                        }
                        i16 = i18;
                    }
                    this.pos = i16;
                    return i12;
                }
            }
            return (int) readRawVarint64SlowPath();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public long readRawVarint64() {
            long j12;
            long j13;
            long j14;
            int i12 = this.pos;
            int i13 = this.bufferSize;
            if (i13 != i12) {
                byte[] bArr = this.buffer;
                int i14 = i12 + 1;
                byte b12 = bArr[i12];
                if (b12 >= 0) {
                    this.pos = i14;
                    return b12;
                }
                if (i13 - i14 >= 9) {
                    int i15 = i12 + 2;
                    int i16 = (bArr[i14] << 7) ^ b12;
                    if (i16 < 0) {
                        j12 = i16 ^ (-128);
                    } else {
                        int i17 = i12 + 3;
                        int i18 = (bArr[i15] << 14) ^ i16;
                        if (i18 >= 0) {
                            j12 = i18 ^ 16256;
                            i15 = i17;
                        } else {
                            int i19 = i12 + 4;
                            int i22 = i18 ^ (bArr[i17] << 21);
                            if (i22 < 0) {
                                long j15 = (-2080896) ^ i22;
                                i15 = i19;
                                j12 = j15;
                            } else {
                                long j16 = i22;
                                i15 = i12 + 5;
                                long j17 = j16 ^ (bArr[i19] << 28);
                                if (j17 >= 0) {
                                    j14 = 266354560;
                                } else {
                                    int i23 = i12 + 6;
                                    long j18 = j17 ^ (bArr[i15] << 35);
                                    if (j18 < 0) {
                                        j13 = -34093383808L;
                                    } else {
                                        i15 = i12 + 7;
                                        j17 = j18 ^ (bArr[i23] << 42);
                                        if (j17 >= 0) {
                                            j14 = 4363953127296L;
                                        } else {
                                            i23 = i12 + 8;
                                            j18 = j17 ^ (bArr[i15] << 49);
                                            if (j18 < 0) {
                                                j13 = -558586000294016L;
                                            } else {
                                                i15 = i12 + 9;
                                                long j19 = (j18 ^ (bArr[i23] << 56)) ^ 71499008037633920L;
                                                if (j19 < 0) {
                                                    int i24 = i12 + 10;
                                                    if (bArr[i15] >= 0) {
                                                        i15 = i24;
                                                    }
                                                }
                                                j12 = j19;
                                            }
                                        }
                                    }
                                    j12 = j18 ^ j13;
                                    i15 = i23;
                                }
                                j12 = j17 ^ j14;
                            }
                        }
                    }
                    this.pos = i15;
                    return j12;
                }
            }
            return readRawVarint64SlowPath();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public long readRawVarint64SlowPath() throws InvalidProtocolBufferException {
            long j12 = 0;
            for (int i12 = 0; i12 < 64; i12 += 7) {
                j12 |= (r3 & 127) << i12;
                if ((readRawByte() & 128) == 0) {
                    return j12;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public int readSFixed32() {
            return readRawLittleEndian32();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public long readSFixed64() {
            return readRawLittleEndian64();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public int readSInt32() {
            return CodedInputStream.decodeZigZag32(readRawVarint32());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public long readSInt64() {
            return CodedInputStream.decodeZigZag64(readRawVarint64());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public String readString() throws InvalidProtocolBufferException {
            int rawVarint32 = readRawVarint32();
            if (rawVarint32 > 0) {
                int i12 = this.bufferSize;
                int i13 = this.pos;
                if (rawVarint32 <= i12 - i13) {
                    String str = new String(this.buffer, i13, rawVarint32, Internal.UTF_8);
                    this.pos += rawVarint32;
                    return str;
                }
            }
            if (rawVarint32 == 0) {
                return "";
            }
            if (rawVarint32 > this.bufferSize) {
                return new String(readRawBytesSlowPath(rawVarint32, false), Internal.UTF_8);
            }
            refillBuffer(rawVarint32);
            String str2 = new String(this.buffer, this.pos, rawVarint32, Internal.UTF_8);
            this.pos += rawVarint32;
            return str2;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public String readStringRequireUtf8() throws IOException {
            byte[] rawBytesSlowPath;
            int rawVarint32 = readRawVarint32();
            int i12 = this.pos;
            int i13 = this.bufferSize;
            if (rawVarint32 <= i13 - i12 && rawVarint32 > 0) {
                rawBytesSlowPath = this.buffer;
                this.pos = i12 + rawVarint32;
            } else {
                if (rawVarint32 == 0) {
                    return "";
                }
                i12 = 0;
                if (rawVarint32 <= i13) {
                    refillBuffer(rawVarint32);
                    rawBytesSlowPath = this.buffer;
                    this.pos = rawVarint32;
                } else {
                    rawBytesSlowPath = readRawBytesSlowPath(rawVarint32, false);
                }
            }
            return Utf8.decodeUtf8(rawBytesSlowPath, i12, rawVarint32);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public int readTag() throws InvalidProtocolBufferException {
            if (isAtEnd()) {
                this.lastTag = 0;
                return 0;
            }
            int rawVarint32 = readRawVarint32();
            this.lastTag = rawVarint32;
            if (WireFormat.getTagFieldNumber(rawVarint32) != 0) {
                return this.lastTag;
            }
            throw InvalidProtocolBufferException.invalidTag();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public int readUInt32() {
            return readRawVarint32();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public long readUInt64() {
            return readRawVarint64();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        @Deprecated
        public void readUnknownGroup(int i12, MessageLite.Builder builder) throws InvalidProtocolBufferException {
            readGroup(i12, builder, ExtensionRegistryLite.getEmptyRegistry());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public void resetSizeCounter() {
            this.totalBytesRetired = -this.pos;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public boolean skipField(int i12) throws InvalidProtocolBufferException {
            int tagWireType = WireFormat.getTagWireType(i12);
            if (tagWireType == 0) {
                skipRawVarint();
                return true;
            }
            if (tagWireType == 1) {
                skipRawBytes(8);
                return true;
            }
            if (tagWireType == 2) {
                skipRawBytes(readRawVarint32());
                return true;
            }
            if (tagWireType == 3) {
                skipMessage();
                checkLastTagWas(WireFormat.makeTag(WireFormat.getTagFieldNumber(i12), 4));
                return true;
            }
            if (tagWireType == 4) {
                return false;
            }
            if (tagWireType != 5) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            skipRawBytes(4);
            return true;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public void skipMessage() throws InvalidProtocolBufferException {
            int tag;
            do {
                tag = readTag();
                if (tag == 0) {
                    return;
                }
            } while (skipField(tag));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public void skipRawBytes(int i12) throws InvalidProtocolBufferException {
            int i13 = this.bufferSize;
            int i14 = this.pos;
            if (i12 > i13 - i14 || i12 < 0) {
                skipRawBytesSlowPath(i12);
            } else {
                this.pos = i14 + i12;
            }
        }

        private StreamDecoder(InputStream inputStream, int i12) {
            super();
            this.currentLimit = Integer.MAX_VALUE;
            this.refillCallback = null;
            Internal.checkNotNull(inputStream, "input");
            this.input = inputStream;
            this.buffer = new byte[i12];
            this.bufferSize = 0;
            this.pos = 0;
            this.totalBytesRetired = 0;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public void skipMessage(CodedOutputStream codedOutputStream) throws InvalidProtocolBufferException {
            int tag;
            do {
                tag = readTag();
                if (tag == 0) {
                    return;
                }
            } while (skipField(tag, codedOutputStream));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public <T extends MessageLite> T readGroup(int i12, Parser<T> parser, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            checkRecursionLimit();
            this.recursionDepth++;
            T partialFrom = parser.parsePartialFrom(this, extensionRegistryLite);
            checkLastTagWas(WireFormat.makeTag(i12, 4));
            this.recursionDepth--;
            return partialFrom;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public boolean skipField(int i12, CodedOutputStream codedOutputStream) throws InvalidProtocolBufferException {
            int tagWireType = WireFormat.getTagWireType(i12);
            if (tagWireType == 0) {
                long int64 = readInt64();
                codedOutputStream.writeUInt32NoTag(i12);
                codedOutputStream.writeUInt64NoTag(int64);
                return true;
            }
            if (tagWireType == 1) {
                long rawLittleEndian64 = readRawLittleEndian64();
                codedOutputStream.writeUInt32NoTag(i12);
                codedOutputStream.writeFixed64NoTag(rawLittleEndian64);
                return true;
            }
            if (tagWireType == 2) {
                ByteString bytes = readBytes();
                codedOutputStream.writeUInt32NoTag(i12);
                codedOutputStream.writeBytesNoTag(bytes);
                return true;
            }
            if (tagWireType == 3) {
                codedOutputStream.writeUInt32NoTag(i12);
                skipMessage(codedOutputStream);
                int iMakeTag = WireFormat.makeTag(WireFormat.getTagFieldNumber(i12), 4);
                checkLastTagWas(iMakeTag);
                codedOutputStream.writeUInt32NoTag(iMakeTag);
                return true;
            }
            if (tagWireType == 4) {
                return false;
            }
            if (tagWireType == 5) {
                int rawLittleEndian32 = readRawLittleEndian32();
                codedOutputStream.writeUInt32NoTag(i12);
                codedOutputStream.writeFixed32NoTag(rawLittleEndian32);
                return true;
            }
            throw InvalidProtocolBufferException.invalidWireType();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public <T extends MessageLite> T readMessage(Parser<T> parser, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            int rawVarint32 = readRawVarint32();
            checkRecursionLimit();
            int iPushLimit = pushLimit(rawVarint32);
            this.recursionDepth++;
            T partialFrom = parser.parsePartialFrom(this, extensionRegistryLite);
            checkLastTagWas(0);
            this.recursionDepth--;
            if (getBytesUntilLimit() == 0) {
                popLimit(iPushLimit);
                return partialFrom;
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public void enableAliasing(boolean z12) {
        }
    }

    public static final class UnsafeDirectNioDecoder extends CodedInputStream {
        private final long address;
        private final ByteBuffer buffer;
        private int bufferSizeAfterLimit;
        private int currentLimit;
        private boolean enableAliasing;
        private final boolean immutable;
        private int lastTag;
        private long limit;
        private long pos;
        private long startPos;

        private int bufferPos(long j12) {
            return (int) (j12 - this.address);
        }

        public static boolean isSupported() {
            return UnsafeUtil.hasUnsafeByteBufferOperations();
        }

        private void recomputeBufferSizeAfterLimit() {
            long j12 = this.limit + this.bufferSizeAfterLimit;
            this.limit = j12;
            int i12 = (int) (j12 - this.startPos);
            int i13 = this.currentLimit;
            if (i12 <= i13) {
                this.bufferSizeAfterLimit = 0;
                return;
            }
            int i14 = i12 - i13;
            this.bufferSizeAfterLimit = i14;
            this.limit = j12 - i14;
        }

        private int remaining() {
            return (int) (this.limit - this.pos);
        }

        private void skipRawVarint() throws InvalidProtocolBufferException {
            if (remaining() >= 10) {
                skipRawVarintFastPath();
            } else {
                skipRawVarintSlowPath();
            }
        }

        private void skipRawVarintFastPath() throws InvalidProtocolBufferException {
            for (int i12 = 0; i12 < 10; i12++) {
                long j12 = this.pos;
                this.pos = 1 + j12;
                if (UnsafeUtil.getByte(j12) >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        private void skipRawVarintSlowPath() throws InvalidProtocolBufferException {
            for (int i12 = 0; i12 < 10; i12++) {
                if (readRawByte() >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        private ByteBuffer slice(long j12, long j13) {
            int iPosition = this.buffer.position();
            int iLimit = this.buffer.limit();
            ByteBuffer byteBuffer = this.buffer;
            try {
                try {
                    byteBuffer.position(bufferPos(j12));
                    byteBuffer.limit(bufferPos(j13));
                    return this.buffer.slice();
                } catch (IllegalArgumentException e12) {
                    InvalidProtocolBufferException invalidProtocolBufferExceptionTruncatedMessage = InvalidProtocolBufferException.truncatedMessage();
                    invalidProtocolBufferExceptionTruncatedMessage.initCause(e12);
                    throw invalidProtocolBufferExceptionTruncatedMessage;
                }
            } finally {
                byteBuffer.position(iPosition);
                byteBuffer.limit(iLimit);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public void checkLastTagWas(int i12) throws InvalidProtocolBufferException {
            if (this.lastTag != i12) {
                throw InvalidProtocolBufferException.invalidEndTag();
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public void enableAliasing(boolean z12) {
            this.enableAliasing = z12;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public int getBytesUntilLimit() {
            int i12 = this.currentLimit;
            if (i12 == Integer.MAX_VALUE) {
                return -1;
            }
            return i12 - getTotalBytesRead();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public int getLastTag() {
            return this.lastTag;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public int getTotalBytesRead() {
            return (int) (this.pos - this.startPos);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public boolean isAtEnd() {
            return this.pos == this.limit;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public void popLimit(int i12) {
            this.currentLimit = i12;
            recomputeBufferSizeAfterLimit();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public int pushLimit(int i12) throws InvalidProtocolBufferException {
            if (i12 < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            int totalBytesRead = i12 + getTotalBytesRead();
            int i13 = this.currentLimit;
            if (totalBytesRead > i13) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            this.currentLimit = totalBytesRead;
            recomputeBufferSizeAfterLimit();
            return i13;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public boolean readBool() {
            return readRawVarint64() != 0;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public byte[] readByteArray() {
            return readRawBytes(readRawVarint32());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public ByteBuffer readByteBuffer() throws InvalidProtocolBufferException {
            int rawVarint32 = readRawVarint32();
            if (rawVarint32 <= 0 || rawVarint32 > remaining()) {
                if (rawVarint32 == 0) {
                    return Internal.EMPTY_BYTE_BUFFER;
                }
                if (rawVarint32 < 0) {
                    throw InvalidProtocolBufferException.negativeSize();
                }
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            if (this.immutable || !this.enableAliasing) {
                byte[] bArr = new byte[rawVarint32];
                long j12 = rawVarint32;
                UnsafeUtil.copyMemory(this.pos, bArr, 0L, j12);
                this.pos += j12;
                return ByteBuffer.wrap(bArr);
            }
            long j13 = this.pos;
            long j14 = rawVarint32;
            ByteBuffer byteBufferSlice = slice(j13, j13 + j14);
            this.pos += j14;
            return byteBufferSlice;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public ByteString readBytes() throws InvalidProtocolBufferException {
            int rawVarint32 = readRawVarint32();
            if (rawVarint32 <= 0 || rawVarint32 > remaining()) {
                if (rawVarint32 == 0) {
                    return ByteString.EMPTY;
                }
                if (rawVarint32 < 0) {
                    throw InvalidProtocolBufferException.negativeSize();
                }
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            if (this.immutable && this.enableAliasing) {
                long j12 = this.pos;
                long j13 = rawVarint32;
                ByteBuffer byteBufferSlice = slice(j12, j12 + j13);
                this.pos += j13;
                return ByteString.wrap(byteBufferSlice);
            }
            byte[] bArr = new byte[rawVarint32];
            long j14 = rawVarint32;
            UnsafeUtil.copyMemory(this.pos, bArr, 0L, j14);
            this.pos += j14;
            return ByteString.wrap(bArr);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public double readDouble() {
            return Double.longBitsToDouble(readRawLittleEndian64());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public int readEnum() {
            return readRawVarint32();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public int readFixed32() {
            return readRawLittleEndian32();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public long readFixed64() {
            return readRawLittleEndian64();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public float readFloat() {
            return Float.intBitsToFloat(readRawLittleEndian32());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public void readGroup(int i12, MessageLite.Builder builder, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            checkRecursionLimit();
            this.recursionDepth++;
            builder.mergeFrom(this, extensionRegistryLite);
            checkLastTagWas(WireFormat.makeTag(i12, 4));
            this.recursionDepth--;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public int readInt32() {
            return readRawVarint32();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public long readInt64() {
            return readRawVarint64();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public void readMessage(MessageLite.Builder builder, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            int rawVarint32 = readRawVarint32();
            checkRecursionLimit();
            int iPushLimit = pushLimit(rawVarint32);
            this.recursionDepth++;
            builder.mergeFrom(this, extensionRegistryLite);
            checkLastTagWas(0);
            this.recursionDepth--;
            if (getBytesUntilLimit() != 0) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            popLimit(iPushLimit);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public byte readRawByte() throws InvalidProtocolBufferException {
            long j12 = this.pos;
            if (j12 == this.limit) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            this.pos = 1 + j12;
            return UnsafeUtil.getByte(j12);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public byte[] readRawBytes(int i12) throws InvalidProtocolBufferException {
            if (i12 < 0 || i12 > remaining()) {
                if (i12 > 0) {
                    throw InvalidProtocolBufferException.truncatedMessage();
                }
                if (i12 == 0) {
                    return Internal.EMPTY_BYTE_ARRAY;
                }
                throw InvalidProtocolBufferException.negativeSize();
            }
            byte[] bArr = new byte[i12];
            long j12 = this.pos;
            long j13 = i12;
            slice(j12, j12 + j13).get(bArr);
            this.pos += j13;
            return bArr;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public int readRawLittleEndian32() throws InvalidProtocolBufferException {
            long j12 = this.pos;
            if (this.limit - j12 < 4) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            this.pos = 4 + j12;
            return ((UnsafeUtil.getByte(j12 + 3) & 255) << 24) | (UnsafeUtil.getByte(j12) & 255) | ((UnsafeUtil.getByte(1 + j12) & 255) << 8) | ((UnsafeUtil.getByte(2 + j12) & 255) << 16);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public long readRawLittleEndian64() throws InvalidProtocolBufferException {
            long j12 = this.pos;
            if (this.limit - j12 < 8) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            this.pos = 8 + j12;
            return ((UnsafeUtil.getByte(j12 + 7) & 255) << 56) | (UnsafeUtil.getByte(j12) & 255) | ((UnsafeUtil.getByte(1 + j12) & 255) << 8) | ((UnsafeUtil.getByte(2 + j12) & 255) << 16) | ((UnsafeUtil.getByte(3 + j12) & 255) << 24) | ((UnsafeUtil.getByte(4 + j12) & 255) << 32) | ((UnsafeUtil.getByte(5 + j12) & 255) << 40) | ((UnsafeUtil.getByte(6 + j12) & 255) << 48);
        }

        /* JADX WARN: Code restructure failed: missing block: B:33:0x008c, code lost:
        
            if (com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r3) < 0) goto L34;
         */
        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public int readRawVarint32() {
            /*
                r9 = this;
                long r0 = r9.pos
                long r2 = r9.limit
                int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r2 != 0) goto La
                goto L8e
            La:
                r2 = 1
                long r2 = r2 + r0
                byte r4 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r0)
                if (r4 < 0) goto L16
                r9.pos = r2
                return r4
            L16:
                long r5 = r9.limit
                long r5 = r5 - r2
                r7 = 9
                int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
                if (r5 >= 0) goto L21
                goto L8e
            L21:
                r5 = 2
                long r5 = r5 + r0
                byte r2 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r2)
                int r2 = r2 << 7
                r2 = r2 ^ r4
                if (r2 >= 0) goto L31
                r0 = r2 ^ (-128(0xffffffffffffff80, float:NaN))
                goto L98
            L31:
                r3 = 3
                long r3 = r3 + r0
                byte r5 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r5)
                int r5 = r5 << 14
                r2 = r2 ^ r5
                if (r2 < 0) goto L41
                r0 = r2 ^ 16256(0x3f80, float:2.278E-41)
            L3f:
                r5 = r3
                goto L98
            L41:
                r5 = 4
                long r5 = r5 + r0
                byte r3 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r3)
                int r3 = r3 << 21
                r2 = r2 ^ r3
                if (r2 >= 0) goto L52
                r0 = -2080896(0xffffffffffe03f80, float:NaN)
                r0 = r0 ^ r2
                goto L98
            L52:
                r3 = 5
                long r3 = r3 + r0
                byte r5 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r5)
                int r6 = r5 << 28
                r2 = r2 ^ r6
                r6 = 266354560(0xfe03f80, float:2.2112565E-29)
                r2 = r2 ^ r6
                if (r5 >= 0) goto L96
                r5 = 6
                long r5 = r5 + r0
                byte r3 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r3)
                if (r3 >= 0) goto L94
                r3 = 7
                long r3 = r3 + r0
                byte r5 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r5)
                if (r5 >= 0) goto L96
                r5 = 8
                long r5 = r5 + r0
                byte r3 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r3)
                if (r3 >= 0) goto L94
                long r3 = r0 + r7
                byte r5 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r5)
                if (r5 >= 0) goto L96
                r5 = 10
                long r5 = r5 + r0
                byte r0 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r3)
                if (r0 >= 0) goto L94
            L8e:
                long r0 = r9.readRawVarint64SlowPath()
                int r0 = (int) r0
                return r0
            L94:
                r0 = r2
                goto L98
            L96:
                r0 = r2
                goto L3f
            L98:
                r9.pos = r5
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.CodedInputStream.UnsafeDirectNioDecoder.readRawVarint32():int");
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public long readRawVarint64() {
            long j12;
            long j13;
            long j14;
            int i12;
            long j15 = this.pos;
            if (this.limit != j15) {
                long j16 = 1 + j15;
                byte b12 = UnsafeUtil.getByte(j15);
                if (b12 >= 0) {
                    this.pos = j16;
                    return b12;
                }
                if (this.limit - j16 >= 9) {
                    long j17 = 2 + j15;
                    int i13 = (UnsafeUtil.getByte(j16) << 7) ^ b12;
                    if (i13 >= 0) {
                        long j18 = 3 + j15;
                        int i14 = i13 ^ (UnsafeUtil.getByte(j17) << 14);
                        if (i14 >= 0) {
                            j12 = i14 ^ 16256;
                            j17 = j18;
                        } else {
                            j17 = 4 + j15;
                            int i15 = i14 ^ (UnsafeUtil.getByte(j18) << 21);
                            if (i15 < 0) {
                                i12 = (-2080896) ^ i15;
                            } else {
                                long j19 = 5 + j15;
                                long j22 = i15 ^ (UnsafeUtil.getByte(j17) << 28);
                                if (j22 >= 0) {
                                    j14 = 266354560;
                                } else {
                                    long j23 = 6 + j15;
                                    long j24 = j22 ^ (UnsafeUtil.getByte(j19) << 35);
                                    if (j24 < 0) {
                                        j13 = -34093383808L;
                                    } else {
                                        j19 = 7 + j15;
                                        j22 = j24 ^ (UnsafeUtil.getByte(j23) << 42);
                                        if (j22 >= 0) {
                                            j14 = 4363953127296L;
                                        } else {
                                            j23 = 8 + j15;
                                            j24 = j22 ^ (UnsafeUtil.getByte(j19) << 49);
                                            if (j24 < 0) {
                                                j13 = -558586000294016L;
                                            } else {
                                                long j25 = j15 + 9;
                                                long j26 = (j24 ^ (UnsafeUtil.getByte(j23) << 56)) ^ 71499008037633920L;
                                                if (j26 < 0) {
                                                    long j27 = j15 + 10;
                                                    if (UnsafeUtil.getByte(j25) >= 0) {
                                                        j17 = j27;
                                                        j12 = j26;
                                                    }
                                                } else {
                                                    j12 = j26;
                                                    j17 = j25;
                                                }
                                            }
                                        }
                                    }
                                    j12 = j13 ^ j24;
                                    j17 = j23;
                                }
                                j12 = j14 ^ j22;
                                j17 = j19;
                            }
                        }
                        this.pos = j17;
                        return j12;
                    }
                    i12 = i13 ^ (-128);
                    j12 = i12;
                    this.pos = j17;
                    return j12;
                }
            }
            return readRawVarint64SlowPath();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public long readRawVarint64SlowPath() throws InvalidProtocolBufferException {
            long j12 = 0;
            for (int i12 = 0; i12 < 64; i12 += 7) {
                j12 |= (r3 & 127) << i12;
                if ((readRawByte() & 128) == 0) {
                    return j12;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public int readSFixed32() {
            return readRawLittleEndian32();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public long readSFixed64() {
            return readRawLittleEndian64();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public int readSInt32() {
            return CodedInputStream.decodeZigZag32(readRawVarint32());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public long readSInt64() {
            return CodedInputStream.decodeZigZag64(readRawVarint64());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public String readString() throws InvalidProtocolBufferException {
            int rawVarint32 = readRawVarint32();
            if (rawVarint32 <= 0 || rawVarint32 > remaining()) {
                if (rawVarint32 == 0) {
                    return "";
                }
                if (rawVarint32 < 0) {
                    throw InvalidProtocolBufferException.negativeSize();
                }
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            byte[] bArr = new byte[rawVarint32];
            long j12 = rawVarint32;
            UnsafeUtil.copyMemory(this.pos, bArr, 0L, j12);
            String str = new String(bArr, Internal.UTF_8);
            this.pos += j12;
            return str;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public String readStringRequireUtf8() throws InvalidProtocolBufferException {
            int rawVarint32 = readRawVarint32();
            if (rawVarint32 > 0 && rawVarint32 <= remaining()) {
                String strDecodeUtf8 = Utf8.decodeUtf8(this.buffer, bufferPos(this.pos), rawVarint32);
                this.pos += rawVarint32;
                return strDecodeUtf8;
            }
            if (rawVarint32 == 0) {
                return "";
            }
            if (rawVarint32 <= 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public int readTag() throws InvalidProtocolBufferException {
            if (isAtEnd()) {
                this.lastTag = 0;
                return 0;
            }
            int rawVarint32 = readRawVarint32();
            this.lastTag = rawVarint32;
            if (WireFormat.getTagFieldNumber(rawVarint32) != 0) {
                return this.lastTag;
            }
            throw InvalidProtocolBufferException.invalidTag();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public int readUInt32() {
            return readRawVarint32();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public long readUInt64() {
            return readRawVarint64();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        @Deprecated
        public void readUnknownGroup(int i12, MessageLite.Builder builder) throws InvalidProtocolBufferException {
            readGroup(i12, builder, ExtensionRegistryLite.getEmptyRegistry());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public void resetSizeCounter() {
            this.startPos = this.pos;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public boolean skipField(int i12) throws InvalidProtocolBufferException {
            int tagWireType = WireFormat.getTagWireType(i12);
            if (tagWireType == 0) {
                skipRawVarint();
                return true;
            }
            if (tagWireType == 1) {
                skipRawBytes(8);
                return true;
            }
            if (tagWireType == 2) {
                skipRawBytes(readRawVarint32());
                return true;
            }
            if (tagWireType == 3) {
                skipMessage();
                checkLastTagWas(WireFormat.makeTag(WireFormat.getTagFieldNumber(i12), 4));
                return true;
            }
            if (tagWireType == 4) {
                return false;
            }
            if (tagWireType != 5) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            skipRawBytes(4);
            return true;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public void skipMessage() throws InvalidProtocolBufferException {
            int tag;
            do {
                tag = readTag();
                if (tag == 0) {
                    return;
                }
            } while (skipField(tag));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public void skipRawBytes(int i12) throws InvalidProtocolBufferException {
            if (i12 >= 0 && i12 <= remaining()) {
                this.pos += i12;
            } else {
                if (i12 >= 0) {
                    throw InvalidProtocolBufferException.truncatedMessage();
                }
                throw InvalidProtocolBufferException.negativeSize();
            }
        }

        private UnsafeDirectNioDecoder(ByteBuffer byteBuffer, boolean z12) {
            super();
            this.currentLimit = Integer.MAX_VALUE;
            this.buffer = byteBuffer;
            long jAddressOffset = UnsafeUtil.addressOffset(byteBuffer);
            this.address = jAddressOffset;
            this.limit = byteBuffer.limit() + jAddressOffset;
            long jPosition = jAddressOffset + byteBuffer.position();
            this.pos = jPosition;
            this.startPos = jPosition;
            this.immutable = z12;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public void skipMessage(CodedOutputStream codedOutputStream) throws InvalidProtocolBufferException {
            int tag;
            do {
                tag = readTag();
                if (tag == 0) {
                    return;
                }
            } while (skipField(tag, codedOutputStream));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public <T extends MessageLite> T readGroup(int i12, Parser<T> parser, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            checkRecursionLimit();
            this.recursionDepth++;
            T partialFrom = parser.parsePartialFrom(this, extensionRegistryLite);
            checkLastTagWas(WireFormat.makeTag(i12, 4));
            this.recursionDepth--;
            return partialFrom;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public boolean skipField(int i12, CodedOutputStream codedOutputStream) throws InvalidProtocolBufferException {
            int tagWireType = WireFormat.getTagWireType(i12);
            if (tagWireType == 0) {
                long int64 = readInt64();
                codedOutputStream.writeUInt32NoTag(i12);
                codedOutputStream.writeUInt64NoTag(int64);
                return true;
            }
            if (tagWireType == 1) {
                long rawLittleEndian64 = readRawLittleEndian64();
                codedOutputStream.writeUInt32NoTag(i12);
                codedOutputStream.writeFixed64NoTag(rawLittleEndian64);
                return true;
            }
            if (tagWireType == 2) {
                ByteString bytes = readBytes();
                codedOutputStream.writeUInt32NoTag(i12);
                codedOutputStream.writeBytesNoTag(bytes);
                return true;
            }
            if (tagWireType == 3) {
                codedOutputStream.writeUInt32NoTag(i12);
                skipMessage(codedOutputStream);
                int iMakeTag = WireFormat.makeTag(WireFormat.getTagFieldNumber(i12), 4);
                checkLastTagWas(iMakeTag);
                codedOutputStream.writeUInt32NoTag(iMakeTag);
                return true;
            }
            if (tagWireType == 4) {
                return false;
            }
            if (tagWireType == 5) {
                int rawLittleEndian32 = readRawLittleEndian32();
                codedOutputStream.writeUInt32NoTag(i12);
                codedOutputStream.writeFixed32NoTag(rawLittleEndian32);
                return true;
            }
            throw InvalidProtocolBufferException.invalidWireType();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedInputStream
        public <T extends MessageLite> T readMessage(Parser<T> parser, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            int rawVarint32 = readRawVarint32();
            checkRecursionLimit();
            int iPushLimit = pushLimit(rawVarint32);
            this.recursionDepth++;
            T partialFrom = parser.parsePartialFrom(this, extensionRegistryLite);
            checkLastTagWas(0);
            this.recursionDepth--;
            if (getBytesUntilLimit() == 0) {
                popLimit(iPushLimit);
                return partialFrom;
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }
    }

    public static int decodeZigZag32(int i12) {
        return (-(i12 & 1)) ^ (i12 >>> 1);
    }

    public static long decodeZigZag64(long j12) {
        return (-(j12 & 1)) ^ (j12 >>> 1);
    }

    public static CodedInputStream newInstance(InputStream inputStream) {
        return newInstance(inputStream, 4096);
    }

    public static int readRawVarint32(int i12, InputStream inputStream) throws IOException {
        if ((i12 & 128) == 0) {
            return i12;
        }
        int i13 = i12 & 127;
        int i14 = 7;
        while (i14 < 32) {
            int i15 = inputStream.read();
            if (i15 == -1) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            i13 |= (i15 & 127) << i14;
            if ((i15 & 128) == 0) {
                return i13;
            }
            i14 += 7;
        }
        while (i14 < 64) {
            int i16 = inputStream.read();
            if (i16 == -1) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            if ((i16 & 128) == 0) {
                return i13;
            }
            i14 += 7;
        }
        throw InvalidProtocolBufferException.malformedVarint();
    }

    public abstract void checkLastTagWas(int i12);

    public void checkRecursionLimit() throws InvalidProtocolBufferException {
        if (this.recursionDepth >= this.recursionLimit) {
            throw InvalidProtocolBufferException.recursionLimitExceeded();
        }
    }

    public final void discardUnknownFields() {
        this.shouldDiscardUnknownFields = true;
    }

    public abstract void enableAliasing(boolean z12);

    public abstract int getBytesUntilLimit();

    public abstract int getLastTag();

    public abstract int getTotalBytesRead();

    public abstract boolean isAtEnd();

    public abstract void popLimit(int i12);

    public abstract int pushLimit(int i12);

    public abstract boolean readBool();

    public abstract byte[] readByteArray();

    public abstract ByteBuffer readByteBuffer();

    public abstract ByteString readBytes();

    public abstract double readDouble();

    public abstract int readEnum();

    public abstract int readFixed32();

    public abstract long readFixed64();

    public abstract float readFloat();

    public abstract <T extends MessageLite> T readGroup(int i12, Parser<T> parser, ExtensionRegistryLite extensionRegistryLite);

    public abstract void readGroup(int i12, MessageLite.Builder builder, ExtensionRegistryLite extensionRegistryLite);

    public abstract int readInt32();

    public abstract long readInt64();

    public abstract <T extends MessageLite> T readMessage(Parser<T> parser, ExtensionRegistryLite extensionRegistryLite);

    public abstract void readMessage(MessageLite.Builder builder, ExtensionRegistryLite extensionRegistryLite);

    public abstract byte readRawByte();

    public abstract byte[] readRawBytes(int i12);

    public abstract int readRawLittleEndian32();

    public abstract long readRawLittleEndian64();

    public abstract int readRawVarint32();

    public abstract long readRawVarint64();

    public abstract long readRawVarint64SlowPath();

    public abstract int readSFixed32();

    public abstract long readSFixed64();

    public abstract int readSInt32();

    public abstract long readSInt64();

    public abstract String readString();

    public abstract String readStringRequireUtf8();

    public abstract int readTag();

    public abstract int readUInt32();

    public abstract long readUInt64();

    @Deprecated
    public abstract void readUnknownGroup(int i12, MessageLite.Builder builder);

    public abstract void resetSizeCounter();

    public final int setRecursionLimit(int i12) {
        if (i12 < 0) {
            throw new IllegalArgumentException(c.g(i12, "Recursion limit cannot be negative: "));
        }
        int i13 = this.recursionLimit;
        this.recursionLimit = i12;
        return i13;
    }

    public final int setSizeLimit(int i12) {
        if (i12 < 0) {
            throw new IllegalArgumentException(c.g(i12, "Size limit cannot be negative: "));
        }
        int i13 = this.sizeLimit;
        this.sizeLimit = i12;
        return i13;
    }

    public final boolean shouldDiscardUnknownFields() {
        return this.shouldDiscardUnknownFields;
    }

    public abstract boolean skipField(int i12);

    @Deprecated
    public abstract boolean skipField(int i12, CodedOutputStream codedOutputStream);

    public abstract void skipMessage();

    public abstract void skipMessage(CodedOutputStream codedOutputStream);

    public abstract void skipRawBytes(int i12);

    public final void unsetDiscardUnknownFields() {
        this.shouldDiscardUnknownFields = false;
    }

    private CodedInputStream() {
        this.recursionLimit = defaultRecursionLimit;
        this.sizeLimit = Integer.MAX_VALUE;
        this.shouldDiscardUnknownFields = false;
    }

    public static CodedInputStream newInstance(InputStream inputStream, int i12) {
        if (i12 > 0) {
            return inputStream == null ? newInstance(Internal.EMPTY_BYTE_ARRAY) : new StreamDecoder(inputStream, i12);
        }
        throw new IllegalArgumentException("bufferSize must be > 0");
    }

    public static CodedInputStream newInstance(Iterable<ByteBuffer> iterable) {
        if (!UnsafeDirectNioDecoder.isSupported()) {
            return newInstance(new IterableByteBufferInputStream(iterable));
        }
        return newInstance(iterable, false);
    }

    public static int readRawVarint32(InputStream inputStream) throws IOException {
        int i12 = inputStream.read();
        if (i12 != -1) {
            return readRawVarint32(i12, inputStream);
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    public static CodedInputStream newInstance(Iterable<ByteBuffer> iterable, boolean z12) {
        int i12 = 0;
        int iRemaining = 0;
        for (ByteBuffer byteBuffer : iterable) {
            iRemaining += byteBuffer.remaining();
            if (byteBuffer.hasArray()) {
                i12 |= 1;
            } else {
                i12 = byteBuffer.isDirect() ? i12 | 2 : i12 | 4;
            }
        }
        if (i12 == 2) {
            return new IterableDirectByteBufferDecoder(iterable, iRemaining, z12);
        }
        return newInstance(new IterableByteBufferInputStream(iterable));
    }

    public static CodedInputStream newInstance(byte[] bArr) {
        return newInstance(bArr, 0, bArr.length);
    }

    public static CodedInputStream newInstance(byte[] bArr, int i12, int i13) {
        return newInstance(bArr, i12, i13, false);
    }

    public static CodedInputStream newInstance(byte[] bArr, int i12, int i13, boolean z12) {
        ArrayDecoder arrayDecoder = new ArrayDecoder(bArr, i12, i13, z12);
        try {
            arrayDecoder.pushLimit(i13);
            return arrayDecoder;
        } catch (InvalidProtocolBufferException e12) {
            throw new IllegalArgumentException(e12);
        }
    }

    public static CodedInputStream newInstance(ByteBuffer byteBuffer) {
        return newInstance(byteBuffer, false);
    }

    public static CodedInputStream newInstance(ByteBuffer byteBuffer, boolean z12) {
        if (byteBuffer.hasArray()) {
            return newInstance(byteBuffer.array(), byteBuffer.position() + byteBuffer.arrayOffset(), byteBuffer.remaining(), z12);
        }
        if (byteBuffer.isDirect() && UnsafeDirectNioDecoder.isSupported()) {
            return new UnsafeDirectNioDecoder(byteBuffer, z12);
        }
        int iRemaining = byteBuffer.remaining();
        byte[] bArr = new byte[iRemaining];
        byteBuffer.duplicate().get(bArr);
        return newInstance(bArr, 0, iRemaining, true);
    }
}
