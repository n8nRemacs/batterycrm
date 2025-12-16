package defpackage;

import android.os.Bundle;
import java.util.Collections;
import java.util.List;
import kotlin.coroutines.Continuation;
import one.me.messages.list.ui.contextmenu.MessageContextMenuBottomSheet;

/* loaded from: classes2.dex */
public final class mi9 extends dtf implements sm6 {
    public final /* synthetic */ MessageContextMenuBottomSheet X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mi9(Continuation continuation, MessageContextMenuBottomSheet messageContextMenuBottomSheet) {
        super(2, continuation);
        this.X = messageContextMenuBottomSheet;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        mi9 mi9Var = (mi9) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        mi9Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        mi9 mi9Var = new mi9(continuation, this.X);
        mi9Var.o = obj;
        return mi9Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        List list = (List) this.o;
        yy7[] yy7VarArr = MessageContextMenuBottomSheet.d1;
        MessageContextMenuBottomSheet messageContextMenuBottomSheet = this.X;
        Bundle bundle = messageContextMenuBottomSheet.getArgs().getBundle("actions");
        List listB = bundle != null ? g6j.b(bundle) : null;
        if (listB == null) {
            listB = hd5.a;
        }
        messageContextMenuBottomSheet.a1.E(ue3.T(Collections.singletonList(new c44(listB)), list));
        return qqg.a;
    }
}
