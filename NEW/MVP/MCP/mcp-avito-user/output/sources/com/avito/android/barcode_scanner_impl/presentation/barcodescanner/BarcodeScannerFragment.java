package com.avito.android.barcode_scanner_impl.presentation.barcodescanner;

import Cd.C13243a;
import L91.o;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.camera.view.PreviewView;
import androidx.fragment.app.ActivityC22955m;
import androidx.fragment.app.Fragment;
import androidx.view.InterfaceC22969B;
import androidx.view.Lifecycle;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import bh.AbstractC25650c;
import bh.InterfaceC25648a;
import bh.InterfaceC25649b;
import ch.InterfaceC27193a;
import com.avito.android.R;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.s;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.barcode_scanner_impl.analytics.BarcodeScannerScreen;
import com.avito.android.barcode_scanner_impl.presentation.barcodescanner.BarcodeScannerFragment;
import com.avito.android.barcode_scanner_impl.presentation.barcodescanner.mvi.entity.PermissionDenialType;
import com.avito.android.barcode_scanner_public.BarcodeScannerParams;
import com.avito.android.barcode_scanner_public.BarcodeScannerType;
import com.avito.android.di.C29972i;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.modal.a;
import com.avito.android.ui.fragments.BaseFragment;
import com.avito.android.util.C35966w1;
import i.b;
import java.util.concurrent.ExecutorService;
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
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.s0;
import kotlin.reflect.n;
import qK0.C47313c;
import z1.AbstractC50339a;

