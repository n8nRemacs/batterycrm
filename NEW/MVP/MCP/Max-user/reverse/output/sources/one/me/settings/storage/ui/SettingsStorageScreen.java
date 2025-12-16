package one.me.settings.storage.ui;

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
import defpackage.bbd;
import defpackage.bzb;
import defpackage.d9e;
import defpackage.dse;
import defpackage.efd;
import defpackage.eo7;
import defpackage.ese;
import defpackage.f1e;
import defpackage.fb5;
import defpackage.g4b;
import defpackage.g56;
import defpackage.gfb;
import defpackage.gw0;
import defpackage.ise;
import defpackage.k18;
import defpackage.k1e;
import defpackage.ka5;
import defpackage.l38;
import defpackage.m;
import defpackage.nse;
import defpackage.qfb;
import defpackage.qq3;
import defpackage.tbb;
import defpackage.toc;
import defpackage.tqi;
import defpackage.u4e;
import defpackage.ubb;
import defpackage.vdc;
import defpackage.vid;
import defpackage.vre;
import defpackage.wre;
import defpackage.xfh;
import defpackage.yfb;
import defpackage.yy7;
import defpackage.zid;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lone/me/settings/storage/ui/SettingsStorageScreen;", "Lone/me/sdk/arch/Widget;", "Lqq3;", "<init>", "()V", "settings-storage_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SettingsStorageScreen extends Widget implements qq3 {
    public static final /* synthetic */ yy7[] X;
    public final k18 a;
    public final bbd b;
    public final vre c;
    public final eo7 d;
    public final ka5 o;

    static {
        toc tocVar = new toc(SettingsStorageScreen.class, "recycler", "getRecycler()Landroidx/recyclerview/widget/RecyclerView;", 0);
        vid.a.getClass();
        X = new yy7[]{tocVar};
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SettingsStorageScreen() {
        super(null, 0, 3, 0 == true ? 1 : 0);
        k18 k18VarCreateViewModelLazy = createViewModelLazy(nse.class, new vdc(19, new efd(28)));
        this.a = k18VarCreateViewModelLazy;
        this.b = viewBinding(tbb.D);
        vre vreVar = new vre(new zid(this), ((g4b) wre.a.getAccessor().c(56)).a());
        this.c = vreVar;
        this.d = eo7.f;
        this.o = new ka5(f1e.SETTINGS_CACHE);
        gw0.w(new g56(((nse) k18VarCreateViewModelLazy.getValue()).s0, new bzb(2, vreVar, vre.class, "submitList", "submitList(Ljava/util/List;)V", 4, 9), 1), getLifecycleScope());
    }

    @Override // defpackage.qq3
    public final void g(int i, Bundle bundle) {
        ((nse) this.a.getValue()).w(i);
    }

    @Override // one.me.sdk.arch.Widget
    /* renamed from: getInsetsConfig, reason: from getter */
    public final eo7 getO() {
        return this.d;
    }

    @Override // one.me.sdk.arch.Widget
    public final k1e getScreenDelegate() {
        return this.o;
    }

    @Override // defpackage.c54
    public final void onAttach(View view) {
        super.onAttach(view);
        nse nseVar = (nse) this.a.getValue();
        nseVar.getClass();
        nseVar.v0.O(nseVar, nse.x0[2], xfh.o(nseVar, null, new ise(nseVar, null), 1));
    }

    @Override // one.me.sdk.arch.Widget, defpackage.c54
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Context context = layoutInflater.getContext();
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setOrientation(1);
        yfb yfbVar = new yfb(linearLayout.getContext(), 6);
        yfbVar.setId(tbb.I);
        yfbVar.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        yfbVar.setTitle(ubb.y);
        yfbVar.setLeftActions(new gfb(new dse(0, this)));
        yfbVar.setForm(qfb.a);
        linearLayout.addView(yfbVar);
        RecyclerView recyclerView = new RecyclerView(linearLayout.getContext(), null);
        recyclerView.setId(tbb.D);
        recyclerView.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        recyclerView.setAdapter(this.c);
        recyclerView.setItemAnimator(null);
        recyclerView.j(new d9e(a93.s0.y(recyclerView), new u4e(10, this), null, null, 28));
        recyclerView.j(new fb5(5));
        linearLayout.addView(recyclerView);
        tqi.c(new m(3, null, 18), linearLayout);
        return linearLayout;
    }

    @Override // defpackage.c54
    public final void onDestroyView(View view) {
        ((RecyclerView) this.b.D(this, X[0])).setAdapter(null);
        super.onDestroyView(view);
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        gw0.w(new g56(aw0.a(((nse) this.a.getValue()).w0, getViewLifecycleOwner().p(), l38.d), new ese(null, this), 1), getViewLifecycleScope());
    }
}
