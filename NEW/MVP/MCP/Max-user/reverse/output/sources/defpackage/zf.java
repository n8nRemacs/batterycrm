package defpackage;

import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public final class zf implements yf {
    public int[] a;
    public int b;

    public zf(int i) {
        switch (i) {
            case 1:
                this.a = new int[8];
                break;
            default:
                this.a = new int[]{1, 0, 2};
                break;
        }
    }

    public int a() {
        int i = this.b;
        if (i != 0) {
            return this.a[i - 1];
        }
        throw new NoSuchElementException();
    }

    @Override // defpackage.yf
    public int b() {
        int[] iArr = this.a;
        int i = this.b;
        int i2 = iArr[i];
        this.b = (i + 1) % iArr.length;
        return i2;
    }

    public int c() {
        int i = this.b;
        if (i == 0) {
            throw new NoSuchElementException();
        }
        int[] iArr = this.a;
        int i2 = i - 1;
        this.b = i2;
        return iArr[i2];
    }

    public void d(int i) {
        int i2 = this.b;
        if (i2 == 0) {
            throw new NoSuchElementException();
        }
        this.a[i2 - 1] = i;
    }

    public void e(int i) {
        int[] iArr = this.a;
        int length = iArr.length;
        if (this.b >= length) {
            int[] iArr2 = new int[length * 2];
            System.arraycopy(iArr, 0, iArr2, 0, length);
            this.a = iArr2;
            iArr = iArr2;
        }
        int i2 = this.b;
        this.b = i2 + 1;
        iArr[i2] = i;
    }
}
