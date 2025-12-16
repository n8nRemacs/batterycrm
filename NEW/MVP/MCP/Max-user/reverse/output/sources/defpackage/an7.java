package defpackage;

import java.util.List;
import one.me.android.root.RootController;
import one.me.login.inputphone.InputPhoneScreen;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.phoneutils.SelectCountryBottomSheet;

/* loaded from: classes2.dex */
public final /* synthetic */ class an7 implements cm6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ InputPhoneScreen b;

    public /* synthetic */ an7(InputPhoneScreen inputPhoneScreen, int i) {
        this.a = i;
        this.b = inputPhoneScreen;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.cm6
    public final Object invoke() {
        int i = this.a;
        InputPhoneScreen inputPhoneScreen = this.b;
        switch (i) {
            case 0:
                yy7[] yy7VarArr = InputPhoneScreen.C0;
                hs hsVar = inputPhoneScreen.d;
                yy7 yy7Var = InputPhoneScreen.C0[0];
                return new yn7((String) hsVar.a(inputPhoneScreen));
            case 1:
                yy7[] yy7VarArr2 = InputPhoneScreen.C0;
                return new jp7(inputPhoneScreen.getRouter());
            default:
                yy7[] yy7VarArr3 = InputPhoneScreen.C0;
                yy7[] yy7VarArr4 = BottomSheetWidget.B0;
                jbe jbeVar = SelectCountryBottomSheet.E0;
                List list = (List) inputPhoneScreen.D0().z0.a.getValue();
                jbeVar.getClass();
                SelectCountryBottomSheet selectCountryBottomSheet = new SelectCountryBottomSheet(gwi.b(new imb("countries", list.toArray(new x2b[0]))));
                String name = jbe.class.getName();
                selectCountryBottomSheet.setTargetController(inputPhoneScreen);
                c54 parentController = inputPhoneScreen;
                while (parentController.getParentController() != null) {
                    parentController = parentController.getParentController();
                }
                eud eudVar = parentController instanceof eud ? (eud) parentController : null;
                ytd ytdVarE0 = eudVar != null ? ((RootController) eudVar).E0() : null;
                selectCountryBottomSheet.N0(inputPhoneScreen);
                if (ytdVarE0 != null) {
                    bud budVar = new bud(selectCountryBottomSheet, null, null, null, false, -1);
                    az1.u(false, budVar, true, name);
                    ytdVarE0.H(budVar);
                }
                return qqg.a;
        }
    }
}
