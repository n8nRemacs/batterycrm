package com.avito.android.evidence_request.mvi.proof_types;

import Cd.C13243a;
import Y61.k;
import Y61.l;
import Zz.C19626c;
import Zz.InterfaceC19625b;
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
import com.avito.android.R;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.ProofTypesScreen;
import com.avito.android.analytics.screens.s;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.di.C29972i;
import com.avito.android.di.module.InterfaceC30106l7;
import com.avito.android.evidence_request.mvi.domain.evidence_request.EvidenceContent;
import com.avito.android.evidence_request.mvi.domain.evidence_request.ProofDetailsContent;
import com.avito.android.evidence_request.mvi.domain.evidence_request.ProofType;
import com.avito.android.evidence_request.mvi.domain.evidence_request.ProofTypesContent;
import com.avito.android.evidence_request.mvi.evidence_details.EvidenceDetailsFragment;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.radio.RadioButton;
import com.avito.android.lib.design.radio.RadioGroup;
import com.avito.android.ui.fragments.BaseFragment;
import com.avito.android.util.C35966w1;
import java.util.Iterator;
import java.util.LinkedHashMap;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import ru.avito.component.toolbar.CollapsingTitleAppBarLayout;
import z1.AbstractC50339a;

/* compiled from: ProofTypesFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/evidence_request/mvi/proof_types/ProofTypesFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_evidence-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ProofTypesFragment extends BaseFragment implements InterfaceC28477j.b {

    /* renamed from: s0, reason: collision with root package name */
    @k
    public static final a f149156s0 = new a(null);

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public com.avito.android.evidence_request.mvi.proof_types.e f149157n0;

    /* renamed from: o0, reason: collision with root package name */
    @k
    public final O0 f149158o0;

    /* renamed from: p0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f149159p0;

    /* renamed from: q0, reason: collision with root package name */
    @k
    public final InterfaceC42726C f149160q0;

    /* renamed from: r0, reason: collision with root package name */
    @l
    public com.avito.android.evidence_request.mvi.proof_types.c f149161r0;

    /* compiled from: ProofTypesFragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/evidence_request/mvi/proof_types/ProofTypesFragment$a;", "", "<init>", "()V", "", "KEY_INITIAL_DATA", "Ljava/lang/String;", "TAG_DETAILS_FRAGMENT", "_avito_evidence-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* compiled from: ProofTypesFragment.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/os/Bundle;", "Lkotlin/G0;", "invoke", "(Landroid/os/Bundle;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.evidence_request.mvi.proof_types.ProofTypesFragment$a$a, reason: collision with other inner class name */
        public static final class C4373a extends N implements Y41.l<Bundle, G0> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ EvidenceContent f149162l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C4373a(EvidenceContent evidenceContent) {
                super(1);
                this.f149162l = evidenceContent;
            }

            @Override // Y41.l
            public final G0 invoke(Bundle bundle) {
                bundle.putParcelable("initial_data", this.f149162l);
                return G0.f406611a;
            }
        }

        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @k
        public static ProofTypesFragment a(@k EvidenceContent evidenceContent) {
            ProofTypesFragment proofTypesFragment = new ProofTypesFragment();
            C35966w1.a(proofTypesFragment, -1, new C4373a(evidenceContent));
            return proofTypesFragment;
        }

        public a() {
        }
    }

    /* compiled from: ProofTypesFragment.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/avito/android/evidence_request/mvi/domain/evidence_request/EvidenceContent;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends N implements Y41.a<EvidenceContent> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final EvidenceContent invoke() {
            EvidenceContent evidenceContent;
            Bundle arguments = ProofTypesFragment.this.getArguments();
            if (arguments != null) {
                evidenceContent = (EvidenceContent) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) arguments.getParcelable("initial_data", EvidenceContent.class) : arguments.getParcelable("initial_data"));
            } else {
                evidenceContent = null;
            }
            if (evidenceContent != null) {
                return evidenceContent;
            }
            throw new IllegalArgumentException("Required value was null.");
        }
    }

    /* compiled from: ProofTypesFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class c extends H implements Y41.l<InterfaceC19625b, G0> {
        @Override // Y41.l
        public final G0 invoke(InterfaceC19625b interfaceC19625b) {
            InterfaceC19625b interfaceC19625b2 = interfaceC19625b;
            ProofTypesFragment proofTypesFragment = (ProofTypesFragment) this.receiver;
            a aVar = ProofTypesFragment.f149156s0;
            proofTypesFragment.getClass();
            if (interfaceC19625b2 instanceof InterfaceC19625b.C1476b) {
                LinkedHashMap linkedHashMap = ((EvidenceContent) proofTypesFragment.f149160q0.getValue()).f148727c;
                String str = ((InterfaceC19625b.C1476b) interfaceC19625b2).f20618a;
                ProofDetailsContent proofDetailsContent = (ProofDetailsContent) linkedHashMap.get(str);
                if (proofDetailsContent != null) {
                    androidx.fragment.app.H hE2 = proofTypesFragment.getParentFragmentManager().e();
                    EvidenceDetailsFragment.f148738w0.getClass();
                    hE2.n(R.id.fragment_container, EvidenceDetailsFragment.a.a(str, proofDetailsContent), "details");
                    hE2.c("details");
                    hE2.e();
                }
            } else if (interfaceC19625b2 instanceof InterfaceC19625b.a) {
                proofTypesFragment.requireActivity().onBackPressed();
            }
            return G0.f406611a;
        }
    }

    /* compiled from: ProofTypesFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LZz/c;", "it", "Lkotlin/G0;", "invoke", "(LZz/c;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.l<C19626c, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final d f149164l = new d();

        public d() {
            super(1);
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ G0 invoke(C19626c c19626c) {
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f149165l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Y41.a aVar) {
            super(0);
            this.f149165l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f149165l);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "Cd/i", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<Fragment> {
        public f() {
            super(0);
        }

        @Override // Y41.a
        public final Fragment invoke() {
            return ProofTypesFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ f f149167l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(f fVar) {
            super(0);
            this.f149167l = fVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f149167l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f149168l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f149168l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f149168l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f149169l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f149169l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f149169l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: ProofTypesFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/evidence_request/mvi/proof_types/d;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/evidence_request/mvi/proof_types/d;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.a<com.avito.android.evidence_request.mvi.proof_types.d> {
        public j() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.evidence_request.mvi.proof_types.d invoke() {
            com.avito.android.evidence_request.mvi.proof_types.e eVar = ProofTypesFragment.this.f149157n0;
            if (eVar == null) {
                eVar = null;
            }
            return (com.avito.android.evidence_request.mvi.proof_types.d) eVar.get();
        }
    }

    public ProofTypesFragment() {
        super(0, 1, null);
        e eVar = new e(new j());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new g(new f()));
        this.f149158o0 = new O0(m0.f406844a.b(com.avito.android.evidence_request.mvi.proof_types.d.class), new h(interfaceC42726CB), eVar, new i(interfaceC42726CB));
        this.f149160q0 = C42727D.c(new b());
    }

    @Override // androidx.fragment.app.Fragment
    @k
    public final View onCreateView(@k LayoutInflater layoutInflater, @l ViewGroup viewGroup, @l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f149159p0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f149159p0;
        com.avito.android.analytics.screens.mvi.a.g(this, screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null, (com.avito.android.evidence_request.mvi.proof_types.d) this.f149158o0.getValue(), new c(1, this, ProofTypesFragment.class, "handleEvent", "handleEvent(Lcom/avito/android/evidence_request/mvi/proof_types/mvi/entity/ProofTypesOneTimeEvent;)V", 0), d.f149164l);
        return layoutInflater.inflate(R.layout.proof_types_fragment, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        com.avito.android.evidence_request.mvi.proof_types.c cVar = this.f149161r0;
        if (cVar != null) {
            cVar.f149173c.setClickListener(null);
            cVar.f149175e.setOnCheckedChangeListener(null);
        }
        this.f149161r0 = null;
        super.onDestroyView();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@k View view, @l Bundle bundle) {
        super.onViewCreated(view, bundle);
        com.avito.android.evidence_request.mvi.proof_types.c cVar = new com.avito.android.evidence_request.mvi.proof_types.c(view, (com.avito.android.evidence_request.mvi.proof_types.d) this.f149158o0.getValue());
        this.f149161r0 = cVar;
        ProofTypesContent proofTypesContent = ((EvidenceContent) this.f149160q0.getValue()).f148726b;
        String str = proofTypesContent.f148735b;
        CollapsingTitleAppBarLayout collapsingTitleAppBarLayout = cVar.f149173c;
        collapsingTitleAppBarLayout.setTitle(str);
        collapsingTitleAppBarLayout.setShortTitle(str);
        collapsingTitleAppBarLayout.setSubTitle(proofTypesContent.f148736c);
        RadioGroup radioGroup = cVar.f149175e;
        radioGroup.b();
        radioGroup.a(-1);
        Iterator<T> it = proofTypesContent.f148737d.iterator();
        int i12 = 0;
        while (true) {
            if (!it.hasNext()) {
                ScreenPerformanceTracker screenPerformanceTracker = this.f149159p0;
                (screenPerformanceTracker != null ? screenPerformanceTracker : null).d();
                return;
            }
            Object next = it.next();
            int i13 = i12 + 1;
            if (i12 < 0) {
                C42745f0.H0();
                throw null;
            }
            ProofType proofType = (ProofType) next;
            RadioButton radioButton = new RadioButton(radioGroup.getContext());
            radioButton.setTag(proofType.f148733b);
            radioButton.setId(i12);
            radioButton.setTitle(proofType.f148734c);
            radioGroup.addView(radioButton);
            i12 = i13;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewStateRestored(@l Bundle bundle) {
        super.onViewStateRestored(bundle);
        com.avito.android.evidence_request.mvi.proof_types.c cVar = this.f149161r0;
        if (cVar != null) {
            ProofTypesContent proofTypesContent = ((EvidenceContent) this.f149160q0.getValue()).f148726b;
            int f180133e = cVar.f149175e.getF180133e();
            if (f180133e != -1) {
                String str = proofTypesContent.f148737d.get(f180133e).f148733b;
                Button button = cVar.f149174d;
                button.setEnabled(true);
                button.setOnClickListener(new com.avito.android.crm_candidates.view.dialogs.f(26, cVar, str));
            }
        }
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@l Bundle bundle) {
        D.f90335a.getClass();
        F fA2 = D.a.a();
        com.avito.android.evidence_request.mvi.proof_types.di.a.a().a((InterfaceC30106l7) C29972i.a(C29972i.b(this), InterfaceC30106l7.class), new C28478k(ProofTypesScreen.f90453d, s.c(this), null, 4, null)).fm(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f149159p0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
    }
}
