package defpackage;

import java.util.Arrays;
import java.util.List;
import kotlin.coroutines.Continuation;
import one.me.android.root.RootController;
import one.me.inviteactions.invitebyphone.InviteByPhoneScreen;
import one.me.sdk.phoneutils.SelectCountryBottomSheet;

/* loaded from: classes2.dex */
public final class kr7 extends dtf implements sm6 {
    public final /* synthetic */ InviteByPhoneScreen X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kr7(Continuation continuation, InviteByPhoneScreen inviteByPhoneScreen) {
        super(2, continuation);
        this.X = inviteByPhoneScreen;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        kr7 kr7Var = (kr7) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        kr7Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        kr7 kr7Var = new kr7(continuation, this.X);
        kr7Var.o = obj;
        return kr7Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ij0
    public final Object n(Object obj) {
        c54 c54VarG;
        g8j.b(obj);
        List list = (List) this.o;
        c54 parentController = this.X;
        while (parentController.getParentController() != null) {
            parentController = parentController.getParentController();
        }
        eud eudVar = parentController instanceof eud ? (eud) parentController : null;
        ytd ytdVarE0 = eudVar != null ? ((RootController) eudVar).E0() : null;
        if (ytdVarE0 != null && (c54VarG = ytdVarE0.g(SelectCountryBottomSheet.E0.getClass().getName())) != null) {
            SelectCountryBottomSheet selectCountryBottomSheet = c54VarG instanceof SelectCountryBottomSheet ? (SelectCountryBottomSheet) c54VarG : null;
            if (selectCountryBottomSheet != null) {
                x2b[] x2bVarArr = (x2b[]) list.toArray(new x2b[0]);
                hs hsVar = selectCountryBottomSheet.C0;
                yy7[] yy7VarArr = SelectCountryBottomSheet.F0;
                yy7 yy7Var = yy7VarArr[0];
                if (!Arrays.equals((x2b[]) hsVar.a(selectCountryBottomSheet), x2bVarArr)) {
                    yy7 yy7Var2 = yy7VarArr[0];
                    hsVar.b(selectCountryBottomSheet, x2bVarArr);
                    selectCountryBottomSheet.D0.E(ys.D(x2bVarArr));
                }
            }
        }
        return qqg.a;
    }
}
