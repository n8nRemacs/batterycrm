package defpackage;

import kotlin.coroutines.Continuation;
import one.me.messages.list.ui.contextmenu.MessageContextMenuBottomSheet;

/* loaded from: classes2.dex */
public final class ni9 extends dtf implements sm6 {
    public final /* synthetic */ MessageContextMenuBottomSheet X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ni9(Continuation continuation, MessageContextMenuBottomSheet messageContextMenuBottomSheet) {
        super(2, continuation);
        this.X = messageContextMenuBottomSheet;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        ni9 ni9Var = (ni9) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        ni9Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        ni9 ni9Var = new ni9(continuation, this.X);
        ni9Var.o = obj;
        return ni9Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        cda cdaVar = (cda) this.o;
        yy7[] yy7VarArr = MessageContextMenuBottomSheet.d1;
        if (cdaVar instanceof ei4) {
            MessageContextMenuBottomSheet messageContextMenuBottomSheet = this.X;
            messageContextMenuBottomSheet.E0(true);
            xs0 xs0Var = new xs0(messageContextMenuBottomSheet, new li9(messageContextMenuBottomSheet, cdaVar));
            if (messageContextMenuBottomSheet.getRouter() != null) {
                messageContextMenuBottomSheet.getRouter().a(xs0Var);
            } else {
                messageContextMenuBottomSheet.addLifecycleListener(new q9(messageContextMenuBottomSheet, 7, xs0Var));
            }
        }
        return qqg.a;
    }
}
