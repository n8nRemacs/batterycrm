package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class nz6 {
    public static final byte[] g = {0, 0, 1};
    public static final byte[] h = {0, 0, 1};
    public final /* synthetic */ int a;
    public boolean b;
    public int c;
    public int d;
    public int e;
    public byte[] f;

    public final void a(int i, byte[] bArr, int i2) {
        switch (this.a) {
            case 0:
                if (this.b) {
                    int i3 = i2 - i;
                    byte[] bArr2 = this.f;
                    int length = bArr2.length;
                    int i4 = this.d + i3;
                    if (length < i4) {
                        this.f = Arrays.copyOf(bArr2, i4 * 2);
                    }
                    System.arraycopy(bArr, i, this.f, this.d, i3);
                    this.d += i3;
                    break;
                }
                break;
            default:
                if (this.b) {
                    int i5 = i2 - i;
                    byte[] bArr3 = this.f;
                    int length2 = bArr3.length;
                    int i6 = this.d + i5;
                    if (length2 < i6) {
                        this.f = Arrays.copyOf(bArr3, i6 * 2);
                    }
                    System.arraycopy(bArr, i, this.f, this.d, i5);
                    this.d += i5;
                    break;
                }
                break;
        }
    }
}
