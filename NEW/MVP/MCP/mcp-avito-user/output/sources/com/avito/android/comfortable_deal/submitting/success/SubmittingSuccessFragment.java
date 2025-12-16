package com.avito.android.comfortable_deal.submitting.success;

import Cd.C13243a;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import androidx.fragment.app.Fragment;
import androidx.view.C19918B;
import androidx.view.InterfaceC22969B;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import androidx.view.x;
import com.avito.android.R;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.s;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.comfortable_deal.ComfortableDealSuccessScreen;
import com.avito.android.deep_linking.links.MainScreenLink;
import com.avito.android.di.C29972i;
import com.avito.android.image_loader.n;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.UniversalImageKt;
import com.avito.android.ui.fragments.BaseFragment;
import com.avito.android.util.InterfaceC35845m2;
import javax.inject.Inject;
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
import rq.C47710c;
import rq.InterfaceC47708a;
import rq.InterfaceC47709b;
import sq.C48398c;
import z1.AbstractC50339a;

/* compiled from: SubmittingSuccessFragment.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/comfortable_deal/submitting/success/SubmittingSuccessFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class SubmittingSuccessFragment extends BaseFragment implements InterfaceC28477j.b {

    /* renamed from: t0, reason: collision with root package name */
    @Y61.k
    public static final a f123365t0 = new a(null);

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public com.avito.android.comfortable_deal.submitting.success.c f123366n0;

    /* renamed from: o0, reason: collision with root package name */
    @Y61.k
    public final O0 f123367o0;

    /* renamed from: p0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f123368p0;

    /* renamed from: q0, reason: collision with root package name */
    @Inject
    public InterfaceC35845m2 f123369q0;

    /* renamed from: r0, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f123370r0;

    /* renamed from: s0, reason: collision with root package name */
    @Y61.l
    public C48398c f123371s0;

    /* compiled from: SubmittingSuccessFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/comfortable_deal/submitting/success/SubmittingSuccessFragment$a;", "", "<init>", "()V", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: SubmittingSuccessFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/activity/x;", "Lkotlin/G0;", "invoke", "(Landroidx/activity/x;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.l<x, G0> {
        public b() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(x xVar) {
            MainScreenLink mainScreenLink = new MainScreenLink(null, null, true, 3, null);
            a aVar = SubmittingSuccessFragment.f123365t0;
            SubmittingSuccessFragment submittingSuccessFragment = SubmittingSuccessFragment.this;
            submittingSuccessFragment.requireActivity().setResult(-1, new Intent().putExtra("bundle_key_deeplink.success", mainScreenLink));
            submittingSuccessFragment.requireActivity().finish();
            return G0.f406611a;
        }
    }

    /* compiled from: SubmittingSuccessFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.a<G0> {
        public c() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            a aVar = SubmittingSuccessFragment.f123365t0;
            ((com.avito.android.comfortable_deal.submitting.success.b) SubmittingSuccessFragment.this.f123367o0.getValue()).accept(InterfaceC47708a.c.f430262a);
            return G0.f406611a;
        }
    }

    /* compiled from: SubmittingSuccessFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.a<G0> {
        public d() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            a aVar = SubmittingSuccessFragment.f123365t0;
            ((com.avito.android.comfortable_deal.submitting.success.b) SubmittingSuccessFragment.this.f123367o0.getValue()).accept(InterfaceC47708a.b.f430261a);
            return G0.f406611a;
        }
    }

    /* compiled from: SubmittingSuccessFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.a<G0> {
        public e() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            a aVar = SubmittingSuccessFragment.f123365t0;
            ((com.avito.android.comfortable_deal.submitting.success.b) SubmittingSuccessFragment.this.f123367o0.getValue()).accept(InterfaceC47708a.C12397a.f430260a);
            return G0.f406611a;
        }
    }

    /* compiled from: SubmittingSuccessFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class f extends H implements Y41.l<InterfaceC47709b, G0> {
        @Override // Y41.l
        public final G0 invoke(InterfaceC47709b interfaceC47709b) {
            InterfaceC47709b interfaceC47709b2 = interfaceC47709b;
            SubmittingSuccessFragment submittingSuccessFragment = (SubmittingSuccessFragment) this.receiver;
            a aVar = SubmittingSuccessFragment.f123365t0;
            submittingSuccessFragment.getClass();
            if (interfaceC47709b2 instanceof InterfaceC47709b.a) {
                submittingSuccessFragment.requireActivity().setResult(-1, new Intent().putExtra("bundle_key_deeplink.success", ((InterfaceC47709b.a) interfaceC47709b2).f430263a));
                submittingSuccessFragment.requireActivity().finish();
            }
            return G0.f406611a;
        }
    }

    /* compiled from: SubmittingSuccessFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class g extends H implements Y41.l<C47710c, G0> {
        @Override // Y41.l
        public final G0 invoke(C47710c c47710c) {
            C47710c c47710c2 = c47710c;
            C48398c c48398c = ((SubmittingSuccessFragment) this.receiver).f123371s0;
            if (c48398c != null) {
                UniversalImage universalImage = c47710c2.f430266d;
                com.avito.android.image_loader.glide.utils.b.d(c48398c.f438875e, n.a(universalImage != null ? UniversalImageKt.getImageDependsOnTheme(universalImage, com.avito.android.lib.util.darkTheme.c.b(c48398c.f438874d)) : null));
                c48398c.f438876f.setText(c47710c2.f430264b);
                c48398c.f438877g.setText(c47710c2.f430265c);
                String str = c47710c2.f430269g;
                if (str != null) {
                    c48398c.f438878h.setText(str);
                }
                String str2 = c47710c2.f430268f;
                if (str2 != null) {
                    c48398c.f438879i.setText(str2);
                }
            }
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f123376l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(Y41.a aVar) {
            super(0);
            this.f123376l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f123376l);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "Cd/i", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<Fragment> {
        public i() {
            super(0);
        }

        @Override // Y41.a
        public final Fragment invoke() {
            return SubmittingSuccessFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ i f123378l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(i iVar) {
            super(0);
            this.f123378l = iVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f123378l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class k extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f123379l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f123379l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f123379l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class l extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f123380l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f123380l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f123380l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: SubmittingSuccessFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/comfortable_deal/submitting/success/b;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/comfortable_deal/submitting/success/b;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class m extends N implements Y41.a<com.avito.android.comfortable_deal.submitting.success.b> {
        public m() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.comfortable_deal.submitting.success.b invoke() {
            com.avito.android.comfortable_deal.submitting.success.c cVar = SubmittingSuccessFragment.this.f123366n0;
            if (cVar == null) {
                cVar = null;
            }
            return (com.avito.android.comfortable_deal.submitting.success.b) cVar.get();
        }
    }

    public SubmittingSuccessFragment() {
        super(0, 1, null);
        h hVar = new h(new m());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new j(new i()));
        this.f123367o0 = new O0(m0.f406844a.b(com.avito.android.comfortable_deal.submitting.success.b.class), new k(interfaceC42726CB), hVar, new l(interfaceC42726CB));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(@Y61.k Context context) {
        super.onAttach(context);
        C19918B.a(requireActivity().getF21241d(), this, new b(), 2);
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.k
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f123368p0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        View viewInflate = layoutInflater.inflate(R.layout.comfort_deal_success_fragment, viewGroup, false);
        this.f123371s0 = new C48398c(viewInflate, new c(), new d(), new e());
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f123368p0;
        com.avito.android.analytics.screens.mvi.a.g(this, screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null, (com.avito.android.comfortable_deal.submitting.success.b) this.f123367o0.getValue(), new f(1, this, SubmittingSuccessFragment.class, "handleEvent", "handleEvent(Lcom/avito/android/comfortable_deal/submitting/success/mvi/entity/SubmittingSuccessOneTimeEvent;)V", 0), new g(1, this, SubmittingSuccessFragment.class, "render", "render(Lcom/avito/android/comfortable_deal/submitting/success/mvi/entity/SubmittingSuccessState;)V", 0));
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        this.f123371s0 = null;
        super.onDestroyView();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) {
        super.onViewCreated(view, bundle);
        ScreenPerformanceTracker screenPerformanceTracker = this.f123368p0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.d();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@Y61.l Bundle bundle) {
        D.f90335a.getClass();
        F fA2 = D.a.a();
        com.avito.android.comfortable_deal.submitting.success.di.a.a().a((com.avito.android.comfortable_deal.submitting.success.di.c) C29972i.a(C29972i.b(this), com.avito.android.comfortable_deal.submitting.success.di.c.class), cv.c.b(this), new C28478k(ComfortableDealSuccessScreen.f119748d, s.c(this), null, 4, null)).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f123368p0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
    }
}
