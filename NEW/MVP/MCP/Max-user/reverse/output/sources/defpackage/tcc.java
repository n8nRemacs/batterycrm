package defpackage;

import kotlin.coroutines.Continuation;
import one.me.profileedit.screens.changelink.ProfileChangeLinkScreen;

/* loaded from: classes2.dex */
public final class tcc extends dtf implements sm6 {
    public final /* synthetic */ ProfileChangeLinkScreen X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tcc(Continuation continuation, ProfileChangeLinkScreen profileChangeLinkScreen) {
        super(2, continuation);
        this.X = profileChangeLinkScreen;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        tcc tccVar = (tcc) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        tccVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        tcc tccVar = new tcc(continuation, this.X);
        tccVar.o = obj;
        return tccVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        if (((cda) this.o) instanceof jc3) {
            c54 c54Var = this.X;
            api.c(c54Var);
            c54Var.getRouter().B(c54Var);
        }
        return qqg.a;
    }
}
