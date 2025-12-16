package com.avito.android.early_access;

import Cd.C13243a;
import Fc1.DialogInterfaceOnShowListenerC13648j6;
import Lx.InterfaceC14447b;
import Mx.InterfaceC14538a;
import Mx.InterfaceC14539b;
import android.app.Dialog;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.runtime.internal.P;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.view.C22981N;
import androidx.view.C23069w;
import androidx.view.InterfaceC22969B;
import androidx.view.Lifecycle;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import com.avito.android.R;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.compose.a;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.ToastMessageLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.di.C29972i;
import com.avito.android.di.module.InterfaceC30106l7;
import com.avito.android.early_access.entities.ReEarlyAccessData;
import com.avito.android.lib.util.inflater.AvitoLayoutInflater;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.ui.fragments.BaseDialogFragment;
import com.avito.android.webview.l;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Z;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.jvm.internal.C42801a;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import z1.AbstractC50339a;

/* compiled from: EarlyAccessDialog.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b²\u0006\f\u0010\u0007\u001a\u00020\u00068\nX\u008a\u0084\u0002"}, d2 = {"Lcom/avito/android/early_access/EarlyAccessDialog;", "Lcom/avito/android/ui/fragments/BaseDialogFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "Lcom/avito/android/early_access/mvi/entity/EarlyAccessState;", VoiceInfo.STATE, "_avito_early-access_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class EarlyAccessDialog extends BaseDialogFragment implements InterfaceC28477j.b {

    /* renamed from: q0, reason: collision with root package name */
    @Y61.k
    public static final a f145055q0 = new a(null);

    /* renamed from: h0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f145056h0;

    /* renamed from: i0, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f145057i0;

    /* renamed from: j0, reason: collision with root package name */
    @Inject
    public com.avito.android.deep_linking.x f145058j0;

    /* renamed from: k0, reason: collision with root package name */
    @Inject
    public com.avito.android.webview.l f145059k0;

    /* renamed from: l0, reason: collision with root package name */
    @Inject
    public InterfaceC14447b f145060l0;

    /* renamed from: m0, reason: collision with root package name */
    @Inject
    public D f145061m0;

    /* renamed from: n0, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f145062n0;

    /* renamed from: o0, reason: collision with root package name */
    @Y61.k
    public final O0 f145063o0;

    /* renamed from: p0, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f145064p0;

    /* compiled from: EarlyAccessDialog.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/early_access/EarlyAccessDialog$a;", "", "<init>", "()V", "", "KEY_INITIAL_DATA", "Ljava/lang/String;", "_avito_early-access_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: EarlyAccessDialog.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/avito/android/analytics/screens/compose/a;", "invoke", "()Lcom/avito/android/analytics/screens/compose/a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<com.avito.android.analytics.screens.compose.a> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.analytics.screens.compose.a invoke() {
            a.C2677a c2677a = com.avito.android.analytics.screens.compose.a.f90568a;
            ScreenPerformanceTracker screenPerformanceTracker = EarlyAccessDialog.this.f145056h0;
            if (screenPerformanceTracker == null) {
                screenPerformanceTracker = null;
            }
            c2677a.getClass();
            return a.C2677a.a(screenPerformanceTracker);
        }
    }

    /* compiled from: EarlyAccessDialog.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/avito/android/early_access/entities/ReEarlyAccessData;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c extends N implements Y41.a<ReEarlyAccessData> {
        public c() {
            super(0);
        }

        @Override // Y41.a
        public final ReEarlyAccessData invoke() {
            ReEarlyAccessData reEarlyAccessData;
            Bundle arguments = EarlyAccessDialog.this.getArguments();
            if (arguments != null) {
                reEarlyAccessData = (ReEarlyAccessData) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) arguments.getParcelable("initial_data", ReEarlyAccessData.class) : arguments.getParcelable("initial_data"));
            } else {
                reEarlyAccessData = null;
            }
            if (reEarlyAccessData != null) {
                return reEarlyAccessData;
            }
            throw new IllegalArgumentException("Required value was null.");
        }
    }

    /* compiled from: EarlyAccessDialog.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class d extends C42801a implements Y41.p<InterfaceC14539b, Continuation<? super G0>, Object>, SuspendFunction {
        @Override // Y41.p
        public final Object invoke(InterfaceC14539b interfaceC14539b, Continuation<? super G0> continuation) {
            InterfaceC14539b interfaceC14539b2 = interfaceC14539b;
            EarlyAccessDialog earlyAccessDialog = (EarlyAccessDialog) this.receiver;
            a aVar = EarlyAccessDialog.f145055q0;
            earlyAccessDialog.getClass();
            if (L.f(interfaceC14539b2, InterfaceC14539b.a.f11110a)) {
                earlyAccessDialog.dismiss();
            } else if (interfaceC14539b2 instanceof InterfaceC14539b.d) {
                com.avito.android.deeplink_handler.handler.composite.a aVar2 = earlyAccessDialog.f145057i0;
                if (aVar2 == null) {
                    aVar2 = null;
                }
                InterfaceC14539b.d dVar = (InterfaceC14539b.d) interfaceC14539b2;
                b.a.a(aVar2, new ToastMessageLink(dVar.f11114a, dVar.f11115b, dVar.f11116c, null, null, false, null, 120, null), null, null, 6);
            } else if (interfaceC14539b2 instanceof InterfaceC14539b.c) {
                com.avito.android.deep_linking.x xVar = earlyAccessDialog.f145058j0;
                if (xVar == null) {
                    xVar = null;
                }
                InterfaceC14539b.c cVar = (InterfaceC14539b.c) interfaceC14539b2;
                Object objC = xVar.c(cVar.f11112a);
                int i12 = Z.f406624c;
                if (objC instanceof Z.b) {
                    objC = null;
                }
                DeepLink deepLink = (DeepLink) objC;
                if (deepLink != null) {
                    com.avito.android.deeplink_handler.handler.composite.a aVar3 = earlyAccessDialog.f145057i0;
                    if (aVar3 == null) {
                        aVar3 = null;
                    }
                    b.a.a(aVar3, deepLink, cVar.f11113b, null, 4);
                } else {
                    com.avito.android.webview.l lVar = earlyAccessDialog.f145059k0;
                    if (lVar == null) {
                        lVar = null;
                    }
                    earlyAccessDialog.startActivity(l.a.a(lVar, Uri.parse(cVar.f11112a), null, 6));
                }
            } else if (interfaceC14539b2 instanceof InterfaceC14539b.C0710b) {
                FragmentManager parentFragmentManager = earlyAccessDialog.getParentFragmentManager();
                String tag = earlyAccessDialog.getTag();
                if (tag == null) {
                    tag = "";
                }
                Bundle bundle = new Bundle();
                bundle.putBoolean("EarlyAccessDialogKeyResult", true);
                G0 g02 = G0.f406611a;
                parentFragmentManager.o0(bundle, tag);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: EarlyAccessDialog.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LMx/a;", "it", "Lkotlin/G0;", "invoke", "(LMx/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.l<InterfaceC14538a, G0> {
        public e() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(InterfaceC14538a interfaceC14538a) {
            a aVar = EarlyAccessDialog.f145055q0;
            EarlyAccessDialog.this.f5().accept(interfaceC14538a);
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f145068l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Y41.a aVar) {
            super(0);
            this.f145068l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f145068l);
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
            return EarlyAccessDialog.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ g f145070l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(g gVar) {
            super(0);
            this.f145070l = gVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f145070l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f145071l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f145071l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f145071l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f145072l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f145072l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f145072l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: EarlyAccessDialog.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/early_access/C;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/early_access/C;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class k extends N implements Y41.a<C> {
        public k() {
            super(0);
        }

        @Override // Y41.a
        public final C invoke() {
            D d12 = EarlyAccessDialog.this.f145061m0;
            if (d12 == null) {
                d12 = null;
            }
            return (C) d12.get();
        }
    }

    public EarlyAccessDialog() {
        super(0, 1, null);
        this.f145062n0 = C42727D.c(new b());
        f fVar = new f(new k());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new h(new g()));
        this.f145063o0 = new O0(m0.f406844a.b(C.class), new i(interfaceC42726CB), fVar, new j(interfaceC42726CB));
        this.f145064p0 = C42727D.c(new c());
    }

    @Override // com.avito.android.ui.fragments.BaseDialogFragment
    public final void e5(@Y61.l Bundle bundle) {
        com.avito.android.analytics.screens.D.f90335a.getClass();
        F fA2 = D.a.a();
        com.avito.android.early_access.di.a.a().a((com.avito.android.early_access.di.c) C29972i.a(C29972i.b(this), com.avito.android.early_access.di.c.class), (InterfaceC30106l7) C29972i.a(C29972i.b(this), InterfaceC30106l7.class), cv.c.b(this), com.avito.android.analytics.screens.s.b(this), (ReEarlyAccessData) this.f145064p0.getValue(), new e()).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f145056h0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
    }

    public final C f5() {
        return (C) this.f145063o0.getValue();
    }

    @Override // androidx.fragment.app.DialogFragment
    @Y61.k
    public final Dialog onCreateDialog(@Y61.l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f145056h0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        C43175k.K(new C43197r1(new d(2, this, EarlyAccessDialog.class, "handleEvent", "handleEvent(Lcom/avito/android/early_access/mvi/entity/EarlyAccessOneTimeEvent;)V", 4), C23069w.a(f5().getEvents(), getLifecycle(), Lifecycle.State.f46682e)), C22981N.a(getLifecycle()));
        com.avito.android.early_access.g gVar = new com.avito.android.early_access.g(AvitoLayoutInflater.b(AvitoLayoutInflater.f181382a, requireContext(), Integer.valueOf(R.style.Theme_DesignSystem_Re23)), this);
        ComposeView composeView = new ComposeView(requireContext(), null, 0, 6, null);
        composeView.setContent(new C22096n(1473237318, new l(this), true));
        gVar.setContentView(composeView);
        gVar.setCancelable(true);
        gVar.setCanceledOnTouchOutside(true);
        com.avito.android.lib.design.bottom_sheet.d.I(gVar, true);
        com.avito.android.lib.design.bottom_sheet.d.M(gVar, null, false, true, 7);
        gVar.setOnShowListener(new DialogInterfaceOnShowListenerC13648j6(this, 3));
        gVar.R(new m(this));
        gVar.Q(new n(this));
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f145056h0;
        (screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null).d();
        return gVar;
    }
}
