package defpackage;

import kotlin.coroutines.Continuation;
import one.me.chatscreen.mediabar.MediaBarWidget;

/* loaded from: classes2.dex */
public final class bv8 extends dtf implements sm6 {
    public final /* synthetic */ MediaBarWidget X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bv8(Continuation continuation, MediaBarWidget mediaBarWidget) {
        super(2, continuation);
        this.X = mediaBarWidget;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        bv8 bv8Var = (bv8) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        bv8Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        bv8 bv8Var = new bv8(continuation, this.X);
        bv8Var.o = obj;
        return bv8Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        ade adeVar = (ade) this.o;
        yy7[] yy7VarArr = MediaBarWidget.c1;
        this.X.P0(adeVar);
        return qqg.a;
    }
}
