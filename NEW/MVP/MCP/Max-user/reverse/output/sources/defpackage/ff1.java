package defpackage;

import android.widget.LinearLayout;
import one.me.calllist.ui.callinfo.CallLinkInfoScreen;
import one.me.calls.ui.bottomsheet.opponents.CallOpponentsListWidget;
import one.me.profile.ProfileScreen;
import one.me.profileedit.ProfileEditScreen;
import one.me.sdk.arch.Widget;

/* loaded from: classes.dex */
public final /* synthetic */ class ff1 implements hn {
    public final /* synthetic */ int a;
    public final /* synthetic */ yq5 b;
    public final /* synthetic */ Widget c;

    public /* synthetic */ ff1(yq5 yq5Var, Widget widget, int i) {
        this.a = i;
        this.b = yq5Var;
        this.c = widget;
    }

    @Override // defpackage.fn
    public final void c0(in inVar, int i) {
        int i2 = this.a;
        Widget widget = this.c;
        yq5 yq5Var = this.b;
        switch (i2) {
            case 0:
                CallLinkInfoScreen callLinkInfoScreen = (CallLinkInfoScreen) widget;
                b6a b6aVar = CallLinkInfoScreen.A0;
                float interpolation = yq5Var.getInterpolation(Math.abs(i) / inVar.getTotalScrollRange());
                float f = 1.0f - interpolation;
                bbd bbdVar = callLinkInfoScreen.Y;
                yy7[] yy7VarArr = CallLinkInfoScreen.B0;
                ((LinearLayout) bbdVar.D(callLinkInfoScreen, yy7VarArr[0])).setAlpha(f);
                LinearLayout linearLayout = (LinearLayout) bbdVar.D(callLinkInfoScreen, yy7VarArr[0]);
                int i3 = f <= 0.1f ? 4 : 0;
                if (linearLayout.getVisibility() != i3) {
                    linearLayout.setVisibility(i3);
                }
                callLinkInfoScreen.A0().setTitleAlpha(interpolation);
                break;
            case 1:
                CallOpponentsListWidget callOpponentsListWidget = (CallOpponentsListWidget) widget;
                yy7[] yy7VarArr2 = CallOpponentsListWidget.H0;
                float interpolation2 = yq5Var.getInterpolation(Math.abs(i) / inVar.getTotalScrollRange());
                float f2 = 1.0f - interpolation2;
                callOpponentsListWidget.z0().setAlpha(f2);
                mfh.o(callOpponentsListWidget.z0(), f2 > 0.1f);
                callOpponentsListWidget.D0().setTitleAlpha(interpolation2);
                break;
            case 2:
                ProfileEditScreen profileEditScreen = (ProfileEditScreen) widget;
                yy7[] yy7VarArr3 = ProfileEditScreen.x0;
                float interpolation3 = yq5Var.getInterpolation(Math.abs(i) / inVar.getTotalScrollRange());
                ((LinearLayout) profileEditScreen.s0.D(profileEditScreen, ProfileEditScreen.x0[3])).setAlpha(1.0f - interpolation3);
                profileEditScreen.y0().setTitleAlpha(interpolation3);
                break;
            default:
                ProfileScreen profileScreen = (ProfileScreen) widget;
                yy7[] yy7VarArr4 = ProfileScreen.C0;
                float interpolation4 = yq5Var.getInterpolation(Math.abs(i) / inVar.getTotalScrollRange());
                ((LinearLayout) profileScreen.Z.D(profileScreen, ProfileScreen.C0[3])).setAlpha(1.0f - interpolation4);
                profileScreen.B0().setTitleAlpha(interpolation4);
                break;
        }
    }
}
