package one.me.aboutappsettings;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.a0;
import defpackage.a93;
import defpackage.aw0;
import defpackage.d9e;
import defpackage.e91;
import defpackage.eo7;
import defpackage.f;
import defpackage.fb6;
import defpackage.g4b;
import defpackage.g56;
import defpackage.gfb;
import defpackage.gw0;
import defpackage.hbd;
import defpackage.k;
import defpackage.k18;
import defpackage.kce;
import defpackage.kti;
import defpackage.l;
import defpackage.l38;
import defpackage.l48;
import defpackage.m;
import defpackage.n;
import defpackage.o;
import defpackage.q;
import defpackage.qfb;
import defpackage.qq3;
import defpackage.t2d;
import defpackage.tqi;
import defpackage.uy0;
import defpackage.vw4;
import defpackage.x9f;
import defpackage.xfh;
import defpackage.y;
import defpackage.yfb;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lone/me/aboutappsettings/AboutAppSettingsScreen;", "Lone/me/sdk/arch/Widget;", "Lqq3;", "<init>", "()V", "about-app-settings_playGoogleRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"ValidController"})
/* loaded from: classes.dex */
public final class AboutAppSettingsScreen extends Widget implements qq3 {
    public static final /* synthetic */ int c = 0;
    public final k18 a;
    public final fb6 b;

    /* JADX WARN: Multi-variable type inference failed */
    public AboutAppSettingsScreen() {
        super(null, 0, 3, 0 == true ? 1 : 0);
        this.a = createViewModelLazy(a0.class, new q(0, new l(0)));
        int i = 1;
        this.b = new fb6(((g4b) f.a.getAccessor().d(56).getValue()).a(), new kce(i, this), i);
    }

    @Override // defpackage.qq3
    public final void g(int i, Bundle bundle) {
        if (i != 1) {
            return;
        }
        a0 a0VarY0 = y0();
        x9f x9fVar = a0VarY0.s0;
        if (x9fVar == null || !x9fVar.isActive()) {
            a0VarY0.s0 = xfh.o(a0VarY0, null, new y(a0VarY0, null), 3);
        }
    }

    @Override // one.me.sdk.arch.Widget
    /* renamed from: getInsetsConfig */
    public final eo7 getC() {
        eo7 eo7Var = eo7.e;
        return eo7.f;
    }

    @Override // one.me.sdk.arch.Widget, defpackage.c54
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        yfb yfbVar = new yfb(getContext(), 6);
        yfbVar.setForm(qfb.a);
        yfbVar.setTitle(t2d.about_app_settings_toolbar_title);
        yfbVar.setLeftActions(new gfb(new k(0, this)));
        RecyclerView recyclerView = new RecyclerView(getContext(), null);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        float f = 12;
        recyclerView.setPaddingRelative(kti.d(vw4.d().getDisplayMetrics().density * f), recyclerView.getPaddingTop(), kti.d(f * vw4.d().getDisplayMetrics().density), recyclerView.getPaddingBottom());
        recyclerView.setLayoutParams(layoutParams);
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        recyclerView.setAdapter(this.b);
        recyclerView.j(new d9e(a93.s0.y(recyclerView), new uy0(7), null, null, 24));
        recyclerView.j(new e91(kti.d(24 * vw4.d().getDisplayMetrics().density), 5));
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        linearLayout.setOrientation(1);
        linearLayout.addView(yfbVar);
        linearLayout.addView(recyclerView);
        tqi.c(new m(3, null, 0), linearLayout);
        return linearLayout;
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        hbd hbdVar = y0().Z;
        l48 l48VarP = getViewLifecycleOwner().p();
        l38 l38Var = l38.d;
        gw0.w(new g56(aw0.a(hbdVar, l48VarP, l38Var), new n(null, this), 1), getViewLifecycleScope());
        gw0.w(new g56(aw0.a(y0().X, getViewLifecycleOwner().p(), l38Var), new o(null, this), 1), getViewLifecycleScope());
    }

    public final a0 y0() {
        return (a0) this.a.getValue();
    }
}
