package defpackage;

import android.view.View;
import java.util.Collections;
import kotlin.coroutines.Continuation;
import one.me.android.root.RootController;
import one.me.chats.search.ChatsListSearchScreen;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.bottomsheet.ConfirmationBottomSheet;

/* loaded from: classes2.dex */
public final class s23 extends dtf implements sm6 {
    public final /* synthetic */ ChatsListSearchScreen X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s23(Continuation continuation, ChatsListSearchScreen chatsListSearchScreen) {
        super(2, continuation);
        this.X = chatsListSearchScreen;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        s23 s23Var = (s23) l((e13) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        s23Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        s23 s23Var = new s23(continuation, this.X);
        s23Var.o = obj;
        return s23Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ij0
    public final Object n(Object obj) {
        CharSequence charSequenceB;
        View view;
        uh7 uh7Var;
        g8j.b(obj);
        e13 e13Var = (e13) this.o;
        boolean z = e13Var instanceof r3e;
        qqg qqgVar = qqg.a;
        ChatsListSearchScreen chatsListSearchScreen = this.X;
        if (z) {
            yy7[] yy7VarArr = ChatsListSearchScreen.I0;
            chatsListSearchScreen.C0();
            if (((r3e) e13Var).a && (uh7Var = (uh7) e03.a.getAccessor().f()) != null) {
                uh7Var.f(Collections.singleton(new th7(rh7.Z, 1)), f1e.CHATS_LIST_SEARCH_RESULT);
                return qqgVar;
            }
        } else if (e13Var instanceof tye) {
            tye tyeVar = (tye) e13Var;
            CharSequence charSequenceB2 = tyeVar.a.b(chatsListSearchScreen.getContext());
            if (charSequenceB2 != null) {
                bcb bcbVar = chatsListSearchScreen.H0;
                if (bcbVar != null) {
                    bcbVar.a();
                }
                ccb ccbVar = new ccb(chatsListSearchScreen);
                ccbVar.h(charSequenceB2);
                ccbVar.a(tyeVar.c);
                Integer num = tyeVar.b;
                if (num != null) {
                    ccbVar.e(new qcb(num.intValue()));
                }
                chatsListSearchScreen.H0 = ccbVar.i();
                return qqgVar;
            }
        } else if (e13Var instanceof mxe) {
            mxe mxeVar = (mxe) e13Var;
            yy7[] yy7VarArr2 = ChatsListSearchScreen.I0;
            yy7[] yy7VarArr3 = BottomSheetWidget.B0;
            oq3 oq3VarA = j5j.a(mxeVar.b, gwi.b(new imb("selected.chatId.Action", Long.valueOf(mxeVar.a))), null, 4);
            oq3VarA.f(mxeVar.c);
            mxeVar.d.forEach(new m4(2, new fr2(1, oq3VarA, oq3.class, "addButton", "addButton([Lone/me/sdk/bottomsheet/ConfirmationBottomSheet$Button;)Lone/me/sdk/bottomsheet/ConfirmationBottomSheet$Builder;", 8, 2)));
            ConfirmationBottomSheet confirmationBottomSheetE = oq3VarA.e();
            confirmationBottomSheetE.setTargetController(chatsListSearchScreen);
            c54 parentController = chatsListSearchScreen;
            while (parentController.getParentController() != null) {
                parentController = parentController.getParentController();
            }
            eud eudVar = parentController instanceof eud ? (eud) parentController : null;
            ytd ytdVarE0 = eudVar != null ? ((RootController) eudVar).E0() : null;
            confirmationBottomSheetE.N0(chatsListSearchScreen);
            if (ytdVarE0 != null) {
                bud budVar = new bud(confirmationBottomSheetE, null, null, null, false, -1);
                az1.u(false, budVar, true, "BottomSheetWidget");
                ytdVarE0.H(budVar);
                return qqgVar;
            }
        } else if ((e13Var instanceof ixe) && (charSequenceB = ((ixe) e13Var).a.b(chatsListSearchScreen.getContext())) != null) {
            ccb ccbVar2 = new ccb(chatsListSearchScreen);
            ccbVar2.e(tcb.a);
            ccbVar2.h(charSequenceB);
            ccbVar2.f(vcb.a);
            c54 parentController2 = chatsListSearchScreen.getParentController();
            ccbVar2.c(new kcb(0, 0, (parentController2 == null || (view = parentController2.getView()) == null) ? 0 : view.getPaddingBottom(), 3));
            ccbVar2.d(new i62(10, e13Var));
            ccbVar2.i();
        }
        return qqgVar;
    }
}
