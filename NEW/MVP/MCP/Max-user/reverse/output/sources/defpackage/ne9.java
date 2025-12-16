package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.ContextScope;

/* loaded from: classes2.dex */
public final class ne9 extends dtf implements sm6 {
    public final /* synthetic */ s5i X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ne9(s5i s5iVar, Continuation continuation) {
        super(2, continuation);
        this.X = s5iVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        ne9 ne9Var = (ne9) l((dc9) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        ne9Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        ne9 ne9Var = new ne9(this.X, continuation);
        ne9Var.o = obj;
        return ne9Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        if (!fni.a((dc9) this.o, dc9.a)) {
            throw new NoWhenBranchMatchedException();
        }
        s5i s5iVar = this.X;
        if (((AtomicBoolean) s5iVar.g).compareAndSet(false, true)) {
            svi.e((ContextScope) s5iVar.f, null, null, new ve9(s5iVar, null), 3);
        }
        return qqg.a;
    }
}
