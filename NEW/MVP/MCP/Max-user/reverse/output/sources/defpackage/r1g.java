package defpackage;

import android.app.Activity;
import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import ru.ok.android.externcalls.analytics.internal.upload.MultiFileUploader;

/* loaded from: classes2.dex */
public final class r1g implements i7g {
    public static final /* synthetic */ int v0 = 0;
    public final ve2 X;
    public py4 Y;
    public v08 Z;
    public final Context a;
    public final z7c b;
    public final u7 c;
    public final c7c d;
    public final qv3 o;
    public q1g s0;
    public q1g t0;
    public q1g u0;

    public r1g(Context context, z7c z7cVar, u7 u7Var, c7c c7cVar, ve2 ve2Var, qv3 qv3Var) throws Exception {
        this.a = context;
        this.b = z7cVar;
        this.c = u7Var;
        this.d = c7cVar;
        this.X = ve2Var;
        this.o = qv3Var;
        q1g.b0 = this;
        c();
    }

    public final void a(String str, boolean z) {
        if (z) {
            this.t0 = null;
            this.b.c.i("app.theme", str);
            a93.s0.x(this.a).n(str);
        }
        this.s0 = null;
        tcf tcfVar = q1g.c0;
        tcfVar.setValue(null);
        this.d.a();
        this.o.e();
        this.X.C();
        q1g q1gVarC = c();
        this.s0 = q1gVarC;
        tcfVar.setValue(q1gVarC);
        Iterator it = this.c.a.iterator();
        while (it.hasNext()) {
            Activity activity = (Activity) ((WeakReference) it.next()).get();
            if (activity instanceof d6) {
                wqi.c("r1g", "changeTamTheme: call recreate for ".concat(activity.getClass().getName()), new Object[0]);
                d6 d6Var = (d6) activity;
                q1g q1gVar = this.s0;
                if (d6Var.M()) {
                    d6Var.M0 = q1gVar;
                    try {
                        d6.E(q1gVar, d6Var.z().c.f());
                    } catch (Exception unused) {
                        d6Var.recreate();
                    }
                } else {
                    d6Var.recreate();
                }
            }
        }
    }

    public final void b(boolean z) {
        v08 v08Var;
        if (this.b.c.g.getString("app.night.mode", "app.night.mode.system").equals("app.night.mode")) {
            return;
        }
        if (z || (v08Var = this.Z) == null || v08Var.e()) {
            String str = d().e;
            if (str.equals(c().e)) {
                return;
            }
            if (z) {
                v08 v08Var2 = this.Z;
                if (v08Var2 != null) {
                    if (!v08Var2.e()) {
                        v08 v08Var3 = this.Z;
                        v08Var3.getClass();
                        ty4.a(v08Var3);
                    }
                    this.Z = null;
                }
                wqi.c("r1g", "checkNightModeState: change theme to " + str, new Object[0]);
                a(str, false);
            } else {
                wqi.c("r1g", "changeThemeAfterNightModeCheck: schedule theme change after delay", new Object[0]);
                ssa ssaVarL = vqa.r(MultiFileUploader.UPLOAD_NEXT_INTERVAL, TimeUnit.MILLISECONDS, u0e.a()).l(de.a());
                v08 v08Var4 = new v08(new vef(21), new vef(22), new gk0(10, this));
                ssaVarL.a(v08Var4);
                this.Z = v08Var4;
            }
            if (z) {
                e();
            }
        }
    }

    public final q1g c() throws Exception {
        if (this.s0 == null) {
            q1g q1gVarD = d();
            this.s0 = q1gVarD;
            q1g.c0.setValue(q1gVarD);
        }
        return this.s0;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01e8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01b3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x017a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:4:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01b1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.q1g d() throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 550
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r1g.d():q1g");
    }

    public final void e() {
        long jD;
        py4 py4Var = this.Y;
        if (py4Var != null) {
            if (!py4Var.e()) {
                this.Y.dispose();
            }
            this.Y = null;
        }
        z7c z7cVar = this.b;
        sxg sxgVar = z7cVar.c;
        sxg sxgVar2 = z7cVar.c;
        if (sxgVar.g.getString("app.night.mode", "app.night.mode.system").equals("app.night.mode") || !sxgVar2.g.getString("app.night.mode", "app.night.mode.system").equals("app.night.mode.schedule")) {
            return;
        }
        mf4 mf4VarN = mf4.n(TimeZone.getDefault());
        n18 n18Var = sxgVar2.g;
        Integer numValueOf = Integer.valueOf(n18Var.getInt("app.night.mode.start.h", 23));
        Integer numValueOf2 = Integer.valueOf(n18Var.getInt("app.night.mode.start.m", 0));
        n18 n18Var2 = sxgVar2.g;
        Integer numValueOf3 = Integer.valueOf(n18Var2.getInt("app.night.mode.end.h", 8));
        Integer numValueOf4 = Integer.valueOf(n18Var2.getInt("app.night.mode.end.m", 0));
        mf4 mf4Var = new mf4(mf4VarN.a, mf4VarN.b, mf4VarN.c, numValueOf, numValueOf2, 0, 0);
        mf4 mf4Var2 = new mf4(mf4VarN.a, mf4VarN.b, mf4VarN.c, numValueOf3, numValueOf4, 0, 0);
        mf4 mf4VarP = mf4Var.compareTo(mf4VarN) < 0 ? mf4Var.p(1) : mf4Var;
        if (mf4Var2.compareTo(mf4VarN) < 0) {
            mf4Var2 = mf4Var2.p(1);
        }
        if (mf4VarP.compareTo(mf4Var2) >= 0) {
            mf4VarP = mf4Var2;
        }
        if (mf4VarN.r(1, 2, 3) && mf4VarP.r(1, 2, 3)) {
            mf4VarP.h();
            int iD = mf4VarP.d() - 2400001;
            mf4VarN.h();
            jD = (iD - (mf4VarN.d() - 2400001)) * 86400;
        } else {
            jD = 0;
        }
        long jO = (jD - mf4VarN.o()) + mf4VarP.o();
        wqi.c("r1g", "createScheduledJobsIfNeed: next time to check: " + mf4VarP.toString() + " delay: " + jO, new Object[0]);
        this.Y = de.a().c(new bee(20, this), jO, TimeUnit.SECONDS);
    }

    @Override // defpackage.i7g
    public final q1g f() {
        return c();
    }
}
