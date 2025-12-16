package defpackage;

import kotlin.coroutines.Continuation;
import one.me.chatmedia.viewer.VideoWebViewScreen;

/* loaded from: classes.dex */
public final class deh extends dtf implements sm6 {
    public final /* synthetic */ VideoWebViewScreen X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public deh(Continuation continuation, VideoWebViewScreen videoWebViewScreen) {
        super(2, continuation);
        this.X = videoWebViewScreen;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        deh dehVar = (deh) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        dehVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        deh dehVar = new deh(continuation, this.X);
        dehVar.o = obj;
        return dehVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        String str = (String) this.o;
        yy7[] yy7VarArr = VideoWebViewScreen.H0;
        this.X.P0().loadUrl(str);
        return qqg.a;
    }
}
