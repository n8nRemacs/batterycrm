package com.google.crypto.tink.shaded.protobuf;

import androidx.compose.foundation.H;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Arrays;

/* loaded from: classes6.dex */
final class Utf8 {
    private static final long ASCII_MASK_LONG = -9187201950435737472L;
    static final int COMPLETE = 0;
    static final int MALFORMED = -1;
    static final int MAX_BYTES_PER_CHAR = 3;
    private static final int UNSAFE_COUNT_ASCII_THRESHOLD = 16;
    private static final Processor processor;

    public static class DecodeUtil {
        private DecodeUtil() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void handleFourBytes(byte b12, byte b13, byte b14, byte b15, char[] cArr, int i12) throws InvalidProtocolBufferException {
            if (!isNotTrailingByte(b13)) {
                if ((((b13 + 112) + (b12 << 28)) >> 30) == 0 && !isNotTrailingByte(b14) && !isNotTrailingByte(b15)) {
                    int iTrailingByteValue = ((b12 & 7) << 18) | (trailingByteValue(b13) << 12) | (trailingByteValue(b14) << 6) | trailingByteValue(b15);
                    cArr[i12] = highSurrogate(iTrailingByteValue);
                    cArr[i12 + 1] = lowSurrogate(iTrailingByteValue);
                    return;
                }
            }
            throw InvalidProtocolBufferException.invalidUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void handleOneByte(byte b12, char[] cArr, int i12) {
            cArr[i12] = (char) b12;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void handleThreeBytes(byte b12, byte b13, byte b14, char[] cArr, int i12) throws InvalidProtocolBufferException {
            if (isNotTrailingByte(b13) || ((b12 == -32 && b13 < -96) || ((b12 == -19 && b13 >= -96) || isNotTrailingByte(b14)))) {
                throw InvalidProtocolBufferException.invalidUtf8();
            }
            cArr[i12] = (char) (((b12 & 15) << 12) | (trailingByteValue(b13) << 6) | trailingByteValue(b14));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void handleTwoBytes(byte b12, byte b13, char[] cArr, int i12) throws InvalidProtocolBufferException {
            if (b12 < -62 || isNotTrailingByte(b13)) {
                throw InvalidProtocolBufferException.invalidUtf8();
            }
            cArr[i12] = (char) (((b12 & 31) << 6) | trailingByteValue(b13));
        }

        private static char highSurrogate(int i12) {
            return (char) ((i12 >>> 10) + 55232);
        }

        private static boolean isNotTrailingByte(byte b12) {
            return b12 > -65;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean isOneByte(byte b12) {
            return b12 >= 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean isThreeBytes(byte b12) {
            return b12 < -16;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean isTwoBytes(byte b12) {
            return b12 < -32;
        }

        private static char lowSurrogate(int i12) {
            return (char) ((i12 & 1023) + 56320);
        }

        private static int trailingByteValue(byte b12) {
            return b12 & 63;
        }
    }

    public static abstract class Processor {
        public final String decodeUtf8(ByteBuffer byteBuffer, int i12, int i13) {
            if (byteBuffer.hasArray()) {
                return decodeUtf8(byteBuffer.array(), byteBuffer.arrayOffset() + i12, i13);
            }
            return byteBuffer.isDirect() ? decodeUtf8Direct(byteBuffer, i12, i13) : decodeUtf8Default(byteBuffer, i12, i13);
        }

        public abstract String decodeUtf8(byte[] bArr, int i12, int i13);

        public final String decodeUtf8Default(ByteBuffer byteBuffer, int i12, int i13) throws InvalidProtocolBufferException {
            if ((i12 | i13 | ((byteBuffer.limit() - i12) - i13)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i12), Integer.valueOf(i13)));
            }
            int i14 = i12 + i13;
            char[] cArr = new char[i13];
            int i15 = 0;
            while (i12 < i14) {
                byte b12 = byteBuffer.get(i12);
                if (!DecodeUtil.isOneByte(b12)) {
                    break;
                }
                i12++;
                DecodeUtil.handleOneByte(b12, cArr, i15);
                i15++;
            }
            int i16 = i15;
            while (i12 < i14) {
                int i17 = i12 + 1;
                byte b13 = byteBuffer.get(i12);
                if (DecodeUtil.isOneByte(b13)) {
                    int i18 = i16 + 1;
                    DecodeUtil.handleOneByte(b13, cArr, i16);
                    while (i17 < i14) {
                        byte b14 = byteBuffer.get(i17);
                        if (!DecodeUtil.isOneByte(b14)) {
                            break;
                        }
                        i17++;
                        DecodeUtil.handleOneByte(b14, cArr, i18);
                        i18++;
                    }
                    i16 = i18;
                    i12 = i17;
                } else if (DecodeUtil.isTwoBytes(b13)) {
                    if (i17 >= i14) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    i12 += 2;
                    DecodeUtil.handleTwoBytes(b13, byteBuffer.get(i17), cArr, i16);
                    i16++;
                } else if (DecodeUtil.isThreeBytes(b13)) {
                    if (i17 >= i14 - 1) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    int i19 = i12 + 2;
                    i12 += 3;
                    DecodeUtil.handleThreeBytes(b13, byteBuffer.get(i17), byteBuffer.get(i19), cArr, i16);
                    i16++;
                } else {
                    if (i17 >= i14 - 2) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    byte b15 = byteBuffer.get(i17);
                    int i22 = i12 + 3;
                    byte b16 = byteBuffer.get(i12 + 2);
                    i12 += 4;
                    DecodeUtil.handleFourBytes(b13, b15, b16, byteBuffer.get(i22), cArr, i16);
                    i16 += 2;
                }
            }
            return new String(cArr, 0, i16);
        }

        public abstract String decodeUtf8Direct(ByteBuffer byteBuffer, int i12, int i13);

        public abstract int encodeUtf8(CharSequence charSequence, byte[] bArr, int i12, int i13);

        public final void encodeUtf8(CharSequence charSequence, ByteBuffer byteBuffer) {
            if (byteBuffer.hasArray()) {
                int iArrayOffset = byteBuffer.arrayOffset();
                byteBuffer.position(Utf8.encode(charSequence, byteBuffer.array(), byteBuffer.position() + iArrayOffset, byteBuffer.remaining()) - iArrayOffset);
            } else if (byteBuffer.isDirect()) {
                encodeUtf8Direct(charSequence, byteBuffer);
            } else {
                encodeUtf8Default(charSequence, byteBuffer);
            }
        }

        public final void encodeUtf8Default(CharSequence charSequence, ByteBuffer byteBuffer) {
            int i12;
            int length = charSequence.length();
            int iPosition = byteBuffer.position();
            int i13 = 0;
            while (i13 < length) {
                try {
                    char cCharAt = charSequence.charAt(i13);
                    if (cCharAt >= 128) {
                        break;
                    }
                    byteBuffer.put(iPosition + i13, (byte) cCharAt);
                    i13++;
                } catch (IndexOutOfBoundsException unused) {
                    throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(i13) + " at index " + (Math.max(i13, (iPosition - byteBuffer.position()) + 1) + byteBuffer.position()));
                }
            }
            if (i13 == length) {
                byteBuffer.position(iPosition + i13);
                return;
            }
            iPosition += i13;
            while (i13 < length) {
                char cCharAt2 = charSequence.charAt(i13);
                if (cCharAt2 < 128) {
                    byteBuffer.put(iPosition, (byte) cCharAt2);
                } else if (cCharAt2 < 2048) {
                    int i14 = iPosition + 1;
                    try {
                        byteBuffer.put(iPosition, (byte) ((cCharAt2 >>> 6) | 192));
                        byteBuffer.put(i14, (byte) ((cCharAt2 & '?') | 128));
                        iPosition = i14;
                    } catch (IndexOutOfBoundsException unused2) {
                        iPosition = i14;
                        throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(i13) + " at index " + (Math.max(i13, (iPosition - byteBuffer.position()) + 1) + byteBuffer.position()));
                    }
                } else {
                    if (cCharAt2 >= 55296 && 57343 >= cCharAt2) {
                        int i15 = i13 + 1;
                        if (i15 != length) {
                            try {
                                char cCharAt3 = charSequence.charAt(i15);
                                if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                    int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                                    int i16 = iPosition + 1;
                                    try {
                                        byteBuffer.put(iPosition, (byte) ((codePoint >>> 18) | 240));
                                        i12 = iPosition + 2;
                                    } catch (IndexOutOfBoundsException unused3) {
                                        iPosition = i16;
                                        i13 = i15;
                                        throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(i13) + " at index " + (Math.max(i13, (iPosition - byteBuffer.position()) + 1) + byteBuffer.position()));
                                    }
                                    try {
                                        byteBuffer.put(i16, (byte) (((codePoint >>> 12) & 63) | 128));
                                        iPosition += 3;
                                        byteBuffer.put(i12, (byte) (((codePoint >>> 6) & 63) | 128));
                                        byteBuffer.put(iPosition, (byte) ((codePoint & 63) | 128));
                                        i13 = i15;
                                    } catch (IndexOutOfBoundsException unused4) {
                                        i13 = i15;
                                        iPosition = i12;
                                        throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(i13) + " at index " + (Math.max(i13, (iPosition - byteBuffer.position()) + 1) + byteBuffer.position()));
                                    }
                                } else {
                                    i13 = i15;
                                }
                            } catch (IndexOutOfBoundsException unused5) {
                            }
                        }
                        throw new UnpairedSurrogateException(i13, length);
                    }
                    int i17 = iPosition + 1;
                    byteBuffer.put(iPosition, (byte) ((cCharAt2 >>> '\f') | 224));
                    iPosition += 2;
                    byteBuffer.put(i17, (byte) (((cCharAt2 >>> 6) & 63) | 128));
                    byteBuffer.put(iPosition, (byte) ((cCharAt2 & '?') | 128));
                }
                i13++;
                iPosition++;
            }
            byteBuffer.position(iPosition);
        }

