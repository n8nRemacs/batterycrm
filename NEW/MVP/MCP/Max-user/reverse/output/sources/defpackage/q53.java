package defpackage;

import android.view.View;
import java.util.Collections;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.android.root.RootController;
import one.me.chats.list.ChatsListWidget;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.bottomsheet.ConfirmationBottomSheet;

/* loaded from: classes2.dex */
public final class q53 extends dtf implements sm6 {
    public final /* synthetic */ ChatsListWidget X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q53(Continuation continuation, ChatsListWidget chatsListWidget) {
        super(2, continuation);
        this.X = chatsListWidget;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        q53 q53Var = (q53) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        q53Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        q53 q53Var = new q53(continuation, this.X);
        q53Var.o = obj;
        return q53Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19, types: [c54] */
    /* JADX WARN: Type inference failed for: r1v35 */
    /* JADX WARN: Type inference failed for: r1v36 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8, types: [c54] */
    @Override // defpackage.ij0
    public final Object n(Object obj) {
        ytd ytdVarE0;
        View view;
        uh7 uh7Var;
        g8j.b(obj);
        e13 e13Var = (e13) this.o;
        boolean z = e13Var instanceof r3e;
        ChatsListWidget chatsListWidget = this.X;
        if (z) {
            yy7[] yy7VarArr = ChatsListWidget.L0;
            chatsListWidget.A0().x0(0);
            if (((r3e) e13Var).a && (uh7Var = (uh7) e03.a.getAccessor().f()) != null) {
                uh7Var.f(Collections.singleton(new th7(rh7.Z, 1)), f1e.CHATS_LIST_TAB);
            }
        } else if (e13Var instanceof tye) {
            tye tyeVar = (tye) e13Var;
            CharSequence charSequenceB = tyeVar.a.b(chatsListWidget.getContext());
            if (charSequenceB != null) {
                ccb ccbVar = new ccb(chatsListWidget);
                ccbVar.h(charSequenceB);
                ccbVar.a(tyeVar.c);
                Integer num = tyeVar.b;
                if (num != null) {
                    ccbVar.e(new qcb(num.intValue()));
                }
                ccbVar.i();
            }
        } else {
            if (e13Var instanceof mxe) {
                mxe mxeVar = (mxe) e13Var;
                yy7[] yy7VarArr2 = ChatsListWidget.L0;
                yy7[] yy7VarArr3 = BottomSheetWidget.B0;
                oq3 oq3VarA = j5j.a(mxeVar.b, gwi.b(new imb("selected.chatId.Action", Long.valueOf(mxeVar.a))), null, 4);
                oq3VarA.f(mxeVar.c);
                mxeVar.d.forEach(new m4(3, new fr2(1, oq3VarA, oq3.class, "addButton", "addButton([Lone/me/sdk/bottomsheet/ConfirmationBottomSheet$Button;)Lone/me/sdk/bottomsheet/ConfirmationBottomSheet$Builder;", 8, 3)));
                ConfirmationBottomSheet confirmationBottomSheetE = oq3VarA.e();
                confirmationBottomSheetE.setTargetController(chatsListWidget);
                ?? parentController = chatsListWidget;
                while (parentController.getParentController() != null) {
                    parentController = parentController.getParentController();
                }
                eud eudVar = parentController instanceof eud ? (eud) parentController : null;
                ytdVarE0 = eudVar != null ? ((RootController) eudVar).E0() : null;
                confirmationBottomSheetE.N0(chatsListWidget);
                if (ytdVarE0 != null) {
                    bud budVar = new bud(confirmationBottomSheetE, null, null, null, false, -1);
                    az1.u(false, budVar, true, "BottomSheetWidget");
                    ytdVarE0.H(budVar);
                }
            } else if (e13Var instanceof ixe) {
                CharSequence charSequenceB2 = ((ixe) e13Var).a.b(chatsListWidget.getContext());
                if (charSequenceB2 != null) {
                    ccb ccbVar2 = new ccb(chatsListWidget);
                    ccbVar2.e(tcb.a);
                    ccbVar2.h(charSequenceB2);
                    ccbVar2.f(vcb.a);
                    c54 parentController2 = chatsListWidget.getParentController();
                    ccbVar2.c(new kcb(0, 0, (parentController2 == null || (view = parentController2.getView()) == null) ? 0 : view.getPaddingBottom(), 3));
                    ccbVar2.d(new mc5(9, e13Var));
                    ccbVar2.i();
                }
            } else if (e13Var instanceof rxe) {
                ((mx3) chatsListWidget.w0.getValue()).a(chatsListWidget.requireActivity(), ((rxe) e13Var).a);
            } else {
                if (!(e13Var instanceof va3)) {
                    throw new NoWhenBranchMatchedException();
                }
                yy7[] yy7VarArr4 = BottomSheetWidget.B0;
                oq3 oq3VarE = az1.e(g3d.chat_list_confirm_clear_saved_messages_history_title, null, null, 6);
                oq3VarE.f(new n5g(g3d.chat_list_confirm_clear_saved_messages_history_subtitle));
                oq3VarE.b(hyc.oneme_saved_messages_clear_history, new n5g(g3d.chat_list_confirm_clear_saved_messages_history_negative_button));
                oq3VarE.c(jvd.a, new n5g(mvd.p));
                ConfirmationBottomSheet confirmationBottomSheetE2 = oq3VarE.e();
                confirmationBottomSheetE2.setTargetController(chatsListWidget);
                ?? parentController3 = chatsListWidget;
                while (parentController3.getParentController() != null) {
                    parentController3 = parentController3.getParentController();
                }
                eud eudVar2 = parentController3 instanceof eud ? (eud) parentController3 : null;
                ytdVarE0 = eudVar2 != null ? ((RootController) eudVar2).E0() : null;
                confirmationBottomSheetE2.N0(chatsListWidget);
                if (ytdVarE0 != null) {
                    bud budVar2 = new bud(confirmationBottomSheetE2, null, null, null, false, -1);
                    az1.u(false, budVar2, true, "BottomSheetWidget");
                    ytdVarE0.H(budVar2);
                }
            }
        }
        return qqg.a;
    }
}
