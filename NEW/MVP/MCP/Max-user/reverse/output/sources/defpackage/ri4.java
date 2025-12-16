package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class ri4 {
    public int d;
    public int e;
    public final boolean a = true;
    public final int b = 65536;
    public int f = 0;
    public zc[] g = new zc[100];
    public final byte[] c = null;

    public final synchronized int a() {
        return this.e * this.b;
    }

    public final synchronized void b() {
        if (this.a) {
            c(0);
        }
    }

    public final synchronized void c(int i) {
        boolean z = i < this.d;
        this.d = i;
        if (z) {
            d();
        }
    }

    public final synchronized void d() {
        try {
            int i = 0;
            int iMax = Math.max(0, zxg.f(this.d, this.b) - this.e);
            int i2 = this.f;
            if (iMax >= i2) {
                return;
            }
            if (this.c != null) {
                int i3 = i2 - 1;
                while (i <= i3) {
                    zc zcVar = this.g[i];
                    zcVar.getClass();
                    if (zcVar.a == this.c) {
                        i++;
                    } else {
                        zc zcVar2 = this.g[i3];
                        zcVar2.getClass();
                        if (zcVar2.a != this.c) {
                            i3--;
                        } else {
                            zc[] zcVarArr = this.g;
                            zcVarArr[i] = zcVar2;
                            zcVarArr[i3] = zcVar;
                            i3--;
                            i++;
                        }
                    }
                }
                iMax = Math.max(iMax, i);
                if (iMax >= this.f) {
                    return;
                }
            }
            Arrays.fill(this.g, iMax, this.f, (Object) null);
            this.f = iMax;
        } catch (Throwable th) {
            throw th;
        }
    }
}
