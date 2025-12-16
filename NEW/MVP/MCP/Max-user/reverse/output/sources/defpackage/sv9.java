package defpackage;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import java.util.Collections;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.android.root.RootController;
import one.me.messages.list.loader.MessageModel;
import one.me.messages.list.ui.MessagesListWidget;
import one.me.messages.list.ui.contextmenu.MessageContextMenuBottomSheet;
import one.me.messages.list.ui.view.WarningLinkBottomSheet;
import one.me.sdk.arch.Widget;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.bottomsheet.ConfirmationBottomSheet;

/* loaded from: classes2.dex */
public final class sv9 extends dtf implements sm6 {
    public final /* synthetic */ MessagesListWidget X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sv9(Continuation continuation, MessagesListWidget messagesListWidget) {
        super(2, continuation);
        this.X = messagesListWidget;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        sv9 sv9Var = (sv9) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        sv9Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        sv9 sv9Var = new sv9(continuation, this.X);
        sv9Var.o = obj;
        return sv9Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v59 */
    /* JADX WARN: Type inference failed for: r1v6, types: [c54] */
    /* JADX WARN: Type inference failed for: r1v60, types: [c54] */
    /* JADX WARN: Type inference failed for: r1v69 */
    /* JADX WARN: Type inference failed for: r1v70, types: [c54] */
    /* JADX WARN: Type inference failed for: r1v76 */
    /* JADX WARN: Type inference failed for: r1v77 */
    /* JADX WARN: Type inference failed for: r1v78 */
    @Override // defpackage.ij0
    public final Object n(Object obj) {
        View contentView$message_list_release;
        g8j.b(obj);
        pr9 pr9Var = (pr9) this.o;
        MessagesListWidget messagesListWidget = this.X;
        yy7[] yy7VarArr = MessagesListWidget.b1;
        q07 q07Var = q07.LONG_PRESS;
        if (pr9Var instanceof lxe) {
            lxe lxeVar = (lxe) pr9Var;
            yy7[] yy7VarArr2 = BottomSheetWidget.B0;
            oq3 oq3VarA = j5j.a(lxeVar.b, gwi.b(new imb("selected.messageIds.Action", ue3.e0(lxeVar.a))), null, 4);
            oq3VarA.f(lxeVar.c);
            lxeVar.d.forEach(new m4(11, new fr2(1, oq3VarA, oq3.class, "addButton", "addButton([Lone/me/sdk/bottomsheet/ConfirmationBottomSheet$Button;)Lone/me/sdk/bottomsheet/ConfirmationBottomSheet$Builder;", 8, 6)));
            oq3VarA.a.putBoolean("memorize_keyboard", lxeVar.e);
            ConfirmationBottomSheet confirmationBottomSheetE = oq3VarA.e();
            confirmationBottomSheetE.setTargetController(messagesListWidget);
            ?? parentController = messagesListWidget;
            while (parentController.getParentController() != null) {
                parentController = parentController.getParentController();
            }
            eud eudVar = parentController instanceof eud ? (eud) parentController : null;
            ytd ytdVarE0 = eudVar != null ? ((RootController) eudVar).E0() : null;
            confirmationBottomSheetE.N0(messagesListWidget);
            if (ytdVarE0 != null) {
                bud budVar = new bud(confirmationBottomSheetE, null, null, null, false, -1);
                az1.u(false, budVar, true, "BottomSheetWidget");
                ytdVarE0.H(budVar);
            }
        } else if (pr9Var instanceof pye) {
            pye pyeVar = (pye) pr9Var;
            yy7[] yy7VarArr3 = BottomSheetWidget.B0;
            oq3 oq3VarA2 = j5j.a(pyeVar.e, gwi.b(new imb("selected.messageIds.Action", new long[]{pyeVar.a}), new imb("bot.shareContact.confirm.keyboardId", pyeVar.b), new imb("bot.shareContact.confirm.button", pyeVar.d), new imb("bot.shareContact.confirm.buttonPosition", pyeVar.c)), null, 4);
            oq3VarA2.f(pyeVar.f);
            pyeVar.g.forEach(new m4(10, new fr2(1, oq3VarA2, oq3.class, "addButton", "addButton([Lone/me/sdk/bottomsheet/ConfirmationBottomSheet$Button;)Lone/me/sdk/bottomsheet/ConfirmationBottomSheet$Builder;", 8, 7)));
            ConfirmationBottomSheet confirmationBottomSheetE2 = oq3VarA2.e();
            confirmationBottomSheetE2.setTargetController(messagesListWidget);
            ?? parentController2 = messagesListWidget;
            while (parentController2.getParentController() != null) {
                parentController2 = parentController2.getParentController();
            }
            eud eudVar2 = parentController2 instanceof eud ? (eud) parentController2 : null;
            ytd ytdVarE02 = eudVar2 != null ? ((RootController) eudVar2).E0() : null;
            confirmationBottomSheetE2.N0(messagesListWidget);
            if (ytdVarE02 != null) {
                bud budVar2 = new bud(confirmationBottomSheetE2, null, null, null, false, -1);
                az1.u(false, budVar2, true, "BottomSheetWidget");
                ytdVarE02.H(budVar2);
            }
        } else if (pr9Var instanceof oye) {
            xfh.r(messagesListWidget.I0().s0, new bs9(((oye) pr9Var).a));
        } else if (pr9Var instanceof nxe) {
            xfh.r(messagesListWidget.I0().s0, new as9(((nxe) pr9Var).a));
        } else if (pr9Var instanceof rye) {
            rye ryeVar = (rye) pr9Var;
            CharSequence charSequenceB = ryeVar.a.b(messagesListWidget.getContext());
            if (charSequenceB != null) {
                bcb bcbVar = messagesListWidget.B0;
                if (bcbVar != null) {
                    bcbVar.a();
                }
                ccb ccbVar = new ccb(messagesListWidget);
                ccbVar.h(charSequenceB);
                ccbVar.a(ryeVar.c);
                Integer num = ryeVar.b;
                if (num != null) {
                    ccbVar.e(new qcb(num.intValue()));
                }
                ccbVar.c(new kcb(0, 0, messagesListWidget.B0(), 3));
                messagesListWidget.B0 = ccbVar.i();
            }
        } else if (pr9Var instanceof wye) {
            if (messagesListWidget.K0().D().g()) {
                messagesListWidget.K0().D().b();
            }
            ccb ccbVar2 = new ccb(messagesListWidget);
            ccbVar2.h(z7.e(messagesListWidget.getContext(), l7b.p0));
            ccbVar2.e(tcb.a);
            ccbVar2.f(new zcb(new n5g(mvd.p)));
            ccbVar2.d(new dq4(messagesListWidget, 28, (wye) pr9Var));
            ccbVar2.c(new kcb(0, 0, messagesListWidget.B0(), 3));
            ccbVar2.i();
        } else if (pr9Var instanceof ol9) {
            if (messagesListWidget.K0().D().g()) {
                messagesListWidget.K0().D().b();
            }
            uh7 uh7VarA = gq9.a.a();
            if (uh7VarA != null) {
                uh7VarA.f(Collections.singleton(new th7(rh7.Z, 1)), f1e.CHAT);
            }
        } else if (pr9Var instanceof z9) {
            dad dadVar = messagesListWidget.a1;
            if (dadVar != null) {
                z9 z9Var = (z9) pr9Var;
                dadVar.d(z9Var.c, z9Var.a, z9Var.b);
            }
        } else if (pr9Var instanceof mye) {
            mye myeVar = (mye) pr9Var;
            MessageModel messageModel = myeVar.a;
            List list = myeVar.b;
            boolean z = myeVar.c;
            hs hsVar = messagesListWidget.c;
            yy7[] yy7VarArr4 = MessagesListWidget.b1;
            yy7 yy7Var = yy7VarArr4[1];
            if (((long[]) hsVar.a(messagesListWidget)) == null && messagesListWidget.getView() != null) {
                mid midVarN = messagesListWidget.H0().N(messageModel.a);
                if (midVarN == null) {
                    String name = MessagesListWidget.class.getName();
                    l6b l6bVar = wqi.a;
                    if (l6bVar != null) {
                        lg8 lg8Var = lg8.X;
                        if (l6bVar.b(lg8Var)) {
                            l6bVar.c(lg8Var, name, vb9.e(messageModel.a, "not find viewholder for messageId "), null);
                        }
                    }
                } else {
                    View view = midVarN.a;
                    uh9 uh9Var = view instanceof uh9 ? (uh9) view : null;
                    if (uh9Var == null || (contentView$message_list_release = uh9Var.getContentView$message_list_release()) == null) {
                        contentView$message_list_release = midVarN.a;
                    }
                    uog.i(contentView$message_list_release, q07Var);
                    long[] jArr = {messageModel.a};
                    hs hsVar2 = messagesListWidget.c;
                    yy7 yy7Var2 = yy7VarArr4[1];
                    hsVar2.b(messagesListWidget, jArr);
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("show_reactions_selector", z);
                    bundle.putLong("message_id", messageModel.a);
                    bundle.putLong("message_server_id", messageModel.b);
                    bundle.putLong("chat_id", messagesListWidget.getArgs().getLong("ARG_CHAT_ID"));
                    bundle.putParcelable(Widget.ARG_SCOPE_ID, new b1e(messagesListWidget.b));
                    bundle.putBundle("actions", g6j.a(list));
                    if (contentView$message_list_release.getId() == -1) {
                        throw new IllegalStateException("Check failed.");
                    }
                    bundle.putInt("anchor_id", contentView$message_list_release.getId());
                    bundle.putSerializable("anchor_class", contentView$message_list_release.getClass());
                    bundle.putParcelable("highlight_padding", new Rect(-1073741824, 0, -1073741824, 0));
                    bundle.putFloat("highlight_radius", 0.0f);
                    bundle.putInt("parent_id", bzc.messages_list_recycler_view);
                    MessageContextMenuBottomSheet messageContextMenuBottomSheet = new MessageContextMenuBottomSheet(new Bundle(bundle));
                    messagesListWidget.s0 = messageContextMenuBottomSheet;
                    messageContextMenuBottomSheet.u(messagesListWidget);
                }
            }
        } else if (pr9Var instanceof uxe) {
            uxe uxeVar = (uxe) pr9Var;
            float f = uxeVar.a;
            float f2 = uxeVar.b;
            Bundle bundle2 = uxeVar.c;
            r5g r5gVar = uxeVar.d;
            List list2 = uxeVar.e;
            View view2 = messagesListWidget.getView();
            if (view2 != null) {
                h6j.a(1).D().q(f, f2).x(bundle2).G(r5gVar).o(list2).build().u(messagesListWidget);
                uog.i(view2, q07Var);
            }
        } else if (pr9Var instanceof n27) {
            MessageContextMenuBottomSheet messageContextMenuBottomSheet2 = messagesListWidget.s0;
            if (messageContextMenuBottomSheet2 != null) {
                messageContextMenuBottomSheet2.E0(true);
            }
        } else if (fni.a(pr9Var, grb.a)) {
            View view3 = messagesListWidget.getView();
            if (view3 != null) {
                uog.i(view3, p07.CONFIRM);
            }
        } else {
            if (!(pr9Var instanceof xye)) {
                throw new NoWhenBranchMatchedException();
            }
            yy7[] yy7VarArr5 = BottomSheetWidget.B0;
            WarningLinkBottomSheet warningLinkBottomSheet = new WarningLinkBottomSheet(messagesListWidget.b, ((xye) pr9Var).a, null);
            warningLinkBottomSheet.setTargetController(messagesListWidget);
            ?? parentController3 = messagesListWidget;
            while (parentController3.getParentController() != null) {
                parentController3 = parentController3.getParentController();
            }
            eud eudVar3 = parentController3 instanceof eud ? (eud) parentController3 : null;
            ytd ytdVarE03 = eudVar3 != null ? ((RootController) eudVar3).E0() : null;
            warningLinkBottomSheet.N0(messagesListWidget);
            if (ytdVarE03 != null) {
                bud budVar3 = new bud(warningLinkBottomSheet, null, null, null, false, -1);
                az1.u(false, budVar3, true, "BottomSheetWidget");
                ytdVarE03.H(budVar3);
            }
        }
        return qqg.a;
    }
}
