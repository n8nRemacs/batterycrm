package com.avito.android.publish.scanner;

import Cd.C13243a;
import Id0.InterfaceC14061a;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.compose.runtime.internal.P;
import androidx.core.graphics.C22771k;
import androidx.core.view.C22823h0;
import androidx.core.view.J0;
import androidx.core.view.M;
import androidx.fragment.app.Fragment;
import androidx.view.C22984Q;
import androidx.view.InterfaceC22969B;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import com.avito.android.R;
import com.avito.android.ab_tests.groups.SimpleTestGroupWithNone;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.bottom_navigation.RunnableC28882d;
import com.avito.android.di.C29972i;
import com.avito.android.photo_camera_view.A;
import com.avito.android.photo_camera_view.CameraPresenterState;
import com.avito.android.photo_camera_view.InterfaceC33173d;
import com.avito.android.photo_picker.CameraType;
import com.avito.android.publish.view.result_handler.PublishResultReceiverFragment;
import com.avito.android.util.A1;
import com.avito.android.util.C35968w3;
import com.avito.android.util.D6;
import com.avito.android.util.InterfaceC35845m2;
import j.InterfaceC42156l;
import java.util.ArrayList;
import javax.inject.Inject;
import javax.inject.Provider;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.Y;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import z1.AbstractC50339a;
import ze0.InterfaceC50553a;

