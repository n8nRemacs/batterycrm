package defpackage;

import java.util.concurrent.atomic.AtomicReference;
import kotlinx.coroutines.internal.ContextScope;

/* loaded from: classes2.dex */
public final class e4c {
    public static final /* synthetic */ yy7[] j;
    public final l7a a;
    public final v40 b;
    public final k18 c;
    public final ContextScope d;
    public final mcf g;
    public final t9f e = c7j.c();
    public final tcf f = ucf.a(null);
    public final t9f h = new t9f(27, this);
    public final AtomicReference i = new AtomicReference(null);

    static {
        z8a z8aVar = new z8a(e4c.class, "updatePlayerJob", "getUpdatePlayerJob()Lkotlinx/coroutines/Job;");
        vid.a.getClass();
        j = new yy7[]{z8aVar};
    }

    public e4c(lzf lzfVar, k18 k18Var, l7a l7aVar, v40 v40Var) {
        this.a = l7aVar;
        this.b = v40Var;
        this.c = k18Var;
        this.d = d7j.a(((q2b) lzfVar).a());
        this.g = ((b8a) l7aVar).R0;
    }

    public final void a() {
        x9f x9fVarE = svi.e(this.d, null, null, new c4c(this, null), 3);
        this.e.O(this, j[0], x9fVarE);
    }
}
