package defpackage;

/* loaded from: classes.dex */
public final class q8e implements ojg {
    public final o8e a;
    public final umb b = new umb(32);
    public int c;
    public int d;
    public boolean e;
    public boolean f;

    public q8e(o8e o8eVar) {
        this.a = o8eVar;
    }

    @Override // defpackage.ojg
    public final void a() {
        this.f = true;
    }

    @Override // defpackage.ojg
    public final void b(int i, umb umbVar) {
        boolean z = (i & 1) != 0;
        int iX = z ? umbVar.b + umbVar.x() : -1;
        if (this.f) {
            if (!z) {
                return;
            }
            this.f = false;
            umbVar.J(iX);
            this.d = 0;
        }
        while (umbVar.a() > 0) {
            int i2 = this.d;
            umb umbVar2 = this.b;
            if (i2 < 3) {
                if (i2 == 0) {
                    int iX2 = umbVar.x();
                    umbVar.J(umbVar.b - 1);
                    if (iX2 == 255) {
                        this.f = true;
                        return;
                    }
                }
                int iMin = Math.min(umbVar.a(), 3 - this.d);
                umbVar.h(this.d, umbVar2.a, iMin);
                int i3 = this.d + iMin;
                this.d = i3;
                if (i3 == 3) {
                    umbVar2.J(0);
                    umbVar2.I(3);
                    umbVar2.K(1);
                    int iX3 = umbVar2.x();
                    int iX4 = umbVar2.x();
                    this.e = (iX3 & 128) != 0;
                    int i4 = (((iX3 & 15) << 8) | iX4) + 3;
                    this.c = i4;
                    byte[] bArr = umbVar2.a;
                    if (bArr.length < i4) {
                        umbVar2.c(Math.min(4098, Math.max(i4, bArr.length * 2)));
                    }
                }
            } else {
                int iMin2 = Math.min(umbVar.a(), this.c - this.d);
                umbVar.h(this.d, umbVar2.a, iMin2);
                int i5 = this.d + iMin2;
                this.d = i5;
                int i6 = this.c;
                if (i5 != i6) {
                    continue;
                } else {
                    if (!this.e) {
                        umbVar2.I(i6);
                    } else {
                        if (zxg.m(0, i6, -1, umbVar2.a) != 0) {
                            this.f = true;
                            return;
                        }
                        umbVar2.I(this.c - 4);
                    }
                    umbVar2.J(0);
                    this.a.f(umbVar2);
                    this.d = 0;
                }
            }
        }
    }

    @Override // defpackage.ojg
    public final void e(z9g z9gVar, kp5 kp5Var, mjg mjgVar) {
        this.a.e(z9gVar, kp5Var, mjgVar);
        this.f = true;
    }
}
