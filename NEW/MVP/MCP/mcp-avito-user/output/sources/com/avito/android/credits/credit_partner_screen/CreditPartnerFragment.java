package com.avito.android.credits.credit_partner_screen;

import Cd.C13243a;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.ValueCallback;
import android.widget.ProgressBar;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.view.InterfaceC22969B;
import androidx.view.Lifecycle;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import com.avito.android.R;
import com.avito.android.Z;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.s;
import com.avito.android.bottom_navigation.ui.fragment.factory.NavigationState;
import com.avito.android.component.toast.c;
import com.avito.android.component.toast.f;
import com.avito.android.credits.credit_partner_screen.CreditPartnerFragment;
import com.avito.android.credits.credit_partner_screen.a;
import com.avito.android.credits.credit_partner_screen.di.a;
import com.avito.android.di.C29972i;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.ui.fragments.TabBaseFragment;
import com.avito.android.util.C35835l0;
import com.avito.android.util.C35968w3;
import com.avito.android.util.D6;
import com.avito.android.util.Kundle;
import com.avito.android.util.P5;
import com.avito.android.webview.C36149b;
import com.yatatsu.powerwebview.PowerWebView;
import com.yatatsu.powerwebview.rx.PowerWebViewStateChangeEvent;
import i.b;
import java.io.Serializable;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
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
import kotlin.text.C43066x;
import ys.InterfaceC50286a;
import ys.InterfaceC50288c;
import ys.InterfaceC50289d;
import z1.AbstractC50339a;
import zs.InterfaceC50620a;

