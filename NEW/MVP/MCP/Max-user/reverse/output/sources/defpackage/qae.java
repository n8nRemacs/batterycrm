package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public final class qae {
    public final /* synthetic */ int a;
    public final List b;
    public final sfg[] c;
    public final a9 d;

    public qae(int i, List list) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = list;
                this.c = new sfg[list.size()];
                a9 a9Var = new a9(new ehg(10, this));
                this.d = a9Var;
                a9Var.F(3);
                break;
            default:
                this.b = list;
                this.c = new sfg[list.size()];
                this.d = new a9(new u4e(1, this));
                break;
        }
    }

    public void a(long j, umb umbVar) {
        if (umbVar.a() < 9) {
            return;
        }
        int iJ = umbVar.j();
        int iJ2 = umbVar.j();
        int iX = umbVar.x();
        if (iJ == 434 && iJ2 == 1195456820 && iX == 3) {
            this.d.i(j, umbVar);
        }
    }

    public final void b(kp5 kp5Var, mjg mjgVar) {
        switch (this.a) {
            case 0:
                int i = 0;
                while (true) {
                    sfg[] sfgVarArr = this.c;
                    if (i >= sfgVarArr.length) {
                        break;
                    } else {
                        mjgVar.a();
                        mjgVar.b();
                        sfg sfgVarMo163B = kp5Var.mo163B(mjgVar.e, 3);
                        hf6 hf6Var = (hf6) this.b.get(i);
                        String str = hf6Var.n;
                        hsi.a("Invalid closed caption MIME type provided: " + str, "application/cea-608".equals(str) || "application/cea-708".equals(str));
                        String str2 = hf6Var.a;
                        if (str2 == null) {
                            mjgVar.b();
                            str2 = mjgVar.f;
                        }
                        ff6 ff6Var = new ff6();
                        ff6Var.a = str2;
                        ff6Var.l = xz9.n("video/mp2t");
                        ff6Var.m = xz9.n(str);
                        ff6Var.e = hf6Var.e;
                        ff6Var.d = hf6Var.d;
                        ff6Var.J = hf6Var.K;
                        ff6Var.p = hf6Var.q;
                        a9h.m(ff6Var, sfgVarMo163B);
                        sfgVarArr[i] = sfgVarMo163B;
                        i++;
                    }
                }
                break;
            default:
                int i2 = 0;
                while (true) {
                    sfg[] sfgVarArr2 = this.c;
                    if (i2 >= sfgVarArr2.length) {
                        break;
                    } else {
                        mjgVar.a();
                        mjgVar.b();
                        sfg sfgVarMo163B2 = kp5Var.mo163B(mjgVar.e, 3);
                        hf6 hf6Var2 = (hf6) this.b.get(i2);
                        String str3 = hf6Var2.n;
                        hsi.a("Invalid closed caption MIME type provided: " + str3, "application/cea-608".equals(str3) || "application/cea-708".equals(str3));
                        ff6 ff6Var2 = new ff6();
                        mjgVar.b();
                        ff6Var2.a = mjgVar.f;
                        ff6Var2.l = xz9.n("video/mp2t");
                        ff6Var2.m = xz9.n(str3);
                        ff6Var2.e = hf6Var2.e;
                        ff6Var2.d = hf6Var2.d;
                        ff6Var2.J = hf6Var2.K;
                        ff6Var2.p = hf6Var2.q;
                        a9h.m(ff6Var2, sfgVarMo163B2);
                        sfgVarArr2[i2] = sfgVarMo163B2;
                        i2++;
                    }
                }
                break;
        }
    }
}
