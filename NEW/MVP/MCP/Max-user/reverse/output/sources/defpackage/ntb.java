package defpackage;

/* loaded from: classes.dex */
public final class ntb implements ojg {
    public final ba5 a;
    public final u62 b = new u62(new byte[10], 10, 3, (byte) 0);
    public int c = 0;
    public int d;
    public z9g e;
    public boolean f;
    public boolean g;
    public boolean h;
    public int i;
    public int j;
    public boolean k;
    public long l;

    public ntb(ba5 ba5Var) {
        this.a = ba5Var;
    }

    @Override // defpackage.ojg
    public final void a() {
        this.c = 0;
        this.d = 0;
        this.h = false;
        this.a.a();
    }

    @Override // defpackage.ojg
    public final void b(int i, umb umbVar) {
        hsi.h(this.e);
        int i2 = i & 1;
        int i3 = -1;
        int i4 = 2;
        ba5 ba5Var = this.a;
        if (i2 != 0) {
            int i5 = this.c;
            if (i5 != 0 && i5 != 1) {
                if (i5 == 2) {
                    a8i.l("PesReader", "Unexpected start indicator reading extended header");
                } else {
                    if (i5 != 3) {
                        throw new IllegalStateException();
                    }
                    if (this.j != -1) {
                        a8i.l("PesReader", "Unexpected start indicator: expected " + this.j + " more bytes");
                    }
                    ba5Var.h(umbVar.c == 0);
                }
            }
            this.c = 1;
            this.d = 0;
        }
        int i6 = i;
        while (umbVar.a() > 0) {
            int i7 = this.c;
            if (i7 != 0) {
                u62 u62Var = this.b;
                if (i7 != 1) {
                    if (i7 == i4) {
                        if (c(umbVar, u62Var.d, Math.min(10, this.i)) && c(umbVar, null, this.i)) {
                            u62Var.q(0);
                            this.l = -9223372036854775807L;
                            if (this.f) {
                                u62Var.t(4);
                                u62Var.t(1);
                                u62Var.t(1);
                                long jI = (u62Var.i(15) << 15) | (u62Var.i(3) << 30) | u62Var.i(15);
                                u62Var.t(1);
                                if (!this.h && this.g) {
                                    u62Var.t(4);
                                    u62Var.t(1);
                                    u62Var.t(1);
                                    u62Var.t(1);
                                    this.e.b((u62Var.i(3) << 30) | (u62Var.i(15) << 15) | u62Var.i(15));
                                    this.h = true;
                                }
                                this.l = this.e.b(jI);
                            }
                            i6 |= this.k ? 4 : 0;
                            ba5Var.e(i6, this.l);
                            this.c = 3;
                            this.d = 0;
                        }
                    } else {
                        if (i7 != 3) {
                            throw new IllegalStateException();
                        }
                        int iA = umbVar.a();
                        int i8 = this.j;
                        int i9 = i8 == i3 ? 0 : iA - i8;
                        if (i9 > 0) {
                            iA -= i9;
                            umbVar.I(umbVar.b + iA);
                        }
                        ba5Var.f(umbVar);
                        int i10 = this.j;
                        if (i10 != i3) {
                            int i11 = i10 - iA;
                            this.j = i11;
                            if (i11 == 0) {
                                ba5Var.h(false);
                                this.c = 1;
                                this.d = 0;
                            }
                        }
                    }
                } else if (c(umbVar, u62Var.d, 9)) {
                    this.c = d() ? 2 : 0;
                    this.d = 0;
                }
            } else {
                umbVar.K(umbVar.a());
            }
            i3 = -1;
            i4 = 2;
        }
    }

    public final boolean c(umb umbVar, byte[] bArr, int i) {
        int iMin = Math.min(umbVar.a(), i - this.d);
        if (iMin <= 0) {
            return true;
        }
        if (bArr == null) {
            umbVar.K(iMin);
        } else {
            umbVar.h(this.d, bArr, iMin);
        }
        int i2 = this.d + iMin;
        this.d = i2;
        return i2 == i;
    }

    public final boolean d() {
        u62 u62Var = this.b;
        u62Var.q(0);
        int i = u62Var.i(24);
        if (i != 1) {
            wy1.p(i, "Unexpected start code prefix: ", "PesReader");
            this.j = -1;
            return false;
        }
        u62Var.t(8);
        int i2 = u62Var.i(16);
        u62Var.t(5);
        this.k = u62Var.h();
        u62Var.t(2);
        this.f = u62Var.h();
        this.g = u62Var.h();
        u62Var.t(6);
        int i3 = u62Var.i(8);
        this.i = i3;
        if (i2 == 0) {
            this.j = -1;
        } else {
            int i4 = (i2 - 3) - i3;
            this.j = i4;
            if (i4 < 0) {
                a8i.l("PesReader", "Found negative packet payload size: " + this.j);
                this.j = -1;
            }
        }
        return true;
    }

    @Override // defpackage.ojg
    public final void e(z9g z9gVar, kp5 kp5Var, mjg mjgVar) {
        this.e = z9gVar;
        this.a.i(kp5Var, mjgVar);
    }
}