/* compiled from: ScannerFragment.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0001\bB\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/avito/android/publish/scanner/ScannerFragment;", "Lcom/avito/android/publish/view/result_handler/PublishResultReceiverFragment;", "Lcom/avito/android/photo_camera_view/d$b;", "Lcom/avito/android/ui/fragments/c;", "LId0/a;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class ScannerFragment extends PublishResultReceiverFragment implements InterfaceC33173d.b, com.avito.android.ui.fragments.c, InterfaceC14061a, InterfaceC28477j.b {

    /* renamed from: D0, reason: collision with root package name */
    public static final /* synthetic */ kotlin.reflect.n<Object>[] f239116D0 = {m0.f406844a.e(new Y(ScannerFragment.class, "scannerParams", "getScannerParams()Lcom/avito/android/publish/scanner/ScannerParams;", 0))};

    /* renamed from: A0, reason: collision with root package name */
    @Y61.k
    public final Object f239117A0;

    /* renamed from: B0, reason: collision with root package name */
    @InterfaceC42156l
    public int f239118B0;

    /* renamed from: C0, reason: collision with root package name */
    @InterfaceC42156l
    public int f239119C0;

    /* renamed from: o0, reason: collision with root package name */
    @Y61.k
    public final C35968w3 f239120o0 = new C35968w3(this);

    /* renamed from: p0, reason: collision with root package name */
    @Inject
    public InterfaceC28373a f239121p0;

    /* renamed from: q0, reason: collision with root package name */
    @Inject
    public InterfaceC33173d f239122q0;

    /* renamed from: r0, reason: collision with root package name */
    @Inject
    public com.avito.android.device_orientation.i f239123r0;

    /* renamed from: s0, reason: collision with root package name */
    @Inject
    public InterfaceC35845m2 f239124s0;

    /* renamed from: t0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f239125t0;

    /* renamed from: u0, reason: collision with root package name */
    @Inject
    public u3.l<SimpleTestGroupWithNone> f239126u0;

    /* renamed from: v0, reason: collision with root package name */
    @Inject
    public Provider<r> f239127v0;

    /* renamed from: w0, reason: collision with root package name */
    @Y61.k
    public final O0 f239128w0;

    /* renamed from: x0, reason: collision with root package name */
    @Y61.k
    public final Handler f239129x0;

    /* renamed from: y0, reason: collision with root package name */
    @Y61.l
    public q f239130y0;

    /* renamed from: z0, reason: collision with root package name */
    @Y61.l
    public o f239131z0;

    /* compiled from: ScannerFragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/publish/scanner/ScannerFragment$a;", "", "<init>", "()V", "", "SCANNER_REQUEST_KEY", "Ljava/lang/String;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f239133l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Y41.a aVar) {
            super(0);
            this.f239133l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f239133l);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "Cd/i", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.a<Fragment> {
        public d() {
            super(0);
        }

        @Override // Y41.a
        public final Fragment invoke() {
            return ScannerFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ d f239135l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(d dVar) {
            super(0);
            this.f239135l = dVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f239135l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f239136l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f239136l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f239136l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f239137l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f239137l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f239137l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: ScannerFragment.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class h extends N implements Y41.a<Integer> {
        public h() {
            super(0);
        }

        @Override // Y41.a
        public final Integer invoke() {
            Bundle arguments = ScannerFragment.this.getArguments();
            if (arguments != null) {
                return Integer.valueOf(arguments.getInt("step_index"));
            }
            throw new IllegalArgumentException("Required value was null.");
        }
    }

    /* compiled from: ScannerFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/publish/scanner/r;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/publish/scanner/r;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<r> {
        public i() {
            super(0);
        }

        @Override // Y41.a
        public final r invoke() {
            Provider<r> provider = ScannerFragment.this.f239127v0;
            if (provider == null) {
                provider = null;
            }
            return provider.get();
        }
    }

    static {
        new a(null);
    }

    public ScannerFragment() {
        c cVar = new c(new i());
        d dVar = new d();
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.f406616d;
        InterfaceC42726C interfaceC42726CB = C42727D.b(lazyThreadSafetyMode, new e(dVar));
        this.f239128w0 = new O0(m0.f406844a.b(r.class), new f(interfaceC42726CB), cVar, new g(interfaceC42726CB));
        this.f239129x0 = new Handler();
        this.f239117A0 = C42727D.b(lazyThreadSafetyMode, new h());
    }

    @Override // com.avito.android.photo_camera_view.InterfaceC33173d.b
    public final void H2() {
        InterfaceC35845m2 interfaceC35845m2 = this.f239124s0;
        if (interfaceC35845m2 == null) {
            interfaceC35845m2 = null;
        }
        startActivity(interfaceC35845m2.i());
    }

    @Override // com.avito.android.photo_camera_view.InterfaceC33173d.b
    public final void Q4() {
        InterfaceC35845m2 interfaceC35845m2 = this.f239124s0;
        if (interfaceC35845m2 == null) {
            interfaceC35845m2 = null;
        }
        Intent intentO = interfaceC35845m2.o();
        com.avito.android.publish.view.result_handler.a aVar = this.f245673n0;
        (aVar != null ? aVar : null).a(l1(), this, intentO, 1);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    /* renamed from: h5 */
    public final boolean getF304598h0() {
        return false;
    }

    @Override // com.avito.android.ui.fragments.c
    public final boolean i0() {
        s5().accept(InterfaceC50553a.C12961a.f444109a);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public final void onAttach(@Y61.k Context context) {
        super.onAttach(context);
        requireActivity().setRequestedOrientation(1);
        o oVar = context instanceof o ? (o) context : null;
        if (oVar == null) {
            throw new ClassCastException();
        }
        this.f239131z0 = oVar;
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.l
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f239125t0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        u3.l<SimpleTestGroupWithNone> lVar = this.f239126u0;
        return layoutInflater.inflate((lVar != null ? lVar : null).f439745a.f439749b.b() ? R.layout.scanner_re23 : R.layout.scanner, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        InterfaceC33173d interfaceC33173d = this.f239122q0;
        if (interfaceC33173d == null) {
            interfaceC33173d = null;
        }
        interfaceC33173d.m();
        this.f239129x0.removeCallbacksAndMessages(null);
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f239130y0 = null;
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onDetach() {
        requireActivity().setRequestedOrientation(-1);
        this.f239131z0 = null;
        super.onDetach();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        com.avito.android.device_orientation.i iVar = this.f239123r0;
        if (iVar == null) {
            iVar = null;
        }
        iVar.stop();
        super.onPause();
        Window window = requireActivity().getWindow();
        window.setStatusBarColor(this.f239118B0);
        window.setNavigationBarColor(this.f239119C0);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onRequestPermissionsResult(int i12, @Y61.k String[] strArr, @Y61.k int[] iArr) {
        InterfaceC33173d interfaceC33173d = this.f239122q0;
        if (interfaceC33173d == null) {
            interfaceC33173d = null;
        }
        interfaceC33173d.l(i12, strArr, iArr);
    }

    @Override // com.avito.android.publish.view.result_handler.PublishResultReceiverFragment, com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        com.avito.android.device_orientation.i iVar = this.f239123r0;
        if (iVar == null) {
            iVar = null;
        }
        iVar.start();
        View viewRequireView = requireView();
        if (viewRequireView.isAttachedToWindow() || viewRequireView.isAttachedToWindow()) {
            C22823h0.A(viewRequireView);
        } else {
            viewRequireView.addOnAttachStateChangeListener(new b(viewRequireView));
        }
        Window window = requireActivity().getWindow();
        window.setStatusBarColor(0);
        window.setNavigationBarColor(0);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(@Y61.k Bundle bundle) {
        super.onSaveInstanceState(bundle);
        InterfaceC33173d interfaceC33173d = this.f239122q0;
        if (interfaceC33173d == null) {
            interfaceC33173d = null;
        }
        bundle.putParcelable("camera_presenter_state", interfaceC33173d.getState());
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        InterfaceC33173d interfaceC33173d = this.f239122q0;
        if (interfaceC33173d == null) {
            interfaceC33173d = null;
        }
        interfaceC33173d.d(this);
        InterfaceC33173d interfaceC33173d2 = this.f239122q0;
        (interfaceC33173d2 != null ? interfaceC33173d2 : null).a();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        InterfaceC33173d interfaceC33173d = this.f239122q0;
        if (interfaceC33173d == null) {
            interfaceC33173d = null;
        }
        interfaceC33173d.c0();
        InterfaceC33173d interfaceC33173d2 = this.f239122q0;
        (interfaceC33173d2 != null ? interfaceC33173d2 : null).g();
        super.onStop();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) {
        super.onViewCreated(view, bundle);
        View viewRequireView = requireView();
        final View viewFindViewById = viewRequireView.findViewById(R.id.close_button);
        ViewGroup.LayoutParams layoutParams = viewFindViewById.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        final int i12 = marginLayoutParams != null ? marginLayoutParams.topMargin : 0;
        final View viewFindViewById2 = viewRequireView.findViewById(R.id.camera_buttons_container);
        ViewGroup.LayoutParams layoutParams2 = viewFindViewById2.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
        final int i13 = marginLayoutParams2 != null ? marginLayoutParams2.bottomMargin : 0;
        C22823h0.K(viewRequireView, new M() { // from class: com.avito.android.publish.scanner.j
            @Override // androidx.core.view.M
            public final J0 h(View view2, J0 j02) {
                kotlin.reflect.n<Object>[] nVarArr = ScannerFragment.f239116D0;
                com.avito.android.lib.util.i.f181373a.getClass();
                C22771k c22771kE = j02.e(com.avito.android.lib.util.i.f181375c);
                D6.c(viewFindViewById, null, Integer.valueOf(i12 + c22771kE.f44776b), null, null, 13);
                D6.c(viewFindViewById2, null, null, null, Integer.valueOf(i13 + c22771kE.f44778d), 7);
                return J0.f44939b;
            }
        });
        C22823h0.A(requireView());
        View viewFindViewById3 = view.findViewById(R.id.search_by_image);
        InterfaceC28373a interfaceC28373a = this.f239121p0;
        if (interfaceC28373a == null) {
            interfaceC28373a = null;
        }
        q qVar = new q(viewFindViewById3, interfaceC28373a);
        ScreenPerformanceTracker screenPerformanceTracker = this.f239125t0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.m(screenPerformanceTracker.getF90716d());
        r5();
        qVar.f239263a.setText(R.string.imei_scanner_title);
        qVar.f239264b.setText(R.string.imei_scanner_caption);
        qVar.f239265c.setText(R.string.imei_scanner_help_text);
        qVar.f239266d.setImageResource(R.drawable.bg_imei_scanner_frame);
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f239125t0;
        if (screenPerformanceTracker2 == null) {
            screenPerformanceTracker2 = null;
        }
        ScreenPerformanceTracker.a.c(screenPerformanceTracker2, null, null, null, 7);
        this.f239130y0 = qVar;
        InterfaceC33173d interfaceC33173d = this.f239122q0;
        if (interfaceC33173d == null) {
            interfaceC33173d = null;
        }
        View viewFindViewById4 = view.findViewById(R.id.camera_item_view);
        InterfaceC33173d interfaceC33173d2 = this.f239122q0;
        if (interfaceC33173d2 == null) {
            interfaceC33173d2 = null;
        }
        interfaceC33173d.j(new A(viewFindViewById4, interfaceC33173d2));
        C43259k.d(C22984Q.a(getViewLifecycleOwner()), null, null, new l(this, null), 3);
        Window window = requireActivity().getWindow();
        this.f239118B0 = window.getStatusBarColor();
        this.f239119C0 = window.getNavigationBarColor();
        ScreenPerformanceTracker screenPerformanceTracker3 = this.f239125t0;
        (screenPerformanceTracker3 != null ? screenPerformanceTracker3 : null).d();
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, kotlin.C] */
    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@Y61.l Bundle bundle) {
        D.f90335a.getClass();
        F fA2 = D.a.a();
        CameraType.BackCamera backCamera = CameraType.BackCamera.f218740c;
        CameraPresenterState cameraPresenterState = bundle != null ? (CameraPresenterState) bundle.getParcelable("camera_presenter_state") : null;
        Display defaultDisplay = requireActivity().getWindowManager().getDefaultDisplay();
        Resources resources = getResources();
        u80.c cVar = new u80.c(r5().f239143b.f219311c, r5().f239143b.f219310b);
        r5();
        F70.a aVar = new F70.a(defaultDisplay, resources, cVar, backCamera, false, cameraPresenterState);
        ScannerParams scannerParamsR5 = r5();
        com.avito.android.analytics.screens.r rVarC = com.avito.android.analytics.screens.s.c(this);
        r5();
        com.avito.android.publish.scanner.di.a.a().a((com.avito.android.publish.scanner.di.e) C29972i.a(C29972i.b(this), com.avito.android.publish.scanner.di.e.class), aVar, this, r5(), new C28478k(scannerParamsR5.f239144c, rVarC, "imeiScanner"), ((Number) this.f239117A0.getValue()).intValue()).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f239125t0;
        (screenPerformanceTracker != null ? screenPerformanceTracker : null).a(fA2.b());
    }

    @Override // com.avito.android.publish.view.result_handler.PublishResultReceiverFragment
    public final void q5(int i12, int i13, @Y61.l Intent intent) {
        if (i13 == -1 && i12 == 1 && intent != null) {
            A1.f318515a.getClass();
            ArrayList arrayListA = A1.a(intent);
            if (arrayListA.isEmpty()) {
                return;
            }
            this.f239129x0.post(new RunnableC28882d(26, this, arrayListA));
        }
    }

    @Y61.k
    public final ScannerParams r5() {
        return (ScannerParams) this.f239120o0.getValue(this, f239116D0[0]);
    }

    public final r s5() {
        return (r) this.f239128w0.getValue();
    }

    /* compiled from: View.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"androidx/core/view/r0", "Landroid/view/View$OnAttachStateChangeListener;", "core-ktx_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements View.OnAttachStateChangeListener {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ View f239132b;

        public b(View view) {
            this.f239132b = view;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
            this.f239132b.removeOnAttachStateChangeListener(this);
            C22823h0.A(view);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
        }
    }
}
