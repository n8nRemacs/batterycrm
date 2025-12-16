package one.me.webapp.settings;

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
import defpackage.b0i;
import defpackage.bbd;
import defpackage.cm6;
import defpackage.cwh;
import defpackage.d9e;
import defpackage.dwh;
import defpackage.e91;
import defpackage.ehg;
import defpackage.eo7;
import defpackage.ewh;
import defpackage.fwh;
import defpackage.g4b;
import defpackage.g56;
import defpackage.gfb;
import defpackage.goh;
import defpackage.gw0;
import defpackage.gwh;
import defpackage.gwi;
import defpackage.hbd;
import defpackage.hgb;
import defpackage.ho7;
import defpackage.hwh;
import defpackage.imb;
import defpackage.k18;
import defpackage.k1e;
import defpackage.ka5;
import defpackage.kph;
import defpackage.kti;
import defpackage.l38;
import defpackage.l48;
import defpackage.m;
import defpackage.owh;
import defpackage.qfb;
import defpackage.qq3;
import defpackage.sxa;
import defpackage.toc;
import defpackage.tqi;
import defpackage.uif;
import defpackage.vid;
import defpackage.vw4;
import defpackage.wj1;
import defpackage.yfb;
import defpackage.yy7;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\t¨\u0006\n"}, d2 = {"Lone/me/webapp/settings/WebAppSettingsScreen;", "Lone/me/sdk/arch/Widget;", "Lqq3;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", "botId", "(J)V", "web-app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"ValidController"})
/* loaded from: classes2.dex */
public final class WebAppSettingsScreen extends Widget implements qq3 {
    public static final /* synthetic */ yy7[] Z = {new toc(WebAppSettingsScreen.class, "botId", "getBotId()J", 0), ho7.d(vid.a, WebAppSettingsScreen.class, "recycler", "getRecycler()Landroidx/recyclerview/widget/RecyclerView;", 0), new toc(WebAppSettingsScreen.class, "toolbar", "getToolbar()Lone/me/sdk/uikit/common/toolbar/OneMeToolbar;", 0)};
    public goh X;
    public final b0i Y;
    public final ka5 a;
    public final eo7 b;
    public final k18 c;
    public final bbd d;
    public final bbd o;

    public WebAppSettingsScreen(Bundle bundle) {
        super(bundle, 0, 2, null);
        this.a = new ka5(new dwh(0), (cm6) null, 6);
        this.b = eo7.f;
        this.c = createViewModelLazy(owh.class, new uif(13, new wj1(bundle, 20)));
        this.d = viewBinding(hgb.i);
        this.o = viewBinding(hgb.l);
        this.Y = new b0i(((g4b) kph.a.getAccessor().c(56)).a(), new hwh(this), 0);
    }

    @Override // defpackage.qq3
    public final void g(int i, Bundle bundle) {
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

    @Override // one.me.sdk.arch.Widget, defpackage.c54
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Context context = layoutInflater.getContext();
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setOrientation(1);
        yfb yfbVar = new yfb(linearLayout.getContext(), 6);
        yfbVar.setId(hgb.l);
        yfbVar.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        yfbVar.setForm(qfb.a);
        yfbVar.setLeftActions(new gfb(new cwh(this, 1)));
        linearLayout.addView(yfbVar);
        RecyclerView recyclerView = new RecyclerView(linearLayout.getContext(), null);
        recyclerView.setId(hgb.i);
        recyclerView.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        recyclerView.setAdapter(this.Y);
        float f = 12;
        recyclerView.setPadding(kti.d(vw4.d().getDisplayMetrics().density * f), recyclerView.getPaddingTop(), kti.d(f * vw4.d().getDisplayMetrics().density), recyclerView.getPaddingBottom());
        recyclerView.j(new d9e(a93.s0.y(recyclerView), new ehg(17, this), null, null, 28));
        recyclerView.j(new e91());
        linearLayout.addView(recyclerView);
        tqi.c(new m(3, null, 21), linearLayout);
        return linearLayout;
    }

    @Override // defpackage.c54
    public final void onDestroyView(View view) {
        ((RecyclerView) this.d.D(this, Z[1])).setAdapter(null);
        this.X = null;
        super.onDestroyView(view);
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        this.X = new goh(requireActivity(), new cwh(this, 0), new sxa(0, y0(), owh.class, "onBiometryFail", "onBiometryFail()V", 0, 12));
        hbd hbdVar = y0().u0;
        l48 l48VarP = getViewLifecycleOwner().p();
        l38 l38Var = l38.d;
        gw0.w(new g56(aw0.a(hbdVar, l48VarP, l38Var), new ewh(null, this), 1), getViewLifecycleScope());
        gw0.w(new g56(aw0.a(y0().v0, getViewLifecycleOwner().p(), l38Var), new fwh(null, this), 1), getViewLifecycleScope());
        gw0.w(new g56(aw0.a(y0().w0, getViewLifecycleOwner().p(), l38Var), new gwh(null, this), 1), getViewLifecycleScope());
    }

    public final owh y0() {
        return (owh) this.c.getValue();
    }

    public WebAppSettingsScreen(long j) {
        this(gwi.b(new imb("bot_id_arg", Long.valueOf(j))));
    }
}
