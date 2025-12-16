package com.avito.android.related_products.bottom_sheet;

import Cd.C13243a;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.view.InterfaceC22969B;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import cU.s;
import cj0.C27210c;
import cj0.InterfaceC27209b;
import com.avito.android.R;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.tracker.ScreenTransfer;
import com.avito.android.beduin.v2.page.BaseBeduinHostFragment;
import com.avito.android.di.C29972i;
import com.avito.android.di.module.InterfaceC30106l7;
import com.avito.android.lib.beduin_v2.feature.di.C31138n0;
import com.avito.android.lib.beduin_v2.feature.di.H;
import com.avito.android.lib.beduin_v2.feature.di.K;
import com.avito.android.lib.beduin_v2.feature.mvi.entity.BeduinOneTimeEvent;
import com.avito.android.ownership.Owners;
import com.avito.android.related_products.perf_const.RelatedProductsBottomSheetBeduinV2Screen;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.util.V2;
import com.avito.beduin.v2.render.android_view.A;
import com.avito.beduin.v2.render.android_view.BeduinView;
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
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import z1.AbstractC50339a;

/* compiled from: RelatedProductsPageFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/related_products/bottom_sheet/RelatedProductsPageFragment;", "Lcom/avito/android/beduin/v2/page/BaseBeduinHostFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_related-products_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class RelatedProductsPageFragment extends BaseBeduinHostFragment implements InterfaceC28477j.b {

    /* renamed from: w0, reason: collision with root package name */
    @Y61.k
    public static final a f252830w0 = new a(null);

    /* renamed from: o0, reason: collision with root package name */
    @Inject
    public q f252831o0;

    /* renamed from: p0, reason: collision with root package name */
    @Y61.k
    public final O0 f252832p0;

    /* renamed from: q0, reason: collision with root package name */
    @Inject
    public com.avito.android.related_products.bottom_sheet.k f252833q0;

    /* renamed from: r0, reason: collision with root package name */
    @Y61.l
    public C42670a f252834r0;

    /* renamed from: s0, reason: collision with root package name */
    @Y61.l
    public BeduinView f252835s0;

    /* renamed from: t0, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f252836t0;

    /* renamed from: u0, reason: collision with root package name */
    public cU.s f252837u0;

    /* renamed from: v0, reason: collision with root package name */
    @Y61.l
    public Y41.a<G0> f252838v0;

    /* compiled from: RelatedProductsPageFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/related_products/bottom_sheet/RelatedProductsPageFragment$a;", "", "<init>", "()V", "_avito_related-products_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: RelatedProductsPageFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/view/View;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends N implements Y41.a<View> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ BeduinView f252839l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(BeduinView beduinView) {
            super(0);
            this.f252839l = beduinView;
        }

        @Override // Y41.a
        public final View invoke() {
            return this.f252839l;
        }
    }

    /* compiled from: RelatedProductsPageFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class c extends H implements Y41.l<InterfaceC27209b.e, G0> {
        @Override // Y41.l
        public final G0 invoke(InterfaceC27209b.e eVar) {
            InterfaceC27209b.e eVar2 = eVar;
            RelatedProductsPageFragment relatedProductsPageFragment = (RelatedProductsPageFragment) this.receiver;
            a aVar = RelatedProductsPageFragment.f252830w0;
            relatedProductsPageFragment.getClass();
            if (eVar2 instanceof InterfaceC27209b.f) {
                BeduinView beduinView = relatedProductsPageFragment.f252835s0;
                if (beduinView != null) {
                    com.avito.android.lib.beduin_v2.ui_messages.b bVar = com.avito.android.lib.beduin_v2.ui_messages.b.f177570a;
                    BeduinOneTimeEvent.ShowToastBar showToastBar = ((InterfaceC27209b.f) eVar2).f58115a;
                    bVar.getClass();
                    com.avito.android.lib.beduin_v2.ui_messages.b.a(beduinView, showToastBar);
                }
            } else if (eVar2 instanceof InterfaceC27209b.C2059b) {
                BeduinView beduinView2 = relatedProductsPageFragment.f252835s0;
                if (beduinView2 != null) {
                    beduinView2.c(((InterfaceC27209b.C2059b) eVar2).f58113a);
                }
            } else {
                boolean z12 = eVar2 instanceof InterfaceC27209b.c;
            }
            return G0.f406611a;
        }
    }

    /* compiled from: RelatedProductsPageFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcj0/c;", VoiceInfo.STATE, "Lkotlin/G0;", "invoke", "(Lcj0/c;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.l<C27210c, G0> {
        public d() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(C27210c c27210c) {
            a aVar = RelatedProductsPageFragment.f252830w0;
            RelatedProductsPageFragment relatedProductsPageFragment = RelatedProductsPageFragment.this;
            C27210c.b.C2061c c2061c = C27210c.b.C2061c.f58121a;
            C27210c.b bVar = c27210c.f58118b;
            if (!L.f(bVar, c2061c)) {
                if (bVar instanceof C27210c.b.a) {
                    C42670a c42670a = relatedProductsPageFragment.f252834r0;
                    if (c42670a != null) {
                        c42670a.b();
                    }
                    BeduinView beduinView = relatedProductsPageFragment.f252835s0;
                    if (beduinView != null) {
                        beduinView.b(((C27210c.b.a) bVar).f58119a);
                    }
                } else if (bVar instanceof C27210c.b.C2060b) {
                    V2.f318762a.f(((C27210c.b.C2060b) bVar).f58120a);
                    C42670a c42670a2 = relatedProductsPageFragment.f252834r0;
                    if (c42670a2 != null) {
                        c42670a2.c(null, new x(relatedProductsPageFragment));
                    }
                }
            }
            return G0.f406611a;
        }
    }

    /* compiled from: RelatedProductsPageFragment.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\r\u0012\t\u0012\u00070\u0001¢\u0006\u0002\b\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "LFV0/h;", "LX41/o;", "invoke", "()Ljava/util/Set;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.a<Set<FV0.h>> {
        public e() {
            super(0);
        }

        @Override // Y41.a
        public final Set<FV0.h> invoke() {
            a aVar = RelatedProductsPageFragment.f252830w0;
            return ((p) RelatedProductsPageFragment.this.f252832p0.getValue()).f252939J;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f252842l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Y41.a aVar) {
            super(0);
            this.f252842l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f252842l);
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
            return RelatedProductsPageFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ g f252844l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(g gVar) {
            super(0);
            this.f252844l = gVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f252844l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f252845l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f252845l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f252845l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f252846l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f252846l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f252846l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: RelatedProductsPageFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/related_products/bottom_sheet/p;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/related_products/bottom_sheet/p;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class k extends N implements Y41.a<p> {
        public k() {
            super(0);
        }

        @Override // Y41.a
        public final p invoke() {
            q qVar = RelatedProductsPageFragment.this.f252831o0;
            if (qVar == null) {
                qVar = null;
            }
            return (p) qVar.get();
        }
    }

    public RelatedProductsPageFragment() {
        f fVar = new f(new k());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new h(new g()));
        this.f252832p0 = new O0(m0.f406844a.b(p.class), new i(interfaceC42726CB), fVar, new j(interfaceC42726CB));
        this.f252836t0 = C42727D.c(new e());
    }

    @Override // FV0.d
    public final void close() {
        Y41.a<G0> aVar = this.f252838v0;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    @Override // com.avito.android.beduin.v2.page.BaseBeduinHostFragment, com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(@Y61.l Bundle bundle) {
        Bundle arguments;
        super.onCreate(bundle);
        if (bundle != null || (arguments = getArguments()) == null) {
            return;
        }
        ScreenTransfer screenTransfer = (ScreenTransfer) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) arguments.getParcelable("SCREEN_TRANSFER_KEY", ScreenTransfer.class) : arguments.getParcelable("SCREEN_TRANSFER_KEY"));
        if (screenTransfer != null) {
            com.avito.android.related_products.bottom_sheet.k kVar = this.f252833q0;
            if (kVar == null) {
                kVar = null;
            }
            kVar.x(screenTransfer);
        }
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.k
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        com.avito.android.related_products.bottom_sheet.k kVar = this.f252833q0;
        if (kVar == null) {
            kVar = null;
        }
        kVar.e();
        View viewInflate = layoutInflater.inflate(R.layout.fragment_related_products_page, viewGroup, false);
        ViewGroup viewGroup2 = (ViewGroup) viewInflate.findViewById(R.id.content_container);
        BeduinView beduinView = (BeduinView) viewInflate.findViewById(R.id.beduin);
        cU.s sVar = this.f252837u0;
        if (sVar == null) {
            sVar = null;
        }
        A aB2 = sVar.b();
        cU.s sVar2 = this.f252837u0;
        if (sVar2 == null) {
            sVar2 = null;
        }
        com.avito.beduin.v2.theme.k kVarA = sVar2.a();
        beduinView.f337913c = aB2;
        beduinView.f337914d = kVarA;
        this.f252834r0 = new C42670a(viewGroup2, new b(beduinView), 0, 4, null);
        this.f252835s0 = beduinView;
        com.avito.android.related_products.bottom_sheet.k kVar2 = this.f252833q0;
        com.avito.android.analytics.screens.mvi.a.g(this, kVar2 != null ? kVar2 : null, (p) this.f252832p0.getValue(), new c(1, this, RelatedProductsPageFragment.class, "handleEvent", "handleEvent(Lcom/avito/android/related_products/bottom_sheet/mvi/entity/RelatedProductsBottomSheetOneTimeEvent$Public;)V", 0), new d());
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f252835s0 = null;
        this.f252834r0 = null;
        this.f252838v0 = null;
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) {
        super.onViewCreated(view, bundle);
        com.avito.android.related_products.bottom_sheet.k kVar = this.f252833q0;
        if (kVar == null) {
            kVar = null;
        }
        kVar.d();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@Y61.l Bundle bundle) {
        D.f90335a.getClass();
        F fA2 = D.a.a();
        RelatedProductsBottomSheetBeduinV2Screen relatedProductsBottomSheetBeduinV2Screen = RelatedProductsBottomSheetBeduinV2Screen.f253005d;
        com.avito.android.analytics.screens.r rVarC = com.avito.android.analytics.screens.s.c(this);
        com.avito.android.analytics.screens.tracker.F fA3 = ((InterfaceC30106l7) C29972i.a(C29972i.b(this), InterfaceC30106l7.class)).b().a(new C28478k(relatedProductsBottomSheetBeduinV2Screen, rVarC, null, 4, null));
        com.avito.android.related_products.bottom_sheet.di.a.a().a(fA3, relatedProductsBottomSheetBeduinV2Screen, rVarC, new C31138n0(K.a(((H.b) C29972i.a(C29972i.b(this), H.b.class)).ed(), fA3, new ZS.b(relatedProductsBottomSheetBeduinV2Screen, Owners.f210448U, (String) null, 4, (C42822w) null), cv.c.d(this), null, null, null, 56)), (com.avito.android.related_products.bottom_sheet.di.f) C29972i.a(C29972i.b(this), com.avito.android.related_products.bottom_sheet.di.f.class), cv.c.b(this)).a(this);
        s.a aVarFd = ((s.b) C29972i.a(C29972i.b(this), s.b.class)).fd();
        Context contextRequireContext = requireContext();
        O0 o02 = this.f252832p0;
        this.f252837u0 = aVarFd.a(contextRequireContext, fA3, ((p) o02.getValue()).f252942M, cU.v.f57891a, ((p) o02.getValue()).f252938E);
        com.avito.android.related_products.bottom_sheet.k kVar = this.f252833q0;
        if (kVar == null) {
            kVar = null;
        }
        kVar.a(fA2.b());
        com.avito.android.related_products.bottom_sheet.k kVar2 = this.f252833q0;
        (kVar2 != null ? kVar2 : null).c(this, g5());
    }

    @Override // com.avito.android.beduin.v2.page.BaseBeduinHostFragment
    @Y61.k
    public final cU.s q5() {
        cU.s sVar = this.f252837u0;
        if (sVar != null) {
            return sVar;
        }
        return null;
    }

    @Override // com.avito.android.beduin.v2.page.BaseBeduinHostFragment
    @Y61.k
    public final Collection<FV0.h> r5() {
        return (Collection) this.f252836t0.getValue();
    }
}
