package com.avito.android.verification.verification_fetch_invoice;

import Cd.C13243a;
import LV.c;
import OM0.b;
import OM0.c;
import OM0.d;
import VU.b;
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
import com.avito.android.lib.design.nav_bar.NavBar;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.ui.fragments.BaseFragment;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import com.avito.android.verification.inn.list.button.ButtonItem;
import com.avito.android.verification.inn.r;
import com.avito.android.verification.verification_fetch_invoice.g;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import xM0.C49864d;
import z1.AbstractC50339a;

/* compiled from: VerificationFetchInvoiceFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/verification/verification_fetch_invoice/VerificationFetchInvoiceFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class VerificationFetchInvoiceFragment extends BaseFragment implements InterfaceC28477j.b {

    /* renamed from: t0, reason: collision with root package name */
    @Y61.k
    public static final a f325132t0 = new a(null);

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public com.avito.android.verification.verification_fetch_invoice.k f325133n0;

    /* renamed from: o0, reason: collision with root package name */
    @Y61.k
    public final O0 f325134o0;

    /* renamed from: p0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f325135p0;

    /* renamed from: q0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.j f325136q0;

    /* renamed from: r0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.a f325137r0;

    /* renamed from: s0, reason: collision with root package name */
    @Y61.l
    public com.avito.android.verification.verification_fetch_invoice.g f325138s0;

    /* compiled from: VerificationFetchInvoiceFragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/verification/verification_fetch_invoice/VerificationFetchInvoiceFragment$a;", "", "<init>", "()V", "", "KEY_VERIFICATION_FETCH_INVOICE_ARGS", "Ljava/lang/String;", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: VerificationFetchInvoiceFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LOM0/c;", "event", "Lkotlin/G0;", "invoke", "(LOM0/c;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.l<OM0.c, G0> {
        public b() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(OM0.c cVar) {
            OM0.c cVar2 = cVar;
            a aVar = VerificationFetchInvoiceFragment.f325132t0;
            VerificationFetchInvoiceFragment verificationFetchInvoiceFragment = VerificationFetchInvoiceFragment.this;
            if (cVar2 instanceof c.C0788c) {
                com.avito.android.verification.verification_fetch_invoice.g gVar = verificationFetchInvoiceFragment.f325138s0;
                if (gVar != null) {
                    com.avito.android.component.toast.c cVar3 = com.avito.android.component.toast.c.f125244a;
                    ((c.C0788c) cVar2).getClass();
                    PrintableText printableTextF = com.avito.android.printable_text.b.f(null);
                    f.c.f125255c.getClass();
                    com.avito.android.component.toast.c.b(cVar3, gVar.f325180e, printableTextF, null, null, null, f.c.a.b(), 0, ToastBarPosition.f181045c, null, false, false, null, null, 4014);
                }
            } else if (L.f(cVar2, c.a.f12214a)) {
                verificationFetchInvoiceFragment.requireActivity().finish();
            } else if (L.f(cVar2, c.b.f12215a)) {
                verificationFetchInvoiceFragment.requireActivity().onBackPressed();
            }
            return G0.f406611a;
        }
    }

    /* compiled from: VerificationFetchInvoiceFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LOM0/d;", VoiceInfo.STATE, "Lkotlin/G0;", "invoke", "(LOM0/d;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.l<OM0.d, G0> {
        public c() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(OM0.d dVar) {
            ButtonItem.Style style;
            OM0.d dVar2 = dVar;
            com.avito.android.verification.verification_fetch_invoice.g gVar = VerificationFetchInvoiceFragment.this.f325138s0;
            if (gVar != null) {
                boolean z12 = dVar2 instanceof d.a;
                NavBar navBar = gVar.f325180e;
                C49864d c49864d = gVar.f325181f;
                if (z12) {
                    D6.H(navBar);
                    C49864d.c(c49864d, com.avito.android.verification.verification_fetch_invoice.i.f325187l);
                } else if (dVar2 instanceof d.b) {
                    d.b bVar = (d.b) dVar2;
                    boolean z13 = bVar.f12217b;
                    View view = gVar.f325176a;
                    navBar.setState(new com.avito.android.lib.design.nav_bar.a(z13 ? C35835l0.h(R.attr.ic_close24, view.getContext()) : null, new com.avito.android.verification.verification_fetch_invoice.h(gVar), false, null, null, null, null, 124, null));
                    com.avito.konveyor.util.a.a(gVar.f325178c, bVar.f12218c.f323873b);
                    gVar.f325177b.notifyDataSetChanged();
                    OM0.a aVar = bVar.f12219d;
                    UU.a aVar2 = aVar.f12204a;
                    Button button = gVar.f325182g;
                    button.setState(aVar2);
                    button.setOnClickListener(new com.avito.android.tariff.cpx.configure.levels.d(28, gVar, dVar2));
                    int i12 = g.b.f325184a[aVar.f12206c.ordinal()];
                    if (i12 == 1) {
                        style = ButtonItem.Style.f323911c;
                    } else if (i12 == 2) {
                        style = ButtonItem.Style.f323912d;
                    } else {
                        if (i12 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        style = ButtonItem.Style.f323913e;
                    }
                    b.a aVar3 = VU.b.f17147t;
                    Context context = view.getContext();
                    aVar3.getClass();
                    button.setStyle((VU.b) c.a.a(aVar3, context, style.f323916b));
                    c49864d.b();
                } else if (dVar2.equals(d.c.f12220b)) {
                    C49864d.d(c49864d);
                }
            }
            return G0.f406611a;
        }
    }

    /* compiled from: VerificationFetchInvoiceFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class d extends H implements Y41.l<OM0.b, G0> {
        @Override // Y41.l
        public final G0 invoke(OM0.b bVar) {
            ((com.avito.android.verification.verification_fetch_invoice.j) this.receiver).accept(bVar);
            return G0.f406611a;
        }
    }

    /* compiled from: VerificationFetchInvoiceFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/DeepLink;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/deep_linking/links/DeepLink;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.l<DeepLink, G0> {
        public e() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(DeepLink deepLink) {
            a aVar = VerificationFetchInvoiceFragment.f325132t0;
            VerificationFetchInvoiceFragment.this.r5().accept(new b.d(deepLink));
            return G0.f406611a;
        }
    }

    /* compiled from: VerificationFetchInvoiceFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/verification/inn/list/button/ButtonItem;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/verification/inn/list/button/ButtonItem;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.l<ButtonItem, G0> {
        public f() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(ButtonItem buttonItem) {
            a aVar = VerificationFetchInvoiceFragment.f325132t0;
            VerificationFetchInvoiceFragment.this.r5().accept(new b.c(buttonItem));
            return G0.f406611a;
        }
    }

    /* compiled from: VerificationFetchInvoiceFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/verification/common/list/button_default/a;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/verification/common/list/button_default/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.l<com.avito.android.verification.common.list.button_default.a, G0> {
        public g() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(com.avito.android.verification.common.list.button_default.a aVar) {
            a aVar2 = VerificationFetchInvoiceFragment.f325132t0;
            VerificationFetchInvoiceFragment.this.r5().accept(new b.d(aVar.f323401d));
            return G0.f406611a;
        }
    }

    /* compiled from: VerificationFetchInvoiceFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/verification/inn/list/disclosure/a;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/verification/inn/list/disclosure/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.l<com.avito.android.verification.inn.list.disclosure.a, G0> {
        public h() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(com.avito.android.verification.inn.list.disclosure.a aVar) {
            a aVar2 = VerificationFetchInvoiceFragment.f325132t0;
            VerificationFetchInvoiceFragment.this.r5().accept(b.e.f12210a);
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f325145l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(Y41.a aVar) {
            super(0);
            this.f325145l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f325145l);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "Cd/i", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.a<Fragment> {
        public j() {
            super(0);
        }

        @Override // Y41.a
        public final Fragment invoke() {
            return VerificationFetchInvoiceFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class k extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ j f325147l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(j jVar) {
            super(0);
            this.f325147l = jVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f325147l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class l extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f325148l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f325148l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f325148l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class m extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f325149l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f325149l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f325149l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: VerificationFetchInvoiceFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/verification/verification_fetch_invoice/j;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/verification/verification_fetch_invoice/j;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class n extends N implements Y41.a<com.avito.android.verification.verification_fetch_invoice.j> {
        public n() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.verification.verification_fetch_invoice.j invoke() {
            com.avito.android.verification.verification_fetch_invoice.k kVar = VerificationFetchInvoiceFragment.this.f325133n0;
            if (kVar == null) {
                kVar = null;
            }
            return (com.avito.android.verification.verification_fetch_invoice.j) kVar.get();
        }
    }

    public VerificationFetchInvoiceFragment() {
        super(0, 1, null);
        i iVar = new i(new n());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new k(new j()));
        this.f325134o0 = new O0(m0.f406844a.b(com.avito.android.verification.verification_fetch_invoice.j.class), new l(interfaceC42726CB), iVar, new m(interfaceC42726CB));
    }

    public static void q5(VerificationFetchInvoiceFragment verificationFetchInvoiceFragment, com.avito.android.deeplink_handler.handler.bundle.a aVar, boolean z12) {
        Bundle bundle;
        G0 g02 = null;
        String string = (aVar == null || (bundle = aVar.f134522c) == null) ? null : bundle.getString("string_id");
        if (string != null) {
            verificationFetchInvoiceFragment.r5().accept(new b.g(string, z12));
            g02 = G0.f406611a;
        }
        if (g02 == null) {
            ((com.avito.android.deeplink_handler.view.impl.i) super.e5()).a(z12);
        }
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    @Y61.k
    public final a.g e5() {
        return new com.avito.android.authorization.auto_recovery.factor_unavailable_reason.d(this, 25);
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.k
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f325135p0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f325135p0;
        com.avito.android.analytics.screens.mvi.a.g(this, screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null, r5(), new b(), new c());
        return layoutInflater.inflate(R.layout.fragment_verification_fetch_invoice, viewGroup, false);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) {
        super.onViewCreated(view, bundle);
        com.avito.konveyor.adapter.j jVar = this.f325136q0;
        if (jVar == null) {
            jVar = null;
        }
        com.avito.konveyor.adapter.a aVar = this.f325137r0;
        if (aVar == null) {
            aVar = null;
        }
        this.f325138s0 = new com.avito.android.verification.verification_fetch_invoice.g(new d(1, r5(), com.avito.android.verification.verification_fetch_invoice.j.class, "accept", "accept(Ljava/lang/Object;)V", 0), view, aVar, jVar);
        requireActivity().setResult(-1);
        ScreenPerformanceTracker screenPerformanceTracker = this.f325135p0;
        (screenPerformanceTracker != null ? screenPerformanceTracker : null).d();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@Y61.l Bundle bundle) {
        D.f90335a.getClass();
        F fA2 = D.a.a();
        Bundle bundleRequireArguments = requireArguments();
        com.avito.android.verification.di.fetch_invoice.a.a().a(s.c(this), getResources(), (VerificationFetchInvoiceArgs) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) bundleRequireArguments.getParcelable("key.verification_fetch_invoice_args", VerificationFetchInvoiceArgs.class) : bundleRequireArguments.getParcelable("key.verification_fetch_invoice_args")), getF42820b(), new r(new e(), new f(), new g(), null, null, null, new h(), 56, null), (com.avito.android.verification.di.fetch_invoice.c) C29972i.a(C29972i.b(this), com.avito.android.verification.di.fetch_invoice.c.class), cv.c.b(this)).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f325135p0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
    }

    public final com.avito.android.verification.verification_fetch_invoice.j r5() {
        return (com.avito.android.verification.verification_fetch_invoice.j) this.f325134o0.getValue();
    }
}
