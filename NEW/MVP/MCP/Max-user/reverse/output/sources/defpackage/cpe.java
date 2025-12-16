package defpackage;

import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout$ScrollingViewBehavior;
import one.me.settings.SettingsListScreen;

/* loaded from: classes2.dex */
public final /* synthetic */ class cpe implements em6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ SettingsListScreen b;

    public /* synthetic */ cpe(SettingsListScreen settingsListScreen, int i) {
        this.a = i;
        this.b = settingsListScreen;
    }

    @Override // defpackage.em6
    public final Object invoke(Object obj) {
        int i = this.a;
        int i2 = 3;
        int i3 = 2;
        qqg qqgVar = qqg.a;
        SettingsListScreen settingsListScreen = this.b;
        switch (i) {
            case 0:
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) obj;
                yy7[] yy7VarArr = SettingsListScreen.A0;
                in inVar = new in(coordinatorLayout.getContext());
                inVar.setId(obb.g);
                inVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                tqi.c(new rfa(3, null, 1), inVar);
                settingsListScreen.x0 = inVar;
                inVar.setLiftOnScroll(true);
                re3 re3Var = new re3(inVar.getContext());
                re3Var.setId(obb.e);
                gn gnVar = new gn();
                gnVar.a = 19;
                re3Var.setLayoutParams(gnVar);
                re3Var.setTitleEnabled(false);
                yy7[] yy7VarArr2 = SettingsListScreen.A0;
                cpe cpeVar = new cpe(settingsListScreen, 1);
                Toolbar toolbar = new Toolbar(re3Var.getContext(), null);
                toolbar.setId(obb.h);
                oe3 oe3Var = new oe3(-1, -2);
                oe3Var.a = 1;
                toolbar.setLayoutParams(oe3Var);
                toolbar.setNavigationIcon((Drawable) null);
                toolbar.u(0, 0);
                cpeVar.invoke(toolbar);
                re3Var.addView(toolbar);
                re3Var.addView(new ose(re3Var.getContext()));
                inVar.addView(re3Var);
                coordinatorLayout.addView(inVar);
                RecyclerView recyclerViewB0 = settingsListScreen.B0(24);
                d74 d74Var = new d74(-1, -1);
                d74Var.b(new AppBarLayout$ScrollingViewBehavior());
                recyclerViewB0.setLayoutParams(d74Var);
                recyclerViewB0.setPaddingRelative(recyclerViewB0.getPaddingStart(), recyclerViewB0.getPaddingTop(), recyclerViewB0.getPaddingEnd(), kti.d(12 * vw4.d().getDisplayMetrics().density));
                recyclerViewB0.setClipToPadding(false);
                recyclerViewB0.setItemAnimator(null);
                recyclerViewB0.setClipChildren(false);
                recyclerViewB0.j(new y71(9));
                recyclerViewB0.j(new y71(10));
                coordinatorLayout.addView(recyclerViewB0);
                break;
            case 1:
                Toolbar toolbar2 = (Toolbar) obj;
                yy7[] yy7VarArr3 = SettingsListScreen.A0;
                yfb yfbVar = new yfb(toolbar2.getContext(), 6);
                yfbVar.setId(obb.i);
                yfbVar.setForm(qfb.a);
                yfbVar.setRightActions(new lfb(null, new rfb(yud.G, new cpe(settingsListScreen, i3)), null));
                yfbVar.setLeftActions(new kfb(new rfb(yud.H1, new cpe(settingsListScreen, i2))));
                toolbar2.addView(yfbVar);
                break;
            case 2:
                yy7[] yy7VarArr4 = SettingsListScreen.A0;
                ele eleVarD0 = settingsListScreen.D0();
                Long lX = eleVarD0.x();
                if (lX != null) {
                    xfh.r(eleVarD0.B0, new upe(lX.longValue()));
                    break;
                }
                break;
            default:
                is7 is7Var = (is7) settingsListScreen.o.getValue();
                Integer numD = ((gda) is7Var.b.getValue()).d();
                is7Var.a("click_qr", (numD != null && numD.intValue() == 100) ? "plus" : "main", "invite_friends");
                ele eleVarD02 = settingsListScreen.D0();
                xfh.o(eleVarD02, ((q2b) eleVarD02.v()).a().plus(eleVarD02.u()), new dle(eleVarD02, null), 2);
                break;
        }
        return qqgVar;
    }
}
