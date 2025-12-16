package com.avito.android.wallet.page.history.mvi;

import Cd.C13243a;
import VO0.c;
import VO0.d;
import Y41.l;
import Y61.k;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
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
import com.avito.android.analytics.screens.s;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.bottom_sheet_group.o;
import com.avito.android.di.C29972i;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.spinner.Spinner;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.ui.fragments.BaseFragment;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import com.avito.android.wallet.page.history.PaymentHistoryPerfScreen;
import javax.inject.Inject;
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

/* compiled from: PaymentHistoryFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/wallet/page/history/mvi/PaymentHistoryFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_wallet-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class PaymentHistoryFragment extends BaseFragment implements InterfaceC28477j.b {

    /* renamed from: q0, reason: collision with root package name */
    @k
    public static final a f327987q0 = new a(null);

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public com.avito.android.wallet.page.history.mvi.f f327988n0;

    /* renamed from: o0, reason: collision with root package name */
    @k
    public final O0 f327989o0;

    /* renamed from: p0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f327990p0;

    /* compiled from: PaymentHistoryFragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/wallet/page/history/mvi/PaymentHistoryFragment$a;", "", "<init>", "()V", "", "EXTRA_HISTORY_ID", "Ljava/lang/String;", "_avito_wallet-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: PaymentHistoryFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b extends H implements l<VO0.c, G0> {
        @Override // Y41.l
        public final G0 invoke(VO0.c cVar) {
            VO0.c cVar2 = cVar;
            PaymentHistoryFragment paymentHistoryFragment = (PaymentHistoryFragment) this.receiver;
            a aVar = PaymentHistoryFragment.f327987q0;
            paymentHistoryFragment.getClass();
            if (cVar2 instanceof c.b) {
                paymentHistoryFragment.startActivity(((c.b) cVar2).f17121a);
            } else if (cVar2 instanceof c.a) {
                Context contextRequireContext = paymentHistoryFragment.requireContext();
                com.avito.android.wallet.page.history.mvi.b bVar = new com.avito.android.wallet.page.history.mvi.b(contextRequireContext, 0, 2, null);
                bVar.setContentView(R.layout.payment_history_refund_info);
                bVar.setCancelable(true);
                bVar.setCanceledOnTouchOutside(true);
                bVar.setOnDismissListener(new o(4));
                bVar.S(C35835l0.g(contextRequireContext).y);
                com.avito.android.lib.design.bottom_sheet.d.M(bVar, null, false, true, 3);
                ((Button) bVar.findViewById(R.id.info_sheet_close_button)).setOnClickListener(new com.avito.android.user_adverts.root_screen.adverts_host.host_view.g(bVar, 18));
                bVar.show();
            }
            return G0.f406611a;
        }
    }

    /* compiled from: PaymentHistoryFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LVO0/d;", VoiceInfo.STATE, "Lkotlin/G0;", "invoke", "(LVO0/d;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements l<VO0.d, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.wallet.page.history.mvi.d f327991l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(com.avito.android.wallet.page.history.mvi.d dVar) {
            super(1);
            this.f327991l = dVar;
        }

        /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object, java.util.List] */
        @Override // Y41.l
        public final G0 invoke(VO0.d dVar) {
            VO0.d dVar2 = dVar;
            com.avito.android.wallet.page.history.mvi.d dVar3 = this.f327991l;
            RecyclerView recyclerView = dVar3.f328061f;
            recyclerView.s();
            d.b.c cVar = d.b.c.f17129a;
            d.b bVar = dVar2.f17126d;
            boolean zF2 = L.f(bVar, cVar);
            LinearLayout linearLayout = dVar3.f328063h;
            Spinner spinner = dVar3.f328062g;
            SwipeRefreshLayout swipeRefreshLayout = dVar3.f328059d;
            if (zF2) {
                D6.w(swipeRefreshLayout);
                D6.H(spinner);
                D6.w(linearLayout);
            } else if (bVar instanceof d.b.a) {
                D6.w(swipeRefreshLayout);
                D6.w(spinner);
                D6.H(linearLayout);
                dVar3.f328064i.setText(((d.b.a) bVar).f17127a.getMessage());
            } else if (L.f(bVar, d.b.C1179b.f17128a)) {
                D6.H(swipeRefreshLayout);
                D6.w(spinner);
                D6.w(linearLayout);
                swipeRefreshLayout.setRefreshing(false);
                ?? r22 = dVar2.f17124b;
                boolean zIsEmpty = r22.isEmpty();
                TextView textView = dVar3.f328060e;
                if (zIsEmpty) {
                    D6.H(textView);
                    D6.w(recyclerView);
                } else {
                    D6.w(textView);
                    D6.H(recyclerView);
                    dVar3.f328057b.m(r22);
                    String str = dVar2.f17125c;
                    if (str != null && str.length() != 0) {
                        recyclerView.o(new WO0.a(dVar3.f328058c, new com.avito.android.wallet.page.history.mvi.c(dVar3)));
                    }
                }
            }
            return G0.f406611a;
        }
    }

    /* compiled from: PaymentHistoryFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LVO0/a;", "it", "Lkotlin/G0;", "invoke", "(LVO0/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements l<VO0.a, G0> {
        public d() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(VO0.a aVar) {
            a aVar2 = PaymentHistoryFragment.f327987q0;
            ((com.avito.android.wallet.page.history.mvi.e) PaymentHistoryFragment.this.f327989o0.getValue()).accept(aVar);
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f327993l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Y41.a aVar) {
            super(0);
            this.f327993l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f327993l);
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
            return PaymentHistoryFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ f f327995l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(f fVar) {
            super(0);
            this.f327995l = fVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f327995l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f327996l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f327996l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f327996l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f327997l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f327997l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f327997l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: PaymentHistoryFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/wallet/page/history/mvi/e;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/wallet/page/history/mvi/e;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.a<com.avito.android.wallet.page.history.mvi.e> {
        public j() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.wallet.page.history.mvi.e invoke() {
            com.avito.android.wallet.page.history.mvi.f fVar = PaymentHistoryFragment.this.f327988n0;
            if (fVar == null) {
                fVar = null;
            }
            return (com.avito.android.wallet.page.history.mvi.e) fVar.get();
        }
    }

    public PaymentHistoryFragment() {
        super(0, 1, null);
        e eVar = new e(new j());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new g(new f()));
        this.f327989o0 = new O0(m0.f406844a.b(com.avito.android.wallet.page.history.mvi.e.class), new h(interfaceC42726CB), eVar, new i(interfaceC42726CB));
    }

    @Override // androidx.fragment.app.Fragment
    @k
    public final View onCreateView(@k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f327990p0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        View viewInflate = layoutInflater.inflate(R.layout.payment_history_fragment, viewGroup, false);
        com.avito.android.wallet.page.history.mvi.d dVar = new com.avito.android.wallet.page.history.mvi.d(viewInflate, new d());
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f327990p0;
        com.avito.android.analytics.screens.mvi.a.g(this, screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null, (com.avito.android.wallet.page.history.mvi.e) this.f327989o0.getValue(), new b(1, this, PaymentHistoryFragment.class, "handleEvent", "handleEvent(Lcom/avito/android/wallet/page/history/mvi/entity/PaymentHistoryOneTimeEvent;)V", 0), new c(dVar));
        return viewInflate;
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@k View view, @Y61.l Bundle bundle) {
        super.onViewCreated(view, bundle);
        ScreenPerformanceTracker screenPerformanceTracker = this.f327990p0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.d();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@Y61.l Bundle bundle) {
        D.f90335a.getClass();
        F fA2 = D.a.a();
        String string = requireArguments().getString("history_id");
        if (string == null) {
            throw new IllegalArgumentException("history_id must not be null");
        }
        com.avito.android.wallet.page.history.di.a.a().a((com.avito.android.wallet.page.di.component.e) C29972i.a(C29972i.b(this), com.avito.android.wallet.page.di.component.e.class), string, new C28478k(PaymentHistoryPerfScreen.f327832d, s.c(this), null, 4, null)).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f327990p0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
    }
}
