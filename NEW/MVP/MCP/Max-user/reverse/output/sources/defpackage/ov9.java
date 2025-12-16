package defpackage;

import kotlin.coroutines.Continuation;
import one.me.messages.list.ui.MessagesListWidget;

/* loaded from: classes2.dex */
public final class ov9 extends dtf implements sm6 {
    public final /* synthetic */ MessagesListWidget X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ov9(Continuation continuation, MessagesListWidget messagesListWidget) {
        super(2, continuation);
        this.X = messagesListWidget;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        ov9 ov9Var = (ov9) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        ov9Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        ov9 ov9Var = new ov9(continuation, this.X);
        ov9Var.o = obj;
        return ov9Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        f3e f3eVar = (f3e) this.o;
        MessagesListWidget messagesListWidget = this.X;
        String str = messagesListWidget.a;
        l6b l6bVar = wqi.a;
        if (l6bVar != null) {
            lg8 lg8Var = lg8.d;
            if (l6bVar.b(lg8Var)) {
                l6bVar.c(lg8Var, str, "Got new scrollEvent=" + f3eVar, null);
            }
        }
        if (f3eVar.b) {
            messagesListWidget.E0().w1("ScrollEvent");
            messagesListWidget.F0().b();
        } else {
            messagesListWidget.E0().u1(new jv9(messagesListWidget, 0));
        }
        return qqg.a;
    }
}
