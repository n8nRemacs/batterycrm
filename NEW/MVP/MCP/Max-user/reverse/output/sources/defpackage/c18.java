package defpackage;

import com.google.android.exoplayer2.ParserException;
import java.util.Collections;

/* loaded from: classes.dex */
public final class c18 implements aa5 {
    public final String a;
    public final qyg b;
    public final u62 c;
    public rfg d;
    public String e;
    public gf6 f;
    public int g;
    public int h;
    public int i;
    public int j;
    public long k;
    public boolean l;
    public int m;
    public int n;
    public int o;
    public boolean p;
    public long q;
    public int r;
    public long s;
    public int t;
    public String u;

    public c18(String str) {
        this.a = str;
        qyg qygVar = new qyg(1024);
        this.b = qygVar;
        byte[] bArr = qygVar.a;
        this.c = new u62(bArr, bArr.length, 2, (byte) 0);
        this.k = -9223372036854775807L;
    }

    @Override // defpackage.aa5
    public final void a() {
        this.g = 0;
        this.k = -9223372036854775807L;
        this.l = false;
    }

    @Override // defpackage.aa5
    public final void d(qyg qygVar) throws ParserException {
        int i;
        boolean zH;
        fsi.e(this.d);
        while (qygVar.c() > 0) {
            int i2 = this.g;
            if (i2 != 0) {
                if (i2 != 1) {
                    qyg qygVar2 = this.b;
                    u62 u62Var = this.c;
                    if (i2 == 2) {
                        int iS = ((this.j & (-225)) << 8) | qygVar.s();
                        this.i = iS;
                        if (iS > qygVar2.a.length) {
                            qygVar2.B(iS);
                            byte[] bArr = qygVar2.a;
                            u62Var.o(bArr.length, bArr);
                        }
                        this.h = 0;
                        this.g = 3;
                    } else {
                        if (i2 != 3) {
                            throw new IllegalStateException();
                        }
                        int iMin = Math.min(qygVar.c(), this.i - this.h);
                        qygVar.e(this.h, u62Var.d, iMin);
                        int i3 = this.h + iMin;
                        this.h = i3;
                        if (i3 == this.i) {
                            u62Var.q(0);
                            if (u62Var.h()) {
                                if (this.l) {
                                }
                                this.g = 0;
                            } else {
                                this.l = true;
                                int i4 = u62Var.i(1);
                                int i5 = i4 == 1 ? u62Var.i(1) : 0;
                                this.m = i5;
                                if (i5 != 0) {
                                    throw ParserException.a(null, null);
                                }
                                if (i4 == 1) {
                                    u62Var.i((u62Var.i(2) + 1) * 8);
                                }
                                if (!u62Var.h()) {
                                    throw ParserException.a(null, null);
                                }
                                this.n = u62Var.i(6);
                                int i6 = u62Var.i(4);
                                int i7 = u62Var.i(3);
                                if (i6 != 0 || i7 != 0) {
                                    throw ParserException.a(null, null);
                                }
                                if (i4 == 0) {
                                    int iG = u62Var.g();
                                    int iB = u62Var.b();
                                    d dVarF = z7.f(u62Var, true);
                                    this.u = dVarF.c;
                                    this.r = dVarF.a;
                                    this.t = dVarF.b;
                                    int iB2 = iB - u62Var.b();
                                    u62Var.q(iG);
                                    byte[] bArr2 = new byte[(iB2 + 7) / 8];
                                    u62Var.j(iB2, bArr2);
                                    ef6 ef6Var = new ef6();
                                    ef6Var.a = this.e;
                                    ef6Var.k = "audio/mp4a-latm";
                                    ef6Var.h = this.u;
                                    ef6Var.x = this.t;
                                    ef6Var.y = this.r;
                                    ef6Var.m = Collections.singletonList(bArr2);
                                    ef6Var.c = this.a;
                                    gf6 gf6Var = new gf6(ef6Var);
                                    if (!gf6Var.equals(this.f)) {
                                        this.f = gf6Var;
                                        this.s = 1024000000 / gf6Var.J0;
                                        this.d.d(gf6Var);
                                    }
                                } else {
                                    int iB3 = u62Var.b();
                                    d dVarF2 = z7.f(u62Var, true);
                                    this.u = dVarF2.c;
                                    this.r = dVarF2.a;
                                    this.t = dVarF2.b;
                                    u62Var.t(u62Var.i((u62Var.i(2) + 1) * 8) - (iB3 - u62Var.b()));
                                }
                                int i8 = u62Var.i(3);
                                this.o = i8;
                                if (i8 == 0) {
                                    u62Var.t(8);
                                } else if (i8 == 1) {
                                    u62Var.t(9);
                                } else if (i8 == 3 || i8 == 4 || i8 == 5) {
                                    u62Var.t(6);
                                } else {
                                    if (i8 != 6 && i8 != 7) {
                                        throw new IllegalStateException();
                                    }
                                    u62Var.t(1);
                                }
                                boolean zH2 = u62Var.h();
                                this.p = zH2;
                                this.q = 0L;
                                if (zH2) {
                                    if (i4 == 1) {
                                        this.q = u62Var.i((u62Var.i(2) + 1) * 8);
                                    } else {
                                        do {
                                            zH = u62Var.h();
                                            this.q = (this.q << 8) + u62Var.i(8);
                                        } while (zH);
                                    }
                                }
                                if (u62Var.h()) {
                                    u62Var.t(8);
                                }
                            }
                            if (this.m != 0) {
                                throw ParserException.a(null, null);
                            }
                            if (this.n != 0) {
                                throw ParserException.a(null, null);
                            }
                            if (this.o != 0) {
                                throw ParserException.a(null, null);
                            }
                            int i9 = 0;
                            do {
                                i = u62Var.i(8);
                                i9 += i;
                            } while (i == 255);
                            int iG2 = u62Var.g();
                            if ((iG2 & 7) == 0) {
                                qygVar2.E(iG2 >> 3);
                            } else {
                                u62Var.j(i9 * 8, qygVar2.a);
                                qygVar2.E(0);
                            }
                            this.d.c(i9, qygVar2);
                            long j = this.k;
                            if (j != -9223372036854775807L) {
                                this.d.b(j, 1, i9, 0, null);
                                this.k += this.s;
                            }
                            if (this.p) {
                                u62Var.t((int) this.q);
                            }
                            this.g = 0;
                        } else {
                            continue;
                        }
                    }
                } else {
                    int iS2 = qygVar.s();
                    if ((iS2 & 224) == 224) {
                        this.j = iS2;
                        this.g = 2;
                    } else if (iS2 != 86) {
                        this.g = 0;
                    }
                }
            } else if (qygVar.s() == 86) {
                this.g = 1;
            }
        }
    }

    @Override // defpackage.aa5
    public final void e(int i, long j) {
        if (j != -9223372036854775807L) {
            this.k = j;
        }
    }

    @Override // defpackage.aa5
    public final void g() {
    }

    @Override // defpackage.aa5
    public final void j(jp5 jp5Var, mjg mjgVar) {
        mjgVar.a();
        mjgVar.b();
        this.d = jp5Var.B(mjgVar.e, 1);
        mjgVar.b();
        this.e = mjgVar.f;
    }
}
