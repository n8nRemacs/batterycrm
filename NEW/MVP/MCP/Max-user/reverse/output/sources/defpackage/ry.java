package defpackage;

import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class ry implements qy, et0 {
    public Object X;
    public final /* synthetic */ int a;
    public int b;
    public int c;
    public int d;
    public int o;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ry(int i, byte b) {
        this(16);
        this.a = i;
        switch (i) {
            case 4:
                break;
            default:
                this.b = 0;
                this.c = -1;
                this.d = 0;
                this.X = new int[16];
                this.o = r1.length - 1;
                break;
        }
    }

    @Override // defpackage.qy, defpackage.et0
    public int a() {
        switch (this.a) {
        }
        return -1;
    }

    @Override // defpackage.qy, defpackage.et0
    public int b() {
        switch (this.a) {
        }
        return this.b;
    }

    @Override // defpackage.qy, defpackage.et0
    public int c() {
        switch (this.a) {
            case 0:
                qyg qygVar = (qyg) this.X;
                int i = this.c;
                if (i != 8) {
                    if (i != 16) {
                        int i2 = this.d;
                        this.d = i2 + 1;
                        if (i2 % 2 != 0) {
                            break;
                        } else {
                            int iS = qygVar.s();
                            this.o = iS;
                            break;
                        }
                    } else {
                        break;
                    }
                } else {
                    break;
                }
            default:
                umb umbVar = (umb) this.X;
                int i3 = this.c;
                if (i3 != 8) {
                    if (i3 != 16) {
                        int i4 = this.d;
                        this.d = i4 + 1;
                        if (i4 % 2 != 0) {
                            break;
                        } else {
                            int iX = umbVar.x();
                            this.o = iX;
                            break;
                        }
                    } else {
                        break;
                    }
                } else {
                    break;
                }
        }
        return this.o & 15;
    }

    public void d(int i) {
        int i2 = this.d;
        int[] iArr = (int[]) this.X;
        if (i2 == iArr.length) {
            int length = iArr.length << 1;
            if (length < 0) {
                throw new IllegalStateException();
            }
            int[] iArr2 = new int[length];
            int length2 = iArr.length;
            int i3 = this.b;
            int i4 = length2 - i3;
            System.arraycopy(iArr, i3, iArr2, 0, i4);
            System.arraycopy((int[]) this.X, 0, iArr2, i4, i3);
            this.b = 0;
            this.c = this.d - 1;
            this.X = iArr2;
            this.o = length - 1;
        }
        int i5 = (this.c + 1) & this.o;
        this.c = i5;
        ((int[]) this.X)[i5] = i;
        this.d++;
    }

    public void e(long j) {
        int i = this.d;
        long[] jArr = (long[]) this.X;
        if (i == jArr.length) {
            int length = jArr.length << 1;
            if (length < 0) {
                throw new IllegalStateException();
            }
            long[] jArr2 = new long[length];
            int length2 = jArr.length;
            int i2 = this.b;
            int i3 = length2 - i2;
            System.arraycopy(jArr, i2, jArr2, 0, i3);
            System.arraycopy((long[]) this.X, 0, jArr2, i3, i2);
            this.b = 0;
            this.c = this.d - 1;
            this.X = jArr2;
            this.o = length - 1;
        }
        int i4 = (this.c + 1) & this.o;
        this.c = i4;
        ((long[]) this.X)[i4] = j;
        this.d++;
    }

    public long f() {
        if (this.d != 0) {
            return ((long[]) this.X)[this.b];
        }
        throw new NoSuchElementException();
    }

    public int g() {
        int i = this.d;
        if (i == 0) {
            throw new NoSuchElementException();
        }
        int[] iArr = (int[]) this.X;
        int i2 = this.b;
        int i3 = iArr[i2];
        this.b = (i2 + 1) & this.o;
        this.d = i - 1;
        return i3;
    }

    public long h() {
        int i = this.d;
        if (i == 0) {
            throw new NoSuchElementException();
        }
        long[] jArr = (long[]) this.X;
        int i2 = this.b;
        long j = jArr[i2];
        this.b = this.o & (i2 + 1);
        this.d = i - 1;
        return j;
    }

    public ry(int i) {
        this.a = 4;
        hsi.b(i >= 0 && i <= 1073741824);
        i = i == 0 ? 1 : i;
        i = Integer.bitCount(i) != 1 ? Integer.highestOneBit(i - 1) << 1 : i;
        this.b = 0;
        this.c = -1;
        this.d = 0;
        this.X = new long[i];
        this.o = i - 1;
    }

    public ry(int i, int i2, int i3, int i4, String str) {
        this.a = 1;
        this.X = str;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.o = i4;
    }

    public ry(ny nyVar) {
        this.a = 0;
        qyg qygVar = nyVar.c;
        this.X = qygVar;
        qygVar.E(12);
        this.c = qygVar.v() & 255;
        this.b = qygVar.v();
    }

    public ry(q3a q3aVar) {
        this.a = 2;
        umb umbVar = q3aVar.c;
        this.X = umbVar;
        umbVar.J(12);
        this.c = umbVar.B() & 255;
        this.b = umbVar.B();
    }
}
