package defpackage;

import android.util.Log;

/* loaded from: classes.dex */
public final class mtb implements njg {
    public final aa5 a;
    public final u62 b = new u62(new byte[10], 10, 2, (byte) 0);
    public int c = 0;
    public int d;
    public y9g e;
    public boolean f;
    public boolean g;
    public boolean h;
    public int i;
    public int j;
    public boolean k;
    public long l;

    public mtb(aa5 aa5Var) {
        this.a = aa5Var;
    }

    @Override // defpackage.njg
    public final void a() {
        this.c = 0;
        this.d = 0;
        this.h = false;
        this.a.a();
    }

    @Override // defpackage.njg
    public final void b(y9g y9gVar, jp5 jp5Var, mjg mjgVar) {
        this.e = y9gVar;
        this.a.j(jp5Var, mjgVar);
    }

    @Override // defpackage.njg
    public final void c(int i, qyg qygVar) {
        int i2;
        int i3;
        int i4;
        fsi.e(this.e);
        int i5 = i & 1;
        aa5 aa5Var = this.a;
        int i6 = 2;
        int i7 = 0;
        if (i5 != 0) {
            int i8 = this.c;
            if (i8 != 0 && i8 != 1) {
                if (i8 == 2) {
                    Log.w("PesReader", "Unexpected start indicator reading extended header");
                } else {
                    if (i8 != 3) {
                        throw new IllegalStateException();
                    }
                    int i9 = this.j;
                    if (i9 != -1) {
                        StringBuilder sb = new StringBuilder(59);
                        sb.append("Unexpected start indicator: expected ");
                        sb.append(i9);
                        sb.append(" more bytes");
                        Log.w("PesReader", sb.toString());
                    }
                    aa5Var.g();
                }
            }
            this.c = 1;
            this.d = 0;
        }
        int i10 = i;
        while (qygVar.c() > 0) {
            int i11 = this.c;
            if (i11 != 0) {
                u62 u62Var = this.b;
                if (i11 != 1) {
                    if (i11 == i6) {
                        if (d(qygVar, u62Var.d, Math.min(10, this.i)) && d(qygVar, null, this.i)) {
                            u62Var.q(i7);
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
                            i10 |= this.k ? 4 : 0;
                            aa5Var.e(i10, this.l);
                            this.c = 3;
                            this.d = 0;
                            i7 = 0;
                            i6 = 2;
                        }
                    } else {
                        if (i11 != 3) {
                            throw new IllegalStateException();
                        }
                        int iC = qygVar.c();
                        int i12 = this.j;
                        int i13 = i12 == -1 ? i7 : iC - i12;
                        if (i13 > 0) {
                            iC -= i13;
                            qygVar.D(qygVar.b + iC);
                        }
                        aa5Var.d(qygVar);
                        int i14 = this.j;
                        if (i14 != -1) {
                            int i15 = i14 - iC;
                            this.j = i15;
                            if (i15 == 0) {
                                aa5Var.g();
                                this.c = 1;
                                this.d = i7;
                            }
                        }
                    }
                    i2 = i6;
                    i3 = i7;
                } else {
                    i3 = i7;
                    if (d(qygVar, u62Var.d, 9)) {
                        u62Var.q(i3);
                        int i16 = u62Var.i(24);
                        if (i16 != 1) {
                            az1.s("Unexpected start code prefix: ", 41, i16, "PesReader");
                            this.j = -1;
                            i4 = 0;
                            i2 = 2;
                        } else {
                            u62Var.t(8);
                            int i17 = u62Var.i(16);
                            u62Var.t(5);
                            this.k = u62Var.h();
                            i2 = 2;
                            u62Var.t(2);
                            this.f = u62Var.h();
                            this.g = u62Var.h();
                            u62Var.t(6);
                            int i18 = u62Var.i(8);
                            this.i = i18;
                            if (i17 == 0) {
                                this.j = -1;
                            } else {
                                int i19 = (i17 - 3) - i18;
                                this.j = i19;
                                if (i19 < 0) {
                                    az1.s("Found negative packet payload size: ", 47, i19, "PesReader");
                                    this.j = -1;
                                }
                            }
                            i4 = 2;
                        }
                        this.c = i4;
                        i3 = 0;
                        this.d = 0;
                    } else {
                        i2 = 2;
                    }
                }
            } else {
                i2 = i6;
                i3 = i7;
                qygVar.F(qygVar.c());
            }
            i7 = i3;
            i6 = i2;
        }
    }

    public final boolean d(qyg qygVar, byte[] bArr, int i) {
        int iMin = Math.min(qygVar.c(), i - this.d);
        if (iMin <= 0) {
            return true;
        }
        if (bArr == null) {
            qygVar.F(iMin);
        } else {
            qygVar.e(this.d, bArr, iMin);
        }
        int i2 = this.d + iMin;
        this.d = i2;
        return i2 == i;
    }
}
