package com.fasterxml.jackson.core.io;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import okhttp3.internal.http2.Http2Connection;

/* compiled from: NumberOutput.java */
/* loaded from: classes3.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public static final String f341181a = String.valueOf(BeduinInputModel.MIN_TEXT_VERSION);

    /* renamed from: b, reason: collision with root package name */
    public static final String f341182b = String.valueOf(Long.MIN_VALUE);

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f341183c = new int[1000];

    static {
        int i12 = 0;
        for (int i13 = 0; i13 < 10; i13++) {
            for (int i14 = 0; i14 < 10; i14++) {
                int i15 = 0;
                while (i15 < 10) {
                    f341183c[i12] = ((i13 + 48) << 16) | ((i14 + 48) << 8) | (i15 + 48);
                    i15++;
                    i12++;
                }
            }
        }
    }

    public static int a(int i12, int i13, byte[] bArr) {
        int i14 = f341183c[i12];
        bArr[i13] = (byte) (i14 >> 16);
        int i15 = i13 + 2;
        bArr[i13 + 1] = (byte) (i14 >> 8);
        int i16 = i13 + 3;
        bArr[i15] = (byte) i14;
        return i16;
    }

    public static int b(char[] cArr, int i12, int i13) {
        int i14 = f341183c[i12];
        cArr[i13] = (char) (i14 >> 16);
        int i15 = i13 + 2;
        cArr[i13 + 1] = (char) ((i14 >> 8) & 127);
        int i16 = i13 + 3;
        cArr[i15] = (char) (i14 & 127);
        return i16;
    }

    public static int c(int i12, int i13, byte[] bArr) {
        int i14 = f341183c[i12];
        if (i12 > 9) {
            if (i12 > 99) {
                bArr[i13] = (byte) (i14 >> 16);
                i13++;
            }
            bArr[i13] = (byte) (i14 >> 8);
            i13++;
        }
        int i15 = i13 + 1;
        bArr[i13] = (byte) i14;
        return i15;
    }

    public static int d(char[] cArr, int i12, int i13) {
        int i14 = f341183c[i12];
        if (i12 > 9) {
            if (i12 > 99) {
                cArr[i13] = (char) (i14 >> 16);
                i13++;
            }
            cArr[i13] = (char) ((i14 >> 8) & 127);
            i13++;
        }
        int i15 = i13 + 1;
        cArr[i13] = (char) (i14 & 127);
        return i15;
    }

    public static int e(int i12, int i13, byte[] bArr) {
        int i14 = i12 / 1000;
        int i15 = i12 - (i14 * 1000);
        int i16 = i14 / 1000;
        int i17 = i14 - (i16 * 1000);
        int[] iArr = f341183c;
        int i18 = iArr[i16];
        bArr[i13] = (byte) (i18 >> 16);
        bArr[i13 + 1] = (byte) (i18 >> 8);
        bArr[i13 + 2] = (byte) i18;
        int i19 = iArr[i17];
        bArr[i13 + 3] = (byte) (i19 >> 16);
        bArr[i13 + 4] = (byte) (i19 >> 8);
        bArr[i13 + 5] = (byte) i19;
        int i22 = iArr[i15];
        bArr[i13 + 6] = (byte) (i22 >> 16);
        int i23 = i13 + 8;
        bArr[i13 + 7] = (byte) (i22 >> 8);
        int i24 = i13 + 9;
        bArr[i23] = (byte) i22;
        return i24;
    }

    public static int f(char[] cArr, int i12, int i13) {
        int i14 = i12 / 1000;
        int i15 = i12 - (i14 * 1000);
        int i16 = i14 / 1000;
        int[] iArr = f341183c;
        int i17 = iArr[i16];
        cArr[i13] = (char) (i17 >> 16);
        cArr[i13 + 1] = (char) ((i17 >> 8) & 127);
        cArr[i13 + 2] = (char) (i17 & 127);
        int i18 = iArr[i14 - (i16 * 1000)];
        cArr[i13 + 3] = (char) (i18 >> 16);
        cArr[i13 + 4] = (char) ((i18 >> 8) & 127);
        cArr[i13 + 5] = (char) (i18 & 127);
        int i19 = iArr[i15];
        cArr[i13 + 6] = (char) (i19 >> 16);
        int i22 = i13 + 8;
        cArr[i13 + 7] = (char) ((i19 >> 8) & 127);
        int i23 = i13 + 9;
        cArr[i22] = (char) (i19 & 127);
        return i23;
    }

    public static int g(int i12, int i13, byte[] bArr) {
        int i14;
        if (i12 < 0) {
            if (i12 == Integer.MIN_VALUE) {
                String str = f341181a;
                int length = str.length();
                int i15 = 0;
                while (i15 < length) {
                    bArr[i13] = (byte) str.charAt(i15);
                    i15++;
                    i13++;
                }
                return i13;
            }
            bArr[i13] = 45;
            i12 = -i12;
            i13++;
        }
        if (i12 < 1000000) {
            if (i12 >= 1000) {
                int i16 = i12 / 1000;
                return a(i12 - (i16 * 1000), c(i16, i13, bArr), bArr);
            }
            if (i12 >= 10) {
                return c(i12, i13, bArr);
            }
            int i17 = i13 + 1;
            bArr[i13] = (byte) (i12 + 48);
            return i17;
        }
        if (i12 < 1000000000) {
            int i18 = i12 / 1000;
            int i19 = i18 / 1000;
            return a(i12 - (i18 * 1000), a(i18 - (i19 * 1000), c(i19, i13, bArr), bArr), bArr);
        }
        int i22 = i12 - Http2Connection.DEGRADED_PONG_TIMEOUT_NS;
        if (i22 >= 1000000000) {
            i22 = i12 - 2000000000;
            i14 = i13 + 1;
            bArr[i13] = 50;
        } else {
            i14 = i13 + 1;
            bArr[i13] = 49;
        }
        return e(i22, i14, bArr);
    }

    public static int h(char[] cArr, int i12, int i13) {
        int i14;
        if (i12 < 0) {
            if (i12 == Integer.MIN_VALUE) {
                String str = f341181a;
                int length = str.length();
                str.getChars(0, length, cArr, i13);
                return length + i13;
            }
            cArr[i13] = '-';
            i12 = -i12;
            i13++;
        }
        if (i12 < 1000000) {
            if (i12 >= 1000) {
                int i15 = i12 / 1000;
                return b(cArr, i12 - (i15 * 1000), d(cArr, i15, i13));
            }
            if (i12 >= 10) {
                return d(cArr, i12, i13);
            }
            cArr[i13] = (char) (i12 + 48);
            return i13 + 1;
        }
        if (i12 < 1000000000) {
            int i16 = i12 / 1000;
            int i17 = i16 / 1000;
            return b(cArr, i12 - (i16 * 1000), b(cArr, i16 - (i17 * 1000), d(cArr, i17, i13)));
        }
        int i18 = i12 - Http2Connection.DEGRADED_PONG_TIMEOUT_NS;
        if (i18 >= 1000000000) {
            i18 = i12 - 2000000000;
            i14 = i13 + 1;
            cArr[i13] = '2';
        } else {
            i14 = i13 + 1;
            cArr[i13] = '1';
        }
        return f(cArr, i18, i14);
    }

    public static int i(int i12, long j12, char[] cArr) {
        int iF2;
        if (j12 < 0) {
            if (j12 > -2147483648L) {
                return h(cArr, (int) j12, i12);
            }
            if (j12 == Long.MIN_VALUE) {
                String str = f341182b;
                int length = str.length();
                str.getChars(0, length, cArr, i12);
                return length + i12;
            }
            cArr[i12] = '-';
            j12 = -j12;
            i12++;
        } else if (j12 <= 2147483647L) {
            return h(cArr, (int) j12, i12);
        }
        long j13 = j12 / 1000000000;
        long j14 = j12 - (j13 * 1000000000);
        if (j13 < 1000000000) {
            int i13 = (int) j13;
            int[] iArr = f341183c;
            if (i13 >= 1000000) {
                int i14 = i13 / 1000;
                int i15 = i13 - (i14 * 1000);
                int i16 = i14 / 1000;
                int iD2 = d(cArr, i16, i12);
                int i17 = iArr[i14 - (i16 * 1000)];
                cArr[iD2] = (char) (i17 >> 16);
                cArr[iD2 + 1] = (char) ((i17 >> 8) & 127);
                cArr[iD2 + 2] = (char) (i17 & 127);
                int i18 = iArr[i15];
                cArr[iD2 + 3] = (char) (i18 >> 16);
                int i19 = iD2 + 5;
                cArr[iD2 + 4] = (char) ((i18 >> 8) & 127);
                iF2 = iD2 + 6;
                cArr[i19] = (char) (i18 & 127);
            } else if (i13 < 1000) {
                iF2 = d(cArr, i13, i12);
            } else {
                int i22 = i13 / 1000;
                int i23 = i13 - (i22 * 1000);
                int i24 = iArr[i22];
                if (i22 > 9) {
                    if (i22 > 99) {
                        cArr[i12] = (char) (i24 >> 16);
                        i12++;
                    }
                    cArr[i12] = (char) ((i24 >> 8) & 127);
                    i12++;
                }
                cArr[i12] = (char) (i24 & 127);
                int i25 = iArr[i23];
                cArr[i12 + 1] = (char) (i25 >> 16);
                int i26 = i12 + 3;
                cArr[i12 + 2] = (char) ((i25 >> 8) & 127);
                iF2 = i12 + 4;
                cArr[i26] = (char) (i25 & 127);
            }
        } else {
            long j15 = j13 / 1000000000;
            int iD3 = d(cArr, (int) j15, i12);
            iF2 = f(cArr, (int) (j13 - (1000000000 * j15)), iD3);
        }
        return f(cArr, (int) j14, iF2);
    }

    public static int j(int i12, byte[] bArr, long j12) {
        int iE2;
        if (j12 < 0) {
            if (j12 > -2147483648L) {
                return g((int) j12, i12, bArr);
            }
            if (j12 == Long.MIN_VALUE) {
                String str = f341182b;
                int length = str.length();
                int i13 = 0;
                while (i13 < length) {
                    bArr[i12] = (byte) str.charAt(i13);
                    i13++;
                    i12++;
                }
                return i12;
            }
            bArr[i12] = 45;
            j12 = -j12;
            i12++;
        } else if (j12 <= 2147483647L) {
            return g((int) j12, i12, bArr);
        }
        long j13 = j12 / 1000000000;
        long j14 = j12 - (j13 * 1000000000);
        if (j13 < 1000000000) {
            int i14 = (int) j13;
            int[] iArr = f341183c;
            if (i14 >= 1000000) {
                int i15 = i14 / 1000;
                int i16 = i14 - (i15 * 1000);
                int i17 = i15 / 1000;
                int iC2 = c(i17, i12, bArr);
                int i18 = iArr[i15 - (i17 * 1000)];
                bArr[iC2] = (byte) (i18 >> 16);
                bArr[iC2 + 1] = (byte) (i18 >> 8);
                bArr[iC2 + 2] = (byte) i18;
                int i19 = iArr[i16];
                bArr[iC2 + 3] = (byte) (i19 >> 16);
                int i22 = iC2 + 5;
                bArr[iC2 + 4] = (byte) (i19 >> 8);
                iE2 = iC2 + 6;
                bArr[i22] = (byte) i19;
            } else if (i14 < 1000) {
                iE2 = c(i14, i12, bArr);
            } else {
                int i23 = i14 / 1000;
                int i24 = i14 - (i23 * 1000);
                int i25 = iArr[i23];
                if (i23 > 9) {
                    if (i23 > 99) {
                        bArr[i12] = (byte) (i25 >> 16);
                        i12++;
                    }
                    bArr[i12] = (byte) (i25 >> 8);
                    i12++;
                }
                bArr[i12] = (byte) i25;
                int i26 = iArr[i24];
                bArr[i12 + 1] = (byte) (i26 >> 16);
                int i27 = i12 + 3;
                bArr[i12 + 2] = (byte) (i26 >> 8);
                iE2 = i12 + 4;
                bArr[i27] = (byte) i26;
            }
        } else {
            long j15 = j13 / 1000000000;
            int iC3 = c((int) j15, i12, bArr);
            iE2 = e((int) (j13 - (1000000000 * j15)), iC3, bArr);
        }
        return e((int) j14, iE2, bArr);
    }
}
