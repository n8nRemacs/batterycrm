package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.android.root.RootController;
import one.me.contactlist.ContactListWidget;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.bottomsheet.ConfirmationBottomSheet;
import one.me.sdk.lists.widgets.EndlessRecyclerView2;

/* loaded from: classes2.dex */
public final class gz3 extends dtf implements sm6 {
    public final /* synthetic */ ContactListWidget X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gz3(ContactListWidget contactListWidget, Continuation continuation) {
        super(2, continuation);
        this.X = contactListWidget;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        gz3 gz3Var = (gz3) l((vx3) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        gz3Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        gz3 gz3Var = new gz3(this.X, continuation);
        gz3Var.o = obj;
        return gz3Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        vx3 vx3Var = (vx3) this.o;
        boolean z = vx3Var instanceof r9;
        qqg qqgVar = qqg.a;
        ContactListWidget contactListWidget = this.X;
        if (z) {
            yy7[] yy7VarArr = ContactListWidget.O0;
            if (!contactListWidget.z0().c(qsb.e)) {
                contactListWidget.E0();
                return qqgVar;
            }
            gda.g((gda) contactListWidget.b.getValue(), f1e.CONTACTS_ADD);
            y14 y14Var = y14.c;
            y14Var.getClass();
            y14Var.p0().b(":contact-list/create-contact", null);
            return qqgVar;
        }
        if (vx3Var instanceof q3e) {
            yy7[] yy7VarArr2 = ContactListWidget.O0;
            ((EndlessRecyclerView2) contactListWidget.B0.D(contactListWidget, ContactListWidget.O0[2])).x0(0);
            return qqgVar;
        }
        int i = 1;
        if (vx3Var instanceof kxe) {
            kxe kxeVar = (kxe) vx3Var;
            yy7[] yy7VarArr3 = ContactListWidget.O0;
            yy7[] yy7VarArr4 = BottomSheetWidget.B0;
            oq3 oq3VarA = j5j.a(kxeVar.b, gwi.b(new imb("selected.contactId.Action", Long.valueOf(kxeVar.a))), null, 4);
            oq3VarA.f(kxeVar.c);
            kxeVar.d.forEach(new m4(6, new fr2(1, oq3VarA, oq3.class, "addButton", "addButton([Lone/me/sdk/bottomsheet/ConfirmationBottomSheet$Button;)Lone/me/sdk/bottomsheet/ConfirmationBottomSheet$Builder;", 8, 5)));
            ConfirmationBottomSheet confirmationBottomSheetE = oq3VarA.e();
            confirmationBottomSheetE.setTargetController(contactListWidget);
            c54 parentController = contactListWidget;
            while (parentController.getParentController() != null) {
                parentController = parentController.getParentController();
            }
            eud eudVar = parentController instanceof eud ? (eud) parentController : null;
            ytd ytdVarE0 = eudVar != null ? ((RootController) eudVar).E0() : null;
            confirmationBottomSheetE.N0(contactListWidget);
            if (ytdVarE0 != null) {
                bud budVar = new bud(confirmationBottomSheetE, null, null, null, false, -1);
                az1.u(false, budVar, true, "BottomSheetWidget");
                ytdVarE0.H(budVar);
                return qqgVar;
            }
        } else {
            if (vx3Var instanceof qxe) {
                gw0.w(new mwd(new fz3(xz7.f, null, contactListWidget, vx3Var)), contactListWidget.getViewLifecycleScope());
                api.c(contactListWidget);
                return qqgVar;
            }
            if (vx3Var instanceof qye) {
                yy7[] yy7VarArr5 = ContactListWidget.O0;
                CharSequence charSequenceB = ((qye) vx3Var).a.b(contactListWidget.getContext());
                if (charSequenceB != null) {
                    ccb ccbVar = new ccb(contactListWidget);
                    ccbVar.h(charSequenceB);
                    ccbVar.e(new qcb(yud.A));
                    ccbVar.i();
                    return qqgVar;
                }
            } else {
                if (!(vx3Var instanceof jxe)) {
                    if (!(vx3Var instanceof s94)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    y14 y14Var2 = y14.c;
                    y14Var2.getClass();
                    y14Var2.p0().b(":start-conversation/chat", null);
                    return qqgVar;
                }
                jxe jxeVar = (jxe) vx3Var;
                yy7[] yy7VarArr6 = ContactListWidget.O0;
                CharSequence charSequenceB2 = jxeVar.a.b(contactListWidget.getContext());
                if (charSequenceB2 != null) {
                    ccb ccbVar2 = new ccb(contactListWidget);
                    ccbVar2.h(charSequenceB2);
                    ccbVar2.e(tcb.a);
                    ccbVar2.f(vcb.a);
                    ccbVar2.d(new m53(jxeVar, i));
                    ccbVar2.i();
                    return qqgVar;
                }
            }
        }
        return qqgVar;
    }
}
