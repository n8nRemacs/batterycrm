package defpackage;

import kotlin.coroutines.Continuation;
import one.me.chatmedia.viewer.VideoWebViewScreen;

/* loaded from: classes.dex */
public final class ieh extends dtf implements sm6 {
    public final /* synthetic */ VideoWebViewScreen X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ieh(Continuation continuation, VideoWebViewScreen videoWebViewScreen) {
        super(2, continuation);
        this.X = videoWebViewScreen;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        ieh iehVar = (ieh) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        iehVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        ieh iehVar = new ieh(continuation, this.X);
        iehVar.o = obj;
        return iehVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        v54 v54Var = (v54) this.o;
        VideoWebViewScreen videoWebViewScreen = this.X;
        yy7[] yy7VarArr = VideoWebViewScreen.H0;
        if (fni.a(v54Var, q54.a)) {
            videoWebViewScreen.O0().u(d1b.y);
        } else {
            String name = VideoWebViewScreen.class.getName();
            l6b l6bVar = wqi.a;
            if (l6bVar != null) {
                lg8 lg8Var = lg8.d;
                if (l6bVar.b(lg8Var)) {
                    l6bVar.c(lg8Var, name, "videoWebView: Info panel event handle " + v54Var, null);
                }
            }
        }
        return qqg.a;
    }
}
