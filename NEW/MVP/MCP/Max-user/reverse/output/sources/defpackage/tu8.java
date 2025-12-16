package defpackage;

import kotlin.coroutines.Continuation;
import one.me.chatscreen.mediabar.MediaBarWidget;

/* loaded from: classes2.dex */
public final class tu8 extends dtf implements sm6 {
    public final /* synthetic */ MediaBarWidget o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tu8(Continuation continuation, MediaBarWidget mediaBarWidget) {
        super(2, continuation);
        this.o = mediaBarWidget;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        tu8 tu8Var = (tu8) l(bool, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        tu8Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new tu8(continuation, this.o);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        yy7[] yy7VarArr = MediaBarWidget.c1;
        zfi.b(this.o.D0(), MediaBarWidget.d1, null);
        return qqg.a;
    }
}
