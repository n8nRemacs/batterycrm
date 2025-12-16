package defpackage;

import com.google.android.exoplayer2.ParserException;
import one.me.android.root.RootController;
import one.me.sdk.arch.Widget;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.bottomsheet.ConfirmationBottomSheet;

/* loaded from: classes.dex */
public abstract class cbj {
    public static void a(String str, boolean z) throws ParserException {
        if (!z) {
            throw ParserException.a(null, str);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void b(Widget widget) {
        yy7[] yy7VarArr = BottomSheetWidget.B0;
        oq3 oq3VarE = az1.e(t3d.oneme_login_sms_count_exceeded_title, null, null, 6);
        oq3VarE.f(new n5g(t3d.oneme_login_sms_count_exceeded_description));
        oq3VarE.d(xyc.oneme_login_sms_code_exceeded_ok_btn, new n5g(mvd.g0));
        ConfirmationBottomSheet confirmationBottomSheetE = oq3VarE.e();
        confirmationBottomSheetE.setTargetController(widget);
        c54 parentController = widget;
        while (parentController.getParentController() != null) {
            parentController = parentController.getParentController();
        }
        eud eudVar = parentController instanceof eud ? (eud) parentController : null;
        ytd ytdVarE0 = eudVar != null ? ((RootController) eudVar).E0() : null;
        confirmationBottomSheetE.N0(widget);
        if (ytdVarE0 != null) {
            bud budVar = new bud(confirmationBottomSheetE, null, null, null, false, -1);
            az1.u(false, budVar, true, "BottomSheetWidget");
            ytdVarE0.H(budVar);
        }
    }
}
