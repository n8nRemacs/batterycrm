package com.google.crypto.tink.shaded.protobuf;

import androidx.camera.camera2.internal.G;
import com.google.crypto.tink.shaded.protobuf.Utf8;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes6.dex */
public abstract class CodedOutputStream extends ByteOutput {
    public static final int DEFAULT_BUFFER_SIZE = 4096;

    @Deprecated
    public static final int LITTLE_ENDIAN_32_SIZE = 4;
    private boolean serializationDeterministic;
    CodedOutputStreamWriter wrapper;
    private static final Logger logger = Logger.getLogger(CodedOutputStream.class.getName());
    private static final boolean HAS_UNSAFE_ARRAY_OPERATIONS = UnsafeUtil.hasUnsafeArrayOperations();

    public static abstract class AbstractBufferedEncoder extends CodedOutputStream {
        final byte[] buffer;
        final int limit;
        int position;
        int totalBytesWritten;

        public AbstractBufferedEncoder(int i12) {
            super();
            if (i12 < 0) {
                throw new IllegalArgumentException("bufferSize must be >= 0");
            }
            byte[] bArr = new byte[Math.max(i12, 20)];
            this.buffer = bArr;
            this.limit = bArr.length;
        }

        public final void buffer(byte b12) {
            byte[] bArr = this.buffer;
            int i12 = this.position;
            this.position = i12 + 1;
            bArr[i12] = b12;
            this.totalBytesWritten++;
        }

        public final void bufferFixed32NoTag(int i12) {
            byte[] bArr = this.buffer;
            int i13 = this.position;
            int i14 = i13 + 1;
            this.position = i14;
            bArr[i13] = (byte) (i12 & 255);
            int i15 = i13 + 2;
            this.position = i15;
            bArr[i14] = (byte) ((i12 >> 8) & 255);
            int i16 = i13 + 3;
            this.position = i16;
            bArr[i15] = (byte) ((i12 >> 16) & 255);
            this.position = i13 + 4;
            bArr[i16] = (byte) ((i12 >> 24) & 255);
            this.totalBytesWritten += 4;
        }

        public final void bufferFixed64NoTag(long j12) {
            byte[] bArr = this.buffer;
            int i12 = this.position;
            int i13 = i12 + 1;
            this.position = i13;
            bArr[i12] = (byte) (j12 & 255);
            int i14 = i12 + 2;
            this.position = i14;
            bArr[i13] = (byte) ((j12 >> 8) & 255);
            int i15 = i12 + 3;
            this.position = i15;
            bArr[i14] = (byte) ((j12 >> 16) & 255);
            int i16 = i12 + 4;
            this.position = i16;
            bArr[i15] = (byte) (255 & (j12 >> 24));
            int i17 = i12 + 5;
            this.position = i17;
            bArr[i16] = (byte) (((int) (j12 >> 32)) & 255);
            int i18 = i12 + 6;
            this.position = i18;
            bArr[i17] = (byte) (((int) (j12 >> 40)) & 255);
            int i19 = i12 + 7;
            this.position = i19;
            bArr[i18] = (byte) (((int) (j12 >> 48)) & 255);
            this.position = i12 + 8;
            bArr[i19] = (byte) (((int) (j12 >> 56)) & 255);
            this.totalBytesWritten += 8;
        }

        public final void bufferInt32NoTag(int i12) {
            if (i12 >= 0) {
                bufferUInt32NoTag(i12);
            } else {
                bufferUInt64NoTag(i12);
            }
        }

        public final void bufferTag(int i12, int i13) {
            bufferUInt32NoTag(WireFormat.makeTag(i12, i13));
        }

        public final void bufferUInt32NoTag(int i12) {
            if (!CodedOutputStream.HAS_UNSAFE_ARRAY_OPERATIONS) {
                while ((i12 & (-128)) != 0) {
                    byte[] bArr = this.buffer;
                    int i13 = this.position;
                    this.position = i13 + 1;
                    bArr[i13] = (byte) ((i12 & 127) | 128);
                    this.totalBytesWritten++;
                    i12 >>>= 7;
                }
                byte[] bArr2 = this.buffer;
                int i14 = this.position;
                this.position = i14 + 1;
                bArr2[i14] = (byte) i12;
                this.totalBytesWritten++;
                return;
            }
            long j12 = this.position;
            while ((i12 & (-128)) != 0) {
                byte[] bArr3 = this.buffer;
                int i15 = this.position;
                this.position = i15 + 1;
                UnsafeUtil.putByte(bArr3, i15, (byte) ((i12 & 127) | 128));
                i12 >>>= 7;
            }
            byte[] bArr4 = this.buffer;
            int i16 = this.position;
            this.position = i16 + 1;
            UnsafeUtil.putByte(bArr4, i16, (byte) i12);
            this.totalBytesWritten += (int) (this.position - j12);
        }

