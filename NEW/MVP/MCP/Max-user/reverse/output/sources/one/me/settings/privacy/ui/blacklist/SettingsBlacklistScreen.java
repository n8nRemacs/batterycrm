package one.me.settings.privacy.ui.blacklist;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import defpackage.a93;
import defpackage.aw0;
import defpackage.b0i;
import defpackage.bbd;
import defpackage.bqe;
import defpackage.efd;
import defpackage.ene;
import defpackage.eo7;
import defpackage.f1e;
import defpackage.fne;
import defpackage.g4b;
import defpackage.g56;
import defpackage.gfb;
import defpackage.gw0;
import defpackage.hbd;
import defpackage.ho7;
import defpackage.iqb;
import defpackage.k18;
import defpackage.k1e;
import defpackage.ka5;
import defpackage.kbb;
import defpackage.kne;
import defpackage.l38;
import defpackage.l48;
import defpackage.lne;
import defpackage.lzf;
import defpackage.m;
import defpackage.n5g;
import defpackage.nbb;
import defpackage.q2b;
import defpackage.qfb;
import defpackage.qq3;
import defpackage.s6b;
import defpackage.toc;
import defpackage.tqi;
import defpackage.vdc;
import defpackage.vid;
import defpackage.x3b;
import defpackage.xfh;
import defpackage.yf5;
import defpackage.yfb;
import defpackage.yud;
import defpackage.yy7;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lone/me/settings/privacy/ui/blacklist/SettingsBlacklistScreen;", "Lone/me/sdk/arch/Widget;", "Lqq3;", "<init>", "()V", "settings-privacy_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"ValidController"})
/* loaded from: classes2.dex */
public final class SettingsBlacklistScreen extends Widget implements qq3 {
    public static final /* synthetic */ yy7[] Y = {new toc(SettingsBlacklistScreen.class, "recycler", "getRecycler()Lone/me/sdk/lists/widgets/EndlessRecyclerView;", 0), ho7.d(vid.a, SettingsBlacklistScreen.class, "emptyState", "getEmptyState()Lone/me/sdk/uikit/common/emptyview/OneMeEmptyView;", 0)};
    public final b0i X;
    public final ka5 a;
    public final eo7 b;
    public final k18 c;
    public final bbd d;
    public final bbd o;

    public SettingsBlacklistScreen() {
        super(null, 0, 3, null);
        this.a = new ka5(f1e.SETTINGS_PRIVACY_BLOCK_LIST);
        this.b = eo7.f;
        this.c = createViewModelLazy(lne.class, new vdc(16, new efd(19)));
        this.d = viewBinding(kbb.b);
        this.o = viewBinding(kbb.a);
        this.X = new b0i(new s6b(this), ((g4b) bqe.a.getAccessor().c(56)).a(), 11);
    }

    @Override // defpackage.qq3
    public final void g(int i, Bundle bundle) {
        if (i == kbb.d) {
            lne lneVarY0 = y0();
            lneVarY0.getClass();
            if (bundle != null) {
                xfh.o(lneVarY0, ((q2b) ((lzf) lneVarY0.Z.getValue())).b(), new kne(lneVarY0, bundle.getLong("user_unblock_id"), null), 2);
            }
        }
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
        yfbVar.setId(kbb.c);
        yfbVar.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        yfbVar.setTitle(nbb.e);
        yfbVar.setForm(qfb.a);
        yfbVar.setLeftActions(new gfb(new iqb(28, this)));
        linearLayout.addView(yfbVar);
        x3b x3bVar = new x3b(linearLayout.getContext());
        x3bVar.setId(kbb.a);
        x3bVar.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        x3bVar.setIcon(yud.o0);
        x3bVar.setTitle(new n5g(nbb.d));
        x3bVar.onThemeChanged(a93.s0.y(x3bVar));
        linearLayout.addView(x3bVar);
        yf5 yf5Var = new yf5(linearLayout.getContext(), null);
        yf5Var.setId(kbb.b);
        yf5Var.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        yf5Var.getContext();
        yf5Var.setLayoutManager(new LinearLayoutManager());
        yf5Var.setAdapter(this.X);
        yf5Var.setHasFixedSize(true);
        yf5Var.setPager(y0());
        linearLayout.addView(yf5Var);
        tqi.c(new m(3, null, 16), linearLayout);
        return linearLayout;
    }

    @Override // defpackage.c54
    public final void onDestroyView(View view) {
        ((yf5) this.d.D(this, Y[0])).setAdapter(null);
        super.onDestroyView(view);
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        hbd hbdVar = y0().t0;
        l48 l48VarP = getViewLifecycleOwner().p();
        l38 l38Var = l38.d;
        gw0.w(new g56(aw0.a(hbdVar, l48VarP, l38Var), new ene(null, this), 1), getViewLifecycleScope());
        gw0.w(new g56(aw0.a(y0().x0, getViewLifecycleOwner().p(), l38Var), new fne(null, this), 1), getViewLifecycleScope());
    }

    public final lne y0() {
        return (lne) this.c.getValue();
    }
}
