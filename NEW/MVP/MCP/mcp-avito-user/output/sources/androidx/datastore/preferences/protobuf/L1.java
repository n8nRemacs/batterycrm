package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.K1;
import java.nio.ByteBuffer;

/* compiled from: Utf8.java */
/* loaded from: classes.dex */
final class L1 {

    /* renamed from: a, reason: collision with root package name */
    public static final b f45728a;

    /* compiled from: Utf8.java */
    public static class a {
        public static void a(byte b12, byte b13, byte b14, byte b15, char[] cArr, int i12) throws InvalidProtocolBufferException {
            if (!e(b13)) {
                if ((((b13 + 112) + (b12 << 28)) >> 30) == 0 && !e(b14) && !e(b15)) {
                    int i13 = ((b12 & 7) << 18) | ((b13 & 63) << 12) | ((b14 & 63) << 6) | (b15 & 63);
                    cArr[i12] = (char) ((i13 >>> 10) + 55232);
                    cArr[i12 + 1] = (char) ((i13 & 1023) + 56320);
                    return;
                }
            }
            throw InvalidProtocolBufferException.c();
        }

        public static boolean b(byte b12) {
            return b12 >= 0;
        }

        public static void c(byte b12, byte b13, char[] cArr, int i12) throws InvalidProtocolBufferException {
            if (b12 < -62 || e(b13)) {
                throw InvalidProtocolBufferException.c();
            }
            cArr[i12] = (char) (((b12 & 31) << 6) | (b13 & 63));
        }

        public static void d(byte b12, byte b13, byte b14, char[] cArr, int i12) throws InvalidProtocolBufferException {
            if (e(b13) || ((b12 == -32 && b13 < -96) || ((b12 == -19 && b13 >= -96) || e(b14)))) {
                throw InvalidProtocolBufferException.c();
            }
            cArr[i12] = (char) (((b12 & 15) << 12) | ((b13 & 63) << 6) | (b14 & 63));
        }

        public static boolean e(byte b12) {
            return b12 > -65;
        }
    }

