package defpackage;

import java.util.concurrent.atomic.AtomicReference;
import kotlinx.coroutines.internal.ContextScope;

/* loaded from: classes2.dex */
public final class fif {
    public final k18 a;
    public final k18 b;
    public final ContextScope c;
    public final tcf d;
    public final hbd e;
    public final AtomicReference f;
    public x9f g;

    public fif(k18 k18Var, k18 k18Var2, tef tefVar, lzf lzfVar) {
        this.a = k18Var;
        this.b = k18Var2;
        ContextScope contextScopeA = d7j.a(((q2b) lzfVar).b());
        this.c = contextScopeA;
        tcf tcfVarA = ucf.a(hd5.a);
        this.d = tcfVarA;
        this.e = new hbd(tcfVarA);
        this.f = new AtomicReference(0L);
        gw0.w(new g56(new uxb(s8j.a(tefVar.l), this, 19), new bif(this, null), 1), contextScopeA);
    }
}
