package one.me.settings.twofa.configuration;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.a93;
import defpackage.aw0;
import defpackage.bzb;
import defpackage.ci5;
import defpackage.d9e;
import defpackage.dse;
import defpackage.e0d;
import defpackage.ehg;
import defpackage.eo7;
import defpackage.f1e;
import defpackage.g4b;
import defpackage.g56;
import defpackage.gfb;
import defpackage.gw0;
import defpackage.gwi;
import defpackage.i84;
import defpackage.imb;
import defpackage.ing;
import defpackage.ipi;
import defpackage.jng;
import defpackage.k18;
import defpackage.k1e;
import defpackage.ka5;
import defpackage.kng;
import defpackage.kti;
import defpackage.kvf;
import defpackage.l38;
import defpackage.l48;
import defpackage.lre;
import defpackage.lzf;
import defpackage.m;
import defpackage.omg;
import defpackage.ong;
import defpackage.q2b;
import defpackage.qfb;
import defpackage.qq3;
import defpackage.r4d;
import defpackage.sng;
import defpackage.svi;
import defpackage.tqi;
import defpackage.uif;
import defpackage.vw4;
import defpackage.wj1;
import defpackage.yfb;
import defpackage.ykg;
import defpackage.zid;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\t¨\u0006\n"}, d2 = {"Lone/me/settings/twofa/configuration/TwoFASettingsScreen;", "Lone/me/sdk/arch/Widget;", "Lqq3;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", "trackId", "(Ljava/lang/String;)V", "settings-twofa_playGoogleRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"ValidController"})
/* loaded from: classes2.dex */
public final class TwoFASettingsScreen extends Widget implements qq3 {
    public static final /* synthetic */ int X = 0;
    public final ka5 a;
    public final eo7 b;
    public final k18 c;
    public final ing d;
    public final Object o;

    public TwoFASettingsScreen(Bundle bundle) {
        super(bundle, 0, 2, null);
        this.a = new ka5(f1e.SETTINGS_2FA);
        this.b = eo7.f;
        k18 k18VarCreateViewModelLazy = createViewModelLazy(sng.class, new uif(6, new wj1(bundle, 18)));
        this.c = k18VarCreateViewModelLazy;
        ing ingVar = new ing(new zid(this), ((g4b) ykg.a.getAccessor().c(56)).a());
        this.d = ingVar;
        this.o = ipi.b(3, new kvf(9, this));
        gw0.w(new g56(((sng) k18VarCreateViewModelLazy.getValue()).Z, new bzb(2, ingVar, ing.class, "submitList", "submitList(Ljava/util/List;)V", 4, 27), 1), getLifecycleScope());
    }

    @Override // defpackage.qq3
    public final void g(int i, Bundle bundle) {
        sng sngVar = (sng) this.c.getValue();
        sngVar.getClass();
        if (i == e0d.oneme_settings_twofa_configuration_disable_twofa_positive || i != e0d.oneme_settings_twofa_configuration_disable_twofa_negative) {
            return;
        }
        sngVar.v0.O(sngVar, sng.x0[0], svi.d(sngVar.a, ((q2b) ((lzf) sngVar.c.getValue())).b(), i84.b, new ong(sngVar, null)));
    }

    @Override // one.me.sdk.arch.Widget
    /* renamed from: getInsetsConfig, reason: from getter */
    public final eo7 getB() {
        return this.b;
    }

    @Override // one.me.sdk.arch.Widget
    public final k1e getScreenDelegate() {
        return this.a;
    }

    @Override // defpackage.c54
    public final boolean handleBack() {
        omg.c.p0().b(":settings/privacy", null);
        return true;
    }

    @Override // one.me.sdk.arch.Widget, defpackage.c54
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Context context = layoutInflater.getContext();
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setOrientation(1);
        yfb yfbVar = new yfb(linearLayout.getContext(), 6);
        yfbVar.setId(e0d.oneme_settings_twofa_configuration_toolbar);
        yfbVar.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        yfbVar.setTitle(r4d.oneme_settings_twofa_onboarding_title);
        yfbVar.setForm(qfb.a);
        yfbVar.setLeftActions(new gfb(new dse(10, this)));
        linearLayout.addView(yfbVar);
        RecyclerView recyclerView = new RecyclerView(linearLayout.getContext(), null);
        recyclerView.setId(e0d.oneme_settings_twofa_configuration_recycler);
        recyclerView.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        float f = 12;
        recyclerView.setPadding(kti.d(vw4.d().getDisplayMetrics().density * f), recyclerView.getPaddingTop(), kti.d(f * vw4.d().getDisplayMetrics().density), recyclerView.getPaddingBottom());
        recyclerView.setAdapter(this.d);
        recyclerView.setItemAnimator(null);
        recyclerView.j(new d9e(a93.s0.y(recyclerView), new ehg(2, this), null, null, 28));
        recyclerView.j(new lre(1));
        linearLayout.addView(recyclerView);
        tqi.c(new m(3, null, 20), linearLayout);
        return linearLayout;
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        k18 k18Var = this.c;
        ci5 ci5Var = ((sng) k18Var.getValue()).s0;
        l48 l48VarP = getViewLifecycleOwner().p();
        l38 l38Var = l38.d;
        gw0.w(new g56(aw0.a(ci5Var, l48VarP, l38Var), new jng(null, this), 1), getViewLifecycleScope());
        gw0.w(new g56(aw0.a(((sng) k18Var.getValue()).t0, getViewLifecycleOwner().p(), l38Var), new kng(null, this), 1), getViewLifecycleScope());
    }

    public TwoFASettingsScreen(String str) {
        this(gwi.b(new imb("twofa_settings_track_id_key", str)));
    }
}
