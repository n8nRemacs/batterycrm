package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.os.Looper;

/* loaded from: classes.dex */
public final class cf7 implements brf {
    public final /* synthetic */ int a = 1;
    public final df7 b;
    public final Object c;
    public final Object d;

    public cf7(Context context, te8 te8Var) {
        gf7 gf7VarG = gf7.g();
        this.c = context;
        df7 df7VarF = gf7VarG.f();
        this.b = df7VarF;
        vl3 vl3Var = (vl3) te8Var.b;
        if (vl3Var != null) {
            this.d = vl3Var;
        } else {
            this.d = new vl3();
        }
        vl3 vl3Var2 = (vl3) this.d;
        Resources resources = context.getResources();
        fs4 fs4VarE = fs4.e();
        fk4 fk4VarA = gf7VarG.a();
        gf7VarG.b.w.getClass();
        if (hqg.b == null) {
            hqg.b = new hqg(new Handler(Looper.getMainLooper()));
        }
        hqg hqgVar = hqg.b;
        jf9 jf9Var = df7VarF.f;
        sz szVar = (sz) te8Var.a;
        brf brfVar = (brf) te8Var.c;
        vl3Var2.a = resources;
        vl3Var2.b = fs4VarE;
        vl3Var2.c = fk4VarA;
        vl3Var2.d = hqgVar;
        vl3Var2.o = jf9Var;
        vl3Var2.X = szVar;
        vl3Var2.Y = brfVar;
    }

    public c2c a() {
        return new c2c((Context) this.c, (vl3) this.d, this.b);
    }

    @Override // defpackage.brf
    public final Object get() {
        switch (this.a) {
            case 0:
                return this.b.a((rf7) this.c, this.d, qf7.FULL_FETCH, null, null);
            default:
                return a();
        }
    }

    public String toString() {
        switch (this.a) {
            case 0:
                hc8 hc8VarC = yyi.c(this);
                hc8VarC.r(((rf7) this.c).b, "uri");
                return hc8VarC.toString();
            default:
                return super.toString();
        }
    }

    public cf7(df7 df7Var, rf7 rf7Var, Object obj) {
        this.b = df7Var;
        this.c = rf7Var;
        this.d = obj;
    }
}
