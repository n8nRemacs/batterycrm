package com.avito.android.vas_performance.ui.visual_legacy;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.compose.runtime.internal.P;
import androidx.fragment.app.ActivityC22955m;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.InterfaceC23040h0;
import com.avito.android.R;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.VisualVasScreen;
import com.avito.android.di.C29972i;
import com.avito.android.lib.design.button.Button;
import com.avito.android.mnz_common.ui.MnzFloatingFooter;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.ui.fragments.BaseFragment;
import com.avito.android.vas_performance.ui.visual_legacy.VisualVasFragment;
import com.avito.android.vas_performance.ui.visual_legacy.k;
import java.util.Set;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import v50.C49166b;
import w50.InterfaceC49447a;

/* compiled from: VisualVasFragment.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/vas_performance/ui/visual_legacy/VisualVasFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SuppressLint({"DS_TCH_BDGT_ARCHITECTURE [Forbidden]", "DS_TCH_BDGT_ARCHITECTURE [Deprecated]"})
/* loaded from: classes5.dex */
public final class VisualVasFragment extends BaseFragment implements InterfaceC28477j.b {

    /* renamed from: I0, reason: collision with root package name */
    @Y61.k
    public static final a f322074I0 = new a(null);

    /* renamed from: A0, reason: collision with root package name */
    public MnzFloatingFooter f322075A0;

    /* renamed from: B0, reason: collision with root package name */
    @Y61.l
    public QL0.b f322076B0;

    /* renamed from: C0, reason: collision with root package name */
    public InterfaceC49447a f322077C0;

    /* renamed from: D0, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f322078D0;

    /* renamed from: E0, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f322079E0;

    /* renamed from: F0, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f322080F0;

    /* renamed from: G0, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f322081G0;

    /* renamed from: H0, reason: collision with root package name */
    @Y61.k
    public final f f322082H0;

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.a f322083n0;

    /* renamed from: o0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.a f322084o0;

    /* renamed from: p0, reason: collision with root package name */
    @Inject
    public Set<TV0.d<?, ?>> f322085p0;

    /* renamed from: q0, reason: collision with root package name */
    @Inject
    public m f322086q0;

    /* renamed from: r0, reason: collision with root package name */
    @Inject
    public InterfaceC28373a f322087r0;

    /* renamed from: s0, reason: collision with root package name */
    @Inject
    public TL0.d f322088s0;

    /* renamed from: t0, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f322089t0;

    /* renamed from: u0, reason: collision with root package name */
    @Inject
    public com.avito.android.util.text.a f322090u0;

    /* renamed from: v0, reason: collision with root package name */
    public RecyclerView f322091v0;

    /* renamed from: w0, reason: collision with root package name */
    public Button f322092w0;

    /* renamed from: x0, reason: collision with root package name */
    public FrameLayout f322093x0;

    /* renamed from: y0, reason: collision with root package name */
    public Button f322094y0;

    /* renamed from: z0, reason: collision with root package name */
    public com.avito.android.progress_overlay.l f322095z0;