/* compiled from: BarcodeScannerFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/barcode_scanner_impl/presentation/barcodescanner/BarcodeScannerFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_barcode-scanner_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class BarcodeScannerFragment extends BaseFragment implements InterfaceC28477j.b {

    /* renamed from: I0, reason: collision with root package name */
    @Y61.k
    public static final a f98915I0;

    /* renamed from: J0, reason: collision with root package name */
    public static final /* synthetic */ n<Object>[] f98916J0;

    /* renamed from: A0, reason: collision with root package name */
    @Y61.k
    public final C47313c f98917A0;

    /* renamed from: B0, reason: collision with root package name */
    @Y61.k
    public final C47313c f98918B0;

    /* renamed from: C0, reason: collision with root package name */
    @Y61.k
    public final C47313c f98919C0;

    /* renamed from: D0, reason: collision with root package name */
    @Y61.k
    public final C47313c f98920D0;

    /* renamed from: E0, reason: collision with root package name */
    @Y61.k
    public final C47313c f98921E0;

    /* renamed from: F0, reason: collision with root package name */
    @Y61.k
    public final C47313c f98922F0;

    /* renamed from: G0, reason: collision with root package name */
    @Y61.k
    public final C47313c f98923G0;

    /* renamed from: H0, reason: collision with root package name */
    @Y61.k
    public final androidx.view.result.h<String> f98924H0;

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public com.avito.android.barcode_scanner_impl.presentation.barcodescanner.k f98925n0;

    /* renamed from: o0, reason: collision with root package name */
    @Y61.k
    public final O0 f98926o0;

    /* renamed from: p0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f98927p0;

    /* renamed from: q0, reason: collision with root package name */
    @Inject
    public InterfaceC27193a f98928q0;

    /* renamed from: r0, reason: collision with root package name */
    @Inject
    public ch.c f98929r0;

    /* renamed from: s0, reason: collision with root package name */
    @Inject
    public ExecutorService f98930s0;

    /* renamed from: t0, reason: collision with root package name */
    @Y61.k
    public final C47313c f98931t0;

    /* renamed from: u0, reason: collision with root package name */
    @Y61.k
    public final C47313c f98932u0;

    /* renamed from: v0, reason: collision with root package name */
    @Y61.k
    public final C47313c f98933v0;

    /* renamed from: w0, reason: collision with root package name */
    @Y61.k
    public final C47313c f98934w0;

    /* renamed from: x0, reason: collision with root package name */
    @Y61.k
    public final C47313c f98935x0;

    /* renamed from: y0, reason: collision with root package name */
    @Y61.k
    public final C47313c f98936y0;

    /* renamed from: z0, reason: collision with root package name */
    @Y61.k
    public final C47313c f98937z0;

    /* compiled from: BarcodeScannerFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/barcode_scanner_impl/presentation/barcodescanner/BarcodeScannerFragment$a;", "", "<init>", "()V", "_avito_barcode-scanner_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* compiled from: BarcodeScannerFragment.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/os/Bundle;", "Lkotlin/G0;", "invoke", "(Landroid/os/Bundle;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.barcode_scanner_impl.presentation.barcodescanner.BarcodeScannerFragment$a$a, reason: collision with other inner class name */
        public static final class C2982a extends N implements Y41.l<Bundle, G0> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ BarcodeScannerParams f98938l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C2982a(BarcodeScannerParams barcodeScannerParams) {
                super(1);
                this.f98938l = barcodeScannerParams;
            }

            @Override // Y41.l
            public final G0 invoke(Bundle bundle) {
                bundle.putParcelable("BARCODE_SCANNER_PARAMS_KEY", this.f98938l);
                return G0.f406611a;
            }
        }

        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @Y61.k
        public static BarcodeScannerFragment a(@Y61.k BarcodeScannerParams barcodeScannerParams) {
            BarcodeScannerFragment barcodeScannerFragment = new BarcodeScannerFragment();
            C35966w1.a(barcodeScannerFragment, 1, new C2982a(barcodeScannerParams));
            return barcodeScannerFragment;
        }

        public a() {
        }
    }

    /* compiled from: BarcodeScannerFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b {
        static {
            int[] iArr = new int[PermissionDenialType.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                PermissionDenialType permissionDenialType = PermissionDenialType.f98997b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* compiled from: BarcodeScannerFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lbh/b;", "it", "Lkotlin/G0;", "invoke", "(Lbh/b;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.l<InterfaceC25649b, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final c f98939l = new c();

        public c() {
            super(1);
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ G0 invoke(InterfaceC25649b interfaceC25649b) {
            return G0.f406611a;
        }
    }

    /* compiled from: BarcodeScannerFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class d extends H implements Y41.l<AbstractC25650c, G0> {
        /* JADX WARN: Removed duplicated region for block: B:23:0x0081  */
        @Override // Y41.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final kotlin.G0 invoke(bh.AbstractC25650c r17) {
            /*
                Method dump skipped, instructions count: 324
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.barcode_scanner_impl.presentation.barcodescanner.BarcodeScannerFragment.d.invoke(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: BarcodeScannerFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class e extends H implements Y41.l<InterfaceC25649b, G0> {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // Y41.l
        public final G0 invoke(InterfaceC25649b interfaceC25649b) {
            InterfaceC25649b interfaceC25649b2 = interfaceC25649b;
            BarcodeScannerFragment barcodeScannerFragment = (BarcodeScannerFragment) this.receiver;
            a aVar = BarcodeScannerFragment.f98915I0;
            barcodeScannerFragment.getClass();
            boolean z12 = interfaceC25649b2 instanceof InterfaceC25649b.C2010b;
            C47313c c47313c = barcodeScannerFragment.f98923G0;
            if (z12) {
                n<Object> nVar = BarcodeScannerFragment.f98916J0[13];
                com.avito.android.barcode_scanner_impl.presentation.e eVar = (com.avito.android.barcode_scanner_impl.presentation.e) c47313c.a();
                PreviewView previewView = eVar.f99036a;
                boolean zIsLaidOut = previewView.isLaidOut();
                int i12 = ((InterfaceC25649b.C2010b) interfaceC25649b2).f57380a;
                if (!zIsLaidOut || previewView.isLayoutRequested()) {
                    previewView.addOnLayoutChangeListener(new com.avito.android.barcode_scanner_impl.presentation.c(eVar, i12));
                } else {
                    com.avito.android.barcode_scanner_impl.presentation.e.a(eVar, i12);
                }
            } else {
                if (L.f(interfaceC25649b2, InterfaceC25649b.e.f57383a)) {
                    n<Object> nVar2 = BarcodeScannerFragment.f98916J0[13];
                    com.avito.android.barcode_scanner_impl.presentation.e eVar2 = (com.avito.android.barcode_scanner_impl.presentation.e) c47313c.a();
                    androidx.camera.lifecycle.i iVar = eVar2.f99042g;
                    if (iVar != null) {
                        iVar.e();
                    }
                    eVar2.f99043h = null;
                    eVar2.f99042g = null;
                } else if (L.f(interfaceC25649b2, InterfaceC25649b.a.f57379a)) {
                    InterfaceC27193a interfaceC27193a = barcodeScannerFragment.f98928q0;
                    if (interfaceC27193a == null) {
                        interfaceC27193a = null;
                    }
                    interfaceC27193a.getClass();
                    if (barcodeScannerFragment.shouldShowRequestPermissionRationale("android.permission.CAMERA")) {
                        com.avito.android.lib.util.g.a(a.C5284a.c(com.avito.android.lib.design.modal.a.f179704d, barcodeScannerFragment.requireContext(), new com.avito.android.barcode_scanner_impl.presentation.barcodescanner.h(barcodeScannerFragment)));
                    } else {
                        InterfaceC27193a interfaceC27193a2 = barcodeScannerFragment.f98928q0;
                        (interfaceC27193a2 != null ? interfaceC27193a2 : null).getClass();
                        barcodeScannerFragment.f98924H0.b("android.permission.CAMERA");
                    }
                } else if (L.f(interfaceC25649b2, InterfaceC25649b.c.f57381a)) {
                    ActivityC22955m activityC22955mRequireActivity = barcodeScannerFragment.requireActivity();
                    com.avito.android.barcode_scanner_impl.presentation.a aVar2 = activityC22955mRequireActivity instanceof com.avito.android.barcode_scanner_impl.presentation.a ? (com.avito.android.barcode_scanner_impl.presentation.a) activityC22955mRequireActivity : null;
                    if (aVar2 != null) {
                        aVar2.h0();
                    }
                } else if (interfaceC25649b2 instanceof InterfaceC25649b.d) {
                    ActivityC22955m activityC22955mRequireActivity2 = barcodeScannerFragment.requireActivity();
                    com.avito.android.barcode_scanner_impl.presentation.a aVar3 = activityC22955mRequireActivity2 instanceof com.avito.android.barcode_scanner_impl.presentation.a ? (com.avito.android.barcode_scanner_impl.presentation.a) activityC22955mRequireActivity2 : null;
                    if (aVar3 != null) {
                        aVar3.g0(((InterfaceC25649b.d) interfaceC25649b2).f57382a);
                    }
                } else if (L.f(interfaceC25649b2, InterfaceC25649b.f.f57384a)) {
                    ch.c cVar = barcodeScannerFragment.f98929r0;
                    (cVar != null ? cVar : null).a();
                }
            }
            return G0.f406611a;
        }
    }

    /* compiled from: BarcodeScannerFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lbh/c;", "it", "Lkotlin/G0;", "invoke", "(Lbh/c;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.l<AbstractC25650c, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final f f98940l = new f();

        public f() {
            super(1);
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ G0 invoke(AbstractC25650c abstractC25650c) {
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f98941l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Y41.a aVar) {
            super(0);
            this.f98941l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f98941l);
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
            return BarcodeScannerFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ h f98943l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(h hVar) {
            super(0);
            this.f98943l = hVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f98943l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f98944l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f98944l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f98944l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class k extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f98945l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f98945l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f98945l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: BarcodeScannerFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/barcode_scanner_impl/presentation/barcodescanner/j;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/barcode_scanner_impl/presentation/barcodescanner/j;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class l extends N implements Y41.a<com.avito.android.barcode_scanner_impl.presentation.barcodescanner.j> {
        public l() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.barcode_scanner_impl.presentation.barcodescanner.j invoke() {
            com.avito.android.barcode_scanner_impl.presentation.barcodescanner.k kVar = BarcodeScannerFragment.this.f98925n0;
            if (kVar == null) {
                kVar = null;
            }
            return (com.avito.android.barcode_scanner_impl.presentation.barcodescanner.j) kVar.get();
        }
    }

    static {
        Y y12 = new Y(BarcodeScannerFragment.class, "allowCameraButton", "getAllowCameraButton()Lcom/avito/android/lib/design/button/Button;", 0);
        n0 n0Var = m0.f406844a;
        f98916J0 = new n[]{n0Var.e(y12), androidx.compose.ui.graphics.colorspace.e.s(BarcodeScannerFragment.class, "confirmButton", "getConfirmButton()Lcom/avito/android/lib/design/button/Button;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(BarcodeScannerFragment.class, "rescanButton", "getRescanButton()Lcom/avito/android/lib/design/button/Button;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(BarcodeScannerFragment.class, "flashIcon", "getFlashIcon()Landroid/widget/ImageView;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(BarcodeScannerFragment.class, "backIcon", "getBackIcon()Landroid/widget/ImageView;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(BarcodeScannerFragment.class, "cameraPreview", "getCameraPreview()Landroidx/camera/view/PreviewView;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(BarcodeScannerFragment.class, "imagePreview", "getImagePreview()Landroid/widget/ImageView;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(BarcodeScannerFragment.class, "scannerDescriptionText", "getScannerDescriptionText()Landroid/widget/TextView;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(BarcodeScannerFragment.class, "barcodeValueText", "getBarcodeValueText()Landroid/widget/TextView;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(BarcodeScannerFragment.class, "checkBarcodeValueGroup", "getCheckBarcodeValueGroup()Landroid/view/View;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(BarcodeScannerFragment.class, "noPermissionPlaceholder", "getNoPermissionPlaceholder()Landroid/view/View;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(BarcodeScannerFragment.class, "scannerFailurePlaceholder", "getScannerFailurePlaceholder()Landroid/view/View;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(BarcodeScannerFragment.class, "scannerFailureButton", "getScannerFailureButton()Lcom/avito/android/lib/design/button/Button;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(BarcodeScannerFragment.class, "scannerUnit", "getScannerUnit()Lcom/avito/android/barcode_scanner_impl/presentation/CameraScannerUIUnit;", 0, n0Var)};
        f98915I0 = new a(null);
    }

    public BarcodeScannerFragment() {
        super(R.layout.fragment_barcode_scanner);
        g gVar = new g(new l());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new i(new h()));
        this.f98926o0 = new O0(m0.f406844a.b(com.avito.android.barcode_scanner_impl.presentation.barcodescanner.j.class), new j(interfaceC42726CB), gVar, new k(interfaceC42726CB));
        this.f98931t0 = new C47313c(null, 1, null);
        this.f98932u0 = new C47313c(null, 1, null);
        this.f98933v0 = new C47313c(null, 1, null);
        this.f98934w0 = new C47313c(null, 1, null);
        this.f98935x0 = new C47313c(null, 1, null);
        this.f98936y0 = new C47313c(null, 1, null);
        this.f98937z0 = new C47313c(null, 1, null);
        this.f98917A0 = new C47313c(null, 1, null);
        this.f98918B0 = new C47313c(null, 1, null);
        this.f98919C0 = new C47313c(null, 1, null);
        this.f98920D0 = new C47313c(null, 1, null);
        this.f98921E0 = new C47313c(null, 1, null);
        this.f98922F0 = new C47313c(null, 1, null);
        this.f98923G0 = new C47313c(null, 1, null);
        this.f98924H0 = registerForActivityResult(new b.l(), new o(this, 13));
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.l
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f98927p0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        q5().accept(InterfaceC25648a.h.f57375a);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        q5().accept(InterfaceC25648a.C2009a.f57367a);
        super.onStop();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) {
        super.onViewCreated(view, bundle);
        ScreenPerformanceTracker screenPerformanceTracker = this.f98927p0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.d();
        PreviewView previewView = (PreviewView) view.findViewById(R.id.camera_preview);
        C47313c c47313c = this.f98936y0;
        n<Object>[] nVarArr = f98916J0;
        n<Object> nVar = nVarArr[5];
        c47313c.b(this, previewView);
        ImageView imageView = (ImageView) view.findViewById(R.id.image_preview);
        C47313c c47313c2 = this.f98937z0;
        n<Object> nVar2 = nVarArr[6];
        c47313c2.b(this, imageView);
        TextView textView = (TextView) view.findViewById(R.id.scanner_description);
        C47313c c47313c3 = this.f98917A0;
        n<Object> nVar3 = nVarArr[7];
        c47313c3.b(this, textView);
        TextView textView2 = (TextView) view.findViewById(R.id.check_code_value);
        C47313c c47313c4 = this.f98918B0;
        n<Object> nVar4 = nVarArr[8];
        c47313c4.b(this, textView2);
        View viewFindViewById = view.findViewById(R.id.check_code_value_group);
        C47313c c47313c5 = this.f98919C0;
        n<Object> nVar5 = nVarArr[9];
        c47313c5.b(this, viewFindViewById);
        View viewFindViewById2 = view.findViewById(R.id.camera_permission_placeholder);
        C47313c c47313c6 = this.f98920D0;
        n<Object> nVar6 = nVarArr[10];
        c47313c6.b(this, viewFindViewById2);
        View viewFindViewById3 = view.findViewById(R.id.scanner_failure_state_placeholder);
        C47313c c47313c7 = this.f98921E0;
        n<Object> nVar7 = nVarArr[11];
        c47313c7.b(this, viewFindViewById3);
        ImageView imageView2 = (ImageView) view.findViewById(R.id.back_button);
        C47313c c47313c8 = this.f98935x0;
        n<Object> nVar8 = nVarArr[4];
        c47313c8.b(this, imageView2);
        ImageView imageView3 = (ImageView) view.findViewById(R.id.flash_button);
        C47313c c47313c9 = this.f98934w0;
        n<Object> nVar9 = nVarArr[3];
        c47313c9.b(this, imageView3);
        Button button = (Button) view.findViewById(R.id.rescan_button);
        C47313c c47313c10 = this.f98933v0;
        n<Object> nVar10 = nVarArr[2];
        c47313c10.b(this, button);
        Button button2 = (Button) view.findViewById(R.id.confirm_button);
        C47313c c47313c11 = this.f98932u0;
        n<Object> nVar11 = nVarArr[1];
        c47313c11.b(this, button2);
        Button button3 = (Button) view.findViewById(R.id.permission_open_button);
        C47313c c47313c12 = this.f98931t0;
        n<Object> nVar12 = nVarArr[0];
        c47313c12.b(this, button3);
        Button button4 = (Button) view.findViewById(R.id.scanner_failure_button);
        C47313c c47313c13 = this.f98922F0;
        n<Object> nVar13 = nVarArr[12];
        c47313c13.b(this, button4);
        n<Object> nVar14 = nVarArr[4];
        final int i12 = 0;
        ((ImageView) c47313c8.a()).setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.barcode_scanner_impl.presentation.barcodescanner.b

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ BarcodeScannerFragment f98950c;

            {
                this.f98950c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                BarcodeScannerFragment barcodeScannerFragment = this.f98950c;
                switch (i12) {
                    case 0:
                        BarcodeScannerFragment.a aVar = BarcodeScannerFragment.f98915I0;
                        barcodeScannerFragment.q5().accept(InterfaceC25648a.e.f57372a);
                        break;
                    case 1:
                        BarcodeScannerFragment.a aVar2 = BarcodeScannerFragment.f98915I0;
                        barcodeScannerFragment.q5().accept(InterfaceC25648a.g.f57374a);
                        break;
                    case 2:
                        BarcodeScannerFragment.a aVar3 = BarcodeScannerFragment.f98915I0;
                        barcodeScannerFragment.q5().accept(InterfaceC25648a.i.f57376a);
                        break;
                    case 3:
                        BarcodeScannerFragment.a aVar4 = BarcodeScannerFragment.f98915I0;
                        barcodeScannerFragment.q5().accept(InterfaceC25648a.f.f57373a);
                        break;
                    default:
                        BarcodeScannerFragment.a aVar5 = BarcodeScannerFragment.f98915I0;
                        barcodeScannerFragment.q5().accept(InterfaceC25648a.e.f57372a);
                        break;
                }
            }
        });
        n<Object> nVar15 = nVarArr[3];
        final int i13 = 1;
        ((ImageView) c47313c9.a()).setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.barcode_scanner_impl.presentation.barcodescanner.b

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ BarcodeScannerFragment f98950c;

            {
                this.f98950c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                BarcodeScannerFragment barcodeScannerFragment = this.f98950c;
                switch (i13) {
                    case 0:
                        BarcodeScannerFragment.a aVar = BarcodeScannerFragment.f98915I0;
                        barcodeScannerFragment.q5().accept(InterfaceC25648a.e.f57372a);
                        break;
                    case 1:
                        BarcodeScannerFragment.a aVar2 = BarcodeScannerFragment.f98915I0;
                        barcodeScannerFragment.q5().accept(InterfaceC25648a.g.f57374a);
                        break;
                    case 2:
                        BarcodeScannerFragment.a aVar3 = BarcodeScannerFragment.f98915I0;
                        barcodeScannerFragment.q5().accept(InterfaceC25648a.i.f57376a);
                        break;
                    case 3:
                        BarcodeScannerFragment.a aVar4 = BarcodeScannerFragment.f98915I0;
                        barcodeScannerFragment.q5().accept(InterfaceC25648a.f.f57373a);
                        break;
                    default:
                        BarcodeScannerFragment.a aVar5 = BarcodeScannerFragment.f98915I0;
                        barcodeScannerFragment.q5().accept(InterfaceC25648a.e.f57372a);
                        break;
                }
            }
        });
        n<Object> nVar16 = nVarArr[2];
        final int i14 = 2;
        ((Button) c47313c10.a()).setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.barcode_scanner_impl.presentation.barcodescanner.b

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ BarcodeScannerFragment f98950c;

            {
                this.f98950c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                BarcodeScannerFragment barcodeScannerFragment = this.f98950c;
                switch (i14) {
                    case 0:
                        BarcodeScannerFragment.a aVar = BarcodeScannerFragment.f98915I0;
                        barcodeScannerFragment.q5().accept(InterfaceC25648a.e.f57372a);
                        break;
                    case 1:
                        BarcodeScannerFragment.a aVar2 = BarcodeScannerFragment.f98915I0;
                        barcodeScannerFragment.q5().accept(InterfaceC25648a.g.f57374a);
                        break;
                    case 2:
                        BarcodeScannerFragment.a aVar3 = BarcodeScannerFragment.f98915I0;
                        barcodeScannerFragment.q5().accept(InterfaceC25648a.i.f57376a);
                        break;
                    case 3:
                        BarcodeScannerFragment.a aVar4 = BarcodeScannerFragment.f98915I0;
                        barcodeScannerFragment.q5().accept(InterfaceC25648a.f.f57373a);
                        break;
                    default:
                        BarcodeScannerFragment.a aVar5 = BarcodeScannerFragment.f98915I0;
                        barcodeScannerFragment.q5().accept(InterfaceC25648a.e.f57372a);
                        break;
                }
            }
        });
        n<Object> nVar17 = nVarArr[1];
        final int i15 = 3;
        ((Button) c47313c11.a()).setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.barcode_scanner_impl.presentation.barcodescanner.b

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ BarcodeScannerFragment f98950c;

            {
                this.f98950c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                BarcodeScannerFragment barcodeScannerFragment = this.f98950c;
                switch (i15) {
                    case 0:
                        BarcodeScannerFragment.a aVar = BarcodeScannerFragment.f98915I0;
                        barcodeScannerFragment.q5().accept(InterfaceC25648a.e.f57372a);
                        break;
                    case 1:
                        BarcodeScannerFragment.a aVar2 = BarcodeScannerFragment.f98915I0;
                        barcodeScannerFragment.q5().accept(InterfaceC25648a.g.f57374a);
                        break;
                    case 2:
                        BarcodeScannerFragment.a aVar3 = BarcodeScannerFragment.f98915I0;
                        barcodeScannerFragment.q5().accept(InterfaceC25648a.i.f57376a);
                        break;
                    case 3:
                        BarcodeScannerFragment.a aVar4 = BarcodeScannerFragment.f98915I0;
                        barcodeScannerFragment.q5().accept(InterfaceC25648a.f.f57373a);
                        break;
                    default:
                        BarcodeScannerFragment.a aVar5 = BarcodeScannerFragment.f98915I0;
                        barcodeScannerFragment.q5().accept(InterfaceC25648a.e.f57372a);
                        break;
                }
            }
        });
        n<Object> nVar18 = nVarArr[12];
        final int i16 = 4;
        ((Button) c47313c13.a()).setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.barcode_scanner_impl.presentation.barcodescanner.b

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ BarcodeScannerFragment f98950c;

            {
                this.f98950c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                BarcodeScannerFragment barcodeScannerFragment = this.f98950c;
                switch (i16) {
                    case 0:
                        BarcodeScannerFragment.a aVar = BarcodeScannerFragment.f98915I0;
                        barcodeScannerFragment.q5().accept(InterfaceC25648a.e.f57372a);
                        break;
                    case 1:
                        BarcodeScannerFragment.a aVar2 = BarcodeScannerFragment.f98915I0;
                        barcodeScannerFragment.q5().accept(InterfaceC25648a.g.f57374a);
                        break;
                    case 2:
                        BarcodeScannerFragment.a aVar3 = BarcodeScannerFragment.f98915I0;
                        barcodeScannerFragment.q5().accept(InterfaceC25648a.i.f57376a);
                        break;
                    case 3:
                        BarcodeScannerFragment.a aVar4 = BarcodeScannerFragment.f98915I0;
                        barcodeScannerFragment.q5().accept(InterfaceC25648a.f.f57373a);
                        break;
                    default:
                        BarcodeScannerFragment.a aVar5 = BarcodeScannerFragment.f98915I0;
                        barcodeScannerFragment.q5().accept(InterfaceC25648a.e.f57372a);
                        break;
                }
            }
        });
        n<Object> nVar19 = nVarArr[5];
        PreviewView previewView2 = (PreviewView) c47313c.a();
        ExecutorService executorService = this.f98930s0;
        com.avito.android.barcode_scanner_impl.presentation.e eVar = new com.avito.android.barcode_scanner_impl.presentation.e(previewView2, executorService != null ? executorService : null, this, new com.avito.android.barcode_scanner_impl.presentation.barcodescanner.c(this), new com.avito.android.barcode_scanner_impl.presentation.barcodescanner.d(this), new com.avito.android.barcode_scanner_impl.presentation.barcodescanner.e(this));
        C47313c c47313c14 = this.f98923G0;
        n<Object> nVar20 = nVarArr[13];
        c47313c14.b(this, eVar);
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f98927p0;
        com.avito.android.analytics.screens.mvi.a.g(this, screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null, q5(), c.f98939l, new d(1, this, BarcodeScannerFragment.class, "render", "render(Lcom/avito/android/barcode_scanner_impl/presentation/barcodescanner/mvi/entity/BarcodeScannerState;)V", 0));
        com.avito.android.arch.mvi.android.f.a(q5(), getViewLifecycleOwner(), Lifecycle.State.f46681d, new e(1, this, BarcodeScannerFragment.class, "handleEvent", "handleEvent(Lcom/avito/android/barcode_scanner_impl/presentation/barcodescanner/mvi/entity/BarcodeScannerOneTimeEvent;)V", 0), f.f98940l);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@Y61.l Bundle bundle) {
        D.f90335a.getClass();
        F fA2 = D.a.a();
        Bundle bundleRequireArguments = requireArguments();
        BarcodeScannerParams barcodeScannerParams = (BarcodeScannerParams) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) bundleRequireArguments.getParcelable("BARCODE_SCANNER_PARAMS_KEY", BarcodeScannerParams.class) : bundleRequireArguments.getParcelable("BARCODE_SCANNER_PARAMS_KEY"));
        if (barcodeScannerParams == null) {
            BarcodeScannerParams.f99049e.getClass();
            barcodeScannerParams = new BarcodeScannerParams(com.avito.android.printable_text.a.a(R.string.scanner_description_default), BarcodeScannerType.f99054c, false);
        }
        com.avito.android.barcode_scanner_impl.di.j.a().a(barcodeScannerParams, new C28478k(BarcodeScannerScreen.f98869d, s.c(this), null, 4, null), (com.avito.android.barcode_scanner_impl.di.c) C29972i.a(C29972i.b(this), com.avito.android.barcode_scanner_impl.di.c.class)).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f98927p0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
    }

    public final com.avito.android.barcode_scanner_impl.presentation.barcodescanner.j q5() {
        return (com.avito.android.barcode_scanner_impl.presentation.barcodescanner.j) this.f98926o0.getValue();
    }
}
