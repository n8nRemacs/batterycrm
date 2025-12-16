package defpackage;

import android.view.View;
import kotlin.coroutines.Continuation;
import one.me.android.root.RootController;
import one.me.chats.list.ChatsListWidget;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.bottomsheet.ConfirmationBottomSheet;

/* loaded from: classes2.dex */
public final class t53 extends dtf implements sm6 {
    public final /* synthetic */ ChatsListWidget X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t53(Continuation continuation, ChatsListWidget chatsListWidget) {
        super(2, continuation);
        this.X = chatsListWidget;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        t53 t53Var = (t53) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        t53Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        t53 t53Var = new t53(continuation, this.X);
        t53Var.o = obj;
        return t53Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ij0
    public final Object n(Object obj) {
        View view;
        g8j.b(obj);
        vx3 vx3Var = (vx3) this.o;
        boolean z = vx3Var instanceof q3e;
        int i = 0;
        ChatsListWidget chatsListWidget = this.X;
        if (z) {
            yy7[] yy7VarArr = ChatsListWidget.L0;
            chatsListWidget.A0().x0(0);
        } else if (vx3Var instanceof kxe) {
            kxe kxeVar = (kxe) vx3Var;
            yy7[] yy7VarArr2 = ChatsListWidget.L0;
            yy7[] yy7VarArr3 = BottomSheetWidget.B0;
            oq3 oq3VarA = j5j.a(kxeVar.b, gwi.b(new imb("selected.contactId.Action", Long.valueOf(kxeVar.a))), null, 4);
            oq3VarA.f(kxeVar.c);
            kxeVar.d.forEach(new m4(4, new fr2(1, oq3VarA, oq3.class, "addButton", "addButton([Lone/me/sdk/bottomsheet/ConfirmationBottomSheet$Button;)Lone/me/sdk/bottomsheet/ConfirmationBottomSheet$Builder;", 8, 4)));
            ConfirmationBottomSheet confirmationBottomSheetE = oq3VarA.e();
            confirmationBottomSheetE.setTargetController(chatsListWidget);
            c54 parentController = chatsListWidget;
            while (parentController.getParentController() != null) {
                parentController = parentController.getParentController();
            }
            eud eudVar = parentController instanceof eud ? (eud) parentController : null;
            ytd ytdVarE0 = eudVar != null ? ((RootController) eudVar).E0() : null;
            confirmationBottomSheetE.N0(chatsListWidget);
            if (ytdVarE0 != null) {
                bud budVar = new bud(confirmationBottomSheetE, null, null, null, false, -1);
                az1.u(false, budVar, true, "BottomSheetWidget");
                ytdVarE0.H(budVar);
            }
        } else if (vx3Var instanceof jxe) {
            jxe jxeVar = (jxe) vx3Var;
            yy7[] yy7VarArr4 = ChatsListWidget.L0;
            CharSequence charSequenceB = jxeVar.a.b(chatsListWidget.getContext());
            if (charSequenceB != null) {
                ccb ccbVar = new ccb(chatsListWidget);
                ccbVar.h(charSequenceB);
                ccbVar.e(tcb.a);
                ccbVar.f(vcb.a);
                c54 parentController2 = chatsListWidget.getParentController();
                ccbVar.c(new kcb(0, 0, (parentController2 == null || (view = parentController2.getView()) == null) ? 0 : view.getPaddingBottom(), 3));
                ccbVar.d(new m53(jxeVar, i));
                ccbVar.i();
            }
        }
        return qqg.a;
    }
}
