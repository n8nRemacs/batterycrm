package defpackage;

import kotlin.coroutines.Continuation;
import one.me.sdk.messagewrite.MessageWriteWidget;

/* loaded from: classes2.dex */
public final class mp9 extends dtf implements sm6 {
    public final /* synthetic */ MessageWriteWidget X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mp9(Continuation continuation, MessageWriteWidget messageWriteWidget) {
        super(2, continuation);
        this.X = messageWriteWidget;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        mp9 mp9Var = (mp9) l((rn9) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        mp9Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        mp9 mp9Var = new mp9(continuation, this.X);
        mp9Var.o = obj;
        return mp9Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        rn9 rn9Var = (rn9) this.o;
        boolean z = false;
        if (rn9Var != null && rn9Var.a) {
            z = true;
        }
        yy7[] yy7VarArr = MessageWriteWidget.L0;
        MessageWriteWidget messageWriteWidget = this.X;
        messageWriteWidget.C0().setLeftOuterIconVisible(z);
        if (z) {
            messageWriteWidget.C0().setLeftOuterIconOnClickListener(new o91(0, messageWriteWidget.I0(), no9.class, "onMiniAppClick", "onMiniAppClick$message_write_widget_release()V", 0, 25));
            messageWriteWidget.C0().setLeftOuterIconText(rn9Var != null ? rn9Var.b : null);
        }
        return qqg.a;
    }
}
