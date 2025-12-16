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
import defpackage.c0i;
import defpackage.cm6;
import defpackage.d0i;
import defpackage.d9e;
import defpackage.dse;
import defpackage.dwh;
import defpackage.e0i;
import defpackage.e91;
import defpackage.ehg;
import defpackage.eo7;
import defpackage.g4b;
import defpackage.g56;
import defpackage.gfb;
import defpackage.gw0;
import defpackage.h0i;
import defpackage.hgb;
import defpackage.igb;
import defpackage.k18;
import defpackage.k1e;
import defpackage.ka5;
import defpackage.kph;
import defpackage.kti;
import defpackage.l38;
import defpackage.m;
import defpackage.qfb;
import defpackage.toc;
import defpackage.tqi;
import defpackage.uif;
import defpackage.vid;
import defpackage.vw4;
import defpackage.yfb;
import defpackage.yy7;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lone/me/webapp/settings/WebAppsSettingScreen;", "Lone/me/sdk/arch/Widget;", "<init>", "()V", "web-app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"ValidController"})
/* loaded from: classes2.dex */
public final class WebAppsSettingScreen extends Widget {
    public static final /* synthetic */ yy7[] o;
    public final ka5 a;
    public final k18 b;
    public final bbd c;
    public final b0i d;

    static {
        toc tocVar = new toc(WebAppsSettingScreen.class, "recycler", "getRecycler()Landroidx/recyclerview/widget/RecyclerView;", 0);
        vid.a.getClass();
        o = new yy7[]{tocVar};
    }

    /* JADX WARN: Multi-variable type inference failed */
    public WebAppsSettingScreen() {
        super(null, 0, 3, 0 == true ? 1 : 0);
        this.a = new ka5(new dwh(2), (cm6) null, 6);
        k18 k18VarCreateViewModelLazy = createViewModelLazy(h0i.class, new uif(14, new dwh(3)));
        this.b = k18VarCreateViewModelLazy;
        this.c = viewBinding(hgb.i);
        this.d = new b0i(((g4b) kph.a.getAccessor().c(56)).a(), new e0i(this), 0);
        gw0.w(new g56(((h0i) k18VarCreateViewModelLazy.getValue()).X, new c0i(null, this), 1), getLifecycleScope());
    }

    @Override // one.me.sdk.arch.Widget
    /* renamed from: getInsetsConfig */
    public final eo7 getA() {
        eo7 eo7Var = eo7.e;
        return eo7.f;
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
        yfbVar.setTitle(igb.m);
        yfbVar.setForm(qfb.a);
        yfbVar.setLeftActions(new gfb(new dse(15, this)));
        linearLayout.addView(yfbVar);
        RecyclerView recyclerView = new RecyclerView(linearLayout.getContext(), null);
        recyclerView.setId(hgb.i);
        recyclerView.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        float f = 12;
        recyclerView.setPadding(kti.d(vw4.d().getDisplayMetrics().density * f), recyclerView.getPaddingTop(), kti.d(f * vw4.d().getDisplayMetrics().density), recyclerView.getPaddingBottom());
        recyclerView.setAdapter(this.d);
        recyclerView.j(new d9e(a93.s0.y(recyclerView), new ehg(18, this), null, null, 28));
        recyclerView.j(new e91());
        linearLayout.addView(recyclerView);
        tqi.c(new m(3, null, 22), linearLayout);
        return linearLayout;
    }

    @Override // defpackage.c54
    public final void onDestroyView(View view) {
        ((RecyclerView) this.c.D(this, o[0])).setAdapter(null);
        super.onDestroyView(view);
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        gw0.w(new g56(aw0.a(((h0i) this.b.getValue()).Y, getViewLifecycleOwner().p(), l38.d), new d0i(null, this), 1), getViewLifecycleScope());
    }
}
