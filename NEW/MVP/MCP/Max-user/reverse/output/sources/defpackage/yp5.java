package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.PointF;
import android.view.WindowManager;

/* loaded from: classes.dex */
public final class yp5 implements lq5 {
    public static final /* synthetic */ yy7[] i;
    public final k18 a;
    public final k18 b;
    public final k18 c;
    public final k18 d;
    public final k18 e;
    public qj1 g;
    public final Object f = ipi.b(3, new vp5(this, 0));
    public final t9f h = c7j.c();

    static {
        z8a z8aVar = new z8a(yp5.class, "pipStateJob", "getPipStateJob()Lkotlinx/coroutines/Job;");
        vid.a.getClass();
        i = new yy7[]{z8aVar};
    }

    public yp5(k18 k18Var, k18 k18Var2, k18 k18Var3, k18 k18Var4, k18 k18Var5) {
        this.a = k18Var3;
        this.b = k18Var4;
        this.c = k18Var;
        this.d = k18Var2;
        this.e = k18Var5;
    }

    public final qj1 a(Activity activity, ytd ytdVar) {
        qj1 qj1Var = new qj1(activity);
        qj1Var.setPipTheme(a93.s0.B(qj1Var).c);
        qj1Var.setPipMode(nj1.c);
        qj1Var.setApplicationPipDepended(new ka5(this, qj1Var, activity));
        qj1Var.setListener(new wp5(ytdVar));
        qj1Var.setVideoLayoutUpdatesControllerProvider(new vp5(this, 1));
        return qj1Var;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    public final r1c b() {
        return (r1c) this.f.getValue();
    }

    public final void c() {
        wqi.c("FakePipController", "try to hide local pip", new Object[0]);
        qj1 qj1Var = this.g;
        if (qj1Var == null) {
            return;
        }
        if (!hqi.j(qj1Var)) {
            wqi.c("FakePipController", "local pip in hidden progress", new Object[0]);
            return;
        }
        cef cefVar = (cef) this.a.getValue();
        String str = ((hw1) ((tv1) this.e.getValue())).l().c;
        tcf tcfVar = cefVar.a;
        if (tcfVar.getValue() == bef.b) {
            cefVar.a(str, false);
        }
        tcfVar.m(null, bef.a);
        hqi.f(qj1Var, false, 50L, new ia(this, 15, qj1Var));
    }

    public final void d(Activity activity, ytd ytdVar) {
        Context context;
        wqi.c("FakePipController", "start preparing local pip", new Object[0]);
        try {
            if (this.g != null) {
                wqi.c("FakePipController", "local pip already prepared", new Object[0]);
                return;
            }
            qj1 qj1VarA = a(activity, ytdVar);
            this.g = qj1VarA;
            qj1VarA.setAlpha(0.0f);
            qj1VarA.d((xib) b().o.a.getValue());
            qj1 qj1Var = this.g;
            WindowManager windowManagerB = (qj1Var == null || (context = qj1Var.getContext()) == null) ? null : e6j.b(context);
            if (windowManagerB != null) {
                WindowManager.LayoutParams windowsViewLayoutParams = qj1VarA.getWindowsViewLayoutParams();
                PointF pointF = ((mc1) ((lc1) this.b.getValue())).b;
                PointF pointF2 = new PointF(pointF.x, pointF.y);
                windowsViewLayoutParams.x = (int) pointF2.x;
                windowsViewLayoutParams.y = (int) pointF2.y;
                windowManagerB.addView(qj1VarA, windowsViewLayoutParams);
            }
            b().c = qj1VarA;
            this.h.O(this, i[0], svi.e((sv1) this.c.getValue(), ((q2b) ((lzf) this.d.getValue())).c(), null, new xp5(this, null), 2));
        } catch (IllegalArgumentException e) {
            wqi.e("FakePipController", "can't prepare local pip", e);
        }
    }
}
