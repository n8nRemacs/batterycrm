package com.avito.android.iac_problems.impl_module.problems_bottom_sheet;

import Ai.DialogInterfaceOnDismissListenerC13035a;
import Cd.C13243a;
import Fc1.D3;
import Y41.p;
import android.app.Dialog;
import android.os.Bundle;
import androidx.compose.runtime.A;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.runtime.internal.P;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import androidx.view.InterfaceC22969B;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.iac_problems.public_module.deeplink.IacMiuiDisplayOnLockedScreenPermissionLink;
import com.avito.android.ui.fragments.BaseDialogFragment;
import com.avito.android.util.C35835l0;
import com.avito.android.util.InterfaceC35745a5;
import eM.InterfaceC40021a;
import io.reactivex.rxjava3.kotlin.A1;
import java.util.concurrent.atomic.AtomicInteger;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import kv.C43501a;
import z1.AbstractC50339a;

/* compiled from: IacProblemsBottomSheetFragment.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/iac_problems/impl_module/problems_bottom_sheet/IacProblemsBottomSheetFragment;", "Lcom/avito/android/ui/fragments/BaseDialogFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_iac-problems_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class IacProblemsBottomSheetFragment extends BaseDialogFragment implements InterfaceC28477j.b {

    /* renamed from: t0, reason: collision with root package name */
    @Y61.k
    public static final a f168849t0 = new a(null);

    /* renamed from: u0, reason: collision with root package name */
    @Y61.k
    public static final AtomicInteger f168850u0 = new AtomicInteger(0);

    /* renamed from: h0, reason: collision with root package name */
    @Inject
    public m f168851h0;

    /* renamed from: i0, reason: collision with root package name */
    @Y61.k
    public final O0 f168852i0;

    /* renamed from: j0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f168853j0;

    /* renamed from: k0, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f168854k0;

    /* renamed from: l0, reason: collision with root package name */
    @Inject
    public InterfaceC35745a5 f168855l0;

    /* renamed from: m0, reason: collision with root package name */
    @Inject
    public com.avito.android.iac_problems.impl_module.problems_bottom_sheet.e f168856m0;

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public InterfaceC28373a f168857n0;

    /* renamed from: o0, reason: collision with root package name */
    @Y61.l
    public com.avito.android.lib.design.bottom_sheet.d f168858o0;

    /* renamed from: p0, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f168859p0;

    /* renamed from: q0, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f168860q0;

    /* renamed from: r0, reason: collision with root package name */
    public boolean f168861r0;

    /* renamed from: s0, reason: collision with root package name */
    public boolean f168862s0;

    /* compiled from: IacProblemsBottomSheetFragment.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/avito/android/iac_problems/impl_module/problems_bottom_sheet/IacProblemsBottomSheetFragment$a;", "", "<init>", "()V", "", "ARG_REQUEST_KEY", "Ljava/lang/String;", "ARG_SCENARIO", "KEY_IAC_PROBLEMS_DIALOG_ACTION", "TAG", "Ljava/util/concurrent/atomic/AtomicInteger;", "uniqueCounter", "Ljava/util/concurrent/atomic/AtomicInteger;", "_avito_iac-problems_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: IacProblemsBottomSheetFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends N implements Y41.a<String> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final String invoke() {
            String string = IacProblemsBottomSheetFragment.this.requireArguments().getString("scenario_key");
            if (string != null) {
                return string;
            }
            throw new IllegalStateException("Empty iac problem scenario");
        }
    }

    /* compiled from: IacProblemsBottomSheetFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkv/a;", "resultEvent", "Lkotlin/G0;", "invoke", "(Lkv/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.l<C43501a, G0> {
        public c() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(C43501a c43501a) {
            if (c43501a.f413261b instanceof IacMiuiDisplayOnLockedScreenPermissionLink.b.C5003b) {
                a aVar = IacProblemsBottomSheetFragment.f168849t0;
                ((l) IacProblemsBottomSheetFragment.this.f168852i0.getValue()).accept(InterfaceC40021a.d.f395119a);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: IacProblemsBottomSheetFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements p<A, Integer, G0> {
        public d() {
            super(2);
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            A a13 = a12;
            if ((num.intValue() & 11) == 2 && a13.c()) {
                a13.f();
            } else {
                a aVar = IacProblemsBottomSheetFragment.f168849t0;
                IacProblemsBottomSheetFragment iacProblemsBottomSheetFragment = IacProblemsBottomSheetFragment.this;
                com.avito.android.iac_problems.impl_module.problems_bottom_sheet.view.j.a((l) iacProblemsBottomSheetFragment.f168852i0.getValue(), new com.avito.android.iac_problems.impl_module.problems_bottom_sheet.h(iacProblemsBottomSheetFragment), a13, 64);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: IacProblemsBottomSheetFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.a<G0> {
        public e() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            IacProblemBottomSheetDialogResult iacProblemBottomSheetDialogResult = IacProblemBottomSheetDialogResult.f168845b;
            a aVar = IacProblemsBottomSheetFragment.f168849t0;
            IacProblemsBottomSheetFragment.this.f5(iacProblemBottomSheetDialogResult);
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f168867l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Y41.a aVar) {
            super(0);
            this.f168867l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f168867l);
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
            return IacProblemsBottomSheetFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ g f168869l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(g gVar) {
            super(0);
            this.f168869l = gVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f168869l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f168870l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f168870l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f168870l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f168871l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f168871l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f168871l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: IacProblemsBottomSheetFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/iac_problems/impl_module/problems_bottom_sheet/l;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/iac_problems/impl_module/problems_bottom_sheet/l;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class k extends N implements Y41.a<l> {
        public k() {
            super(0);
        }

        @Override // Y41.a
        public final l invoke() {
            m mVar = IacProblemsBottomSheetFragment.this.f168851h0;
            if (mVar == null) {
                mVar = null;
            }
            return (l) mVar.get();
        }
    }

    public IacProblemsBottomSheetFragment() {
        super(0, 1, null);
        f fVar = new f(new k());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new h(new g()));
        this.f168852i0 = new O0(m0.f406844a.b(l.class), new i(interfaceC42726CB), fVar, new j(interfaceC42726CB));
        this.f168859p0 = C42727D.c(new b());
        this.f168860q0 = new io.reactivex.rxjava3.disposables.c();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0051  */
    @Override // com.avito.android.ui.fragments.BaseDialogFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e5(@Y61.l android.os.Bundle r10) {
        /*
            r9 = this;
            com.avito.android.analytics.screens.D$a r10 = com.avito.android.analytics.screens.D.f90335a
            r10.getClass()
            com.avito.android.analytics.screens.F r10 = com.avito.android.analytics.screens.D.a.a()
            com.avito.android.iac_problems.impl_module.problems_bottom_sheet.di.b$b r0 = com.avito.android.iac_problems.impl_module.problems_bottom_sheet.di.a.a()
            androidx.fragment.app.m r1 = r9.requireActivity()
            androidx.fragment.app.m r2 = r9.requireActivity()
            com.avito.android.analytics.screens.r r5 = com.avito.android.analytics.screens.s.b(r9)
            kotlin.C r3 = r9.f168859p0
            java.lang.Object r3 = r3.getValue()
            r4 = r3
            java.lang.String r4 = (java.lang.String) r4
            com.avito.android.K r3 = com.avito.android.di.C29972i.b(r9)
            java.lang.Class<com.avito.android.iac_problems.impl_module.problems_bottom_sheet.di.g> r6 = com.avito.android.iac_problems.impl_module.problems_bottom_sheet.di.g.class
            com.avito.android.di.h r3 = com.avito.android.di.C29972i.a(r3, r6)
            r6 = r3
            com.avito.android.iac_problems.impl_module.problems_bottom_sheet.di.g r6 = (com.avito.android.iac_problems.impl_module.problems_bottom_sheet.di.g) r6
            androidx.fragment.app.Fragment r3 = r9.getParentFragment()
            r8 = 0
            if (r3 == 0) goto L3c
            cv.a r3 = cv.c.b(r3)
        L3a:
            r7 = r3
            goto L56
        L3c:
            androidx.fragment.app.m r3 = r9.l1()
            if (r3 == 0) goto L51
            boolean r7 = r3 instanceof androidx.appcompat.app.m
            if (r7 == 0) goto L49
            androidx.appcompat.app.m r3 = (androidx.appcompat.app.m) r3
            goto L4a
        L49:
            r3 = r8
        L4a:
            if (r3 == 0) goto L51
            cv.a r3 = cv.c.a(r3)
            goto L3a
        L51:
            cv.a r3 = cv.c.b(r9)
            goto L3a
        L56:
            r3 = r9
            com.avito.android.iac_problems.impl_module.problems_bottom_sheet.di.b r0 = r0.a(r1, r2, r3, r4, r5, r6, r7)
            r0.a(r9)
            com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker r0 = r9.f168853j0
            if (r0 == 0) goto L63
            goto L64
        L63:
            r0 = r8
        L64:
            long r1 = r10.b()
            r0.a(r1)
            com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker r10 = r9.f168853j0
            if (r10 == 0) goto L70
            r8 = r10
        L70:
            r8.e()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.iac_problems.impl_module.problems_bottom_sheet.IacProblemsBottomSheetFragment.e5(android.os.Bundle):void");
    }

    public final void f5(IacProblemBottomSheetDialogResult iacProblemBottomSheetDialogResult) {
        if (this.f168862s0 && iacProblemBottomSheetDialogResult == IacProblemBottomSheetDialogResult.f168845b) {
            return;
        }
        String string = requireArguments().getString("request_key");
        if (string == null) {
            throw new IllegalArgumentException("Request key is not provided");
        }
        Bundle bundle = new Bundle(1);
        bundle.putParcelable("key_iac_problems_dialog_action", iacProblemBottomSheetDialogResult);
        getParentFragmentManager().o0(bundle, string);
        if (iacProblemBottomSheetDialogResult == IacProblemBottomSheetDialogResult.f168845b) {
            this.f168862s0 = true;
        }
    }

    @Override // com.avito.android.ui.fragments.BaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(@Y61.l Bundle bundle) {
        super.onCreate(bundle);
        com.avito.android.deeplink_handler.handler.composite.a aVar = this.f168854k0;
        if (aVar == null) {
            aVar = null;
        }
        this.f168860q0.b(A1.h(aVar.d9(), null, new c(), 3));
    }

    @Override // androidx.fragment.app.DialogFragment
    @Y61.k
    public final Dialog onCreateDialog(@Y61.l Bundle bundle) {
        com.avito.android.lib.design.bottom_sheet.d dVar = new com.avito.android.lib.design.bottom_sheet.d(requireContext(), 0, 2, null);
        com.avito.android.lib.design.bottom_sheet.d.M(dVar, null, false, true, 7);
        dVar.T();
        dVar.S(C35835l0.g(dVar.getContext()).y);
        ComposeView composeView = new ComposeView(dVar.getContext(), null, 0, 6, null);
        composeView.setContent(new C22096n(-986203150, new d(), true));
        dVar.setContentView(composeView);
        dVar.setOnCancelListener(new D3(this, 11));
        dVar.setOnDismissListener(new DialogInterfaceOnDismissListenerC13035a(this, 19));
        dVar.Q(new e());
        this.f168858o0 = dVar;
        return dVar;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.f168860q0.e();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        ScreenPerformanceTracker screenPerformanceTracker = this.f168853j0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.d();
        if (this.f168861r0) {
            ((l) this.f168852i0.getValue()).accept(InterfaceC40021a.e.f395120a);
        } else {
            this.f168861r0 = true;
        }
    }
}
