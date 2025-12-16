package defpackage;

import android.os.Build;
import java.util.ArrayList;
import java.util.Collection;
import kotlinx.coroutines.internal.ContextScope;
import ru.ok.tamtam.android.prefs.PmsKey;

/* loaded from: classes2.dex */
public final class mu8 extends xfh {
    public static final /* synthetic */ yy7[] J0 = {new z8a(mu8.class, "fillByEditMessagesAttachmentsJob", "getFillByEditMessagesAttachmentsJob()Lkotlinx/coroutines/Job;"), u45.h(vid.a, mu8.class, "finalActionJob", "getFinalActionJob()Lkotlinx/coroutines/Job;")};
    public final psb A0;
    public final hbd B0;
    public final z41 C0;
    public final zn1 D0;
    public final hbd E0;
    public final hbd F0;
    public final hbd G0;
    public final t9f H0;
    public final t9f I0;
    public final k18 X;
    public final k18 Y;
    public final tcf Z;
    public final eu2 b;
    public final k18 c;
    public final k18 d;
    public final k18 o;
    public final tcf s0;
    public final hbd t0;
    public final pv0 u0;
    public volatile ArrayList v0;
    public final s7c w0;
    public final ci5 x0;
    public final tcf y0;
    public final psb z0;

    public mu8(k18 k18Var, k18 k18Var2, k18 k18Var3, k18 k18Var4, k18 k18Var5, eu2 eu2Var) {
        this.b = eu2Var;
        this.c = k18Var;
        this.d = k18Var2;
        this.o = k18Var3;
        this.X = k18Var4;
        this.Y = k18Var5;
        Boolean bool = Boolean.FALSE;
        tcf tcfVarA = ucf.a(bool);
        this.Z = tcfVarA;
        this.s0 = ucf.a(l00.a);
        this.t0 = new hbd(tcfVarA);
        this.u0 = gzi.a(-2, 0, 6);
        this.w0 = new s7c(17);
        this.x0 = new ci5(0);
        tcf tcfVarA2 = ucf.a(hd5.a);
        this.y0 = tcfVarA2;
        String[] strArr = qsb.n;
        psb psbVar = new psb(strArr);
        this.z0 = psbVar;
        psb psbVar2 = new psb(Build.VERSION.SDK_INT >= 34 ? new String[]{"android.permission.READ_MEDIA_VISUAL_USER_SELECTED"} : strArr);
        this.A0 = psbVar2;
        z41 z41Var = new z41(psbVar, psbVar2, new gu8(3, null, 0), 3);
        ContextScope contextScope = this.a;
        lcj lcjVar = yve.a;
        hbd hbdVarC = gw0.C(z41Var, contextScope, lcjVar, d9c.a);
        this.B0 = hbdVarC;
        this.C0 = new z41(psbVar, psbVar2, new gu8(3, null, 1), 3);
        this.D0 = new zn1(hbdVarC, 5);
        this.E0 = gw0.C(new yh0(tcfVarA2, 6), this.a, lcjVar, bool);
        yh0 yh0Var = new yh0(tcfVarA2, 7);
        tcf tcfVar = xz7.f;
        this.F0 = gw0.C(new z41(yh0Var, tcfVar, new m31(3, null, 1), 3), this.a, lcjVar, bool);
        this.G0 = gw0.C(new y83(new z41(tcfVar, tcfVarA2, eu8.Z, 3), 17, this), this.a, lcjVar, ade.b);
        this.H0 = c7j.c();
        this.I0 = c7j.c();
        xfh.o(this, null, new fu8(this, null), 3);
    }

    public static final sd8 t(mu8 mu8Var) {
        return (sd8) mu8Var.d.getValue();
    }

    public final dce u() {
        return (dce) this.o.getValue();
    }

    public final boolean v() {
        return this.b.invoke() != null;
    }

    public final void w(boolean z) {
        pv0 pv0Var = this.u0;
        if (!z) {
            int i = xz7.a;
            if (xz7.b(xz7.c)) {
                pv0Var.g(at8.a);
                return;
            }
        }
        Long l = (Long) this.b.invoke();
        yy7[] yy7VarArr = J0;
        t9f t9fVar = this.I0;
        if (l == null) {
            t9fVar.O(this, yy7VarArr[1], xfh.o(this, null, new hu8(this, null), 1));
            xfh.r(this.x0, wt8.a);
            return;
        }
        long jLongValue = l.longValue();
        l5c l5cVar = (l5c) ((age) this.Y.getValue());
        l5cVar.getClass();
        int iM = (int) l5cVar.m(PmsKey.f78maxattachcount, 12);
        if (u().b() > iM) {
            pv0Var.g(new ht8(iM));
            return;
        }
        t9fVar.O(this, yy7VarArr[1], svi.d(this.a, ((q2b) ((lzf) this.X.getValue())).b(), i84.b, new cu8(this, jLongValue, null)));
    }

    public final boolean x() {
        if ((((Collection) this.y0.getValue()).isEmpty() || v()) && (this.v0 == null || fni.a(this.y0.getValue(), this.v0))) {
            return true;
        }
        this.u0.g(dt8.a);
        return false;
    }
}
