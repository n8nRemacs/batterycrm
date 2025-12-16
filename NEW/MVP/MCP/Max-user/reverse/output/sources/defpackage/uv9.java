package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.messages.list.ui.MessagesListWidget;

/* loaded from: classes2.dex */
public final class uv9 extends dtf implements sm6 {
    public final /* synthetic */ MessagesListWidget X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uv9(Continuation continuation, MessagesListWidget messagesListWidget) {
        super(2, continuation);
        this.X = messagesListWidget;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        uv9 uv9Var = (uv9) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        uv9Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        uv9 uv9Var = new uv9(continuation, this.X);
        uv9Var.o = obj;
        return uv9Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        v9d v9dVar = (v9d) this.o;
        yy7[] yy7VarArr = MessagesListWidget.b1;
        if (v9dVar == null) {
            throw new NoWhenBranchMatchedException();
        }
        dad dadVar = this.X.a1;
        if (dadVar != null) {
            dadVar.d(v9dVar.b, v9dVar.a, v9dVar.c);
        }
        return qqg.a;
    }
}
