package com.avito.android.work_profile.profile.about_me.ui;

import Cd.C13243a;
import Y61.l;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.view.InterfaceC22969B;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import cU.s;
import cU.v;
import com.avito.android.R;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.beduin.v2.page.BaseBeduinHostFragment;
import com.avito.android.di.C29972i;
import com.avito.android.di.module.InterfaceC30106l7;
import com.avito.android.lib.beduin_v2.feature.di.C31138n0;
import com.avito.android.lib.beduin_v2.feature.di.H;
import com.avito.android.lib.beduin_v2.feature.di.K;
import com.avito.android.lib.beduin_v2.feature.mvi.entity.BeduinOneTimeEvent;
import com.avito.android.ownership.Owners;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.work_profile.perf_const.AboutMeBeduinV2Screen;
import com.avito.beduin.v2.render.android_view.A;
import com.avito.beduin.v2.render.android_view.BeduinView;
import hQ0.C40868c;
import hQ0.InterfaceC40866a;
import hQ0.InterfaceC40867b;
import java.util.Collection;
import java.util.Set;
import javax.inject.Inject;
import kd0.C42670a;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import z1.AbstractC50339a;

/* compiled from: AboutMeFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/work_profile/profile/about_me/ui/AboutMeFragment;", "Lcom/avito/android/beduin/v2/page/BaseBeduinHostFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_job_work-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class AboutMeFragment extends BaseBeduinHostFragment implements InterfaceC28477j.b {

    /* renamed from: x0, reason: collision with root package name */
    @Y61.k
    public static final a f330814x0 = new a(null);

    /* renamed from: o0, reason: collision with root package name */
    @Inject
    public com.avito.android.work_profile.profile.about_me.b f330815o0;

    /* renamed from: p0, reason: collision with root package name */
    @Y61.k
    public final O0 f330816p0;

    /* renamed from: q0, reason: collision with root package name */
    @l
    public BeduinView f330817q0;

    /* renamed from: r0, reason: collision with root package name */
    @l
    public C42670a f330818r0;

    /* renamed from: s0, reason: collision with root package name */
    @l
    public SwipeRefreshLayout f330819s0;

    /* renamed from: t0, reason: collision with root package name */
    @l
    public ScreenPerformanceTracker f330820t0;

    /* renamed from: u0, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f330821u0;

    /* renamed from: v0, reason: collision with root package name */
    public s f330822v0;

    /* renamed from: w0, reason: collision with root package name */
    @Y61.k
    public final ZS.b f330823w0;

    /* compiled from: AboutMeFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/work_profile/profile/about_me/ui/AboutMeFragment$a;", "", "<init>", "()V", "_avito_job_work-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: AboutMeFragment.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/view/View;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends N implements Y41.a<View> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ View f330824l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(View view) {
            super(0);
            this.f330824l = view;
        }

        @Override // Y41.a
        public final View invoke() {
            View viewFindViewById = this.f330824l.findViewById(R.id.beduin);
            if (viewFindViewById != null) {
                return viewFindViewById;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
    }

    /* compiled from: AboutMeFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class c extends H implements Y41.l<InterfaceC40867b.d, G0> {
        @Override // Y41.l
        public final G0 invoke(InterfaceC40867b.d dVar) {
            InterfaceC40867b.d dVar2 = dVar;
            AboutMeFragment aboutMeFragment = (AboutMeFragment) this.receiver;
            a aVar = AboutMeFragment.f330814x0;
            aboutMeFragment.getClass();
            if (dVar2 instanceof InterfaceC40867b.e) {
                com.avito.android.lib.beduin_v2.ui_messages.b bVar = com.avito.android.lib.beduin_v2.ui_messages.b.f177570a;
                BeduinView beduinView = aboutMeFragment.f330817q0;
                if (beduinView == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                BeduinOneTimeEvent.ShowToastBar showToastBar = ((InterfaceC40867b.e) dVar2).f397194a;
                bVar.getClass();
                com.avito.android.lib.beduin_v2.ui_messages.b.a(beduinView, showToastBar);
            } else if (dVar2 instanceof InterfaceC40867b.C11256b) {
                aboutMeFragment.t5().accept(new InterfaceC40866a.b(true));
            }
            return G0.f406611a;
        }
    }

    /* compiled from: AboutMeFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LhQ0/c;", VoiceInfo.STATE, "Lkotlin/G0;", "invoke", "(LhQ0/c;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.l<C40868c, G0> {
        public d() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(C40868c c40868c) {
            C42670a c42670a;
            a aVar = AboutMeFragment.f330814x0;
            AboutMeFragment aboutMeFragment = AboutMeFragment.this;
            C40868c.a aVar2 = c40868c.f397197b;
            if (aVar2 instanceof C40868c.a.C11258c) {
                if (((C40868c.a.C11258c) aVar2).f397199a && (c42670a = aboutMeFragment.f330818r0) != null) {
                    C42670a.d(c42670a);
                }
            } else if (aVar2 instanceof C40868c.a.C11257a) {
                BeduinView beduinView = aboutMeFragment.f330817q0;
                if (beduinView == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                beduinView.b(((C40868c.a.C11257a) aVar2).f397198a);
                C42670a c42670a2 = aboutMeFragment.f330818r0;
                if (c42670a2 != null) {
                    c42670a2.b();
                }
                SwipeRefreshLayout swipeRefreshLayout = aboutMeFragment.f330819s0;
                if (swipeRefreshLayout != null) {
                    swipeRefreshLayout.setRefreshing(false);
                }
            } else if (aVar2 instanceof C40868c.a.b) {
                C42670a c42670a3 = aboutMeFragment.f330818r0;
                if (c42670a3 != null) {
                    c42670a3.c(Integer.valueOf(R.style.Theme_DesignSystem_Re23), new com.avito.android.work_profile.profile.about_me.ui.a(aboutMeFragment));
                }
                SwipeRefreshLayout swipeRefreshLayout2 = aboutMeFragment.f330819s0;
                if (swipeRefreshLayout2 != null) {
                    swipeRefreshLayout2.setRefreshing(false);
                }
            }
            return G0.f406611a;
        }
    }

    /* compiled from: AboutMeFragment.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\r\u0012\t\u0012\u00070\u0001¢\u0006\u0002\b\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "LFV0/h;", "LX41/o;", "invoke", "()Ljava/util/Set;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.a<Set<FV0.h>> {
        public e() {
            super(0);
        }

        @Override // Y41.a
        public final Set<FV0.h> invoke() {
            a aVar = AboutMeFragment.f330814x0;
            return AboutMeFragment.this.t5().f330709J;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f330827l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Y41.a aVar) {
            super(0);
            this.f330827l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f330827l);
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
            return AboutMeFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ g f330829l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(g gVar) {
            super(0);
            this.f330829l = gVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f330829l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f330830l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f330830l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f330830l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f330831l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f330831l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f330831l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: AboutMeFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/work_profile/profile/about_me/a;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/work_profile/profile/about_me/a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class k extends N implements Y41.a<com.avito.android.work_profile.profile.about_me.a> {
        public k() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.work_profile.profile.about_me.a invoke() {
            com.avito.android.work_profile.profile.about_me.b bVar = AboutMeFragment.this.f330815o0;
            if (bVar == null) {
                bVar = null;
            }
            return (com.avito.android.work_profile.profile.about_me.a) bVar.get();
        }
    }

    public AboutMeFragment() {
        f fVar = new f(new k());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new h(new g()));
        this.f330816p0 = new O0(m0.f406844a.b(com.avito.android.work_profile.profile.about_me.a.class), new i(interfaceC42726CB), fVar, new j(interfaceC42726CB));
        this.f330821u0 = C42727D.c(new e());
        this.f330823w0 = new ZS.b(AboutMeBeduinV2Screen.f330707d, Owners.f210545u0, (String) null, 4, (C42822w) null);
    }

    @Override // androidx.fragment.app.Fragment
    @l
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @l ViewGroup viewGroup, @l Bundle bundle) {
        s5().e();
        return layoutInflater.inflate(R.layout.about_me_fragment, viewGroup, false);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @l Bundle bundle) {
        super.onViewCreated(view, bundle);
        View viewFindViewById = view.findViewById(R.id.beduin);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.beduin.v2.render.android_view.BeduinView");
        }
        BeduinView beduinView = (BeduinView) viewFindViewById;
        s sVar = this.f330822v0;
        if (sVar == null) {
            sVar = null;
        }
        A aB2 = sVar.b();
        s sVar2 = this.f330822v0;
        com.avito.beduin.v2.theme.k kVarA = (sVar2 != null ? sVar2 : null).a();
        beduinView.f337913c = aB2;
        beduinView.f337914d = kVarA;
        this.f330817q0 = beduinView;
        View viewFindViewById2 = view.findViewById(R.id.progress_container);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        }
        this.f330818r0 = new C42670a((ViewGroup) viewFindViewById2, new b(view), 0, 4, null);
        View viewFindViewById3 = view.findViewById(R.id.swipe_refresh_layout);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.swiperefreshlayout.widget.SwipeRefreshLayout");
        }
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) viewFindViewById3;
        swipeRefreshLayout.setOnRefreshListener(new com.avito.android.str_seller_orders.orders_seller.d(this, 14));
        this.f330819s0 = swipeRefreshLayout;
        com.avito.android.analytics.screens.mvi.a.g(this, s5(), t5(), new c(1, this, AboutMeFragment.class, "handleEvent", "handleEvent(Lcom/avito/android/work_profile/profile/about_me/mvi/entity/AboutMeOneTimeEvent$Public;)V", 0), new d());
        s5().d();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@l Bundle bundle) {
        D.f90335a.getClass();
        F fA2 = D.a.a();
        this.f330820t0 = ((InterfaceC30106l7) C29972i.a(C29972i.b(this), InterfaceC30106l7.class)).b().a(new C28478k(AboutMeBeduinV2Screen.f330707d, com.avito.android.analytics.screens.s.c(this), "aboutMeBeduinV2ContentType"));
        com.avito.android.work_profile.profile.about_me.di.d.a().a(s5(), new C31138n0(K.a(((H.b) C29972i.a(C29972i.b(this), H.b.class)).ed(), s5(), this.f330823w0, cv.c.d(this), null, null, null, 56)), (com.avito.android.work_profile.profile.about_me.di.b) C29972i.a(C29972i.b(this), com.avito.android.work_profile.profile.about_me.di.b.class)).a(this);
        s.a aVarFd = ((s.b) C29972i.a(C29972i.b(this), s.b.class)).fd();
        Context contextRequireContext = requireContext();
        ScreenPerformanceTracker screenPerformanceTrackerS5 = s5();
        com.avito.android.work_profile.profile.about_me.a aVarT5 = t5();
        com.avito.android.work_profile.profile.about_me.a aVarT52 = t5();
        this.f330822v0 = aVarFd.a(contextRequireContext, screenPerformanceTrackerS5, aVarT5.f330710K, v.f57891a, aVarT52.f330708E);
        s5().a(fA2.b());
    }

    @Override // com.avito.android.beduin.v2.page.BaseBeduinHostFragment
    @Y61.k
    public final s q5() {
        s sVar = this.f330822v0;
        if (sVar != null) {
            return sVar;
        }
        return null;
    }

    @Override // com.avito.android.beduin.v2.page.BaseBeduinHostFragment
    @Y61.k
    public final Collection<FV0.h> r5() {
        return (Collection) this.f330821u0.getValue();
    }

    public final ScreenPerformanceTracker s5() {
        ScreenPerformanceTracker screenPerformanceTracker = this.f330820t0;
        if (screenPerformanceTracker != null) {
            return screenPerformanceTracker;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final com.avito.android.work_profile.profile.about_me.a t5() {
        return (com.avito.android.work_profile.profile.about_me.a) this.f330816p0.getValue();
    }

    @Override // FV0.d
    public final void close() {
    }
}
