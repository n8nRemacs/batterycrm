package com.avito.android.safedeal.delivery.order_cancellation.details;

import Cd.C13243a;
import Dn0.InterfaceC13421a;
import Dn0.InterfaceC13422b;
import Dn0.c;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
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
import com.adjust.sdk.network.ErrorCodes;
import com.avito.android.R;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.s;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.component.toast.f;
import com.avito.android.di.C29972i;
import com.avito.android.lib.design.button.Button;
import com.avito.android.remote.model.Option;
import com.avito.android.remote.model.ReasonRds;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.safedeal.delivery.order_cancellation.o;
import com.avito.android.ui.fragments.BaseFragment;
import com.avito.android.util.D6;
import com.avito.android.util.H2;
import com.avito.android.util.K2;
import java.util.List;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import z1.AbstractC50339a;

/* compiled from: ReasonDetailsFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/safedeal/delivery/order_cancellation/details/ReasonDetailsFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_safedeal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ReasonDetailsFragment extends BaseFragment implements InterfaceC28477j.b {

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public com.avito.android.safedeal.delivery.order_cancellation.details.f f256150n0;

    /* renamed from: o0, reason: collision with root package name */
    @k
    public final O0 f256151o0;

    /* renamed from: p0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f256152p0;

    /* renamed from: q0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.d f256153q0;

    /* renamed from: r0, reason: collision with root package name */
    @l
    public H2 f256154r0;

    /* renamed from: s0, reason: collision with root package name */
    @l
    public o f256155s0;

    /* renamed from: t0, reason: collision with root package name */
    @l
    public Button f256156t0;

    /* renamed from: u0, reason: collision with root package name */
    @l
    public Integer f256157u0;

    /* renamed from: v0, reason: collision with root package name */
    @l
    public ReasonRds f256158v0;

    /* compiled from: ReasonDetailsFragment.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/safedeal/delivery/order_cancellation/details/ReasonDetailsFragment$a;", "", "<init>", "()V", "_avito_safedeal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    /* compiled from: ReasonDetailsFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b extends H implements Y41.l<InterfaceC13422b, G0> {
        @Override // Y41.l
        public final G0 invoke(InterfaceC13422b interfaceC13422b) {
            ReasonRds reasonRds;
            o oVar;
            InterfaceC13422b interfaceC13422b2 = interfaceC13422b;
            ReasonDetailsFragment reasonDetailsFragment = (ReasonDetailsFragment) this.receiver;
            reasonDetailsFragment.getClass();
            if (interfaceC13422b2 instanceof InterfaceC13422b.a) {
                Button button = reasonDetailsFragment.f256156t0;
                if (button != null) {
                    button.setLoading(false);
                }
                o oVar2 = reasonDetailsFragment.f256155s0;
                if (oVar2 != null) {
                    oVar2.w0(-1);
                }
            } else if (interfaceC13422b2 instanceof InterfaceC13422b.c) {
                Button button2 = reasonDetailsFragment.f256156t0;
                if (button2 != null) {
                    button2.setLoading(false);
                }
                InterfaceC13422b.c cVar = (InterfaceC13422b.c) interfaceC13422b2;
                com.avito.android.component.toast.c.c(com.avito.android.component.toast.c.f125244a, reasonDetailsFragment, cVar.f3443a, null, null, new f.c(cVar.f3444b), 0, null, ErrorCodes.SSL_HANDSHAKE_EXCEPTION);
            } else if ((interfaceC13422b2 instanceof InterfaceC13422b.C0192b) && (reasonRds = reasonDetailsFragment.f256158v0) != null && (oVar = reasonDetailsFragment.f256155s0) != null) {
                oVar.I0(reasonRds);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: ReasonDetailsFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LDn0/c;", VoiceInfo.STATE, "Lkotlin/G0;", "invoke", "(LDn0/c;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.l<Dn0.c, G0> {
        public c() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(Dn0.c cVar) {
            Button button;
            ReasonRds reasonRds;
            List<Option> options;
            Dn0.c cVar2 = cVar;
            ReasonDetailsFragment reasonDetailsFragment = ReasonDetailsFragment.this;
            reasonDetailsFragment.getClass();
            Option option = cVar2.f3445b;
            reasonDetailsFragment.f256157u0 = (option == null || (reasonRds = reasonDetailsFragment.f256158v0) == null || (options = reasonRds.getOptions()) == null) ? null : Integer.valueOf(options.indexOf(option));
            c.a aVar = cVar2.f3447d;
            if (aVar instanceof c.a.C0193a) {
                com.avito.konveyor.adapter.d dVar = reasonDetailsFragment.f256153q0;
                if (dVar == null) {
                    dVar = null;
                }
                dVar.l(((c.a.C0193a) aVar).f3448a, null);
            } else if ((aVar instanceof c.a.C0194c) && (button = reasonDetailsFragment.f256156t0) != null) {
                button.setLoading(true);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: ReasonDetailsFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "visible", "Lkotlin/G0;", "invoke", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.l<Boolean, G0> {
        public d() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(Boolean bool) {
            ViewPropertyAnimator viewPropertyAnimatorAnimate;
            boolean zBooleanValue = bool.booleanValue();
            ReasonDetailsFragment reasonDetailsFragment = ReasonDetailsFragment.this;
            if (zBooleanValue) {
                D6.w(reasonDetailsFragment.f256156t0);
                Button button = reasonDetailsFragment.f256156t0;
                if (button != null) {
                    button.setAlpha(0.0f);
                }
            } else {
                D6.H(reasonDetailsFragment.f256156t0);
                Button button2 = reasonDetailsFragment.f256156t0;
                ViewPropertyAnimator viewPropertyAnimatorAlpha = (button2 == null || (viewPropertyAnimatorAnimate = button2.animate()) == null) ? null : viewPropertyAnimatorAnimate.alpha(1.0f);
                if (viewPropertyAnimatorAlpha != null) {
                    viewPropertyAnimatorAlpha.setDuration(350L);
                }
            }
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f256161l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Y41.a aVar) {
            super(0);
            this.f256161l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f256161l);
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
            return ReasonDetailsFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ f f256163l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(f fVar) {
            super(0);
            this.f256163l = fVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f256163l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f256164l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f256164l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f256164l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f256165l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f256165l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f256165l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: ReasonDetailsFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/safedeal/delivery/order_cancellation/details/e;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/safedeal/delivery/order_cancellation/details/e;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.a<com.avito.android.safedeal.delivery.order_cancellation.details.e> {
        public j() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.safedeal.delivery.order_cancellation.details.e invoke() {
            com.avito.android.safedeal.delivery.order_cancellation.details.f fVar = ReasonDetailsFragment.this.f256150n0;
            if (fVar == null) {
                fVar = null;
            }
            return (com.avito.android.safedeal.delivery.order_cancellation.details.e) fVar.get();
        }
    }

    public ReasonDetailsFragment() {
        super(0, 1, null);
        e eVar = new e(new j());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new g(new f()));
        this.f256151o0 = new O0(m0.f406844a.b(com.avito.android.safedeal.delivery.order_cancellation.details.e.class), new h(interfaceC42726CB), eVar, new i(interfaceC42726CB));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(@k Context context) {
        super.onAttach(context);
        androidx.core.content.j jVarL1 = l1();
        o oVar = jVarL1 instanceof o ? (o) jVarL1 : null;
        if (oVar == null) {
            throw new IllegalArgumentException("Parent activity must implement RdsOrderCancellationRouter");
        }
        this.f256155s0 = oVar;
    }

    @Override // androidx.fragment.app.Fragment
    @k
    public final View onCreateView(@k LayoutInflater layoutInflater, @l ViewGroup viewGroup, @l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f256152p0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f256152p0;
        com.avito.android.analytics.screens.mvi.a.g(this, screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null, (com.avito.android.safedeal.delivery.order_cancellation.details.e) this.f256151o0.getValue(), new b(1, this, ReasonDetailsFragment.class, "handleEvent", "handleEvent(Lcom/avito/android/safedeal/delivery/order_cancellation/details/mvi/entity/ReasonDetailsOneTimeEvent;)V", 0), new c());
        return layoutInflater.inflate(R.layout.delivery_rds_reason_details_fragment, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        H2 h22 = this.f256154r0;
        if (h22 != null) {
            h22.dispose();
        }
        this.f256154r0 = null;
        this.f256156t0 = null;
        super.onDestroyView();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onDetach() {
        super.onDetach();
        this.f256155s0 = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(@k Bundle bundle) {
        super.onSaveInstanceState(bundle);
        Integer num = this.f256157u0;
        if (num != null) {
            bundle.putInt("SELECT_RADIO_BUTTON_ID", num.intValue());
        }
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@k View view, @l Bundle bundle) {
        super.onViewCreated(view, bundle);
        View viewFindViewById = view.findViewById(R.id.toolbar);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.appcompat.widget.Toolbar");
        }
        Toolbar toolbar = (Toolbar) viewFindViewById;
        toolbar.setNavigationIcon(R.drawable.ic_back_24_black);
        final int i12 = 1;
        toolbar.setNavigationOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.safedeal.delivery.order_cancellation.details.a

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ ReasonDetailsFragment f256168c;

            {
                this.f256168c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i12) {
                    case 0:
                        ((e) this.f256168c.f256151o0.getValue()).accept(InterfaceC13421a.C0191a.f3438a);
                        break;
                    default:
                        ActivityC22955m activityC22955mL1 = this.f256168c.l1();
                        if (activityC22955mL1 != null) {
                            activityC22955mL1.onBackPressed();
                            break;
                        }
                        break;
                }
            }
        });
        View viewFindViewById2 = view.findViewById(R.id.reason_details_recycler);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        }
        RecyclerView recyclerView = (RecyclerView) viewFindViewById2;
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        com.avito.konveyor.adapter.d dVar = this.f256153q0;
        if (dVar == null) {
            dVar = null;
        }
        recyclerView.setAdapter(dVar);
        ScreenPerformanceTracker screenPerformanceTracker = this.f256152p0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.b(recyclerView);
        View viewFindViewById3 = view.findViewById(R.id.button);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        Button button = (Button) viewFindViewById3;
        com.avito.android.safedeal.delivery.order_cancellation.a.f256090a.getClass();
        button.setText(com.avito.android.safedeal.delivery.order_cancellation.a.f256092c.k0(button.getContext()));
        final int i13 = 0;
        button.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.safedeal.delivery.order_cancellation.details.a

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ ReasonDetailsFragment f256168c;

            {
                this.f256168c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i13) {
                    case 0:
                        ((e) this.f256168c.f256151o0.getValue()).accept(InterfaceC13421a.C0191a.f3438a);
                        break;
                    default:
                        ActivityC22955m activityC22955mL1 = this.f256168c.l1();
                        if (activityC22955mL1 != null) {
                            activityC22955mL1.onBackPressed();
                            break;
                        }
                        break;
                }
            }
        });
        this.f256156t0 = button;
        ActivityC22955m activityC22955mL1 = l1();
        this.f256154r0 = activityC22955mL1 != null ? K2.a(activityC22955mL1, new d()) : null;
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f256152p0;
        (screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null).d();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [com.avito.android.safedeal.delivery.order_cancellation.details.b] */
    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@l Bundle bundle) {
        Bundle arguments = getArguments();
        if (arguments == null) {
            throw new IllegalArgumentException("Arguments must not be null");
        }
        Parcelable parcelable = Build.VERSION.SDK_INT >= 34 ? (Parcelable) arguments.getParcelable("EXTRA_REASON", ReasonRds.class) : arguments.getParcelable("EXTRA_REASON");
        if (parcelable == null) {
            throw new IllegalArgumentException("Reason must not be null");
        }
        this.f256158v0 = (ReasonRds) parcelable;
        String string = arguments.getString("EXTRA_ORDER_ID");
        if (string == null) {
            throw new IllegalArgumentException("Order id must not be null");
        }
        this.f256157u0 = arguments.containsKey("SELECT_RADIO_BUTTON_ID") ? Integer.valueOf(arguments.getInt("SELECT_RADIO_BUTTON_ID")) : null;
        arguments.getInt("EXTRA_COMMENT_MAX_LENGTH", 1000);
        D.f90335a.getClass();
        F fA2 = D.a.a();
        ReasonRds reasonRds = this.f256158v0;
        if (reasonRds != null) {
            com.avito.android.safedeal.delivery.order_cancellation.details.di.a.a().a(this, s.c(this), reasonRds, string, new com.avito.android.safedeal.delivery.order_cancellation.details.domain.a() { // from class: com.avito.android.safedeal.delivery.order_cancellation.details.b
                @Override // com.avito.android.safedeal.delivery.order_cancellation.details.domain.a
                public final void a(InterfaceC13421a interfaceC13421a) {
                    ((e) this.f256169a.f256151o0.getValue()).accept(interfaceC13421a);
                }
            }, (com.avito.android.safedeal.delivery.di.component.b) C29972i.a(C29972i.b(this), com.avito.android.safedeal.delivery.di.component.b.class), this.f256157u0, getResources()).a(this);
        }
        ScreenPerformanceTracker screenPerformanceTracker = this.f256152p0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f256152p0;
        (screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null).c(this, g5());
    }
}
