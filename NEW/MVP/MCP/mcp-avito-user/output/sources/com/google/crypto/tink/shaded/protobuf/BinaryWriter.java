package com.google.crypto.tink.shaded.protobuf;

import android.support.v4.media.session.PlaybackStateCompat;
import androidx.compose.ui.graphics.colorspace.e;
import com.google.crypto.tink.shaded.protobuf.Internal;
import com.google.crypto.tink.shaded.protobuf.MapEntryLite;
import com.google.crypto.tink.shaded.protobuf.Utf8;
import com.google.crypto.tink.shaded.protobuf.WireFormat;
import com.google.crypto.tink.shaded.protobuf.Writer;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import okhttp3.internal.http2.Http2;

@CheckReturnValue
/* loaded from: classes6.dex */
abstract class BinaryWriter extends ByteOutput implements Writer {
    public static final int DEFAULT_CHUNK_SIZE = 4096;
    private static final int MAP_KEY_NUMBER = 1;
    private static final int MAP_VALUE_NUMBER = 2;
    private final BufferAllocator alloc;
    final ArrayDeque<AllocatedBuffer> buffers;
    private final int chunkSize;
    int totalDoneBytes;

    /* renamed from: com.google.crypto.tink.shaded.protobuf.BinaryWriter$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$WireFormat$FieldType;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            $SwitchMap$com$google$protobuf$WireFormat$FieldType = iArr;
            try {
                iArr[WireFormat.FieldType.BOOL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.FIXED32.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.FIXED64.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.INT32.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.INT64.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.SFIXED32.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.SFIXED64.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.SINT32.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.SINT64.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.STRING.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.UINT32.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.UINT64.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.FLOAT.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.DOUBLE.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.MESSAGE.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.BYTES.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                $SwitchMap$com$google$protobuf$WireFormat$FieldType[WireFormat.FieldType.ENUM.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    public static final class SafeDirectWriter extends BinaryWriter {
        private ByteBuffer buffer;
        private int limitMinusOne;
        private int pos;

        public SafeDirectWriter(BufferAllocator bufferAllocator, int i12) {
            super(bufferAllocator, i12, null);
            nextBuffer();
        }

        private int bytesWrittenToCurrentBuffer() {
            return this.limitMinusOne - this.pos;
        }

        private void nextBuffer() {
            nextBuffer(newDirectBuffer());
        }

        private int spaceLeft() {
            return this.pos + 1;
        }

        private void writeVarint32FiveBytes(int i12) {
            ByteBuffer byteBuffer = this.buffer;
            int i13 = this.pos;
            this.pos = i13 - 1;
            byteBuffer.put(i13, (byte) (i12 >>> 28));
            int i14 = this.pos;
            this.pos = i14 - 4;
            this.buffer.putInt(i14 - 3, (i12 & 127) | 128 | ((((i12 >>> 21) & 127) | 128) << 24) | ((((i12 >>> 14) & 127) | 128) << 16) | ((((i12 >>> 7) & 127) | 128) << 8));
        }

        private void writeVarint32FourBytes(int i12) {
            int i13 = this.pos;
            this.pos = i13 - 4;
            this.buffer.putInt(i13 - 3, (i12 & 127) | 128 | ((266338304 & i12) << 3) | (((2080768 & i12) | 2097152) << 2) | (((i12 & 16256) | Http2.INITIAL_MAX_FRAME_SIZE) << 1));
        }

        private void writeVarint32OneByte(int i12) {
            ByteBuffer byteBuffer = this.buffer;
            int i13 = this.pos;
            this.pos = i13 - 1;
            byteBuffer.put(i13, (byte) i12);
        }

        private void writeVarint32ThreeBytes(int i12) {
            int i13 = this.pos - 3;
            this.pos = i13;
            this.buffer.putInt(i13, (((i12 & 127) | 128) << 8) | ((2080768 & i12) << 10) | (((i12 & 16256) | Http2.INITIAL_MAX_FRAME_SIZE) << 9));
        }

        private void writeVarint32TwoBytes(int i12) {
            int i13 = this.pos;
            this.pos = i13 - 2;
            this.buffer.putShort(i13 - 1, (short) ((i12 & 127) | 128 | ((i12 & 16256) << 1)));
        }

        private void writeVarint64EightBytes(long j12) {
            int i12 = this.pos;
            this.pos = i12 - 8;
            this.buffer.putLong(i12 - 7, (j12 & 127) | 128 | ((71494644084506624L & j12) << 7) | (((558551906910208L & j12) | 562949953421312L) << 6) | (((4363686772736L & j12) | 4398046511104L) << 5) | (((34091302912L & j12) | 34359738368L) << 4) | (((266338304 & j12) | 268435456) << 3) | (((2080768 & j12) | PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE) << 2) | (((16256 & j12) | 16384) << 1));
        }

        private void writeVarint64EightBytesWithSign(long j12) {
            int i12 = this.pos;
            this.pos = i12 - 8;
            this.buffer.putLong(i12 - 7, (j12 & 127) | 128 | (((71494644084506624L & j12) | 72057594037927936L) << 7) | (((558551906910208L & j12) | 562949953421312L) << 6) | (((4363686772736L & j12) | 4398046511104L) << 5) | (((34091302912L & j12) | 34359738368L) << 4) | (((266338304 & j12) | 268435456) << 3) | (((2080768 & j12) | PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE) << 2) | (((16256 & j12) | 16384) << 1));
        }

        private void writeVarint64FiveBytes(long j12) {
            int i12 = this.pos;
            this.pos = i12 - 5;
            this.buffer.putLong(i12 - 7, (((j12 & 127) | 128) << 24) | ((34091302912L & j12) << 28) | (((266338304 & j12) | 268435456) << 27) | (((2080768 & j12) | PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE) << 26) | (((16256 & j12) | 16384) << 25));
        }

        private void writeVarint64FourBytes(long j12) {
            writeVarint32FourBytes((int) j12);
        }

        private void writeVarint64NineBytes(long j12) {
            ByteBuffer byteBuffer = this.buffer;
            int i12 = this.pos;
            this.pos = i12 - 1;
            byteBuffer.put(i12, (byte) (j12 >>> 56));
            writeVarint64EightBytesWithSign(j12 & 72057594037927935L);
        }

        private void writeVarint64OneByte(long j12) {
            writeVarint32OneByte((int) j12);
        }

        private void writeVarint64SevenBytes(long j12) {
            int i12 = this.pos - 7;
            this.pos = i12;
            this.buffer.putLong(i12, (((j12 & 127) | 128) << 8) | ((558551906910208L & j12) << 14) | (((4363686772736L & j12) | 4398046511104L) << 13) | (((34091302912L & j12) | 34359738368L) << 12) | (((266338304 & j12) | 268435456) << 11) | (((2080768 & j12) | PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE) << 10) | (((16256 & j12) | 16384) << 9));
        }

        private void writeVarint64SixBytes(long j12) {
            int i12 = this.pos;
            this.pos = i12 - 6;
            this.buffer.putLong(i12 - 7, (((j12 & 127) | 128) << 16) | ((4363686772736L & j12) << 21) | (((34091302912L & j12) | 34359738368L) << 20) | (((266338304 & j12) | 268435456) << 19) | (((2080768 & j12) | PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE) << 18) | (((16256 & j12) | 16384) << 17));
        }

        private void writeVarint64TenBytes(long j12) {
            ByteBuffer byteBuffer = this.buffer;
            int i12 = this.pos;
            this.pos = i12 - 1;
            byteBuffer.put(i12, (byte) (j12 >>> 63));
            ByteBuffer byteBuffer2 = this.buffer;
            int i13 = this.pos;
            this.pos = i13 - 1;
            byteBuffer2.put(i13, (byte) (((j12 >>> 56) & 127) | 128));
            writeVarint64EightBytesWithSign(j12 & 72057594037927935L);
        }

        private void writeVarint64ThreeBytes(long j12) {
            writeVarint32ThreeBytes((int) j12);
        }

        private void writeVarint64TwoBytes(long j12) {
            writeVarint32TwoBytes((int) j12);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.BinaryWriter
        public void finishCurrentBuffer() {
            if (this.buffer != null) {
                this.totalDoneBytes += bytesWrittenToCurrentBuffer();
                this.buffer.position(this.pos + 1);
                this.buffer = null;
                this.pos = 0;
                this.limitMinusOne = 0;
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.BinaryWriter
        public int getTotalBytesWritten() {
            return this.totalDoneBytes + bytesWrittenToCurrentBuffer();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.BinaryWriter
        public void requireSpace(int i12) {
            if (spaceLeft() < i12) {
                nextBuffer(i12);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteOutput
        public void write(byte b12) {
            ByteBuffer byteBuffer = this.buffer;
            int i12 = this.pos;
            this.pos = i12 - 1;
            byteBuffer.put(i12, b12);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public void writeBool(int i12, boolean z12) {
            requireSpace(6);
            write(z12 ? (byte) 1 : (byte) 0);
            writeTag(i12, 0);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public void writeBytes(int i12, ByteString byteString) {
            try {
                byteString.writeToReverse(this);
                requireSpace(10);
                writeVarint32(byteString.size());
                writeTag(i12, 2);
            } catch (IOException e12) {
                throw new RuntimeException(e12);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        @Deprecated
        public void writeEndGroup(int i12) {
            writeTag(i12, 4);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public void writeFixed32(int i12, int i13) {
            requireSpace(9);
            writeFixed32(i13);
            writeTag(i12, 5);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public void writeFixed64(int i12, long j12) {
            requireSpace(13);
            writeFixed64(j12);
            writeTag(i12, 1);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        @Deprecated
        public void writeGroup(int i12, Object obj) {
            writeTag(i12, 4);
            Protobuf.getInstance().writeTo(obj, this);
            writeTag(i12, 3);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public void writeInt32(int i12, int i13) {
            requireSpace(15);
            writeInt32(i13);
            writeTag(i12, 0);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteOutput
        public void writeLazy(byte[] bArr, int i12, int i13) {
            if (spaceLeft() < i13) {
                this.totalDoneBytes += i13;
                this.buffers.addFirst(AllocatedBuffer.wrap(bArr, i12, i13));
                nextBuffer();
            } else {
                int i14 = this.pos - i13;
                this.pos = i14;
                this.buffer.position(i14 + 1);
                this.buffer.put(bArr, i12, i13);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public void writeMessage(int i12, Object obj) {
            int totalBytesWritten = getTotalBytesWritten();
            Protobuf.getInstance().writeTo(obj, this);
            int totalBytesWritten2 = getTotalBytesWritten() - totalBytesWritten;
            requireSpace(10);
            writeVarint32(totalBytesWritten2);
            writeTag(i12, 2);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public void writeSInt32(int i12, int i13) {
            requireSpace(10);
            writeSInt32(i13);
            writeTag(i12, 0);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public void writeSInt64(int i12, long j12) {
            requireSpace(15);
            writeSInt64(j12);
            writeTag(i12, 0);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        @Deprecated
        public void writeStartGroup(int i12) {
            writeTag(i12, 3);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public void writeString(int i12, String str) {
            int totalBytesWritten = getTotalBytesWritten();
            writeString(str);
            int totalBytesWritten2 = getTotalBytesWritten() - totalBytesWritten;
            requireSpace(10);
            writeVarint32(totalBytesWritten2);
            writeTag(i12, 2);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.BinaryWriter
        public void writeTag(int i12, int i13) {
            writeVarint32(WireFormat.makeTag(i12, i13));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public void writeUInt32(int i12, int i13) {
            requireSpace(10);
            writeVarint32(i13);
            writeTag(i12, 0);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public void writeUInt64(int i12, long j12) {
            requireSpace(15);
            writeVarint64(j12);
            writeTag(i12, 0);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.BinaryWriter
        public void writeVarint32(int i12) {
            if ((i12 & (-128)) == 0) {
                writeVarint32OneByte(i12);
                return;
            }
            if ((i12 & (-16384)) == 0) {
                writeVarint32TwoBytes(i12);
                return;
            }
            if (((-2097152) & i12) == 0) {
                writeVarint32ThreeBytes(i12);
            } else if (((-268435456) & i12) == 0) {
                writeVarint32FourBytes(i12);
            } else {
                writeVarint32FiveBytes(i12);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.BinaryWriter
        public void writeVarint64(long j12) {
            switch (BinaryWriter.computeUInt64SizeNoTag(j12)) {
                case 1:
                    writeVarint64OneByte(j12);
                    break;
                case 2:
                    writeVarint64TwoBytes(j12);
                    break;
                case 3:
                    writeVarint64ThreeBytes(j12);
                    break;
                case 4:
                    writeVarint64FourBytes(j12);
                    break;
                case 5:
                    writeVarint64FiveBytes(j12);
                    break;
                case 6:
                    writeVarint64SixBytes(j12);
                    break;
                case 7:
                    writeVarint64SevenBytes(j12);
                    break;
                case 8:
                    writeVarint64EightBytes(j12);
                    break;
                case 9:
                    writeVarint64NineBytes(j12);
                    break;
                case 10:
                    writeVarint64TenBytes(j12);
                    break;
            }
        }

        private void nextBuffer(int i12) {
            nextBuffer(newDirectBuffer(i12));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteOutput
        public void write(byte[] bArr, int i12, int i13) {
            if (spaceLeft() < i13) {
                nextBuffer(i13);
            }
            int i14 = this.pos - i13;
            this.pos = i14;
            this.buffer.position(i14 + 1);
            this.buffer.put(bArr, i12, i13);
        }

        private void nextBuffer(AllocatedBuffer allocatedBuffer) {
            if (allocatedBuffer.hasNioBuffer()) {
                ByteBuffer byteBufferNioBuffer = allocatedBuffer.nioBuffer();
                if (byteBufferNioBuffer.isDirect()) {
                    finishCurrentBuffer();
                    this.buffers.addFirst(allocatedBuffer);
                    this.buffer = byteBufferNioBuffer;
                    byteBufferNioBuffer.limit(byteBufferNioBuffer.capacity());
                    this.buffer.position(0);
                    this.buffer.order(ByteOrder.LITTLE_ENDIAN);
                    int iLimit = this.buffer.limit() - 1;
                    this.limitMinusOne = iLimit;
                    this.pos = iLimit;
                    return;
                }
                throw new RuntimeException("Allocator returned non-direct buffer");
            }
            throw new RuntimeException("Allocated buffer does not have NIO buffer");
        }

        @Override // com.google.crypto.tink.shaded.protobuf.BinaryWriter
        public void writeBool(boolean z12) {
            write(z12 ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.BinaryWriter
        public void writeFixed32(int i12) {
            int i13 = this.pos;
            this.pos = i13 - 4;
            this.buffer.putInt(i13 - 3, i12);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.BinaryWriter
        public void writeFixed64(long j12) {
            int i12 = this.pos;
            this.pos = i12 - 8;
            this.buffer.putLong(i12 - 7, j12);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public void writeGroup(int i12, Object obj, Schema schema) {
            writeTag(i12, 4);
            schema.writeTo(obj, this);
            writeTag(i12, 3);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.BinaryWriter
        public void writeInt32(int i12) {
            if (i12 >= 0) {
                writeVarint32(i12);
            } else {
                writeVarint64(i12);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.BinaryWriter
        public void writeSInt32(int i12) {
            writeVarint32(CodedOutputStream.encodeZigZag32(i12));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.BinaryWriter
        public void writeSInt64(long j12) {
            writeVarint64(CodedOutputStream.encodeZigZag64(j12));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteOutput
        public void write(ByteBuffer byteBuffer) {
            int iRemaining = byteBuffer.remaining();
            if (spaceLeft() < iRemaining) {
                nextBuffer(iRemaining);
            }
            int i12 = this.pos - iRemaining;
            this.pos = i12;
            this.buffer.position(i12 + 1);
            this.buffer.put(byteBuffer);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public void writeMessage(int i12, Object obj, Schema schema) {
            int totalBytesWritten = getTotalBytesWritten();
            schema.writeTo(obj, this);
            int totalBytesWritten2 = getTotalBytesWritten() - totalBytesWritten;
            requireSpace(10);
            writeVarint32(totalBytesWritten2);
            writeTag(i12, 2);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.BinaryWriter
        public void writeString(String str) {
            int i12;
            int i13;
            int i14;
            char cCharAt;
            requireSpace(str.length());
            int length = str.length() - 1;
            this.pos -= length;
            while (length >= 0 && (cCharAt = str.charAt(length)) < 128) {
                this.buffer.put(this.pos + length, (byte) cCharAt);
                length--;
            }
            if (length == -1) {
                this.pos--;
                return;
            }
            this.pos += length;
            while (length >= 0) {
                char cCharAt2 = str.charAt(length);
                if (cCharAt2 < 128 && (i14 = this.pos) >= 0) {
                    ByteBuffer byteBuffer = this.buffer;
                    this.pos = i14 - 1;
                    byteBuffer.put(i14, (byte) cCharAt2);
                } else if (cCharAt2 < 2048 && (i13 = this.pos) > 0) {
                    ByteBuffer byteBuffer2 = this.buffer;
                    this.pos = i13 - 1;
                    byteBuffer2.put(i13, (byte) ((cCharAt2 & '?') | 128));
                    ByteBuffer byteBuffer3 = this.buffer;
                    int i15 = this.pos;
                    this.pos = i15 - 1;
                    byteBuffer3.put(i15, (byte) ((cCharAt2 >>> 6) | 960));
                } else if ((cCharAt2 < 55296 || 57343 < cCharAt2) && (i12 = this.pos) > 1) {
                    ByteBuffer byteBuffer4 = this.buffer;
                    this.pos = i12 - 1;
                    byteBuffer4.put(i12, (byte) ((cCharAt2 & '?') | 128));
                    ByteBuffer byteBuffer5 = this.buffer;
                    int i16 = this.pos;
                    this.pos = i16 - 1;
                    byteBuffer5.put(i16, (byte) (((cCharAt2 >>> 6) & 63) | 128));
                    ByteBuffer byteBuffer6 = this.buffer;
                    int i17 = this.pos;
                    this.pos = i17 - 1;
                    byteBuffer6.put(i17, (byte) ((cCharAt2 >>> '\f') | 480));
                } else {
                    if (this.pos > 2) {
                        if (length != 0) {
                            char cCharAt3 = str.charAt(length - 1);
                            if (Character.isSurrogatePair(cCharAt3, cCharAt2)) {
                                length--;
                                int codePoint = Character.toCodePoint(cCharAt3, cCharAt2);
                                ByteBuffer byteBuffer7 = this.buffer;
                                int i18 = this.pos;
                                this.pos = i18 - 1;
                                byteBuffer7.put(i18, (byte) ((codePoint & 63) | 128));
                                ByteBuffer byteBuffer8 = this.buffer;
                                int i19 = this.pos;
                                this.pos = i19 - 1;
                                byteBuffer8.put(i19, (byte) (((codePoint >>> 6) & 63) | 128));
                                ByteBuffer byteBuffer9 = this.buffer;
                                int i22 = this.pos;
                                this.pos = i22 - 1;
                                byteBuffer9.put(i22, (byte) (((codePoint >>> 12) & 63) | 128));
                                ByteBuffer byteBuffer10 = this.buffer;
                                int i23 = this.pos;
                                this.pos = i23 - 1;
                                byteBuffer10.put(i23, (byte) ((codePoint >>> 18) | 240));
                            }
                        }
                        throw new Utf8.UnpairedSurrogateException(length - 1, length);
                    }
                    requireSpace(length);
                    length++;
                }
                length--;
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteOutput
        public void writeLazy(ByteBuffer byteBuffer) {
            int iRemaining = byteBuffer.remaining();
            if (spaceLeft() < iRemaining) {
                this.totalDoneBytes += iRemaining;
                this.buffers.addFirst(AllocatedBuffer.wrap(byteBuffer));
                nextBuffer();
            } else {
                int i12 = this.pos - iRemaining;
                this.pos = i12;
                this.buffer.position(i12 + 1);
                this.buffer.put(byteBuffer);
            }
        }
    }

    public static final class SafeHeapWriter extends BinaryWriter {
        private AllocatedBuffer allocatedBuffer;
        private byte[] buffer;
        private int limit;
        private int limitMinusOne;
        private int offset;
        private int offsetMinusOne;
        private int pos;

        public SafeHeapWriter(BufferAllocator bufferAllocator, int i12) {
            super(bufferAllocator, i12, null);
            nextBuffer();
        }

        private void nextBuffer() {
            nextBuffer(newHeapBuffer());
        }

        private void writeVarint32FiveBytes(int i12) {
            byte[] bArr = this.buffer;
            int i13 = this.pos;
            int i14 = i13 - 1;
            this.pos = i14;
            bArr[i13] = (byte) (i12 >>> 28);
            int i15 = i13 - 2;
            this.pos = i15;
            bArr[i14] = (byte) (((i12 >>> 21) & 127) | 128);
            int i16 = i13 - 3;
            this.pos = i16;
            bArr[i15] = (byte) (((i12 >>> 14) & 127) | 128);
            int i17 = i13 - 4;
            this.pos = i17;
            bArr[i16] = (byte) (((i12 >>> 7) & 127) | 128);
            this.pos = i13 - 5;
            bArr[i17] = (byte) ((i12 & 127) | 128);
        }

        private void writeVarint32FourBytes(int i12) {
            byte[] bArr = this.buffer;
            int i13 = this.pos;
            int i14 = i13 - 1;
            this.pos = i14;
            bArr[i13] = (byte) (i12 >>> 21);
            int i15 = i13 - 2;
            this.pos = i15;
            bArr[i14] = (byte) (((i12 >>> 14) & 127) | 128);
            int i16 = i13 - 3;
            this.pos = i16;
            bArr[i15] = (byte) (((i12 >>> 7) & 127) | 128);
            this.pos = i13 - 4;
            bArr[i16] = (byte) ((i12 & 127) | 128);
        }

        private void writeVarint32OneByte(int i12) {
            byte[] bArr = this.buffer;
            int i13 = this.pos;
            this.pos = i13 - 1;
            bArr[i13] = (byte) i12;
        }

        private void writeVarint32ThreeBytes(int i12) {
            byte[] bArr = this.buffer;
            int i13 = this.pos;
            int i14 = i13 - 1;
            this.pos = i14;
            bArr[i13] = (byte) (i12 >>> 14);
            int i15 = i13 - 2;
            this.pos = i15;
            bArr[i14] = (byte) (((i12 >>> 7) & 127) | 128);
            this.pos = i13 - 3;
            bArr[i15] = (byte) ((i12 & 127) | 128);
        }

        private void writeVarint32TwoBytes(int i12) {
            byte[] bArr = this.buffer;
            int i13 = this.pos;
            int i14 = i13 - 1;
            this.pos = i14;
            bArr[i13] = (byte) (i12 >>> 7);
            this.pos = i13 - 2;
            bArr[i14] = (byte) ((i12 & 127) | 128);
        }

        private void writeVarint64EightBytes(long j12) {
            byte[] bArr = this.buffer;
            int i12 = this.pos;
            int i13 = i12 - 1;
            this.pos = i13;
            bArr[i12] = (byte) (j12 >>> 49);
            int i14 = i12 - 2;
            this.pos = i14;
            bArr[i13] = (byte) (((j12 >>> 42) & 127) | 128);
            int i15 = i12 - 3;
            this.pos = i15;
            bArr[i14] = (byte) (((j12 >>> 35) & 127) | 128);
            int i16 = i12 - 4;
            this.pos = i16;
            bArr[i15] = (byte) (((j12 >>> 28) & 127) | 128);
            int i17 = i12 - 5;
            this.pos = i17;
            bArr[i16] = (byte) (((j12 >>> 21) & 127) | 128);
            int i18 = i12 - 6;
            this.pos = i18;
            bArr[i17] = (byte) (((j12 >>> 14) & 127) | 128);
            int i19 = i12 - 7;
            this.pos = i19;
            bArr[i18] = (byte) (((j12 >>> 7) & 127) | 128);
            this.pos = i12 - 8;
            bArr[i19] = (byte) ((j12 & 127) | 128);
        }

        private void writeVarint64FiveBytes(long j12) {
            byte[] bArr = this.buffer;
            int i12 = this.pos;
            int i13 = i12 - 1;
            this.pos = i13;
            bArr[i12] = (byte) (j12 >>> 28);
            int i14 = i12 - 2;
            this.pos = i14;
            bArr[i13] = (byte) (((j12 >>> 21) & 127) | 128);
            int i15 = i12 - 3;
            this.pos = i15;
            bArr[i14] = (byte) (((j12 >>> 14) & 127) | 128);
            int i16 = i12 - 4;
            this.pos = i16;
            bArr[i15] = (byte) (((j12 >>> 7) & 127) | 128);
            this.pos = i12 - 5;
            bArr[i16] = (byte) ((j12 & 127) | 128);
        }

        private void writeVarint64FourBytes(long j12) {
            byte[] bArr = this.buffer;
            int i12 = this.pos;
            int i13 = i12 - 1;
            this.pos = i13;
            bArr[i12] = (byte) (j12 >>> 21);
            int i14 = i12 - 2;
            this.pos = i14;
            bArr[i13] = (byte) (((j12 >>> 14) & 127) | 128);
            int i15 = i12 - 3;
            this.pos = i15;
            bArr[i14] = (byte) (((j12 >>> 7) & 127) | 128);
            this.pos = i12 - 4;
            bArr[i15] = (byte) ((j12 & 127) | 128);
        }

        private void writeVarint64NineBytes(long j12) {
            byte[] bArr = this.buffer;
            int i12 = this.pos;
            int i13 = i12 - 1;
            this.pos = i13;
            bArr[i12] = (byte) (j12 >>> 56);
            int i14 = i12 - 2;
            this.pos = i14;
            bArr[i13] = (byte) (((j12 >>> 49) & 127) | 128);
            int i15 = i12 - 3;
            this.pos = i15;
            bArr[i14] = (byte) (((j12 >>> 42) & 127) | 128);
            int i16 = i12 - 4;
            this.pos = i16;
            bArr[i15] = (byte) (((j12 >>> 35) & 127) | 128);
            int i17 = i12 - 5;
            this.pos = i17;
            bArr[i16] = (byte) (((j12 >>> 28) & 127) | 128);
            int i18 = i12 - 6;
            this.pos = i18;
            bArr[i17] = (byte) (((j12 >>> 21) & 127) | 128);
            int i19 = i12 - 7;
            this.pos = i19;
            bArr[i18] = (byte) (((j12 >>> 14) & 127) | 128);
            int i22 = i12 - 8;
            this.pos = i22;
            bArr[i19] = (byte) (((j12 >>> 7) & 127) | 128);
            this.pos = i12 - 9;
            bArr[i22] = (byte) ((j12 & 127) | 128);
        }

        private void writeVarint64OneByte(long j12) {
            byte[] bArr = this.buffer;
            int i12 = this.pos;
            this.pos = i12 - 1;
            bArr[i12] = (byte) j12;
        }

        private void writeVarint64SevenBytes(long j12) {
            byte[] bArr = this.buffer;
            int i12 = this.pos;
            int i13 = i12 - 1;
            this.pos = i13;
            bArr[i12] = (byte) (j12 >>> 42);
            int i14 = i12 - 2;
            this.pos = i14;
            bArr[i13] = (byte) (((j12 >>> 35) & 127) | 128);
            int i15 = i12 - 3;
            this.pos = i15;
            bArr[i14] = (byte) (((j12 >>> 28) & 127) | 128);
            int i16 = i12 - 4;
            this.pos = i16;
            bArr[i15] = (byte) (((j12 >>> 21) & 127) | 128);
            int i17 = i12 - 5;
            this.pos = i17;
            bArr[i16] = (byte) (((j12 >>> 14) & 127) | 128);
            int i18 = i12 - 6;
            this.pos = i18;
            bArr[i17] = (byte) (((j12 >>> 7) & 127) | 128);
            this.pos = i12 - 7;
            bArr[i18] = (byte) ((j12 & 127) | 128);
        }

        private void writeVarint64SixBytes(long j12) {
            byte[] bArr = this.buffer;
            int i12 = this.pos;
            int i13 = i12 - 1;
            this.pos = i13;
            bArr[i12] = (byte) (j12 >>> 35);
            int i14 = i12 - 2;
            this.pos = i14;
            bArr[i13] = (byte) (((j12 >>> 28) & 127) | 128);
            int i15 = i12 - 3;
            this.pos = i15;
            bArr[i14] = (byte) (((j12 >>> 21) & 127) | 128);
            int i16 = i12 - 4;
            this.pos = i16;
            bArr[i15] = (byte) (((j12 >>> 14) & 127) | 128);
            int i17 = i12 - 5;
            this.pos = i17;
            bArr[i16] = (byte) (((j12 >>> 7) & 127) | 128);
            this.pos = i12 - 6;
            bArr[i17] = (byte) ((j12 & 127) | 128);
        }

        private void writeVarint64TenBytes(long j12) {
            byte[] bArr = this.buffer;
            int i12 = this.pos;
            int i13 = i12 - 1;
            this.pos = i13;
            bArr[i12] = (byte) (j12 >>> 63);
            int i14 = i12 - 2;
            this.pos = i14;
            bArr[i13] = (byte) (((j12 >>> 56) & 127) | 128);
            int i15 = i12 - 3;
            this.pos = i15;
            bArr[i14] = (byte) (((j12 >>> 49) & 127) | 128);
            int i16 = i12 - 4;
            this.pos = i16;
            bArr[i15] = (byte) (((j12 >>> 42) & 127) | 128);
            int i17 = i12 - 5;
            this.pos = i17;
            bArr[i16] = (byte) (((j12 >>> 35) & 127) | 128);
            int i18 = i12 - 6;
            this.pos = i18;
            bArr[i17] = (byte) (((j12 >>> 28) & 127) | 128);
            int i19 = i12 - 7;
            this.pos = i19;
            bArr[i18] = (byte) (((j12 >>> 21) & 127) | 128);
            int i22 = i12 - 8;
            this.pos = i22;
            bArr[i19] = (byte) (((j12 >>> 14) & 127) | 128);
            int i23 = i12 - 9;
            this.pos = i23;
            bArr[i22] = (byte) (((j12 >>> 7) & 127) | 128);
            this.pos = i12 - 10;
            bArr[i23] = (byte) ((j12 & 127) | 128);
        }

        private void writeVarint64ThreeBytes(long j12) {
            byte[] bArr = this.buffer;
            int i12 = this.pos;
            int i13 = i12 - 1;
            this.pos = i13;
            bArr[i12] = (byte) (((int) j12) >>> 14);
            int i14 = i12 - 2;
            this.pos = i14;
            bArr[i13] = (byte) (((j12 >>> 7) & 127) | 128);
            this.pos = i12 - 3;
            bArr[i14] = (byte) ((j12 & 127) | 128);
        }

        private void writeVarint64TwoBytes(long j12) {
            byte[] bArr = this.buffer;
            int i12 = this.pos;
            int i13 = i12 - 1;
            this.pos = i13;
            bArr[i12] = (byte) (j12 >>> 7);
            this.pos = i12 - 2;
            bArr[i13] = (byte) ((((int) j12) & 127) | 128);
        }

        public int bytesWrittenToCurrentBuffer() {
            return this.limitMinusOne - this.pos;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.BinaryWriter
        public void finishCurrentBuffer() {
            if (this.allocatedBuffer != null) {
                this.totalDoneBytes += bytesWrittenToCurrentBuffer();
                AllocatedBuffer allocatedBuffer = this.allocatedBuffer;
                allocatedBuffer.position((this.pos - allocatedBuffer.arrayOffset()) + 1);
                this.allocatedBuffer = null;
                this.pos = 0;
                this.limitMinusOne = 0;
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.BinaryWriter
        public int getTotalBytesWritten() {
            return this.totalDoneBytes + bytesWrittenToCurrentBuffer();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.BinaryWriter
        public void requireSpace(int i12) {
            if (spaceLeft() < i12) {
                nextBuffer(i12);
            }
        }

        public int spaceLeft() {
            return this.pos - this.offsetMinusOne;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteOutput
        public void write(byte b12) {
            byte[] bArr = this.buffer;
            int i12 = this.pos;
            this.pos = i12 - 1;
            bArr[i12] = b12;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public void writeBool(int i12, boolean z12) {
            requireSpace(6);
            write(z12 ? (byte) 1 : (byte) 0);
            writeTag(i12, 0);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public void writeBytes(int i12, ByteString byteString) {
            try {
                byteString.writeToReverse(this);
                requireSpace(10);
                writeVarint32(byteString.size());
                writeTag(i12, 2);
            } catch (IOException e12) {
                throw new RuntimeException(e12);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public void writeEndGroup(int i12) {
            writeTag(i12, 4);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public void writeFixed32(int i12, int i13) {
            requireSpace(9);
            writeFixed32(i13);
            writeTag(i12, 5);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public void writeFixed64(int i12, long j12) {
            requireSpace(13);
            writeFixed64(j12);
            writeTag(i12, 1);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        @Deprecated
        public void writeGroup(int i12, Object obj) {
            writeTag(i12, 4);
            Protobuf.getInstance().writeTo(obj, this);
            writeTag(i12, 3);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public void writeInt32(int i12, int i13) {
            requireSpace(15);
            writeInt32(i13);
            writeTag(i12, 0);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteOutput
        public void writeLazy(byte[] bArr, int i12, int i13) {
            if (spaceLeft() < i13) {
                this.totalDoneBytes += i13;
                this.buffers.addFirst(AllocatedBuffer.wrap(bArr, i12, i13));
                nextBuffer();
            } else {
                int i14 = this.pos - i13;
                this.pos = i14;
                System.arraycopy(bArr, i12, this.buffer, i14 + 1, i13);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public void writeMessage(int i12, Object obj) {
            int totalBytesWritten = getTotalBytesWritten();
            Protobuf.getInstance().writeTo(obj, this);
            int totalBytesWritten2 = getTotalBytesWritten() - totalBytesWritten;
            requireSpace(10);
            writeVarint32(totalBytesWritten2);
            writeTag(i12, 2);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public void writeSInt32(int i12, int i13) {
            requireSpace(10);
            writeSInt32(i13);
            writeTag(i12, 0);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public void writeSInt64(int i12, long j12) {
            requireSpace(15);
            writeSInt64(j12);
            writeTag(i12, 0);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public void writeStartGroup(int i12) {
            writeTag(i12, 3);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public void writeString(int i12, String str) {
            int totalBytesWritten = getTotalBytesWritten();
            writeString(str);
            int totalBytesWritten2 = getTotalBytesWritten() - totalBytesWritten;
            requireSpace(10);
            writeVarint32(totalBytesWritten2);
            writeTag(i12, 2);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.BinaryWriter
        public void writeTag(int i12, int i13) {
            writeVarint32(WireFormat.makeTag(i12, i13));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public void writeUInt32(int i12, int i13) {
            requireSpace(10);
            writeVarint32(i13);
            writeTag(i12, 0);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public void writeUInt64(int i12, long j12) {
            requireSpace(15);
            writeVarint64(j12);
            writeTag(i12, 0);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.BinaryWriter
        public void writeVarint32(int i12) {
            if ((i12 & (-128)) == 0) {
                writeVarint32OneByte(i12);
                return;
            }
            if ((i12 & (-16384)) == 0) {
                writeVarint32TwoBytes(i12);
                return;
            }
            if (((-2097152) & i12) == 0) {
                writeVarint32ThreeBytes(i12);
            } else if (((-268435456) & i12) == 0) {
                writeVarint32FourBytes(i12);
            } else {
                writeVarint32FiveBytes(i12);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.BinaryWriter
        public void writeVarint64(long j12) {
            switch (BinaryWriter.computeUInt64SizeNoTag(j12)) {
                case 1:
                    writeVarint64OneByte(j12);
                    break;
                case 2:
                    writeVarint64TwoBytes(j12);
                    break;
                case 3:
                    writeVarint64ThreeBytes(j12);
                    break;
                case 4:
                    writeVarint64FourBytes(j12);
                    break;
                case 5:
                    writeVarint64FiveBytes(j12);
                    break;
                case 6:
                    writeVarint64SixBytes(j12);
                    break;
                case 7:
                    writeVarint64SevenBytes(j12);
                    break;
                case 8:
                    writeVarint64EightBytes(j12);
                    break;
                case 9:
                    writeVarint64NineBytes(j12);
                    break;
                case 10:
                    writeVarint64TenBytes(j12);
                    break;
            }
        }

        private void nextBuffer(int i12) {
            nextBuffer(newHeapBuffer(i12));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteOutput
        public void write(byte[] bArr, int i12, int i13) {
            if (spaceLeft() < i13) {
                nextBuffer(i13);
            }
            int i14 = this.pos - i13;
            this.pos = i14;
            System.arraycopy(bArr, i12, this.buffer, i14 + 1, i13);
        }

        private void nextBuffer(AllocatedBuffer allocatedBuffer) {
            if (allocatedBuffer.hasArray()) {
                finishCurrentBuffer();
                this.buffers.addFirst(allocatedBuffer);
                this.allocatedBuffer = allocatedBuffer;
                this.buffer = allocatedBuffer.array();
                int iArrayOffset = allocatedBuffer.arrayOffset();
                this.limit = allocatedBuffer.limit() + iArrayOffset;
                int iPosition = iArrayOffset + allocatedBuffer.position();
                this.offset = iPosition;
                this.offsetMinusOne = iPosition - 1;
                int i12 = this.limit - 1;
                this.limitMinusOne = i12;
                this.pos = i12;
                return;
            }
            throw new RuntimeException("Allocator returned non-heap buffer");
        }

        @Override // com.google.crypto.tink.shaded.protobuf.BinaryWriter
        public void writeBool(boolean z12) {
            write(z12 ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.BinaryWriter
        public void writeFixed32(int i12) {
            byte[] bArr = this.buffer;
            int i13 = this.pos;
            int i14 = i13 - 1;
            this.pos = i14;
            bArr[i13] = (byte) ((i12 >> 24) & 255);
            int i15 = i13 - 2;
            this.pos = i15;
            bArr[i14] = (byte) ((i12 >> 16) & 255);
            int i16 = i13 - 3;
            this.pos = i16;
            bArr[i15] = (byte) ((i12 >> 8) & 255);
            this.pos = i13 - 4;
            bArr[i16] = (byte) (i12 & 255);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.BinaryWriter
        public void writeFixed64(long j12) {
            byte[] bArr = this.buffer;
            int i12 = this.pos;
            int i13 = i12 - 1;
            this.pos = i13;
            bArr[i12] = (byte) (((int) (j12 >> 56)) & 255);
            int i14 = i12 - 2;
            this.pos = i14;
            bArr[i13] = (byte) (((int) (j12 >> 48)) & 255);
            int i15 = i12 - 3;
            this.pos = i15;
            bArr[i14] = (byte) (((int) (j12 >> 40)) & 255);
            int i16 = i12 - 4;
            this.pos = i16;
            bArr[i15] = (byte) (((int) (j12 >> 32)) & 255);
            int i17 = i12 - 5;
            this.pos = i17;
            bArr[i16] = (byte) (((int) (j12 >> 24)) & 255);
            int i18 = i12 - 6;
            this.pos = i18;
            bArr[i17] = (byte) (((int) (j12 >> 16)) & 255);
            int i19 = i12 - 7;
            this.pos = i19;
            bArr[i18] = (byte) (((int) (j12 >> 8)) & 255);
            this.pos = i12 - 8;
            bArr[i19] = (byte) (((int) j12) & 255);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public void writeGroup(int i12, Object obj, Schema schema) {
            writeTag(i12, 4);
            schema.writeTo(obj, this);
            writeTag(i12, 3);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.BinaryWriter
        public void writeInt32(int i12) {
            if (i12 >= 0) {
                writeVarint32(i12);
            } else {
                writeVarint64(i12);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.BinaryWriter
        public void writeSInt32(int i12) {
            writeVarint32(CodedOutputStream.encodeZigZag32(i12));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.BinaryWriter
        public void writeSInt64(long j12) {
            writeVarint64(CodedOutputStream.encodeZigZag64(j12));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteOutput
        public void write(ByteBuffer byteBuffer) {
            int iRemaining = byteBuffer.remaining();
            if (spaceLeft() < iRemaining) {
                nextBuffer(iRemaining);
            }
            int i12 = this.pos - iRemaining;
            this.pos = i12;
            byteBuffer.get(this.buffer, i12 + 1, iRemaining);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteOutput
        public void writeLazy(ByteBuffer byteBuffer) {
            int iRemaining = byteBuffer.remaining();
            if (spaceLeft() < iRemaining) {
                this.totalDoneBytes += iRemaining;
                this.buffers.addFirst(AllocatedBuffer.wrap(byteBuffer));
                nextBuffer();
            }
            int i12 = this.pos - iRemaining;
            this.pos = i12;
            byteBuffer.get(this.buffer, i12 + 1, iRemaining);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public void writeMessage(int i12, Object obj, Schema schema) {
            int totalBytesWritten = getTotalBytesWritten();
            schema.writeTo(obj, this);
            int totalBytesWritten2 = getTotalBytesWritten() - totalBytesWritten;
            requireSpace(10);
            writeVarint32(totalBytesWritten2);
            writeTag(i12, 2);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.BinaryWriter
        public void writeString(String str) {
            int i12;
            int i13;
            int i14;
            char cCharAt;
            requireSpace(str.length());
            int length = str.length() - 1;
            this.pos -= length;
            while (length >= 0 && (cCharAt = str.charAt(length)) < 128) {
                this.buffer[this.pos + length] = (byte) cCharAt;
                length--;
            }
            if (length == -1) {
                this.pos--;
                return;
            }
            this.pos += length;
            while (length >= 0) {
                char cCharAt2 = str.charAt(length);
                if (cCharAt2 < 128 && (i14 = this.pos) > this.offsetMinusOne) {
                    byte[] bArr = this.buffer;
                    this.pos = i14 - 1;
                    bArr[i14] = (byte) cCharAt2;
                } else if (cCharAt2 < 2048 && (i13 = this.pos) > this.offset) {
                    byte[] bArr2 = this.buffer;
                    int i15 = i13 - 1;
                    this.pos = i15;
                    bArr2[i13] = (byte) ((cCharAt2 & '?') | 128);
                    this.pos = i13 - 2;
                    bArr2[i15] = (byte) ((cCharAt2 >>> 6) | 960);
                } else if ((cCharAt2 < 55296 || 57343 < cCharAt2) && (i12 = this.pos) > this.offset + 1) {
                    byte[] bArr3 = this.buffer;
                    int i16 = i12 - 1;
                    this.pos = i16;
                    bArr3[i12] = (byte) ((cCharAt2 & '?') | 128);
                    int i17 = i12 - 2;
                    this.pos = i17;
                    bArr3[i16] = (byte) (((cCharAt2 >>> 6) & 63) | 128);
                    this.pos = i12 - 3;
                    bArr3[i17] = (byte) ((cCharAt2 >>> '\f') | 480);
                } else {
                    if (this.pos > this.offset + 2) {
                        if (length != 0) {
                            char cCharAt3 = str.charAt(length - 1);
                            if (Character.isSurrogatePair(cCharAt3, cCharAt2)) {
                                length--;
                                int codePoint = Character.toCodePoint(cCharAt3, cCharAt2);
                                byte[] bArr4 = this.buffer;
                                int i18 = this.pos;
                                int i19 = i18 - 1;
                                this.pos = i19;
                                bArr4[i18] = (byte) ((codePoint & 63) | 128);
                                int i22 = i18 - 2;
                                this.pos = i22;
                                bArr4[i19] = (byte) (((codePoint >>> 6) & 63) | 128);
                                int i23 = i18 - 3;
                                this.pos = i23;
                                bArr4[i22] = (byte) (((codePoint >>> 12) & 63) | 128);
                                this.pos = i18 - 4;
                                bArr4[i23] = (byte) ((codePoint >>> 18) | 240);
                            }
                        }
                        throw new Utf8.UnpairedSurrogateException(length - 1, length);
                    }
                    requireSpace(length);
                    length++;
                }
                length--;
            }
        }
    }

    public static final class UnsafeDirectWriter extends BinaryWriter {
        private ByteBuffer buffer;
        private long bufferOffset;
        private long limitMinusOne;
        private long pos;

        public UnsafeDirectWriter(BufferAllocator bufferAllocator, int i12) {
            super(bufferAllocator, i12, null);
            nextBuffer();
        }

        private int bufferPos() {
            return (int) (this.pos - this.bufferOffset);
        }

        private int bytesWrittenToCurrentBuffer() {
            return (int) (this.limitMinusOne - this.pos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean isSupported() {
            return UnsafeUtil.hasUnsafeByteBufferOperations();
        }

        private void nextBuffer() {
            nextBuffer(newDirectBuffer());
        }

        private int spaceLeft() {
            return bufferPos() + 1;
        }

        private void writeVarint32FiveBytes(int i12) {
            long j12 = this.pos;
            this.pos = j12 - 1;
            UnsafeUtil.putByte(j12, (byte) (i12 >>> 28));
            long j13 = this.pos;
            this.pos = j13 - 1;
            UnsafeUtil.putByte(j13, (byte) (((i12 >>> 21) & 127) | 128));
            long j14 = this.pos;
            this.pos = j14 - 1;
            UnsafeUtil.putByte(j14, (byte) (((i12 >>> 14) & 127) | 128));
            long j15 = this.pos;
            this.pos = j15 - 1;
            UnsafeUtil.putByte(j15, (byte) (((i12 >>> 7) & 127) | 128));
            long j16 = this.pos;
            this.pos = j16 - 1;
            UnsafeUtil.putByte(j16, (byte) ((i12 & 127) | 128));
        }

        private void writeVarint32FourBytes(int i12) {
            long j12 = this.pos;
            this.pos = j12 - 1;
            UnsafeUtil.putByte(j12, (byte) (i12 >>> 21));
            long j13 = this.pos;
            this.pos = j13 - 1;
            UnsafeUtil.putByte(j13, (byte) (((i12 >>> 14) & 127) | 128));
            long j14 = this.pos;
            this.pos = j14 - 1;
            UnsafeUtil.putByte(j14, (byte) (((i12 >>> 7) & 127) | 128));
            long j15 = this.pos;
            this.pos = j15 - 1;
            UnsafeUtil.putByte(j15, (byte) ((i12 & 127) | 128));
        }

        private void writeVarint32OneByte(int i12) {
            long j12 = this.pos;
            this.pos = j12 - 1;
            UnsafeUtil.putByte(j12, (byte) i12);
        }

        private void writeVarint32ThreeBytes(int i12) {
            long j12 = this.pos;
            this.pos = j12 - 1;
            UnsafeUtil.putByte(j12, (byte) (i12 >>> 14));
            long j13 = this.pos;
            this.pos = j13 - 1;
            UnsafeUtil.putByte(j13, (byte) (((i12 >>> 7) & 127) | 128));
            long j14 = this.pos;
            this.pos = j14 - 1;
            UnsafeUtil.putByte(j14, (byte) ((i12 & 127) | 128));
        }

        private void writeVarint32TwoBytes(int i12) {
            long j12 = this.pos;
            this.pos = j12 - 1;
            UnsafeUtil.putByte(j12, (byte) (i12 >>> 7));
            long j13 = this.pos;
            this.pos = j13 - 1;
            UnsafeUtil.putByte(j13, (byte) ((i12 & 127) | 128));
        }

        private void writeVarint64EightBytes(long j12) {
            long j13 = this.pos;
            this.pos = j13 - 1;
            UnsafeUtil.putByte(j13, (byte) (j12 >>> 49));
            long j14 = this.pos;
            this.pos = j14 - 1;
            UnsafeUtil.putByte(j14, (byte) (((j12 >>> 42) & 127) | 128));
            long j15 = this.pos;
            this.pos = j15 - 1;
            UnsafeUtil.putByte(j15, (byte) (((j12 >>> 35) & 127) | 128));
            long j16 = this.pos;
            this.pos = j16 - 1;
            UnsafeUtil.putByte(j16, (byte) (((j12 >>> 28) & 127) | 128));
            long j17 = this.pos;
            this.pos = j17 - 1;
            UnsafeUtil.putByte(j17, (byte) (((j12 >>> 21) & 127) | 128));
            long j18 = this.pos;
            this.pos = j18 - 1;
            UnsafeUtil.putByte(j18, (byte) (((j12 >>> 14) & 127) | 128));
            long j19 = this.pos;
            this.pos = j19 - 1;
            UnsafeUtil.putByte(j19, (byte) (((j12 >>> 7) & 127) | 128));
            long j22 = this.pos;
            this.pos = j22 - 1;
            UnsafeUtil.putByte(j22, (byte) ((j12 & 127) | 128));
        }

        private void writeVarint64FiveBytes(long j12) {
            long j13 = this.pos;
            this.pos = j13 - 1;
            UnsafeUtil.putByte(j13, (byte) (j12 >>> 28));
            long j14 = this.pos;
            this.pos = j14 - 1;
            UnsafeUtil.putByte(j14, (byte) (((j12 >>> 21) & 127) | 128));
            long j15 = this.pos;
            this.pos = j15 - 1;
            UnsafeUtil.putByte(j15, (byte) (((j12 >>> 14) & 127) | 128));
            long j16 = this.pos;
            this.pos = j16 - 1;
            UnsafeUtil.putByte(j16, (byte) (((j12 >>> 7) & 127) | 128));
            long j17 = this.pos;
            this.pos = j17 - 1;
            UnsafeUtil.putByte(j17, (byte) ((j12 & 127) | 128));
        }

        private void writeVarint64FourBytes(long j12) {
            long j13 = this.pos;
            this.pos = j13 - 1;
            UnsafeUtil.putByte(j13, (byte) (j12 >>> 21));
            long j14 = this.pos;
            this.pos = j14 - 1;
            UnsafeUtil.putByte(j14, (byte) (((j12 >>> 14) & 127) | 128));
            long j15 = this.pos;
            this.pos = j15 - 1;
            UnsafeUtil.putByte(j15, (byte) (((j12 >>> 7) & 127) | 128));
            long j16 = this.pos;
            this.pos = j16 - 1;
            UnsafeUtil.putByte(j16, (byte) ((j12 & 127) | 128));
        }

        private void writeVarint64NineBytes(long j12) {
            long j13 = this.pos;
            this.pos = j13 - 1;
            UnsafeUtil.putByte(j13, (byte) (j12 >>> 56));
            long j14 = this.pos;
            this.pos = j14 - 1;
            UnsafeUtil.putByte(j14, (byte) (((j12 >>> 49) & 127) | 128));
            long j15 = this.pos;
            this.pos = j15 - 1;
            UnsafeUtil.putByte(j15, (byte) (((j12 >>> 42) & 127) | 128));
            long j16 = this.pos;
            this.pos = j16 - 1;
            UnsafeUtil.putByte(j16, (byte) (((j12 >>> 35) & 127) | 128));
            long j17 = this.pos;
            this.pos = j17 - 1;
            UnsafeUtil.putByte(j17, (byte) (((j12 >>> 28) & 127) | 128));
            long j18 = this.pos;
            this.pos = j18 - 1;
            UnsafeUtil.putByte(j18, (byte) (((j12 >>> 21) & 127) | 128));
            long j19 = this.pos;
            this.pos = j19 - 1;
            UnsafeUtil.putByte(j19, (byte) (((j12 >>> 14) & 127) | 128));
            long j22 = this.pos;
            this.pos = j22 - 1;
            UnsafeUtil.putByte(j22, (byte) (((j12 >>> 7) & 127) | 128));
            long j23 = this.pos;
            this.pos = j23 - 1;
            UnsafeUtil.putByte(j23, (byte) ((j12 & 127) | 128));
        }

        private void writeVarint64OneByte(long j12) {
            long j13 = this.pos;
            this.pos = j13 - 1;
            UnsafeUtil.putByte(j13, (byte) j12);
        }

        private void writeVarint64SevenBytes(long j12) {
            long j13 = this.pos;
            this.pos = j13 - 1;
            UnsafeUtil.putByte(j13, (byte) (j12 >>> 42));
            long j14 = this.pos;
            this.pos = j14 - 1;
            UnsafeUtil.putByte(j14, (byte) (((j12 >>> 35) & 127) | 128));
            long j15 = this.pos;
            this.pos = j15 - 1;
            UnsafeUtil.putByte(j15, (byte) (((j12 >>> 28) & 127) | 128));
            long j16 = this.pos;
            this.pos = j16 - 1;
            UnsafeUtil.putByte(j16, (byte) (((j12 >>> 21) & 127) | 128));
            long j17 = this.pos;
            this.pos = j17 - 1;
            UnsafeUtil.putByte(j17, (byte) (((j12 >>> 14) & 127) | 128));
            long j18 = this.pos;
            this.pos = j18 - 1;
            UnsafeUtil.putByte(j18, (byte) (((j12 >>> 7) & 127) | 128));
            long j19 = this.pos;
            this.pos = j19 - 1;
            UnsafeUtil.putByte(j19, (byte) ((j12 & 127) | 128));
        }

        private void writeVarint64SixBytes(long j12) {
            long j13 = this.pos;
            this.pos = j13 - 1;
            UnsafeUtil.putByte(j13, (byte) (j12 >>> 35));
            long j14 = this.pos;
            this.pos = j14 - 1;
            UnsafeUtil.putByte(j14, (byte) (((j12 >>> 28) & 127) | 128));
            long j15 = this.pos;
            this.pos = j15 - 1;
            UnsafeUtil.putByte(j15, (byte) (((j12 >>> 21) & 127) | 128));
            long j16 = this.pos;
            this.pos = j16 - 1;
            UnsafeUtil.putByte(j16, (byte) (((j12 >>> 14) & 127) | 128));
            long j17 = this.pos;
            this.pos = j17 - 1;
            UnsafeUtil.putByte(j17, (byte) (((j12 >>> 7) & 127) | 128));
            long j18 = this.pos;
            this.pos = j18 - 1;
            UnsafeUtil.putByte(j18, (byte) ((j12 & 127) | 128));
        }

        private void writeVarint64TenBytes(long j12) {
            long j13 = this.pos;
            this.pos = j13 - 1;
            UnsafeUtil.putByte(j13, (byte) (j12 >>> 63));
            long j14 = this.pos;
            this.pos = j14 - 1;
            UnsafeUtil.putByte(j14, (byte) (((j12 >>> 56) & 127) | 128));
            long j15 = this.pos;
            this.pos = j15 - 1;
            UnsafeUtil.putByte(j15, (byte) (((j12 >>> 49) & 127) | 128));
            long j16 = this.pos;
            this.pos = j16 - 1;
            UnsafeUtil.putByte(j16, (byte) (((j12 >>> 42) & 127) | 128));
            long j17 = this.pos;
            this.pos = j17 - 1;
            UnsafeUtil.putByte(j17, (byte) (((j12 >>> 35) & 127) | 128));
            long j18 = this.pos;
            this.pos = j18 - 1;
            UnsafeUtil.putByte(j18, (byte) (((j12 >>> 28) & 127) | 128));
            long j19 = this.pos;
            this.pos = j19 - 1;
            UnsafeUtil.putByte(j19, (byte) (((j12 >>> 21) & 127) | 128));
            long j22 = this.pos;
            this.pos = j22 - 1;
            UnsafeUtil.putByte(j22, (byte) (((j12 >>> 14) & 127) | 128));
            long j23 = this.pos;
            this.pos = j23 - 1;
            UnsafeUtil.putByte(j23, (byte) (((j12 >>> 7) & 127) | 128));
            long j24 = this.pos;
            this.pos = j24 - 1;
            UnsafeUtil.putByte(j24, (byte) ((j12 & 127) | 128));
        }

        private void writeVarint64ThreeBytes(long j12) {
            long j13 = this.pos;
            this.pos = j13 - 1;
            UnsafeUtil.putByte(j13, (byte) (((int) j12) >>> 14));
            long j14 = this.pos;
            this.pos = j14 - 1;
            UnsafeUtil.putByte(j14, (byte) (((j12 >>> 7) & 127) | 128));
            long j15 = this.pos;
            this.pos = j15 - 1;
            UnsafeUtil.putByte(j15, (byte) ((j12 & 127) | 128));
        }

        private void writeVarint64TwoBytes(long j12) {
            long j13 = this.pos;
            this.pos = j13 - 1;
            UnsafeUtil.putByte(j13, (byte) (j12 >>> 7));
            long j14 = this.pos;
            this.pos = j14 - 1;
            UnsafeUtil.putByte(j14, (byte) ((((int) j12) & 127) | 128));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.BinaryWriter
        public void finishCurrentBuffer() {
            if (this.buffer != null) {
                this.totalDoneBytes += bytesWrittenToCurrentBuffer();
                this.buffer.position(bufferPos() + 1);
                this.buffer = null;
                this.pos = 0L;
                this.limitMinusOne = 0L;
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.BinaryWriter
        public int getTotalBytesWritten() {
            return this.totalDoneBytes + bytesWrittenToCurrentBuffer();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.BinaryWriter
        public void requireSpace(int i12) {
            if (spaceLeft() < i12) {
                nextBuffer(i12);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteOutput
        public void write(byte b12) {
            long j12 = this.pos;
            this.pos = j12 - 1;
            UnsafeUtil.putByte(j12, b12);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public void writeBool(int i12, boolean z12) {
            requireSpace(6);
            write(z12 ? (byte) 1 : (byte) 0);
            writeTag(i12, 0);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public void writeBytes(int i12, ByteString byteString) {
            try {
                byteString.writeToReverse(this);
                requireSpace(10);
                writeVarint32(byteString.size());
                writeTag(i12, 2);
            } catch (IOException e12) {
                throw new RuntimeException(e12);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        @Deprecated
        public void writeEndGroup(int i12) {
            writeTag(i12, 4);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public void writeFixed32(int i12, int i13) {
            requireSpace(9);
            writeFixed32(i13);
            writeTag(i12, 5);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public void writeFixed64(int i12, long j12) {
            requireSpace(13);
            writeFixed64(j12);
            writeTag(i12, 1);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public void writeGroup(int i12, Object obj) {
            writeTag(i12, 4);
            Protobuf.getInstance().writeTo(obj, this);
            writeTag(i12, 3);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public void writeInt32(int i12, int i13) {
            requireSpace(15);
            writeInt32(i13);
            writeTag(i12, 0);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteOutput
        public void writeLazy(byte[] bArr, int i12, int i13) {
            if (spaceLeft() < i13) {
                this.totalDoneBytes += i13;
                this.buffers.addFirst(AllocatedBuffer.wrap(bArr, i12, i13));
                nextBuffer();
            } else {
                this.pos -= i13;
                this.buffer.position(bufferPos() + 1);
                this.buffer.put(bArr, i12, i13);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public void writeMessage(int i12, Object obj) {
            int totalBytesWritten = getTotalBytesWritten();
            Protobuf.getInstance().writeTo(obj, this);
            int totalBytesWritten2 = getTotalBytesWritten() - totalBytesWritten;
            requireSpace(10);
            writeVarint32(totalBytesWritten2);
            writeTag(i12, 2);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public void writeSInt32(int i12, int i13) {
            requireSpace(10);
            writeSInt32(i13);
            writeTag(i12, 0);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public void writeSInt64(int i12, long j12) {
            requireSpace(15);
            writeSInt64(j12);
            writeTag(i12, 0);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        @Deprecated
        public void writeStartGroup(int i12) {
            writeTag(i12, 3);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public void writeString(int i12, String str) {
            int totalBytesWritten = getTotalBytesWritten();
            writeString(str);
            int totalBytesWritten2 = getTotalBytesWritten() - totalBytesWritten;
            requireSpace(10);
            writeVarint32(totalBytesWritten2);
            writeTag(i12, 2);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.BinaryWriter
        public void writeTag(int i12, int i13) {
            writeVarint32(WireFormat.makeTag(i12, i13));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public void writeUInt32(int i12, int i13) {
            requireSpace(10);
            writeVarint32(i13);
            writeTag(i12, 0);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public void writeUInt64(int i12, long j12) {
            requireSpace(15);
            writeVarint64(j12);
            writeTag(i12, 0);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.BinaryWriter
        public void writeVarint32(int i12) {
            if ((i12 & (-128)) == 0) {
                writeVarint32OneByte(i12);
                return;
            }
            if ((i12 & (-16384)) == 0) {
                writeVarint32TwoBytes(i12);
                return;
            }
            if (((-2097152) & i12) == 0) {
                writeVarint32ThreeBytes(i12);
            } else if (((-268435456) & i12) == 0) {
                writeVarint32FourBytes(i12);
            } else {
                writeVarint32FiveBytes(i12);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.BinaryWriter
        public void writeVarint64(long j12) {
            switch (BinaryWriter.computeUInt64SizeNoTag(j12)) {
                case 1:
                    writeVarint64OneByte(j12);
                    break;
                case 2:
                    writeVarint64TwoBytes(j12);
                    break;
                case 3:
                    writeVarint64ThreeBytes(j12);
                    break;
                case 4:
                    writeVarint64FourBytes(j12);
                    break;
                case 5:
                    writeVarint64FiveBytes(j12);
                    break;
                case 6:
                    writeVarint64SixBytes(j12);
                    break;
                case 7:
                    writeVarint64SevenBytes(j12);
                    break;
                case 8:
                    writeVarint64EightBytes(j12);
                    break;
                case 9:
                    writeVarint64NineBytes(j12);
                    break;
                case 10:
                    writeVarint64TenBytes(j12);
                    break;
            }
        }

        private void nextBuffer(int i12) {
            nextBuffer(newDirectBuffer(i12));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteOutput
        public void write(byte[] bArr, int i12, int i13) {
            if (spaceLeft() < i13) {
                nextBuffer(i13);
            }
            this.pos -= i13;
            this.buffer.position(bufferPos() + 1);
            this.buffer.put(bArr, i12, i13);
        }

        private void nextBuffer(AllocatedBuffer allocatedBuffer) {
            if (allocatedBuffer.hasNioBuffer()) {
                ByteBuffer byteBufferNioBuffer = allocatedBuffer.nioBuffer();
                if (byteBufferNioBuffer.isDirect()) {
                    finishCurrentBuffer();
                    this.buffers.addFirst(allocatedBuffer);
                    this.buffer = byteBufferNioBuffer;
                    byteBufferNioBuffer.limit(byteBufferNioBuffer.capacity());
                    this.buffer.position(0);
                    long jAddressOffset = UnsafeUtil.addressOffset(this.buffer);
                    this.bufferOffset = jAddressOffset;
                    long jLimit = jAddressOffset + (this.buffer.limit() - 1);
                    this.limitMinusOne = jLimit;
                    this.pos = jLimit;
                    return;
                }
                throw new RuntimeException("Allocator returned non-direct buffer");
            }
            throw new RuntimeException("Allocated buffer does not have NIO buffer");
        }

        @Override // com.google.crypto.tink.shaded.protobuf.BinaryWriter
        public void writeBool(boolean z12) {
            write(z12 ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.BinaryWriter
        public void writeFixed32(int i12) {
            long j12 = this.pos;
            this.pos = j12 - 1;
            UnsafeUtil.putByte(j12, (byte) ((i12 >> 24) & 255));
            long j13 = this.pos;
            this.pos = j13 - 1;
            UnsafeUtil.putByte(j13, (byte) ((i12 >> 16) & 255));
            long j14 = this.pos;
            this.pos = j14 - 1;
            UnsafeUtil.putByte(j14, (byte) ((i12 >> 8) & 255));
            long j15 = this.pos;
            this.pos = j15 - 1;
            UnsafeUtil.putByte(j15, (byte) (i12 & 255));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.BinaryWriter
        public void writeFixed64(long j12) {
            long j13 = this.pos;
            this.pos = j13 - 1;
            UnsafeUtil.putByte(j13, (byte) (((int) (j12 >> 56)) & 255));
            long j14 = this.pos;
            this.pos = j14 - 1;
            UnsafeUtil.putByte(j14, (byte) (((int) (j12 >> 48)) & 255));
            long j15 = this.pos;
            this.pos = j15 - 1;
            UnsafeUtil.putByte(j15, (byte) (((int) (j12 >> 40)) & 255));
            long j16 = this.pos;
            this.pos = j16 - 1;
            UnsafeUtil.putByte(j16, (byte) (((int) (j12 >> 32)) & 255));
            long j17 = this.pos;
            this.pos = j17 - 1;
            UnsafeUtil.putByte(j17, (byte) (((int) (j12 >> 24)) & 255));
            long j18 = this.pos;
            this.pos = j18 - 1;
            UnsafeUtil.putByte(j18, (byte) (((int) (j12 >> 16)) & 255));
            long j19 = this.pos;
            this.pos = j19 - 1;
            UnsafeUtil.putByte(j19, (byte) (((int) (j12 >> 8)) & 255));
            long j22 = this.pos;
            this.pos = j22 - 1;
            UnsafeUtil.putByte(j22, (byte) (((int) j12) & 255));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public void writeGroup(int i12, Object obj, Schema schema) {
            writeTag(i12, 4);
            schema.writeTo(obj, this);
            writeTag(i12, 3);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.BinaryWriter
        public void writeInt32(int i12) {
            if (i12 >= 0) {
                writeVarint32(i12);
            } else {
                writeVarint64(i12);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.BinaryWriter
        public void writeSInt32(int i12) {
            writeVarint32(CodedOutputStream.encodeZigZag32(i12));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.BinaryWriter
        public void writeSInt64(long j12) {
            writeVarint64(CodedOutputStream.encodeZigZag64(j12));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteOutput
        public void write(ByteBuffer byteBuffer) {
            int iRemaining = byteBuffer.remaining();
            if (spaceLeft() < iRemaining) {
                nextBuffer(iRemaining);
            }
            this.pos -= iRemaining;
            this.buffer.position(bufferPos() + 1);
            this.buffer.put(byteBuffer);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public void writeMessage(int i12, Object obj, Schema schema) {
            int totalBytesWritten = getTotalBytesWritten();
            schema.writeTo(obj, this);
            int totalBytesWritten2 = getTotalBytesWritten() - totalBytesWritten;
            requireSpace(10);
            writeVarint32(totalBytesWritten2);
            writeTag(i12, 2);
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x0044  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x006b  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x00a7  */
        @Override // com.google.crypto.tink.shaded.protobuf.BinaryWriter
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void writeString(java.lang.String r13) {
            /*
                Method dump skipped, instructions count: 273
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.BinaryWriter.UnsafeDirectWriter.writeString(java.lang.String):void");
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteOutput
        public void writeLazy(ByteBuffer byteBuffer) {
            int iRemaining = byteBuffer.remaining();
            if (spaceLeft() < iRemaining) {
                this.totalDoneBytes += iRemaining;
                this.buffers.addFirst(AllocatedBuffer.wrap(byteBuffer));
                nextBuffer();
            } else {
                this.pos -= iRemaining;
                this.buffer.position(bufferPos() + 1);
                this.buffer.put(byteBuffer);
            }
        }
    }

    public static final class UnsafeHeapWriter extends BinaryWriter {
        private AllocatedBuffer allocatedBuffer;
        private byte[] buffer;
        private long limit;
        private long limitMinusOne;
        private long offset;
        private long offsetMinusOne;
        private long pos;

        public UnsafeHeapWriter(BufferAllocator bufferAllocator, int i12) {
            super(bufferAllocator, i12, null);
            nextBuffer();
        }

        private int arrayPos() {
            return (int) this.pos;
        }

        public static boolean isSupported() {
            return UnsafeUtil.hasUnsafeArrayOperations();
        }

        private void nextBuffer() {
            nextBuffer(newHeapBuffer());
        }

        private void writeVarint32FiveBytes(int i12) {
            byte[] bArr = this.buffer;
            long j12 = this.pos;
            this.pos = j12 - 1;
            UnsafeUtil.putByte(bArr, j12, (byte) (i12 >>> 28));
            byte[] bArr2 = this.buffer;
            long j13 = this.pos;
            this.pos = j13 - 1;
            UnsafeUtil.putByte(bArr2, j13, (byte) (((i12 >>> 21) & 127) | 128));
            byte[] bArr3 = this.buffer;
            long j14 = this.pos;
            this.pos = j14 - 1;
            UnsafeUtil.putByte(bArr3, j14, (byte) (((i12 >>> 14) & 127) | 128));
            byte[] bArr4 = this.buffer;
            long j15 = this.pos;
            this.pos = j15 - 1;
            UnsafeUtil.putByte(bArr4, j15, (byte) (((i12 >>> 7) & 127) | 128));
            byte[] bArr5 = this.buffer;
            long j16 = this.pos;
            this.pos = j16 - 1;
            UnsafeUtil.putByte(bArr5, j16, (byte) ((i12 & 127) | 128));
        }

        private void writeVarint32FourBytes(int i12) {
            byte[] bArr = this.buffer;
            long j12 = this.pos;
            this.pos = j12 - 1;
            UnsafeUtil.putByte(bArr, j12, (byte) (i12 >>> 21));
            byte[] bArr2 = this.buffer;
            long j13 = this.pos;
            this.pos = j13 - 1;
            UnsafeUtil.putByte(bArr2, j13, (byte) (((i12 >>> 14) & 127) | 128));
            byte[] bArr3 = this.buffer;
            long j14 = this.pos;
            this.pos = j14 - 1;
            UnsafeUtil.putByte(bArr3, j14, (byte) (((i12 >>> 7) & 127) | 128));
            byte[] bArr4 = this.buffer;
            long j15 = this.pos;
            this.pos = j15 - 1;
            UnsafeUtil.putByte(bArr4, j15, (byte) ((i12 & 127) | 128));
        }

        private void writeVarint32OneByte(int i12) {
            byte[] bArr = this.buffer;
            long j12 = this.pos;
            this.pos = j12 - 1;
            UnsafeUtil.putByte(bArr, j12, (byte) i12);
        }

        private void writeVarint32ThreeBytes(int i12) {
            byte[] bArr = this.buffer;
            long j12 = this.pos;
            this.pos = j12 - 1;
            UnsafeUtil.putByte(bArr, j12, (byte) (i12 >>> 14));
            byte[] bArr2 = this.buffer;
            long j13 = this.pos;
            this.pos = j13 - 1;
            UnsafeUtil.putByte(bArr2, j13, (byte) (((i12 >>> 7) & 127) | 128));
            byte[] bArr3 = this.buffer;
            long j14 = this.pos;
            this.pos = j14 - 1;
            UnsafeUtil.putByte(bArr3, j14, (byte) ((i12 & 127) | 128));
        }

        private void writeVarint32TwoBytes(int i12) {
            byte[] bArr = this.buffer;
            long j12 = this.pos;
            this.pos = j12 - 1;
            UnsafeUtil.putByte(bArr, j12, (byte) (i12 >>> 7));
            byte[] bArr2 = this.buffer;
            long j13 = this.pos;
            this.pos = j13 - 1;
            UnsafeUtil.putByte(bArr2, j13, (byte) ((i12 & 127) | 128));
        }

        private void writeVarint64EightBytes(long j12) {
            byte[] bArr = this.buffer;
            long j13 = this.pos;
            this.pos = j13 - 1;
            UnsafeUtil.putByte(bArr, j13, (byte) (j12 >>> 49));
            byte[] bArr2 = this.buffer;
            long j14 = this.pos;
            this.pos = j14 - 1;
            UnsafeUtil.putByte(bArr2, j14, (byte) (((j12 >>> 42) & 127) | 128));
            byte[] bArr3 = this.buffer;
            long j15 = this.pos;
            this.pos = j15 - 1;
            UnsafeUtil.putByte(bArr3, j15, (byte) (((j12 >>> 35) & 127) | 128));
            byte[] bArr4 = this.buffer;
            long j16 = this.pos;
            this.pos = j16 - 1;
            UnsafeUtil.putByte(bArr4, j16, (byte) (((j12 >>> 28) & 127) | 128));
            byte[] bArr5 = this.buffer;
            long j17 = this.pos;
            this.pos = j17 - 1;
            UnsafeUtil.putByte(bArr5, j17, (byte) (((j12 >>> 21) & 127) | 128));
            byte[] bArr6 = this.buffer;
            long j18 = this.pos;
            this.pos = j18 - 1;
            UnsafeUtil.putByte(bArr6, j18, (byte) (((j12 >>> 14) & 127) | 128));
            byte[] bArr7 = this.buffer;
            long j19 = this.pos;
            this.pos = j19 - 1;
            UnsafeUtil.putByte(bArr7, j19, (byte) (((j12 >>> 7) & 127) | 128));
            byte[] bArr8 = this.buffer;
            long j22 = this.pos;
            this.pos = j22 - 1;
            UnsafeUtil.putByte(bArr8, j22, (byte) ((j12 & 127) | 128));
        }

        private void writeVarint64FiveBytes(long j12) {
            byte[] bArr = this.buffer;
            long j13 = this.pos;
            this.pos = j13 - 1;
            UnsafeUtil.putByte(bArr, j13, (byte) (j12 >>> 28));
            byte[] bArr2 = this.buffer;
            long j14 = this.pos;
            this.pos = j14 - 1;
            UnsafeUtil.putByte(bArr2, j14, (byte) (((j12 >>> 21) & 127) | 128));
            byte[] bArr3 = this.buffer;
            long j15 = this.pos;
            this.pos = j15 - 1;
            UnsafeUtil.putByte(bArr3, j15, (byte) (((j12 >>> 14) & 127) | 128));
            byte[] bArr4 = this.buffer;
            long j16 = this.pos;
            this.pos = j16 - 1;
            UnsafeUtil.putByte(bArr4, j16, (byte) (((j12 >>> 7) & 127) | 128));
            byte[] bArr5 = this.buffer;
            long j17 = this.pos;
            this.pos = j17 - 1;
            UnsafeUtil.putByte(bArr5, j17, (byte) ((j12 & 127) | 128));
        }

        private void writeVarint64FourBytes(long j12) {
            byte[] bArr = this.buffer;
            long j13 = this.pos;
            this.pos = j13 - 1;
            UnsafeUtil.putByte(bArr, j13, (byte) (j12 >>> 21));
            byte[] bArr2 = this.buffer;
            long j14 = this.pos;
            this.pos = j14 - 1;
            UnsafeUtil.putByte(bArr2, j14, (byte) (((j12 >>> 14) & 127) | 128));
            byte[] bArr3 = this.buffer;
            long j15 = this.pos;
            this.pos = j15 - 1;
            UnsafeUtil.putByte(bArr3, j15, (byte) (((j12 >>> 7) & 127) | 128));
            byte[] bArr4 = this.buffer;
            long j16 = this.pos;
            this.pos = j16 - 1;
            UnsafeUtil.putByte(bArr4, j16, (byte) ((j12 & 127) | 128));
        }

        private void writeVarint64NineBytes(long j12) {
            byte[] bArr = this.buffer;
            long j13 = this.pos;
            this.pos = j13 - 1;
            UnsafeUtil.putByte(bArr, j13, (byte) (j12 >>> 56));
            byte[] bArr2 = this.buffer;
            long j14 = this.pos;
            this.pos = j14 - 1;
            UnsafeUtil.putByte(bArr2, j14, (byte) (((j12 >>> 49) & 127) | 128));
            byte[] bArr3 = this.buffer;
            long j15 = this.pos;
            this.pos = j15 - 1;
            UnsafeUtil.putByte(bArr3, j15, (byte) (((j12 >>> 42) & 127) | 128));
            byte[] bArr4 = this.buffer;
            long j16 = this.pos;
            this.pos = j16 - 1;
            UnsafeUtil.putByte(bArr4, j16, (byte) (((j12 >>> 35) & 127) | 128));
            byte[] bArr5 = this.buffer;
            long j17 = this.pos;
            this.pos = j17 - 1;
            UnsafeUtil.putByte(bArr5, j17, (byte) (((j12 >>> 28) & 127) | 128));
            byte[] bArr6 = this.buffer;
            long j18 = this.pos;
            this.pos = j18 - 1;
            UnsafeUtil.putByte(bArr6, j18, (byte) (((j12 >>> 21) & 127) | 128));
            byte[] bArr7 = this.buffer;
            long j19 = this.pos;
            this.pos = j19 - 1;
            UnsafeUtil.putByte(bArr7, j19, (byte) (((j12 >>> 14) & 127) | 128));
            byte[] bArr8 = this.buffer;
            long j22 = this.pos;
            this.pos = j22 - 1;
            UnsafeUtil.putByte(bArr8, j22, (byte) (((j12 >>> 7) & 127) | 128));
            byte[] bArr9 = this.buffer;
            long j23 = this.pos;
            this.pos = j23 - 1;
            UnsafeUtil.putByte(bArr9, j23, (byte) ((j12 & 127) | 128));
        }

        private void writeVarint64OneByte(long j12) {
            byte[] bArr = this.buffer;
            long j13 = this.pos;
            this.pos = j13 - 1;
            UnsafeUtil.putByte(bArr, j13, (byte) j12);
        }

        private void writeVarint64SevenBytes(long j12) {
            byte[] bArr = this.buffer;
            long j13 = this.pos;
            this.pos = j13 - 1;
            UnsafeUtil.putByte(bArr, j13, (byte) (j12 >>> 42));
            byte[] bArr2 = this.buffer;
            long j14 = this.pos;
            this.pos = j14 - 1;
            UnsafeUtil.putByte(bArr2, j14, (byte) (((j12 >>> 35) & 127) | 128));
            byte[] bArr3 = this.buffer;
            long j15 = this.pos;
            this.pos = j15 - 1;
            UnsafeUtil.putByte(bArr3, j15, (byte) (((j12 >>> 28) & 127) | 128));
            byte[] bArr4 = this.buffer;
            long j16 = this.pos;
            this.pos = j16 - 1;
            UnsafeUtil.putByte(bArr4, j16, (byte) (((j12 >>> 21) & 127) | 128));
            byte[] bArr5 = this.buffer;
            long j17 = this.pos;
            this.pos = j17 - 1;
            UnsafeUtil.putByte(bArr5, j17, (byte) (((j12 >>> 14) & 127) | 128));
            byte[] bArr6 = this.buffer;
            long j18 = this.pos;
            this.pos = j18 - 1;
            UnsafeUtil.putByte(bArr6, j18, (byte) (((j12 >>> 7) & 127) | 128));
            byte[] bArr7 = this.buffer;
            long j19 = this.pos;
            this.pos = j19 - 1;
            UnsafeUtil.putByte(bArr7, j19, (byte) ((j12 & 127) | 128));
        }

        private void writeVarint64SixBytes(long j12) {
            byte[] bArr = this.buffer;
            long j13 = this.pos;
            this.pos = j13 - 1;
            UnsafeUtil.putByte(bArr, j13, (byte) (j12 >>> 35));
            byte[] bArr2 = this.buffer;
            long j14 = this.pos;
            this.pos = j14 - 1;
            UnsafeUtil.putByte(bArr2, j14, (byte) (((j12 >>> 28) & 127) | 128));
            byte[] bArr3 = this.buffer;
            long j15 = this.pos;
            this.pos = j15 - 1;
            UnsafeUtil.putByte(bArr3, j15, (byte) (((j12 >>> 21) & 127) | 128));
            byte[] bArr4 = this.buffer;
            long j16 = this.pos;
            this.pos = j16 - 1;
            UnsafeUtil.putByte(bArr4, j16, (byte) (((j12 >>> 14) & 127) | 128));
            byte[] bArr5 = this.buffer;
            long j17 = this.pos;
            this.pos = j17 - 1;
            UnsafeUtil.putByte(bArr5, j17, (byte) (((j12 >>> 7) & 127) | 128));
            byte[] bArr6 = this.buffer;
            long j18 = this.pos;
            this.pos = j18 - 1;
            UnsafeUtil.putByte(bArr6, j18, (byte) ((j12 & 127) | 128));
        }

        private void writeVarint64TenBytes(long j12) {
            byte[] bArr = this.buffer;
            long j13 = this.pos;
            this.pos = j13 - 1;
            UnsafeUtil.putByte(bArr, j13, (byte) (j12 >>> 63));
            byte[] bArr2 = this.buffer;
            long j14 = this.pos;
            this.pos = j14 - 1;
            UnsafeUtil.putByte(bArr2, j14, (byte) (((j12 >>> 56) & 127) | 128));
            byte[] bArr3 = this.buffer;
            long j15 = this.pos;
            this.pos = j15 - 1;
            UnsafeUtil.putByte(bArr3, j15, (byte) (((j12 >>> 49) & 127) | 128));
            byte[] bArr4 = this.buffer;
            long j16 = this.pos;
            this.pos = j16 - 1;
            UnsafeUtil.putByte(bArr4, j16, (byte) (((j12 >>> 42) & 127) | 128));
            byte[] bArr5 = this.buffer;
            long j17 = this.pos;
            this.pos = j17 - 1;
            UnsafeUtil.putByte(bArr5, j17, (byte) (((j12 >>> 35) & 127) | 128));
            byte[] bArr6 = this.buffer;
            long j18 = this.pos;
            this.pos = j18 - 1;
            UnsafeUtil.putByte(bArr6, j18, (byte) (((j12 >>> 28) & 127) | 128));
            byte[] bArr7 = this.buffer;
            long j19 = this.pos;
            this.pos = j19 - 1;
            UnsafeUtil.putByte(bArr7, j19, (byte) (((j12 >>> 21) & 127) | 128));
            byte[] bArr8 = this.buffer;
            long j22 = this.pos;
            this.pos = j22 - 1;
            UnsafeUtil.putByte(bArr8, j22, (byte) (((j12 >>> 14) & 127) | 128));
            byte[] bArr9 = this.buffer;
            long j23 = this.pos;
            this.pos = j23 - 1;
            UnsafeUtil.putByte(bArr9, j23, (byte) (((j12 >>> 7) & 127) | 128));
            byte[] bArr10 = this.buffer;
            long j24 = this.pos;
            this.pos = j24 - 1;
            UnsafeUtil.putByte(bArr10, j24, (byte) ((j12 & 127) | 128));
        }

        private void writeVarint64ThreeBytes(long j12) {
            byte[] bArr = this.buffer;
            long j13 = this.pos;
            this.pos = j13 - 1;
            UnsafeUtil.putByte(bArr, j13, (byte) (((int) j12) >>> 14));
            byte[] bArr2 = this.buffer;
            long j14 = this.pos;
            this.pos = j14 - 1;
            UnsafeUtil.putByte(bArr2, j14, (byte) (((j12 >>> 7) & 127) | 128));
            byte[] bArr3 = this.buffer;
            long j15 = this.pos;
            this.pos = j15 - 1;
            UnsafeUtil.putByte(bArr3, j15, (byte) ((j12 & 127) | 128));
        }

        private void writeVarint64TwoBytes(long j12) {
            byte[] bArr = this.buffer;
            long j13 = this.pos;
            this.pos = j13 - 1;
            UnsafeUtil.putByte(bArr, j13, (byte) (j12 >>> 7));
            byte[] bArr2 = this.buffer;
            long j14 = this.pos;
            this.pos = j14 - 1;
            UnsafeUtil.putByte(bArr2, j14, (byte) ((((int) j12) & 127) | 128));
        }

        public int bytesWrittenToCurrentBuffer() {
            return (int) (this.limitMinusOne - this.pos);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.BinaryWriter
        public void finishCurrentBuffer() {
            if (this.allocatedBuffer != null) {
                this.totalDoneBytes += bytesWrittenToCurrentBuffer();
                this.allocatedBuffer.position((arrayPos() - this.allocatedBuffer.arrayOffset()) + 1);
                this.allocatedBuffer = null;
                this.pos = 0L;
                this.limitMinusOne = 0L;
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.BinaryWriter
        public int getTotalBytesWritten() {
            return this.totalDoneBytes + bytesWrittenToCurrentBuffer();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.BinaryWriter
        public void requireSpace(int i12) {
            if (spaceLeft() < i12) {
                nextBuffer(i12);
            }
        }

        public int spaceLeft() {
            return (int) (this.pos - this.offsetMinusOne);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteOutput
        public void write(byte b12) {
            byte[] bArr = this.buffer;
            long j12 = this.pos;
            this.pos = j12 - 1;
            UnsafeUtil.putByte(bArr, j12, b12);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public void writeBool(int i12, boolean z12) {
            requireSpace(6);
            write(z12 ? (byte) 1 : (byte) 0);
            writeTag(i12, 0);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public void writeBytes(int i12, ByteString byteString) {
            try {
                byteString.writeToReverse(this);
                requireSpace(10);
                writeVarint32(byteString.size());
                writeTag(i12, 2);
            } catch (IOException e12) {
                throw new RuntimeException(e12);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public void writeEndGroup(int i12) {
            writeTag(i12, 4);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public void writeFixed32(int i12, int i13) {
            requireSpace(9);
            writeFixed32(i13);
            writeTag(i12, 5);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public void writeFixed64(int i12, long j12) {
            requireSpace(13);
            writeFixed64(j12);
            writeTag(i12, 1);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public void writeGroup(int i12, Object obj) {
            writeTag(i12, 4);
            Protobuf.getInstance().writeTo(obj, this);
            writeTag(i12, 3);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public void writeInt32(int i12, int i13) {
            requireSpace(15);
            writeInt32(i13);
            writeTag(i12, 0);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteOutput
        public void writeLazy(byte[] bArr, int i12, int i13) {
            if (i12 < 0 || i12 + i13 > bArr.length) {
                throw new ArrayIndexOutOfBoundsException(String.format("value.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), Integer.valueOf(i12), Integer.valueOf(i13)));
            }
            if (spaceLeft() >= i13) {
                this.pos -= i13;
                System.arraycopy(bArr, i12, this.buffer, arrayPos() + 1, i13);
            } else {
                this.totalDoneBytes += i13;
                this.buffers.addFirst(AllocatedBuffer.wrap(bArr, i12, i13));
                nextBuffer();
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public void writeMessage(int i12, Object obj) {
            int totalBytesWritten = getTotalBytesWritten();
            Protobuf.getInstance().writeTo(obj, this);
            int totalBytesWritten2 = getTotalBytesWritten() - totalBytesWritten;
            requireSpace(10);
            writeVarint32(totalBytesWritten2);
            writeTag(i12, 2);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public void writeSInt32(int i12, int i13) {
            requireSpace(10);
            writeSInt32(i13);
            writeTag(i12, 0);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public void writeSInt64(int i12, long j12) {
            requireSpace(15);
            writeSInt64(j12);
            writeTag(i12, 0);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public void writeStartGroup(int i12) {
            writeTag(i12, 3);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public void writeString(int i12, String str) {
            int totalBytesWritten = getTotalBytesWritten();
            writeString(str);
            int totalBytesWritten2 = getTotalBytesWritten() - totalBytesWritten;
            requireSpace(10);
            writeVarint32(totalBytesWritten2);
            writeTag(i12, 2);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.BinaryWriter
        public void writeTag(int i12, int i13) {
            writeVarint32(WireFormat.makeTag(i12, i13));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public void writeUInt32(int i12, int i13) {
            requireSpace(10);
            writeVarint32(i13);
            writeTag(i12, 0);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public void writeUInt64(int i12, long j12) {
            requireSpace(15);
            writeVarint64(j12);
            writeTag(i12, 0);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.BinaryWriter
        public void writeVarint32(int i12) {
            if ((i12 & (-128)) == 0) {
                writeVarint32OneByte(i12);
                return;
            }
            if ((i12 & (-16384)) == 0) {
                writeVarint32TwoBytes(i12);
                return;
            }
            if (((-2097152) & i12) == 0) {
                writeVarint32ThreeBytes(i12);
            } else if (((-268435456) & i12) == 0) {
                writeVarint32FourBytes(i12);
            } else {
                writeVarint32FiveBytes(i12);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.BinaryWriter
        public void writeVarint64(long j12) {
            switch (BinaryWriter.computeUInt64SizeNoTag(j12)) {
                case 1:
                    writeVarint64OneByte(j12);
                    break;
                case 2:
                    writeVarint64TwoBytes(j12);
                    break;
                case 3:
                    writeVarint64ThreeBytes(j12);
                    break;
                case 4:
                    writeVarint64FourBytes(j12);
                    break;
                case 5:
                    writeVarint64FiveBytes(j12);
                    break;
                case 6:
                    writeVarint64SixBytes(j12);
                    break;
                case 7:
                    writeVarint64SevenBytes(j12);
                    break;
                case 8:
                    writeVarint64EightBytes(j12);
                    break;
                case 9:
                    writeVarint64NineBytes(j12);
                    break;
                case 10:
                    writeVarint64TenBytes(j12);
                    break;
            }
        }

        private void nextBuffer(int i12) {
            nextBuffer(newHeapBuffer(i12));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteOutput
        public void write(byte[] bArr, int i12, int i13) {
            if (i12 < 0 || i12 + i13 > bArr.length) {
                throw new ArrayIndexOutOfBoundsException(String.format("value.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), Integer.valueOf(i12), Integer.valueOf(i13)));
            }
            requireSpace(i13);
            this.pos -= i13;
            System.arraycopy(bArr, i12, this.buffer, arrayPos() + 1, i13);
        }

        private void nextBuffer(AllocatedBuffer allocatedBuffer) {
            if (allocatedBuffer.hasArray()) {
                finishCurrentBuffer();
                this.buffers.addFirst(allocatedBuffer);
                this.allocatedBuffer = allocatedBuffer;
                this.buffer = allocatedBuffer.array();
                long jArrayOffset = allocatedBuffer.arrayOffset();
                this.limit = allocatedBuffer.limit() + jArrayOffset;
                long jPosition = jArrayOffset + allocatedBuffer.position();
                this.offset = jPosition;
                this.offsetMinusOne = jPosition - 1;
                long j12 = this.limit - 1;
                this.limitMinusOne = j12;
                this.pos = j12;
                return;
            }
            throw new RuntimeException("Allocator returned non-heap buffer");
        }

        @Override // com.google.crypto.tink.shaded.protobuf.BinaryWriter
        public void writeBool(boolean z12) {
            write(z12 ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.BinaryWriter
        public void writeFixed32(int i12) {
            byte[] bArr = this.buffer;
            long j12 = this.pos;
            this.pos = j12 - 1;
            UnsafeUtil.putByte(bArr, j12, (byte) ((i12 >> 24) & 255));
            byte[] bArr2 = this.buffer;
            long j13 = this.pos;
            this.pos = j13 - 1;
            UnsafeUtil.putByte(bArr2, j13, (byte) ((i12 >> 16) & 255));
            byte[] bArr3 = this.buffer;
            long j14 = this.pos;
            this.pos = j14 - 1;
            UnsafeUtil.putByte(bArr3, j14, (byte) ((i12 >> 8) & 255));
            byte[] bArr4 = this.buffer;
            long j15 = this.pos;
            this.pos = j15 - 1;
            UnsafeUtil.putByte(bArr4, j15, (byte) (i12 & 255));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.BinaryWriter
        public void writeFixed64(long j12) {
            byte[] bArr = this.buffer;
            long j13 = this.pos;
            this.pos = j13 - 1;
            UnsafeUtil.putByte(bArr, j13, (byte) (((int) (j12 >> 56)) & 255));
            byte[] bArr2 = this.buffer;
            long j14 = this.pos;
            this.pos = j14 - 1;
            UnsafeUtil.putByte(bArr2, j14, (byte) (((int) (j12 >> 48)) & 255));
            byte[] bArr3 = this.buffer;
            long j15 = this.pos;
            this.pos = j15 - 1;
            UnsafeUtil.putByte(bArr3, j15, (byte) (((int) (j12 >> 40)) & 255));
            byte[] bArr4 = this.buffer;
            long j16 = this.pos;
            this.pos = j16 - 1;
            UnsafeUtil.putByte(bArr4, j16, (byte) (((int) (j12 >> 32)) & 255));
            byte[] bArr5 = this.buffer;
            long j17 = this.pos;
            this.pos = j17 - 1;
            UnsafeUtil.putByte(bArr5, j17, (byte) (((int) (j12 >> 24)) & 255));
            byte[] bArr6 = this.buffer;
            long j18 = this.pos;
            this.pos = j18 - 1;
            UnsafeUtil.putByte(bArr6, j18, (byte) (((int) (j12 >> 16)) & 255));
            byte[] bArr7 = this.buffer;
            long j19 = this.pos;
            this.pos = j19 - 1;
            UnsafeUtil.putByte(bArr7, j19, (byte) (((int) (j12 >> 8)) & 255));
            byte[] bArr8 = this.buffer;
            long j22 = this.pos;
            this.pos = j22 - 1;
            UnsafeUtil.putByte(bArr8, j22, (byte) (((int) j12) & 255));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public void writeGroup(int i12, Object obj, Schema schema) {
            writeTag(i12, 4);
            schema.writeTo(obj, this);
            writeTag(i12, 3);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.BinaryWriter
        public void writeInt32(int i12) {
            if (i12 >= 0) {
                writeVarint32(i12);
            } else {
                writeVarint64(i12);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.BinaryWriter
        public void writeSInt32(int i12) {
            writeVarint32(CodedOutputStream.encodeZigZag32(i12));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.BinaryWriter
        public void writeSInt64(long j12) {
            writeVarint64(CodedOutputStream.encodeZigZag64(j12));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Writer
        public void writeMessage(int i12, Object obj, Schema schema) {
            int totalBytesWritten = getTotalBytesWritten();
            schema.writeTo(obj, this);
            int totalBytesWritten2 = getTotalBytesWritten() - totalBytesWritten;
            requireSpace(10);
            writeVarint32(totalBytesWritten2);
            writeTag(i12, 2);
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x0048  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0073  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x00b5  */
        @Override // com.google.crypto.tink.shaded.protobuf.BinaryWriter
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void writeString(java.lang.String r13) {
            /*
                Method dump skipped, instructions count: 295
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.BinaryWriter.UnsafeHeapWriter.writeString(java.lang.String):void");
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteOutput
        public void write(ByteBuffer byteBuffer) {
            int iRemaining = byteBuffer.remaining();
            requireSpace(iRemaining);
            this.pos -= iRemaining;
            byteBuffer.get(this.buffer, arrayPos() + 1, iRemaining);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ByteOutput
        public void writeLazy(ByteBuffer byteBuffer) {
            int iRemaining = byteBuffer.remaining();
            if (spaceLeft() < iRemaining) {
                this.totalDoneBytes += iRemaining;
                this.buffers.addFirst(AllocatedBuffer.wrap(byteBuffer));
                nextBuffer();
            }
            this.pos -= iRemaining;
            byteBuffer.get(this.buffer, arrayPos() + 1, iRemaining);
        }
    }

    public /* synthetic */ BinaryWriter(BufferAllocator bufferAllocator, int i12, AnonymousClass1 anonymousClass1) {
        this(bufferAllocator, i12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte computeUInt64SizeNoTag(long j12) {
        byte b12;
        if (((-128) & j12) == 0) {
            return (byte) 1;
        }
        if (j12 < 0) {
            return (byte) 10;
        }
        if (((-34359738368L) & j12) != 0) {
            b12 = (byte) 6;
            j12 >>>= 28;
        } else {
            b12 = 2;
        }
        if (((-2097152) & j12) != 0) {
            b12 = (byte) (b12 + 2);
            j12 >>>= 14;
        }
        return (j12 & (-16384)) != 0 ? (byte) (b12 + 1) : b12;
    }

    public static boolean isUnsafeDirectSupported() {
        return UnsafeDirectWriter.isSupported();
    }

    public static boolean isUnsafeHeapSupported() {
        return UnsafeHeapWriter.isSupported();
    }

    public static BinaryWriter newDirectInstance(BufferAllocator bufferAllocator) {
        return newDirectInstance(bufferAllocator, 4096);
    }

    public static BinaryWriter newHeapInstance(BufferAllocator bufferAllocator) {
        return newHeapInstance(bufferAllocator, 4096);
    }

    public static BinaryWriter newSafeDirectInstance(BufferAllocator bufferAllocator, int i12) {
        return new SafeDirectWriter(bufferAllocator, i12);
    }

    public static BinaryWriter newSafeHeapInstance(BufferAllocator bufferAllocator, int i12) {
        return new SafeHeapWriter(bufferAllocator, i12);
    }

    public static BinaryWriter newUnsafeDirectInstance(BufferAllocator bufferAllocator, int i12) {
        if (isUnsafeDirectSupported()) {
            return new UnsafeDirectWriter(bufferAllocator, i12);
        }
        throw new UnsupportedOperationException("Unsafe operations not supported");
    }

    public static BinaryWriter newUnsafeHeapInstance(BufferAllocator bufferAllocator, int i12) {
        if (isUnsafeHeapSupported()) {
            return new UnsafeHeapWriter(bufferAllocator, i12);
        }
        throw new UnsupportedOperationException("Unsafe operations not supported");
    }

    private final void writeBoolList_Internal(int i12, List<Boolean> list, boolean z12) {
        if (!z12) {
            for (int size = list.size() - 1; size >= 0; size--) {
                writeBool(i12, list.get(size).booleanValue());
            }
            return;
        }
        requireSpace(list.size() + 10);
        int totalBytesWritten = getTotalBytesWritten();
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            writeBool(list.get(size2).booleanValue());
        }
        writeVarint32(getTotalBytesWritten() - totalBytesWritten);
        writeTag(i12, 2);
    }

    private final void writeDoubleList_Internal(int i12, List<Double> list, boolean z12) {
        if (!z12) {
            for (int size = list.size() - 1; size >= 0; size--) {
                writeDouble(i12, list.get(size).doubleValue());
            }
            return;
        }
        requireSpace(e.f(8, 10, list));
        int totalBytesWritten = getTotalBytesWritten();
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            writeFixed64(Double.doubleToRawLongBits(list.get(size2).doubleValue()));
        }
        writeVarint32(getTotalBytesWritten() - totalBytesWritten);
        writeTag(i12, 2);
    }

    private final void writeFixed32List_Internal(int i12, List<Integer> list, boolean z12) {
        if (!z12) {
            for (int size = list.size() - 1; size >= 0; size--) {
                writeFixed32(i12, list.get(size).intValue());
            }
            return;
        }
        requireSpace(e.f(4, 10, list));
        int totalBytesWritten = getTotalBytesWritten();
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            writeFixed32(list.get(size2).intValue());
        }
        writeVarint32(getTotalBytesWritten() - totalBytesWritten);
        writeTag(i12, 2);
    }

    private final void writeFixed64List_Internal(int i12, List<Long> list, boolean z12) {
        if (!z12) {
            for (int size = list.size() - 1; size >= 0; size--) {
                writeFixed64(i12, list.get(size).longValue());
            }
            return;
        }
        requireSpace(e.f(8, 10, list));
        int totalBytesWritten = getTotalBytesWritten();
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            writeFixed64(list.get(size2).longValue());
        }
        writeVarint32(getTotalBytesWritten() - totalBytesWritten);
        writeTag(i12, 2);
    }

