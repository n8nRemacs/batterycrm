package com.avito.android.verification.verification_input_bill_amount;

import Cd.C13243a;
import UM0.a;
import UM0.b;
import UM0.c;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.ActivityC22955m;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.InterfaceC22969B;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import androidx.view.x;
import com.avito.android.R;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.s;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.component.toast.f;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.di.C29972i;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.ui.fragments.BaseFragment;
import com.avito.android.util.D6;
import com.avito.android.verification.inn.a;
import com.avito.android.verification.inn.r;
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
import okhttp3.internal.ws.WebSocketProtocol;
import xM0.C49864d;
import z1.AbstractC50339a;

/* compiled from: VerificationInputBillAmountFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/verification/verification_input_bill_amount/VerificationInputBillAmountFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class VerificationInputBillAmountFragment extends BaseFragment implements InterfaceC28477j.b {

    /* renamed from: t0, reason: collision with root package name */
    @Y61.k
    public static final a f325483t0 = new a(null);

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public com.avito.android.verification.verification_input_bill_amount.k f325484n0;

    /* renamed from: o0, reason: collision with root package name */
    @Y61.k
    public final O0 f325485o0;

    /* renamed from: p0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f325486p0;

    /* renamed from: q0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.j f325487q0;

    /* renamed from: r0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.a f325488r0;

    /* renamed from: s0, reason: collision with root package name */
    @Y61.l
    public com.avito.android.verification.verification_input_bill_amount.g f325489s0;

    /* compiled from: VerificationInputBillAmountFragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/verification/verification_input_bill_amount/VerificationInputBillAmountFragment$a;", "", "<init>", "()V", "", "KEY_VERIFICATION_INPUT_BILL_AMOUNT_ARGS", "Ljava/lang/String;", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: VerificationInputBillAmountFragment.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/verification/verification_input_bill_amount/VerificationInputBillAmountFragment$b", "Lcom/avito/android/deeplink_handler/view/impl/k;", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b extends com.avito.android.deeplink_handler.view.impl.k {
        public b(ActivityC22955m activityC22955m) {
            super(activityC22955m);
        }

        @Override // com.avito.android.deeplink_handler.view.impl.k
        @Y61.k
        public final ViewGroup a() {
            return (ViewGroup) VerificationInputBillAmountFragment.this.requireView().findViewById(R.id.appbar_container);
        }
    }

    /* compiled from: VerificationInputBillAmountFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LUM0/b;", "event", "Lkotlin/G0;", "invoke", "(LUM0/b;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.l<UM0.b, G0> {
        public c() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(UM0.b bVar) {
            UM0.b bVar2 = bVar;
            a aVar = VerificationInputBillAmountFragment.f325483t0;
            VerificationInputBillAmountFragment verificationInputBillAmountFragment = VerificationInputBillAmountFragment.this;
            if (bVar2 instanceof b.C1119b) {
                com.avito.android.verification.verification_input_bill_amount.g gVar = verificationInputBillAmountFragment.f325489s0;
                if (gVar != null) {
                    com.avito.android.component.toast.c cVar = com.avito.android.component.toast.c.f125244a;
                    PrintableText printableTextF = com.avito.android.printable_text.b.f(((b.C1119b) bVar2).f16358a);
                    f.c.f125255c.getClass();
                    com.avito.android.component.toast.c.b(cVar, gVar.f325535d, printableTextF, null, null, null, f.c.a.b(), 0, ToastBarPosition.f181045c, null, false, false, null, null, 4014);
                }
            } else if (L.f(bVar2, b.a.f16357a)) {
                verificationInputBillAmountFragment.requireActivity().finish();
            }
            return G0.f406611a;
        }
    }

    /* compiled from: VerificationInputBillAmountFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LUM0/c;", VoiceInfo.STATE, "Lkotlin/G0;", "invoke", "(LUM0/c;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.l<UM0.c, G0> {
        public d() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(UM0.c cVar) {
            UM0.c cVar2 = cVar;
            VerificationInputBillAmountFragment verificationInputBillAmountFragment = VerificationInputBillAmountFragment.this;
            com.avito.android.verification.verification_input_bill_amount.g gVar = verificationInputBillAmountFragment.f325489s0;
            if (gVar != null) {
                com.avito.android.verification.verification_input_bill_amount.a aVar = new com.avito.android.verification.verification_input_bill_amount.a(1, (com.avito.android.verification.verification_input_bill_amount.j) verificationInputBillAmountFragment.f325485o0.getValue(), com.avito.android.verification.verification_input_bill_amount.j.class, "accept", "accept(Ljava/lang/Object;)V", 0);
                boolean zEquals = cVar2.equals(c.C1120c.f16362b);
                C49864d c49864d = gVar.f325537f;
                Button button = gVar.f325536e;
                if (zEquals) {
                    C49864d.d(c49864d);
                    D6.w(button);
                } else if (cVar2 instanceof c.b) {
                    c.b bVar = (c.b) cVar2;
                    button.setState(bVar.f16360b);
                    button.setOnClickListener(new com.avito.android.seller_promotions.b(27, aVar));
                    a.C10030a c10030a = bVar.f16361c;
                    com.avito.konveyor.util.a.a(gVar.f325533b, c10030a.f323873b);
                    gVar.f325532a.notifyDataSetChanged();
                    c49864d.b();
                    D6.H(button);
                    Integer num = c10030a.f323874c;
                    if (num != null) {
                        int iIntValue = num.intValue();
                        RecyclerView recyclerView = gVar.f325534c;
                        com.avito.android.verification.inn.l lVar = new com.avito.android.verification.inn.l(recyclerView.getContext());
                        lVar.f53878a = iIntValue;
                        RecyclerView.m layoutManager = recyclerView.getLayoutManager();
                        if (layoutManager != null) {
                            layoutManager.x1(lVar);
                        }
                    }
                } else if (cVar2 instanceof c.a) {
                    D6.H(gVar.f325535d);
                    C49864d.c(c49864d, com.avito.android.verification.verification_input_bill_amount.h.f325540l);
                }
            }
            return G0.f406611a;
        }
    }

    /* compiled from: VerificationInputBillAmountFragment.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/verification/verification_input_bill_amount/VerificationInputBillAmountFragment$e", "Landroidx/activity/x;", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class e extends x {
        public e() {
            super(true);
        }

        @Override // androidx.view.x
        public final void c() {
            VerificationInputBillAmountFragment.this.requireActivity().finish();
        }
    }

    /* compiled from: VerificationInputBillAmountFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class f extends H implements Y41.l<UM0.a, G0> {
        @Override // Y41.l
        public final G0 invoke(UM0.a aVar) {
            ((com.avito.android.verification.verification_input_bill_amount.j) this.receiver).accept(aVar);
            return G0.f406611a;
        }
    }

    /* compiled from: VerificationInputBillAmountFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/DeepLink;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/deep_linking/links/DeepLink;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.l<DeepLink, G0> {
        public g() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(DeepLink deepLink) {
            a aVar = VerificationInputBillAmountFragment.f325483t0;
            ((com.avito.android.verification.verification_input_bill_amount.j) VerificationInputBillAmountFragment.this.f325485o0.getValue()).accept(new a.c(deepLink));
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f325495l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(Y41.a aVar) {
            super(0);
            this.f325495l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f325495l);
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
            return VerificationInputBillAmountFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ i f325497l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(i iVar) {
            super(0);
            this.f325497l = iVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f325497l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class k extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f325498l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f325498l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f325498l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class l extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f325499l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f325499l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f325499l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: VerificationInputBillAmountFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/verification/verification_input_bill_amount/j;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/verification/verification_input_bill_amount/j;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class m extends N implements Y41.a<com.avito.android.verification.verification_input_bill_amount.j> {
        public m() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.verification.verification_input_bill_amount.j invoke() {
            com.avito.android.verification.verification_input_bill_amount.k kVar = VerificationInputBillAmountFragment.this.f325484n0;
            if (kVar == null) {
                kVar = null;
            }
            return (com.avito.android.verification.verification_input_bill_amount.j) kVar.get();
        }
    }

    public VerificationInputBillAmountFragment() {
        super(0, 1, null);
        h hVar = new h(new m());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new j(new i()));
        this.f325485o0 = new O0(m0.f406844a.b(com.avito.android.verification.verification_input_bill_amount.j.class), new k(interfaceC42726CB), hVar, new l(interfaceC42726CB));
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    @Y61.k
    public final a.i f5() {
        ActivityC22955m activityC22955mRequireActivity = requireActivity();
        ToastBarPosition toastBarPosition = ToastBarPosition.f181044b;
        return new b(activityC22955mRequireActivity);
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.k
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f325486p0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f325486p0;
        com.avito.android.analytics.screens.mvi.a.g(this, screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null, (com.avito.android.verification.verification_input_bill_amount.j) this.f325485o0.getValue(), new c(), new d());
        return layoutInflater.inflate(R.layout.fragment_verification_input_bill_amount, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f325489s0 = null;
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) {
        super.onViewCreated(view, bundle);
        requireActivity().getF21241d().a(getViewLifecycleOwner(), new e());
        com.avito.konveyor.adapter.j jVar = this.f325487q0;
        if (jVar == null) {
            jVar = null;
        }
        com.avito.konveyor.adapter.a aVar = this.f325488r0;
        if (aVar == null) {
            aVar = null;
        }
        this.f325489s0 = new com.avito.android.verification.verification_input_bill_amount.g(new f(1, (com.avito.android.verification.verification_input_bill_amount.j) this.f325485o0.getValue(), com.avito.android.verification.verification_input_bill_amount.j.class, "accept", "accept(Ljava/lang/Object;)V", 0), view, aVar, jVar);
        ScreenPerformanceTracker screenPerformanceTracker = this.f325486p0;
        (screenPerformanceTracker != null ? screenPerformanceTracker : null).d();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@Y61.l Bundle bundle) {
        D.f90335a.getClass();
        F fA2 = D.a.a();
        Bundle bundleRequireArguments = requireArguments();
        VerificationInputBillAmountArgs verificationInputBillAmountArgs = (VerificationInputBillAmountArgs) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) bundleRequireArguments.getParcelable("key.verification_input_bill_amount_args", VerificationInputBillAmountArgs.class) : bundleRequireArguments.getParcelable("key.verification_input_bill_amount_args"));
        com.avito.android.verification.di.input_bill_amount.a.a().a(s.c(this), getResources(), verificationInputBillAmountArgs, getF42820b(), new r(new g(), null, null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT, null), (com.avito.android.verification.di.input_bill_amount.c) C29972i.a(C29972i.b(this), com.avito.android.verification.di.input_bill_amount.c.class), cv.c.b(this)).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f325486p0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
    }
}
