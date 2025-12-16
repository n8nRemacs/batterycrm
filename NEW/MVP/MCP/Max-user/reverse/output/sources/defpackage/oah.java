package defpackage;

import kotlin.coroutines.Continuation;
import one.me.chatscreen.videomsg.VideoMessageWidget;

/* loaded from: classes2.dex */
public final class oah extends dtf implements sm6 {
    public final /* synthetic */ VideoMessageWidget X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oah(Continuation continuation, VideoMessageWidget videoMessageWidget) {
        super(2, continuation);
        this.X = videoMessageWidget;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        oah oahVar = (oah) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        oahVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        oah oahVar = new oah(continuation, this.X);
        oahVar.o = obj;
        return oahVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        ((Boolean) this.o).getClass();
        yy7[] yy7VarArr = VideoMessageWidget.H0;
        ci5 ci5Var = this.X.G0().Z;
        qqg qqgVar = qqg.a;
        xfh.r(ci5Var, qqgVar);
        return qqgVar;
    }
}
