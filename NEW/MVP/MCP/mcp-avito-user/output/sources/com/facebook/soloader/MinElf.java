package com.facebook.soloader;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import okhttp3.internal.ws.WebSocketProtocol;

/* loaded from: classes16.dex */
public final class MinElf {

    public enum ISA {
        /* JADX INFO: Fake field, exist only in values array */
        NOT_SO("not_so"),
        /* JADX INFO: Fake field, exist only in values array */
        X86("x86"),
        /* JADX INFO: Fake field, exist only in values array */
        ARM("armeabi-v7a"),
        /* JADX INFO: Fake field, exist only in values array */
        X86_64("x86_64"),
        /* JADX INFO: Fake field, exist only in values array */
        AARCH64("arm64-v8a"),
        /* JADX INFO: Fake field, exist only in values array */
        OTHERS("others");


        /* renamed from: b, reason: collision with root package name */
        public final String f340845b;

        ISA(String str) {
            this.f340845b = str;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return this.f340845b;
        }
    }

    public static class a extends RuntimeException {
    }

    public static String[] a(n nVar) {
        long jB2;
        long jB3;
        long jB4;
        long jB5;
        long j12;
        long jB6;
        int i12;
        long j13;
        long j14;
        long jB7;
        long j15;
        char c12;
        long jB8;
        long j16;
        long jB9;
        int i13;
        long jB10;
        long jB11;
        long jB12;
        int i14 = 8;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
        long jB13 = b(nVar, byteBufferAllocate, 0L);
        if (jB13 != 1179403647) {
            throw new a("file is not ELF: 0x" + Long.toHexString(jB13));
        }
        c(nVar, byteBufferAllocate, 1, 4L);
        boolean z12 = ((short) (byteBufferAllocate.get() & 255)) == 1;
        c(nVar, byteBufferAllocate, 1, 5L);
        if (((short) (byteBufferAllocate.get() & 255)) == 2) {
            byteBufferAllocate.order(ByteOrder.BIG_ENDIAN);
        }
        if (z12) {
            jB2 = b(nVar, byteBufferAllocate, 28L);
        } else {
            c(nVar, byteBufferAllocate, 8, 32L);
            jB2 = byteBufferAllocate.getLong();
        }
        if (z12) {
            c(nVar, byteBufferAllocate, 2, 44L);
            jB3 = byteBufferAllocate.getShort() & 65535;
        } else {
            c(nVar, byteBufferAllocate, 2, 56L);
            jB3 = byteBufferAllocate.getShort() & 65535;
        }
        c(nVar, byteBufferAllocate, 2, z12 ? 42L : 54L);
        int i15 = byteBufferAllocate.getShort() & 65535;
        if (jB3 == WebSocketProtocol.PAYLOAD_SHORT_MAX) {
            if (z12) {
                jB12 = b(nVar, byteBufferAllocate, 32L);
            } else {
                c(nVar, byteBufferAllocate, 8, 40L);
                jB12 = byteBufferAllocate.getLong();
            }
            jB3 = z12 ? b(nVar, byteBufferAllocate, jB12 + 28) : b(nVar, byteBufferAllocate, jB12 + 44);
        }
        long j17 = jB2;
        long j18 = 0;
        while (true) {
            if (j18 >= jB3) {
                jB4 = 0;
                break;
            }
            if ((z12 ? b(nVar, byteBufferAllocate, j17) : b(nVar, byteBufferAllocate, j17)) != 2) {
                j17 += i15;
                j18++;
            } else if (z12) {
                jB4 = b(nVar, byteBufferAllocate, j17 + 4);
            } else {
                c(nVar, byteBufferAllocate, 8, j17 + 8);
                jB4 = byteBufferAllocate.getLong();
            }
        }
        if (jB4 == 0) {
            throw new a("ELF file does not contain dynamic linking information");
        }
        long j19 = jB4;
        int i16 = 0;
        long j22 = 0;
        while (true) {
            if (z12) {
                jB5 = b(nVar, byteBufferAllocate, j19);
            } else {
                c(nVar, byteBufferAllocate, i14, j19);
                jB5 = byteBufferAllocate.getLong();
            }
            char c13 = 65535;
            if (jB5 != 1) {
                j12 = jB4;
                if (jB5 == 5) {
                    if (z12) {
                        jB6 = b(nVar, byteBufferAllocate, j19 + 4);
                    } else {
                        c(nVar, byteBufferAllocate, 8, j19 + 8);
                        jB6 = byteBufferAllocate.getLong();
                    }
                    j22 = jB6;
                }
            } else {
                if (i16 == Integer.MAX_VALUE) {
                    throw new a("malformed DT_NEEDED section");
                }
                i16++;
                j12 = jB4;
            }
            j19 += z12 ? 8L : 16L;
            if (jB5 != 0) {
                jB3 = jB3;
                jB4 = j12;
                i14 = 8;
            } else {
                if (j22 == 0) {
                    throw new a("Dynamic section string-table not found");
                }
                long j23 = jB2;
                int i17 = 0;
                while (true) {
                    if (i17 >= jB3) {
                        i12 = i16;
                        j13 = 0;
                        j14 = 0;
                        break;
                    }
                    if ((z12 ? b(nVar, byteBufferAllocate, j23) : b(nVar, byteBufferAllocate, j23)) == 1) {
                        if (z12) {
                            j16 = jB3;
                            jB9 = b(nVar, byteBufferAllocate, j23 + 8);
                        } else {
                            j16 = jB3;
                            c(nVar, byteBufferAllocate, 8, j23 + 16);
                            jB9 = byteBufferAllocate.getLong();
                        }
                        if (z12) {
                            jB10 = b(nVar, byteBufferAllocate, j23 + 20);
                            i13 = i15;
                            i12 = i16;
                        } else {
                            i13 = i15;
                            i12 = i16;
                            c(nVar, byteBufferAllocate, 8, j23 + 40);
                            jB10 = byteBufferAllocate.getLong();
                        }
                        if (jB9 > j22 || j22 >= jB10 + jB9) {
                            i15 = i13;
                        } else {
                            if (z12) {
                                jB11 = b(nVar, byteBufferAllocate, j23 + 4);
                            } else {
                                c(nVar, byteBufferAllocate, 8, j23 + 8);
                                jB11 = byteBufferAllocate.getLong();
                            }
                            j14 = jB11 + (j22 - jB9);
                            j13 = 0;
                        }
                    } else {
                        i12 = i16;
                        j16 = jB3;
                    }
                    j23 += i15;
                    i17++;
                    i16 = i12;
                    jB3 = j16;
                }
                if (j14 == j13) {
                    throw new a("did not find file offset of DT_STRTAB table");
                }
                int i18 = i12;
                String[] strArr = new String[i18];
                long j24 = j12;
                int i19 = 0;
                while (true) {
                    if (z12) {
                        jB7 = b(nVar, byteBufferAllocate, j24);
                    } else {
                        c(nVar, byteBufferAllocate, 8, j24);
                        jB7 = byteBufferAllocate.getLong();
                    }
                    if (jB7 == 1) {
                        if (z12) {
                            jB8 = b(nVar, byteBufferAllocate, j24 + 4);
                        } else {
                            c(nVar, byteBufferAllocate, 8, j24 + 8);
                            jB8 = byteBufferAllocate.getLong();
                        }
                        long j25 = jB8 + j14;
                        StringBuilder sb2 = new StringBuilder();
                        while (true) {
                            long j26 = j25 + 1;
                            j15 = j14;
                            c(nVar, byteBufferAllocate, 1, j25);
                            short s5 = (short) (byteBufferAllocate.get() & 255);
                            if (s5 == 0) {
                                break;
                            }
                            sb2.append((char) s5);
                            j25 = j26;
                            j14 = j15;
                        }
                        strArr[i19] = sb2.toString();
                        c12 = 65535;
                        if (i19 == Integer.MAX_VALUE) {
                            throw new a("malformed DT_NEEDED section");
                        }
                        i19++;
                    } else {
                        j15 = j14;
                        c12 = c13;
                    }
                    j24 += z12 ? 8L : 16L;
                    if (jB7 == 0) {
                        if (i19 == i18) {
                            return strArr;
                        }
                        throw new a("malformed DT_NEEDED section");
                    }
                    c13 = c12;
                    j14 = j15;
                }
            }
        }
    }

    public static long b(n nVar, ByteBuffer byteBuffer, long j12) {
        c(nVar, byteBuffer, 4, j12);
        return byteBuffer.getInt() & 4294967295L;
    }

    public static void c(n nVar, ByteBuffer byteBuffer, int i12, long j12) {
        int i13;
        byteBuffer.position(0);
        byteBuffer.limit(i12);
        while (byteBuffer.remaining() > 0 && (i13 = nVar.read(byteBuffer, j12)) != -1) {
            j12 += i13;
        }
        if (byteBuffer.remaining() > 0) {
            throw new a("ELF file truncated");
        }
        byteBuffer.position(0);
    }
}
