package defpackage;

import android.text.TextUtils;

/* loaded from: classes2.dex */
public final class g0g {
    public final k18 a;
    public final k18 b;
    public final k18 c;
    public final k18 d;
    public final k18 e;
    public final k18 f;

    public g0g(k18 k18Var, k18 k18Var2, k18 k18Var3, k18 k18Var4, k18 k18Var5, k18 k18Var6) {
        this.a = k18Var;
        this.b = k18Var2;
        this.c = k18Var3;
        this.d = k18Var4;
        this.e = k18Var5;
        this.f = k18Var6;
    }

    public final tqc a() {
        return (tqc) this.c.getValue();
    }

    public final void b(String str, String str2, String str3, String str4) {
        a().f(false, !((lr3) r0.a.getValue()).c());
        ((dd) this.b.getValue()).e("ACTION_DEEP_LINK_PUSH_RECEIVE");
        ((hwa) this.d.getValue()).v(str);
        fi4 fi4Var = (fi4) this.a.getValue();
        x7b x7bVar = (x7b) fi4Var.b.getValue();
        ((lk4) fi4Var.c.getValue()).getClass();
        nla nlaVarH = x7bVar.h("ru.oneme.app.misc", true, false);
        if (!TextUtils.isEmpty(str3)) {
            nlaVarH.e = nla.c(str3);
        }
        if (!TextUtils.isEmpty(str2)) {
            nlaVarH.d(str2);
            lla llaVar = new lla(0);
            llaVar.f = nla.c(str2);
            nlaVarH.i(llaVar);
        }
        if (TextUtils.isEmpty(str4)) {
            return;
        }
        nlaVarH.g(ed0.a(fi4Var.a, (f7b) fi4Var.d.getValue(), (ve2) fi4Var.e.getValue(), (zd0) fi4Var.f.getValue(), null, str4, ((w4e) ((pb3) fi4Var.g.getValue())).n(), (j0e) fi4Var.h.getValue()));
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(long r18, long r20, java.lang.String r22, java.lang.String r23, java.lang.String r24, boolean r25) {
        /*
            Method dump skipped, instructions count: 412
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g0g.c(long, long, java.lang.String, java.lang.String, java.lang.String, boolean):void");
    }

    public final void d() {
        a().f(false, !((lr3) r0.a.getValue()).c());
    }
}
