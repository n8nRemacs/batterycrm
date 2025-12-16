package defpackage;

import android.view.View;
import android.view.ViewGroup;
import java.util.List;
import one.me.aboutappsettings.AboutAppSettingsScreen;
import one.me.calllist.ui.callinfo.CallLinkInfoScreen;
import one.me.calllist.ui.page.CallHistoryPageScreen;
import one.me.profile.ProfileScreen;
import ru.ok.messages.media.mediabar.MediaBarPreviewLayout;

/* loaded from: classes2.dex */
public final /* synthetic */ class bn0 implements View.OnLongClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ bn0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r6v14, types: [java.lang.Object, k18] */
    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return ((cn0) obj).performLongClick();
            case 1:
                b6a b6aVar = CallLinkInfoScreen.A0;
                pf1 pf1VarB0 = ((CallLinkInfoScreen) obj).B0();
                CharSequence charSequence = ((cf1) pf1VarB0.t0.a.getValue()).b;
                if (charSequence != null) {
                    xfh.r(pf1VarB0.v0, new qc1(charSequence));
                }
                return true;
            case 2:
                vu3 vu3Var = (vu3) obj;
                usd usdVar = vu3Var.O0;
                if (usdVar != null) {
                    long j = vu3Var.Q0;
                    CallHistoryPageScreen callHistoryPageScreen = (CallHistoryPageScreen) usdVar.b;
                    v17 v17Var = CallHistoryPageScreen.u0;
                    if (!((xa1) callHistoryPageScreen.A0().X.getValue()).a && callHistoryPageScreen.B0().x0 == null && callHistoryPageScreen.t0 == null) {
                        callHistoryPageScreen.B0().x0 = Long.valueOf(j);
                        z34 z34VarBuild = h6j.a(2).o((List) callHistoryPageScreen.Z.getValue()).B(vu3Var).v(vw4.d().getDisplayMetrics().density * 12.0f).build();
                        callHistoryPageScreen.t0 = z34VarBuild;
                        z34VarBuild.u(callHistoryPageScreen);
                    }
                }
                return vu3Var.O0 != null;
            case 3:
                ((MediaBarPreviewLayout) obj).S0.getClass();
                return true;
            case 4:
                pnc pncVarD0 = ((ProfileScreen) ((amc) obj).o).D0();
                xfh.r(pncVarD0.E0, new imc((List) ((idc) pncVarD0.K0.getValue()).l.getValue()));
                return true;
            case 5:
                return ((wue) obj).performLongClick();
            case 6:
                AboutAppSettingsScreen aboutAppSettingsScreen = (AboutAppSettingsScreen) ((kce) ((kh1) obj).F0).b;
                int i2 = AboutAppSettingsScreen.c;
                aboutAppSettingsScreen.y0().u();
                return true;
            case 7:
                return ((x4g) obj).performLongClick();
            case 8:
                b3h b3hVar = (b3h) obj;
                Long l = b3hVar.Y;
                if (l != null) {
                    long jLongValue = l.longValue();
                    sm6 sm6Var = b3hVar.o;
                    if (sm6Var != null) {
                        Long lValueOf = Long.valueOf(jLongValue);
                        ViewGroup viewGroup = (ViewGroup) b3hVar.b;
                        if (viewGroup == null) {
                            viewGroup = null;
                        }
                        sm6Var.invoke(lValueOf, viewGroup);
                    }
                }
                return true;
            case 9:
                return ((v6h) obj).performLongClick();
            default:
                return ((b6h) obj).performLongClick();
        }
    }
}
