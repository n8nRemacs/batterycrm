package defpackage;

import kotlin.coroutines.Continuation;
import one.me.chatscreen.videomsg.VideoMessageWidget;

/* loaded from: classes2.dex */
public final class tah extends dtf implements sm6 {
    public final /* synthetic */ VideoMessageWidget X;
    public /* synthetic */ long o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tah(Continuation continuation, VideoMessageWidget videoMessageWidget) {
        super(2, continuation);
        this.X = videoMessageWidget;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        tah tahVar = (tah) l(new s65(((s65) obj).a), (Continuation) obj2);
        qqg qqgVar = qqg.a;
        tahVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        tah tahVar = new tah(continuation, this.X);
        tahVar.o = ((s65) obj).a;
        return tahVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        long j = this.o;
        yy7[] yy7VarArr = VideoMessageWidget.H0;
        ((e9h) this.X.A0.getValue()).setProgress(n7j.b(s65.g(j) / r5.F0().getDuration(), 0.0f, 1.0f));
        return qqg.a;
    }
}
