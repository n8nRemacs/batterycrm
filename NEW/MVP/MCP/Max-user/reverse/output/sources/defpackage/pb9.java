package defpackage;

import kotlin.coroutines.Continuation;
import one.me.chatscreen.mediabar.mediatypepicker.MediaTypePickerWidget;

/* loaded from: classes2.dex */
public final class pb9 extends dtf implements sm6 {
    public final /* synthetic */ MediaTypePickerWidget X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pb9(Continuation continuation, MediaTypePickerWidget mediaTypePickerWidget) {
        super(2, continuation);
        this.X = mediaTypePickerWidget;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        pb9 pb9Var = (pb9) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        pb9Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        pb9 pb9Var = new pb9(continuation, this.X);
        pb9Var.o = obj;
        return pb9Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        nb9 nb9Var = (nb9) this.o;
        yy7[] yy7VarArr = MediaTypePickerWidget.X;
        sn0 sn0Var = this.X.d;
        yy7 yy7Var = MediaTypePickerWidget.X[2];
        wa9 wa9Var = (wa9) sn0Var.getValue();
        nb9Var.getClass();
        wa9Var.setSelected(jb9.a);
        return qqg.a;
    }
}
