package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;
import one.me.profileedit.screens.changelink.ProfileChangeLinkScreen;

/* loaded from: classes2.dex */
public final class rcc extends dtf implements sm6 {
    public final /* synthetic */ ProfileChangeLinkScreen X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rcc(Continuation continuation, ProfileChangeLinkScreen profileChangeLinkScreen) {
        super(2, continuation);
        this.X = profileChangeLinkScreen;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        rcc rccVar = (rcc) l((List) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        rccVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        rcc rccVar = new rcc(continuation, this.X);
        rccVar.o = obj;
        return rccVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        this.X.X.E((List) this.o);
        return qqg.a;
    }
}
