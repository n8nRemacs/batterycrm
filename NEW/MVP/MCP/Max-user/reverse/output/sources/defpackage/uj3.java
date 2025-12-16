package defpackage;

import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import one.me.android.root.RootController;
import one.me.complaintbottomsheet.ComplaintBottomSheet;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.bottomsheet.ConfirmationBottomSheet;

/* loaded from: classes2.dex */
public final class uj3 extends dtf implements sm6 {
    public final /* synthetic */ ComplaintBottomSheet X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uj3(Continuation continuation, ComplaintBottomSheet complaintBottomSheet) {
        super(2, continuation);
        this.X = complaintBottomSheet;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        uj3 uj3Var = (uj3) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        uj3Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        uj3 uj3Var = new uj3(continuation, this.X);
        uj3Var.o = obj;
        return uj3Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        List list = (List) this.o;
        if (list.isEmpty()) {
            yy7[] yy7VarArr = ComplaintBottomSheet.X;
            zj3.c.p0().d();
        } else {
            yy7[] yy7VarArr2 = ComplaintBottomSheet.X;
            yy7[] yy7VarArr3 = BottomSheetWidget.B0;
            oq3 oq3VarE = az1.e(g3b.c, null, null, 6);
            oq3VarE.f(new n5g(g3b.a));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                oq3VarE.a((pq3) it.next());
            }
            ComplaintBottomSheet complaintBottomSheet = this.X;
            oq3VarE.a((pq3) complaintBottomSheet.d.getValue());
            ConfirmationBottomSheet confirmationBottomSheetE = oq3VarE.e();
            confirmationBottomSheetE.addLifecycleListener(new mg8(complaintBottomSheet));
            confirmationBottomSheetE.setTargetController(complaintBottomSheet);
            c54 parentController = complaintBottomSheet;
            while (parentController.getParentController() != null) {
                parentController = parentController.getParentController();
            }
            eud eudVar = parentController instanceof eud ? (eud) parentController : null;
            ytd ytdVarE0 = eudVar != null ? ((RootController) eudVar).E0() : null;
            confirmationBottomSheetE.N0(complaintBottomSheet);
            if (ytdVarE0 != null) {
                bud budVar = new bud(confirmationBottomSheetE, null, null, null, false, -1);
                az1.u(false, budVar, true, "BottomSheetWidget");
                ytdVarE0.H(budVar);
            }
        }
        return qqg.a;
    }
}
