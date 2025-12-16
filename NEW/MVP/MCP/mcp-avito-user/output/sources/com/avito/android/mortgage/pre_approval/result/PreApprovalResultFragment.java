package com.avito.android.mortgage.pre_approval.result;

import Cd.C13243a;
import W00.a;
import W00.c;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import androidx.compose.runtime.internal.P;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
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
import com.avito.android.component.toast.f;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.di.C29972i;
import com.avito.android.lib.design.button.Button;
import com.avito.android.mortgage.di.o;
import com.avito.android.mortgage.pre_approval.model.PreApprovalArguments;
import com.avito.android.mortgage.pre_approval.result.di.b;
import com.avito.android.mortgage.screens.MortgagePreApprovalResultScreen;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.error.ApiError;
import com.avito.android.ui.fragments.BaseFragment;
import com.avito.android.util.C35966w1;
import cv.InterfaceC39417a;
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
import z1.AbstractC50339a;

/* compiled from: PreApprovalResultFragment.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/mortgage/pre_approval/result/PreApprovalResultFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class PreApprovalResultFragment extends BaseFragment implements InterfaceC28477j.b {

    /* renamed from: s0, reason: collision with root package name */
    @Y61.k
    public static final a f201978s0 = new a(null);

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public com.avito.android.mortgage.pre_approval.result.b f201979n0;

    /* renamed from: o0, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f201980o0;

    /* renamed from: p0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f201981p0;

    /* renamed from: q0, reason: collision with root package name */
    @Inject
    public com.avito.android.mortgage.pre_approval.result.d f201982q0;

    /* renamed from: r0, reason: collision with root package name */
    @Y61.k
    public final O0 f201983r0;

    /* compiled from: PreApprovalResultFragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/mortgage/pre_approval/result/PreApprovalResultFragment$a;", "", "<init>", "()V", "", "PRE_APPROVAL_ARGS", "Ljava/lang/String;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* compiled from: PreApprovalResultFragment.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/os/Bundle;", "Lkotlin/G0;", "invoke", "(Landroid/os/Bundle;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.mortgage.pre_approval.result.PreApprovalResultFragment$a$a, reason: collision with other inner class name */
        public static final class C5991a extends N implements Y41.l<Bundle, G0> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ PreApprovalArguments f201984l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C5991a(PreApprovalArguments preApprovalArguments) {
                super(1);
                this.f201984l = preApprovalArguments;
            }

            @Override // Y41.l
            public final G0 invoke(Bundle bundle) {
                bundle.putParcelable("PRE_APPROVAL_ARGS", this.f201984l);
                return G0.f406611a;
            }
        }

        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @Y61.k
        public static BaseFragment a(@Y61.k PreApprovalArguments preApprovalArguments) {
            PreApprovalResultFragment preApprovalResultFragment = new PreApprovalResultFragment();
            C35966w1.a(preApprovalResultFragment, -1, new C5991a(preApprovalArguments));
            return preApprovalResultFragment;
        }

        public a() {
        }
    }

    /* compiled from: PreApprovalResultFragment.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/mortgage/pre_approval/result/PreApprovalResultFragment$b", "Landroidx/activity/x;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b extends x {
        public b() {
            super(true);
        }

        @Override // androidx.view.x
        public final void c() {
            a aVar = PreApprovalResultFragment.f201978s0;
            PreApprovalResultFragment.this.q5().accept(a.C1219a.f17541a);
        }
    }

    /* compiled from: PreApprovalResultFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.a<G0> {
        public c() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            a aVar = PreApprovalResultFragment.f201978s0;
            PreApprovalResultFragment.this.q5().accept(a.b.f17542a);
            return G0.f406611a;
        }
    }

    /* compiled from: PreApprovalResultFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.a<G0> {
        public d() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            a aVar = PreApprovalResultFragment.f201978s0;
            PreApprovalResultFragment.this.q5().accept(a.c.f17543a);
            return G0.f406611a;
        }
    }

    /* compiled from: PreApprovalResultFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class e extends H implements Y41.l<W00.c, G0> {
        @Override // Y41.l
        public final G0 invoke(W00.c cVar) {
            W00.c cVar2 = cVar;
            PreApprovalResultFragment preApprovalResultFragment = (PreApprovalResultFragment) this.receiver;
            a aVar = PreApprovalResultFragment.f201978s0;
            preApprovalResultFragment.getClass();
            if (cVar2 instanceof c.a) {
                androidx.fragment.app.H hE2 = preApprovalResultFragment.getParentFragmentManager().e();
                hE2.m(preApprovalResultFragment);
                hE2.e();
            } else {
                if (cVar2 instanceof c.b) {
                    c.b bVar = (c.b) cVar2;
                    com.avito.android.deeplink_handler.handler.composite.a aVar2 = preApprovalResultFragment.f201980o0;
                    if (aVar2 == null) {
                        aVar2 = null;
                    }
                    b.a.a(aVar2, bVar.f17546a, null, null, 6);
                } else if (cVar2 instanceof c.C1220c) {
                    com.avito.android.mortgage.pre_approval.result.b bVar2 = preApprovalResultFragment.f201979n0;
                    c.C1220c c1220c = (c.C1220c) cVar2;
                    ViewGroup viewGroup = (bVar2 != null ? bVar2 : null).f201998c;
                    if (viewGroup != null) {
                        com.avito.android.component.toast.c cVar3 = com.avito.android.component.toast.c.f125244a;
                        ApiError apiError = c1220c.f17547a;
                        com.avito.android.component.toast.c.b(cVar3, viewGroup, com.avito.android.printable_text.b.f(apiError.getF244063c()), null, null, null, new f.c(apiError), 0, null, null, false, false, null, null, 4078);
                    }
                }
            }
            return G0.f406611a;
        }
    }

    /* compiled from: PreApprovalResultFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LX00/a;", "it", "Lkotlin/G0;", "invoke", "(LX00/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.l<X00.a, G0> {
        public f() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(X00.a aVar) {
            X00.b f18113i = aVar.getF18113i();
            PreApprovalResultFragment preApprovalResultFragment = PreApprovalResultFragment.this;
            com.avito.android.mortgage.pre_approval.result.b bVar = preApprovalResultFragment.f201979n0;
            if (bVar == null) {
                bVar = null;
            }
            PrintableText printableText = f18113i.f18115b;
            String strK0 = printableText != null ? printableText.k0(preApprovalResultFragment.requireContext()) : null;
            Button button = bVar.f202000e;
            if (button != null) {
                com.avito.android.lib.design.button.b.a(button, strK0, false);
            }
            com.avito.android.mortgage.pre_approval.result.b bVar2 = preApprovalResultFragment.f201979n0;
            if (bVar2 == null) {
                bVar2 = null;
            }
            bVar2.f201996a.l(f18113i.f18114a, null);
            return G0.f406611a;
        }
    }

    /* compiled from: PreApprovalResultFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LW00/a;", "it", "Lkotlin/G0;", "invoke", "(LW00/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.l<W00.a, G0> {
        public g() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(W00.a aVar) {
            a aVar2 = PreApprovalResultFragment.f201978s0;
            PreApprovalResultFragment.this.q5().accept(aVar);
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f201990l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(Y41.a aVar) {
            super(0);
            this.f201990l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f201990l);
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
            return PreApprovalResultFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ i f201992l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(i iVar) {
            super(0);
            this.f201992l = iVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f201992l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class k extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f201993l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f201993l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f201993l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class l extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f201994l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f201994l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f201994l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: PreApprovalResultFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/mortgage/pre_approval/result/c;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/mortgage/pre_approval/result/c;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class m extends N implements Y41.a<com.avito.android.mortgage.pre_approval.result.c> {
        public m() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.mortgage.pre_approval.result.c invoke() {
            com.avito.android.mortgage.pre_approval.result.d dVar = PreApprovalResultFragment.this.f201982q0;
            if (dVar == null) {
                dVar = null;
            }
            return (com.avito.android.mortgage.pre_approval.result.c) dVar.get();
        }
    }

    public PreApprovalResultFragment() {
        super(R.layout.pre_approval_fragment);
        h hVar = new h(new m());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new j(new i()));
        this.f201983r0 = new O0(m0.f406844a.b(com.avito.android.mortgage.pre_approval.result.c.class), new k(interfaceC42726CB), hVar, new l(interfaceC42726CB));
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(@Y61.l Bundle bundle) {
        super.onCreate(bundle);
        requireActivity().getF21241d().a(this, new b());
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.l
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f201981p0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        if (getParentFragmentManager().G(R.id.container) == null) {
            requireActivity().finish();
        }
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        com.avito.android.mortgage.pre_approval.result.b bVar = this.f201979n0;
        if (bVar == null) {
            bVar = null;
        }
        bVar.f201998c = null;
        bVar.f201999d = null;
        bVar.f202000e = null;
        bVar.f202001f = null;
        super.onDestroyView();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) {
        super.onViewCreated(view, bundle);
        com.avito.android.mortgage.pre_approval.result.b bVar = this.f201979n0;
        if (bVar == null) {
            bVar = null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        bVar.f201998c = viewGroup;
        View viewFindViewById = viewGroup.findViewById(R.id.back_button);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        viewFindViewById.setVisibility(4);
        View viewFindViewById2 = viewGroup.findViewById(R.id.title);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        viewFindViewById2.setVisibility(4);
        View viewFindViewById3 = viewGroup.findViewById(R.id.close_button);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageButton");
        }
        bVar.f201999d = (ImageButton) viewFindViewById3;
        View viewFindViewById4 = viewGroup.findViewById(R.id.navigation);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        bVar.f202000e = (Button) viewFindViewById4;
        View viewFindViewById5 = viewGroup.findViewById(R.id.recycler);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        }
        bVar.f202001f = (RecyclerView) viewFindViewById5;
        viewGroup.getContext();
        RecyclerView recyclerView = bVar.f202001f;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(new LinearLayoutManager());
        }
        RecyclerView recyclerView2 = bVar.f202001f;
        if (recyclerView2 != null) {
            recyclerView2.setAdapter(bVar.f201996a);
        }
        RecyclerView recyclerView3 = bVar.f202001f;
        if (recyclerView3 != null) {
            recyclerView3.l(new V00.a(bVar.f201997b), -1);
        }
        com.avito.android.mortgage.pre_approval.result.b bVar2 = this.f201979n0;
        if (bVar2 == null) {
            bVar2 = null;
        }
        c cVar = new c();
        d dVar = new d();
        ImageButton imageButton = bVar2.f201999d;
        if (imageButton != null) {
            imageButton.setOnClickListener(new com.avito.android.mortgage.applicant_type.a(17, cVar));
        }
        Button button = bVar2.f202000e;
        if (button != null) {
            button.setOnClickListener(new com.avito.android.mortgage.applicant_type.a(18, dVar));
        }
        ScreenPerformanceTracker screenPerformanceTracker = this.f201981p0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        com.avito.android.analytics.screens.mvi.a.g(this, screenPerformanceTracker, q5(), new e(1, this, PreApprovalResultFragment.class, "handleEvent", "handleEvent(Lcom/avito/android/mortgage/pre_approval/result/mvi/entity/PreApprovalResultOneTimeEvent;)V", 0), new f());
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f201981p0;
        (screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null).d();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@Y61.l Bundle bundle) {
        D.f90335a.getClass();
        F fA2 = D.a.a();
        C28478k c28478k = new C28478k(MortgagePreApprovalResultScreen.f203386d, s.c(this), null, 4, null);
        b.a aVarA = com.avito.android.mortgage.pre_approval.result.di.a.a();
        o oVar = (o) C29972i.a(C29972i.b(this), o.class);
        InterfaceC39417a interfaceC39417aB = cv.c.b(this);
        g gVar = new g();
        Bundle bundleRequireArguments = requireArguments();
        aVarA.a(oVar, interfaceC39417aB, c28478k, gVar, (PreApprovalArguments) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) bundleRequireArguments.getParcelable("PRE_APPROVAL_ARGS", PreApprovalArguments.class) : bundleRequireArguments.getParcelable("PRE_APPROVAL_ARGS"))).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f201981p0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
    }

    public final com.avito.android.mortgage.pre_approval.result.c q5() {
        return (com.avito.android.mortgage.pre_approval.result.c) this.f201983r0.getValue();
    }
}
