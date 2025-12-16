package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.profile.screens.changeowner.ChangeOwnerScreen;

/* loaded from: classes2.dex */
public final class g92 extends dtf implements sm6 {
    public final /* synthetic */ ChangeOwnerScreen X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g92(Continuation continuation, ChangeOwnerScreen changeOwnerScreen) {
        super(2, continuation);
        this.X = changeOwnerScreen;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        g92 g92Var = (g92) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        g92Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        g92 g92Var = new g92(continuation, this.X);
        g92Var.o = obj;
        return g92Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        h92 h92Var = (h92) this.o;
        if (h92Var == null) {
            throw new NoWhenBranchMatchedException();
        }
        ccb ccbVar = new ccb(this.X);
        ccbVar.g(h92Var.a);
        ccbVar.e(new qcb(h92Var.b.intValue()));
        ccbVar.i();
        return qqg.a;
    }
}
