package net.bytebuddy.jar.asm;

/* compiled from: ByteVector.java */
/* renamed from: net.bytebuddy.jar.asm.d, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C44391d {

    /* renamed from: a, reason: collision with root package name */
    public byte[] f418165a;

    /* renamed from: b, reason: collision with root package name */
    public int f418166b;

    public C44391d() {
        this.f418165a = new byte[64];
    }

    public final void a(int i12, int i13, String str) {
        int length = str.length();
        int i14 = i12;
        int i15 = i14;
        while (i14 < length) {
            char cCharAt = str.charAt(i14);
            i15 = (cCharAt < 1 || cCharAt > 127) ? cCharAt <= 2047 ? i15 + 2 : i15 + 3 : i15 + 1;
            i14++;
        }
        if (i15 > i13) {
            throw new IllegalArgumentException("UTF8 string too large");
        }
        int i16 = this.f418166b;
        int i17 = i16 - i12;
        int i18 = i17 - 2;
        if (i18 >= 0) {
            byte[] bArr = this.f418165a;
            bArr[i18] = (byte) (i15 >>> 8);
            bArr[i17 - 1] = (byte) i15;
        }
        if ((i16 + i15) - i12 > this.f418165a.length) {
            b(i15 - i12);
        }
        int i19 = this.f418166b;
        while (i12 < length) {
            char cCharAt2 = str.charAt(i12);
            if (cCharAt2 >= 1 && cCharAt2 <= 127) {
                this.f418165a[i19] = (byte) cCharAt2;
                i19++;
            } else if (cCharAt2 <= 2047) {
                byte[] bArr2 = this.f418165a;
                int i22 = i19 + 1;
                bArr2[i19] = (byte) (((cCharAt2 >> 6) & 31) | 192);
                i19 += 2;
                bArr2[i22] = (byte) ((cCharAt2 & '?') | 128);
            } else {
                byte[] bArr3 = this.f418165a;
                bArr3[i19] = (byte) (((cCharAt2 >> '\f') & 15) | 224);
                int i23 = i19 + 2;
                bArr3[i19 + 1] = (byte) (((cCharAt2 >> 6) & 63) | 128);
                i19 += 3;
                bArr3[i23] = (byte) ((cCharAt2 & '?') | 128);
            }
            i12++;
        }
        this.f418166b = i19;
    }

    public final void b(int i12) {
        int i13 = this.f418166b;
        byte[] bArr = this.f418165a;
        if (i13 > bArr.length) {
            throw new AssertionError("Internal error");
        }
        int length = bArr.length * 2;
        int i14 = i12 + i13;
        if (length <= i14) {
            length = i14;
        }
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, i13);
        this.f418165a = bArr2;
    }

    public final void c(int i12, int i13) {
        int i14 = this.f418166b;
        int i15 = i14 + 2;
        if (i15 > this.f418165a.length) {
            b(2);
        }
        byte[] bArr = this.f418165a;
        bArr[i14] = (byte) i12;
        bArr[i14 + 1] = (byte) i13;
        this.f418166b = i15;
    }

    public final void d(int i12, int i13) {
        int i14 = this.f418166b;
        int i15 = i14 + 4;
        if (i15 > this.f418165a.length) {
            b(4);
        }
        byte[] bArr = this.f418165a;
        bArr[i14] = (byte) 15;
        bArr[i14 + 1] = (byte) i12;
        bArr[i14 + 2] = (byte) (i13 >>> 8);
        bArr[i14 + 3] = (byte) i13;
        this.f418166b = i15;
    }

    public final void e(int i12, int i13) {
        int i14 = this.f418166b;
        int i15 = i14 + 3;
        if (i15 > this.f418165a.length) {
            b(3);
        }
        byte[] bArr = this.f418165a;
        bArr[i14] = (byte) i12;
        bArr[i14 + 1] = (byte) (i13 >>> 8);
        bArr[i14 + 2] = (byte) i13;
        this.f418166b = i15;
    }

    public final void f(int i12, int i13, int i14) {
        int i15 = this.f418166b;
        int i16 = i15 + 5;
        if (i16 > this.f418165a.length) {
            b(5);
        }
        byte[] bArr = this.f418165a;
        bArr[i15] = (byte) i12;
        bArr[i15 + 1] = (byte) (i13 >>> 8);
        bArr[i15 + 2] = (byte) i13;
        bArr[i15 + 3] = (byte) (i14 >>> 8);
        bArr[i15 + 4] = (byte) i14;
        this.f418166b = i16;
    }

    public final void g(int i12) {
        int i13 = this.f418166b;
        int i14 = i13 + 1;
        if (i14 > this.f418165a.length) {
            b(1);
        }
        this.f418165a[i13] = (byte) i12;
        this.f418166b = i14;
    }

    public final void h(int i12, int i13, byte[] bArr) {
        if (this.f418166b + i13 > this.f418165a.length) {
            b(i13);
        }
        if (bArr != null) {
            System.arraycopy(bArr, i12, this.f418165a, this.f418166b, i13);
        }
        this.f418166b += i13;
    }

    public final void i(int i12) {
        int i13 = this.f418166b;
        int i14 = i13 + 4;
        if (i14 > this.f418165a.length) {
            b(4);
        }
        byte[] bArr = this.f418165a;
        bArr[i13] = (byte) (i12 >>> 24);
        bArr[i13 + 1] = (byte) (i12 >>> 16);
        bArr[i13 + 2] = (byte) (i12 >>> 8);
        bArr[i13 + 3] = (byte) i12;
        this.f418166b = i14;
    }

    public final void j(int i12) {
        int i13 = this.f418166b;
        int i14 = i13 + 2;
        if (i14 > this.f418165a.length) {
            b(2);
        }
        byte[] bArr = this.f418165a;
        bArr[i13] = (byte) (i12 >>> 8);
        bArr[i13 + 1] = (byte) i12;
        this.f418166b = i14;
    }

    public C44391d(int i12) {
        this.f418165a = new byte[i12];
    }
}