    private final void writeFloatList_Internal(int i12, List<Float> list, boolean z12) {
        if (!z12) {
            for (int size = list.size() - 1; size >= 0; size--) {
                writeFloat(i12, list.get(size).floatValue());
            }
            return;
        }
        requireSpace(e.f(4, 10, list));
        int totalBytesWritten = getTotalBytesWritten();
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            writeFixed32(Float.floatToRawIntBits(list.get(size2).floatValue()));
        }
        writeVarint32(getTotalBytesWritten() - totalBytesWritten);
        writeTag(i12, 2);
    }

    private final void writeInt32List_Internal(int i12, List<Integer> list, boolean z12) {
        if (!z12) {
            for (int size = list.size() - 1; size >= 0; size--) {
                writeInt32(i12, list.get(size).intValue());
            }
            return;
        }
        requireSpace(e.f(10, 10, list));
        int totalBytesWritten = getTotalBytesWritten();
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            writeInt32(list.get(size2).intValue());
        }
        writeVarint32(getTotalBytesWritten() - totalBytesWritten);
        writeTag(i12, 2);
    }

    private void writeLazyString(int i12, Object obj) {
        if (obj instanceof String) {
            writeString(i12, (String) obj);
        } else {
            writeBytes(i12, (ByteString) obj);
        }
    }

    public static final void writeMapEntryField(Writer writer, int i12, WireFormat.FieldType fieldType, Object obj) {
        switch (AnonymousClass1.$SwitchMap$com$google$protobuf$WireFormat$FieldType[fieldType.ordinal()]) {
            case 1:
                writer.writeBool(i12, ((Boolean) obj).booleanValue());
                return;
            case 2:
                writer.writeFixed32(i12, ((Integer) obj).intValue());
                return;
            case 3:
                writer.writeFixed64(i12, ((Long) obj).longValue());
                return;
            case 4:
                writer.writeInt32(i12, ((Integer) obj).intValue());
                return;
            case 5:
                writer.writeInt64(i12, ((Long) obj).longValue());
                return;
            case 6:
                writer.writeSFixed32(i12, ((Integer) obj).intValue());
                return;
            case 7:
                writer.writeSFixed64(i12, ((Long) obj).longValue());
                return;
            case 8:
                writer.writeSInt32(i12, ((Integer) obj).intValue());
                return;
            case 9:
                writer.writeSInt64(i12, ((Long) obj).longValue());
                return;
            case 10:
                writer.writeString(i12, (String) obj);
                return;
            case 11:
                writer.writeUInt32(i12, ((Integer) obj).intValue());
                return;
            case 12:
                writer.writeUInt64(i12, ((Long) obj).longValue());
                return;
            case 13:
                writer.writeFloat(i12, ((Float) obj).floatValue());
                return;
            case 14:
                writer.writeDouble(i12, ((Double) obj).doubleValue());
                return;
            case 15:
                writer.writeMessage(i12, obj);
                return;
            case 16:
                writer.writeBytes(i12, (ByteString) obj);
                return;
            case 17:
                if (obj instanceof Internal.EnumLite) {
                    writer.writeEnum(i12, ((Internal.EnumLite) obj).getNumber());
                    return;
                } else {
                    if (!(obj instanceof Integer)) {
                        throw new IllegalArgumentException("Unexpected type for enum in map.");
                    }
                    writer.writeEnum(i12, ((Integer) obj).intValue());
                    return;
                }
            default:
                throw new IllegalArgumentException("Unsupported map value type for: " + fieldType);
        }
    }

    private final void writeSInt32List_Internal(int i12, List<Integer> list, boolean z12) {
        if (!z12) {
            for (int size = list.size() - 1; size >= 0; size--) {
                writeSInt32(i12, list.get(size).intValue());
            }
            return;
        }
        requireSpace(e.f(5, 10, list));
        int totalBytesWritten = getTotalBytesWritten();
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            writeSInt32(list.get(size2).intValue());
        }
        writeVarint32(getTotalBytesWritten() - totalBytesWritten);
        writeTag(i12, 2);
    }

    private final void writeSInt64List_Internal(int i12, List<Long> list, boolean z12) {
        if (!z12) {
            for (int size = list.size() - 1; size >= 0; size--) {
                writeSInt64(i12, list.get(size).longValue());
            }
            return;
        }
        requireSpace(e.f(10, 10, list));
        int totalBytesWritten = getTotalBytesWritten();
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            writeSInt64(list.get(size2).longValue());
        }
        writeVarint32(getTotalBytesWritten() - totalBytesWritten);
        writeTag(i12, 2);
    }

    private final void writeUInt32List_Internal(int i12, List<Integer> list, boolean z12) {
        if (!z12) {
            for (int size = list.size() - 1; size >= 0; size--) {
                writeUInt32(i12, list.get(size).intValue());
            }
            return;
        }
        requireSpace(e.f(5, 10, list));
        int totalBytesWritten = getTotalBytesWritten();
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            writeVarint32(list.get(size2).intValue());
        }
        writeVarint32(getTotalBytesWritten() - totalBytesWritten);
        writeTag(i12, 2);
    }

    private final void writeUInt64List_Internal(int i12, List<Long> list, boolean z12) {
        if (!z12) {
            for (int size = list.size() - 1; size >= 0; size--) {
                writeUInt64(i12, list.get(size).longValue());
            }
            return;
        }
        requireSpace(e.f(10, 10, list));
        int totalBytesWritten = getTotalBytesWritten();
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            writeVarint64(list.get(size2).longValue());
        }
        writeVarint32(getTotalBytesWritten() - totalBytesWritten);
        writeTag(i12, 2);
    }

    @CanIgnoreReturnValue
    public final Queue<AllocatedBuffer> complete() {
        finishCurrentBuffer();
        return this.buffers;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public final Writer.FieldOrder fieldOrder() {
        return Writer.FieldOrder.DESCENDING;
    }

    public abstract void finishCurrentBuffer();

    public abstract int getTotalBytesWritten();

    public final AllocatedBuffer newDirectBuffer() {
        return this.alloc.allocateDirectBuffer(this.chunkSize);
    }

    public final AllocatedBuffer newHeapBuffer() {
        return this.alloc.allocateHeapBuffer(this.chunkSize);
    }

    public abstract void requireSpace(int i12);

    public abstract void writeBool(boolean z12);

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public final void writeBoolList(int i12, List<Boolean> list, boolean z12) {
        if (list instanceof BooleanArrayList) {
            writeBoolList_Internal(i12, (BooleanArrayList) list, z12);
        } else {
            writeBoolList_Internal(i12, list, z12);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public final void writeBytesList(int i12, List<ByteString> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            writeBytes(i12, list.get(size));
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public final void writeDouble(int i12, double d12) {
        writeFixed64(i12, Double.doubleToRawLongBits(d12));
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public final void writeDoubleList(int i12, List<Double> list, boolean z12) {
        if (list instanceof DoubleArrayList) {
            writeDoubleList_Internal(i12, (DoubleArrayList) list, z12);
        } else {
            writeDoubleList_Internal(i12, list, z12);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public final void writeEnum(int i12, int i13) {
        writeInt32(i12, i13);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public final void writeEnumList(int i12, List<Integer> list, boolean z12) {
        writeInt32List(i12, list, z12);
    }

    public abstract void writeFixed32(int i12);

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public final void writeFixed32List(int i12, List<Integer> list, boolean z12) {
        if (list instanceof IntArrayList) {
            writeFixed32List_Internal(i12, (IntArrayList) list, z12);
        } else {
            writeFixed32List_Internal(i12, list, z12);
        }
    }

    public abstract void writeFixed64(long j12);

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public final void writeFixed64List(int i12, List<Long> list, boolean z12) {
        if (list instanceof LongArrayList) {
            writeFixed64List_Internal(i12, (LongArrayList) list, z12);
        } else {
            writeFixed64List_Internal(i12, list, z12);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public final void writeFloat(int i12, float f12) {
        writeFixed32(i12, Float.floatToRawIntBits(f12));
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public final void writeFloatList(int i12, List<Float> list, boolean z12) {
        if (list instanceof FloatArrayList) {
            writeFloatList_Internal(i12, (FloatArrayList) list, z12);
        } else {
            writeFloatList_Internal(i12, list, z12);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    @Deprecated
    public final void writeGroupList(int i12, List<?> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            writeGroup(i12, list.get(size));
        }
    }

    public abstract void writeInt32(int i12);

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public final void writeInt32List(int i12, List<Integer> list, boolean z12) {
        if (list instanceof IntArrayList) {
            writeInt32List_Internal(i12, (IntArrayList) list, z12);
        } else {
            writeInt32List_Internal(i12, list, z12);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public final void writeInt64(int i12, long j12) {
        writeUInt64(i12, j12);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public final void writeInt64List(int i12, List<Long> list, boolean z12) {
        writeUInt64List(i12, list, z12);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public <K, V> void writeMap(int i12, MapEntryLite.Metadata<K, V> metadata, Map<K, V> map) {
        for (Map.Entry<K, V> entry : map.entrySet()) {
            int totalBytesWritten = getTotalBytesWritten();
            writeMapEntryField(this, 2, metadata.valueType, entry.getValue());
            writeMapEntryField(this, 1, metadata.keyType, entry.getKey());
            writeVarint32(getTotalBytesWritten() - totalBytesWritten);
            writeTag(i12, 2);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public final void writeMessageList(int i12, List<?> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            writeMessage(i12, list.get(size));
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public final void writeMessageSetItem(int i12, Object obj) {
        writeTag(1, 4);
        if (obj instanceof ByteString) {
            writeBytes(3, (ByteString) obj);
        } else {
            writeMessage(3, obj);
        }
        writeUInt32(2, i12);
        writeTag(1, 3);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public final void writeSFixed32(int i12, int i13) {
        writeFixed32(i12, i13);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public final void writeSFixed32List(int i12, List<Integer> list, boolean z12) {
        writeFixed32List(i12, list, z12);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public final void writeSFixed64(int i12, long j12) {
        writeFixed64(i12, j12);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public final void writeSFixed64List(int i12, List<Long> list, boolean z12) {
        writeFixed64List(i12, list, z12);
    }

    public abstract void writeSInt32(int i12);

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public final void writeSInt32List(int i12, List<Integer> list, boolean z12) {
        if (list instanceof IntArrayList) {
            writeSInt32List_Internal(i12, (IntArrayList) list, z12);
        } else {
            writeSInt32List_Internal(i12, list, z12);
        }
    }

    public abstract void writeSInt64(long j12);

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public final void writeSInt64List(int i12, List<Long> list, boolean z12) {
        if (list instanceof LongArrayList) {
            writeSInt64List_Internal(i12, (LongArrayList) list, z12);
        } else {
            writeSInt64List_Internal(i12, list, z12);
        }
    }

    public abstract void writeString(String str);

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public final void writeStringList(int i12, List<String> list) {
        if (!(list instanceof LazyStringList)) {
            for (int size = list.size() - 1; size >= 0; size--) {
                writeString(i12, list.get(size));
            }
            return;
        }
        LazyStringList lazyStringList = (LazyStringList) list;
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            writeLazyString(i12, lazyStringList.getRaw(size2));
        }
    }

    public abstract void writeTag(int i12, int i13);

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public final void writeUInt32List(int i12, List<Integer> list, boolean z12) {
        if (list instanceof IntArrayList) {
            writeUInt32List_Internal(i12, (IntArrayList) list, z12);
        } else {
            writeUInt32List_Internal(i12, list, z12);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public final void writeUInt64List(int i12, List<Long> list, boolean z12) {
        if (list instanceof LongArrayList) {
            writeUInt64List_Internal(i12, (LongArrayList) list, z12);
        } else {
            writeUInt64List_Internal(i12, list, z12);
        }
    }

    public abstract void writeVarint32(int i12);

    public abstract void writeVarint64(long j12);

    private BinaryWriter(BufferAllocator bufferAllocator, int i12) {
        this.buffers = new ArrayDeque<>(4);
        if (i12 <= 0) {
            throw new IllegalArgumentException("chunkSize must be > 0");
        }
        this.alloc = (BufferAllocator) Internal.checkNotNull(bufferAllocator, "alloc");
        this.chunkSize = i12;
    }

    public static BinaryWriter newDirectInstance(BufferAllocator bufferAllocator, int i12) {
        return isUnsafeDirectSupported() ? newUnsafeDirectInstance(bufferAllocator, i12) : newSafeDirectInstance(bufferAllocator, i12);
    }

    public static BinaryWriter newHeapInstance(BufferAllocator bufferAllocator, int i12) {
        return isUnsafeHeapSupported() ? newUnsafeHeapInstance(bufferAllocator, i12) : newSafeHeapInstance(bufferAllocator, i12);
    }

    public final AllocatedBuffer newDirectBuffer(int i12) {
        return this.alloc.allocateDirectBuffer(Math.max(i12, this.chunkSize));
    }

    public final AllocatedBuffer newHeapBuffer(int i12) {
        return this.alloc.allocateHeapBuffer(Math.max(i12, this.chunkSize));
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    @Deprecated
    public final void writeGroupList(int i12, List<?> list, Schema schema) {
        for (int size = list.size() - 1; size >= 0; size--) {
            writeGroup(i12, list.get(size), schema);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Writer
    public final void writeMessageList(int i12, List<?> list, Schema schema) {
        for (int size = list.size() - 1; size >= 0; size--) {
            writeMessage(i12, list.get(size), schema);
        }
    }

    private final void writeBoolList_Internal(int i12, BooleanArrayList booleanArrayList, boolean z12) {
        if (z12) {
            requireSpace(booleanArrayList.size() + 10);
            int totalBytesWritten = getTotalBytesWritten();
            for (int size = booleanArrayList.size() - 1; size >= 0; size--) {
                writeBool(booleanArrayList.getBoolean(size));
            }
            writeVarint32(getTotalBytesWritten() - totalBytesWritten);
            writeTag(i12, 2);
            return;
        }
        for (int size2 = booleanArrayList.size() - 1; size2 >= 0; size2--) {
            writeBool(i12, booleanArrayList.getBoolean(size2));
        }
    }

    private final void writeDoubleList_Internal(int i12, DoubleArrayList doubleArrayList, boolean z12) {
        if (z12) {
            requireSpace((doubleArrayList.size() * 8) + 10);
            int totalBytesWritten = getTotalBytesWritten();
            for (int size = doubleArrayList.size() - 1; size >= 0; size--) {
                writeFixed64(Double.doubleToRawLongBits(doubleArrayList.getDouble(size)));
            }
            writeVarint32(getTotalBytesWritten() - totalBytesWritten);
            writeTag(i12, 2);
            return;
        }
        for (int size2 = doubleArrayList.size() - 1; size2 >= 0; size2--) {
            writeDouble(i12, doubleArrayList.getDouble(size2));
        }
    }

    private final void writeFixed32List_Internal(int i12, IntArrayList intArrayList, boolean z12) {
        if (z12) {
            requireSpace((intArrayList.size() * 4) + 10);
            int totalBytesWritten = getTotalBytesWritten();
            for (int size = intArrayList.size() - 1; size >= 0; size--) {
                writeFixed32(intArrayList.getInt(size));
            }
            writeVarint32(getTotalBytesWritten() - totalBytesWritten);
            writeTag(i12, 2);
            return;
        }
        for (int size2 = intArrayList.size() - 1; size2 >= 0; size2--) {
            writeFixed32(i12, intArrayList.getInt(size2));
        }
    }

    private final void writeFixed64List_Internal(int i12, LongArrayList longArrayList, boolean z12) {
        if (z12) {
            requireSpace((longArrayList.size() * 8) + 10);
            int totalBytesWritten = getTotalBytesWritten();
            for (int size = longArrayList.size() - 1; size >= 0; size--) {
                writeFixed64(longArrayList.getLong(size));
            }
            writeVarint32(getTotalBytesWritten() - totalBytesWritten);
            writeTag(i12, 2);
            return;
        }
        for (int size2 = longArrayList.size() - 1; size2 >= 0; size2--) {
            writeFixed64(i12, longArrayList.getLong(size2));
        }
    }

    private final void writeFloatList_Internal(int i12, FloatArrayList floatArrayList, boolean z12) {
        if (z12) {
            requireSpace((floatArrayList.size() * 4) + 10);
            int totalBytesWritten = getTotalBytesWritten();
            for (int size = floatArrayList.size() - 1; size >= 0; size--) {
                writeFixed32(Float.floatToRawIntBits(floatArrayList.getFloat(size)));
            }
            writeVarint32(getTotalBytesWritten() - totalBytesWritten);
            writeTag(i12, 2);
            return;
        }
        for (int size2 = floatArrayList.size() - 1; size2 >= 0; size2--) {
            writeFloat(i12, floatArrayList.getFloat(size2));
        }
    }

    private final void writeInt32List_Internal(int i12, IntArrayList intArrayList, boolean z12) {
        if (z12) {
            requireSpace((intArrayList.size() * 10) + 10);
            int totalBytesWritten = getTotalBytesWritten();
            for (int size = intArrayList.size() - 1; size >= 0; size--) {
                writeInt32(intArrayList.getInt(size));
            }
            writeVarint32(getTotalBytesWritten() - totalBytesWritten);
            writeTag(i12, 2);
            return;
        }
        for (int size2 = intArrayList.size() - 1; size2 >= 0; size2--) {
            writeInt32(i12, intArrayList.getInt(size2));
        }
    }

    private final void writeSInt32List_Internal(int i12, IntArrayList intArrayList, boolean z12) {
        if (z12) {
            requireSpace((intArrayList.size() * 5) + 10);
            int totalBytesWritten = getTotalBytesWritten();
            for (int size = intArrayList.size() - 1; size >= 0; size--) {
                writeSInt32(intArrayList.getInt(size));
            }
            writeVarint32(getTotalBytesWritten() - totalBytesWritten);
            writeTag(i12, 2);
            return;
        }
        for (int size2 = intArrayList.size() - 1; size2 >= 0; size2--) {
            writeSInt32(i12, intArrayList.getInt(size2));
        }
    }

    private final void writeSInt64List_Internal(int i12, LongArrayList longArrayList, boolean z12) {
        if (z12) {
            requireSpace((longArrayList.size() * 10) + 10);
            int totalBytesWritten = getTotalBytesWritten();
            for (int size = longArrayList.size() - 1; size >= 0; size--) {
                writeSInt64(longArrayList.getLong(size));
            }
            writeVarint32(getTotalBytesWritten() - totalBytesWritten);
            writeTag(i12, 2);
            return;
        }
        for (int size2 = longArrayList.size() - 1; size2 >= 0; size2--) {
            writeSInt64(i12, longArrayList.getLong(size2));
        }
    }

    private final void writeUInt32List_Internal(int i12, IntArrayList intArrayList, boolean z12) {
        if (z12) {
            requireSpace((intArrayList.size() * 5) + 10);
            int totalBytesWritten = getTotalBytesWritten();
            for (int size = intArrayList.size() - 1; size >= 0; size--) {
                writeVarint32(intArrayList.getInt(size));
            }
            writeVarint32(getTotalBytesWritten() - totalBytesWritten);
            writeTag(i12, 2);
            return;
        }
        for (int size2 = intArrayList.size() - 1; size2 >= 0; size2--) {
            writeUInt32(i12, intArrayList.getInt(size2));
        }
    }

    private final void writeUInt64List_Internal(int i12, LongArrayList longArrayList, boolean z12) {
        if (z12) {
            requireSpace((longArrayList.size() * 10) + 10);
            int totalBytesWritten = getTotalBytesWritten();
            for (int size = longArrayList.size() - 1; size >= 0; size--) {
                writeVarint64(longArrayList.getLong(size));
            }
            writeVarint32(getTotalBytesWritten() - totalBytesWritten);
            writeTag(i12, 2);
            return;
        }
        for (int size2 = longArrayList.size() - 1; size2 >= 0; size2--) {
            writeUInt64(i12, longArrayList.getLong(size2));
        }
    }
}
