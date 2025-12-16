package defpackage;

/* loaded from: classes.dex */
public final class e4a implements aa5 {
    public final qyg a;
    public final g4a b;
    public final String c;
    public rfg d;
    public String e;
    public int f = 0;
    public int g;
    public boolean h;
    public boolean i;
    public long j;
    public int k;
    public long l;

    public e4a(String str) {
        qyg qygVar = new qyg(4);
        this.a = qygVar;
        qygVar.a[0] = -1;
        this.b = new g4a(0);
        this.l = -9223372036854775807L;
        this.c = str;
    }

    @Override // defpackage.aa5
    public final void a() {
        this.f = 0;
        this.g = 0;
        this.i = false;
        this.l = -9223372036854775807L;
    }

    @Override // defpackage.aa5
    public final void d(qyg qygVar) {
        fsi.e(this.d);
        while (qygVar.c() > 0) {
            int i = this.f;
            qyg qygVar2 = this.a;
            if (i == 0) {
                byte[] bArr = qygVar.a;
                int i2 = qygVar.b;
                int i3 = qygVar.c;
                while (true) {
                    if (i2 >= i3) {
                        qygVar.E(i3);
                        break;
                    }
                    byte b = bArr[i2];
                    boolean z = (b & 255) == 255;
                    boolean z2 = this.i && (b & 224) == 224;
                    this.i = z;
                    if (z2) {
                        qygVar.E(i2 + 1);
                        this.i = false;
                        qygVar2.a[1] = bArr[i2];
                        this.g = 2;
                        this.f = 1;
                        break;
                    }
                    i2++;
                }
            } else if (i == 1) {
                int iMin = Math.min(qygVar.c(), 4 - this.g);
                qygVar.e(this.g, qygVar2.a, iMin);
                int i4 = this.g + iMin;
                this.g = i4;
                if (i4 >= 4) {
                    qygVar2.E(0);
                    int iF = qygVar2.f();
                    g4a g4aVar = this.b;
                    if (g4aVar.a(iF)) {
                        this.k = g4aVar.d;
                        if (!this.h) {
                            int i5 = g4aVar.e;
                            this.j = (g4aVar.h * 1000000) / i5;
                            ef6 ef6Var = new ef6();
                            ef6Var.a = this.e;
                            ef6Var.k = g4aVar.c;
                            ef6Var.l = 4096;
                            ef6Var.x = g4aVar.f;
                            ef6Var.y = i5;
                            ef6Var.c = this.c;
                            this.d.d(new gf6(ef6Var));
                            this.h = true;
                        }
                        qygVar2.E(0);
                        this.d.c(4, qygVar2);
                        this.f = 2;
                    } else {
                        this.g = 0;
                        this.f = 1;
                    }
                }
            } else {
                if (i != 2) {
                    throw new IllegalStateException();
                }
                int iMin2 = Math.min(qygVar.c(), this.k - this.g);
                this.d.c(iMin2, qygVar);
                int i6 = this.g + iMin2;
                this.g = i6;
                int i7 = this.k;
                if (i6 >= i7) {
                    long j = this.l;
                    if (j != -9223372036854775807L) {
                        this.d.b(j, 1, i7, 0, null);
                        this.l += this.j;
                    }
                    this.g = 0;
                    this.f = 0;
                }
            }
        }
    }

    @Override // defpackage.aa5
    public final void e(int i, long j) {
        if (j != -9223372036854775807L) {
            this.l = j;
        }
    }

    @Override // defpackage.aa5
    public final void g() {
    }

    @Override // defpackage.aa5
    public final void j(jp5 jp5Var, mjg mjgVar) {
        mjgVar.a();
        mjgVar.b();
        this.e = mjgVar.f;
        mjgVar.b();
        this.d = jp5Var.B(mjgVar.e, 1);
    }
}
