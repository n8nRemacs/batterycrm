package defpackage;

import java.util.concurrent.atomic.AtomicReference;
import kotlinx.coroutines.internal.ContextScope;

/* loaded from: classes2.dex */
public final class kif {
    public static final /* synthetic */ yy7[] j;
    public static final hif k;
    public final k18 a;
    public final k18 b;
    public final ContextScope c;
    public final tcf d;
    public final hbd e;
    public final tcf f;
    public final AtomicReference g;
    public x9f h;
    public final t9f i;

    static {
        z8a z8aVar = new z8a(kif.class, "searchJob", "getSearchJob()Lkotlinx/coroutines/Job;");
        vid.a.getClass();
        j = new yy7[]{z8aVar};
        k = new hif(3, null);
    }

    public kif(k18 k18Var, k18 k18Var2, lzf lzfVar) {
        this.a = k18Var;
        this.b = k18Var2;
        ContextScope contextScopeA = d7j.a(((q2b) lzfVar).b());
        this.c = contextScopeA;
        tcf tcfVarA = ucf.a(k);
        this.d = tcfVarA;
        this.e = new hbd(tcfVarA);
        tcf tcfVarA2 = ucf.a(null);
        this.f = tcfVarA2;
        this.g = new AtomicReference(new gif((String) null, 3));
        this.i = c7j.c();
        gw0.w(new g56(gw0.k(new d53(tcfVarA2, 8), 200L), new bzb(2, this, kif.class, "searchSetsByQuery", "searchSetsByQuery(Ljava/lang/String;)V", 4, 19), 1), contextScopeA);
    }

    public final boolean a() {
        String str = ((gif) this.g.get()).b;
        return !(str == null || str.length() == 0);
    }
}