    /* compiled from: VisualVasFragment.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/vas_performance/ui/visual_legacy/VisualVasFragment$a;", "", "<init>", "()V", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: VisualVasFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends N implements Y41.a<String> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final String invoke() {
            String string;
            Bundle arguments = VisualVasFragment.this.getArguments();
            if (arguments == null || (string = arguments.getString("advert_id")) == null) {
                throw new IllegalStateException("advertId must not be null");
            }
            return string;
        }
    }

    /* compiled from: VisualVasFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c extends N implements Y41.a<String> {
        public c() {
            super(0);
        }

        @Override // Y41.a
        public final String invoke() {
            String string;
            Bundle arguments = VisualVasFragment.this.getArguments();
            if (arguments == null || (string = arguments.getString("checkout_context")) == null) {
                throw new IllegalStateException("checkoutContext must not be null");
            }
            return string;
        }
    }

    /* compiled from: VisualVasFragment.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class d extends N implements Y41.a<Boolean> {
        public d() {
            super(0);
        }

        @Override // Y41.a
        public final Boolean invoke() {
            Bundle arguments = VisualVasFragment.this.getArguments();
            return Boolean.valueOf(arguments != null ? arguments.getBoolean("closable") : true);
        }
    }

    /* compiled from: VisualVasFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class e extends N implements Y41.a<String> {
        public e() {
            super(0);
        }

        @Override // Y41.a
        public final String invoke() {
            String string;
            Bundle arguments = VisualVasFragment.this.getArguments();
            if (arguments == null || (string = arguments.getString("current_flow")) == null) {
                throw new IllegalStateException("currentFlow must not be null");
            }
            return string;
        }
    }

    /* compiled from: VisualVasFragment.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/vas_performance/ui/visual_legacy/VisualVasFragment$f", "Landroidx/activity/x;", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class f extends androidx.view.x {
        public f() {
            super(true);
        }

        @Override // androidx.view.x
        public final void c() {
            m mVar = VisualVasFragment.this.f322086q0;
            if (mVar == null) {
                mVar = null;
            }
            mVar.i0();
        }
    }

    /* compiled from: VisualVasFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<G0> {
        public g() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            m mVar = VisualVasFragment.this.f322086q0;
            if (mVar == null) {
                mVar = null;
            }
            mVar.h0();
            return G0.f406611a;
        }
    }

    public VisualVasFragment() {
        super(0, 1, null);
        this.f322078D0 = C42727D.c(new c());
        this.f322079E0 = C42727D.c(new b());
        this.f322080F0 = C42727D.c(new e());
        this.f322081G0 = C42727D.c(new d());
        this.f322082H0 = new f();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public final void onAttach(@Y61.k Context context) {
        super.onAttach(context);
        InterfaceC49447a interfaceC49447a = context instanceof InterfaceC49447a ? (InterfaceC49447a) context : null;
        if (interfaceC49447a == null) {
            throw new IllegalStateException("Parent activity must implement PaidServicesRouter");
        }
        this.f322077C0 = interfaceC49447a;
        com.avito.android.vas_performance.di.visual_legacy.o oVar = new com.avito.android.vas_performance.di.visual_legacy.o((String) this.f322079E0.getValue(), (String) this.f322078D0.getValue());
        D.f90335a.getClass();
        F fA2 = D.a.a();
        com.avito.android.vas_performance.di.visual_legacy.a.a().a((com.avito.android.vas_performance.screens.visual.di.e) C29972i.a(C29972i.b(this), Object.class), cv.c.b(this), oVar, this, com.avito.android.analytics.screens.s.c(this), VisualVasScreen.f90566d, ((Boolean) this.f322081G0.getValue()).booleanValue()).a(this);
        TL0.d dVar = this.f322088s0;
        if (dVar == null) {
            dVar = null;
        }
        dVar.a(fA2.b());
        com.avito.android.deeplink_handler.handler.composite.a aVar = this.f322089t0;
        C49166b.c(aVar != null ? aVar : null, C49166b.a(this));
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.l
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        TL0.d dVar = this.f322088s0;
        if (dVar == null) {
            dVar = null;
        }
        dVar.e();
        return layoutInflater.inflate(R.layout.visual_vas_fragment, viewGroup, false);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) {
        androidx.view.y f21241d;
        super.onViewCreated(view, bundle);
        InterfaceC28373a interfaceC28373a = this.f322087r0;
        if (interfaceC28373a == null) {
            interfaceC28373a = null;
        }
        interfaceC28373a.c(new sL0.c((String) this.f322079E0.getValue(), (String) this.f322080F0.getValue()));
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.visual_vas_placeholder);
        InterfaceC28373a interfaceC28373a2 = this.f322087r0;
        com.avito.android.progress_overlay.l lVar = new com.avito.android.progress_overlay.l(viewGroup, R.id.visual_vas_recycler_view, interfaceC28373a2 != null ? interfaceC28373a2 : null, 0, 0, 24, null);
        this.f322095z0 = lVar;
        lVar.f231600j = new g();
        this.f322091v0 = (RecyclerView) view.findViewById(R.id.visual_vas_recycler_view);
        Button button = (Button) view.findViewById(R.id.visual_vas_help_button);
        this.f322092w0 = button;
        final int i12 = 0;
        button.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.vas_performance.ui.visual_legacy.a

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ VisualVasFragment f322103c;

            {
                this.f322103c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i12) {
                    case 0:
                        m mVar = this.f322103c.f322086q0;
                        if (mVar == null) {
                            mVar = null;
                        }
                        mVar.yc();
                        break;
                    case 1:
                        m mVar2 = this.f322103c.f322086q0;
                        if (mVar2 == null) {
                            mVar2 = null;
                        }
                        mVar2.i0();
                        break;
                    default:
                        m mVar3 = this.f322103c.f322086q0;
                        if (mVar3 == null) {
                            mVar3 = null;
                        }
                        mVar3.c6(null);
                        break;
                }
            }
        });
        Toolbar toolbar = (Toolbar) view.findViewById(R.id.visual_vas_toolbar);
        toolbar.setNavigationIcon(((Boolean) this.f322081G0.getValue()).booleanValue() ? R.drawable.ic_close_24 : R.drawable.ic_back_24);
        final int i13 = 1;
        toolbar.setNavigationOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.vas_performance.ui.visual_legacy.a

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ VisualVasFragment f322103c;

            {
                this.f322103c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i13) {
                    case 0:
                        m mVar = this.f322103c.f322086q0;
                        if (mVar == null) {
                            mVar = null;
                        }
                        mVar.yc();
                        break;
                    case 1:
                        m mVar2 = this.f322103c.f322086q0;
                        if (mVar2 == null) {
                            mVar2 = null;
                        }
                        mVar2.i0();
                        break;
                    default:
                        m mVar3 = this.f322103c.f322086q0;
                        if (mVar3 == null) {
                            mVar3 = null;
                        }
                        mVar3.c6(null);
                        break;
                }
            }
        });
        com.avito.konveyor.adapter.a aVar = this.f322084o0;
        if (aVar == null) {
            aVar = null;
        }
        com.avito.konveyor.a aVar2 = this.f322083n0;
        if (aVar2 == null) {
            aVar2 = null;
        }
        com.avito.konveyor.adapter.j jVar = new com.avito.konveyor.adapter.j(aVar, aVar2);
        RecyclerView recyclerView = this.f322091v0;
        if (recyclerView == null) {
            recyclerView = null;
        }
        recyclerView.setAdapter(jVar);
        m mVar = this.f322086q0;
        if (mVar == null) {
            mVar = null;
        }
        Set<TV0.d<?, ?>> set = this.f322085p0;
        if (set == null) {
            set = null;
        }
        mVar.a(set);
        m mVar2 = this.f322086q0;
        if (mVar2 == null) {
            mVar2 = null;
        }
        final int i14 = 1;
        mVar2.K().observe(getViewLifecycleOwner(), new InterfaceC23040h0(this) { // from class: com.avito.android.vas_performance.ui.visual_legacy.b

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ VisualVasFragment f322105c;

            {
                this.f322105c = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.view.InterfaceC23040h0
            public final void onChanged(Object obj) {
                PrintableText printableText;
                VisualVasFragment visualVasFragment = this.f322105c;
                switch (i14) {
                    case 0:
                        com.avito.android.mnz_common.data.MnzFloatingFooter mnzFloatingFooter = (com.avito.android.mnz_common.data.MnzFloatingFooter) obj;
                        if (mnzFloatingFooter != null) {
                            MnzFloatingFooter mnzFloatingFooter2 = visualVasFragment.f322075A0;
                            if (mnzFloatingFooter2 == null) {
                                mnzFloatingFooter2 = null;
                            }
                            com.avito.android.util.text.a aVar3 = visualVasFragment.f322090u0;
                            mnzFloatingFooter2.d(mnzFloatingFooter, aVar3 != null ? aVar3 : null, new g(visualVasFragment), new h(visualVasFragment));
                            break;
                        } else {
                            VisualVasFragment.a aVar4 = VisualVasFragment.f322074I0;
                            break;
                        }
                    case 1:
                        com.avito.android.vas_performance.ui.recycler.i iVar = (com.avito.android.vas_performance.ui.recycler.i) obj;
                        VisualVasFragment.a aVar5 = VisualVasFragment.f322074I0;
                        if (iVar != null) {
                            Context context = visualVasFragment.getContext();
                            String strK0 = (context == null || (printableText = iVar.f321917c) == null) ? null : printableText.k0(context);
                            Button button2 = visualVasFragment.f322092w0;
                            if (button2 == null) {
                                button2 = null;
                            }
                            com.avito.android.lib.design.button.b.a(button2, strK0, false);
                            com.avito.konveyor.adapter.a aVar6 = visualVasFragment.f322084o0;
                            if (aVar6 == null) {
                                aVar6 = null;
                            }
                            aVar6.c(new UV0.c(iVar.f321915a));
                            RecyclerView recyclerView2 = visualVasFragment.f322091v0;
                            RecyclerView.Adapter adapter = (recyclerView2 != null ? recyclerView2 : null).getAdapter();
                            if (adapter != null) {
                                iVar.f321916b.b(adapter);
                                break;
                            }
                        }
                        break;
                    case 2:
                        Boolean bool = (Boolean) obj;
                        if (bool != null) {
                            FrameLayout frameLayout = visualVasFragment.f322093x0;
                            if (frameLayout == null) {
                                frameLayout = null;
                            }
                            frameLayout.setVisibility(!bool.booleanValue() ? 0 : 8);
                            MnzFloatingFooter mnzFloatingFooter3 = visualVasFragment.f322075A0;
                            (mnzFloatingFooter3 != null ? mnzFloatingFooter3 : null).setVisibility(bool.booleanValue() ? 0 : 8);
                            break;
                        } else {
                            VisualVasFragment.a aVar7 = VisualVasFragment.f322074I0;
                            break;
                        }
                    default:
                        Q q12 = (Q) obj;
                        VisualVasFragment.a aVar8 = VisualVasFragment.f322074I0;
                        Integer num = (Integer) q12.f406619b;
                        boolean zBooleanValue = ((Boolean) q12.f406620c).booleanValue();
                        if (num != null) {
                            MnzFloatingFooter mnzFloatingFooter4 = visualVasFragment.f322075A0;
                            Button button3 = (Button) (mnzFloatingFooter4 != null ? mnzFloatingFooter4 : null).findViewById(num.intValue());
                            if (button3 != null) {
                                button3.setLoading(zBooleanValue);
                                break;
                            }
                        }
                        break;
                }
            }
        });
        m mVar3 = this.f322086q0;
        if (mVar3 == null) {
            mVar3 = null;
        }
        mVar3.u3().observe(getViewLifecycleOwner(), new k.a(new com.avito.android.vas_performance.ui.visual_legacy.d(this)));
        m mVar4 = this.f322086q0;
        if (mVar4 == null) {
            mVar4 = null;
        }
        mVar4.q2().observe(getViewLifecycleOwner(), new k.a(new com.avito.android.vas_performance.ui.visual_legacy.e(this)));
        m mVar5 = this.f322086q0;
        if (mVar5 == null) {
            mVar5 = null;
        }
        mVar5.o5().observe(getViewLifecycleOwner(), new k.a(new com.avito.android.vas_performance.ui.visual_legacy.f(this)));
        m mVar6 = this.f322086q0;
        if (mVar6 == null) {
            mVar6 = null;
        }
        final int i15 = 2;
        mVar6.D7().observe(getViewLifecycleOwner(), new InterfaceC23040h0(this) { // from class: com.avito.android.vas_performance.ui.visual_legacy.b

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ VisualVasFragment f322105c;

            {
                this.f322105c = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.view.InterfaceC23040h0
            public final void onChanged(Object obj) {
                PrintableText printableText;
                VisualVasFragment visualVasFragment = this.f322105c;
                switch (i15) {
                    case 0:
                        com.avito.android.mnz_common.data.MnzFloatingFooter mnzFloatingFooter = (com.avito.android.mnz_common.data.MnzFloatingFooter) obj;
                        if (mnzFloatingFooter != null) {
                            MnzFloatingFooter mnzFloatingFooter2 = visualVasFragment.f322075A0;
                            if (mnzFloatingFooter2 == null) {
                                mnzFloatingFooter2 = null;
                            }
                            com.avito.android.util.text.a aVar3 = visualVasFragment.f322090u0;
                            mnzFloatingFooter2.d(mnzFloatingFooter, aVar3 != null ? aVar3 : null, new g(visualVasFragment), new h(visualVasFragment));
                            break;
                        } else {
                            VisualVasFragment.a aVar4 = VisualVasFragment.f322074I0;
                            break;
                        }
                    case 1:
                        com.avito.android.vas_performance.ui.recycler.i iVar = (com.avito.android.vas_performance.ui.recycler.i) obj;
                        VisualVasFragment.a aVar5 = VisualVasFragment.f322074I0;
                        if (iVar != null) {
                            Context context = visualVasFragment.getContext();
                            String strK0 = (context == null || (printableText = iVar.f321917c) == null) ? null : printableText.k0(context);
                            Button button2 = visualVasFragment.f322092w0;
                            if (button2 == null) {
                                button2 = null;
                            }
                            com.avito.android.lib.design.button.b.a(button2, strK0, false);
                            com.avito.konveyor.adapter.a aVar6 = visualVasFragment.f322084o0;
                            if (aVar6 == null) {
                                aVar6 = null;
                            }
                            aVar6.c(new UV0.c(iVar.f321915a));
                            RecyclerView recyclerView2 = visualVasFragment.f322091v0;
                            RecyclerView.Adapter adapter = (recyclerView2 != null ? recyclerView2 : null).getAdapter();
                            if (adapter != null) {
                                iVar.f321916b.b(adapter);
                                break;
                            }
                        }
                        break;
                    case 2:
                        Boolean bool = (Boolean) obj;
                        if (bool != null) {
                            FrameLayout frameLayout = visualVasFragment.f322093x0;
                            if (frameLayout == null) {
                                frameLayout = null;
                            }
                            frameLayout.setVisibility(!bool.booleanValue() ? 0 : 8);
                            MnzFloatingFooter mnzFloatingFooter3 = visualVasFragment.f322075A0;
                            (mnzFloatingFooter3 != null ? mnzFloatingFooter3 : null).setVisibility(bool.booleanValue() ? 0 : 8);
                            break;
                        } else {
                            VisualVasFragment.a aVar7 = VisualVasFragment.f322074I0;
                            break;
                        }
                    default:
                        Q q12 = (Q) obj;
                        VisualVasFragment.a aVar8 = VisualVasFragment.f322074I0;
                        Integer num = (Integer) q12.f406619b;
                        boolean zBooleanValue = ((Boolean) q12.f406620c).booleanValue();
                        if (num != null) {
                            MnzFloatingFooter mnzFloatingFooter4 = visualVasFragment.f322075A0;
                            Button button3 = (Button) (mnzFloatingFooter4 != null ? mnzFloatingFooter4 : null).findViewById(num.intValue());
                            if (button3 != null) {
                                button3.setLoading(zBooleanValue);
                                break;
                            }
                        }
                        break;
                }
            }
        });
        m mVar7 = this.f322086q0;
        if (mVar7 == null) {
            mVar7 = null;
        }
        final int i16 = 3;
        mVar7.J4().observe(getViewLifecycleOwner(), new InterfaceC23040h0(this) { // from class: com.avito.android.vas_performance.ui.visual_legacy.b

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ VisualVasFragment f322105c;

            {
                this.f322105c = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.view.InterfaceC23040h0
            public final void onChanged(Object obj) {
                PrintableText printableText;
                VisualVasFragment visualVasFragment = this.f322105c;
                switch (i16) {
                    case 0:
                        com.avito.android.mnz_common.data.MnzFloatingFooter mnzFloatingFooter = (com.avito.android.mnz_common.data.MnzFloatingFooter) obj;
                        if (mnzFloatingFooter != null) {
                            MnzFloatingFooter mnzFloatingFooter2 = visualVasFragment.f322075A0;
                            if (mnzFloatingFooter2 == null) {
                                mnzFloatingFooter2 = null;
                            }
                            com.avito.android.util.text.a aVar3 = visualVasFragment.f322090u0;
                            mnzFloatingFooter2.d(mnzFloatingFooter, aVar3 != null ? aVar3 : null, new g(visualVasFragment), new h(visualVasFragment));
                            break;
                        } else {
                            VisualVasFragment.a aVar4 = VisualVasFragment.f322074I0;
                            break;
                        }
                    case 1:
                        com.avito.android.vas_performance.ui.recycler.i iVar = (com.avito.android.vas_performance.ui.recycler.i) obj;
                        VisualVasFragment.a aVar5 = VisualVasFragment.f322074I0;
                        if (iVar != null) {
                            Context context = visualVasFragment.getContext();
                            String strK0 = (context == null || (printableText = iVar.f321917c) == null) ? null : printableText.k0(context);
                            Button button2 = visualVasFragment.f322092w0;
                            if (button2 == null) {
                                button2 = null;
                            }
                            com.avito.android.lib.design.button.b.a(button2, strK0, false);
                            com.avito.konveyor.adapter.a aVar6 = visualVasFragment.f322084o0;
                            if (aVar6 == null) {
                                aVar6 = null;
                            }
                            aVar6.c(new UV0.c(iVar.f321915a));
                            RecyclerView recyclerView2 = visualVasFragment.f322091v0;
                            RecyclerView.Adapter adapter = (recyclerView2 != null ? recyclerView2 : null).getAdapter();
                            if (adapter != null) {
                                iVar.f321916b.b(adapter);
                                break;
                            }
                        }
                        break;
                    case 2:
                        Boolean bool = (Boolean) obj;
                        if (bool != null) {
                            FrameLayout frameLayout = visualVasFragment.f322093x0;
                            if (frameLayout == null) {
                                frameLayout = null;
                            }
                            frameLayout.setVisibility(!bool.booleanValue() ? 0 : 8);
                            MnzFloatingFooter mnzFloatingFooter3 = visualVasFragment.f322075A0;
                            (mnzFloatingFooter3 != null ? mnzFloatingFooter3 : null).setVisibility(bool.booleanValue() ? 0 : 8);
                            break;
                        } else {
                            VisualVasFragment.a aVar7 = VisualVasFragment.f322074I0;
                            break;
                        }
                    default:
                        Q q12 = (Q) obj;
                        VisualVasFragment.a aVar8 = VisualVasFragment.f322074I0;
                        Integer num = (Integer) q12.f406619b;
                        boolean zBooleanValue = ((Boolean) q12.f406620c).booleanValue();
                        if (num != null) {
                            MnzFloatingFooter mnzFloatingFooter4 = visualVasFragment.f322075A0;
                            Button button3 = (Button) (mnzFloatingFooter4 != null ? mnzFloatingFooter4 : null).findViewById(num.intValue());
                            if (button3 != null) {
                                button3.setLoading(zBooleanValue);
                                break;
                            }
                        }
                        break;
                }
            }
        });
        m mVar8 = this.f322086q0;
        if (mVar8 == null) {
            mVar8 = null;
        }
        final int i17 = 0;
        mVar8.zd().observe(getViewLifecycleOwner(), new InterfaceC23040h0(this) { // from class: com.avito.android.vas_performance.ui.visual_legacy.b

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ VisualVasFragment f322105c;

            {
                this.f322105c = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.view.InterfaceC23040h0
            public final void onChanged(Object obj) {
                PrintableText printableText;
                VisualVasFragment visualVasFragment = this.f322105c;
                switch (i17) {
                    case 0:
                        com.avito.android.mnz_common.data.MnzFloatingFooter mnzFloatingFooter = (com.avito.android.mnz_common.data.MnzFloatingFooter) obj;
                        if (mnzFloatingFooter != null) {
                            MnzFloatingFooter mnzFloatingFooter2 = visualVasFragment.f322075A0;
                            if (mnzFloatingFooter2 == null) {
                                mnzFloatingFooter2 = null;
                            }
                            com.avito.android.util.text.a aVar3 = visualVasFragment.f322090u0;
                            mnzFloatingFooter2.d(mnzFloatingFooter, aVar3 != null ? aVar3 : null, new g(visualVasFragment), new h(visualVasFragment));
                            break;
                        } else {
                            VisualVasFragment.a aVar4 = VisualVasFragment.f322074I0;
                            break;
                        }
                    case 1:
                        com.avito.android.vas_performance.ui.recycler.i iVar = (com.avito.android.vas_performance.ui.recycler.i) obj;
                        VisualVasFragment.a aVar5 = VisualVasFragment.f322074I0;
                        if (iVar != null) {
                            Context context = visualVasFragment.getContext();
                            String strK0 = (context == null || (printableText = iVar.f321917c) == null) ? null : printableText.k0(context);
                            Button button2 = visualVasFragment.f322092w0;
                            if (button2 == null) {
                                button2 = null;
                            }
                            com.avito.android.lib.design.button.b.a(button2, strK0, false);
                            com.avito.konveyor.adapter.a aVar6 = visualVasFragment.f322084o0;
                            if (aVar6 == null) {
                                aVar6 = null;
                            }
                            aVar6.c(new UV0.c(iVar.f321915a));
                            RecyclerView recyclerView2 = visualVasFragment.f322091v0;
                            RecyclerView.Adapter adapter = (recyclerView2 != null ? recyclerView2 : null).getAdapter();
                            if (adapter != null) {
                                iVar.f321916b.b(adapter);
                                break;
                            }
                        }
                        break;
                    case 2:
                        Boolean bool = (Boolean) obj;
                        if (bool != null) {
                            FrameLayout frameLayout = visualVasFragment.f322093x0;
                            if (frameLayout == null) {
                                frameLayout = null;
                            }
                            frameLayout.setVisibility(!bool.booleanValue() ? 0 : 8);
                            MnzFloatingFooter mnzFloatingFooter3 = visualVasFragment.f322075A0;
                            (mnzFloatingFooter3 != null ? mnzFloatingFooter3 : null).setVisibility(bool.booleanValue() ? 0 : 8);
                            break;
                        } else {
                            VisualVasFragment.a aVar7 = VisualVasFragment.f322074I0;
                            break;
                        }
                    default:
                        Q q12 = (Q) obj;
                        VisualVasFragment.a aVar8 = VisualVasFragment.f322074I0;
                        Integer num = (Integer) q12.f406619b;
                        boolean zBooleanValue = ((Boolean) q12.f406620c).booleanValue();
                        if (num != null) {
                            MnzFloatingFooter mnzFloatingFooter4 = visualVasFragment.f322075A0;
                            Button button3 = (Button) (mnzFloatingFooter4 != null ? mnzFloatingFooter4 : null).findViewById(num.intValue());
                            if (button3 != null) {
                                button3.setLoading(zBooleanValue);
                                break;
                            }
                        }
                        break;
                }
            }
        });
        m mVar9 = this.f322086q0;
        if (mVar9 == null) {
            mVar9 = null;
        }
        mVar9.L3().observe(getViewLifecycleOwner(), new k.a(new i(this)));
        m mVar10 = this.f322086q0;
        if (mVar10 == null) {
            mVar10 = null;
        }
        mVar10.w2().observe(getViewLifecycleOwner(), new k.a(new j(this)));
        this.f322093x0 = (FrameLayout) view.findViewById(R.id.visual_vas_button_container);
        Button button2 = (Button) view.findViewById(R.id.visual_vas_skip_button);
        this.f322094y0 = button2;
        final int i18 = 2;
        button2.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.vas_performance.ui.visual_legacy.a

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ VisualVasFragment f322103c;

            {
                this.f322103c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i18) {
                    case 0:
                        m mVar11 = this.f322103c.f322086q0;
                        if (mVar11 == null) {
                            mVar11 = null;
                        }
                        mVar11.yc();
                        break;
                    case 1:
                        m mVar22 = this.f322103c.f322086q0;
                        if (mVar22 == null) {
                            mVar22 = null;
                        }
                        mVar22.i0();
                        break;
                    default:
                        m mVar32 = this.f322103c.f322086q0;
                        if (mVar32 == null) {
                            mVar32 = null;
                        }
                        mVar32.c6(null);
                        break;
                }
            }
        });
        FrameLayout frameLayout = this.f322093x0;
        if (frameLayout == null) {
            frameLayout = null;
        }
        final int i19 = 0;
        frameLayout.addOnLayoutChangeListener(new View.OnLayoutChangeListener(this) { // from class: com.avito.android.vas_performance.ui.visual_legacy.c

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ VisualVasFragment f322107c;

            {
                this.f322107c = this;
            }

            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view2, int i22, int i23, int i24, int i25, int i26, int i27, int i28, int i29) {
                VisualVasFragment visualVasFragment = this.f322107c;
                switch (i19) {
                    case 0:
                        VisualVasFragment.a aVar3 = VisualVasFragment.f322074I0;
                        if (view2.getHeight() > 0) {
                            QL0.b bVar = visualVasFragment.f322076B0;
                            if (bVar != null) {
                                RecyclerView recyclerView2 = visualVasFragment.f322091v0;
                                if (recyclerView2 == null) {
                                    recyclerView2 = null;
                                }
                                recyclerView2.r0(bVar);
                            }
                            QL0.b bVar2 = new QL0.b(view2.getHeight());
                            RecyclerView recyclerView3 = visualVasFragment.f322091v0;
                            (recyclerView3 != null ? recyclerView3 : null).l(bVar2, -1);
                            visualVasFragment.f322076B0 = bVar2;
                            break;
                        }
                        break;
                    default:
                        VisualVasFragment.a aVar4 = VisualVasFragment.f322074I0;
                        if (view2.getHeight() > 0) {
                            QL0.b bVar3 = visualVasFragment.f322076B0;
                            if (bVar3 != null) {
                                RecyclerView recyclerView4 = visualVasFragment.f322091v0;
                                if (recyclerView4 == null) {
                                    recyclerView4 = null;
                                }
                                recyclerView4.r0(bVar3);
                            }
                            QL0.b bVar4 = new QL0.b(view2.getHeight());
                            RecyclerView recyclerView5 = visualVasFragment.f322091v0;
                            (recyclerView5 != null ? recyclerView5 : null).l(bVar4, -1);
                            visualVasFragment.f322076B0 = bVar4;
                            break;
                        }
                        break;
                }
            }
        });
        MnzFloatingFooter mnzFloatingFooter = (MnzFloatingFooter) view.findViewById(R.id.visual_vas_floating_footer);
        this.f322075A0 = mnzFloatingFooter;
        final int i22 = 1;
        mnzFloatingFooter.addOnLayoutChangeListener(new View.OnLayoutChangeListener(this) { // from class: com.avito.android.vas_performance.ui.visual_legacy.c

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ VisualVasFragment f322107c;

            {
                this.f322107c = this;
            }

            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view2, int i222, int i23, int i24, int i25, int i26, int i27, int i28, int i29) {
                VisualVasFragment visualVasFragment = this.f322107c;
                switch (i22) {
                    case 0:
                        VisualVasFragment.a aVar3 = VisualVasFragment.f322074I0;
                        if (view2.getHeight() > 0) {
                            QL0.b bVar = visualVasFragment.f322076B0;
                            if (bVar != null) {
                                RecyclerView recyclerView2 = visualVasFragment.f322091v0;
                                if (recyclerView2 == null) {
                                    recyclerView2 = null;
                                }
                                recyclerView2.r0(bVar);
                            }
                            QL0.b bVar2 = new QL0.b(view2.getHeight());
                            RecyclerView recyclerView3 = visualVasFragment.f322091v0;
                            (recyclerView3 != null ? recyclerView3 : null).l(bVar2, -1);
                            visualVasFragment.f322076B0 = bVar2;
                            break;
                        }
                        break;
                    default:
                        VisualVasFragment.a aVar4 = VisualVasFragment.f322074I0;
                        if (view2.getHeight() > 0) {
                            QL0.b bVar3 = visualVasFragment.f322076B0;
                            if (bVar3 != null) {
                                RecyclerView recyclerView4 = visualVasFragment.f322091v0;
                                if (recyclerView4 == null) {
                                    recyclerView4 = null;
                                }
                                recyclerView4.r0(bVar3);
                            }
                            QL0.b bVar4 = new QL0.b(view2.getHeight());
                            RecyclerView recyclerView5 = visualVasFragment.f322091v0;
                            (recyclerView5 != null ? recyclerView5 : null).l(bVar4, -1);
                            visualVasFragment.f322076B0 = bVar4;
                            break;
                        }
                        break;
                }
            }
        });
        ActivityC22955m activityC22955mL1 = l1();
        if (activityC22955mL1 != null && (f21241d = activityC22955mL1.getF21241d()) != null) {
            f21241d.a(getViewLifecycleOwner(), this.f322082H0);
        }
        TL0.d dVar = this.f322088s0;
        (dVar != null ? dVar : null).d();
    }
}
