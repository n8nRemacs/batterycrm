package defpackage;

/* loaded from: classes.dex */
public final class f4a implements ba5 {
    public final umb a;
    public final g4a b;
    public final String c;
    public final int d;
    public final String e;
    public sfg f;
    public String g;
    public int h = 0;
    public int i;
    public boolean j;
    public boolean k;
    public long l;
    public int m;
    public long n;

    public f4a(String str, int i, String str2) {
        umb umbVar = new umb(4);
        this.a = umbVar;
        umbVar.a[0] = -1;
        this.b = new g4a(1);
        this.n = -9223372036854775807L;
        this.c = str;
        this.d = i;
        this.e = str2;
    }

    @Override // defpackage.ba5
    public final void a() {
        this.h = 0;
        this.i = 0;
        this.k = false;
        this.n = -9223372036854775807L;
    }

    @Override // defpackage.ba5
    public final void e(int i, long j) {
        this.n = j;
    }

    @Override // defpackage.ba5
    public final void f(umb umbVar) {
        hsi.h(this.f);
        while (umbVar.a() > 0) {
            int i = this.h;
            umb umbVar2 = this.a;
            if (i == 0) {
                byte[] bArr = umbVar.a;
                int i2 = umbVar.b;
                int i3 = umbVar.c;
                while (true) {
                    if (i2 >= i3) {
                        umbVar.J(i3);
                        break;
                    }
                    byte b = bArr[i2];
                    boolean z = (b & 255) == 255;
                    boolean z2 = this.k && (b & 224) == 224;
                    this.k = z;
                    if (z2) {
                        umbVar.J(i2 + 1);
                        this.k = false;
                        umbVar2.a[1] = bArr[i2];
                        this.i = 2;
                        this.h = 1;
                        break;
                    }
                    i2++;
                }
            } else if (i == 1) {
                int iMin = Math.min(umbVar.a(), 4 - this.i);
                umbVar.h(this.i, umbVar2.a, iMin);
                int i4 = this.i + iMin;
                this.i = i4;
                if (i4 >= 4) {
                    umbVar2.J(0);
                    int iJ = umbVar2.j();
                    g4a g4aVar = this.b;
                    if (g4aVar.a(iJ)) {
                        this.m = g4aVar.d;
                        if (!this.j) {
                            this.l = (g4aVar.h * 1000000) / g4aVar.e;
                            ff6 ff6Var = new ff6();
                            ff6Var.a = this.g;
                            ff6Var.l = xz9.n(this.e);
                            ff6Var.m = xz9.n(g4aVar.c);
                            ff6Var.n = 4096;
                            ff6Var.E = g4aVar.f;
                            ff6Var.F = g4aVar.e;
                            ff6Var.d = this.c;
                            ff6Var.f = this.d;
                            this.f.d(new hf6(ff6Var));
                            this.j = true;
                        }
                        umbVar2.J(0);
                        this.f.b(umbVar2, 4, 0);
                        this.h = 2;
                    } else {
                        this.i = 0;
                        this.h = 1;
                    }
                }
            } else {
                if (i != 2) {
                    throw new IllegalStateException();
                }
                int iMin2 = Math.min(umbVar.a(), this.m - this.i);
                this.f.b(umbVar, iMin2, 0);
                int i5 = this.i + iMin2;
                this.i = i5;
                if (i5 >= this.m) {
                    hsi.g(this.n != -9223372036854775807L);
                    this.f.a(this.n, 1, this.m, 0, null);
                    this.n += this.l;
                    this.i = 0;
                    this.h = 0;
                }
            }
        }
    }

    @Override // defpackage.ba5
    public final void h(boolean z) {
    }

    @Override // defpackage.ba5
    public final void i(kp5 kp5Var, mjg mjgVar) {
        mjgVar.a();
        mjgVar.b();
        this.g = mjgVar.f;
        mjgVar.b();
        this.f = kp5Var.mo163B(mjgVar.e, 1);
    }
}
