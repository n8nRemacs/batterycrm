package defpackage;

import android.widget.FrameLayout;
import one.me.profileedit.screens.adminpermissions.ProfileEditAdminPermissionsWidget;
import one.me.sdk.uikit.common.button.OneMeButton;
import org.apache.http.HttpStatus;

/* loaded from: classes2.dex */
public final /* synthetic */ class sec implements cm6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ProfileEditAdminPermissionsWidget b;

    public /* synthetic */ sec(ProfileEditAdminPermissionsWidget profileEditAdminPermissionsWidget, int i) {
        this.a = i;
        this.b = profileEditAdminPermissionsWidget;
    }

    @Override // defpackage.cm6
    public final Object invoke() {
        int i = this.a;
        ProfileEditAdminPermissionsWidget profileEditAdminPermissionsWidget = this.b;
        switch (i) {
            case 0:
                hs hsVar = profileEditAdminPermissionsWidget.b;
                yy7[] yy7VarArr = ProfileEditAdminPermissionsWidget.w0;
                yy7 yy7Var = yy7VarArr[0];
                long jLongValue = ((Number) hsVar.a(profileEditAdminPermissionsWidget)).longValue();
                hs hsVar2 = profileEditAdminPermissionsWidget.c;
                yy7 yy7Var2 = yy7VarArr[1];
                long jLongValue2 = ((Number) hsVar2.a(profileEditAdminPermissionsWidget)).longValue();
                hec hecVarY0 = profileEditAdminPermissionsWidget.y0();
                yec yecVar = yec.a;
                return new rec(jLongValue, jLongValue2, hecVarY0, (w63) ((bwf) yecVar.b()).getValue(), (l24) yecVar.getAccessor().d(123).getValue(), yecVar.getAccessor().d(HttpStatus.SC_BAD_GATEWAY), yecVar.a(), yecVar.c(), yecVar.getAccessor().d(48), yecVar.getAccessor().d(HttpStatus.SC_SERVICE_UNAVAILABLE), yecVar.getAccessor().d(46));
            default:
                yy7[] yy7VarArr2 = ProfileEditAdminPermissionsWidget.w0;
                OneMeButton oneMeButton = new OneMeButton(profileEditAdminPermissionsWidget.getContext(), null);
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2, 80);
                int iD = kti.d(12 * vw4.d().getDisplayMetrics().density);
                layoutParams.leftMargin = iD;
                layoutParams.rightMargin = iD;
                layoutParams.topMargin = iD;
                layoutParams.bottomMargin = iD;
                oneMeButton.setLayoutParams(layoutParams);
                oneMeButton.setSize(jza.c);
                oneMeButton.setMode(iza.a);
                oneMeButton.setAppearance(gza.c);
                oneMeButton.setVisibility(profileEditAdminPermissionsWidget.y0() != hec.b ? 8 : 0);
                oneMeButton.setText(profileEditAdminPermissionsWidget.y0() == hec.c ? u8b.Z0 : u8b.F0);
                f8j.d(oneMeButton, 300L, new pcc(2, profileEditAdminPermissionsWidget));
                return oneMeButton;
        }
    }
}