        public final void bufferUInt64NoTag(long j12) {
            if (!CodedOutputStream.HAS_UNSAFE_ARRAY_OPERATIONS) {
                while ((j12 & (-128)) != 0) {
                    byte[] bArr = this.buffer;
                    int i12 = this.position;
                    this.position = i12 + 1;
                    bArr[i12] = (byte) ((((int) j12) & 127) | 128);
                    this.totalBytesWritten++;
                    j12 >>>= 7;
                }
                byte[] bArr2 = this.buffer;
                int i13 = this.position;
                this.position = i13 + 1;
                bArr2[i13] = (byte) j12;
                this.totalBytesWritten++;
                return;
            }
            long j13 = this.position;
            while ((j12 & (-128)) != 0) {
                byte[] bArr3 = this.buffer;
                int i14 = this.position;
                this.position = i14 + 1;
                UnsafeUtil.putByte(bArr3, i14, (byte) ((((int) j12) & 127) | 128));
                j12 >>>= 7;
            }
            byte[] bArr4 = this.buffer;
            int i15 = this.position;
            this.position = i15 + 1;
            UnsafeUtil.putByte(bArr4, i15, (byte) j12);
            this.totalBytesWritten += (int) (this.position - j13);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final int getTotalBytesWritten() {
            return this.totalBytesWritten;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final int spaceLeft() {
            throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array or ByteBuffer.");
        }
    }

    public static class ArrayEncoder extends CodedOutputStream {
        private final byte[] buffer;
        private final int limit;
        private final int offset;
        private int position;

        public ArrayEncoder(byte[] bArr, int i12, int i13) {
            super();
            if (bArr == null) {
                throw new NullPointerException("buffer");
            }
            int i14 = i12 + i13;
            if ((i12 | i13 | (bArr.length - i14)) < 0) {
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), Integer.valueOf(i12), Integer.valueOf(i13)));
            }
            this.buffer = bArr;
            this.offset = i12;
            this.position = i12;
            this.limit = i14;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final int getTotalBytesWritten() {
            return this.position - this.offset;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final int spaceLeft() {
            return this.limit - this.position;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream, com.google.crypto.tink.shaded.protobuf.ByteOutput
        public final void write(byte b12) throws OutOfSpaceException {
            try {
                byte[] bArr = this.buffer;
                int i12 = this.position;
                this.position = i12 + 1;
                bArr[i12] = b12;
            } catch (IndexOutOfBoundsException e12) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.position), Integer.valueOf(this.limit), 1), e12);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void writeBool(int i12, boolean z12) throws OutOfSpaceException {
            writeTag(i12, 0);
            write(z12 ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void writeByteArray(int i12, byte[] bArr) throws OutOfSpaceException {
            writeByteArray(i12, bArr, 0, bArr.length);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void writeByteArrayNoTag(byte[] bArr, int i12, int i13) throws OutOfSpaceException {
            writeUInt32NoTag(i13);
            write(bArr, i12, i13);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void writeByteBuffer(int i12, ByteBuffer byteBuffer) throws OutOfSpaceException {
            writeTag(i12, 2);
            writeUInt32NoTag(byteBuffer.capacity());
            writeRawBytes(byteBuffer);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void writeBytes(int i12, ByteString byteString) throws OutOfSpaceException {
            writeTag(i12, 2);
            writeBytesNoTag(byteString);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void writeBytesNoTag(ByteString byteString) throws OutOfSpaceException {
            writeUInt32NoTag(byteString.size());
            byteString.writeTo(this);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void writeFixed32(int i12, int i13) throws OutOfSpaceException {
            writeTag(i12, 5);
            writeFixed32NoTag(i13);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void writeFixed32NoTag(int i12) throws OutOfSpaceException {
            try {
                byte[] bArr = this.buffer;
                int i13 = this.position;
                int i14 = i13 + 1;
                this.position = i14;
                bArr[i13] = (byte) (i12 & 255);
                int i15 = i13 + 2;
                this.position = i15;
                bArr[i14] = (byte) ((i12 >> 8) & 255);
                int i16 = i13 + 3;
                this.position = i16;
                bArr[i15] = (byte) ((i12 >> 16) & 255);
                this.position = i13 + 4;
                bArr[i16] = (byte) ((i12 >> 24) & 255);
            } catch (IndexOutOfBoundsException e12) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.position), Integer.valueOf(this.limit), 1), e12);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void writeFixed64(int i12, long j12) throws OutOfSpaceException {
            writeTag(i12, 1);
            writeFixed64NoTag(j12);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void writeFixed64NoTag(long j12) throws OutOfSpaceException {
            try {
                byte[] bArr = this.buffer;
                int i12 = this.position;
                int i13 = i12 + 1;
                this.position = i13;
                bArr[i12] = (byte) (((int) j12) & 255);
                int i14 = i12 + 2;
                this.position = i14;
                bArr[i13] = (byte) (((int) (j12 >> 8)) & 255);
                int i15 = i12 + 3;
                this.position = i15;
                bArr[i14] = (byte) (((int) (j12 >> 16)) & 255);
                int i16 = i12 + 4;
                this.position = i16;
                bArr[i15] = (byte) (((int) (j12 >> 24)) & 255);
                int i17 = i12 + 5;
                this.position = i17;
                bArr[i16] = (byte) (((int) (j12 >> 32)) & 255);
                int i18 = i12 + 6;
                this.position = i18;
                bArr[i17] = (byte) (((int) (j12 >> 40)) & 255);
                int i19 = i12 + 7;
                this.position = i19;
                bArr[i18] = (byte) (((int) (j12 >> 48)) & 255);
                this.position = i12 + 8;
                bArr[i19] = (byte) (((int) (j12 >> 56)) & 255);
            } catch (IndexOutOfBoundsException e12) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.position), Integer.valueOf(this.limit), 1), e12);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void writeInt32(int i12, int i13) throws OutOfSpaceException {
            writeTag(i12, 0);
            writeInt32NoTag(i13);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void writeInt32NoTag(int i12) throws OutOfSpaceException {
            if (i12 >= 0) {
                writeUInt32NoTag(i12);
            } else {
                writeUInt64NoTag(i12);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream, com.google.crypto.tink.shaded.protobuf.ByteOutput
        public final void writeLazy(byte[] bArr, int i12, int i13) throws OutOfSpaceException {
            write(bArr, i12, i13);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void writeMessage(int i12, MessageLite messageLite) throws OutOfSpaceException {
            writeTag(i12, 2);
            writeMessageNoTag(messageLite);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void writeMessageNoTag(MessageLite messageLite) throws OutOfSpaceException {
            writeUInt32NoTag(messageLite.getSerializedSize());
            messageLite.writeTo(this);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void writeMessageSetExtension(int i12, MessageLite messageLite) throws OutOfSpaceException {
            writeTag(1, 3);
            writeUInt32(2, i12);
            writeMessage(3, messageLite);
            writeTag(1, 4);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void writeRawBytes(ByteBuffer byteBuffer) throws OutOfSpaceException {
            if (byteBuffer.hasArray()) {
                write(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.capacity());
                return;
            }
            ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
            byteBufferDuplicate.clear();
            write(byteBufferDuplicate);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void writeRawMessageSetExtension(int i12, ByteString byteString) throws OutOfSpaceException {
            writeTag(1, 3);
            writeUInt32(2, i12);
            writeBytes(3, byteString);
            writeTag(1, 4);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void writeString(int i12, String str) throws OutOfSpaceException {
            writeTag(i12, 2);
            writeStringNoTag(str);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void writeStringNoTag(String str) throws OutOfSpaceException {
            int i12 = this.position;
            try {
                int iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(str.length() * 3);
                int iComputeUInt32SizeNoTag2 = CodedOutputStream.computeUInt32SizeNoTag(str.length());
                if (iComputeUInt32SizeNoTag2 == iComputeUInt32SizeNoTag) {
                    int i13 = i12 + iComputeUInt32SizeNoTag2;
                    this.position = i13;
                    int iEncode = Utf8.encode(str, this.buffer, i13, spaceLeft());
                    this.position = i12;
                    writeUInt32NoTag((iEncode - i12) - iComputeUInt32SizeNoTag2);
                    this.position = iEncode;
                } else {
                    writeUInt32NoTag(Utf8.encodedLength(str));
                    this.position = Utf8.encode(str, this.buffer, this.position, spaceLeft());
                }
            } catch (Utf8.UnpairedSurrogateException e12) {
                this.position = i12;
                inefficientWriteStringNoTag(str, e12);
            } catch (IndexOutOfBoundsException e13) {
                throw new OutOfSpaceException(e13);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void writeTag(int i12, int i13) throws OutOfSpaceException {
            writeUInt32NoTag(WireFormat.makeTag(i12, i13));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void writeUInt32(int i12, int i13) throws OutOfSpaceException {
            writeTag(i12, 0);
            writeUInt32NoTag(i13);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void writeUInt32NoTag(int i12) throws OutOfSpaceException {
            while ((i12 & (-128)) != 0) {
                try {
                    byte[] bArr = this.buffer;
                    int i13 = this.position;
                    this.position = i13 + 1;
                    bArr[i13] = (byte) ((i12 & 127) | 128);
                    i12 >>>= 7;
                } catch (IndexOutOfBoundsException e12) {
                    throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.position), Integer.valueOf(this.limit), 1), e12);
                }
            }
            byte[] bArr2 = this.buffer;
            int i14 = this.position;
            this.position = i14 + 1;
            bArr2[i14] = (byte) i12;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void writeUInt64(int i12, long j12) throws OutOfSpaceException {
            writeTag(i12, 0);
            writeUInt64NoTag(j12);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void writeUInt64NoTag(long j12) throws OutOfSpaceException {
            if (CodedOutputStream.HAS_UNSAFE_ARRAY_OPERATIONS && spaceLeft() >= 10) {
                while ((j12 & (-128)) != 0) {
                    byte[] bArr = this.buffer;
                    int i12 = this.position;
                    this.position = i12 + 1;
                    UnsafeUtil.putByte(bArr, i12, (byte) ((((int) j12) & 127) | 128));
                    j12 >>>= 7;
                }
                byte[] bArr2 = this.buffer;
                int i13 = this.position;
                this.position = i13 + 1;
                UnsafeUtil.putByte(bArr2, i13, (byte) j12);
                return;
            }
            while ((j12 & (-128)) != 0) {
                try {
                    byte[] bArr3 = this.buffer;
                    int i14 = this.position;
                    this.position = i14 + 1;
                    bArr3[i14] = (byte) ((((int) j12) & 127) | 128);
                    j12 >>>= 7;
                } catch (IndexOutOfBoundsException e12) {
                    throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.position), Integer.valueOf(this.limit), 1), e12);
                }
            }
            byte[] bArr4 = this.buffer;
            int i15 = this.position;
            this.position = i15 + 1;
            bArr4[i15] = (byte) j12;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void writeByteArray(int i12, byte[] bArr, int i13, int i14) throws OutOfSpaceException {
            writeTag(i12, 2);
            writeByteArrayNoTag(bArr, i13, i14);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream, com.google.crypto.tink.shaded.protobuf.ByteOutput
        public final void writeLazy(ByteBuffer byteBuffer) throws OutOfSpaceException {
            write(byteBuffer);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void writeMessage(int i12, MessageLite messageLite, Schema schema) throws OutOfSpaceException {
            writeTag(i12, 2);
            writeUInt32NoTag(((AbstractMessageLite) messageLite).getSerializedSize(schema));
            schema.writeTo(messageLite, this.wrapper);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void writeMessageNoTag(MessageLite messageLite, Schema schema) throws OutOfSpaceException {
            writeUInt32NoTag(((AbstractMessageLite) messageLite).getSerializedSize(schema));
            schema.writeTo(messageLite, this.wrapper);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream, com.google.crypto.tink.shaded.protobuf.ByteOutput
        public final void write(byte[] bArr, int i12, int i13) throws OutOfSpaceException {
            try {
                System.arraycopy(bArr, i12, this.buffer, this.position, i13);
                this.position += i13;
            } catch (IndexOutOfBoundsException e12) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.position), Integer.valueOf(this.limit), Integer.valueOf(i13)), e12);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream, com.google.crypto.tink.shaded.protobuf.ByteOutput
        public final void write(ByteBuffer byteBuffer) throws OutOfSpaceException {
            int iRemaining = byteBuffer.remaining();
            try {
                byteBuffer.get(this.buffer, this.position, iRemaining);
                this.position += iRemaining;
            } catch (IndexOutOfBoundsException e12) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.position), Integer.valueOf(this.limit), Integer.valueOf(iRemaining)), e12);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void flush() {
        }
    }

    public static final class ByteOutputEncoder extends AbstractBufferedEncoder {
        private final ByteOutput out;

        public ByteOutputEncoder(ByteOutput byteOutput, int i12) {
            super(i12);
            if (byteOutput == null) {
                throw new NullPointerException("out");
            }
            this.out = byteOutput;
        }

        private void doFlush() {
            this.out.write(this.buffer, 0, this.position);
            this.position = 0;
        }

        private void flushIfNotAvailable(int i12) {
            if (this.limit - this.position < i12) {
                doFlush();
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void flush() {
            if (this.position > 0) {
                doFlush();
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream, com.google.crypto.tink.shaded.protobuf.ByteOutput
        public void write(byte b12) {
            if (this.position == this.limit) {
                doFlush();
            }
            buffer(b12);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeBool(int i12, boolean z12) {
            flushIfNotAvailable(11);
            bufferTag(i12, 0);
            buffer(z12 ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeByteArray(int i12, byte[] bArr) {
            writeByteArray(i12, bArr, 0, bArr.length);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeByteArrayNoTag(byte[] bArr, int i12, int i13) {
            writeUInt32NoTag(i13);
            write(bArr, i12, i13);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeByteBuffer(int i12, ByteBuffer byteBuffer) {
            writeTag(i12, 2);
            writeUInt32NoTag(byteBuffer.capacity());
            writeRawBytes(byteBuffer);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeBytes(int i12, ByteString byteString) {
            writeTag(i12, 2);
            writeBytesNoTag(byteString);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeBytesNoTag(ByteString byteString) {
            writeUInt32NoTag(byteString.size());
            byteString.writeTo(this);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeFixed32(int i12, int i13) {
            flushIfNotAvailable(14);
            bufferTag(i12, 5);
            bufferFixed32NoTag(i13);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeFixed32NoTag(int i12) {
            flushIfNotAvailable(4);
            bufferFixed32NoTag(i12);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeFixed64(int i12, long j12) {
            flushIfNotAvailable(18);
            bufferTag(i12, 1);
            bufferFixed64NoTag(j12);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeFixed64NoTag(long j12) {
            flushIfNotAvailable(8);
            bufferFixed64NoTag(j12);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeInt32(int i12, int i13) {
            flushIfNotAvailable(20);
            bufferTag(i12, 0);
            bufferInt32NoTag(i13);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeInt32NoTag(int i12) {
            if (i12 >= 0) {
                writeUInt32NoTag(i12);
            } else {
                writeUInt64NoTag(i12);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream, com.google.crypto.tink.shaded.protobuf.ByteOutput
        public void writeLazy(byte[] bArr, int i12, int i13) {
            flush();
            this.out.writeLazy(bArr, i12, i13);
            this.totalBytesWritten += i13;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeMessage(int i12, MessageLite messageLite) {
            writeTag(i12, 2);
            writeMessageNoTag(messageLite);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeMessageNoTag(MessageLite messageLite) {
            writeUInt32NoTag(messageLite.getSerializedSize());
            messageLite.writeTo(this);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeMessageSetExtension(int i12, MessageLite messageLite) {
            writeTag(1, 3);
            writeUInt32(2, i12);
            writeMessage(3, messageLite);
            writeTag(1, 4);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeRawBytes(ByteBuffer byteBuffer) {
            if (byteBuffer.hasArray()) {
                write(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.capacity());
                return;
            }
            ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
            byteBufferDuplicate.clear();
            write(byteBufferDuplicate);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeRawMessageSetExtension(int i12, ByteString byteString) {
            writeTag(1, 3);
            writeUInt32(2, i12);
            writeBytes(3, byteString);
            writeTag(1, 4);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeString(int i12, String str) throws OutOfSpaceException {
            writeTag(i12, 2);
            writeStringNoTag(str);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeStringNoTag(String str) throws OutOfSpaceException {
            int length = str.length() * 3;
            int iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(length);
            int i12 = iComputeUInt32SizeNoTag + length;
            int i13 = this.limit;
            if (i12 > i13) {
                byte[] bArr = new byte[length];
                int iEncode = Utf8.encode(str, bArr, 0, length);
                writeUInt32NoTag(iEncode);
                writeLazy(bArr, 0, iEncode);
                return;
            }
            if (i12 > i13 - this.position) {
                doFlush();
            }
            int i14 = this.position;
            try {
                int iComputeUInt32SizeNoTag2 = CodedOutputStream.computeUInt32SizeNoTag(str.length());
                if (iComputeUInt32SizeNoTag2 == iComputeUInt32SizeNoTag) {
                    int i15 = i14 + iComputeUInt32SizeNoTag2;
                    this.position = i15;
                    int iEncode2 = Utf8.encode(str, this.buffer, i15, this.limit - i15);
                    this.position = i14;
                    int i16 = (iEncode2 - i14) - iComputeUInt32SizeNoTag2;
                    bufferUInt32NoTag(i16);
                    this.position = iEncode2;
                    this.totalBytesWritten += i16;
                } else {
                    int iEncodedLength = Utf8.encodedLength(str);
                    bufferUInt32NoTag(iEncodedLength);
                    this.position = Utf8.encode(str, this.buffer, this.position, iEncodedLength);
                    this.totalBytesWritten += iEncodedLength;
                }
            } catch (Utf8.UnpairedSurrogateException e12) {
                this.totalBytesWritten -= this.position - i14;
                this.position = i14;
                inefficientWriteStringNoTag(str, e12);
            } catch (IndexOutOfBoundsException e13) {
                throw new OutOfSpaceException(e13);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeTag(int i12, int i13) {
            writeUInt32NoTag(WireFormat.makeTag(i12, i13));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeUInt32(int i12, int i13) {
            flushIfNotAvailable(20);
            bufferTag(i12, 0);
            bufferUInt32NoTag(i13);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeUInt32NoTag(int i12) {
            flushIfNotAvailable(5);
            bufferUInt32NoTag(i12);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeUInt64(int i12, long j12) {
            flushIfNotAvailable(20);
            bufferTag(i12, 0);
            bufferUInt64NoTag(j12);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeUInt64NoTag(long j12) {
            flushIfNotAvailable(10);
            bufferUInt64NoTag(j12);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeByteArray(int i12, byte[] bArr, int i13, int i14) {
            writeTag(i12, 2);
            writeByteArrayNoTag(bArr, i13, i14);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeMessage(int i12, MessageLite messageLite, Schema schema) {
            writeTag(i12, 2);
            writeMessageNoTag(messageLite, schema);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeMessageNoTag(MessageLite messageLite, Schema schema) {
            writeUInt32NoTag(((AbstractMessageLite) messageLite).getSerializedSize(schema));
            schema.writeTo(messageLite, this.wrapper);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream, com.google.crypto.tink.shaded.protobuf.ByteOutput
        public void write(byte[] bArr, int i12, int i13) {
            flush();
            this.out.write(bArr, i12, i13);
            this.totalBytesWritten += i13;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream, com.google.crypto.tink.shaded.protobuf.ByteOutput
        public void writeLazy(ByteBuffer byteBuffer) {
            flush();
            int iRemaining = byteBuffer.remaining();
            this.out.writeLazy(byteBuffer);
            this.totalBytesWritten += iRemaining;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream, com.google.crypto.tink.shaded.protobuf.ByteOutput
        public void write(ByteBuffer byteBuffer) {
            flush();
            int iRemaining = byteBuffer.remaining();
            this.out.write(byteBuffer);
            this.totalBytesWritten += iRemaining;
        }
    }

    public static final class HeapNioEncoder extends ArrayEncoder {
        private final ByteBuffer byteBuffer;
        private int initialPosition;

        public HeapNioEncoder(ByteBuffer byteBuffer) {
            super(byteBuffer.array(), byteBuffer.position() + byteBuffer.arrayOffset(), byteBuffer.remaining());
            this.byteBuffer = byteBuffer;
            this.initialPosition = byteBuffer.position();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream.ArrayEncoder, com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void flush() {
            this.byteBuffer.position(this.initialPosition + getTotalBytesWritten());
        }
    }

    public static class OutOfSpaceException extends IOException {
        private static final String MESSAGE = "CodedOutputStream was writing to a flat byte array and ran out of space.";
        private static final long serialVersionUID = -6947486886997889499L;

        public OutOfSpaceException() {
            super(MESSAGE);
        }

        public OutOfSpaceException(String str) {
            super(G.f("CodedOutputStream was writing to a flat byte array and ran out of space.: ", str));
        }

        public OutOfSpaceException(Throwable th2) {
            super(MESSAGE, th2);
        }

        public OutOfSpaceException(String str, Throwable th2) {
            super(G.f("CodedOutputStream was writing to a flat byte array and ran out of space.: ", str), th2);
        }
    }

    public static final class OutputStreamEncoder extends AbstractBufferedEncoder {
        private final OutputStream out;

        public OutputStreamEncoder(OutputStream outputStream, int i12) {
            super(i12);
            if (outputStream == null) {
                throw new NullPointerException("out");
            }
            this.out = outputStream;
        }

        private void doFlush() throws IOException {
            this.out.write(this.buffer, 0, this.position);
            this.position = 0;
        }

        private void flushIfNotAvailable(int i12) throws IOException {
            if (this.limit - this.position < i12) {
                doFlush();
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void flush() throws IOException {
            if (this.position > 0) {
                doFlush();
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream, com.google.crypto.tink.shaded.protobuf.ByteOutput
        public void write(byte b12) throws IOException {
            if (this.position == this.limit) {
                doFlush();
            }
            buffer(b12);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeBool(int i12, boolean z12) throws IOException {
            flushIfNotAvailable(11);
            bufferTag(i12, 0);
            buffer(z12 ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeByteArray(int i12, byte[] bArr) throws IOException {
            writeByteArray(i12, bArr, 0, bArr.length);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeByteArrayNoTag(byte[] bArr, int i12, int i13) throws IOException {
            writeUInt32NoTag(i13);
            write(bArr, i12, i13);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeByteBuffer(int i12, ByteBuffer byteBuffer) throws IOException {
            writeTag(i12, 2);
            writeUInt32NoTag(byteBuffer.capacity());
            writeRawBytes(byteBuffer);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeBytes(int i12, ByteString byteString) throws IOException {
            writeTag(i12, 2);
            writeBytesNoTag(byteString);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeBytesNoTag(ByteString byteString) throws IOException {
            writeUInt32NoTag(byteString.size());
            byteString.writeTo(this);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeFixed32(int i12, int i13) throws IOException {
            flushIfNotAvailable(14);
            bufferTag(i12, 5);
            bufferFixed32NoTag(i13);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeFixed32NoTag(int i12) throws IOException {
            flushIfNotAvailable(4);
            bufferFixed32NoTag(i12);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeFixed64(int i12, long j12) throws IOException {
            flushIfNotAvailable(18);
            bufferTag(i12, 1);
            bufferFixed64NoTag(j12);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeFixed64NoTag(long j12) throws IOException {
            flushIfNotAvailable(8);
            bufferFixed64NoTag(j12);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeInt32(int i12, int i13) throws IOException {
            flushIfNotAvailable(20);
            bufferTag(i12, 0);
            bufferInt32NoTag(i13);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeInt32NoTag(int i12) throws IOException {
            if (i12 >= 0) {
                writeUInt32NoTag(i12);
            } else {
                writeUInt64NoTag(i12);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream, com.google.crypto.tink.shaded.protobuf.ByteOutput
        public void writeLazy(byte[] bArr, int i12, int i13) throws IOException {
            write(bArr, i12, i13);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeMessage(int i12, MessageLite messageLite) throws IOException {
            writeTag(i12, 2);
            writeMessageNoTag(messageLite);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeMessageNoTag(MessageLite messageLite) throws IOException {
            writeUInt32NoTag(messageLite.getSerializedSize());
            messageLite.writeTo(this);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeMessageSetExtension(int i12, MessageLite messageLite) throws IOException {
            writeTag(1, 3);
            writeUInt32(2, i12);
            writeMessage(3, messageLite);
            writeTag(1, 4);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeRawBytes(ByteBuffer byteBuffer) throws IOException {
            if (byteBuffer.hasArray()) {
                write(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.capacity());
                return;
            }
            ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
            byteBufferDuplicate.clear();
            write(byteBufferDuplicate);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeRawMessageSetExtension(int i12, ByteString byteString) throws IOException {
            writeTag(1, 3);
            writeUInt32(2, i12);
            writeBytes(3, byteString);
            writeTag(1, 4);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeString(int i12, String str) throws IOException {
            writeTag(i12, 2);
            writeStringNoTag(str);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeStringNoTag(String str) throws IOException {
            int iEncodedLength;
            try {
                int length = str.length() * 3;
                int iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(length);
                int i12 = iComputeUInt32SizeNoTag + length;
                int i13 = this.limit;
                if (i12 > i13) {
                    byte[] bArr = new byte[length];
                    int iEncode = Utf8.encode(str, bArr, 0, length);
                    writeUInt32NoTag(iEncode);
                    writeLazy(bArr, 0, iEncode);
                    return;
                }
                if (i12 > i13 - this.position) {
                    doFlush();
                }
                int iComputeUInt32SizeNoTag2 = CodedOutputStream.computeUInt32SizeNoTag(str.length());
                int i14 = this.position;
                try {
                    if (iComputeUInt32SizeNoTag2 == iComputeUInt32SizeNoTag) {
                        int i15 = i14 + iComputeUInt32SizeNoTag2;
                        this.position = i15;
                        int iEncode2 = Utf8.encode(str, this.buffer, i15, this.limit - i15);
                        this.position = i14;
                        iEncodedLength = (iEncode2 - i14) - iComputeUInt32SizeNoTag2;
                        bufferUInt32NoTag(iEncodedLength);
                        this.position = iEncode2;
                    } else {
                        iEncodedLength = Utf8.encodedLength(str);
                        bufferUInt32NoTag(iEncodedLength);
                        this.position = Utf8.encode(str, this.buffer, this.position, iEncodedLength);
                    }
                    this.totalBytesWritten += iEncodedLength;
                } catch (Utf8.UnpairedSurrogateException e12) {
                    this.totalBytesWritten -= this.position - i14;
                    this.position = i14;
                    throw e12;
                } catch (ArrayIndexOutOfBoundsException e13) {
                    throw new OutOfSpaceException(e13);
                }
            } catch (Utf8.UnpairedSurrogateException e14) {
                inefficientWriteStringNoTag(str, e14);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeTag(int i12, int i13) throws IOException {
            writeUInt32NoTag(WireFormat.makeTag(i12, i13));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeUInt32(int i12, int i13) throws IOException {
            flushIfNotAvailable(20);
            bufferTag(i12, 0);
            bufferUInt32NoTag(i13);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeUInt32NoTag(int i12) throws IOException {
            flushIfNotAvailable(5);
            bufferUInt32NoTag(i12);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeUInt64(int i12, long j12) throws IOException {
            flushIfNotAvailable(20);
            bufferTag(i12, 0);
            bufferUInt64NoTag(j12);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeUInt64NoTag(long j12) throws IOException {
            flushIfNotAvailable(10);
            bufferUInt64NoTag(j12);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeByteArray(int i12, byte[] bArr, int i13, int i14) throws IOException {
            writeTag(i12, 2);
            writeByteArrayNoTag(bArr, i13, i14);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream, com.google.crypto.tink.shaded.protobuf.ByteOutput
        public void writeLazy(ByteBuffer byteBuffer) throws IOException {
            write(byteBuffer);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeMessage(int i12, MessageLite messageLite, Schema schema) throws IOException {
            writeTag(i12, 2);
            writeMessageNoTag(messageLite, schema);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeMessageNoTag(MessageLite messageLite, Schema schema) throws IOException {
            writeUInt32NoTag(((AbstractMessageLite) messageLite).getSerializedSize(schema));
            schema.writeTo(messageLite, this.wrapper);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream, com.google.crypto.tink.shaded.protobuf.ByteOutput
        public void write(byte[] bArr, int i12, int i13) throws IOException {
            int i14 = this.limit;
            int i15 = this.position;
            if (i14 - i15 >= i13) {
                System.arraycopy(bArr, i12, this.buffer, i15, i13);
                this.position += i13;
                this.totalBytesWritten += i13;
                return;
            }
            int i16 = i14 - i15;
            System.arraycopy(bArr, i12, this.buffer, i15, i16);
            int i17 = i12 + i16;
            int i18 = i13 - i16;
            this.position = this.limit;
            this.totalBytesWritten += i16;
            doFlush();
            if (i18 <= this.limit) {
                System.arraycopy(bArr, i17, this.buffer, 0, i18);
                this.position = i18;
            } else {
                this.out.write(bArr, i17, i18);
            }
            this.totalBytesWritten += i18;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream, com.google.crypto.tink.shaded.protobuf.ByteOutput
        public void write(ByteBuffer byteBuffer) throws IOException {
            int iRemaining = byteBuffer.remaining();
            int i12 = this.limit;
            int i13 = this.position;
            if (i12 - i13 >= iRemaining) {
                byteBuffer.get(this.buffer, i13, iRemaining);
                this.position += iRemaining;
                this.totalBytesWritten += iRemaining;
                return;
            }
            int i14 = i12 - i13;
            byteBuffer.get(this.buffer, i13, i14);
            int i15 = iRemaining - i14;
            this.position = this.limit;
            this.totalBytesWritten += i14;
            doFlush();
            while (true) {
                int i16 = this.limit;
                if (i15 > i16) {
                    byteBuffer.get(this.buffer, 0, i16);
                    this.out.write(this.buffer, 0, this.limit);
                    int i17 = this.limit;
                    i15 -= i17;
                    this.totalBytesWritten += i17;
                } else {
                    byteBuffer.get(this.buffer, 0, i15);
                    this.position = i15;
                    this.totalBytesWritten += i15;
                    return;
                }
            }
        }
    }

    public static final class SafeDirectNioEncoder extends CodedOutputStream {
        private final ByteBuffer buffer;
        private final int initialPosition;
        private final ByteBuffer originalBuffer;

        public SafeDirectNioEncoder(ByteBuffer byteBuffer) {
            super();
            this.originalBuffer = byteBuffer;
            this.buffer = byteBuffer.duplicate().order(ByteOrder.LITTLE_ENDIAN);
            this.initialPosition = byteBuffer.position();
        }

        private void encode(String str) throws OutOfSpaceException {
            try {
                Utf8.encodeUtf8(str, this.buffer);
            } catch (IndexOutOfBoundsException e12) {
                throw new OutOfSpaceException(e12);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void flush() {
            this.originalBuffer.position(this.buffer.position());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public int getTotalBytesWritten() {
            return this.buffer.position() - this.initialPosition;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public int spaceLeft() {
            return this.buffer.remaining();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream, com.google.crypto.tink.shaded.protobuf.ByteOutput
        public void write(byte b12) throws OutOfSpaceException {
            try {
                this.buffer.put(b12);
            } catch (BufferOverflowException e12) {
                throw new OutOfSpaceException(e12);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeBool(int i12, boolean z12) throws OutOfSpaceException {
            writeTag(i12, 0);
            write(z12 ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeByteArray(int i12, byte[] bArr) throws OutOfSpaceException {
            writeByteArray(i12, bArr, 0, bArr.length);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeByteArrayNoTag(byte[] bArr, int i12, int i13) throws OutOfSpaceException {
            writeUInt32NoTag(i13);
            write(bArr, i12, i13);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeByteBuffer(int i12, ByteBuffer byteBuffer) throws OutOfSpaceException {
            writeTag(i12, 2);
            writeUInt32NoTag(byteBuffer.capacity());
            writeRawBytes(byteBuffer);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeBytes(int i12, ByteString byteString) throws OutOfSpaceException {
            writeTag(i12, 2);
            writeBytesNoTag(byteString);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeBytesNoTag(ByteString byteString) throws OutOfSpaceException {
            writeUInt32NoTag(byteString.size());
            byteString.writeTo(this);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeFixed32(int i12, int i13) throws OutOfSpaceException {
            writeTag(i12, 5);
            writeFixed32NoTag(i13);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeFixed32NoTag(int i12) throws OutOfSpaceException {
            try {
                this.buffer.putInt(i12);
            } catch (BufferOverflowException e12) {
                throw new OutOfSpaceException(e12);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeFixed64(int i12, long j12) throws OutOfSpaceException {
            writeTag(i12, 1);
            writeFixed64NoTag(j12);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeFixed64NoTag(long j12) throws OutOfSpaceException {
            try {
                this.buffer.putLong(j12);
            } catch (BufferOverflowException e12) {
                throw new OutOfSpaceException(e12);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeInt32(int i12, int i13) throws OutOfSpaceException {
            writeTag(i12, 0);
            writeInt32NoTag(i13);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeInt32NoTag(int i12) throws OutOfSpaceException {
            if (i12 >= 0) {
                writeUInt32NoTag(i12);
            } else {
                writeUInt64NoTag(i12);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream, com.google.crypto.tink.shaded.protobuf.ByteOutput
        public void writeLazy(byte[] bArr, int i12, int i13) throws OutOfSpaceException {
            write(bArr, i12, i13);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeMessage(int i12, MessageLite messageLite) throws OutOfSpaceException {
            writeTag(i12, 2);
            writeMessageNoTag(messageLite);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeMessageNoTag(MessageLite messageLite) throws OutOfSpaceException {
            writeUInt32NoTag(messageLite.getSerializedSize());
            messageLite.writeTo(this);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeMessageSetExtension(int i12, MessageLite messageLite) throws OutOfSpaceException {
            writeTag(1, 3);
            writeUInt32(2, i12);
            writeMessage(3, messageLite);
            writeTag(1, 4);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeRawBytes(ByteBuffer byteBuffer) throws OutOfSpaceException {
            if (byteBuffer.hasArray()) {
                write(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.capacity());
                return;
            }
            ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
            byteBufferDuplicate.clear();
            write(byteBufferDuplicate);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeRawMessageSetExtension(int i12, ByteString byteString) throws OutOfSpaceException {
            writeTag(1, 3);
            writeUInt32(2, i12);
            writeBytes(3, byteString);
            writeTag(1, 4);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeString(int i12, String str) throws OutOfSpaceException {
            writeTag(i12, 2);
            writeStringNoTag(str);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeStringNoTag(String str) throws OutOfSpaceException {
            int iPosition = this.buffer.position();
            try {
                int iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(str.length() * 3);
                int iComputeUInt32SizeNoTag2 = CodedOutputStream.computeUInt32SizeNoTag(str.length());
                if (iComputeUInt32SizeNoTag2 == iComputeUInt32SizeNoTag) {
                    int iPosition2 = this.buffer.position() + iComputeUInt32SizeNoTag2;
                    this.buffer.position(iPosition2);
                    encode(str);
                    int iPosition3 = this.buffer.position();
                    this.buffer.position(iPosition);
                    writeUInt32NoTag(iPosition3 - iPosition2);
                    this.buffer.position(iPosition3);
                } else {
                    writeUInt32NoTag(Utf8.encodedLength(str));
                    encode(str);
                }
            } catch (Utf8.UnpairedSurrogateException e12) {
                this.buffer.position(iPosition);
                inefficientWriteStringNoTag(str, e12);
            } catch (IllegalArgumentException e13) {
                throw new OutOfSpaceException(e13);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeTag(int i12, int i13) throws OutOfSpaceException {
            writeUInt32NoTag(WireFormat.makeTag(i12, i13));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeUInt32(int i12, int i13) throws OutOfSpaceException {
            writeTag(i12, 0);
            writeUInt32NoTag(i13);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeUInt32NoTag(int i12) throws OutOfSpaceException {
            while ((i12 & (-128)) != 0) {
                try {
                    this.buffer.put((byte) ((i12 & 127) | 128));
                    i12 >>>= 7;
                } catch (BufferOverflowException e12) {
                    throw new OutOfSpaceException(e12);
                }
            }
            this.buffer.put((byte) i12);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeUInt64(int i12, long j12) throws OutOfSpaceException {
            writeTag(i12, 0);
            writeUInt64NoTag(j12);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeUInt64NoTag(long j12) throws OutOfSpaceException {
            while (((-128) & j12) != 0) {
                try {
                    this.buffer.put((byte) ((((int) j12) & 127) | 128));
                    j12 >>>= 7;
                } catch (BufferOverflowException e12) {
                    throw new OutOfSpaceException(e12);
                }
            }
            this.buffer.put((byte) j12);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeByteArray(int i12, byte[] bArr, int i13, int i14) throws OutOfSpaceException {
            writeTag(i12, 2);
            writeByteArrayNoTag(bArr, i13, i14);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream, com.google.crypto.tink.shaded.protobuf.ByteOutput
        public void writeLazy(ByteBuffer byteBuffer) throws OutOfSpaceException {
            write(byteBuffer);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream, com.google.crypto.tink.shaded.protobuf.ByteOutput
        public void write(byte[] bArr, int i12, int i13) throws OutOfSpaceException {
            try {
                this.buffer.put(bArr, i12, i13);
            } catch (IndexOutOfBoundsException e12) {
                throw new OutOfSpaceException(e12);
            } catch (BufferOverflowException e13) {
                throw new OutOfSpaceException(e13);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeMessage(int i12, MessageLite messageLite, Schema schema) throws OutOfSpaceException {
            writeTag(i12, 2);
            writeMessageNoTag(messageLite, schema);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeMessageNoTag(MessageLite messageLite, Schema schema) throws OutOfSpaceException {
            writeUInt32NoTag(((AbstractMessageLite) messageLite).getSerializedSize(schema));
            schema.writeTo(messageLite, this.wrapper);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream, com.google.crypto.tink.shaded.protobuf.ByteOutput
        public void write(ByteBuffer byteBuffer) throws OutOfSpaceException {
            try {
                this.buffer.put(byteBuffer);
            } catch (BufferOverflowException e12) {
                throw new OutOfSpaceException(e12);
            }
        }
    }

    public static final class UnsafeDirectNioEncoder extends CodedOutputStream {
        private final long address;
        private final ByteBuffer buffer;
        private final long initialPosition;
        private final long limit;
        private final long oneVarintLimit;
        private final ByteBuffer originalBuffer;
        private long position;

        public UnsafeDirectNioEncoder(ByteBuffer byteBuffer) {
            super();
            this.originalBuffer = byteBuffer;
            this.buffer = byteBuffer.duplicate().order(ByteOrder.LITTLE_ENDIAN);
            long jAddressOffset = UnsafeUtil.addressOffset(byteBuffer);
            this.address = jAddressOffset;
            long jPosition = byteBuffer.position() + jAddressOffset;
            this.initialPosition = jPosition;
            long jLimit = jAddressOffset + byteBuffer.limit();
            this.limit = jLimit;
            this.oneVarintLimit = jLimit - 10;
            this.position = jPosition;
        }

        private int bufferPos(long j12) {
            return (int) (j12 - this.address);
        }

        public static boolean isSupported() {
            return UnsafeUtil.hasUnsafeByteBufferOperations();
        }

        private void repositionBuffer(long j12) {
            this.buffer.position(bufferPos(j12));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void flush() {
            this.originalBuffer.position(bufferPos(this.position));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public int getTotalBytesWritten() {
            return (int) (this.position - this.initialPosition);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public int spaceLeft() {
            return (int) (this.limit - this.position);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream, com.google.crypto.tink.shaded.protobuf.ByteOutput
        public void write(byte b12) throws OutOfSpaceException {
            long j12 = this.position;
            if (j12 >= this.limit) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(this.position), Long.valueOf(this.limit), 1));
            }
            this.position = 1 + j12;
            UnsafeUtil.putByte(j12, b12);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeBool(int i12, boolean z12) throws OutOfSpaceException {
            writeTag(i12, 0);
            write(z12 ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeByteArray(int i12, byte[] bArr) throws OutOfSpaceException {
            writeByteArray(i12, bArr, 0, bArr.length);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeByteArrayNoTag(byte[] bArr, int i12, int i13) throws OutOfSpaceException {
            writeUInt32NoTag(i13);
            write(bArr, i12, i13);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeByteBuffer(int i12, ByteBuffer byteBuffer) throws OutOfSpaceException {
            writeTag(i12, 2);
            writeUInt32NoTag(byteBuffer.capacity());
            writeRawBytes(byteBuffer);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeBytes(int i12, ByteString byteString) throws OutOfSpaceException {
            writeTag(i12, 2);
            writeBytesNoTag(byteString);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeBytesNoTag(ByteString byteString) throws OutOfSpaceException {
            writeUInt32NoTag(byteString.size());
            byteString.writeTo(this);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeFixed32(int i12, int i13) throws OutOfSpaceException {
            writeTag(i12, 5);
            writeFixed32NoTag(i13);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeFixed32NoTag(int i12) {
            this.buffer.putInt(bufferPos(this.position), i12);
            this.position += 4;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeFixed64(int i12, long j12) throws OutOfSpaceException {
            writeTag(i12, 1);
            writeFixed64NoTag(j12);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeFixed64NoTag(long j12) {
            this.buffer.putLong(bufferPos(this.position), j12);
            this.position += 8;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeInt32(int i12, int i13) throws OutOfSpaceException {
            writeTag(i12, 0);
            writeInt32NoTag(i13);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeInt32NoTag(int i12) throws OutOfSpaceException {
            if (i12 >= 0) {
                writeUInt32NoTag(i12);
            } else {
                writeUInt64NoTag(i12);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream, com.google.crypto.tink.shaded.protobuf.ByteOutput
        public void writeLazy(byte[] bArr, int i12, int i13) throws OutOfSpaceException {
            write(bArr, i12, i13);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeMessage(int i12, MessageLite messageLite) throws OutOfSpaceException {
            writeTag(i12, 2);
            writeMessageNoTag(messageLite);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeMessageNoTag(MessageLite messageLite) throws OutOfSpaceException {
            writeUInt32NoTag(messageLite.getSerializedSize());
            messageLite.writeTo(this);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeMessageSetExtension(int i12, MessageLite messageLite) throws OutOfSpaceException {
            writeTag(1, 3);
            writeUInt32(2, i12);
            writeMessage(3, messageLite);
            writeTag(1, 4);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeRawBytes(ByteBuffer byteBuffer) throws OutOfSpaceException {
            if (byteBuffer.hasArray()) {
                write(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.capacity());
                return;
            }
            ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
            byteBufferDuplicate.clear();
            write(byteBufferDuplicate);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeRawMessageSetExtension(int i12, ByteString byteString) throws OutOfSpaceException {
            writeTag(1, 3);
            writeUInt32(2, i12);
            writeBytes(3, byteString);
            writeTag(1, 4);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeString(int i12, String str) throws OutOfSpaceException {
            writeTag(i12, 2);
            writeStringNoTag(str);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeStringNoTag(String str) throws OutOfSpaceException {
            long j12 = this.position;
            try {
                int iComputeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(str.length() * 3);
                int iComputeUInt32SizeNoTag2 = CodedOutputStream.computeUInt32SizeNoTag(str.length());
                if (iComputeUInt32SizeNoTag2 == iComputeUInt32SizeNoTag) {
                    int iBufferPos = bufferPos(this.position) + iComputeUInt32SizeNoTag2;
                    this.buffer.position(iBufferPos);
                    Utf8.encodeUtf8(str, this.buffer);
                    int iPosition = this.buffer.position() - iBufferPos;
                    writeUInt32NoTag(iPosition);
                    this.position += iPosition;
                } else {
                    int iEncodedLength = Utf8.encodedLength(str);
                    writeUInt32NoTag(iEncodedLength);
                    repositionBuffer(this.position);
                    Utf8.encodeUtf8(str, this.buffer);
                    this.position += iEncodedLength;
                }
            } catch (Utf8.UnpairedSurrogateException e12) {
                this.position = j12;
                repositionBuffer(j12);
                inefficientWriteStringNoTag(str, e12);
            } catch (IllegalArgumentException e13) {
                throw new OutOfSpaceException(e13);
            } catch (IndexOutOfBoundsException e14) {
                throw new OutOfSpaceException(e14);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeTag(int i12, int i13) throws OutOfSpaceException {
            writeUInt32NoTag(WireFormat.makeTag(i12, i13));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeUInt32(int i12, int i13) throws OutOfSpaceException {
            writeTag(i12, 0);
            writeUInt32NoTag(i13);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeUInt32NoTag(int i12) throws OutOfSpaceException {
            if (this.position <= this.oneVarintLimit) {
                while ((i12 & (-128)) != 0) {
                    long j12 = this.position;
                    this.position = j12 + 1;
                    UnsafeUtil.putByte(j12, (byte) ((i12 & 127) | 128));
                    i12 >>>= 7;
                }
                long j13 = this.position;
                this.position = 1 + j13;
                UnsafeUtil.putByte(j13, (byte) i12);
                return;
            }
            while (true) {
                long j14 = this.position;
                if (j14 >= this.limit) {
                    throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(this.position), Long.valueOf(this.limit), 1));
                }
                if ((i12 & (-128)) == 0) {
                    this.position = 1 + j14;
                    UnsafeUtil.putByte(j14, (byte) i12);
                    return;
                } else {
                    this.position = j14 + 1;
                    UnsafeUtil.putByte(j14, (byte) ((i12 & 127) | 128));
                    i12 >>>= 7;
                }
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeUInt64(int i12, long j12) throws OutOfSpaceException {
            writeTag(i12, 0);
            writeUInt64NoTag(j12);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeUInt64NoTag(long j12) throws OutOfSpaceException {
            if (this.position <= this.oneVarintLimit) {
                while ((j12 & (-128)) != 0) {
                    long j13 = this.position;
                    this.position = j13 + 1;
                    UnsafeUtil.putByte(j13, (byte) ((((int) j12) & 127) | 128));
                    j12 >>>= 7;
                }
                long j14 = this.position;
                this.position = 1 + j14;
                UnsafeUtil.putByte(j14, (byte) j12);
                return;
            }
            while (true) {
                long j15 = this.position;
                if (j15 >= this.limit) {
                    throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(this.position), Long.valueOf(this.limit), 1));
                }
                if ((j12 & (-128)) == 0) {
                    this.position = 1 + j15;
                    UnsafeUtil.putByte(j15, (byte) j12);
                    return;
                } else {
                    this.position = j15 + 1;
                    UnsafeUtil.putByte(j15, (byte) ((((int) j12) & 127) | 128));
                    j12 >>>= 7;
                }
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeByteArray(int i12, byte[] bArr, int i13, int i14) throws OutOfSpaceException {
            writeTag(i12, 2);
            writeByteArrayNoTag(bArr, i13, i14);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream, com.google.crypto.tink.shaded.protobuf.ByteOutput
        public void writeLazy(ByteBuffer byteBuffer) throws OutOfSpaceException {
            write(byteBuffer);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeMessage(int i12, MessageLite messageLite, Schema schema) throws OutOfSpaceException {
            writeTag(i12, 2);
            writeMessageNoTag(messageLite, schema);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public void writeMessageNoTag(MessageLite messageLite, Schema schema) throws OutOfSpaceException {
            writeUInt32NoTag(((AbstractMessageLite) messageLite).getSerializedSize(schema));
            schema.writeTo(messageLite, this.wrapper);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream, com.google.crypto.tink.shaded.protobuf.ByteOutput
        public void write(byte[] bArr, int i12, int i13) throws OutOfSpaceException {
            if (bArr != null && i12 >= 0 && i13 >= 0 && bArr.length - i13 >= i12) {
                long j12 = i13;
                long j13 = this.limit - j12;
                long j14 = this.position;
                if (j13 >= j14) {
                    UnsafeUtil.copyMemory(bArr, i12, j14, j12);
                    this.position += j12;
                    return;
                }
            }
            if (bArr == null) {
                throw new NullPointerException("value");
            }
            throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(this.position), Long.valueOf(this.limit), Integer.valueOf(i13)));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream, com.google.crypto.tink.shaded.protobuf.ByteOutput
        public void write(ByteBuffer byteBuffer) throws OutOfSpaceException {
            try {
                int iRemaining = byteBuffer.remaining();
                repositionBuffer(this.position);
                this.buffer.put(byteBuffer);
                this.position += iRemaining;
            } catch (BufferOverflowException e12) {
                throw new OutOfSpaceException(e12);
            }
        }
    }

    public static int computeBoolSize(int i12, boolean z12) {
        return computeBoolSizeNoTag(z12) + computeTagSize(i12);
    }

    public static int computeBoolSizeNoTag(boolean z12) {
        return 1;
    }

    public static int computeByteArraySize(int i12, byte[] bArr) {
        return computeByteArraySizeNoTag(bArr) + computeTagSize(i12);
    }

    public static int computeByteArraySizeNoTag(byte[] bArr) {
        return computeLengthDelimitedFieldSize(bArr.length);
    }

    public static int computeByteBufferSize(int i12, ByteBuffer byteBuffer) {
        return computeByteBufferSizeNoTag(byteBuffer) + computeTagSize(i12);
    }

    public static int computeByteBufferSizeNoTag(ByteBuffer byteBuffer) {
        return computeLengthDelimitedFieldSize(byteBuffer.capacity());
    }

    public static int computeBytesSize(int i12, ByteString byteString) {
        return computeBytesSizeNoTag(byteString) + computeTagSize(i12);
    }

    public static int computeBytesSizeNoTag(ByteString byteString) {
        return computeLengthDelimitedFieldSize(byteString.size());
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
        return computeInt32SizeNoTag(i12);
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

    @Deprecated
    public static int computeGroupSize(int i12, MessageLite messageLite) {
        return messageLite.getSerializedSize() + (computeTagSize(i12) * 2);
    }

    @InlineMe(replacement = "value.getSerializedSize()")
    @Deprecated
    public static int computeGroupSizeNoTag(MessageLite messageLite) {
        return messageLite.getSerializedSize();
    }

    public static int computeInt32Size(int i12, int i13) {
        return computeInt32SizeNoTag(i13) + computeTagSize(i12);
    }

    public static int computeInt32SizeNoTag(int i12) {
        if (i12 >= 0) {
            return computeUInt32SizeNoTag(i12);
        }
        return 10;
    }

    public static int computeInt64Size(int i12, long j12) {
        return computeInt64SizeNoTag(j12) + computeTagSize(i12);
    }

    public static int computeInt64SizeNoTag(long j12) {
        return computeUInt64SizeNoTag(j12);
    }

    public static int computeLazyFieldMessageSetExtensionSize(int i12, LazyFieldLite lazyFieldLite) {
        return computeLazyFieldSize(3, lazyFieldLite) + computeUInt32Size(2, i12) + (computeTagSize(1) * 2);
    }

    public static int computeLazyFieldSize(int i12, LazyFieldLite lazyFieldLite) {
        return computeLazyFieldSizeNoTag(lazyFieldLite) + computeTagSize(i12);
    }

    public static int computeLazyFieldSizeNoTag(LazyFieldLite lazyFieldLite) {
        return computeLengthDelimitedFieldSize(lazyFieldLite.getSerializedSize());
    }

    public static int computeLengthDelimitedFieldSize(int i12) {
        return computeUInt32SizeNoTag(i12) + i12;
    }

    public static int computeMessageSetExtensionSize(int i12, MessageLite messageLite) {
        return computeMessageSize(3, messageLite) + computeUInt32Size(2, i12) + (computeTagSize(1) * 2);
    }

    public static int computeMessageSize(int i12, MessageLite messageLite) {
        return computeMessageSizeNoTag(messageLite) + computeTagSize(i12);
    }

    public static int computeMessageSizeNoTag(MessageLite messageLite) {
        return computeLengthDelimitedFieldSize(messageLite.getSerializedSize());
    }

    public static int computePreferredBufferSize(int i12) {
        if (i12 > 4096) {
            return 4096;
        }
        return i12;
    }

    public static int computeRawMessageSetExtensionSize(int i12, ByteString byteString) {
        return computeBytesSize(3, byteString) + computeUInt32Size(2, i12) + (computeTagSize(1) * 2);
    }

    @InlineMe(imports = {"com.google.crypto.tink.shaded.protobuf.CodedOutputStream"}, replacement = "CodedOutputStream.computeUInt32SizeNoTag(value)")
    @Deprecated
    public static int computeRawVarint32Size(int i12) {
        return computeUInt32SizeNoTag(i12);
    }

    @InlineMe(imports = {"com.google.crypto.tink.shaded.protobuf.CodedOutputStream"}, replacement = "CodedOutputStream.computeUInt64SizeNoTag(value)")
    @Deprecated
    public static int computeRawVarint64Size(long j12) {
        return computeUInt64SizeNoTag(j12);
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
        return computeUInt32SizeNoTag(encodeZigZag32(i12));
    }

    public static int computeSInt64Size(int i12, long j12) {
        return computeSInt64SizeNoTag(j12) + computeTagSize(i12);
    }

    public static int computeSInt64SizeNoTag(long j12) {
        return computeUInt64SizeNoTag(encodeZigZag64(j12));
    }

    public static int computeStringSize(int i12, String str) {
        return computeStringSizeNoTag(str) + computeTagSize(i12);
    }

    public static int computeStringSizeNoTag(String str) {
        int length;
        try {
            length = Utf8.encodedLength(str);
        } catch (Utf8.UnpairedSurrogateException unused) {
            length = str.getBytes(Internal.UTF_8).length;
        }
        return computeLengthDelimitedFieldSize(length);
    }

    public static int computeTagSize(int i12) {
        return computeUInt32SizeNoTag(WireFormat.makeTag(i12, 0));
    }

    public static int computeUInt32Size(int i12, int i13) {
        return computeUInt32SizeNoTag(i13) + computeTagSize(i12);
    }

    public static int computeUInt32SizeNoTag(int i12) {
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

    public static int computeUInt64Size(int i12, long j12) {
        return computeUInt64SizeNoTag(j12) + computeTagSize(i12);
    }

    public static int computeUInt64SizeNoTag(long j12) {
        int i12;
        if (((-128) & j12) == 0) {
            return 1;
        }
        if (j12 < 0) {
            return 10;
        }
        if (((-34359738368L) & j12) != 0) {
            j12 >>>= 28;
            i12 = 6;
        } else {
            i12 = 2;
        }
        if (((-2097152) & j12) != 0) {
            i12 += 2;
            j12 >>>= 14;
        }
        return (j12 & (-16384)) != 0 ? i12 + 1 : i12;
    }

    public static int encodeZigZag32(int i12) {
        return (i12 >> 31) ^ (i12 << 1);
    }

    public static long encodeZigZag64(long j12) {
        return (j12 >> 63) ^ (j12 << 1);
    }

    public static CodedOutputStream newInstance(OutputStream outputStream) {
        return newInstance(outputStream, 4096);
    }

    public static CodedOutputStream newSafeInstance(ByteBuffer byteBuffer) {
        return new SafeDirectNioEncoder(byteBuffer);
    }

    public static CodedOutputStream newUnsafeInstance(ByteBuffer byteBuffer) {
        return new UnsafeDirectNioEncoder(byteBuffer);
    }

    public final void checkNoSpaceLeft() {
        if (spaceLeft() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public abstract void flush();

    public abstract int getTotalBytesWritten();

    public final void inefficientWriteStringNoTag(String str, Utf8.UnpairedSurrogateException unpairedSurrogateException) throws OutOfSpaceException {
        logger.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) unpairedSurrogateException);
        byte[] bytes = str.getBytes(Internal.UTF_8);
        try {
            writeUInt32NoTag(bytes.length);
            writeLazy(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e12) {
            throw new OutOfSpaceException(e12);
        }
    }

    public boolean isSerializationDeterministic() {
        return this.serializationDeterministic;
    }

    public abstract int spaceLeft();

    public void useDeterministicSerialization() {
        this.serializationDeterministic = true;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ByteOutput
    public abstract void write(byte b12);

    @Override // com.google.crypto.tink.shaded.protobuf.ByteOutput
    public abstract void write(ByteBuffer byteBuffer);

    @Override // com.google.crypto.tink.shaded.protobuf.ByteOutput
    public abstract void write(byte[] bArr, int i12, int i13);

    public abstract void writeBool(int i12, boolean z12);

    public final void writeBoolNoTag(boolean z12) {
        write(z12 ? (byte) 1 : (byte) 0);
    }

    public abstract void writeByteArray(int i12, byte[] bArr);

    public abstract void writeByteArray(int i12, byte[] bArr, int i13, int i14);

    public final void writeByteArrayNoTag(byte[] bArr) {
        writeByteArrayNoTag(bArr, 0, bArr.length);
    }

    public abstract void writeByteArrayNoTag(byte[] bArr, int i12, int i13);

    public abstract void writeByteBuffer(int i12, ByteBuffer byteBuffer);

    public abstract void writeBytes(int i12, ByteString byteString);

    public abstract void writeBytesNoTag(ByteString byteString);

    public final void writeDouble(int i12, double d12) {
        writeFixed64(i12, Double.doubleToRawLongBits(d12));
    }

    public final void writeDoubleNoTag(double d12) {
        writeFixed64NoTag(Double.doubleToRawLongBits(d12));
    }

    public final void writeEnum(int i12, int i13) {
        writeInt32(i12, i13);
    }

    public final void writeEnumNoTag(int i12) {
        writeInt32NoTag(i12);
    }

    public abstract void writeFixed32(int i12, int i13);

    public abstract void writeFixed32NoTag(int i12);

    public abstract void writeFixed64(int i12, long j12);

    public abstract void writeFixed64NoTag(long j12);

    public final void writeFloat(int i12, float f12) {
        writeFixed32(i12, Float.floatToRawIntBits(f12));
    }

    public final void writeFloatNoTag(float f12) {
        writeFixed32NoTag(Float.floatToRawIntBits(f12));
    }

    @Deprecated
    public final void writeGroup(int i12, MessageLite messageLite) {
        writeTag(i12, 3);
        writeGroupNoTag(messageLite);
        writeTag(i12, 4);
    }

    @Deprecated
    public final void writeGroupNoTag(MessageLite messageLite) {
        messageLite.writeTo(this);
    }

    public abstract void writeInt32(int i12, int i13);

    public abstract void writeInt32NoTag(int i12);

    public final void writeInt64(int i12, long j12) {
        writeUInt64(i12, j12);
    }

    public final void writeInt64NoTag(long j12) {
        writeUInt64NoTag(j12);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.ByteOutput
    public abstract void writeLazy(ByteBuffer byteBuffer);

    @Override // com.google.crypto.tink.shaded.protobuf.ByteOutput
    public abstract void writeLazy(byte[] bArr, int i12, int i13);

    public abstract void writeMessage(int i12, MessageLite messageLite);

    public abstract void writeMessage(int i12, MessageLite messageLite, Schema schema);

    public abstract void writeMessageNoTag(MessageLite messageLite);

    public abstract void writeMessageNoTag(MessageLite messageLite, Schema schema);

    public abstract void writeMessageSetExtension(int i12, MessageLite messageLite);

    public final void writeRawByte(byte b12) {
        write(b12);
    }

    public abstract void writeRawBytes(ByteBuffer byteBuffer);

    public final void writeRawBytes(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    @InlineMe(replacement = "this.writeFixed32NoTag(value)")
    @Deprecated
    public final void writeRawLittleEndian32(int i12) {
        writeFixed32NoTag(i12);
    }

    @InlineMe(replacement = "this.writeFixed64NoTag(value)")
    @Deprecated
    public final void writeRawLittleEndian64(long j12) {
        writeFixed64NoTag(j12);
    }

    public abstract void writeRawMessageSetExtension(int i12, ByteString byteString);

    @InlineMe(replacement = "this.writeUInt32NoTag(value)")
    @Deprecated
    public final void writeRawVarint32(int i12) {
        writeUInt32NoTag(i12);
    }

    @InlineMe(replacement = "this.writeUInt64NoTag(value)")
    @Deprecated
    public final void writeRawVarint64(long j12) {
        writeUInt64NoTag(j12);
    }

    public final void writeSFixed32(int i12, int i13) {
        writeFixed32(i12, i13);
    }

    public final void writeSFixed32NoTag(int i12) {
        writeFixed32NoTag(i12);
    }

    public final void writeSFixed64(int i12, long j12) {
        writeFixed64(i12, j12);
    }

    public final void writeSFixed64NoTag(long j12) {
        writeFixed64NoTag(j12);
    }

    public final void writeSInt32(int i12, int i13) {
        writeUInt32(i12, encodeZigZag32(i13));
    }

    public final void writeSInt32NoTag(int i12) {
        writeUInt32NoTag(encodeZigZag32(i12));
    }

    public final void writeSInt64(int i12, long j12) {
        writeUInt64(i12, encodeZigZag64(j12));
    }

    public final void writeSInt64NoTag(long j12) {
        writeUInt64NoTag(encodeZigZag64(j12));
    }

    public abstract void writeString(int i12, String str);

    public abstract void writeStringNoTag(String str);

    public abstract void writeTag(int i12, int i13);

    public abstract void writeUInt32(int i12, int i13);

    public abstract void writeUInt32NoTag(int i12);

    public abstract void writeUInt64(int i12, long j12);

    public abstract void writeUInt64NoTag(long j12);

    private CodedOutputStream() {
    }

    @Deprecated
    public static int computeGroupSize(int i12, MessageLite messageLite, Schema schema) {
        return computeGroupSizeNoTag(messageLite, schema) + (computeTagSize(i12) * 2);
    }

    @Deprecated
    public static int computeGroupSizeNoTag(MessageLite messageLite, Schema schema) {
        return ((AbstractMessageLite) messageLite).getSerializedSize(schema);
    }

    public static int computeMessageSize(int i12, MessageLite messageLite, Schema schema) {
        return computeMessageSizeNoTag(messageLite, schema) + computeTagSize(i12);
    }

    public static int computeMessageSizeNoTag(MessageLite messageLite, Schema schema) {
        return computeLengthDelimitedFieldSize(((AbstractMessageLite) messageLite).getSerializedSize(schema));
    }

    public static CodedOutputStream newInstance(OutputStream outputStream, int i12) {
        return new OutputStreamEncoder(outputStream, i12);
    }

    @Deprecated
    public final void writeGroupNoTag(MessageLite messageLite, Schema schema) {
        schema.writeTo(messageLite, this.wrapper);
    }

    public final void writeRawByte(int i12) {
        write((byte) i12);
    }

    public final void writeRawBytes(byte[] bArr, int i12, int i13) {
        write(bArr, i12, i13);
    }

    public static CodedOutputStream newInstance(byte[] bArr) {
        return newInstance(bArr, 0, bArr.length);
    }

    public final void writeRawBytes(ByteString byteString) {
        byteString.writeTo(this);
    }

    public static CodedOutputStream newInstance(byte[] bArr, int i12, int i13) {
        return new ArrayEncoder(bArr, i12, i13);
    }

    @Deprecated
    public final void writeGroup(int i12, MessageLite messageLite, Schema schema) {
        writeTag(i12, 3);
        writeGroupNoTag(messageLite, schema);
        writeTag(i12, 4);
    }

    public static CodedOutputStream newInstance(ByteBuffer byteBuffer) {
        if (byteBuffer.hasArray()) {
            return new HeapNioEncoder(byteBuffer);
        }
        if (byteBuffer.isDirect() && !byteBuffer.isReadOnly()) {
            if (UnsafeDirectNioEncoder.isSupported()) {
                return newUnsafeInstance(byteBuffer);
            }
            return newSafeInstance(byteBuffer);
        }
        throw new IllegalArgumentException("ByteBuffer is read-only");
    }

    @Deprecated
    public static CodedOutputStream newInstance(ByteBuffer byteBuffer, int i12) {
        return newInstance(byteBuffer);
    }

    public static CodedOutputStream newInstance(ByteOutput byteOutput, int i12) {
        if (i12 >= 0) {
            return new ByteOutputEncoder(byteOutput, i12);
        }
        throw new IllegalArgumentException("bufferSize must be positive");
    }
}
