package defpackage;

import android.util.Log;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class n75 implements aa5, ba5 {
    public final /* synthetic */ int a;
    public final Object b;
    public boolean c;
    public int d;
    public int e;
    public long f;
    public Object g;

    public n75(int i, List list) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = list;
                this.g = new sfg[list.size()];
                this.f = -9223372036854775807L;
                break;
            default:
                this.b = list;
                this.g = new rfg[list.size()];
                this.f = -9223372036854775807L;
                break;
        }
    }

    @Override // defpackage.aa5
    public final void a() {
        switch (this.a) {
            case 0:
                this.c = false;
                this.f = -9223372036854775807L;
                break;
            case 1:
                this.c = false;
                this.f = -9223372036854775807L;
                break;
            case 2:
                this.c = false;
                this.f = -9223372036854775807L;
                break;
            default:
                this.c = false;
                this.f = -9223372036854775807L;
                break;
        }
    }

    @Override // defpackage.aa5
    public void d(qyg qygVar) {
        boolean z;
        boolean z2;
        switch (this.a) {
            case 0:
                if (this.c) {
                    if (this.d == 2) {
                        if (qygVar.c() == 0) {
                            z2 = false;
                        } else {
                            if (qygVar.s() != 32) {
                                this.c = false;
                            }
                            this.d--;
                            z2 = this.c;
                        }
                        if (!z2) {
                        }
                    }
                    if (this.d == 1) {
                        if (qygVar.c() == 0) {
                            z = false;
                        } else {
                            if (qygVar.s() != 0) {
                                this.c = false;
                            }
                            this.d--;
                            z = this.c;
                        }
                        if (!z) {
                        }
                    }
                    int i = qygVar.b;
                    int iC = qygVar.c();
                    for (rfg rfgVar : (rfg[]) this.g) {
                        qygVar.E(i);
                        rfgVar.c(iC, qygVar);
                    }
                    this.e += iC;
                    break;
                }
                break;
            default:
                qyg qygVar2 = (qyg) this.b;
                fsi.e((rfg) this.g);
                if (this.c) {
                    int iC2 = qygVar.c();
                    int i2 = this.e;
                    if (i2 < 10) {
                        int iMin = Math.min(iC2, 10 - i2);
                        System.arraycopy(qygVar.a, qygVar.b, qygVar2.a, this.e, iMin);
                        if (this.e + iMin == 10) {
                            qygVar2.E(0);
                            if (73 != qygVar2.s() || 68 != qygVar2.s() || 51 != qygVar2.s()) {
                                Log.w("Id3Reader", "Discarding invalid ID3 tag");
                                this.c = false;
                                break;
                            } else {
                                qygVar2.F(3);
                                this.d = qygVar2.r() + 10;
                            }
                        }
                    }
                    int iMin2 = Math.min(iC2, this.d - this.e);
                    ((rfg) this.g).c(iMin2, qygVar);
                    this.e += iMin2;
                    break;
                }
                break;
        }
    }

    @Override // defpackage.aa5
    public final void e(int i, long j) {
        switch (this.a) {
            case 0:
                if ((i & 4) != 0) {
                    this.c = true;
                    if (j != -9223372036854775807L) {
                        this.f = j;
                    }
                    this.e = 0;
                    this.d = 2;
                    break;
                }
                break;
            case 1:
                if ((i & 4) != 0) {
                    this.c = true;
                    this.f = j;
                    this.e = 0;
                    this.d = 2;
                    break;
                }
                break;
            case 2:
                if ((i & 4) != 0) {
                    this.c = true;
                    if (j != -9223372036854775807L) {
                        this.f = j;
                    }
                    this.d = 0;
                    this.e = 0;
                    break;
                }
                break;
            default:
                if ((i & 4) != 0) {
                    this.c = true;
                    this.f = j;
                    this.d = 0;
                    this.e = 0;
                    break;
                }
                break;
        }
    }

    @Override // defpackage.ba5
    public void f(umb umbVar) {
        boolean z;
        boolean z2;
        switch (this.a) {
            case 1:
                if (this.c) {
                    if (this.d == 2) {
                        if (umbVar.a() == 0) {
                            z2 = false;
                        } else {
                            if (umbVar.x() != 32) {
                                this.c = false;
                            }
                            this.d--;
                            z2 = this.c;
                        }
                        if (!z2) {
                        }
                    }
                    if (this.d == 1) {
                        if (umbVar.a() == 0) {
                            z = false;
                        } else {
                            if (umbVar.x() != 0) {
                                this.c = false;
                            }
                            this.d--;
                            z = this.c;
                        }
                        if (!z) {
                        }
                    }
                    int i = umbVar.b;
                    int iA = umbVar.a();
                    for (sfg sfgVar : (sfg[]) this.g) {
                        umbVar.J(i);
                        sfgVar.b(umbVar, iA, 0);
                    }
                    this.e += iA;
                    break;
                }
                break;
            default:
                umb umbVar2 = (umb) this.b;
                hsi.h((sfg) this.g);
                if (this.c) {
                    int iA2 = umbVar.a();
                    int i2 = this.e;
                    if (i2 < 10) {
                        int iMin = Math.min(iA2, 10 - i2);
                        System.arraycopy(umbVar.a, umbVar.b, umbVar2.a, this.e, iMin);
                        if (this.e + iMin == 10) {
                            umbVar2.J(0);
                            if (73 != umbVar2.x() || 68 != umbVar2.x() || 51 != umbVar2.x()) {
                                a8i.l("Id3Reader", "Discarding invalid ID3 tag");
                                this.c = false;
                                break;
                            } else {
                                umbVar2.K(3);
                                this.d = umbVar2.w() + 10;
                            }
                        }
                    }
                    int iMin2 = Math.min(iA2, this.d - this.e);
                    ((sfg) this.g).b(umbVar, iMin2, 0);
                    this.e += iMin2;
                    break;
                }
                break;
        }
    }

    @Override // defpackage.aa5
    public void g() {
        int i;
        switch (this.a) {
            case 0:
                if (this.c) {
                    if (this.f != -9223372036854775807L) {
                        for (rfg rfgVar : (rfg[]) this.g) {
                            rfgVar.b(this.f, 1, this.e, 0, null);
                        }
                    }
                    this.c = false;
                    break;
                }
                break;
            default:
                fsi.e((rfg) this.g);
                if (this.c && (i = this.d) != 0 && this.e == i) {
                    long j = this.f;
                    if (j != -9223372036854775807L) {
                        ((rfg) this.g).b(j, 1, i, 0, null);
                    }
                    this.c = false;
                    break;
                }
                break;
        }
    }

    @Override // defpackage.ba5
    public void h(boolean z) {
        int i;
        switch (this.a) {
            case 1:
                if (this.c) {
                    hsi.g(this.f != -9223372036854775807L);
                    for (sfg sfgVar : (sfg[]) this.g) {
                        sfgVar.a(this.f, 1, this.e, 0, null);
                    }
                    this.c = false;
                    break;
                }
                break;
            default:
                hsi.h((sfg) this.g);
                if (this.c && (i = this.d) != 0 && this.e == i) {
                    hsi.g(this.f != -9223372036854775807L);
                    ((sfg) this.g).a(this.f, 1, this.d, 0, null);
                    this.c = false;
                    break;
                }
                break;
        }
    }

    @Override // defpackage.ba5
    public void i(kp5 kp5Var, mjg mjgVar) {
        switch (this.a) {
            case 1:
                sfg[] sfgVarArr = (sfg[]) this.g;
                for (int i = 0; i < sfgVarArr.length; i++) {
                    ljg ljgVar = (ljg) ((List) this.b).get(i);
                    mjgVar.a();
                    mjgVar.b();
                    sfg sfgVarMo163B = kp5Var.mo163B(mjgVar.e, 3);
                    ff6 ff6Var = new ff6();
                    mjgVar.b();
                    ff6Var.a = mjgVar.f;
                    ff6Var.l = xz9.n("video/mp2t");
                    ff6Var.m = xz9.n("application/dvbsubs");
                    ff6Var.p = Collections.singletonList(ljgVar.b);
                    ff6Var.d = ljgVar.a;
                    a9h.m(ff6Var, sfgVarMo163B);
                    sfgVarArr[i] = sfgVarMo163B;
                }
                break;
            default:
                mjgVar.a();
                mjgVar.b();
                sfg sfgVarMo163B2 = kp5Var.mo163B(mjgVar.e, 5);
                this.g = sfgVarMo163B2;
                ff6 ff6Var2 = new ff6();
                mjgVar.b();
                ff6Var2.a = mjgVar.f;
                ff6Var2.l = xz9.n("video/mp2t");
                ff6Var2.m = xz9.n("application/id3");
                a9h.m(ff6Var2, sfgVarMo163B2);
                break;
        }
    }

    @Override // defpackage.aa5
    public void j(jp5 jp5Var, mjg mjgVar) {
        switch (this.a) {
            case 0:
                rfg[] rfgVarArr = (rfg[]) this.g;
                for (int i = 0; i < rfgVarArr.length; i++) {
                    kjg kjgVar = (kjg) ((List) this.b).get(i);
                    mjgVar.a();
                    mjgVar.b();
                    rfg rfgVarB = jp5Var.B(mjgVar.e, 3);
                    ef6 ef6Var = new ef6();
                    mjgVar.b();
                    ef6Var.a = mjgVar.f;
                    ef6Var.k = "application/dvbsubs";
                    ef6Var.m = Collections.singletonList(kjgVar.b);
                    ef6Var.c = kjgVar.a;
                    rfgVarB.d(new gf6(ef6Var));
                    rfgVarArr[i] = rfgVarB;
                }
                break;
            default:
                mjgVar.a();
                mjgVar.b();
                rfg rfgVarB2 = jp5Var.B(mjgVar.e, 5);
                this.g = rfgVarB2;
                ef6 ef6Var2 = new ef6();
                mjgVar.b();
                ef6Var2.a = mjgVar.f;
                ef6Var2.k = "application/id3";
                rfgVarB2.d(new gf6(ef6Var2));
                break;
        }
    }

    public n75(int i) {
        this.a = i;
        switch (i) {
            case 3:
                this.b = new umb(10);
                this.f = -9223372036854775807L;
                break;
            default:
                this.b = new qyg(10);
                this.f = -9223372036854775807L;
                break;
        }
    }
}