    /* compiled from: Utf8.java */
    public static abstract class b {
        public static String b(ByteBuffer byteBuffer, int i12, int i13) throws InvalidProtocolBufferException {
            if ((i12 | i13 | ((byteBuffer.limit() - i12) - i13)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i12), Integer.valueOf(i13)));
            }
            int i14 = i12 + i13;
            char[] cArr = new char[i13];
            int i15 = 0;
            while (i12 < i14) {
                byte b12 = byteBuffer.get(i12);
                if (!a.b(b12)) {
                    break;
                }
                i12++;
                cArr[i15] = (char) b12;
                i15++;
            }
            int i16 = i15;
            while (i12 < i14) {
                int i17 = i12 + 1;
                byte b13 = byteBuffer.get(i12);
                if (a.b(b13)) {
                    int i18 = i16 + 1;
                    cArr[i16] = (char) b13;
                    while (i17 < i14) {
                        byte b14 = byteBuffer.get(i17);
                        if (!a.b(b14)) {
                            break;
                        }
                        i17++;
                        cArr[i18] = (char) b14;
                        i18++;
                    }
                    i16 = i18;
                    i12 = i17;
                } else if (b13 < -32) {
                    if (i17 >= i14) {
                        throw InvalidProtocolBufferException.c();
                    }
                    i12 += 2;
                    a.c(b13, byteBuffer.get(i17), cArr, i16);
                    i16++;
                } else if (b13 < -16) {
                    if (i17 >= i14 - 1) {
                        throw InvalidProtocolBufferException.c();
                    }
                    int i19 = i12 + 2;
                    i12 += 3;
                    a.d(b13, byteBuffer.get(i17), byteBuffer.get(i19), cArr, i16);
                    i16++;
                } else {
                    if (i17 >= i14 - 2) {
                        throw InvalidProtocolBufferException.c();
                    }
                    byte b15 = byteBuffer.get(i17);
                    int i22 = i12 + 3;
                    byte b16 = byteBuffer.get(i12 + 2);
                    i12 += 4;
                    a.a(b13, b15, b16, byteBuffer.get(i22), cArr, i16);
                    i16 += 2;
                }
            }
            return new String(cArr, 0, i16);
        }

        /* JADX WARN: Code restructure failed: missing block: B:28:0x0057, code lost:
        
            if (r19.get(r0) > (-65)) goto L29;
         */
        /* JADX WARN: Code restructure failed: missing block: B:49:0x009e, code lost:
        
            if (r19.get(r0) > (-65)) goto L50;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static int h(int r18, java.nio.ByteBuffer r19, int r20, int r21) {
            /*
                Method dump skipped, instructions count: 307
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.L1.b.h(int, java.nio.ByteBuffer, int, int):int");
        }

        public abstract String a(byte[] bArr, int i12, int i13);

        public abstract String c(ByteBuffer byteBuffer, int i12, int i13);

        public abstract int d(int i12, int i13, String str, byte[] bArr);

        public final boolean e(byte[] bArr, int i12, int i13) {
            return g(0, bArr, i12, i13) == 0;
        }

        public final int f(int i12, ByteBuffer byteBuffer, int i13, int i14) {
            if (!byteBuffer.hasArray()) {
                return byteBuffer.isDirect() ? i(i12, byteBuffer, i13, i14) : h(i12, byteBuffer, i13, i14);
            }
            int iArrayOffset = byteBuffer.arrayOffset();
            return g(i12, byteBuffer.array(), i13 + iArrayOffset, iArrayOffset + i14);
        }

        public abstract int g(int i12, byte[] bArr, int i13, int i14);

        public abstract int i(int i12, ByteBuffer byteBuffer, int i13, int i14);
    }

    /* compiled from: Utf8.java */
    public static final class c extends b {
        @Override // androidx.datastore.preferences.protobuf.L1.b
        public final String a(byte[] bArr, int i12, int i13) throws InvalidProtocolBufferException {
            if ((i12 | i13 | ((bArr.length - i12) - i13)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i12), Integer.valueOf(i13)));
            }
            int i14 = i12 + i13;
            char[] cArr = new char[i13];
            int i15 = 0;
            while (i12 < i14) {
                byte b12 = bArr[i12];
                if (!a.b(b12)) {
                    break;
                }
                i12++;
                cArr[i15] = (char) b12;
                i15++;
            }
            int i16 = i15;
            while (i12 < i14) {
                int i17 = i12 + 1;
                byte b13 = bArr[i12];
                if (a.b(b13)) {
                    int i18 = i16 + 1;
                    cArr[i16] = (char) b13;
                    while (i17 < i14) {
                        byte b14 = bArr[i17];
                        if (!a.b(b14)) {
                            break;
                        }
                        i17++;
                        cArr[i18] = (char) b14;
                        i18++;
                    }
                    i16 = i18;
                    i12 = i17;
                } else if (b13 < -32) {
                    if (i17 >= i14) {
                        throw InvalidProtocolBufferException.c();
                    }
                    i12 += 2;
                    a.c(b13, bArr[i17], cArr, i16);
                    i16++;
                } else if (b13 < -16) {
                    if (i17 >= i14 - 1) {
                        throw InvalidProtocolBufferException.c();
                    }
                    int i19 = i12 + 2;
                    i12 += 3;
                    a.d(b13, bArr[i17], bArr[i19], cArr, i16);
                    i16++;
                } else {
                    if (i17 >= i14 - 2) {
                        throw InvalidProtocolBufferException.c();
                    }
                    byte b15 = bArr[i17];
                    int i22 = i12 + 3;
                    byte b16 = bArr[i12 + 2];
                    i12 += 4;
                    a.a(b13, b15, b16, bArr[i22], cArr, i16);
                    i16 += 2;
                }
            }
            return new String(cArr, 0, i16);
        }

        @Override // androidx.datastore.preferences.protobuf.L1.b
        public final String c(ByteBuffer byteBuffer, int i12, int i13) {
            return b.b(byteBuffer, i12, i13);
        }

        @Override // androidx.datastore.preferences.protobuf.L1.b
        public final int d(int i12, int i13, String str, byte[] bArr) {
            int i14;
            int i15;
            char cCharAt;
            int length = str.length();
            int i16 = i13 + i12;
            int i17 = 0;
            while (i17 < length && (i15 = i17 + i12) < i16 && (cCharAt = str.charAt(i17)) < 128) {
                bArr[i15] = (byte) cCharAt;
                i17++;
            }
            if (i17 == length) {
                return i12 + length;
            }
            int i18 = i12 + i17;
            while (i17 < length) {
                char cCharAt2 = str.charAt(i17);
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
                            if (55296 <= cCharAt2 && cCharAt2 <= 57343 && ((i14 = i17 + 1) == str.length() || !Character.isSurrogatePair(cCharAt2, str.charAt(i14)))) {
                                throw new d(i17, length);
                            }
                            throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt2 + " at index " + i18);
                        }
                        int i22 = i17 + 1;
                        if (i22 != str.length()) {
                            char cCharAt3 = str.charAt(i22);
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
                        throw new d(i17 - 1, length);
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

        /* JADX WARN: Code restructure failed: missing block: B:10:0x001c, code lost:
        
            if (r13[r14] > (-65)) goto L13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x0047, code lost:
        
            if (r13[r14] > (-65)) goto L29;
         */
        /* JADX WARN: Code restructure failed: missing block: B:49:0x0082, code lost:
        
            if (r13[r14] > (-65)) goto L50;
         */
        @Override // androidx.datastore.preferences.protobuf.L1.b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final int g(int r12, byte[] r13, int r14, int r15) {
            /*
                Method dump skipped, instructions count: 244
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.L1.c.g(int, byte[], int, int):int");
        }

        @Override // androidx.datastore.preferences.protobuf.L1.b
        public final int i(int i12, ByteBuffer byteBuffer, int i13, int i14) {
            return b.h(i12, byteBuffer, i13, i14);
        }
    }

    /* compiled from: Utf8.java */
    public static class d extends IllegalArgumentException {
        public d(int i12, int i13) {
            super(androidx.compose.foundation.H.j(i12, i13, "Unpaired surrogate at index ", " of "));
        }
    }

    /* compiled from: Utf8.java */
    public static final class e extends b {
        public static int j(long j12, int i12, int i13) {
            if (i13 == 0) {
                b bVar = L1.f45728a;
                if (i12 > -12) {
                    return -1;
                }
                return i12;
            }
            if (i13 == 1) {
                return L1.e(i12, K1.f45720d.f(j12));
            }
            if (i13 != 2) {
                throw new AssertionError();
            }
            K1.e eVar = K1.f45720d;
            return L1.f(i12, eVar.f(j12), eVar.f(j12 + 1));
        }

        public static int k(byte[] bArr, int i12, long j12, int i13) {
            if (i13 == 0) {
                b bVar = L1.f45728a;
                if (i12 > -12) {
                    return -1;
                }
                return i12;
            }
            if (i13 == 1) {
                return L1.e(i12, K1.g(bArr, j12));
            }
            if (i13 == 2) {
                return L1.f(i12, K1.g(bArr, j12), K1.g(bArr, j12 + 1));
            }
            throw new AssertionError();
        }

        @Override // androidx.datastore.preferences.protobuf.L1.b
        public final String a(byte[] bArr, int i12, int i13) throws InvalidProtocolBufferException {
            if ((i12 | i13 | ((bArr.length - i12) - i13)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i12), Integer.valueOf(i13)));
            }
            int i14 = i12 + i13;
            char[] cArr = new char[i13];
            int i15 = 0;
            while (i12 < i14) {
                byte bG2 = K1.g(bArr, i12);
                if (!a.b(bG2)) {
                    break;
                }
                i12++;
                cArr[i15] = (char) bG2;
                i15++;
            }
            int i16 = i15;
            while (i12 < i14) {
                int i17 = i12 + 1;
                byte bG3 = K1.g(bArr, i12);
                if (a.b(bG3)) {
                    int i18 = i16 + 1;
                    cArr[i16] = (char) bG3;
                    while (i17 < i14) {
                        byte bG4 = K1.g(bArr, i17);
                        if (!a.b(bG4)) {
                            break;
                        }
                        i17++;
                        cArr[i18] = (char) bG4;
                        i18++;
                    }
                    i16 = i18;
                    i12 = i17;
                } else if (bG3 < -32) {
                    if (i17 >= i14) {
                        throw InvalidProtocolBufferException.c();
                    }
                    i12 += 2;
                    a.c(bG3, K1.g(bArr, i17), cArr, i16);
                    i16++;
                } else if (bG3 < -16) {
                    if (i17 >= i14 - 1) {
                        throw InvalidProtocolBufferException.c();
                    }
                    int i19 = i12 + 2;
                    i12 += 3;
                    a.d(bG3, K1.g(bArr, i17), K1.g(bArr, i19), cArr, i16);
                    i16++;
                } else {
                    if (i17 >= i14 - 2) {
                        throw InvalidProtocolBufferException.c();
                    }
                    byte bG5 = K1.g(bArr, i17);
                    int i22 = i12 + 3;
                    byte bG6 = K1.g(bArr, i12 + 2);
                    i12 += 4;
                    a.a(bG3, bG5, bG6, K1.g(bArr, i22), cArr, i16);
                    i16 += 2;
                }
            }
            return new String(cArr, 0, i16);
        }

        @Override // androidx.datastore.preferences.protobuf.L1.b
        public final String c(ByteBuffer byteBuffer, int i12, int i13) throws InvalidProtocolBufferException {
            long j12;
            if ((i12 | i13 | ((byteBuffer.limit() - i12) - i13)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i12), Integer.valueOf(i13)));
            }
            long jA2 = K1.a(byteBuffer) + i12;
            long j13 = i13 + jA2;
            char[] cArr = new char[i13];
            int i14 = 0;
            while (true) {
                j12 = 1;
                if (jA2 >= j13) {
                    break;
                }
                byte bF2 = K1.f45720d.f(jA2);
                if (!a.b(bF2)) {
                    break;
                }
                jA2++;
                cArr[i14] = (char) bF2;
                i14++;
            }
            int i15 = i14;
            while (jA2 < j13) {
                long j14 = jA2 + j12;
                K1.e eVar = K1.f45720d;
                byte bF3 = eVar.f(jA2);
                if (a.b(bF3)) {
                    int i16 = i15 + 1;
                    cArr[i15] = (char) bF3;
                    while (j14 < j13) {
                        byte bF4 = K1.f45720d.f(j14);
                        if (!a.b(bF4)) {
                            break;
                        }
                        j14 += j12;
                        cArr[i16] = (char) bF4;
                        i16++;
                    }
                    i15 = i16;
                    jA2 = j14;
                } else {
                    if (!(bF3 < -32)) {
                        if (bF3 < -16) {
                            if (j14 >= j13 - j12) {
                                throw InvalidProtocolBufferException.c();
                            }
                            long j15 = jA2 + 2;
                            jA2 += 3;
                            a.d(bF3, eVar.f(j14), eVar.f(j15), cArr, i15);
                            i15++;
                        } else {
                            if (j14 >= j13 - 2) {
                                throw InvalidProtocolBufferException.c();
                            }
                            byte bF5 = eVar.f(j14);
                            long j16 = jA2 + 3;
                            byte bF6 = eVar.f(jA2 + 2);
                            jA2 += 4;
                            a.a(bF3, bF5, bF6, eVar.f(j16), cArr, i15);
                            i15 += 2;
                        }
                    } else {
                        if (j14 >= j13) {
                            throw InvalidProtocolBufferException.c();
                        }
                        jA2 += 2;
                        a.c(bF3, eVar.f(j14), cArr, i15);
                        i15++;
                    }
                }
                j12 = 1;
            }
            return new String(cArr, 0, i15);
        }

        @Override // androidx.datastore.preferences.protobuf.L1.b
        public final int d(int i12, int i13, String str, byte[] bArr) {
            long j12;
            char c12;
            String str2;
            char c13;
            long j13;
            int i14;
            char cCharAt;
            String str3 = str;
            long j14 = i12;
            long j15 = i13 + j14;
            int length = str.length();
            if (length > i13 || bArr.length - i13 < i12) {
                throw new ArrayIndexOutOfBoundsException("Failed writing " + str3.charAt(length - 1) + " at index " + (i12 + i13));
            }
            int i15 = 0;
            while (true) {
                j12 = 1;
                c12 = 128;
                if (i15 >= length || (cCharAt = str3.charAt(i15)) >= 128) {
                    break;
                }
                K1.p(bArr, j14, (byte) cCharAt);
                i15++;
                j14 = 1 + j14;
            }
            if (i15 == length) {
                return (int) j14;
            }
            while (i15 < length) {
                char cCharAt2 = str3.charAt(i15);
                if (cCharAt2 < c12 && j14 < j15) {
                    K1.p(bArr, j14, (byte) cCharAt2);
                    j13 = j12;
                    j14 += j12;
                    c13 = c12;
                    str2 = str3;
                } else if (cCharAt2 < 2048 && j14 <= j15 - 2) {
                    long j16 = j14 + j12;
                    K1.p(bArr, j14, (byte) ((cCharAt2 >>> 6) | 960));
                    j14 += 2;
                    K1.p(bArr, j16, (byte) ((cCharAt2 & '?') | 128));
                    str2 = str;
                    j13 = j12;
                    c13 = 128;
                } else {
                    if ((cCharAt2 >= 55296 && 57343 >= cCharAt2) || j14 > j15 - 3) {
                        if (j14 > j15 - 4) {
                            if (55296 <= cCharAt2 && cCharAt2 <= 57343 && ((i14 = i15 + 1) == length || !Character.isSurrogatePair(cCharAt2, str.charAt(i14)))) {
                                throw new d(i15, length);
                            }
                            throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt2 + " at index " + j14);
                        }
                        int i16 = i15 + 1;
                        if (i16 != length) {
                            str2 = str;
                            char cCharAt3 = str2.charAt(i16);
                            if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                                j13 = 1;
                                K1.p(bArr, j14, (byte) ((codePoint >>> 18) | 240));
                                c13 = 128;
                                K1.p(bArr, j14 + 1, (byte) (((codePoint >>> 12) & 63) | 128));
                                long j17 = j14 + 3;
                                K1.p(bArr, j14 + 2, (byte) (((codePoint >>> 6) & 63) | 128));
                                j14 += 4;
                                K1.p(bArr, j17, (byte) ((codePoint & 63) | 128));
                                i15 = i16;
                            } else {
                                i15 = i16;
                            }
                        }
                        throw new d(i15 - 1, length);
                    }
                    K1.p(bArr, j14, (byte) ((cCharAt2 >>> '\f') | 480));
                    long j18 = j14 + 2;
                    K1.p(bArr, j14 + j12, (byte) (((cCharAt2 >>> 6) & 63) | 128));
                    j14 += 3;
                    K1.p(bArr, j18, (byte) ((cCharAt2 & '?') | 128));
                    str2 = str;
                    c13 = 128;
                    j13 = 1;
                }
                i15++;
                str3 = str2;
                c12 = c13;
                j12 = j13;
            }
            return (int) j14;
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0034, code lost:
        
            if (androidx.datastore.preferences.protobuf.K1.g(r23, r4) > (-65)) goto L16;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x0065, code lost:
        
            if (androidx.datastore.preferences.protobuf.K1.g(r23, r4) > (-65)) goto L32;
         */
        @Override // androidx.datastore.preferences.protobuf.L1.b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final int g(int r22, byte[] r23, int r24, int r25) {
            /*
                Method dump skipped, instructions count: 382
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.L1.e.g(int, byte[], int, int):int");
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0040, code lost:
        
            if (androidx.datastore.preferences.protobuf.K1.f45720d.f(r2) > (-65)) goto L16;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x0074, code lost:
        
            if (androidx.datastore.preferences.protobuf.K1.f45720d.f(r2) > (-65)) goto L32;
         */
        @Override // androidx.datastore.preferences.protobuf.L1.b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final int i(int r22, java.nio.ByteBuffer r23, int r24, int r25) {
            /*
                Method dump skipped, instructions count: 444
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.L1.e.i(int, java.nio.ByteBuffer, int, int):int");
        }
    }

    static {
        f45728a = (K1.f45722f && K1.f45721e && !C22895g.a()) ? new e() : new c();
    }

    public static int a(byte[] bArr, int i12, int i13) {
        byte b12 = bArr[i12 - 1];
        int i14 = i13 - i12;
        if (i14 == 0) {
            if (b12 > -12) {
                b12 = -1;
            }
            return b12;
        }
        if (i14 == 1) {
            return e(b12, bArr[i12]);
        }
        if (i14 == 2) {
            return f(b12, bArr[i12], bArr[i12 + 1]);
        }
        throw new AssertionError();
    }

    public static int b(ByteBuffer byteBuffer, int i12, int i13, int i14) {
        if (i14 == 0) {
            if (i12 > -12) {
                i12 = -1;
            }
            return i12;
        }
        if (i14 == 1) {
            return e(i12, byteBuffer.get(i13));
        }
        if (i14 == 2) {
            return f(i12, byteBuffer.get(i13), byteBuffer.get(i13 + 1));
        }
        throw new AssertionError();
    }

    public static String c(ByteBuffer byteBuffer, int i12, int i13) {
        b bVar = f45728a;
        bVar.getClass();
        if (byteBuffer.hasArray()) {
            return bVar.a(byteBuffer.array(), byteBuffer.arrayOffset() + i12, i13);
        }
        return byteBuffer.isDirect() ? bVar.c(byteBuffer, i12, i13) : b.b(byteBuffer, i12, i13);
    }

    public static int d(String str) {
        int length = str.length();
        int i12 = 0;
        int i13 = 0;
        while (i13 < length && str.charAt(i13) < 128) {
            i13++;
        }
        int i14 = length;
        while (true) {
            if (i13 >= length) {
                break;
            }
            char cCharAt = str.charAt(i13);
            if (cCharAt < 2048) {
                i14 += (127 - cCharAt) >>> 31;
                i13++;
            } else {
                int length2 = str.length();
                while (i13 < length2) {
                    char cCharAt2 = str.charAt(i13);
                    if (cCharAt2 < 2048) {
                        i12 += (127 - cCharAt2) >>> 31;
                    } else {
                        i12 += 2;
                        if (55296 <= cCharAt2 && cCharAt2 <= 57343) {
                            if (Character.codePointAt(str, i13) < 65536) {
                                throw new d(i13, length2);
                            }
                            i13++;
                        }
                    }
                    i13++;
                }
                i14 += i12;
            }
        }
        if (i14 >= length) {
            return i14;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (i14 + 4294967296L));
    }

    public static int e(int i12, int i13) {
        if (i12 > -12 || i13 > -65) {
            return -1;
        }
        return i12 ^ (i13 << 8);
    }

    public static int f(int i12, int i13, int i14) {
        if (i12 > -12 || i13 > -65 || i14 > -65) {
            return -1;
        }
        return (i12 ^ (i13 << 8)) ^ (i14 << 16);
    }
}
