package defpackage;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout$ScrollingViewBehavior;
import kotlin.coroutines.Continuation;
import one.me.login.neuroavatars.NeuroAvatarsScreen;
import one.me.sdk.uikit.common.button.OneMeButton;

/* loaded from: classes2.dex */
public final /* synthetic */ class nfa implements em6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ NeuroAvatarsScreen b;

    public /* synthetic */ nfa(NeuroAvatarsScreen neuroAvatarsScreen, int i) {
        this.a = i;
        this.b = neuroAvatarsScreen;
    }

    @Override // defpackage.em6
    public final Object invoke(Object obj) {
        int i = this.a;
        Continuation continuation = null;
        qqg qqgVar = qqg.a;
        int i2 = 1;
        NeuroAvatarsScreen neuroAvatarsScreen = this.b;
        int i3 = 0;
        switch (i) {
            case 0:
                re3 re3Var = (re3) obj;
                yy7[] yy7VarArr = NeuroAvatarsScreen.K0;
                Toolbar toolbar = new Toolbar(re3Var.getContext(), null);
                float f = 52;
                oe3 oe3Var = new oe3(-1, kti.d(vw4.d().getDisplayMetrics().density * f));
                oe3Var.a = 1;
                toolbar.setLayoutParams(oe3Var);
                toolbar.setNavigationIcon((Drawable) null);
                toolbar.u(0, 0);
                yy7[] yy7VarArr2 = NeuroAvatarsScreen.K0;
                uha.E(toolbar, neuroAvatarsScreen.C0().t0, new nfa(neuroAvatarsScreen, i2));
                re3Var.addView(toolbar);
                LinearLayout linearLayout = new LinearLayout(re3Var.getContext());
                linearLayout.setId(xyc.oneme_login_neuro_avatars_collapsible);
                oe3 oe3Var2 = new oe3(-1, -2);
                oe3Var2.a = 2;
                float f2 = 24;
                oe3Var2.setMargins(0, u45.c(f, vw4.d().getDisplayMetrics().density, kti.d(vw4.d().getDisplayMetrics().density * f2)), 0, kti.d(f2 * vw4.d().getDisplayMetrics().density));
                linearLayout.setLayoutParams(oe3Var2);
                linearLayout.setOrientation(1);
                yy7[] yy7VarArr3 = NeuroAvatarsScreen.K0;
                uha.D(linearLayout, neuroAvatarsScreen.C0().t0);
                re3Var.addView(linearLayout);
                break;
            case 1:
                yy7[] yy7VarArr4 = NeuroAvatarsScreen.K0;
                neuroAvatarsScreen.getRouter().C();
                break;
            case 2:
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) obj;
                yy7[] yy7VarArr5 = NeuroAvatarsScreen.K0;
                int i4 = 3;
                nfa nfaVar = new nfa(neuroAvatarsScreen, i4);
                View inVar = new in(coordinatorLayout.getContext());
                inVar.setId(xyc.oneme_login_neuro_avatars_appbar);
                inVar.setLayoutParams(new d74(-1, -2));
                inVar.setElevation(0.0f);
                tqi.c(new rfa(3, null, 0), inVar);
                nfaVar.invoke(inVar);
                coordinatorLayout.addView(inVar);
                b0i b0iVar = neuroAvatarsScreen.G0;
                oga ogaVarC0 = neuroAvatarsScreen.C0();
                d74 d74Var = new d74(-1, -1);
                d74Var.b(new AppBarLayout$ScrollingViewBehavior());
                RecyclerView recyclerView = new RecyclerView(coordinatorLayout.getContext(), null);
                recyclerView.setId(xyc.oneme_login_neuro_avatars_recycler_view);
                recyclerView.setLayoutParams(d74Var);
                recyclerView.setClipToPadding(false);
                recyclerView.setItemAnimator(null);
                recyclerView.setOverScrollMode(2);
                recyclerView.getContext();
                recyclerView.setLayoutManager(new GridLayoutManager(4));
                recyclerView.setAdapter(b0iVar);
                tx3 tx3Var = new tx3(recyclerView, b0iVar, new hu1(b0iVar, 6, ogaVarC0));
                ec6 ec6Var = new ec6(new z11(12, b0iVar), recyclerView.getContext());
                recyclerView.j(tx3Var);
                recyclerView.j(ec6Var);
                float f3 = 16;
                float f4 = 12;
                recyclerView.j(new m01(kti.d(vw4.d().getDisplayMetrics().density * f3), kti.d(vw4.d().getDisplayMetrics().density * f4), 7));
                coordinatorLayout.addView(recyclerView);
                recyclerView.m(neuroAvatarsScreen.H0);
                d74 d74Var2 = new d74(-1, -2);
                d74Var2.c = 80;
                FrameLayout frameLayout = new FrameLayout(coordinatorLayout.getContext());
                frameLayout.setId(xyc.oneme_login_neuro_avatars_button_background);
                frameLayout.setLayoutParams(d74Var2);
                frameLayout.setBackground(new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, a93.s0.y(frameLayout).d().c.a));
                zfi.a(frameLayout);
                OneMeButton oneMeButton = new OneMeButton(frameLayout.getContext(), null);
                oneMeButton.setId(xyc.oneme_login_neuro_avatars_continue_btn);
                oneMeButton.setMode(iza.a);
                oneMeButton.setSize(jza.c);
                oneMeButton.setAppearance(gza.d);
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
                layoutParams.setMargins(kti.d(vw4.d().getDisplayMetrics().density * f4), 0, kti.d(f4 * vw4.d().getDisplayMetrics().density), kti.d(f3 * vw4.d().getDisplayMetrics().density));
                layoutParams.gravity = 48;
                oneMeButton.setLayoutParams(layoutParams);
                oneMeButton.setText(neuroAvatarsScreen.C0().t0.c);
                frameLayout.addView(oneMeButton);
                frameLayout.addOnLayoutChangeListener(new pt1(recyclerView, 3, frameLayout));
                tqi.c(new sv2(i4, continuation, 4), frameLayout);
                coordinatorLayout.addView(frameLayout);
                break;
            default:
                in inVar2 = (in) obj;
                yy7[] yy7VarArr6 = NeuroAvatarsScreen.K0;
                nfa nfaVar2 = new nfa(neuroAvatarsScreen, i3);
                re3 re3Var2 = new re3(inVar2.getContext());
                gn gnVar = new gn();
                gnVar.a = 19;
                re3Var2.setLayoutParams(gnVar);
                re3Var2.setTitleEnabled(false);
                nfaVar2.invoke(re3Var2);
                inVar2.addView(re3Var2);
                float f5 = 96;
                uha.B(inVar2, (Drawable) neuroAvatarsScreen.J0.getValue(), new ofa(neuroAvatarsScreen, i3), new ofa(neuroAvatarsScreen, i2), kti.d(vw4.d().getDisplayMetrics().density * f5), kti.d(f5 * vw4.d().getDisplayMetrics().density), new dga(0), new dga(1));
                uha.C(inVar2);
                break;
        }
        return qqgVar;
    }
}
