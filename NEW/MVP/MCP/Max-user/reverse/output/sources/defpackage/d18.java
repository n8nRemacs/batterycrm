package defpackage;

import androidx.media3.common.ParserException;
import java.util.Collections;

/* loaded from: classes.dex */
public final class d18 implements ba5 {
    public final String a;
    public final int b;
    public final umb c;
    public final u62 d;
    public sfg e;
    public String f;
    public hf6 g;
    public int h;
    public int i;
    public int j;
    public int k;
    public long l;
    public boolean m;
    public int n;
    public int o;
    public int p;
    public boolean q;
    public long r;
    public int s;
    public long t;
    public int u;
    public String v;

    public d18(String str, int i) {
        this.a = str;
        this.b = i;
        umb umbVar = new umb(1024);
        this.c = umbVar;
        byte[] bArr = umbVar.a;
        this.d = new u62(bArr, bArr.length, 3, (byte) 0);
        this.l = -9223372036854775807L;
    }

    @Override // defpackage.ba5
    public final void a() {
        this.h = 0;
        this.l = -9223372036854775807L;
        this.m = false;
    }

    @Override // defpackage.ba5
    public final void e(int i, long j) {
        this.l = j;
    }

    @Override // defpackage.ba5
    public final void f(umb umbVar) throws ParserException {
        int i;
        int i2;
        boolean zH;
        hsi.h(this.e);
        while (umbVar.a() > 0) {
            int i3 = this.h;
            if (i3 != 0) {
                if (i3 != 1) {
                    umb umbVar2 = this.c;
                    u62 u62Var = this.d;
                    if (i3 == 2) {
                        int iX = ((this.k & (-225)) << 8) | umbVar.x();
                        this.j = iX;
                        if (iX > umbVar2.a.length) {
                            umbVar2.G(iX);
                            byte[] bArr = umbVar2.a;
                            u62Var.getClass();
                            u62Var.o(bArr.length, bArr);
                        }
                        this.i = 0;
                        this.h = 3;
                    } else {
                        if (i3 != 3) {
                            throw new IllegalStateException();
                        }
                        int iMin = Math.min(umbVar.a(), this.j - this.i);
                        umbVar.h(this.i, u62Var.d, iMin);
                        int i4 = this.i + iMin;
                        this.i = i4;
                        if (i4 == this.j) {
                            u62Var.q(0);
                            if (u62Var.h()) {
                                if (this.m) {
                                }
                                this.h = 0;
                            } else {
                                this.m = true;
                                int i5 = u62Var.i(1);
                                int i6 = i5 == 1 ? u62Var.i(1) : 0;
                                this.n = i6;
                                if (i6 != 0) {
                                    throw ParserException.a(null, null);
                                }
                                if (i5 == 1) {
                                    u62Var.i((u62Var.i(2) + 1) * 8);
                                }
                                if (!u62Var.h()) {
                                    throw ParserException.a(null, null);
                                }
                                this.o = u62Var.i(6);
                                int i7 = u62Var.i(4);
                                int i8 = u62Var.i(3);
                                if (i7 != 0 || i8 != 0) {
                                    throw ParserException.a(null, null);
                                }
                                if (i5 == 0) {
                                    int iG = u62Var.g();
                                    int iB = u62Var.b();
                                    d dVarC = gt.c(u62Var, true);
                                    this.v = dVarC.c;
                                    this.s = dVarC.a;
                                    this.u = dVarC.b;
                                    int iB2 = iB - u62Var.b();
                                    u62Var.q(iG);
                                    byte[] bArr2 = new byte[(iB2 + 7) / 8];
                                    u62Var.j(iB2, bArr2);
                                    ff6 ff6Var = new ff6();
                                    ff6Var.a = this.f;
                                    ff6Var.l = xz9.n("video/mp2t");
                                    ff6Var.m = xz9.n("audio/mp4a-latm");
                                    ff6Var.j = this.v;
                                    ff6Var.E = this.u;
                                    ff6Var.F = this.s;
                                    ff6Var.p = Collections.singletonList(bArr2);
                                    ff6Var.d = this.a;
                                    ff6Var.f = this.b;
                                    hf6 hf6Var = new hf6(ff6Var);
                                    if (!hf6Var.equals(this.g)) {
                                        this.g = hf6Var;
                                        this.t = 1024000000 / hf6Var.G;
                                        this.e.d(hf6Var);
                                    }
                                } else {
                                    int iB3 = u62Var.b();
                                    d dVarC2 = gt.c(u62Var, true);
                                    this.v = dVarC2.c;
                                    this.s = dVarC2.a;
                                    this.u = dVarC2.b;
                                    u62Var.t(u62Var.i((u62Var.i(2) + 1) * 8) - (iB3 - u62Var.b()));
                                }
                                int i9 = u62Var.i(3);
                                this.p = i9;
                                if (i9 == 0) {
                                    u62Var.t(8);
                                } else if (i9 == 1) {
                                    u62Var.t(9);
                                } else if (i9 == 3 || i9 == 4 || i9 == 5) {
                                    u62Var.t(6);
                                } else {
                                    if (i9 != 6 && i9 != 7) {
                                        throw new IllegalStateException();
                                    }
                                    u62Var.t(1);
                                }
                                boolean zH2 = u62Var.h();
                                this.q = zH2;
                                this.r = 0L;
                                if (zH2) {
                                    if (i5 == 1) {
                                        this.r = u62Var.i((u62Var.i(2) + 1) * 8);
                                    } else {
                                        do {
                                            zH = u62Var.h();
                                            this.r = (this.r << 8) + u62Var.i(8);
                                        } while (zH);
                                    }
                                }
                                if (u62Var.h()) {
                                    u62Var.t(8);
                                }
                            }
                            if (this.n != 0) {
                                throw ParserException.a(null, null);
                            }
                            if (this.o != 0) {
                                throw ParserException.a(null, null);
                            }
                            if (this.p != 0) {
                                throw ParserException.a(null, null);
                            }
                            int i10 = 0;
                            do {
                                i = u62Var.i(8);
                                i10 += i;
                            } while (i == 255);
                            int iG2 = u62Var.g();
                            if ((iG2 & 7) == 0) {
                                umbVar2.J(iG2 >> 3);
                                i2 = 0;
                            } else {
                                u62Var.j(i10 * 8, umbVar2.a);
                                i2 = 0;
                                umbVar2.J(0);
                            }
                            this.e.b(umbVar2, i10, i2);
                            hsi.g(this.l != -9223372036854775807L);
                            this.e.a(this.l, 1, i10, 0, null);
                            this.l += this.t;
                            if (this.q) {
                                u62Var.t((int) this.r);
                            }
                            this.h = 0;
                        } else {
                            continue;
                        }
                    }
                } else {
                    int iX2 = umbVar.x();
                    if ((iX2 & 224) == 224) {
                        this.k = iX2;
                        this.h = 2;
                    } else if (iX2 != 86) {
                        this.h = 0;
                    }
                }
            } else if (umbVar.x() == 86) {
                this.h = 1;
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
        this.e = kp5Var.mo163B(mjgVar.e, 1);
        mjgVar.b();
        this.f = mjgVar.f;
    }
}
