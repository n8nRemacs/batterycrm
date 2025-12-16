package net.bytebuddy.jar.asm;

/* compiled from: TypePath.java */
/* loaded from: classes7.dex */
public final class C {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f418148a;

    /* renamed from: b, reason: collision with root package name */
    public final int f418149b;

    public C(byte[] bArr, int i12) {
        this.f418148a = bArr;
        this.f418149b = i12;
    }

    public static C a(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        int length = str.length();
        C44391d c44391d = new C44391d(length);
        c44391d.g(0);
        int i12 = 0;
        while (i12 < length) {
            int i13 = i12 + 1;
            char cCharAt = str.charAt(i12);
            if (cCharAt == '[') {
                c44391d.c(0, 0);
            } else if (cCharAt == '.') {
                c44391d.c(1, 0);
            } else if (cCharAt == '*') {
                c44391d.c(2, 0);
            } else {
                if (cCharAt < '0' || cCharAt > '9') {
                    throw new IllegalArgumentException();
                }
                int i14 = cCharAt - '0';
                while (i13 < length) {
                    int i15 = i13 + 1;
                    char cCharAt2 = str.charAt(i13);
                    if (cCharAt2 >= '0' && cCharAt2 <= '9') {
                        i14 = ((i14 * 10) + cCharAt2) - 48;
                        i13 = i15;
                    } else {
                        if (cCharAt2 != ';') {
                            throw new IllegalArgumentException();
                        }
                        i13 = i15;
                        c44391d.c(3, i14);
                    }
                }
                c44391d.c(3, i14);
            }
            i12 = i13;
        }
        byte[] bArr = c44391d.f418165a;
        bArr[0] = (byte) (c44391d.f418166b / 2);
        return new C(bArr, 0);
    }

    public final String toString() {
        byte[] bArr = this.f418148a;
        int i12 = this.f418149b;
        byte b12 = bArr[i12];
        StringBuilder sb2 = new StringBuilder(b12 * 2);
        for (int i13 = 0; i13 < b12; i13++) {
            int i14 = i13 * 2;
            byte b13 = bArr[i14 + i12 + 1];
            if (b13 == 0) {
                sb2.append('[');
            } else if (b13 == 1) {
                sb2.append('.');
            } else if (b13 == 2) {
                sb2.append('*');
            } else {
                if (b13 != 3) {
                    throw new AssertionError();
                }
                sb2.append((int) bArr[i14 + i12 + 2]);
                sb2.append(';');
            }
        }
        return sb2.toString();
    }
}
