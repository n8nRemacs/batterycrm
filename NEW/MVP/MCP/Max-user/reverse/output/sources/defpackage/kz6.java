package defpackage;

import android.util.Rational;
import android.util.Size;
import java.io.Serializable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class kz6 {
    public static final byte[] f = {0, 0, 1};
    public static final byte[] g = {0, 0, 1};
    public final /* synthetic */ int a;
    public boolean b;
    public int c;
    public int d;
    public Serializable e;

    public Size a(bf7 bf7Var) {
        int iG = bf7Var.G(0);
        Size size = (Size) bf7Var.d(bf7.D, null);
        int i = this.d;
        int i2 = this.c;
        if (size != null) {
            int iA = sxi.a(sxi.b(iG), i2, 1 == i);
            if (iA == 90 || iA == 270) {
                return new Size(size.getHeight(), size.getWidth());
            }
        }
        return size;
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r0v6, types: [byte[], java.io.Serializable] */
    public void b(int i, byte[] bArr, int i2) {
        switch (this.a) {
            case 0:
                if (this.b) {
                    int i3 = i2 - i;
                    byte[] bArr2 = (byte[]) this.e;
                    int length = bArr2.length;
                    int i4 = this.c + i3;
                    if (length < i4) {
                        this.e = Arrays.copyOf(bArr2, i4 * 2);
                    }
                    System.arraycopy(bArr, i, (byte[]) this.e, this.c, i3);
                    this.c += i3;
                    break;
                }
                break;
            default:
                if (this.b) {
                    int i5 = i2 - i;
                    byte[] bArr3 = (byte[]) this.e;
                    int length2 = bArr3.length;
                    int i6 = this.c + i5;
                    if (length2 < i6) {
                        this.e = Arrays.copyOf(bArr3, i6 * 2);
                    }
                    System.arraycopy(bArr, i, (byte[]) this.e, this.c, i5);
                    this.c += i5;
                    break;
                }
                break;
        }
    }

    public kz6(l22 l22Var, Rational rational) {
        this.a = 2;
        this.c = l22Var.b();
        this.d = l22Var.h();
        this.e = rational;
        boolean z = true;
        if (rational != null && rational.getNumerator() < rational.getDenominator()) {
            z = false;
        }
        this.b = z;
    }
}
