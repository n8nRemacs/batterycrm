package defpackage;

import kotlin.coroutines.Continuation;
import one.me.chatmedia.viewer.VideoWebViewScreen;

/* loaded from: classes.dex */
public final class eeh extends dtf implements sm6 {
    public final /* synthetic */ VideoWebViewScreen X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eeh(Continuation continuation, VideoWebViewScreen videoWebViewScreen) {
        super(2, continuation);
        this.X = videoWebViewScreen;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        eeh eehVar = (eeh) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        eehVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        eeh eehVar = new eeh(continuation, this.X);
        eehVar.o = obj;
        return eehVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        gp2 gp2Var = (gp2) this.o;
        yy7[] yy7VarArr = VideoWebViewScreen.H0;
        this.X.M0().a(gp2Var, false);
        return qqg.a;
    }
}
