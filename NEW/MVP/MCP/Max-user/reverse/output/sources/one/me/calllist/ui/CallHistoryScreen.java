package one.me.calllist.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.appbar.AppBarLayout$ScrollingViewBehavior;
import defpackage.ab1;
import defpackage.aw0;
import defpackage.b0b;
import defpackage.bbd;
import defpackage.bud;
import defpackage.bwf;
import defpackage.byc;
import defpackage.d74;
import defpackage.eo7;
import defpackage.f54;
import defpackage.f8j;
import defpackage.g56;
import defpackage.gn;
import defpackage.gu5;
import defpackage.gw0;
import defpackage.hd5;
import defpackage.ho7;
import defpackage.i00;
import defpackage.ia1;
import defpackage.in;
import defpackage.ipi;
import defpackage.jqd;
import defpackage.k18;
import defpackage.kj1;
import defpackage.kti;
import defpackage.l01;
import defpackage.l38;
import defpackage.l48;
import defpackage.lqi;
import defpackage.neb;
import defpackage.oe3;
import defpackage.ox1;
import defpackage.q;
import defpackage.qfb;
import defpackage.qq3;
import defpackage.qsb;
import defpackage.r1b;
import defpackage.r34;
import defpackage.ra1;
import defpackage.re3;
import defpackage.rsb;
import defpackage.rsd;
import defpackage.rt5;
import defpackage.s2i;
import defpackage.s3e;
import defpackage.sa1;
import defpackage.ta1;
import defpackage.tcf;
import defpackage.toc;
import defpackage.u91;
import defpackage.ua1;
import defpackage.ue3;
import defpackage.va1;
import defpackage.vid;
import defpackage.vw4;
import defpackage.ww1;
import defpackage.x4e;
import defpackage.xa1;
import defpackage.xza;
import defpackage.y2d;
import defpackage.yfb;
import defpackage.ytd;
import defpackage.yud;
import defpackage.yy7;
import defpackage.yza;
import defpackage.za1;
import java.util.List;
import kotlin.Metadata;
import one.me.calllist.ui.CallHistoryScreen;
import one.me.sdk.arch.Widget;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lone/me/calllist/ui/CallHistoryScreen;", "Lone/me/sdk/arch/Widget;", "Lqq3;", "Ls3e;", "Lrsd;", "<init>", "()V", "call-list_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CallHistoryScreen extends Widget implements qq3, s3e, rsd {
    public static final /* synthetic */ yy7[] D0 = {new toc(CallHistoryScreen.class, "container", "getContainer()Landroidx/coordinatorlayout/widget/CoordinatorLayout;", 0), ho7.d(vid.a, CallHistoryScreen.class, "toolbar", "getToolbar()Lone/me/sdk/uikit/common/toolbar/OneMeToolbar;", 0), new toc(CallHistoryScreen.class, "callTabLayout", "getCallTabLayout()Lone/me/common/tablayout/OneMeTabLayout;", 0), new toc(CallHistoryScreen.class, "callHistoryPager", "getCallHistoryPager()Landroidx/viewpager2/widget/ViewPager2;", 0), new toc(CallHistoryScreen.class, "createGroupCallButton", "getCreateGroupCallButton()Lone/me/calllist/view/CallActionItemView;", 0), new toc(CallHistoryScreen.class, "callToContactButton", "getCallToContactButton()Lone/me/calllist/view/CallActionItemView;", 0), new toc(CallHistoryScreen.class, "micPermissionBanner", "getMicPermissionBanner()Lone/me/sdk/uikit/common/banner/OneMeCompactBannerView;", 0), new toc(CallHistoryScreen.class, "callEmptyHistoryView", "getCallEmptyHistoryView()Lone/me/sdk/uikit/common/emptyview/OneMeEmptyView;", 0)};
    public static final int[] E0 = {-11664148, -7436801};
    public in A0;
    public final eo7 B0;
    public final String C0;
    public final k18 X;
    public final Object Y;
    public final bbd Z;
    public final k18 a;
    public final k18 b;
    public final k18 c;
    public final Object d;
    public final k18 o;
    public final bbd s0;
    public final bbd t0;
    public final bbd u0;
    public final bbd v0;
    public final bbd w0;
    public final ab1 x0;
    public final ia1 y0;
    public f54 z0;

    /* JADX WARN: Multi-variable type inference failed */
    public CallHistoryScreen() {
        super(null, 0, 3, 0 == true ? 1 : 0);
        this.a = x4e.j;
        this.b = rsb.a.a();
        this.c = createViewModelLazy(za1.class, new q(13, new ra1(this, 1)));
        this.d = ipi.b(3, new ra1(this, 2));
        u91 u91Var = u91.a;
        bwf bwfVarD = u91Var.getAccessor().d(48);
        this.o = bwfVarD;
        this.X = u91Var.getAccessor().d(120);
        this.Y = ipi.b(3, new ra1(this, 3));
        this.Z = viewBinding(yza.i);
        this.s0 = viewBinding(yza.k);
        this.t0 = viewBinding(byc.call_history_tabs);
        this.u0 = viewBinding(byc.call_history_pager);
        viewBinding(yza.j);
        viewBinding(yza.h);
        this.v0 = viewBinding(yza.g);
        this.w0 = viewBinding(byc.call_history_empty);
        ab1 ab1Var = new ab1();
        ab1Var.a = hd5.a;
        this.x0 = ab1Var;
        this.y0 = new ia1(this);
        this.B0 = eo7.f;
        this.C0 = "call_history_scope_id";
        gw0.w(new g56(aw0.a(((gu5) ((rt5) bwfVarD.getValue())).p, this.lifecycleOwner.p(), l38.c), new ta1(null, this), 1), getLifecycleScope());
    }

    public final za1 A0() {
        return (za1) this.c.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, k18] */
    @Override // defpackage.rsd
    public final void b() {
        if (z0()) {
            ((ox1) this.Y.getValue()).b();
        }
    }

    @Override // defpackage.s3e
    public final void f0() {
        bud budVar;
        ytd ytdVar = (ytd) this.y0.Y.get(y0().getCurrentItem());
        Object obj = (ytdVar == null || (budVar = (bud) ue3.I(ytdVar.e())) == null) ? null : budVar.a;
        s3e s3eVar = obj instanceof s3e ? (s3e) obj : null;
        if (s3eVar != null) {
            s3eVar.f0();
            in inVar = this.A0;
            if (inVar != null) {
                inVar.f(true, true, true);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, k18] */
    @Override // defpackage.qq3
    public final void g(int i, Bundle bundle) {
        ((kj1) this.d.getValue()).g(i);
    }

    @Override // one.me.sdk.arch.Widget
    /* renamed from: getInsetsConfig, reason: from getter */
    public final eo7 getA() {
        return this.B0;
    }

    @Override // one.me.sdk.arch.Widget
    /* renamed from: getScopeId-IluPPks, reason: not valid java name and from getter */
    public final String getO() {
        return this.C0;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, k18] */
    @Override // defpackage.rsd
    public final void j() {
        if (z0()) {
            ((ox1) this.Y.getValue()).f();
        }
    }

    @Override // defpackage.c54
    public final void onAttach(View view) {
        Object value;
        boolean z;
        List list;
        super.onAttach(view);
        za1 za1VarA0 = A0();
        tcf tcfVar = za1VarA0.Y;
        do {
            value = tcfVar.getValue();
            ww1 ww1Var = (ww1) value;
            z = !((qsb) za1VarA0.d.getValue()).c(qsb.h);
            list = ww1Var.a;
            ww1Var.getClass();
        } while (!tcfVar.c(value, new ww1(list, z)));
    }

    @Override // one.me.sdk.arch.Widget, defpackage.c54
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LinearLayout linearLayout = new LinearLayout(layoutInflater.getContext());
        final int i = 1;
        linearLayout.setOrientation(1);
        yfb yfbVar = new yfb(linearLayout.getContext(), 6);
        yfbVar.setId(yza.k);
        yfbVar.setForm(qfb.b);
        yfbVar.setTitle(y2d.call_history_call_title);
        yfbVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        linearLayout.addView(yfbVar);
        CoordinatorLayout coordinatorLayout = new CoordinatorLayout(linearLayout.getContext(), null);
        coordinatorLayout.setId(yza.i);
        coordinatorLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        in inVar = new in(coordinatorLayout.getContext());
        inVar.setElevation(vw4.d().getDisplayMetrics().density * 0.0f);
        inVar.setLayoutParams(new d74(-1, -2));
        inVar.setBackground(null);
        re3 re3Var = new re3(inVar.getContext());
        final int i2 = 0;
        re3Var.setTitleEnabled(false);
        gn gnVar = new gn();
        gnVar.a = 3;
        re3Var.setLayoutParams(gnVar);
        LinearLayout linearLayout2 = new LinearLayout(re3Var.getContext());
        linearLayout2.setOrientation(1);
        r1b r1bVar = new r1b(linearLayout2.getContext(), 0);
        r1bVar.setId(yza.g);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        float f = 12;
        layoutParams.setMarginStart(kti.d(vw4.d().getDisplayMetrics().density * f));
        layoutParams.setMarginEnd(kti.d(vw4.d().getDisplayMetrics().density * f));
        layoutParams.bottomMargin = kti.d(f * vw4.d().getDisplayMetrics().density);
        r1bVar.setLayoutParams(layoutParams);
        r1bVar.setTitle(r1bVar.getContext().getString(b0b.d));
        r1bVar.setSubtitle(r1bVar.getContext().getString(b0b.c));
        float f2 = 24;
        r1bVar.w(r34.b(r1bVar.getContext(), yud.R0).mutate(), kti.d(vw4.d().getDisplayMetrics().density * f2), kti.d(f2 * vw4.d().getDisplayMetrics().density));
        jqd.a(r1bVar.Q0, E0, new float[]{0.0f, 1.0f});
        f8j.d(r1bVar, 300L, new View.OnClickListener(this) { // from class: qa1
            public final /* synthetic */ CallHistoryScreen b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i3 = i;
                CallHistoryScreen callHistoryScreen = this.b;
                switch (i3) {
                    case 0:
                        yy7[] yy7VarArr = CallHistoryScreen.D0;
                        kj1 kj1Var = callHistoryScreen.A0().c;
                        g31 g31Var = new g31(10);
                        kj1Var.c();
                        kj1Var.j = true;
                        qsb qsbVarF = kj1Var.f();
                        s2i s2iVar = kj1Var.a;
                        if (!qsbVarF.a(s2iVar, false)) {
                            kj1Var.l = g31Var;
                            kj1Var.h = null;
                            kj1Var.i = false;
                            break;
                        } else if (!((ur3) kj1Var.d.getValue()).f()) {
                            s2iVar.b();
                            break;
                        } else {
                            g31Var.invoke();
                            break;
                        }
                    default:
                        ((qsb) callHistoryScreen.b.getValue()).j(new s2i(callHistoryScreen, 0), qsb.h, 160);
                        break;
                }
            }
        });
        linearLayout2.addView(r1bVar);
        l01 l01Var = new l01(linearLayout2.getContext(), 0);
        float f3 = 16;
        float f4 = 0;
        l01Var.setPadding(kti.d(vw4.d().getDisplayMetrics().density * f3), kti.d(vw4.d().getDisplayMetrics().density * f4), kti.d(vw4.d().getDisplayMetrics().density * f3), kti.d(vw4.d().getDisplayMetrics().density * f4));
        l01Var.setId(yza.h);
        l01Var.setActionIcon(xza.b);
        l01Var.setActionText(y2d.call_history_call_contact_action);
        f8j.d(l01Var, 300L, new sa1(i2));
        float f5 = 52;
        l01Var.setLayoutParams(new LinearLayout.LayoutParams(-1, kti.d(vw4.d().getDisplayMetrics().density * f5)));
        linearLayout2.addView(l01Var);
        l01 l01Var2 = new l01(linearLayout2.getContext(), 0);
        l01Var2.setPadding(kti.d(vw4.d().getDisplayMetrics().density * f3), kti.d(vw4.d().getDisplayMetrics().density * f4), kti.d(f3 * vw4.d().getDisplayMetrics().density), kti.d(f4 * vw4.d().getDisplayMetrics().density));
        l01Var2.setId(yza.j);
        l01Var2.setActionIcon(xza.f);
        l01Var2.setActionText(y2d.call_history_call_create_group_call_by_link);
        f8j.d(l01Var2, 300L, new View.OnClickListener(this) { // from class: qa1
            public final /* synthetic */ CallHistoryScreen b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i3 = i2;
                CallHistoryScreen callHistoryScreen = this.b;
                switch (i3) {
                    case 0:
                        yy7[] yy7VarArr = CallHistoryScreen.D0;
                        kj1 kj1Var = callHistoryScreen.A0().c;
                        g31 g31Var = new g31(10);
                        kj1Var.c();
                        kj1Var.j = true;
                        qsb qsbVarF = kj1Var.f();
                        s2i s2iVar = kj1Var.a;
                        if (!qsbVarF.a(s2iVar, false)) {
                            kj1Var.l = g31Var;
                            kj1Var.h = null;
                            kj1Var.i = false;
                            break;
                        } else if (!((ur3) kj1Var.d.getValue()).f()) {
                            s2iVar.b();
                            break;
                        } else {
                            g31Var.invoke();
                            break;
                        }
                    default:
                        ((qsb) callHistoryScreen.b.getValue()).j(new s2i(callHistoryScreen, 0), qsb.h, 160);
                        break;
                }
            }
        });
        l01Var2.setLayoutParams(new LinearLayout.LayoutParams(-1, kti.d(f5 * vw4.d().getDisplayMetrics().density)));
        linearLayout2.addView(l01Var2);
        linearLayout2.setLayoutParams(new oe3(-1, -2));
        re3Var.addView(linearLayout2);
        inVar.addView(re3Var);
        neb nebVar = new neb(inVar.getContext(), 0);
        nebVar.setId(byc.call_history_tabs);
        nebVar.setTabMode(0);
        nebVar.setLayoutParams(new gn());
        inVar.addView(nebVar);
        inVar.setStateListAnimator(null);
        this.A0 = inVar;
        coordinatorLayout.addView(inVar);
        ViewPager2 viewPager2 = new ViewPager2(coordinatorLayout.getContext());
        viewPager2.setId(byc.call_history_pager);
        d74 d74Var = new d74(-1, -1);
        d74Var.b(new AppBarLayout$ScrollingViewBehavior());
        viewPager2.setLayoutParams(d74Var);
        lqi.b(viewPager2);
        coordinatorLayout.addView(viewPager2);
        linearLayout.addView(coordinatorLayout);
        return linearLayout;
    }

    @Override // defpackage.c54
    public final void onDestroyView(View view) {
        Object value;
        super.onDestroyView(view);
        if (!requireActivity().isChangingConfigurations()) {
            y0().setAdapter(null);
            tcf tcfVar = A0().o;
            do {
                value = tcfVar.getValue();
            } while (!tcfVar.c(value, new xa1()));
        }
        f54 f54Var = this.z0;
        if (f54Var != null) {
            f54Var.c();
        }
        this.z0 = null;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, k18] */
    @Override // defpackage.c54
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (z0()) {
            ox1 ox1Var = (ox1) this.Y.getValue();
            if (i != 177) {
                ox1Var.getClass();
            } else if (ox1Var.a.d()) {
                ox1Var.a();
            }
        }
        if (((kj1) this.d.getValue()).b(i, strArr, iArr)) {
            return;
        }
        if (i == 160 && ((qsb) this.b.getValue()).c(strArr)) {
            ((r1b) this.v0.D(this, D0[6])).setVisibility(8);
            return;
        }
        for (int i2 : iArr) {
            if (i2 == -1) {
                s2i.g(new s2i(this, 0), b0b.b, Integer.valueOf(b0b.a), null, null, false, null, 60);
                return;
            }
        }
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        tcf tcfVar = A0().Z;
        l48 l48VarP = getViewLifecycleOwner().p();
        l38 l38Var = l38.d;
        gw0.w(new g56(aw0.a(tcfVar, l48VarP, l38Var), new ua1(null, this), 1), getViewLifecycleScope());
        gw0.w(new g56(aw0.a(A0().X, getViewLifecycleOwner().p(), l38Var), new va1(null, this), 1), getViewLifecycleScope());
        y0().setAdapter(this.y0);
        y0().setOffscreenPageLimit(1);
        neb nebVar = (neb) this.t0.D(this, D0[2]);
        ViewPager2 viewPager2Y0 = y0();
        ab1 ab1Var = this.x0;
        ab1Var.getClass();
        f54 f54Var = new f54(nebVar, viewPager2Y0, new i00(ab1Var, 5, nebVar));
        f54Var.b();
        this.z0 = f54Var;
    }

    public final ViewPager2 y0() {
        return (ViewPager2) this.u0.D(this, D0[3]);
    }

    public final boolean z0() {
        return ((Number) ((gu5) ((rt5) this.o.getValue())).p.f()).longValue() > 0;
    }
}