/* compiled from: CreditPartnerFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/avito/android/credits/credit_partner_screen/CreditPartnerFragment;", "Lcom/avito/android/ui/fragments/TabBaseFragment;", "Lcom/avito/android/ui/fragments/c;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_credits_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CreditPartnerFragment extends TabBaseFragment implements com.avito.android.ui.fragments.c, InterfaceC28477j.b {

    /* renamed from: A0, reason: collision with root package name */
    @Inject
    public com.avito.android.credits.credit_partner_screen.a f128740A0;

    /* renamed from: B0, reason: collision with root package name */
    @Inject
    public com.avito.android.credits.web_handler.f f128741B0;

    /* renamed from: C0, reason: collision with root package name */
    @Inject
    public com.avito.android.credits.e f128742C0;

    /* renamed from: D0, reason: collision with root package name */
    @Inject
    public Z f128743D0;

    /* renamed from: E0, reason: collision with root package name */
    @Inject
    public InterfaceC50620a f128744E0;

    /* renamed from: F0, reason: collision with root package name */
    @Y61.l
    public com.avito.android.credits.credit_partner_screen.d f128745F0;

    /* renamed from: G0, reason: collision with root package name */
    @Y61.k
    public final NavigationState f128746G0;

    /* renamed from: t0, reason: collision with root package name */
    @Y61.k
    public final C35968w3 f128747t0;

    /* renamed from: u0, reason: collision with root package name */
    @Inject
    public com.avito.android.credits.credit_partner_screen.i f128748u0;

    /* renamed from: v0, reason: collision with root package name */
    @Y61.k
    public final O0 f128749v0;

    /* renamed from: w0, reason: collision with root package name */
    @Y61.l
    public ValueCallback<Uri[]> f128750w0;

    /* renamed from: x0, reason: collision with root package name */
    @Y61.k
    public final androidx.view.result.h<Void> f128751x0;

    /* renamed from: y0, reason: collision with root package name */
    @Y61.k
    public final androidx.view.result.h<String> f128752y0;

    /* renamed from: z0, reason: collision with root package name */
    @Inject
    public com.avito.android.credits.credit_partner_screen.webview.b f128753z0;

    /* renamed from: I0, reason: collision with root package name */
    public static final /* synthetic */ n<Object>[] f128739I0 = {m0.f406844a.e(new Y(CreditPartnerFragment.class, "openParams", "getOpenParams()Lcom/avito/android/credits/credit_partner_screen/CreditPartnerFragmentParams;", 0))};

    /* renamed from: H0, reason: collision with root package name */
    @Y61.k
    public static final a f128738H0 = new a(null);

    /* compiled from: CreditPartnerFragment.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/credits/credit_partner_screen/CreditPartnerFragment$a;", "", "<init>", "()V", "_avito_credits_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: CreditPartnerFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b extends H implements Y41.l<ValueCallback<Uri[]>, G0> {
        @Override // Y41.l
        public final G0 invoke(ValueCallback<Uri[]> valueCallback) {
            CreditPartnerFragment creditPartnerFragment = (CreditPartnerFragment) this.receiver;
            a aVar = CreditPartnerFragment.f128738H0;
            creditPartnerFragment.E5().accept(new InterfaceC50286a.e(valueCallback));
            return G0.f406611a;
        }
    }

    /* compiled from: CreditPartnerFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class c extends H implements Y41.l<PowerWebViewStateChangeEvent, G0> {
        @Override // Y41.l
        public final G0 invoke(PowerWebViewStateChangeEvent powerWebViewStateChangeEvent) {
            CreditPartnerFragment creditPartnerFragment = (CreditPartnerFragment) this.receiver;
            a aVar = CreditPartnerFragment.f128738H0;
            creditPartnerFragment.E5().accept(new InterfaceC50286a.f(powerWebViewStateChangeEvent));
            return G0.f406611a;
        }
    }

    /* compiled from: CreditPartnerFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class d extends H implements Y41.a<G0> {
        @Override // Y41.a
        public final G0 invoke() {
            CreditPartnerFragment creditPartnerFragment = (CreditPartnerFragment) this.receiver;
            a aVar = CreditPartnerFragment.f128738H0;
            creditPartnerFragment.E5().accept(InterfaceC50286a.c.f443526a);
            return G0.f406611a;
        }
    }

    /* compiled from: CreditPartnerFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class e extends H implements Y41.l<InterfaceC50288c, G0> {
        @Override // Y41.l
        public final G0 invoke(InterfaceC50288c interfaceC50288c) {
            com.avito.android.credits.credit_partner_screen.d dVar;
            InterfaceC50288c interfaceC50288c2 = interfaceC50288c;
            CreditPartnerFragment creditPartnerFragment = (CreditPartnerFragment) this.receiver;
            a aVar = CreditPartnerFragment.f128738H0;
            creditPartnerFragment.getClass();
            if (interfaceC50288c2 instanceof InterfaceC50288c.d) {
                creditPartnerFragment.f128750w0 = ((InterfaceC50288c.d) interfaceC50288c2).f443540a;
                if (androidx.core.content.d.checkSelfPermission(creditPartnerFragment.requireContext(), "android.permission.CAMERA") == 0) {
                    creditPartnerFragment.f128751x0.b(null);
                } else {
                    creditPartnerFragment.f128752y0.b("android.permission.CAMERA");
                }
            } else if (interfaceC50288c2 instanceof InterfaceC50288c.C12924c) {
                com.avito.android.component.toast.c cVar = com.avito.android.component.toast.c.f125244a;
                PrintableText printableTextC = com.avito.android.printable_text.b.c(R.string.permission_camera, new Serializable[0]);
                f.c.f125255c.getClass();
                com.avito.android.component.toast.c.c(cVar, creditPartnerFragment, printableTextC, null, null, f.c.a.b(), 0, ToastBarPosition.f181046d, 942);
            } else if (interfaceC50288c2 instanceof InterfaceC50288c.a) {
                creditPartnerFragment.r5();
            } else if ((interfaceC50288c2 instanceof InterfaceC50288c.b) && (dVar = creditPartnerFragment.f128745F0) != null) {
                dVar.f128787j.loadUrl(((InterfaceC50288c.b) interfaceC50288c2).f443538a);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: CreditPartnerFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lys/d;", VoiceInfo.STATE, "Lkotlin/G0;", "invoke", "(Lys/d;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.l<InterfaceC50289d, G0> {
        public f() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(InterfaceC50289d interfaceC50289d) {
            InterfaceC50289d interfaceC50289d2 = interfaceC50289d;
            com.avito.android.credits.credit_partner_screen.d dVar = CreditPartnerFragment.this.f128745F0;
            if (dVar != null) {
                boolean zEquals = interfaceC50289d2.equals(InterfaceC50289d.c.f443545b);
                PowerWebView powerWebView = dVar.f128787j;
                ProgressBar progressBar = dVar.f128790m;
                if (zEquals) {
                    D6.H(powerWebView);
                    D6.w(progressBar);
                } else if (interfaceC50289d2 instanceof InterfaceC50289d.b) {
                    D6.w(progressBar);
                    boolean zF2 = L.f(((InterfaceC50289d.b) interfaceC50289d2).f443544b, Boolean.FALSE);
                    int i12 = !zF2 ? R.string.credit_something_went_wrong : R.string.credit_connection_problem;
                    com.avito.android.component.toast.c cVar = com.avito.android.component.toast.c.f125244a;
                    PrintableText printableTextC = com.avito.android.printable_text.b.c(i12, new Serializable[0]);
                    int i13 = !zF2 ? 2750 : -1;
                    View view = dVar.f128778a;
                    dVar.f128791n = com.avito.android.component.toast.c.b(cVar, view, printableTextC, null, Collections.singletonList(new c.a.C3719a(view.getContext().getString(R.string.credit_try_again), false, null, dVar.f128786i, 6, null)), null, null, i13, null, null, false, false, null, null, 4058);
                } else if (interfaceC50289d2 instanceof InterfaceC50289d.C12925d) {
                    D6.H(progressBar);
                    D6.g(powerWebView);
                }
            }
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f128755l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Y41.a aVar) {
            super(0);
            this.f128755l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f128755l);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "Cd/i", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<Fragment> {
        public h() {
            super(0);
        }

        @Override // Y41.a
        public final Fragment invoke() {
            return CreditPartnerFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ h f128757l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(h hVar) {
            super(0);
            this.f128757l = hVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f128757l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f128758l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f128758l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f128758l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class k extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f128759l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f128759l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f128759l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: CreditPartnerFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/credits/credit_partner_screen/h;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/credits/credit_partner_screen/h;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class l extends N implements Y41.a<com.avito.android.credits.credit_partner_screen.h> {
        public l() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.credits.credit_partner_screen.h invoke() {
            com.avito.android.credits.credit_partner_screen.i iVar = CreditPartnerFragment.this.f128748u0;
            if (iVar == null) {
                iVar = null;
            }
            return (com.avito.android.credits.credit_partner_screen.h) iVar.get();
        }
    }

    public CreditPartnerFragment() {
        super(0, 1, null);
        this.f128747t0 = new C35968w3(this);
        g gVar = new g(new l());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new i(new h()));
        this.f128749v0 = new O0(m0.f406844a.b(com.avito.android.credits.credit_partner_screen.h.class), new j(interfaceC42726CB), gVar, new k(interfaceC42726CB));
        final int i12 = 0;
        this.f128751x0 = registerForActivityResult(new C36149b(), new androidx.view.result.a(this) { // from class: com.avito.android.credits.credit_partner_screen.b

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ CreditPartnerFragment f128777c;

            {
                this.f128777c = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.view.result.a
            public final void a(Object obj) {
                CreditPartnerFragment creditPartnerFragment = this.f128777c;
                switch (i12) {
                    case 0:
                        List list = (List) obj;
                        ValueCallback<Uri[]> valueCallback = creditPartnerFragment.f128750w0;
                        if (valueCallback != 0) {
                            valueCallback.onReceiveValue(list.toArray(new Uri[0]));
                            break;
                        }
                        break;
                    default:
                        if (!((Boolean) obj).booleanValue()) {
                            creditPartnerFragment.f128750w0 = null;
                            creditPartnerFragment.E5().accept(InterfaceC50286a.b.f443525a);
                            break;
                        } else {
                            CreditPartnerFragment.a aVar = CreditPartnerFragment.f128738H0;
                            creditPartnerFragment.E5().accept(new InterfaceC50286a.C12922a(creditPartnerFragment.f128750w0));
                            break;
                        }
                }
            }
        });
        final int i13 = 1;
        this.f128752y0 = registerForActivityResult(new b.l(), new androidx.view.result.a(this) { // from class: com.avito.android.credits.credit_partner_screen.b

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ CreditPartnerFragment f128777c;

            {
                this.f128777c = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.view.result.a
            public final void a(Object obj) {
                CreditPartnerFragment creditPartnerFragment = this.f128777c;
                switch (i13) {
                    case 0:
                        List list = (List) obj;
                        ValueCallback<Uri[]> valueCallback = creditPartnerFragment.f128750w0;
                        if (valueCallback != 0) {
                            valueCallback.onReceiveValue(list.toArray(new Uri[0]));
                            break;
                        }
                        break;
                    default:
                        if (!((Boolean) obj).booleanValue()) {
                            creditPartnerFragment.f128750w0 = null;
                            creditPartnerFragment.E5().accept(InterfaceC50286a.b.f443525a);
                            break;
                        } else {
                            CreditPartnerFragment.a aVar = CreditPartnerFragment.f128738H0;
                            creditPartnerFragment.E5().accept(new InterfaceC50286a.C12922a(creditPartnerFragment.f128750w0));
                            break;
                        }
                }
            }
        });
        this.f128746G0 = new NavigationState(false, null, 2, null);
    }

    public final CreditPartnerFragmentParams D5() {
        return (CreditPartnerFragmentParams) this.f128747t0.getValue(this, f128739I0[0]);
    }

    public final com.avito.android.credits.credit_partner_screen.h E5() {
        return (com.avito.android.credits.credit_partner_screen.h) this.f128749v0.getValue();
    }

    @Override // com.avito.android.ui.fragments.c
    public final boolean i0() {
        com.avito.android.credits.credit_partner_screen.d dVar = this.f128745F0;
        if (dVar != null) {
            return dVar.f128788k.c();
        }
        return false;
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.l
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        return layoutInflater.inflate(R.layout.credit_partner_form_fragment, viewGroup, false);
    }

    @Override // com.avito.android.ui.fragments.TabBaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        com.avito.android.credits.credit_partner_screen.d dVar = this.f128745F0;
        if (dVar != null) {
            com.avito.android.lib.design.toast_bar.k kVar = dVar.f128791n;
            if (kVar != null) {
                kVar.f();
            }
            dVar.f128791n = null;
            dVar.f128787j.destroy();
            dVar.f128780c.b();
            dVar.f128792o.dispose();
        }
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) {
        super.onViewCreated(view, bundle);
        InterfaceC50620a interfaceC50620a = this.f128744E0;
        if (interfaceC50620a == null) {
            interfaceC50620a = null;
        }
        interfaceC50620a.e();
        Z z12 = this.f128743D0;
        if (z12 == null) {
            z12 = null;
        }
        com.avito.android.credits.credit_partner_screen.a aVar = this.f128740A0;
        if (aVar == null) {
            aVar = null;
        }
        z12.i(aVar.f128769a);
        View view2 = getView();
        if (view2 != null) {
            View viewFindViewById = view2.findViewById(R.id.toolbar);
            if (viewFindViewById == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.appcompat.widget.Toolbar");
            }
            Toolbar toolbar = (Toolbar) viewFindViewById;
            Drawable overflowIcon = toolbar.getOverflowIcon();
            if (overflowIcon != null) {
                overflowIcon.setTint(C35835l0.d(R.attr.blue, requireContext()));
            }
            toolbar.setTitle(R.string.advert_details_credit_application);
            P5.c(toolbar, R.attr.black);
            P5.f(toolbar, R.attr.blue);
            toolbar.setNavigationOnClickListener(new com.avito.android.comfortable_deal.deal.item.agent.h(this, 12));
        }
        com.avito.android.credits.credit_partner_screen.a aVar2 = this.f128740A0;
        com.avito.android.credits.credit_partner_screen.a aVar3 = aVar2 != null ? aVar2 : null;
        com.avito.android.credits.web_handler.f fVar = this.f128741B0;
        com.avito.android.credits.web_handler.f fVar2 = fVar != null ? fVar : null;
        com.avito.android.credits.credit_partner_screen.webview.b bVar = this.f128753z0;
        com.avito.android.credits.credit_partner_screen.webview.b bVar2 = bVar != null ? bVar : null;
        InterfaceC50620a interfaceC50620a2 = this.f128744E0;
        InterfaceC50620a interfaceC50620a3 = interfaceC50620a2 != null ? interfaceC50620a2 : null;
        com.avito.android.credits.e eVar = this.f128742C0;
        this.f128745F0 = new com.avito.android.credits.credit_partner_screen.d(view, aVar3, fVar2, bVar2, interfaceC50620a3, eVar != null ? eVar : null, new b(1, this, CreditPartnerFragment.class, "onShowFileChooser", "onShowFileChooser(Landroid/webkit/ValueCallback;)V", 0), new c(1, this, CreditPartnerFragment.class, "onWebViewStateChanged", "onWebViewStateChanged(Lcom/yatatsu/powerwebview/rx/PowerWebViewStateChangeEvent;)V", 0), new d(0, this, CreditPartnerFragment.class, "onErrorRetryButtonClick", "onErrorRetryButtonClick()V", 0));
        com.avito.android.arch.mvi.android.f.a(E5(), getViewLifecycleOwner(), Lifecycle.State.f46682e, new e(1, this, CreditPartnerFragment.class, "handleOneTimeEvent", "handleOneTimeEvent(Lcom/avito/android/credits/credit_partner_screen/mvi/entity/CreditPartnerOneTimeEvent;)V", 0), new f());
        InterfaceC50620a interfaceC50620a4 = this.f128744E0;
        (interfaceC50620a4 != null ? interfaceC50620a4 : null).d();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@Y61.l Bundle bundle) {
        com.avito.android.credits.credit_partner_screen.a bVar;
        boolean z12 = bundle != null;
        D.f90335a.getClass();
        F fA2 = D.a.a();
        a.InterfaceC3817a interfaceC3817aA = com.avito.android.credits.credit_partner_screen.di.j.a();
        com.avito.android.credits.credit_partner_screen.di.b bVar2 = (com.avito.android.credits.credit_partner_screen.di.b) C29972i.a(C29972i.b(this), com.avito.android.credits.credit_partner_screen.di.b.class);
        a.C3816a c3816a = com.avito.android.credits.credit_partner_screen.a.f128768g;
        CreditPartnerFragmentParams creditPartnerFragmentParamsD5 = D5();
        c3816a.getClass();
        String str = creditPartnerFragmentParamsD5.f128764b;
        if (str != null ? C43066x.q(str, "tinkoff", false) : false) {
            bVar = new a.c(str);
        } else {
            bVar = str != null ? C43066x.q(str, "autobrokerHaraba", false) : false ? new a.b(str) : a.d.f128775h;
        }
        com.avito.android.credits.credit_partner_screen.a aVar = bVar;
        Uri uri = D5().f128765c;
        String string = uri != null ? uri.toString() : null;
        if (string == null) {
            string = "";
        }
        String str2 = D5().f128766d;
        if (str2 == null) {
            str2 = "";
        }
        Kundle kundle = new Kundle();
        String string2 = D5().f128767e;
        if (string2 == null) {
            string2 = UUID.randomUUID().toString();
        }
        kundle.m("key_session", string2);
        interfaceC3817aA.a(bVar2, aVar, string, str2, z12, kundle, s.c(this)).a(this);
        InterfaceC50620a interfaceC50620a = this.f128744E0;
        (interfaceC50620a != null ? interfaceC50620a : null).a(fA2.b());
    }

    @Override // com.avito.android.ui.fragments.TabBaseFragment
    @Y61.k
    /* renamed from: s5, reason: from getter */
    public final NavigationState getF317018D0() {
        return this.f128746G0;
    }
}
