package com.avito.android.safedeal.delivery.order_cancellation.fbs_entry_point;

import Cd.C13243a;
import Fn0.C13820b;
import Gn0.InterfaceC13900a;
import Gn0.b;
import Y61.l;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.view.InterfaceC22969B;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import com.avito.android.R;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.s;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.deep_linking.links.BeduinUniversalPageLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.di.C29972i;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.remote.model.ReasonRds;
import com.avito.android.safedeal.delivery.order_cancellation.o;
import com.avito.android.ui.fragments.BaseFragment;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import z1.AbstractC50339a;

/* compiled from: FbsEntryPointFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/safedeal/delivery/order_cancellation/fbs_entry_point/FbsEntryPointFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_safedeal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FbsEntryPointFragment extends BaseFragment implements InterfaceC28477j.b {

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public com.avito.android.safedeal.delivery.order_cancellation.fbs_entry_point.f f256296n0;

    /* renamed from: o0, reason: collision with root package name */
    @Y61.k
    public final O0 f256297o0;

    /* renamed from: p0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f256298p0;

    /* renamed from: q0, reason: collision with root package name */
    @Inject
    public com.avito.android.safedeal.delivery.order_cancellation.fbs_entry_point.b f256299q0;

    /* renamed from: r0, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f256300r0;

    /* renamed from: s0, reason: collision with root package name */
    @Inject
    public InterfaceC28373a f256301s0;

    /* renamed from: t0, reason: collision with root package name */
    @l
    public o f256302t0;

    /* renamed from: u0, reason: collision with root package name */
    @l
    public Button f256303u0;

    /* renamed from: v0, reason: collision with root package name */
    @l
    public Button f256304v0;

    /* renamed from: w0, reason: collision with root package name */
    @l
    public TextView f256305w0;

    /* renamed from: x0, reason: collision with root package name */
    @l
    public TextView f256306x0;

    /* renamed from: y0, reason: collision with root package name */
    @l
    public ReasonRds f256307y0;

    /* compiled from: FbsEntryPointFragment.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/safedeal/delivery/order_cancellation/fbs_entry_point/FbsEntryPointFragment$a;", "", "<init>", "()V", "_avito_safedeal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    /* compiled from: FbsEntryPointFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b extends H implements Y41.l<Gn0.b, G0> {
        @Override // Y41.l
        public final G0 invoke(Gn0.b bVar) {
            Gn0.b bVar2 = bVar;
            FbsEntryPointFragment fbsEntryPointFragment = (FbsEntryPointFragment) this.receiver;
            fbsEntryPointFragment.getClass();
            if (bVar2 instanceof b.c) {
                com.avito.android.safedeal.delivery.order_cancellation.fbs_entry_point.b bVar3 = fbsEntryPointFragment.f256299q0;
                if (bVar3 == null) {
                    bVar3 = null;
                }
                com.avito.android.component.toast.c.c(com.avito.android.component.toast.c.f125244a, fbsEntryPointFragment, com.avito.android.printable_text.b.f(bVar3.getF256321e()), null, null, null, 0, ToastBarPosition.f181044b, 958);
                InterfaceC28373a interfaceC28373a = fbsEntryPointFragment.f256301s0;
                b.c cVar = (b.c) bVar2;
                (interfaceC28373a != null ? interfaceC28373a : null).c(new C13820b(Integer.parseInt(cVar.f6733b.getId()), cVar.f6732a));
            } else if (L.f(bVar2, b.a.f6730a)) {
                o oVar = fbsEntryPointFragment.f256302t0;
                if (oVar != null) {
                    oVar.l0();
                }
            } else if (bVar2 instanceof b.C0370b) {
                com.avito.android.deeplink_handler.handler.composite.a aVar = fbsEntryPointFragment.f256300r0;
                if (aVar == null) {
                    aVar = null;
                }
                b.a.a(aVar, ((b.C0370b) bVar2).f6731a, null, null, 6);
                o oVar2 = fbsEntryPointFragment.f256302t0;
                if (oVar2 != null) {
                    oVar2.l0();
                }
            }
            return G0.f406611a;
        }
    }

    /* compiled from: FbsEntryPointFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LGn0/c;", "it", "Lkotlin/G0;", "invoke", "(LGn0/c;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.l<Gn0.c, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final c f256308l = new c();

        public c() {
            super(1);
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ G0 invoke(Gn0.c cVar) {
            return G0.f406611a;
        }
    }

    /* compiled from: FbsEntryPointFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.a<G0> {
        public d() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            ((com.avito.android.safedeal.delivery.order_cancellation.fbs_entry_point.e) FbsEntryPointFragment.this.f256297o0.getValue()).accept(InterfaceC13900a.C0369a.f6728a);
            return G0.f406611a;
        }
    }

    /* compiled from: FbsEntryPointFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.a<G0> {
        public e() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            ((com.avito.android.safedeal.delivery.order_cancellation.fbs_entry_point.e) FbsEntryPointFragment.this.f256297o0.getValue()).accept(new InterfaceC13900a.b(new BeduinUniversalPageLink("/api/1/delivery/switchers?onOpenActionsTypes[0]=openFbsSettings", "push", null, null, null, null, null, 120, null)));
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f256311l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Y41.a aVar) {
            super(0);
            this.f256311l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f256311l);
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
            return FbsEntryPointFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ g f256313l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(g gVar) {
            super(0);
            this.f256313l = gVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f256313l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f256314l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f256314l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f256314l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f256315l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f256315l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f256315l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: FbsEntryPointFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/safedeal/delivery/order_cancellation/fbs_entry_point/e;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/safedeal/delivery/order_cancellation/fbs_entry_point/e;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class k extends N implements Y41.a<com.avito.android.safedeal.delivery.order_cancellation.fbs_entry_point.e> {
        public k() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.safedeal.delivery.order_cancellation.fbs_entry_point.e invoke() {
            com.avito.android.safedeal.delivery.order_cancellation.fbs_entry_point.f fVar = FbsEntryPointFragment.this.f256296n0;
            if (fVar == null) {
                fVar = null;
            }
            return (com.avito.android.safedeal.delivery.order_cancellation.fbs_entry_point.e) fVar.get();
        }
    }

    public FbsEntryPointFragment() {
        super(0, 1, null);
        f fVar = new f(new k());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new h(new g()));
        this.f256297o0 = new O0(m0.f406844a.b(com.avito.android.safedeal.delivery.order_cancellation.fbs_entry_point.e.class), new i(interfaceC42726CB), fVar, new j(interfaceC42726CB));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(@Y61.k Context context) {
        super.onAttach(context);
        androidx.core.content.j jVarL1 = l1();
        o oVar = jVarL1 instanceof o ? (o) jVarL1 : null;
        if (oVar == null) {
            throw new IllegalArgumentException("Parent activity must implement RdsOrderCancellationRouter");
        }
        this.f256302t0 = oVar;
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.k
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @l ViewGroup viewGroup, @l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f256298p0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f256298p0;
        com.avito.android.analytics.screens.mvi.a.g(this, screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null, (com.avito.android.safedeal.delivery.order_cancellation.fbs_entry_point.e) this.f256297o0.getValue(), new b(1, this, FbsEntryPointFragment.class, "handleEvent", "handleEvent(Lcom/avito/android/safedeal/delivery/order_cancellation/fbs_entry_point/mvi/entity/FbsEntryPointOneTimeEvent;)V", 0), c.f256308l);
        return layoutInflater.inflate(R.layout.fbs_entry_point_fragment, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f256303u0 = null;
        this.f256304v0 = null;
        this.f256305w0 = null;
        this.f256306x0 = null;
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onDetach() {
        super.onDetach();
        this.f256302t0 = null;
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @l Bundle bundle) {
        super.onViewCreated(view, bundle);
        View viewFindViewById = view.findViewById(R.id.btn_close);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f256303u0 = (Button) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.btn_success);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f256304v0 = (Button) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.tv_title);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f256305w0 = (TextView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.tv_description);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f256306x0 = (TextView) viewFindViewById4;
        Button button = this.f256303u0;
        if (button != null) {
            com.avito.android.safedeal.delivery.order_cancellation.fbs_entry_point.b bVar = this.f256299q0;
            if (bVar == null) {
                bVar = null;
            }
            button.setState(new UU.a(bVar.getF256320d(), null, false, false, false, new d(), null, null, null, false, 990, null));
        }
        Button button2 = this.f256304v0;
        if (button2 != null) {
            com.avito.android.safedeal.delivery.order_cancellation.fbs_entry_point.b bVar2 = this.f256299q0;
            if (bVar2 == null) {
                bVar2 = null;
            }
            button2.setState(new UU.a(bVar2.getF256319c(), null, false, false, false, new e(), null, null, null, false, 990, null));
        }
        TextView textView = this.f256305w0;
        if (textView != null) {
            com.avito.android.safedeal.delivery.order_cancellation.fbs_entry_point.b bVar3 = this.f256299q0;
            if (bVar3 == null) {
                bVar3 = null;
            }
            textView.setText(bVar3.getF256317a());
        }
        TextView textView2 = this.f256306x0;
        if (textView2 != null) {
            com.avito.android.safedeal.delivery.order_cancellation.fbs_entry_point.b bVar4 = this.f256299q0;
            if (bVar4 == null) {
                bVar4 = null;
            }
            textView2.setText(bVar4.getF256318b());
        }
        ScreenPerformanceTracker screenPerformanceTracker = this.f256298p0;
        (screenPerformanceTracker != null ? screenPerformanceTracker : null).d();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@l Bundle bundle) {
        D.f90335a.getClass();
        F fA2 = D.a.a();
        Bundle arguments = getArguments();
        if (arguments == null) {
            throw new IllegalArgumentException("Arguments must not be null");
        }
        Parcelable parcelable = Build.VERSION.SDK_INT >= 34 ? (Parcelable) arguments.getParcelable("EXTRA_REASON", ReasonRds.class) : arguments.getParcelable("EXTRA_REASON");
        if (parcelable == null) {
            throw new IllegalArgumentException("Reason must not be null");
        }
        this.f256307y0 = (ReasonRds) parcelable;
        String string = arguments.getString("EXTRA_ORDER_ID");
        if (string == null) {
            throw new IllegalArgumentException("Order id must not be null");
        }
        ReasonRds reasonRds = this.f256307y0;
        if (reasonRds != null) {
            com.avito.android.safedeal.delivery.order_cancellation.fbs_entry_point.di.a.a().a(this, s.c(this), getResources(), reasonRds, string, (com.avito.android.safedeal.delivery.di.component.b) C29972i.a(C29972i.b(this), com.avito.android.safedeal.delivery.di.component.b.class), cv.c.b(this)).a(this);
        }
        ScreenPerformanceTracker screenPerformanceTracker = this.f256298p0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
    }
}
