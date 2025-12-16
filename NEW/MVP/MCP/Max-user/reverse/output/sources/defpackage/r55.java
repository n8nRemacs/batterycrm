package defpackage;

import java.util.Arrays;

/* loaded from: classes3.dex */
public final class r55 {
    public final /* synthetic */ int a;
    public int b;
    public long[] c;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public r55(int i, byte b) {
        this(32, 2);
        this.a = i;
        switch (i) {
            case 2:
                break;
            default:
                this.c = new long[32];
                break;
        }
    }

    public void a(long j) {
        switch (this.a) {
            case 1:
                int i = this.b;
                long[] jArr = this.c;
                if (i == jArr.length) {
                    this.c = Arrays.copyOf(jArr, i * 2);
                }
                long[] jArr2 = this.c;
                int i2 = this.b;
                this.b = i2 + 1;
                jArr2[i2] = j;
                break;
            default:
                int i3 = this.b;
                long[] jArr3 = this.c;
                if (i3 == jArr3.length) {
                    this.c = Arrays.copyOf(jArr3, i3 * 2);
                }
                long[] jArr4 = this.c;
                int i4 = this.b;
                this.b = i4 + 1;
                jArr4[i4] = j;
                break;
        }
    }

    public void b(long[] jArr) {
        int length = this.b + jArr.length;
        long[] jArr2 = this.c;
        if (length > jArr2.length) {
            this.c = Arrays.copyOf(jArr2, Math.max(jArr2.length * 2, length));
        }
        System.arraycopy(jArr, 0, this.c, this.b, jArr.length);
        this.b = length;
    }

    public long c(int i) {
        switch (this.a) {
            case 1:
                if (i >= 0 && i < this.b) {
                    return this.c[i];
                }
                int i2 = this.b;
                StringBuilder sb = new StringBuilder(46);
                sb.append("Invalid index ");
                sb.append(i);
                sb.append(", size is ");
                sb.append(i2);
                throw new IndexOutOfBoundsException(sb.toString());
            default:
                if (i >= 0 && i < this.b) {
                    return this.c[i];
                }
                StringBuilder sbM = ho7.m(i, "Invalid index ", ", size is ");
                sbM.append(this.b);
                throw new IndexOutOfBoundsException(sbM.toString());
        }
    }

    public r55(int i, int i2) {
        this.a = i2;
        switch (i2) {
            case 2:
                this.c = new long[i];
                break;
            default:
                this.b = i;
                long[] jArr = new long[i];
                this.c = jArr;
                Arrays.fill(jArr, -1L);
                break;
        }
    }
}
