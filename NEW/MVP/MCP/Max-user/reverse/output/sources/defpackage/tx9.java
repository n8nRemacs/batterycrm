package defpackage;

import kotlin.coroutines.Continuation;
import one.me.messages.list.loader.MessageModel;

/* loaded from: classes2.dex */
public final class tx9 extends dtf implements sm6 {
    public final /* synthetic */ ay9 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tx9(ay9 ay9Var, Continuation continuation) {
        super(2, continuation);
        this.o = ay9Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        tx9 tx9Var = (tx9) l((f84) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        tx9Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new tx9(this.o, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        qqg qqgVar = qqg.a;
        g8j.b(obj);
        String str = this.o.i;
        l6b l6bVar = wqi.a;
        if (l6bVar != null) {
            lg8 lg8Var = lg8.d;
            if (l6bVar.b(lg8Var)) {
                l6bVar.c(lg8Var, str, "Scrolling to last message", null);
            }
        }
        MessageModel messageModel = (MessageModel) ue3.Q(((hr9) this.o.e.getValue()).a);
        if (messageModel == null) {
            return qqgVar;
        }
        if (messageModel.E0 == ((w4e) ((pb3) this.o.k.getValue())).s()) {
            wqi.c(this.o.i, "Don't scroll to last self message because we handle it with scrollWork", new Object[0]);
            return qqgVar;
        }
        this.o.n.updateAndGet(new lk2(9));
        i3e.l(this.o.q, messageModel.c, false, 4);
        return qqgVar;
    }
}
