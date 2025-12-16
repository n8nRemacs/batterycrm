package defpackage;

import android.content.Context;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public final class qf0 {
    public static final /* synthetic */ yy7[] i;
    public final Context a;
    public final k18 b;
    public final k18 c;
    public final k18 d;
    public final ConcurrentHashMap e;
    public final jve f;
    public final gbd g;
    public final t9f h;

    static {
        z8a z8aVar = new z8a(qf0.class, "warmUpJob", "getWarmUpJob()Lkotlinx/coroutines/Job;");
        vid.a.getClass();
        i = new yy7[]{z8aVar};
    }

    public qf0(Context context, k18 k18Var, k18 k18Var2, k18 k18Var3) {
        this.a = context;
        this.b = k18Var;
        this.c = k18Var2;
        this.d = k18Var3;
        this.e = new ConcurrentHashMap(((afb) a93.s0.x(context).c).b.values().size() * 2);
        jve jveVarB = kve.b(0, 0, 7);
        this.f = jveVarB;
        this.g = new gbd(jveVarB);
        this.h = c7j.c();
    }
}
