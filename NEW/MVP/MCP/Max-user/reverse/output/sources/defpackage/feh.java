package defpackage;

import kotlin.coroutines.Continuation;
import one.me.chatmedia.viewer.VideoWebViewScreen;

/* loaded from: classes.dex */
public final class feh extends dtf implements sm6 {
    public final /* synthetic */ VideoWebViewScreen X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public feh(Continuation continuation, VideoWebViewScreen videoWebViewScreen) {
        super(2, continuation);
        this.X = videoWebViewScreen;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        feh fehVar = (feh) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        fehVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        feh fehVar = new feh(continuation, this.X);
        fehVar.o = obj;
        return fehVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        cda cdaVar = (cda) this.o;
        if (fni.a(cdaVar, jc3.b)) {
            ko2.c.p0().d();
        } else if (cdaVar instanceof ei4) {
            ko2.c.s0((ei4) cdaVar);
        }
        return qqg.a;
    }
}
