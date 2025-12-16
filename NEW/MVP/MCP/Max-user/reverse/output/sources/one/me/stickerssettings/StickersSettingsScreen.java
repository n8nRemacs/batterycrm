package one.me.stickerssettings;

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
import defpackage.ajf;
import defpackage.aw0;
import defpackage.bbd;
import defpackage.bjf;
import defpackage.bt7;
import defpackage.ci5;
import defpackage.cm6;
import defpackage.d9e;
import defpackage.eo7;
import defpackage.fb5;
import defpackage.g44;
import defpackage.g4b;
import defpackage.g56;
import defpackage.gfb;
import defpackage.gw0;
import defpackage.i84;
import defpackage.k18;
import defpackage.k1e;
import defpackage.ka5;
import defpackage.l38;
import defpackage.l48;
import defpackage.m;
import defpackage.nif;
import defpackage.nte;
import defpackage.oif;
import defpackage.q2b;
import defpackage.qfb;
import defpackage.qif;
import defpackage.qk;
import defpackage.qq3;
import defpackage.rif;
import defpackage.sif;
import defpackage.svi;
import defpackage.tif;
import defpackage.toc;
import defpackage.tqi;
import defpackage.tx3;
import defpackage.u4e;
import defpackage.udb;
import defpackage.uif;
import defpackage.us7;
import defpackage.v1a;
import defpackage.vdb;
import defpackage.vid;
import defpackage.yfb;
import defpackage.yif;
import defpackage.yy7;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lone/me/stickerssettings/StickersSettingsScreen;", "Lone/me/sdk/arch/Widget;", "Lg44;", "Lqq3;", "<init>", "()V", "stickers-settings_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"ValidController"})
/* loaded from: classes2.dex */
public final class StickersSettingsScreen extends Widget implements g44, qq3 {
    public static final /* synthetic */ yy7[] X;
    public final ka5 a;
    public final k18 b;
    public final bbd c;
    public bt7 d;
    public final nif o;

    static {
        toc tocVar = new toc(StickersSettingsScreen.class, "recycler", "getRecycler()Landroidx/recyclerview/widget/RecyclerView;", 0);
        vid.a.getClass();
        X = new yy7[]{tocVar};
    }

    /* JADX WARN: Multi-variable type inference failed */
    public StickersSettingsScreen() {
        super(null, 0, 3, 0 == true ? 1 : 0);
        this.a = new ka5(new nte(19), (cm6) null, 6);
        this.b = createViewModelLazy(bjf.class, new uif(0, new nte(20)));
        this.c = viewBinding(udb.f);
        this.o = new nif(((g4b) oif.a.getAccessor().c(56)).a(), new qif(this, 2), new qif(this, 3), new qif(this, 4), 0);
        gw0.w(new g56(y0().X, new rif(null, this), 1), getLifecycleScope());
    }

    @Override // defpackage.g44
    public final void C(int i, Bundle bundle) {
        bjf bjfVarY0 = y0();
        Long l = bjfVarY0.w0;
        if (l != null) {
            long jLongValue = l.longValue();
            bjfVarY0.w0 = null;
            bjfVarY0.y0.O(bjfVarY0, bjf.A0[1], svi.d(bjfVarY0.a, ((q2b) bjfVarY0.c).a(), i84.b, new ajf(bjfVarY0, jLongValue, i, null)));
        }
    }

    @Override // defpackage.qq3
    public final void g(int i, Bundle bundle) {
        bjf bjfVarY0 = y0();
        Long l = bjfVarY0.x0;
        if (l != null) {
            long jLongValue = l.longValue();
            bjfVarY0.x0 = null;
            if (i == udb.b) {
                bjfVarY0.z0.O(bjfVarY0, bjf.A0[2], svi.d(bjfVarY0.a, ((q2b) bjfVarY0.c).b(), i84.b, new yif(bjfVarY0, jLongValue, null)));
            }
        }
    }

    @Override // one.me.sdk.arch.Widget
    /* renamed from: getInsetsConfig */
    public final eo7 getD() {
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
        yfbVar.setId(udb.x);
        yfbVar.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        yfbVar.setTitle(vdb.G);
        yfbVar.setForm(qfb.a);
        yfbVar.setLeftActions(new gfb(new qif(this, 0)));
        linearLayout.addView(yfbVar);
        RecyclerView recyclerView = new RecyclerView(linearLayout.getContext(), null);
        recyclerView.setId(udb.f);
        recyclerView.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        recyclerView.setAdapter(this.o);
        u4e u4eVar = new u4e(17, this);
        v1a v1aVar = a93.s0;
        recyclerView.j(new d9e(v1aVar.y(recyclerView), u4eVar, null, null, 28));
        recyclerView.j(new tx3(v1aVar.y(recyclerView)));
        recyclerView.j(new fb5(4));
        bt7 bt7Var = new bt7(new us7(new qk(22, this), new qif(this, 1)));
        this.d = bt7Var;
        bt7Var.i(recyclerView);
        linearLayout.addView(recyclerView);
        tqi.c(new m(3, null, 19), linearLayout);
        return linearLayout;
    }

    @Override // defpackage.c54
    public final void onDestroyView(View view) {
        ((RecyclerView) this.c.D(this, X[0])).setAdapter(null);
        bt7 bt7Var = this.d;
        if (bt7Var != null) {
            bt7Var.i(null);
        }
        this.d = null;
        super.onDestroyView(view);
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        ci5 ci5Var = y0().Y;
        l48 l48VarP = getViewLifecycleOwner().p();
        l38 l38Var = l38.d;
        gw0.w(new g56(aw0.a(ci5Var, l48VarP, l38Var), new sif(null, this), 1), getViewLifecycleScope());
        gw0.w(new g56(aw0.a(y0().Z, getViewLifecycleOwner().p(), l38Var), new tif(null, this), 1), getViewLifecycleScope());
    }

    public final bjf y0() {
        return (bjf) this.b.getValue();
    }
}
