package com.avito.android.wallet.page.history.details.mvi;

import Cd.C13243a;
import HV.a;
import SO0.a;
import SO0.b;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.browser.customtabs.h;
import androidx.fragment.app.Fragment;
import androidx.view.InterfaceC22969B;
import androidx.view.Lifecycle;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import com.avito.android.R;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.s;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.x;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.di.C29972i;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.lib.design.toast_bar.state.ToastBarState;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.ui.fragments.BaseDialogFragment;
import com.avito.android.util.C35835l0;
import com.avito.android.util.C35968w3;
import com.avito.android.wallet.page.history.details.PaymentHistoryDetailsPerfScreen;
import java.io.Serializable;
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
import kotlin.jvm.internal.Y;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import kotlin.reflect.n;
import z1.AbstractC50339a;

/* compiled from: PaymentHistoryDetailsFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/wallet/page/history/details/mvi/PaymentHistoryDetailsFragment;", "Lcom/avito/android/ui/fragments/BaseDialogFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_wallet-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class PaymentHistoryDetailsFragment extends BaseDialogFragment implements InterfaceC28477j.b {

    /* renamed from: h0, reason: collision with root package name */
    @Inject
    public l f327858h0;

    /* renamed from: i0, reason: collision with root package name */
    @Y61.k
    public final O0 f327859i0;

    /* renamed from: j0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f327860j0;

    /* renamed from: k0, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f327861k0;

    /* renamed from: l0, reason: collision with root package name */
    @Inject
    public x f327862l0;

    /* renamed from: m0, reason: collision with root package name */
    @Inject
    public InterfaceC28373a f327863m0;

    /* renamed from: n0, reason: collision with root package name */
    @Y61.k
    public final C35968w3 f327864n0;

    /* renamed from: o0, reason: collision with root package name */
    @Y61.l
    public ContextThemeWrapper f327865o0;

    /* renamed from: p0, reason: collision with root package name */
    @Y61.l
    public com.avito.android.lib.design.modal.a f327866p0;

    /* renamed from: r0, reason: collision with root package name */
    public static final /* synthetic */ n<Object>[] f327857r0 = {m0.f406844a.e(new Y(PaymentHistoryDetailsFragment.class, "openParams", "getOpenParams()Lcom/avito/android/wallet/page/history/details/mvi/PaymentHistoryDetailsOpenParams;", 0))};

    /* renamed from: q0, reason: collision with root package name */
    @Y61.k
    public static final a f327856q0 = new a(null);

    /* compiled from: PaymentHistoryDetailsFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/wallet/page/history/details/mvi/PaymentHistoryDetailsFragment$a;", "", "<init>", "()V", "_avito_wallet-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: PaymentHistoryDetailsFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b extends H implements Y41.l<SO0.a, G0> {
        @Override // Y41.l
        public final G0 invoke(SO0.a aVar) {
            ((com.avito.android.wallet.page.history.details.mvi.k) this.receiver).accept(aVar);
            return G0.f406611a;
        }
    }

    /* compiled from: PaymentHistoryDetailsFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class c extends H implements Y41.l<SO0.b, G0> {
        @Override // Y41.l
        public final G0 invoke(SO0.b bVar) {
            SO0.b bVar2 = bVar;
            PaymentHistoryDetailsFragment paymentHistoryDetailsFragment = (PaymentHistoryDetailsFragment) this.receiver;
            a aVar = PaymentHistoryDetailsFragment.f327856q0;
            paymentHistoryDetailsFragment.getClass();
            if (bVar2 instanceof b.C1011b) {
                b.C1011b c1011b = (b.C1011b) bVar2;
                Context contextRequireContext = paymentHistoryDetailsFragment.requireContext();
                h.i iVar = new h.i();
                iVar.f22867b.f22826a = Integer.valueOf(C35835l0.d(R.attr.blue, contextRequireContext) | (-16777216));
                iVar.b(true);
                iVar.f22870e = 1;
                iVar.f22866a.putExtra("android.support.customtabs.extra.SHARE_MENU_ITEM", true);
                androidx.browser.customtabs.h hVarA = iVar.a();
                String str = c1011b.f14959b;
                Intent intent = hVarA.f22864a;
                intent.setPackage(str);
                intent.setData(Uri.parse(c1011b.f14958a));
                androidx.core.content.d.startActivity(contextRequireContext, intent, hVarA.f22865b);
            } else if (L.f(bVar2, b.c.f14960a)) {
                com.avito.android.wallet.page.history.details.mvi.factory.c cVar = com.avito.android.wallet.page.history.details.mvi.factory.c.f327950a;
                Context contextRequireContext2 = paymentHistoryDetailsFragment.requireContext();
                cVar.getClass();
                com.avito.android.lib.design.modal.a aVarA = com.avito.android.wallet.page.history.details.mvi.factory.c.a(contextRequireContext2);
                paymentHistoryDetailsFragment.f327866p0 = aVarA;
                com.avito.android.lib.util.g.a(aVarA);
            } else if (L.f(bVar2, b.d.f14961a)) {
                com.avito.android.wallet.page.history.details.mvi.factory.c cVar2 = com.avito.android.wallet.page.history.details.mvi.factory.c.f327950a;
                Context contextRequireContext3 = paymentHistoryDetailsFragment.requireContext();
                cVar2.getClass();
                com.avito.android.lib.design.modal.a aVarB = com.avito.android.wallet.page.history.details.mvi.factory.c.b(contextRequireContext3);
                paymentHistoryDetailsFragment.f327866p0 = aVarB;
                com.avito.android.lib.util.g.a(aVarB);
            } else {
                if (L.f(bVar2, b.e.f14962a)) {
                    InterfaceC28373a interfaceC28373a = paymentHistoryDetailsFragment.f327863m0;
                    if (interfaceC28373a == null) {
                        interfaceC28373a = null;
                    }
                    interfaceC28373a.c(new MO0.d());
                    a.C0407a c0407a = HV.a.f7100w;
                    Context contextRequireContext4 = paymentHistoryDetailsFragment.requireContext();
                    int iJ2 = C35835l0.j(R.attr.toastBarError, paymentHistoryDetailsFragment.requireContext());
                    c0407a.getClass();
                    HV.a aVarB2 = a.C0407a.b(iJ2, contextRequireContext4);
                    ToastBarState toastBarState = new ToastBarState(com.avito.android.printable_text.b.c(R.string.error_refund_snackbar_text, new Serializable[0]), null, ToastBarPosition.f181046d, null, null, null, null, 2750, false, false, null, null, 3962, null);
                    Dialog dialog = paymentHistoryDetailsFragment.getDialog();
                    com.avito.android.lib.design.bottom_sheet.d dVar = dialog instanceof com.avito.android.lib.design.bottom_sheet.d ? (com.avito.android.lib.design.bottom_sheet.d) dialog : null;
                    if (dVar != null) {
                        IV.a.e(dVar, toastBarState, aVarB2);
                    }
                } else if (bVar2 instanceof b.f) {
                    InterfaceC28373a interfaceC28373a2 = paymentHistoryDetailsFragment.f327863m0;
                    if (interfaceC28373a2 == null) {
                        interfaceC28373a2 = null;
                    }
                    interfaceC28373a2.c(new MO0.i());
                    paymentHistoryDetailsFragment.dismiss();
                    x xVar = paymentHistoryDetailsFragment.f327862l0;
                    if (xVar == null) {
                        xVar = null;
                    }
                    DeepLink deepLinkB = xVar.b(((b.f) bVar2).f14963a);
                    com.avito.android.deeplink_handler.handler.composite.a aVar2 = paymentHistoryDetailsFragment.f327861k0;
                    if (aVar2 == null) {
                        aVar2 = null;
                    }
                    b.a.a(aVar2, deepLinkB, null, null, 6);
                } else if (bVar2 instanceof b.a) {
                    InterfaceC28373a interfaceC28373a3 = paymentHistoryDetailsFragment.f327863m0;
                    (interfaceC28373a3 != null ? interfaceC28373a3 : null).c(new MO0.b());
                    paymentHistoryDetailsFragment.dismiss();
                }
            }
            return G0.f406611a;
        }
    }

    /* compiled from: PaymentHistoryDetailsFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LSO0/c;", VoiceInfo.STATE, "Lkotlin/G0;", "invoke", "(LSO0/c;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.l<SO0.c, G0> {
        public d() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(SO0.c cVar) {
            SO0.c cVar2 = cVar;
            PaymentHistoryDetailsFragment paymentHistoryDetailsFragment = PaymentHistoryDetailsFragment.this;
            ScreenPerformanceTracker screenPerformanceTracker = paymentHistoryDetailsFragment.f327860j0;
            if (screenPerformanceTracker == null) {
                screenPerformanceTracker = null;
            }
            com.avito.android.analytics.screens.mvi.a.i(cVar2, screenPerformanceTracker, new com.avito.android.wallet.page.history.details.mvi.e(1, paymentHistoryDetailsFragment, PaymentHistoryDetailsFragment.class, "render", "render(Lcom/avito/android/wallet/page/history/details/mvi/entity/PaymentHistoryDetailsState;)V", 0));
            return G0.f406611a;
        }
    }

    /* compiled from: PaymentHistoryDetailsFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LUO0/c;", "receipt", "Lkotlin/G0;", "invoke", "(LUO0/c;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.l<UO0.c, G0> {
        public e() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(UO0.c cVar) {
            a aVar = PaymentHistoryDetailsFragment.f327856q0;
            ((com.avito.android.wallet.page.history.details.mvi.k) PaymentHistoryDetailsFragment.this.f327859i0.getValue()).accept(new a.c(cVar));
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f327869l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Y41.a aVar) {
            super(0);
            this.f327869l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f327869l);
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
            return PaymentHistoryDetailsFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ g f327871l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(g gVar) {
            super(0);
            this.f327871l = gVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f327871l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f327872l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f327872l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f327872l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f327873l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f327873l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f327873l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: PaymentHistoryDetailsFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/wallet/page/history/details/mvi/k;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/wallet/page/history/details/mvi/k;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class k extends N implements Y41.a<com.avito.android.wallet.page.history.details.mvi.k> {
        public k() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.wallet.page.history.details.mvi.k invoke() {
            l lVar = PaymentHistoryDetailsFragment.this.f327858h0;
            if (lVar == null) {
                lVar = null;
            }
            return (com.avito.android.wallet.page.history.details.mvi.k) lVar.get();
        }
    }

    public PaymentHistoryDetailsFragment() {
        super(0, 1, null);
        f fVar = new f(new k());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new h(new g()));
        this.f327859i0 = new O0(m0.f406844a.b(com.avito.android.wallet.page.history.details.mvi.k.class), new i(interfaceC42726CB), fVar, new j(interfaceC42726CB));
        this.f327864n0 = new C35968w3(this);
    }

    @Override // com.avito.android.ui.fragments.BaseDialogFragment
    public final void e5(@Y61.l Bundle bundle) {
        D.f90335a.getClass();
        F fA2 = D.a.a();
        C28478k c28478k = new C28478k(PaymentHistoryDetailsPerfScreen.f327834d, s.b(this), null, 4, null);
        com.avito.android.wallet.page.history.details.di.a.a().a((com.avito.android.wallet.page.di.component.e) C29972i.a(C29972i.b(this), com.avito.android.wallet.page.di.component.e.class), cv.c.b(this), c28478k, (PaymentHistoryDetailsOpenParams) this.f327864n0.getValue(this, f327857r0[0]), new e()).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f327860j0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.l
    public final Context getContext() {
        ContextThemeWrapper contextThemeWrapper = this.f327865o0;
        return contextThemeWrapper == null ? super.getContext() : contextThemeWrapper;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onAttach(@Y61.k Context context) {
        super.onAttach(context);
        this.f327865o0 = new ContextThemeWrapper(requireContext(), R.style.Theme_DesignSystem_Dialog_Re23);
    }

    @Override // androidx.fragment.app.DialogFragment
    @Y61.k
    public final Dialog onCreateDialog(@Y61.l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f327860j0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        return new com.avito.android.wallet.page.history.details.mvi.d(requireContext(), new b(1, (com.avito.android.wallet.page.history.details.mvi.k) this.f327859i0.getValue(), com.avito.android.wallet.page.history.details.mvi.k.class, "accept", "accept(Ljava/lang/Object;)V", 0));
    }

    @Override // com.avito.android.ui.fragments.BaseDialogFragment, androidx.fragment.app.Fragment
    @Y61.l
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        View viewOnCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        com.avito.android.arch.mvi.android.f.a((com.avito.android.wallet.page.history.details.mvi.k) this.f327859i0.getValue(), this, Lifecycle.State.f46682e, new c(1, this, PaymentHistoryDetailsFragment.class, "handleEvent", "handleEvent(Lcom/avito/android/wallet/page/history/details/mvi/entity/PaymentHistoryDetailsOneTimeEvent;)V", 0), new d());
        ScreenPerformanceTracker screenPerformanceTracker = this.f327860j0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.d();
        return viewOnCreateView;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDetach() {
        super.onDetach();
        this.f327865o0 = null;
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(@Y61.k DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        com.avito.android.lib.design.modal.a aVar = this.f327866p0;
        if (aVar != null) {
            aVar.dismiss();
        }
        getParentFragmentManager().o0(Bundle.EMPTY, "PAYMENT_DETAILS_FRAGMENT_REQUEST_KEY");
    }
}
