package defpackage;

import android.net.Uri;
import java.io.IOException;
import kotlin.coroutines.Continuation;
import one.me.aboutappsettings.AboutAppSettingsScreen;
import one.me.android.root.RootController;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.bottomsheet.ConfirmationBottomSheet;

/* loaded from: classes.dex */
public final class o extends dtf implements sm6 {
    public final /* synthetic */ AboutAppSettingsScreen X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(Continuation continuation, AboutAppSettingsScreen aboutAppSettingsScreen) {
        super(2, continuation);
        this.X = aboutAppSettingsScreen;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) throws IOException {
        o oVar = (o) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        oVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        o oVar = new o(continuation, this.X);
        oVar.o = obj;
        return oVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ij0
    public final Object n(Object obj) throws IOException {
        g8j.b(obj);
        cda cdaVar = (cda) this.o;
        boolean zA = fni.a(cdaVar, jc3.b);
        AboutAppSettingsScreen aboutAppSettingsScreen = this.X;
        if (zA) {
            aboutAppSettingsScreen.getRouter().C();
        } else if (cdaVar instanceof s) {
            xb3.a(aboutAppSettingsScreen.getContext(), ((s) cdaVar).b);
        } else if (cdaVar instanceof v) {
            int i = AboutAppSettingsScreen.c;
            Uri uriF = ((iz5) f.a.getAccessor().c(111)).f(aboutAppSettingsScreen.getContext(), ((v) cdaVar).b.toFile());
            String str = ap7.a;
            ap7.h(aboutAppSettingsScreen.getContext(), uriF, "*/*");
        } else {
            if (cdaVar instanceof u) {
                int i2 = AboutAppSettingsScreen.c;
                yy7[] yy7VarArr = BottomSheetWidget.B0;
                oq3 oq3VarE = az1.e(t2d.about_app_send_report_dialog_title, null, null, 6);
                oq3VarE.a(new pq3(2, new n5g(t2d.about_app_send_report_dialog_decline), 3, true, 3, 2), new pq3(1, new n5g(t2d.about_app_send_report_dialog_accept), 2, 32));
                ConfirmationBottomSheet confirmationBottomSheetE = oq3VarE.e();
                confirmationBottomSheetE.setTargetController(aboutAppSettingsScreen);
                c54 parentController = aboutAppSettingsScreen;
                while (parentController.getParentController() != null) {
                    parentController = parentController.getParentController();
                }
                eud eudVar = parentController instanceof eud ? (eud) parentController : null;
                ytd ytdVarE0 = eudVar != null ? ((RootController) eudVar).E0() : null;
                confirmationBottomSheetE.N0(aboutAppSettingsScreen);
                if (ytdVarE0 != null) {
                    bud budVar = new bud(confirmationBottomSheetE, null, null, null, false, -1);
                    az1.u(false, budVar, true, "BottomSheetWidget");
                    ytdVarE0.H(budVar);
                }
            } else if (cdaVar instanceof t) {
                b0 b0Var = b0.c;
                long j = ((t) cdaVar).b;
                ii4 ii4VarP0 = b0Var.p0();
                hi4 hi4Var = new hi4();
                hi4Var.a = ":chats";
                hi4Var.c(Long.valueOf(j), "id");
                hi4Var.c("local", "type");
                ii4VarP0.c(hi4Var.a(), null);
            }
        }
        return qqg.a;
    }
}
