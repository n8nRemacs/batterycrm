package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;
import one.me.login.neuroavatars.NeuroAvatarsScreen;

/* loaded from: classes2.dex */
public final class qfa extends dtf implements sm6 {
    public final /* synthetic */ NeuroAvatarsScreen X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qfa(Continuation continuation, NeuroAvatarsScreen neuroAvatarsScreen) {
        super(2, continuation);
        this.X = neuroAvatarsScreen;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        qfa qfaVar = (qfa) l((List) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        qfaVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        qfa qfaVar = new qfa(continuation, this.X);
        qfaVar.o = obj;
        return qfaVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        this.X.G0.E((List) this.o);
        return qqg.a;
    }
}
