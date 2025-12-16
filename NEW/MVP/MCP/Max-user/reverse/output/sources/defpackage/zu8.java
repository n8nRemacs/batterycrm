package defpackage;

import kotlin.coroutines.Continuation;
import one.me.chatscreen.mediabar.MediaBarWidget;

/* loaded from: classes2.dex */
public final class zu8 extends dtf implements sm6 {
    public final /* synthetic */ MediaBarWidget X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zu8(Continuation continuation, MediaBarWidget mediaBarWidget) {
        super(2, continuation);
        this.X = mediaBarWidget;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        zu8 zu8Var = (zu8) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        zu8Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        zu8 zu8Var = new zu8(continuation, this.X);
        zu8Var.o = obj;
        return zu8Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        l00 l00Var = (l00) this.o;
        yy7[] yy7VarArr = MediaBarWidget.c1;
        this.X.Q0(l00Var);
        return qqg.a;
    }
}
