package com.avito.android.autoteka.presentation.landing;

import Cd.C13243a;
import Lf.InterfaceC14387a;
import Lf.c;
import Y61.l;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.ActivityC22955m;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.InterfaceC22969B;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import bj.AbstractC25658a;
import bj.InterfaceC25659b;
import com.avito.android.R;
import com.avito.android.advert.item.consultation.B;
import com.avito.android.analytics.screens.AutotekaLandingScreen;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.s;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.autoteka.deeplinks.LandingDetails;
import com.avito.android.autoteka.presentation.landing.mvi.q;
import com.avito.android.autoteka.presentation.landing.mvi.r;
import com.avito.android.di.C29972i;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.ui.fragments.BaseFragment;
import com.avito.android.util.I5;
import com.avito.android.util.P5;
import com.avito.android.util.y6;
import gj.m;
import gj.o;
import java.util.Collections;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.Y;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.s0;
import kotlin.reflect.n;
import qK0.C47312b;
import sK0.C48063a;
import z1.AbstractC50339a;

/* compiled from: AutotekaLandingFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/avito/android/autoteka/presentation/landing/AutotekaLandingFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lgj/i;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AutotekaLandingFragment extends BaseFragment implements gj.i, InterfaceC28477j.b {

    /* renamed from: I0, reason: collision with root package name */
    @Y61.k
    public static final a f97301I0;

    /* renamed from: J0, reason: collision with root package name */
    public static final /* synthetic */ n<Object>[] f97302J0;

    /* renamed from: A0, reason: collision with root package name */
    public Toolbar f97303A0;

    /* renamed from: B0, reason: collision with root package name */
    public TextView f97304B0;

    /* renamed from: C0, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f97305C0;

    /* renamed from: D0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.j f97306D0;

    /* renamed from: E0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.a f97307E0;

    /* renamed from: F0, reason: collision with root package name */
    @l
    public String f97308F0;

    /* renamed from: G0, reason: collision with root package name */
    @l
    public String f97309G0;

    /* renamed from: H0, reason: collision with root package name */
    @l
    public String f97310H0;

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public r f97311n0;

    /* renamed from: o0, reason: collision with root package name */
    @Y61.k
    public final O0 f97312o0;

    /* renamed from: p0, reason: collision with root package name */
    @Inject
    public gj.n f97313p0;

    /* renamed from: q0, reason: collision with root package name */
    @Inject
    public InterfaceC25659b f97314q0;

    /* renamed from: r0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f97315r0;

    /* renamed from: s0, reason: collision with root package name */
    @Y61.k
    public final C47312b f97316s0;

    /* renamed from: t0, reason: collision with root package name */
    @Y61.k
    public final C47312b f97317t0;

    /* renamed from: u0, reason: collision with root package name */
    @Y61.k
    public final C47312b f97318u0;

    /* renamed from: v0, reason: collision with root package name */
    public AbstractC25658a<? extends RecyclerView.C> f97319v0;

    /* renamed from: w0, reason: collision with root package name */
    public AbstractC25658a<? extends RecyclerView.C> f97320w0;

    /* renamed from: x0, reason: collision with root package name */
    public AbstractC25658a<? extends RecyclerView.C> f97321x0;

    /* renamed from: y0, reason: collision with root package name */
    public RecyclerView f97322y0;

    /* renamed from: z0, reason: collision with root package name */
    public View f97323z0;

    /* compiled from: AutotekaLandingFragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/autoteka/presentation/landing/AutotekaLandingFragment$a;", "", "<init>", "()V", "", "KEY_AUTOTEKA_LANDING_UTM_PARAMS", "Ljava/lang/String;", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: AutotekaLandingFragment.kt */
    @s0
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends N implements Y41.a<Integer> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final Integer invoke() {
            Resources resources = AutotekaLandingFragment.this.getResources();
            ThreadLocal<TypedValue> threadLocal = androidx.core.content.res.i.f44673a;
            return Integer.valueOf(resources.getColor(R.color.common_white, null));
        }
    }

    /* compiled from: AutotekaLandingFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LLf/b;", "it", "Lkotlin/G0;", "invoke", "(LLf/b;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.l<Lf.b, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final c f97325l = new c();

        public c() {
            super(1);
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ G0 invoke(Lf.b bVar) {
            return G0.f406611a;
        }
    }

    /* compiled from: AutotekaLandingFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class d extends H implements Y41.l<Lf.c, G0> {
        @Override // Y41.l
        public final G0 invoke(Lf.c cVar) {
            Lf.c cVar2 = cVar;
            AutotekaLandingFragment autotekaLandingFragment = (AutotekaLandingFragment) this.receiver;
            a aVar = AutotekaLandingFragment.f97301I0;
            autotekaLandingFragment.getClass();
            boolean z12 = cVar2 instanceof c.C0624c;
            InterfaceC42726C interfaceC42726C = autotekaLandingFragment.f97305C0;
            if (z12) {
                com.avito.konveyor.adapter.a aVar2 = autotekaLandingFragment.f97307E0;
                if (aVar2 == null) {
                    aVar2 = null;
                }
                aVar2.c(new UV0.c(Collections.singletonList(new com.avito.android.autoteka.items.skeleton.landing.c(null, 1, null))));
                com.avito.konveyor.adapter.j jVar = autotekaLandingFragment.f97306D0;
                if (jVar == null) {
                    jVar = null;
                }
                jVar.notifyDataSetChanged();
                autotekaLandingFragment.s5(false);
                autotekaLandingFragment.c5(null, null);
                int iIntValue = ((Number) interfaceC42726C.getValue()).intValue();
                Toolbar toolbar = autotekaLandingFragment.f97303A0;
                if (toolbar == null) {
                    toolbar = null;
                }
                toolbar.setBackground(new ColorDrawable(iIntValue));
                TextView textView = autotekaLandingFragment.f97304B0;
                if (textView == null) {
                    textView = null;
                }
                I5.a(textView, null, false);
            } else if (cVar2 instanceof c.b) {
                c.b bVar = (c.b) cVar2;
                com.avito.konveyor.adapter.a aVar3 = autotekaLandingFragment.f97307E0;
                if (aVar3 == null) {
                    aVar3 = null;
                }
                aVar3.c(new UV0.c(Collections.singletonList(bVar.f10073b)));
                com.avito.konveyor.adapter.j jVar2 = autotekaLandingFragment.f97306D0;
                if (jVar2 == null) {
                    jVar2 = null;
                }
                jVar2.notifyDataSetChanged();
                autotekaLandingFragment.s5(false);
                autotekaLandingFragment.c5(null, null);
                int iIntValue2 = ((Number) interfaceC42726C.getValue()).intValue();
                Toolbar toolbar2 = autotekaLandingFragment.f97303A0;
                if (toolbar2 == null) {
                    toolbar2 = null;
                }
                toolbar2.setBackground(new ColorDrawable(iIntValue2));
                TextView textView2 = autotekaLandingFragment.f97304B0;
                if (textView2 == null) {
                    textView2 = null;
                }
                I5.a(textView2, null, false);
            } else if (cVar2 instanceof c.a) {
                c.a aVar4 = (c.a) cVar2;
                autotekaLandingFragment.f97308F0 = aVar4.f10065b;
                autotekaLandingFragment.f97309G0 = aVar4.f10067d;
                autotekaLandingFragment.f97310H0 = aVar4.f10069f;
                AbstractC25658a<? extends RecyclerView.C> abstractC25658a = autotekaLandingFragment.f97319v0;
                if (abstractC25658a == null) {
                    abstractC25658a = null;
                }
                abstractC25658a.m(aVar4.f10066c);
                AbstractC25658a<? extends RecyclerView.C> abstractC25658a2 = autotekaLandingFragment.f97320w0;
                if (abstractC25658a2 == null) {
                    abstractC25658a2 = null;
                }
                abstractC25658a2.m(aVar4.f10068e);
                AbstractC25658a<? extends RecyclerView.C> abstractC25658a3 = autotekaLandingFragment.f97321x0;
                if (abstractC25658a3 == null) {
                    abstractC25658a3 = null;
                }
                abstractC25658a3.m(aVar4.f10070g);
                autotekaLandingFragment.s5(true);
                UniversalColor universalColor = aVar4.f10072i;
                int iA2 = universalColor != null ? C48063a.f437606a.a(autotekaLandingFragment.requireContext(), universalColor) : ((Number) interfaceC42726C.getValue()).intValue();
                com.avito.android.lib.util.i.f181373a.getClass();
                if (!com.avito.android.lib.util.i.f181377e) {
                    ActivityC22955m activityC22955mL1 = autotekaLandingFragment.l1();
                    Window window = activityC22955mL1 != null ? activityC22955mL1.getWindow() : null;
                    if (window != null) {
                        window.setStatusBarColor(iA2);
                    }
                }
                Toolbar toolbar3 = autotekaLandingFragment.f97303A0;
                if (toolbar3 == null) {
                    toolbar3 = null;
                }
                toolbar3.setBackground(new ColorDrawable(iA2));
                TextView textView3 = autotekaLandingFragment.f97304B0;
                I5.a(textView3 != null ? textView3 : null, aVar4.f10071h, false);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: AutotekaLandingFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LLf/a;", "action", "Lkotlin/G0;", "invoke", "(LLf/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.l<InterfaceC14387a, G0> {
        public e() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(InterfaceC14387a interfaceC14387a) {
            a aVar = AutotekaLandingFragment.f97301I0;
            ((q) AutotekaLandingFragment.this.f97312o0.getValue()).accept(interfaceC14387a);
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f97327l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Y41.a aVar) {
            super(0);
            this.f97327l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f97327l);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "Cd/i", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<Fragment> {
        public g() {
            super(0);
        }

        @Override // Y41.a
        public final Fragment invoke() {
            return AutotekaLandingFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ g f97329l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(g gVar) {
            super(0);
            this.f97329l = gVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f97329l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f97330l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f97330l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f97330l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f97331l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f97331l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f97331l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: AutotekaLandingFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/autoteka/presentation/landing/mvi/q;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/autoteka/presentation/landing/mvi/q;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class k extends N implements Y41.a<q> {
        public k() {
            super(0);
        }

        @Override // Y41.a
        public final q invoke() {
            r rVar = AutotekaLandingFragment.this.f97311n0;
            if (rVar == null) {
                rVar = null;
            }
            return (q) rVar.get();
        }
    }

    static {
        Y y12 = new Y(AutotekaLandingFragment.class, "topRecyclerView", "getTopRecyclerView()Landroidx/recyclerview/widget/RecyclerView;", 0);
        n0 n0Var = m0.f406844a;
        f97302J0 = new n[]{n0Var.e(y12), androidx.compose.ui.graphics.colorspace.e.s(AutotekaLandingFragment.class, "mainRecyclerView", "getMainRecyclerView()Landroidx/recyclerview/widget/RecyclerView;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(AutotekaLandingFragment.class, "bottomRecyclerView", "getBottomRecyclerView()Landroidx/recyclerview/widget/RecyclerView;", 0, n0Var)};
        f97301I0 = new a(null);
    }

    public AutotekaLandingFragment() {
        super(R.layout.autoteka_landing_fragment);
        f fVar = new f(new k());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new h(new g()));
        this.f97312o0 = new O0(m0.f406844a.b(q.class), new i(interfaceC42726CB), fVar, new j(interfaceC42726CB));
        this.f97316s0 = new C47312b(null, 1, null);
        this.f97317t0 = new C47312b(null, 1, null);
        this.f97318u0 = new C47312b(null, 1, null);
        this.f97305C0 = C42727D.c(new b());
    }

    public static RecyclerView r5(View view, int i12, AbstractC25658a abstractC25658a) {
        View viewFindViewById = view.findViewById(i12);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        }
        RecyclerView recyclerView = (RecyclerView) viewFindViewById;
        com.avito.android.beduin_shared.model.utils.h.b(recyclerView, abstractC25658a);
        return recyclerView;
    }

    @Override // gj.i
    @l
    public final RecyclerView B0(@Y61.k String str) {
        boolean zEquals = str.equals(this.f97308F0);
        n<Object>[] nVarArr = f97302J0;
        if (zEquals) {
            n<Object> nVar = nVarArr[0];
            return (RecyclerView) this.f97316s0.a();
        }
        if (str.equals(this.f97309G0)) {
            n<Object> nVar2 = nVarArr[1];
            return (RecyclerView) this.f97317t0.a();
        }
        if (!str.equals(this.f97310H0)) {
            return null;
        }
        n<Object> nVar3 = nVarArr[2];
        return (RecyclerView) this.f97318u0.a();
    }

    @Override // gj.i
    @l
    public final View b3(@Y61.k String str) {
        return B0(str);
    }

    @Override // gj.i
    @Y61.k
    public final o c1() {
        n<Object>[] nVarArr = f97302J0;
        n<Object> nVar = nVarArr[1];
        C47312b c47312b = this.f97317t0;
        o.a aVar = new o.a((RecyclerView) c47312b.a(), ToastBarPosition.f181047e);
        n<Object> nVar2 = nVarArr[1];
        return new o(aVar, new o.a((RecyclerView) c47312b.a(), ToastBarPosition.f181044b));
    }

    @Override // gj.i
    @Y61.k
    public final String m0() {
        String str = this.f97309G0;
        return str == null ? "main" : str;
    }

    @Override // androidx.fragment.app.Fragment
    @l
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @l ViewGroup viewGroup, @l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f97315r0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @l Bundle bundle) {
        super.onViewCreated(view, bundle);
        gj.n nVar = this.f97313p0;
        if (nVar == null) {
            nVar = null;
        }
        gj.k kVarA = m.a(nVar, this);
        O0 o02 = this.f97312o0;
        ((com.avito.android.beduin.view.c) kVarA).l(((q) o02.getValue()).f97383N);
        Integer numValueOf = Integer.valueOf(y6.b(16));
        this.f97319v0 = q5(numValueOf);
        this.f97320w0 = q5(numValueOf);
        this.f97321x0 = q5(numValueOf);
        AbstractC25658a<? extends RecyclerView.C> abstractC25658a = this.f97319v0;
        if (abstractC25658a == null) {
            abstractC25658a = null;
        }
        RecyclerView recyclerViewR5 = r5(view, R.id.autoteka_landing_top_list, abstractC25658a);
        n<Object>[] nVarArr = f97302J0;
        n<Object> nVar2 = nVarArr[0];
        this.f97316s0.b(this, recyclerViewR5);
        AbstractC25658a<? extends RecyclerView.C> abstractC25658a2 = this.f97320w0;
        if (abstractC25658a2 == null) {
            abstractC25658a2 = null;
        }
        RecyclerView recyclerViewR52 = r5(view, R.id.autoteka_landing_main_list, abstractC25658a2);
        n<Object> nVar3 = nVarArr[1];
        this.f97317t0.b(this, recyclerViewR52);
        AbstractC25658a<? extends RecyclerView.C> abstractC25658a3 = this.f97321x0;
        if (abstractC25658a3 == null) {
            abstractC25658a3 = null;
        }
        RecyclerView recyclerViewR53 = r5(view, R.id.autoteka_landing_bottom_list, abstractC25658a3);
        n<Object> nVar4 = nVarArr[2];
        this.f97318u0.b(this, recyclerViewR53);
        com.avito.konveyor.adapter.j jVar = this.f97306D0;
        if (jVar == null) {
            jVar = null;
        }
        View viewFindViewById = view.findViewById(R.id.autoteka_landing_info_list);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        }
        RecyclerView recyclerView = (RecyclerView) viewFindViewById;
        this.f97322y0 = recyclerView;
        recyclerView.setAdapter(jVar);
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(1, false));
        View viewFindViewById2 = view.findViewById(R.id.autoteka_landing_content);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f97323z0 = viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.toolbar);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.appcompat.widget.Toolbar");
        }
        Toolbar toolbar = (Toolbar) viewFindViewById3;
        this.f97303A0 = toolbar;
        P5.b(toolbar);
        toolbar.setNavigationOnClickListener(new B(this, 27));
        View viewFindViewById4 = view.findViewById(R.id.toolbar_title);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f97304B0 = (TextView) viewFindViewById4;
        ScreenPerformanceTracker screenPerformanceTracker = this.f97315r0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        com.avito.android.analytics.screens.mvi.a.g(this, screenPerformanceTracker, (q) o02.getValue(), c.f97325l, new d(1, this, AutotekaLandingFragment.class, "render", "render(Lcom/avito/android/autoteka/presentation/landing/mvi/entity/AutotekaLandingState;)V", 0));
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f97315r0;
        (screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null).d();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@l Bundle bundle) {
        LandingDetails landingDetails;
        D.f90335a.getClass();
        F fA2 = D.a.a();
        C28478k c28478k = new C28478k(AutotekaLandingScreen.f90290d, s.c(this), null, 4, null);
        Bundle arguments = getArguments();
        if (arguments != null) {
            landingDetails = (LandingDetails) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) arguments.getParcelable("KeyAutotekaLandingUtmParams", LandingDetails.class) : arguments.getParcelable("KeyAutotekaLandingUtmParams"));
        } else {
            landingDetails = null;
        }
        if (landingDetails == null) {
            throw new IllegalArgumentException("AutotekaLandingDetails should be pass to fragment");
        }
        com.avito.android.autoteka.di.landing.i.a().a((yf.l) C29972i.a(C29972i.b(this), yf.l.class), cv.c.b(this), c28478k, new e(), landingDetails).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f97315r0;
        (screenPerformanceTracker != null ? screenPerformanceTracker : null).a(fA2.b());
    }

    public final AbstractC25658a<? extends RecyclerView.C> q5(Integer num) {
        InterfaceC25659b interfaceC25659b = this.f97314q0;
        if (interfaceC25659b == null) {
            interfaceC25659b = null;
        }
        com.avito.android.beduin.common.component.adapter.a aVarB = interfaceC25659b.b(num);
        aVarB.f100611g = ((q) this.f97312o0.getValue()).f97383N.B0();
        return aVarB;
    }

    public final void s5(boolean z12) {
        RecyclerView recyclerView = this.f97322y0;
        if (recyclerView == null) {
            recyclerView = null;
        }
        recyclerView.setVisibility(!z12 ? 0 : 8);
        View view = this.f97323z0;
        (view != null ? view : null).setVisibility(z12 ? 0 : 8);
    }

    @Override // gj.i
    public final void t0() {
        ActivityC22955m activityC22955mL1 = l1();
        if (activityC22955mL1 != null) {
            activityC22955mL1.onBackPressed();
        }
    }
}
