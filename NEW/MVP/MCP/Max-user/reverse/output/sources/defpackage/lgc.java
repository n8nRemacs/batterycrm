package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout$ScrollingViewBehavior;
import one.me.profileedit.ProfileEditScreen;

/* loaded from: classes2.dex */
public final /* synthetic */ class lgc implements em6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ProfileEditScreen b;

    public /* synthetic */ lgc(ProfileEditScreen profileEditScreen, int i) {
        this.a = i;
        this.b = profileEditScreen;
    }

    @Override // defpackage.em6
    public final Object invoke(Object obj) {
        int i = this.a;
        int i2 = 0;
        int i3 = 1;
        qqg qqgVar = qqg.a;
        ProfileEditScreen profileEditScreen = this.b;
        switch (i) {
            case 0:
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) obj;
                yy7[] yy7VarArr = ProfileEditScreen.x0;
                in inVar = new in(coordinatorLayout.getContext());
                inVar.setId(r8b.T);
                inVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                inVar.setBackground(null);
                inVar.setLiftOnScroll(true);
                inVar.setStateListAnimator(null);
                lgc lgcVar = new lgc(profileEditScreen, i3);
                re3 re3Var = new re3(inVar.getContext());
                re3Var.setId(View.generateViewId());
                gn gnVar = new gn();
                gnVar.a = 19;
                re3Var.setLayoutParams(gnVar);
                re3Var.setTitleEnabled(false);
                lgcVar.invoke(re3Var);
                inVar.addView(re3Var);
                coordinatorLayout.addView(inVar);
                RecyclerView recyclerView = new RecyclerView(coordinatorLayout.getContext(), null);
                recyclerView.setId(r8b.q0);
                d74 d74Var = new d74(-1, -1);
                d74Var.b(new AppBarLayout$ScrollingViewBehavior());
                recyclerView.setLayoutParams(d74Var);
                recyclerView.getContext();
                recyclerView.setLayoutManager(new LinearLayoutManager());
                recyclerView.setClipToPadding(false);
                recyclerView.setClipChildren(false);
                recyclerView.setAdapter(profileEditScreen.o);
                recyclerView.setItemAnimator(null);
                int[] iArr = {2048, 128, 1, 2, 512, 131072};
                i8a i8aVar = vo7.a;
                i8a i8aVar2 = new i8a(6);
                for (int i4 = 0; i4 < 6; i4++) {
                    i8aVar2.h(iArr[i4]);
                }
                recyclerView.j(new d9e(a93.s0.y(recyclerView), new z9a(profileEditScreen, 8, i8aVar2), null, null, 28));
                recyclerView.j(new vo8(0));
                coordinatorLayout.addView(recyclerView);
                break;
            case 1:
                re3 re3Var2 = (re3) obj;
                yy7[] yy7VarArr2 = ProfileEditScreen.x0;
                Toolbar toolbar = new Toolbar(re3Var2.getContext(), null);
                toolbar.setId(View.generateViewId());
                oe3 oe3Var = new oe3(-1, -2);
                oe3Var.a = 1;
                toolbar.setLayoutParams(oe3Var);
                toolbar.setNavigationIcon((Drawable) null);
                toolbar.u(0, 0);
                yy7[] yy7VarArr3 = ProfileEditScreen.x0;
                yfb yfbVar = new yfb(toolbar.getContext(), 6);
                yfbVar.setId(r8b.p0);
                yfbVar.setForm(qfb.a);
                yfbVar.setLeftActions(new gfb(new lgc(profileEditScreen, 3)));
                yfbVar.setRightActions(jfb.a);
                toolbar.addView(yfbVar);
                re3Var2.addView(toolbar);
                lgc lgcVar2 = new lgc(profileEditScreen, 2);
                LinearLayout linearLayout = new LinearLayout(re3Var2.getContext());
                linearLayout.setId(r8b.a0);
                oe3 oe3Var2 = new oe3(-1, -2);
                oe3Var2.a = 2;
                ((FrameLayout.LayoutParams) oe3Var2).bottomMargin = kti.d(16 * vw4.d().getDisplayMetrics().density);
                linearLayout.setLayoutParams(oe3Var2);
                linearLayout.setOrientation(1);
                lgcVar2.invoke(linearLayout);
                re3Var2.addView(linearLayout);
                break;
            case 2:
                LinearLayout linearLayout2 = (LinearLayout) obj;
                yy7[] yy7VarArr4 = ProfileEditScreen.x0;
                uxa uxaVar = new uxa(linearLayout2.getContext());
                uxaVar.setId(r8b.U);
                float f = 96;
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(f * vw4.d().getDisplayMetrics().density));
                layoutParams.gravity = 1;
                layoutParams.topMargin = kti.d(6 * vw4.d().getDisplayMetrics().density);
                uxaVar.setLayoutParams(layoutParams);
                uxaVar.setAddBadgeVisibility(false);
                f8j.d(uxaVar, 300L, new kgc(profileEditScreen, i2));
                linearLayout2.addView(uxaVar);
                break;
            case 3:
                yy7[] yy7VarArr5 = ProfileEditScreen.x0;
                jva onBackPressedDispatcher = profileEditScreen.getOnBackPressedDispatcher();
                if (onBackPressedDispatcher != null) {
                    onBackPressedDispatcher.d();
                    break;
                }
                break;
            default:
                yy7[] yy7VarArr6 = ProfileEditScreen.x0;
                profileEditScreen.z0().w();
                break;
        }
        return qqgVar;
    }
}
