package one.me.settings.media.ui;

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
import defpackage.awd;
import defpackage.bbd;
import defpackage.bzb;
import defpackage.cm6;
import defpackage.d9e;
import defpackage.efd;
import defpackage.eo7;
import defpackage.fb5;
import defpackage.g4b;
import defpackage.g56;
import defpackage.gbb;
import defpackage.gfb;
import defpackage.gle;
import defpackage.gw0;
import defpackage.ibb;
import defpackage.iqb;
import defpackage.k18;
import defpackage.k1e;
import defpackage.ka5;
import defpackage.kpe;
import defpackage.l38;
import defpackage.lpe;
import defpackage.m;
import defpackage.qfb;
import defpackage.qq3;
import defpackage.sle;
import defpackage.toc;
import defpackage.tqi;
import defpackage.u4e;
import defpackage.vdc;
import defpackage.vid;
import defpackage.yfb;
import defpackage.yy7;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lone/me/settings/media/ui/SettingMediaScreen;", "Lone/me/sdk/arch/Widget;", "Lqq3;", "<init>", "()V", "settings-media_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SettingMediaScreen extends Widget implements qq3 {
    public static final /* synthetic */ yy7[] X;
    public final ka5 a;
    public final eo7 b;
    public final k18 c;
    public final bbd d;
    public final kpe o;

    static {
        toc tocVar = new toc(SettingMediaScreen.class, "recycler", "getRecycler()Landroidx/recyclerview/widget/RecyclerView;", 0);
        vid.a.getClass();
        X = new yy7[]{tocVar};
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SettingMediaScreen() {
        super(null, 0, 3, 0 == true ? 1 : 0);
        this.a = new ka5(new efd(14), (cm6) null, 6);
        this.b = eo7.f;
        this.c = createViewModelLazy(sle.class, new vdc(14, new efd(15)));
        this.d = viewBinding(gbb.y);
        kpe kpeVar = new kpe(new awd(1, this), ((g4b) lpe.a.getAccessor().c(56)).a());
        this.o = kpeVar;
        gw0.w(new g56(y0().Y, new bzb(2, kpeVar, kpe.class, "submitList", "submitList(Ljava/util/List;)V", 4, 6), 1), getLifecycleScope());
    }

    @Override // defpackage.qq3
    public final void g(int i, Bundle bundle) {
        y0().v(i);
    }

    @Override // one.me.sdk.arch.Widget
    /* renamed from: getInsetsConfig, reason: from getter */
    public final eo7 getA() {
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
        yfbVar.setId(gbb.B);
        yfbVar.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        yfbVar.setTitle(ibb.t);
        yfbVar.setForm(qfb.a);
        yfbVar.setLeftActions(new gfb(new iqb(26, this)));
        linearLayout.addView(yfbVar);
        RecyclerView recyclerView = new RecyclerView(linearLayout.getContext(), null);
        recyclerView.setId(gbb.y);
        recyclerView.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        recyclerView.setAdapter(this.o);
        recyclerView.setItemAnimator(null);
        recyclerView.j(new d9e(a93.s0.y(recyclerView), new u4e(7, this), null, null, 28));
        recyclerView.j(new fb5(2));
        linearLayout.addView(recyclerView);
        tqi.c(new m(3, null, 14), linearLayout);
        return linearLayout;
    }

    @Override // defpackage.c54
    public final void onDestroyView(View view) {
        ((RecyclerView) this.d.D(this, X[0])).setAdapter(null);
        super.onDestroyView(view);
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        gw0.w(new g56(aw0.a(y0().z0, getViewLifecycleOwner().p(), l38.d), new gle(null, this), 1), getViewLifecycleScope());
    }

    public final sle y0() {
        return (sle) this.c.getValue();
    }
}
