package one.me.settings.privacy.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.a7c;
import defpackage.a93;
import defpackage.aqe;
import defpackage.aw0;
import defpackage.bbd;
import defpackage.bqe;
import defpackage.bre;
import defpackage.bzb;
import defpackage.cre;
import defpackage.d9e;
import defpackage.eo7;
import defpackage.ere;
import defpackage.f1e;
import defpackage.fb5;
import defpackage.fme;
import defpackage.g4b;
import defpackage.g56;
import defpackage.gbd;
import defpackage.gda;
import defpackage.gfb;
import defpackage.gw0;
import defpackage.hd5;
import defpackage.hqe;
import defpackage.hwa;
import defpackage.iqb;
import defpackage.iqe;
import defpackage.jqe;
import defpackage.k18;
import defpackage.k1e;
import defpackage.ka5;
import defpackage.kbb;
import defpackage.kqe;
import defpackage.l38;
import defpackage.l48;
import defpackage.m;
import defpackage.n4e;
import defpackage.nbb;
import defpackage.ng5;
import defpackage.q2b;
import defpackage.qfb;
import defpackage.qq3;
import defpackage.rh2;
import defpackage.t9f;
import defpackage.toc;
import defpackage.tqe;
import defpackage.tqi;
import defpackage.u4e;
import defpackage.vdc;
import defpackage.vid;
import defpackage.vmf;
import defpackage.vxf;
import defpackage.xfh;
import defpackage.yfb;
import defpackage.yy7;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lone/me/settings/privacy/ui/SettingsPrivacyScreen;", "Lone/me/sdk/arch/Widget;", "Lqq3;", "Lng5;", "<init>", "()V", "settings-privacy_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SettingsPrivacyScreen extends Widget implements qq3, ng5 {
    public static final /* synthetic */ yy7[] Z;
    public static final String s0;
    public final bbd X;
    public final aqe Y;
    public final ka5 a;
    public final eo7 b;
    public final k18 c;
    public final k18 d;
    public final String o;

    static {
        toc tocVar = new toc(SettingsPrivacyScreen.class, "recycler", "getRecycler()Landroidx/recyclerview/widget/RecyclerView;", 0);
        vid.a.getClass();
        Z = new yy7[]{tocVar};
        s0 = "settings-privacy";
    }

    public SettingsPrivacyScreen() {
        super(null, 0, 3, null);
        this.a = new ka5(f1e.SETTINGS_PRIVACY);
        this.b = eo7.f;
        this.c = createViewModelLazy(ere.class, new vdc(18, new hqe(this, 0)));
        bqe bqeVar = bqe.a;
        this.d = bqeVar.getAccessor().d(151);
        this.o = s0;
        this.X = viewBinding(kbb.v);
        aqe aqeVar = new aqe(new n4e(this), ((g4b) bqeVar.getAccessor().c(56)).a());
        this.Y = aqeVar;
        gw0.w(new g56(y0().A0, new bzb(2, aqeVar, aqe.class, "submitList", "submitList(Ljava/util/List;)V", 4, 8), 1), getLifecycleScope());
    }

    @Override // defpackage.qq3
    public final void H() {
        gda.g((gda) this.d.getValue(), f1e.SETTINGS_PRIVACY);
    }

    @Override // defpackage.qq3
    public final void g(int i, Bundle bundle) {
        ere ereVarY0 = y0();
        ereVarY0.getClass();
        t9f t9fVar = ereVarY0.D0;
        t9f t9fVar2 = ereVarY0.C0;
        if (i == kbb.n) {
            ereVarY0.C(true);
            return;
        }
        if (i == kbb.o) {
            if (ereVarY0.x().g.getBoolean("app.privacy.online.show", true)) {
                ereVarY0.A(fme.g);
                return;
            }
            return;
        }
        if (i != kbb.q) {
            if (i == kbb.p) {
                ereVarY0.C(false);
                return;
            }
            if (i == kbb.h) {
                t9fVar2.O(ereVarY0, ere.R0[1], xfh.o(ereVarY0, null, new cre(ereVarY0, 1, null), 3));
                return;
            }
            if (i == kbb.i) {
                t9fVar2.O(ereVarY0, ere.R0[1], xfh.o(ereVarY0, null, new cre(ereVarY0, 3, null), 3));
                return;
            }
            if (i == kbb.f) {
                t9fVar.O(ereVarY0, ere.R0[2], xfh.o(ereVarY0, null, new bre(ereVarY0, 1, null), 3));
                return;
            }
            if (i == kbb.g) {
                t9fVar.O(ereVarY0, ere.R0[2], xfh.o(ereVarY0, null, new bre(ereVarY0, 3, null), 3));
                return;
            }
            if (i == kbb.t) {
                ereVarY0.E(1);
                return;
            }
            if (i == kbb.u) {
                ereVarY0.E(3);
                return;
            }
            if (i == kbb.m) {
                if (ereVarY0.J0 == null) {
                    String strE = ((vxf) ereVarY0.Y.getValue()).e();
                    List listSingletonList = (strE == null || vmf.F(strE)) ? hd5.a : Collections.singletonList(strE);
                    hwa hwaVarW = ereVarY0.w();
                    ereVarY0.J0 = Long.valueOf(hwa.q(hwaVarW, new rh2(1, hwaVarW.t().a.k(), listSingletonList)));
                    return;
                }
                return;
            }
            if (i != kbb.l) {
                if (i == kbb.s) {
                    ereVarY0.D(true);
                    return;
                }
                if (i == kbb.r) {
                    ereVarY0.D(false);
                } else if (i == kbb.k) {
                    ereVarY0.B(true);
                } else if (i == kbb.j) {
                    ereVarY0.B(false);
                }
            }
        }
    }

    @Override // one.me.sdk.arch.Widget
    /* renamed from: getInsetsConfig, reason: from getter */
    public final eo7 getZ() {
        return this.b;
    }

    @Override // one.me.sdk.arch.Widget
    /* renamed from: getScopeId-IluPPks, reason: from getter */
    public final String getC() {
        return this.o;
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
        yfbVar.setId(kbb.z);
        yfbVar.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        yfbVar.setTitle(nbb.M);
        yfbVar.setForm(qfb.a);
        yfbVar.setLeftActions(new gfb(new iqb(29, this)));
        linearLayout.addView(yfbVar);
        RecyclerView recyclerView = new RecyclerView(linearLayout.getContext(), null);
        recyclerView.setId(kbb.v);
        recyclerView.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        recyclerView.setAdapter(this.Y);
        recyclerView.setItemAnimator(null);
        recyclerView.setClipChildren(false);
        recyclerView.j(new d9e(a93.s0.y(recyclerView), new u4e(9, this), null, new a7c(this, 6, recyclerView), 12));
        recyclerView.j(new fb5(3));
        recyclerView.j(new kqe(recyclerView.getContext()));
        linearLayout.addView(recyclerView);
        tqi.c(new m(3, null, 17), linearLayout);
        return linearLayout;
    }

    @Override // defpackage.c54
    public final void onDestroyView(View view) {
        ((RecyclerView) this.X.D(this, Z[0])).setAdapter(null);
        super.onDestroyView(view);
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        ere ereVarY0 = y0();
        xfh.o(ereVarY0, ((q2b) ereVarY0.d).a(), new tqe(ereVarY0, null), 2);
        gbd gbdVar = y0().P0;
        l48 l48VarP = getViewLifecycleOwner().p();
        l38 l38Var = l38.d;
        gw0.w(new g56(aw0.a(gbdVar, l48VarP, l38Var), new iqe(null, this), 1), getViewLifecycleScope());
        gw0.w(new g56(aw0.a(y0().Q0, getViewLifecycleOwner().p(), l38Var), new jqe(null, this), 1), getViewLifecycleScope());
    }

    public final ere y0() {
        return (ere) this.c.getValue();
    }
}
