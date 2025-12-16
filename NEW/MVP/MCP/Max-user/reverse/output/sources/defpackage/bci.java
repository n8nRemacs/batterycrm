package defpackage;

import android.content.Context;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class bci extends sv6 implements k3g {
    public static final xo8 k = new xo8("ClientTelemetry.API", new pai(2), new qha(13));
    public static final xo8 l = new xo8("ModuleInstall.API", new pai(3), new qha(13));
    public static final xo8 m = new xo8("LocationServices.API", new pai(5), new qha(13));
    public static final xo8 n = new xo8("SmsRetriever.API", new pai(4), new qha(13));
    public static int o = 1;

    public ybj c(bjb... bjbVarArr) {
        s5j.a("Please provide at least one OptionalModuleApi.", bjbVarArr.length > 0);
        for (bjb bjbVar : bjbVarArr) {
            s5j.h(bjbVar, "Requested API must not be null.");
        }
        bm bmVarB = bm.b(Arrays.asList(bjbVarArr), false);
        if (bmVarB.a.isEmpty()) {
            return n5e.f(new z1a(true, 0));
        }
        rs0 rs0VarE = mg7.e();
        rs0VarE.e = new qt5[]{koi.a};
        rs0VarE.b = 27301;
        rs0VarE.c = false;
        rs0VarE.d = new n4e(this, bmVarB);
        return b(0, rs0VarE.e());
    }

    public ybj d(j3g j3gVar) {
        rs0 rs0VarE = mg7.e();
        rs0VarE.e = new qt5[]{ioi.a};
        rs0VarE.c = false;
        rs0VarE.d = new zid(j3gVar);
        return b(2, rs0VarE.e());
    }

    public synchronized int e() {
        try {
            if (o == 1) {
                Context context = this.a;
                tv6 tv6Var = tv6.d;
                int iC = tv6Var.c(context, 12451000);
                if (iC == 0) {
                    o = 4;
                } else if (tv6Var.b(context, null, iC) != null || d85.a(context, "com.google.android.gms.auth.api.fallback") == 0) {
                    o = 2;
                } else {
                    o = 3;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return o;
    }
}
