package defpackage;

import android.view.View;
import kotlin.coroutines.Continuation;
import one.me.sdk.messagewrite.MessageWriteWidget;

/* loaded from: classes2.dex */
public final class yo9 extends dtf implements sm6 {
    public final /* synthetic */ MessageWriteWidget X;
    public final /* synthetic */ View Y;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yo9(Continuation continuation, MessageWriteWidget messageWriteWidget, View view) {
        super(2, continuation);
        this.X = messageWriteWidget;
        this.Y = view;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        yo9 yo9Var = (yo9) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        yo9Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        yo9 yo9Var = new yo9(continuation, this.X, this.Y);
        yo9Var.o = obj;
        return yo9Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        s5g s5gVar = (s5g) this.o;
        yy7[] yy7VarArr = MessageWriteWidget.L0;
        this.X.C0().setInputHint(s5gVar.b(this.Y.getContext()));
        return qqg.a;
    }
}