        public abstract void encodeUtf8Direct(CharSequence charSequence, ByteBuffer byteBuffer);

        public final boolean isValidUtf8(byte[] bArr, int i12, int i13) {
            return partialIsValidUtf8(0, bArr, i12, i13) == 0;
        }

        public final int partialIsValidUtf8(int i12, ByteBuffer byteBuffer, int i13, int i14) {
            if (!byteBuffer.hasArray()) {
                return byteBuffer.isDirect() ? partialIsValidUtf8Direct(i12, byteBuffer, i13, i14) : partialIsValidUtf8Default(i12, byteBuffer, i13, i14);
            }
            int iArrayOffset = byteBuffer.arrayOffset();
            return partialIsValidUtf8(i12, byteBuffer.array(), i13 + iArrayOffset, iArrayOffset + i14);
        }

        public abstract int partialIsValidUtf8(int i12, byte[] bArr, int i13, int i14);

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0017, code lost:
        
            if (r8.get(r9) > (-65)) goto L13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x004c, code lost:
        
            if (r8.get(r9) > (-65)) goto L32;
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x008f, code lost:
        
            if (r8.get(r7) > (-65)) goto L53;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final int partialIsValidUtf8Default(int r7, java.nio.ByteBuffer r8, int r9, int r10) {
            /*
                r6 = this;
                if (r7 == 0) goto L92
                if (r9 < r10) goto L5
                return r7
            L5:
                byte r0 = (byte) r7
                r1 = -32
                r2 = -1
                r3 = -65
                if (r0 >= r1) goto L1e
                r7 = -62
                if (r0 < r7) goto L1d
                int r7 = r9 + 1
                byte r9 = r8.get(r9)
                if (r9 <= r3) goto L1a
                goto L1d
            L1a:
                r9 = r7
                goto L92
            L1d:
                return r2
            L1e:
                r4 = -16
                if (r0 >= r4) goto L4f
                int r7 = r7 >> 8
                int r7 = ~r7
                byte r7 = (byte) r7
                if (r7 != 0) goto L38
                int r7 = r9 + 1
                byte r9 = r8.get(r9)
                if (r7 < r10) goto L35
                int r7 = com.google.crypto.tink.shaded.protobuf.Utf8.access$000(r0, r9)
                return r7
            L35:
                r5 = r9
                r9 = r7
                r7 = r5
            L38:
                if (r7 > r3) goto L4e
                r4 = -96
                if (r0 != r1) goto L40
                if (r7 < r4) goto L4e
            L40:
                r1 = -19
                if (r0 != r1) goto L46
                if (r7 >= r4) goto L4e
            L46:
                int r7 = r9 + 1
                byte r9 = r8.get(r9)
                if (r9 <= r3) goto L1a
            L4e:
                return r2
            L4f:
                int r1 = r7 >> 8
                int r1 = ~r1
                byte r1 = (byte) r1
                if (r1 != 0) goto L64
                int r7 = r9 + 1
                byte r1 = r8.get(r9)
                if (r7 < r10) goto L62
                int r7 = com.google.crypto.tink.shaded.protobuf.Utf8.access$000(r0, r1)
                return r7
            L62:
                r9 = 0
                goto L6a
            L64:
                int r7 = r7 >> 16
                byte r7 = (byte) r7
                r5 = r9
                r9 = r7
                r7 = r5
            L6a:
                if (r9 != 0) goto L7c
                int r9 = r7 + 1
                byte r7 = r8.get(r7)
                if (r9 < r10) goto L79
                int r7 = com.google.crypto.tink.shaded.protobuf.Utf8.access$100(r0, r1, r7)
                return r7
            L79:
                r5 = r9
                r9 = r7
                r7 = r5
            L7c:
                if (r1 > r3) goto L91
                int r0 = r0 << 28
                int r1 = r1 + 112
                int r1 = r1 + r0
                int r0 = r1 >> 30
                if (r0 != 0) goto L91
                if (r9 > r3) goto L91
                int r9 = r7 + 1
                byte r7 = r8.get(r7)
                if (r7 <= r3) goto L92
            L91:
                return r2
            L92:
                int r7 = partialIsValidUtf8(r8, r9, r10)
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.Utf8.Processor.partialIsValidUtf8Default(int, java.nio.ByteBuffer, int, int):int");
        }

        public abstract int partialIsValidUtf8Direct(int i12, ByteBuffer byteBuffer, int i13, int i14);

        public final boolean isValidUtf8(ByteBuffer byteBuffer, int i12, int i13) {
            return partialIsValidUtf8(0, byteBuffer, i12, i13) == 0;
        }

        private static int partialIsValidUtf8(ByteBuffer byteBuffer, int i12, int i13) {
            int iEstimateConsecutiveAscii = i12 + Utf8.estimateConsecutiveAscii(byteBuffer, i12, i13);
            while (iEstimateConsecutiveAscii < i13) {
                int i14 = iEstimateConsecutiveAscii + 1;
                byte b12 = byteBuffer.get(iEstimateConsecutiveAscii);
                if (b12 >= 0) {
                    iEstimateConsecutiveAscii = i14;
                } else if (b12 < -32) {
                    if (i14 >= i13) {
                        return b12;
                    }
                    if (b12 < -62 || byteBuffer.get(i14) > -65) {
                        return -1;
                    }
                    iEstimateConsecutiveAscii += 2;
                } else {
                    if (b12 >= -16) {
                        if (i14 >= i13 - 2) {
                            return Utf8.incompleteStateFor(byteBuffer, b12, i14, i13 - i14);
                        }
                        int i15 = iEstimateConsecutiveAscii + 2;
                        byte b13 = byteBuffer.get(i14);
                        if (b13 <= -65) {
                            if ((((b13 + 112) + (b12 << 28)) >> 30) == 0) {
                                int i16 = iEstimateConsecutiveAscii + 3;
                                if (byteBuffer.get(i15) <= -65) {
                                    iEstimateConsecutiveAscii += 4;
                                    if (byteBuffer.get(i16) > -65) {
                                    }
                                }
                            }
                        }
                        return -1;
                    }
                    if (i14 >= i13 - 1) {
                        return Utf8.incompleteStateFor(byteBuffer, b12, i14, i13 - i14);
                    }
                    int i17 = iEstimateConsecutiveAscii + 2;
                    byte b14 = byteBuffer.get(i14);
                    if (b14 > -65 || ((b12 == -32 && b14 < -96) || ((b12 == -19 && b14 >= -96) || byteBuffer.get(i17) > -65))) {
                        return -1;
                    }
                    iEstimateConsecutiveAscii += 3;
                }
            }
            return 0;
        }
    }

    public static class UnpairedSurrogateException extends IllegalArgumentException {
        public UnpairedSurrogateException(int i12, int i13) {
            super(H.j(i12, i13, "Unpaired surrogate at index ", " of "));
        }
    }

    static {
        processor = (!UnsafeProcessor.isAvailable() || Android.isOnAndroidDevice()) ? new SafeProcessor() : new UnsafeProcessor();
    }

    private Utf8() {
    }

    public static String decodeUtf8(ByteBuffer byteBuffer, int i12, int i13) {
        return processor.decodeUtf8(byteBuffer, i12, i13);
    }

    public static int encode(CharSequence charSequence, byte[] bArr, int i12, int i13) {
        return processor.encodeUtf8(charSequence, bArr, i12, i13);
    }

    public static void encodeUtf8(CharSequence charSequence, ByteBuffer byteBuffer) {
        processor.encodeUtf8(charSequence, byteBuffer);
    }

    public static int encodedLength(CharSequence charSequence) {
        int length = charSequence.length();
        int i12 = 0;
        while (i12 < length && charSequence.charAt(i12) < 128) {
            i12++;
        }
        int iEncodedLengthGeneral = length;
        while (true) {
            if (i12 < length) {
                char cCharAt = charSequence.charAt(i12);
                if (cCharAt >= 2048) {
                    iEncodedLengthGeneral += encodedLengthGeneral(charSequence, i12);
                    break;
                }
                iEncodedLengthGeneral += (127 - cCharAt) >>> 31;
                i12++;
            } else {
                break;
            }
        }
        if (iEncodedLengthGeneral >= length) {
            return iEncodedLengthGeneral;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (iEncodedLengthGeneral + 4294967296L));
    }

    private static int encodedLengthGeneral(CharSequence charSequence, int i12) {
        int length = charSequence.length();
        int i13 = 0;
        while (i12 < length) {
            char cCharAt = charSequence.charAt(i12);
            if (cCharAt < 2048) {
                i13 += (127 - cCharAt) >>> 31;
            } else {
                i13 += 2;
                if (55296 <= cCharAt && cCharAt <= 57343) {
                    if (Character.codePointAt(charSequence, i12) < 65536) {
                        throw new UnpairedSurrogateException(i12, length);
                    }
                    i12++;
                }
            }
            i12++;
        }
        return i13;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int estimateConsecutiveAscii(ByteBuffer byteBuffer, int i12, int i13) {
        int i14 = i13 - 7;
        int i15 = i12;
        while (i15 < i14 && (byteBuffer.getLong(i15) & ASCII_MASK_LONG) == 0) {
            i15 += 8;
        }
        return i15 - i12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int incompleteStateFor(int i12) {
        if (i12 > -12) {
            return -1;
        }
        return i12;
    }

    public static boolean isValidUtf8(byte[] bArr) {
        return processor.isValidUtf8(bArr, 0, bArr.length);
    }

    public static int partialIsValidUtf8(int i12, byte[] bArr, int i13, int i14) {
        return processor.partialIsValidUtf8(i12, bArr, i13, i14);
    }

    public static String decodeUtf8(byte[] bArr, int i12, int i13) {
        return processor.decodeUtf8(bArr, i12, i13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int incompleteStateFor(int i12, int i13) {
        if (i12 > -12 || i13 > -65) {
            return -1;
        }
        return i12 ^ (i13 << 8);
    }

    public static boolean isValidUtf8(byte[] bArr, int i12, int i13) {
        return processor.isValidUtf8(bArr, i12, i13);
    }

    public static int partialIsValidUtf8(int i12, ByteBuffer byteBuffer, int i13, int i14) {
        return processor.partialIsValidUtf8(i12, byteBuffer, i13, i14);
    }

    public static final class UnsafeProcessor extends Processor {
        public static boolean isAvailable() {
            return UnsafeUtil.hasUnsafeArrayOperations() && UnsafeUtil.hasUnsafeByteBufferOperations();
        }

        private static int unsafeEstimateConsecutiveAscii(byte[] bArr, long j12, int i12) {
            int i13 = 0;
            if (i12 < 16) {
                return 0;
            }
            int i14 = 8 - (((int) j12) & 7);
            while (i13 < i14) {
                long j13 = 1 + j12;
                if (UnsafeUtil.getByte(bArr, j12) < 0) {
                    return i13;
                }
                i13++;
                j12 = j13;
            }
            while (true) {
                int i15 = i13 + 8;
                if (i15 > i12 || (UnsafeUtil.getLong((Object) bArr, UnsafeUtil.BYTE_ARRAY_BASE_OFFSET + j12) & Utf8.ASCII_MASK_LONG) != 0) {
                    break;
                }
                j12 += 8;
                i13 = i15;
            }
            while (i13 < i12) {
                long j14 = j12 + 1;
                if (UnsafeUtil.getByte(bArr, j12) < 0) {
                    return i13;
                }
                i13++;
                j12 = j14;
            }
            return i12;
        }

        private static int unsafeIncompleteStateFor(byte[] bArr, int i12, long j12, int i13) {
            if (i13 == 0) {
                return Utf8.incompleteStateFor(i12);
            }
            if (i13 == 1) {
                return Utf8.incompleteStateFor(i12, UnsafeUtil.getByte(bArr, j12));
            }
            if (i13 == 2) {
                return Utf8.incompleteStateFor(i12, UnsafeUtil.getByte(bArr, j12), UnsafeUtil.getByte(bArr, j12 + 1));
            }
            throw new AssertionError();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Utf8.Processor
        public String decodeUtf8(byte[] bArr, int i12, int i13) throws InvalidProtocolBufferException {
            Charset charset = Internal.UTF_8;
            String str = new String(bArr, i12, i13, charset);
            if (str.contains("�") && !Arrays.equals(str.getBytes(charset), Arrays.copyOfRange(bArr, i12, i13 + i12))) {
                throw InvalidProtocolBufferException.invalidUtf8();
            }
            return str;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Utf8.Processor
        public String decodeUtf8Direct(ByteBuffer byteBuffer, int i12, int i13) throws InvalidProtocolBufferException {
            if ((i12 | i13 | ((byteBuffer.limit() - i12) - i13)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i12), Integer.valueOf(i13)));
            }
            long jAddressOffset = UnsafeUtil.addressOffset(byteBuffer) + i12;
            long j12 = i13 + jAddressOffset;
            char[] cArr = new char[i13];
            int i14 = 0;
            while (jAddressOffset < j12) {
                byte b12 = UnsafeUtil.getByte(jAddressOffset);
                if (!DecodeUtil.isOneByte(b12)) {
                    break;
                }
                jAddressOffset++;
                DecodeUtil.handleOneByte(b12, cArr, i14);
                i14++;
            }
            int i15 = i14;
            while (jAddressOffset < j12) {
                long j13 = jAddressOffset + 1;
                byte b13 = UnsafeUtil.getByte(jAddressOffset);
                if (DecodeUtil.isOneByte(b13)) {
                    int i16 = i15 + 1;
                    DecodeUtil.handleOneByte(b13, cArr, i15);
                    while (j13 < j12) {
                        byte b14 = UnsafeUtil.getByte(j13);
                        if (!DecodeUtil.isOneByte(b14)) {
                            break;
                        }
                        j13++;
                        DecodeUtil.handleOneByte(b14, cArr, i16);
                        i16++;
                    }
                    i15 = i16;
                    jAddressOffset = j13;
                } else if (DecodeUtil.isTwoBytes(b13)) {
                    if (j13 >= j12) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    jAddressOffset += 2;
                    DecodeUtil.handleTwoBytes(b13, UnsafeUtil.getByte(j13), cArr, i15);
                    i15++;
                } else if (DecodeUtil.isThreeBytes(b13)) {
                    if (j13 >= j12 - 1) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    long j14 = 2 + jAddressOffset;
                    jAddressOffset += 3;
                    DecodeUtil.handleThreeBytes(b13, UnsafeUtil.getByte(j13), UnsafeUtil.getByte(j14), cArr, i15);
                    i15++;
                } else {
                    if (j13 >= j12 - 2) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    byte b15 = UnsafeUtil.getByte(j13);
                    long j15 = 3 + jAddressOffset;
                    byte b16 = UnsafeUtil.getByte(2 + jAddressOffset);
                    jAddressOffset += 4;
                    DecodeUtil.handleFourBytes(b13, b15, b16, UnsafeUtil.getByte(j15), cArr, i15);
                    i15 += 2;
                }
            }
            return new String(cArr, 0, i15);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Utf8.Processor
        public int encodeUtf8(CharSequence charSequence, byte[] bArr, int i12, int i13) {
            long j12;
            String str;
            String str2;
            int i14;
            long j13;
            long j14;
            char cCharAt;
            long j15 = i12;
            long j16 = i13 + j15;
            int length = charSequence.length();
            String str3 = " at index ";
            String str4 = "Failed writing ";
            if (length > i13 || bArr.length - i13 < i12) {
                throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(length - 1) + " at index " + (i12 + i13));
            }
            int i15 = 0;
            while (true) {
                j12 = 1;
                if (i15 >= length || (cCharAt = charSequence.charAt(i15)) >= 128) {
                    break;
                }
                UnsafeUtil.putByte(bArr, j15, (byte) cCharAt);
                i15++;
                j15 = 1 + j15;
            }
            if (i15 == length) {
                return (int) j15;
            }
            while (i15 < length) {
                char cCharAt2 = charSequence.charAt(i15);
                if (cCharAt2 >= 128 || j15 >= j16) {
                    if (cCharAt2 >= 2048 || j15 > j16 - 2) {
                        str = str3;
                        str2 = str4;
                        if ((cCharAt2 >= 55296 && 57343 >= cCharAt2) || j15 > j16 - 3) {
                            if (j15 > j16 - 4) {
                                if (55296 <= cCharAt2 && cCharAt2 <= 57343 && ((i14 = i15 + 1) == length || !Character.isSurrogatePair(cCharAt2, charSequence.charAt(i14)))) {
                                    throw new UnpairedSurrogateException(i15, length);
                                }
                                throw new ArrayIndexOutOfBoundsException(str2 + cCharAt2 + str + j15);
                            }
                            int i16 = i15 + 1;
                            if (i16 != length) {
                                char cCharAt3 = charSequence.charAt(i16);
                                if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                    int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                                    j13 = 1;
                                    UnsafeUtil.putByte(bArr, j15, (byte) ((codePoint >>> 18) | 240));
                                    j14 = j16;
                                    UnsafeUtil.putByte(bArr, j15 + 1, (byte) (((codePoint >>> 12) & 63) | 128));
                                    long j17 = j15 + 3;
                                    UnsafeUtil.putByte(bArr, j15 + 2, (byte) (((codePoint >>> 6) & 63) | 128));
                                    j15 += 4;
                                    UnsafeUtil.putByte(bArr, j17, (byte) ((codePoint & 63) | 128));
                                    i15 = i16;
                                } else {
                                    i15 = i16;
                                }
                            }
                            throw new UnpairedSurrogateException(i15 - 1, length);
                        }
                        UnsafeUtil.putByte(bArr, j15, (byte) ((cCharAt2 >>> '\f') | 480));
                        long j18 = j15 + 2;
                        UnsafeUtil.putByte(bArr, j15 + 1, (byte) (((cCharAt2 >>> 6) & 63) | 128));
                        j15 += 3;
                        UnsafeUtil.putByte(bArr, j18, (byte) ((cCharAt2 & '?') | 128));
                    } else {
                        str = str3;
                        str2 = str4;
                        long j19 = j15 + j12;
                        UnsafeUtil.putByte(bArr, j15, (byte) ((cCharAt2 >>> 6) | 960));
                        j15 += 2;
                        UnsafeUtil.putByte(bArr, j19, (byte) ((cCharAt2 & '?') | 128));
                    }
                    j14 = j16;
                    j13 = 1;
                } else {
                    UnsafeUtil.putByte(bArr, j15, (byte) cCharAt2);
                    j14 = j16;
                    str2 = str4;
                    j13 = j12;
                    j15 += j12;
                    str = str3;
                }
                i15++;
                str3 = str;
                str4 = str2;
                j12 = j13;
                j16 = j14;
            }
            return (int) j15;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Utf8.Processor
        public void encodeUtf8Direct(CharSequence charSequence, ByteBuffer byteBuffer) {
            long j12;
            char c12;
            long j13;
            int i12;
            int i13;
            char c13;
            char cCharAt;
            long jAddressOffset = UnsafeUtil.addressOffset(byteBuffer);
            long jPosition = byteBuffer.position() + jAddressOffset;
            long jLimit = byteBuffer.limit() + jAddressOffset;
            int length = charSequence.length();
            if (length > jLimit - jPosition) {
                throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(length - 1) + " at index " + byteBuffer.limit());
            }
            int i14 = 0;
            while (true) {
                j12 = 1;
                c12 = 128;
                if (i14 >= length || (cCharAt = charSequence.charAt(i14)) >= 128) {
                    break;
                }
                UnsafeUtil.putByte(jPosition, (byte) cCharAt);
                i14++;
                jPosition = 1 + jPosition;
            }
            if (i14 == length) {
                byteBuffer.position((int) (jPosition - jAddressOffset));
                return;
            }
            while (i14 < length) {
                char cCharAt2 = charSequence.charAt(i14);
                if (cCharAt2 >= c12 || jPosition >= jLimit) {
                    if (cCharAt2 >= 2048 || jPosition > jLimit - 2) {
                        j13 = jAddressOffset;
                        if ((cCharAt2 >= 55296 && 57343 >= cCharAt2) || jPosition > jLimit - 3) {
                            if (jPosition > jLimit - 4) {
                                if (55296 <= cCharAt2 && cCharAt2 <= 57343 && ((i12 = i14 + 1) == length || !Character.isSurrogatePair(cCharAt2, charSequence.charAt(i12)))) {
                                    throw new UnpairedSurrogateException(i14, length);
                                }
                                throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt2 + " at index " + jPosition);
                            }
                            i13 = i14 + 1;
                            if (i13 != length) {
                                char cCharAt3 = charSequence.charAt(i13);
                                if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                    int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                                    UnsafeUtil.putByte(jPosition, (byte) ((codePoint >>> 18) | 240));
                                    c13 = 128;
                                    UnsafeUtil.putByte(jPosition + 1, (byte) (((codePoint >>> 12) & 63) | 128));
                                    long j14 = jPosition + 3;
                                    UnsafeUtil.putByte(jPosition + 2, (byte) (((codePoint >>> 6) & 63) | 128));
                                    jPosition += 4;
                                    UnsafeUtil.putByte(j14, (byte) ((codePoint & 63) | 128));
                                } else {
                                    i14 = i13;
                                }
                            }
                            throw new UnpairedSurrogateException(i14 - 1, length);
                        }
                        long j15 = jPosition + j12;
                        UnsafeUtil.putByte(jPosition, (byte) ((cCharAt2 >>> '\f') | 480));
                        long j16 = jPosition + 2;
                        UnsafeUtil.putByte(j15, (byte) (((cCharAt2 >>> 6) & 63) | 128));
                        jPosition += 3;
                        UnsafeUtil.putByte(j16, (byte) ((cCharAt2 & '?') | 128));
                    } else {
                        j13 = jAddressOffset;
                        long j17 = jPosition + j12;
                        UnsafeUtil.putByte(jPosition, (byte) ((cCharAt2 >>> 6) | 960));
                        jPosition += 2;
                        UnsafeUtil.putByte(j17, (byte) ((cCharAt2 & '?') | 128));
                    }
                    i13 = i14;
                    c13 = 128;
                } else {
                    UnsafeUtil.putByte(jPosition, (byte) cCharAt2);
                    j13 = jAddressOffset;
                    i13 = i14;
                    c13 = c12;
                    jPosition += j12;
                }
                c12 = c13;
                jAddressOffset = j13;
                j12 = 1;
                i14 = i13 + 1;
            }
            byteBuffer.position((int) (jPosition - jAddressOffset));
        }

        /* JADX WARN: Code restructure failed: missing block: B:35:0x0058, code lost:
        
            if (com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r12, r0) > (-65)) goto L38;
         */
        /* JADX WARN: Code restructure failed: missing block: B:58:0x009e, code lost:
        
            if (com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r12, r0) > (-65)) goto L59;
         */
        @Override // com.google.crypto.tink.shaded.protobuf.Utf8.Processor
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public int partialIsValidUtf8(int r11, byte[] r12, int r13, int r14) {
            /*
                Method dump skipped, instructions count: 197
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.Utf8.UnsafeProcessor.partialIsValidUtf8(int, byte[], int, int):int");
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x002d, code lost:
        
            if (com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r0) > (-65)) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x0061, code lost:
        
            if (com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r0) > (-65)) goto L36;
         */
        /* JADX WARN: Code restructure failed: missing block: B:56:0x00a3, code lost:
        
            if (com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r0) > (-65)) goto L57;
         */
        @Override // com.google.crypto.tink.shaded.protobuf.Utf8.Processor
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public int partialIsValidUtf8Direct(int r10, java.nio.ByteBuffer r11, int r12, int r13) {
            /*
                Method dump skipped, instructions count: 205
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.Utf8.UnsafeProcessor.partialIsValidUtf8Direct(int, java.nio.ByteBuffer, int, int):int");
        }

        private static int unsafeEstimateConsecutiveAscii(long j12, int i12) {
            if (i12 < 16) {
                return 0;
            }
            int i13 = (int) ((-j12) & 7);
            int i14 = i13;
            while (i14 > 0) {
                long j13 = 1 + j12;
                if (UnsafeUtil.getByte(j12) < 0) {
                    return i13 - i14;
                }
                i14--;
                j12 = j13;
            }
            int i15 = i12 - i13;
            while (i15 >= 8 && (UnsafeUtil.getLong(j12) & Utf8.ASCII_MASK_LONG) == 0) {
                j12 += 8;
                i15 -= 8;
            }
            return i12 - i15;
        }

        private static int unsafeIncompleteStateFor(long j12, int i12, int i13) {
            if (i13 == 0) {
                return Utf8.incompleteStateFor(i12);
            }
            if (i13 == 1) {
                return Utf8.incompleteStateFor(i12, UnsafeUtil.getByte(j12));
            }
            if (i13 == 2) {
                return Utf8.incompleteStateFor(i12, UnsafeUtil.getByte(j12), UnsafeUtil.getByte(j12 + 1));
            }
            throw new AssertionError();
        }

        /* JADX WARN: Code restructure failed: missing block: B:22:0x0039, code lost:
        
            return -1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x0064, code lost:
        
            return -1;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static int partialIsValidUtf8(byte[] r10, long r11, int r13) {
            /*
                int r0 = unsafeEstimateConsecutiveAscii(r10, r11, r13)
                int r13 = r13 - r0
                long r0 = (long) r0
                long r11 = r11 + r0
            L7:
                r0 = 0
                r1 = r0
            L9:
                r2 = 1
                if (r13 <= 0) goto L1a
                long r4 = r11 + r2
                byte r1 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r10, r11)
                if (r1 < 0) goto L19
                int r13 = r13 + (-1)
                r11 = r4
                goto L9
            L19:
                r11 = r4
            L1a:
                if (r13 != 0) goto L1d
                return r0
            L1d:
                int r0 = r13 + (-1)
                r4 = -32
                r5 = -1
                r6 = -65
                if (r1 >= r4) goto L3a
                if (r0 != 0) goto L29
                return r1
            L29:
                int r13 = r13 + (-2)
                r0 = -62
                if (r1 < r0) goto L39
                long r2 = r2 + r11
                byte r11 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r10, r11)
                if (r11 <= r6) goto L37
                goto L39
            L37:
                r11 = r2
                goto L7
            L39:
                return r5
            L3a:
                r7 = -16
                r8 = 2
                if (r1 >= r7) goto L65
                r7 = 2
                if (r0 >= r7) goto L48
                int r10 = unsafeIncompleteStateFor(r10, r1, r11, r0)
                return r10
            L48:
                int r13 = r13 + (-3)
                long r2 = r2 + r11
                byte r0 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r10, r11)
                if (r0 > r6) goto L64
                r7 = -96
                if (r1 != r4) goto L57
                if (r0 < r7) goto L64
            L57:
                r4 = -19
                if (r1 != r4) goto L5d
                if (r0 >= r7) goto L64
            L5d:
                long r11 = r11 + r8
                byte r0 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r10, r2)
                if (r0 <= r6) goto L7
            L64:
                return r5
            L65:
                r4 = 3
                if (r0 >= r4) goto L6d
                int r10 = unsafeIncompleteStateFor(r10, r1, r11, r0)
                return r10
            L6d:
                int r13 = r13 + (-4)
                long r2 = r2 + r11
                byte r0 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r10, r11)
                if (r0 > r6) goto L8f
                int r1 = r1 << 28
                int r0 = r0 + 112
                int r0 = r0 + r1
                int r0 = r0 >> 30
                if (r0 != 0) goto L8f
                long r8 = r8 + r11
                byte r0 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r10, r2)
                if (r0 > r6) goto L8f
                r0 = 3
                long r11 = r11 + r0
                byte r0 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r10, r8)
                if (r0 <= r6) goto L7
            L8f:
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.Utf8.UnsafeProcessor.partialIsValidUtf8(byte[], long, int):int");
        }

        /* JADX WARN: Code restructure failed: missing block: B:22:0x0039, code lost:
        
            return -1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x0064, code lost:
        
            return -1;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static int partialIsValidUtf8(long r10, int r12) {
            /*
                int r0 = unsafeEstimateConsecutiveAscii(r10, r12)
                long r1 = (long) r0
                long r10 = r10 + r1
                int r12 = r12 - r0
            L7:
                r0 = 0
                r1 = r0
            L9:
                r2 = 1
                if (r12 <= 0) goto L1a
                long r4 = r10 + r2
                byte r1 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r10)
                if (r1 < 0) goto L19
                int r12 = r12 + (-1)
                r10 = r4
                goto L9
            L19:
                r10 = r4
            L1a:
                if (r12 != 0) goto L1d
                return r0
            L1d:
                int r0 = r12 + (-1)
                r4 = -32
                r5 = -1
                r6 = -65
                if (r1 >= r4) goto L3a
                if (r0 != 0) goto L29
                return r1
            L29:
                int r12 = r12 + (-2)
                r0 = -62
                if (r1 < r0) goto L39
                long r2 = r2 + r10
                byte r10 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r10)
                if (r10 <= r6) goto L37
                goto L39
            L37:
                r10 = r2
                goto L7
            L39:
                return r5
            L3a:
                r7 = -16
                r8 = 2
                if (r1 >= r7) goto L65
                r7 = 2
                if (r0 >= r7) goto L48
                int r10 = unsafeIncompleteStateFor(r10, r1, r0)
                return r10
            L48:
                int r12 = r12 + (-3)
                long r2 = r2 + r10
                byte r0 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r10)
                if (r0 > r6) goto L64
                r7 = -96
                if (r1 != r4) goto L57
                if (r0 < r7) goto L64
            L57:
                r4 = -19
                if (r1 != r4) goto L5d
                if (r0 >= r7) goto L64
            L5d:
                long r10 = r10 + r8
                byte r0 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r2)
                if (r0 <= r6) goto L7
            L64:
                return r5
            L65:
                r4 = 3
                if (r0 >= r4) goto L6d
                int r10 = unsafeIncompleteStateFor(r10, r1, r0)
                return r10
            L6d:
                int r12 = r12 + (-4)
                long r2 = r2 + r10
                byte r0 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r10)
                if (r0 > r6) goto L8f
                int r1 = r1 << 28
                int r0 = r0 + 112
                int r0 = r0 + r1
                int r0 = r0 >> 30
                if (r0 != 0) goto L8f
                long r8 = r8 + r10
                byte r0 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r2)
                if (r0 > r6) goto L8f
                r0 = 3
                long r10 = r10 + r0
                byte r0 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r8)
                if (r0 <= r6) goto L7
            L8f:
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.Utf8.UnsafeProcessor.partialIsValidUtf8(long, int):int");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int incompleteStateFor(int i12, int i13, int i14) {
        if (i12 > -12 || i13 > -65 || i14 > -65) {
            return -1;
        }
        return (i12 ^ (i13 << 8)) ^ (i14 << 16);
    }

    public static boolean isValidUtf8(ByteBuffer byteBuffer) {
        return processor.isValidUtf8(byteBuffer, byteBuffer.position(), byteBuffer.remaining());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int incompleteStateFor(byte[] bArr, int i12, int i13) {
        byte b12 = bArr[i12 - 1];
        int i14 = i13 - i12;
        if (i14 == 0) {
            return incompleteStateFor(b12);
        }
        if (i14 == 1) {
            return incompleteStateFor(b12, bArr[i12]);
        }
        if (i14 == 2) {
            return incompleteStateFor(b12, bArr[i12], bArr[i12 + 1]);
        }
        throw new AssertionError();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int incompleteStateFor(ByteBuffer byteBuffer, int i12, int i13, int i14) {
        if (i14 == 0) {
            return incompleteStateFor(i12);
        }
        if (i14 == 1) {
            return incompleteStateFor(i12, byteBuffer.get(i13));
        }
        if (i14 == 2) {
            return incompleteStateFor(i12, byteBuffer.get(i13), byteBuffer.get(i13 + 1));
        }
        throw new AssertionError();
    }

    public static final class SafeProcessor extends Processor {
        private static int partialIsValidUtf8NonAscii(byte[] bArr, int i12, int i13) {
            while (i12 < i13) {
                int i14 = i12 + 1;
                byte b12 = bArr[i12];
                if (b12 < 0) {
                    if (b12 < -32) {
                        if (i14 >= i13) {
                            return b12;
                        }
                        if (b12 >= -62) {
                            i12 += 2;
                            if (bArr[i14] > -65) {
                            }
                        }
                        return -1;
                    }
                    if (b12 < -16) {
                        if (i14 >= i13 - 1) {
                            return Utf8.incompleteStateFor(bArr, i14, i13);
                        }
                        int i15 = i12 + 2;
                        byte b13 = bArr[i14];
                        if (b13 <= -65 && ((b12 != -32 || b13 >= -96) && (b12 != -19 || b13 < -96))) {
                            i12 += 3;
                            if (bArr[i15] > -65) {
                            }
                        }
                        return -1;
                    }
                    if (i14 >= i13 - 2) {
                        return Utf8.incompleteStateFor(bArr, i14, i13);
                    }
                    int i16 = i12 + 2;
                    byte b14 = bArr[i14];
                    if (b14 <= -65) {
                        if ((((b14 + 112) + (b12 << 28)) >> 30) == 0) {
                            int i17 = i12 + 3;
                            if (bArr[i16] <= -65) {
                                i12 += 4;
                                if (bArr[i17] > -65) {
                                }
                            }
                        }
                    }
                    return -1;
                }
                i12 = i14;
            }
            return 0;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Utf8.Processor
        public String decodeUtf8(byte[] bArr, int i12, int i13) throws InvalidProtocolBufferException {
            if ((i12 | i13 | ((bArr.length - i12) - i13)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i12), Integer.valueOf(i13)));
            }
            int i14 = i12 + i13;
            char[] cArr = new char[i13];
            int i15 = 0;
            while (i12 < i14) {
                byte b12 = bArr[i12];
                if (!DecodeUtil.isOneByte(b12)) {
                    break;
                }
                i12++;
                DecodeUtil.handleOneByte(b12, cArr, i15);
                i15++;
            }
            int i16 = i15;
            while (i12 < i14) {
                int i17 = i12 + 1;
                byte b13 = bArr[i12];
                if (DecodeUtil.isOneByte(b13)) {
                    int i18 = i16 + 1;
                    DecodeUtil.handleOneByte(b13, cArr, i16);
                    while (i17 < i14) {
                        byte b14 = bArr[i17];
                        if (!DecodeUtil.isOneByte(b14)) {
                            break;
                        }
                        i17++;
                        DecodeUtil.handleOneByte(b14, cArr, i18);
                        i18++;
                    }
                    i16 = i18;
                    i12 = i17;
                } else if (DecodeUtil.isTwoBytes(b13)) {
                    if (i17 >= i14) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    i12 += 2;
                    DecodeUtil.handleTwoBytes(b13, bArr[i17], cArr, i16);
                    i16++;
                } else if (DecodeUtil.isThreeBytes(b13)) {
                    if (i17 >= i14 - 1) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    int i19 = i12 + 2;
                    i12 += 3;
                    DecodeUtil.handleThreeBytes(b13, bArr[i17], bArr[i19], cArr, i16);
                    i16++;
                } else {
                    if (i17 >= i14 - 2) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    byte b15 = bArr[i17];
                    int i22 = i12 + 3;
                    byte b16 = bArr[i12 + 2];
                    i12 += 4;
                    DecodeUtil.handleFourBytes(b13, b15, b16, bArr[i22], cArr, i16);
                    i16 += 2;
                }
            }
            return new String(cArr, 0, i16);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Utf8.Processor
        public String decodeUtf8Direct(ByteBuffer byteBuffer, int i12, int i13) {
            return decodeUtf8Default(byteBuffer, i12, i13);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Utf8.Processor
        public int encodeUtf8(CharSequence charSequence, byte[] bArr, int i12, int i13) {
            int i14;
            int i15;
            char cCharAt;
            int length = charSequence.length();
            int i16 = i13 + i12;
            int i17 = 0;
            while (i17 < length && (i15 = i17 + i12) < i16 && (cCharAt = charSequence.charAt(i17)) < 128) {
                bArr[i15] = (byte) cCharAt;
                i17++;
            }
            if (i17 == length) {
                return i12 + length;
            }
            int i18 = i12 + i17;
            while (i17 < length) {
                char cCharAt2 = charSequence.charAt(i17);
                if (cCharAt2 < 128 && i18 < i16) {
                    bArr[i18] = (byte) cCharAt2;
                    i18++;
                } else if (cCharAt2 < 2048 && i18 <= i16 - 2) {
                    int i19 = i18 + 1;
                    bArr[i18] = (byte) ((cCharAt2 >>> 6) | 960);
                    i18 += 2;
                    bArr[i19] = (byte) ((cCharAt2 & '?') | 128);
                } else {
                    if ((cCharAt2 >= 55296 && 57343 >= cCharAt2) || i18 > i16 - 3) {
                        if (i18 > i16 - 4) {
                            if (55296 <= cCharAt2 && cCharAt2 <= 57343 && ((i14 = i17 + 1) == charSequence.length() || !Character.isSurrogatePair(cCharAt2, charSequence.charAt(i14)))) {
                                throw new UnpairedSurrogateException(i17, length);
                            }
                            throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt2 + " at index " + i18);
                        }
                        int i22 = i17 + 1;
                        if (i22 != charSequence.length()) {
                            char cCharAt3 = charSequence.charAt(i22);
                            if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                                bArr[i18] = (byte) ((codePoint >>> 18) | 240);
                                bArr[i18 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                                int i23 = i18 + 3;
                                bArr[i18 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                                i18 += 4;
                                bArr[i23] = (byte) ((codePoint & 63) | 128);
                                i17 = i22;
                            } else {
                                i17 = i22;
                            }
                        }
                        throw new UnpairedSurrogateException(i17 - 1, length);
                    }
                    bArr[i18] = (byte) ((cCharAt2 >>> '\f') | 480);
                    int i24 = i18 + 2;
                    bArr[i18 + 1] = (byte) (((cCharAt2 >>> 6) & 63) | 128);
                    i18 += 3;
                    bArr[i24] = (byte) ((cCharAt2 & '?') | 128);
                }
                i17++;
            }
            return i18;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Utf8.Processor
        public void encodeUtf8Direct(CharSequence charSequence, ByteBuffer byteBuffer) {
            encodeUtf8Default(charSequence, byteBuffer);
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0015, code lost:
        
            if (r8[r9] > (-65)) goto L13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x0046, code lost:
        
            if (r8[r9] > (-65)) goto L32;
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x0083, code lost:
        
            if (r8[r7] > (-65)) goto L53;
         */
        @Override // com.google.crypto.tink.shaded.protobuf.Utf8.Processor
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public int partialIsValidUtf8(int r7, byte[] r8, int r9, int r10) {
            /*
                r6 = this;
                if (r7 == 0) goto L86
                if (r9 < r10) goto L5
                return r7
            L5:
                byte r0 = (byte) r7
                r1 = -32
                r2 = -1
                r3 = -65
                if (r0 >= r1) goto L1c
                r7 = -62
                if (r0 < r7) goto L1b
                int r7 = r9 + 1
                r9 = r8[r9]
                if (r9 <= r3) goto L18
                goto L1b
            L18:
                r9 = r7
                goto L86
            L1b:
                return r2
            L1c:
                r4 = -16
                if (r0 >= r4) goto L49
                int r7 = r7 >> 8
                int r7 = ~r7
                byte r7 = (byte) r7
                if (r7 != 0) goto L34
                int r7 = r9 + 1
                r9 = r8[r9]
                if (r7 < r10) goto L31
                int r7 = com.google.crypto.tink.shaded.protobuf.Utf8.access$000(r0, r9)
                return r7
            L31:
                r5 = r9
                r9 = r7
                r7 = r5
            L34:
                if (r7 > r3) goto L48
                r4 = -96
                if (r0 != r1) goto L3c
                if (r7 < r4) goto L48
            L3c:
                r1 = -19
                if (r0 != r1) goto L42
                if (r7 >= r4) goto L48
            L42:
                int r7 = r9 + 1
                r9 = r8[r9]
                if (r9 <= r3) goto L18
            L48:
                return r2
            L49:
                int r1 = r7 >> 8
                int r1 = ~r1
                byte r1 = (byte) r1
                if (r1 != 0) goto L5c
                int r7 = r9 + 1
                r1 = r8[r9]
                if (r7 < r10) goto L5a
                int r7 = com.google.crypto.tink.shaded.protobuf.Utf8.access$000(r0, r1)
                return r7
            L5a:
                r9 = 0
                goto L62
            L5c:
                int r7 = r7 >> 16
                byte r7 = (byte) r7
                r5 = r9
                r9 = r7
                r7 = r5
            L62:
                if (r9 != 0) goto L72
                int r9 = r7 + 1
                r7 = r8[r7]
                if (r9 < r10) goto L6f
                int r7 = com.google.crypto.tink.shaded.protobuf.Utf8.access$100(r0, r1, r7)
                return r7
            L6f:
                r5 = r9
                r9 = r7
                r7 = r5
            L72:
                if (r1 > r3) goto L85
                int r0 = r0 << 28
                int r1 = r1 + 112
                int r1 = r1 + r0
                int r0 = r1 >> 30
                if (r0 != 0) goto L85
                if (r9 > r3) goto L85
                int r9 = r7 + 1
                r7 = r8[r7]
                if (r7 <= r3) goto L86
            L85:
                return r2
            L86:
                int r7 = partialIsValidUtf8(r8, r9, r10)
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.Utf8.SafeProcessor.partialIsValidUtf8(int, byte[], int, int):int");
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Utf8.Processor
        public int partialIsValidUtf8Direct(int i12, ByteBuffer byteBuffer, int i13, int i14) {
            return partialIsValidUtf8Default(i12, byteBuffer, i13, i14);
        }

        private static int partialIsValidUtf8(byte[] bArr, int i12, int i13) {
            while (i12 < i13 && bArr[i12] >= 0) {
                i12++;
            }
            if (i12 >= i13) {
                return 0;
            }
            return partialIsValidUtf8NonAscii(bArr, i12, i13);
        }
    }
}
