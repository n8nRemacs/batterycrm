package defpackage;

import android.os.Build;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.ContextScope;

/* loaded from: classes2.dex */
public final class msb {
    public final k18 a;
    public final k18 b;
    public final k18 c;
    public final psb d;
    public final psb e;
    public final psb f;
    public final psb g;
    public final psb h;
    public final psb i;
    public final psb j;
    public final tl6 k;

    public msb(k18 k18Var, k18 k18Var2, k18 k18Var3, lzf lzfVar) {
        this.a = k18Var;
        this.b = k18Var2;
        this.c = k18Var3;
        ContextScope contextScopeA = d7j.a(((q2b) lzfVar).b());
        psb psbVar = new psb(qsb.l);
        this.d = psbVar;
        psb psbVar2 = new psb(qsb.f);
        this.e = psbVar2;
        psb psbVar3 = new psb(qsb.n);
        this.f = psbVar3;
        psb psbVar4 = new psb(new String[]{"android.permission.READ_MEDIA_VISUAL_USER_SELECTED"});
        this.g = psbVar4;
        psb psbVar5 = new psb(qsb.m);
        this.h = psbVar5;
        psb psbVar6 = new psb(qsb.h);
        this.i = psbVar6;
        psb psbVar7 = new psb(qsb.k);
        this.j = psbVar7;
        int i = Build.VERSION.SDK_INT;
        Continuation continuation = null;
        tl6 tl6Var = i >= 29 ? new tl6(qsb.p) : null;
        this.k = tl6Var;
        if (i >= 33) {
            gw0.w(new g56(psbVar, new fsb(this, null), 1), contextScopeA);
        }
        gw0.w(new g56(psbVar2, new gsb(this, null), 1), contextScopeA);
        if (tl6Var != null) {
            gw0.w(new g56(tl6Var, new hsb(this, null), 1), contextScopeA);
        }
        if (i >= 34) {
            gw0.w(new z41(psbVar3, psbVar4, new s3(this, continuation, 20), 3), contextScopeA);
        } else {
            gw0.w(new g56(psbVar3, new isb(this, null), 1), contextScopeA);
        }
        gw0.w(new g56(psbVar5, new jsb(this, null), 1), contextScopeA);
        gw0.w(new g56(psbVar6, new ksb(this, null), 1), contextScopeA);
        gw0.w(new g56(psbVar7, new lsb(this, null), 1), contextScopeA);
    }

    public static final void a(msb msbVar, String str, String str2) {
        Integer numD = ((gda) msbVar.c.getValue()).d();
        if (numD != null) {
            nn8 nn8Var = new nn8();
            nn8Var.put("pType", str);
            nn8Var.put("screen", numD);
            nn8Var.put("pStatus", str2);
            msbVar.c("permission_changed_state", nn8Var.b());
        }
    }

    public static String b(psb psbVar) {
        return psbVar.l() ? "allowed" : "denied";
    }

    public final void c(String str, nn8 nn8Var) {
        xp7 xp7Var = new xp7();
        xp7Var.c = "PERMISSION";
        k18 k18Var = this.b;
        xp7Var.b = ((w4e) ((pb3) k18Var.getValue())).s();
        xp7Var.d = str;
        xp7Var.a = System.currentTimeMillis();
        xp7Var.c(nn8Var);
        xp7Var.o = ((pe8) ((pb3) k18Var.getValue())).K();
        ((dd) this.a.getValue()).h(xp7Var.d());
    }
}
