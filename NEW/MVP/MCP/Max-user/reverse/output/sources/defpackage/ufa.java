package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;
import one.me.login.neuroavatars.NeuroAvatarsScreen;

/* loaded from: classes2.dex */
public final class ufa extends dtf implements sm6 {
    public final /* synthetic */ NeuroAvatarsScreen X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ufa(Continuation continuation, NeuroAvatarsScreen neuroAvatarsScreen) {
        super(2, continuation);
        this.X = neuroAvatarsScreen;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        ufa ufaVar = (ufa) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        ufaVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        ufa ufaVar = new ufa(continuation, this.X);
        ufaVar.o = obj;
        return ufaVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        List list = (List) this.o;
        NeuroAvatarsScreen neuroAvatarsScreen = this.X;
        ((cga) neuroAvatarsScreen.v0.D(neuroAvatarsScreen, NeuroAvatarsScreen.K0[7])).setVisibility(list.isEmpty() ? 0 : 8);
        neuroAvatarsScreen.B0().setVisibility(list.isEmpty() ? 8 : 0);
        v1a v1aVar = neuroAvatarsScreen.I0;
        neb nebVarB0 = neuroAvatarsScreen.B0();
        v1aVar.getClass();
        v1a.n(nebVarB0, list);
        return qqg.a;
    }
}
