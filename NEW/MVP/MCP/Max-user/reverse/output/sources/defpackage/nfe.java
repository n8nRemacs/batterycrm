package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;
import one.me.devmenu.tools.server.ServerHostBottomSheet;

/* loaded from: classes2.dex */
public final class nfe extends dtf implements sm6 {
    public final /* synthetic */ ServerHostBottomSheet X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nfe(Continuation continuation, ServerHostBottomSheet serverHostBottomSheet) {
        super(2, continuation);
        this.X = serverHostBottomSheet;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        nfe nfeVar = (nfe) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        nfeVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        nfe nfeVar = new nfe(continuation, this.X);
        nfeVar.o = obj;
        return nfeVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        this.X.E0.E((List) this.o);
        return qqg.a;
    }
}
