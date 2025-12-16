package com.avito.android.sbc.create.mvi;

import Cd.C13243a;
import Uo0.e;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.ActivityC22955m;
import androidx.fragment.app.C22960s;
import androidx.fragment.app.Fragment;
import androidx.view.C22984Q;
import androidx.view.InterfaceC22969B;
import androidx.view.P0;
import com.avito.android.R;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.ui.fragments.BaseFragment;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.InterfaceC35845m2;
import i.b;
import io.reactivex.rxjava3.internal.operators.observable.A1;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.text.C43066x;
import kotlinx.coroutines.C43259k;
import w50.InterfaceC49447a;
import z1.AbstractC50339a;

/* compiled from: CreateDiscountDispatchFragment.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/sbc/create/mvi/CreateDiscountDispatchFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CreateDiscountDispatchFragment extends BaseFragment implements InterfaceC28477j.b {

    /* renamed from: G0, reason: collision with root package name */
    @Y61.k
    public static final a f259243G0 = new a(null);

    /* renamed from: A0, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f259244A0;

    /* renamed from: B0, reason: collision with root package name */
    public M0 f259245B0;

    /* renamed from: C0, reason: collision with root package name */
    public boolean f259246C0;

    /* renamed from: D0, reason: collision with root package name */
    public boolean f259247D0;

    /* renamed from: E0, reason: collision with root package name */
    @Y61.k
    public final androidx.view.result.h<Intent> f259248E0;

    /* renamed from: F0, reason: collision with root package name */
    @Y61.k
    public final c f259249F0;

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public V0 f259250n0;

    /* renamed from: o0, reason: collision with root package name */
    @Y61.k
    public final androidx.view.O0 f259251o0;

    /* renamed from: p0, reason: collision with root package name */
    @Inject
    public InterfaceC28373a f259252p0;

    /* renamed from: q0, reason: collision with root package name */
    @Inject
    public InterfaceC35745a5 f259253q0;

    /* renamed from: r0, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f259254r0;

    /* renamed from: s0, reason: collision with root package name */
    @Inject
    public InterfaceC35845m2 f259255s0;

    /* renamed from: t0, reason: collision with root package name */
    @Inject
    public com.avito.android.sbc.utils.b f259256t0;

    /* renamed from: u0, reason: collision with root package name */
    @Inject
    public com.avito.android.calendar_select.b f259257u0;

    /* renamed from: v0, reason: collision with root package name */
    @Inject
    public com.avito.android.util.text.a f259258v0;

    /* renamed from: w0, reason: collision with root package name */
    @Inject
    public com.avito.android.sbc.create.mvi.util.k f259259w0;

    /* renamed from: x0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f259260x0;

    /* renamed from: y0, reason: collision with root package name */
    @Y61.l
    public com.avito.android.sbc.create.h f259261y0;

    /* renamed from: z0, reason: collision with root package name */
    @Y61.l
    public InterfaceC49447a f259262z0;

    /* compiled from: CreateDiscountDispatchFragment.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/avito/android/sbc/create/mvi/CreateDiscountDispatchFragment$a;", "", "<init>", "()V", "", "KEY_CREATE_DISCOUNT_DISPATCH_ARG", "Ljava/lang/String;", "", "UI_THROTTLE_TIMEOUT_MS", "J", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: CreateDiscountDispatchFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/sbc/create/mvi/U0;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/sbc/create/mvi/U0;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends kotlin.jvm.internal.N implements Y41.a<U0> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final U0 invoke() {
            V0 v02 = CreateDiscountDispatchFragment.this.f259250n0;
            if (v02 == null) {
                v02 = null;
            }
            return (U0) v02.get();
        }
    }

    /* compiled from: CreateDiscountDispatchFragment.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/sbc/create/mvi/CreateDiscountDispatchFragment$c", "Landroidx/activity/x;", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c extends androidx.view.x {
        public c() {
            super(true);
        }

        @Override // androidx.view.x
        public final void c() {
            a aVar = CreateDiscountDispatchFragment.f259243G0;
            CreateDiscountDispatchFragment.this.q5().accept(new e.t(false, 1, null));
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends kotlin.jvm.internal.N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f259265l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Y41.a aVar) {
            super(0);
            this.f259265l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f259265l);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "Cd/i", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends kotlin.jvm.internal.N implements Y41.a<Fragment> {
        public e() {
            super(0);
        }

        @Override // Y41.a
        public final Fragment invoke() {
            return CreateDiscountDispatchFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends kotlin.jvm.internal.N implements Y41.a<androidx.view.T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ e f259267l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(e eVar) {
            super(0);
            this.f259267l = eVar;
        }

        @Override // Y41.a
        public final androidx.view.T0 invoke() {
            return (androidx.view.T0) this.f259267l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends kotlin.jvm.internal.N implements Y41.a<androidx.view.S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f259268l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f259268l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final androidx.view.S0 invoke() {
            return ((androidx.view.T0) this.f259268l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends kotlin.jvm.internal.N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f259269l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f259269l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            androidx.view.T0 t02 = (androidx.view.T0) this.f259269l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    public CreateDiscountDispatchFragment() {
        super(R.layout.sbc_create_discount_dispatch_fragment);
        d dVar = new d(new b());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new f(new e()));
        this.f259251o0 = new androidx.view.O0(kotlin.jvm.internal.m0.f406844a.b(U0.class), new g(interfaceC42726CB), dVar, new h(interfaceC42726CB));
        this.f259244A0 = new io.reactivex.rxjava3.disposables.c();
        this.f259248E0 = registerForActivityResult(new b.m(), new L91.o(this, 28));
        this.f259249F0 = new c();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(@Y61.k Context context) {
        super.onAttach(context);
        this.f259261y0 = (com.avito.android.sbc.create.h) (!(context instanceof com.avito.android.sbc.create.h) ? null : context);
        boolean z12 = context instanceof InterfaceC49447a;
        Object obj = context;
        if (!z12) {
            obj = null;
        }
        this.f259262z0 = (InterfaceC49447a) obj;
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.l
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f259260x0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onDetach() {
        this.f259261y0 = null;
        this.f259262z0 = null;
        super.onDetach();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        com.avito.android.deeplink_handler.handler.composite.a aVar = this.f259254r0;
        if (aVar == null) {
            aVar = null;
        }
        io.reactivex.rxjava3.disposables.d dVarT0 = aVar.d9().t0(new D0(this));
        io.reactivex.rxjava3.disposables.c cVar = this.f259244A0;
        cVar.b(dVarT0);
        M0 m02 = this.f259245B0;
        if (m02 == null) {
            m02 = null;
        }
        com.jakewharton.rxrelay3.c cVar2 = m02.f259411s0;
        InterfaceC35745a5 interfaceC35745a5 = this.f259253q0;
        if (interfaceC35745a5 == null) {
            interfaceC35745a5 = null;
        }
        cVar.b(cVar2.j0(interfaceC35745a5.e()).t0(new C34500p0(this)));
        M0 m03 = this.f259245B0;
        if (m03 == null) {
            m03 = null;
        }
        com.jakewharton.rxrelay3.c cVar3 = m03.f259395k0;
        InterfaceC35745a5 interfaceC35745a52 = this.f259253q0;
        if (interfaceC35745a52 == null) {
            interfaceC35745a52 = null;
        }
        cVar.b(cVar3.j0(interfaceC35745a52.e()).t0(new C34507t0(this)));
        M0 m04 = this.f259245B0;
        if (m04 == null) {
            m04 = null;
        }
        com.jakewharton.rxrelay3.c cVar4 = m04.f259399m0;
        InterfaceC35745a5 interfaceC35745a53 = this.f259253q0;
        if (interfaceC35745a53 == null) {
            interfaceC35745a53 = null;
        }
        cVar.b(cVar4.j0(interfaceC35745a53.e()).t0(new C34509u0(this)));
        M0 m05 = this.f259245B0;
        if (m05 == null) {
            m05 = null;
        }
        com.jakewharton.rxrelay3.c cVar5 = m05.f259401n0;
        InterfaceC35745a5 interfaceC35745a54 = this.f259253q0;
        if (interfaceC35745a54 == null) {
            interfaceC35745a54 = null;
        }
        cVar.b(cVar5.j0(interfaceC35745a54.e()).t0(new C34511v0(this)));
        M0 m06 = this.f259245B0;
        if (m06 == null) {
            m06 = null;
        }
        com.jakewharton.rxrelay3.c cVar6 = m06.f259397l0;
        InterfaceC35745a5 interfaceC35745a55 = this.f259253q0;
        if (interfaceC35745a55 == null) {
            interfaceC35745a55 = null;
        }
        cVar.b(cVar6.j0(interfaceC35745a55.e()).t0(new w0(this)));
        M0 m07 = this.f259245B0;
        if (m07 == null) {
            m07 = null;
        }
        com.jakewharton.rxrelay3.c cVar7 = m07.f259403o0;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        cVar7.getClass();
        io.reactivex.rxjava3.core.H h12 = io.reactivex.rxjava3.schedulers.b.f404942b;
        A1 a1C0 = cVar7.C0(300L, timeUnit, h12);
        InterfaceC35745a5 interfaceC35745a56 = this.f259253q0;
        if (interfaceC35745a56 == null) {
            interfaceC35745a56 = null;
        }
        cVar.b(a1C0.j0(interfaceC35745a56.e()).t0(new x0(this)));
        M0 m08 = this.f259245B0;
        if (m08 == null) {
            m08 = null;
        }
        com.jakewharton.rxrelay3.c cVar8 = m08.f259405p0;
        cVar8.getClass();
        io.reactivex.rxjava3.internal.operators.observable.B0 b0D0 = cVar8.y(300L, timeUnit, h12).d0(new l41.o() { // from class: com.avito.android.sbc.create.mvi.y0
            @Override // l41.o
            public final Object apply(Object obj) {
                return C43066x.A0((String) obj).toString();
            }
        });
        l41.o<Object, Object> oVar = io.reactivex.rxjava3.internal.functions.a.f401991a;
        io.reactivex.rxjava3.internal.operators.observable.L lD2 = b0D0.D(oVar);
        InterfaceC35745a5 interfaceC35745a57 = this.f259253q0;
        if (interfaceC35745a57 == null) {
            interfaceC35745a57 = null;
        }
        cVar.b(lD2.j0(interfaceC35745a57.e()).t0(new z0(this)));
        M0 m09 = this.f259245B0;
        if (m09 == null) {
            m09 = null;
        }
        com.jakewharton.rxrelay3.c cVar9 = m09.f259407q0;
        cVar9.getClass();
        io.reactivex.rxjava3.internal.operators.observable.L lD3 = cVar9.y(300L, timeUnit, h12).d0(new l41.o() { // from class: com.avito.android.sbc.create.mvi.A0
            @Override // l41.o
            public final Object apply(Object obj) {
                return C43066x.A0((String) obj).toString();
            }
        }).D(oVar);
        InterfaceC35745a5 interfaceC35745a58 = this.f259253q0;
        if (interfaceC35745a58 == null) {
            interfaceC35745a58 = null;
        }
        cVar.b(lD3.j0(interfaceC35745a58.e()).t0(new C34480f0(this)));
        M0 m010 = this.f259245B0;
        if (m010 == null) {
            m010 = null;
        }
        com.jakewharton.rxrelay3.c cVar10 = m010.f259409r0;
        cVar10.getClass();
        io.reactivex.rxjava3.internal.operators.observable.L lD4 = cVar10.y(300L, timeUnit, h12).d0(new l41.o() { // from class: com.avito.android.sbc.create.mvi.g0
            @Override // l41.o
            public final Object apply(Object obj) {
                return C43066x.A0((String) obj).toString();
            }
        }).D(oVar);
        InterfaceC35745a5 interfaceC35745a59 = this.f259253q0;
        if (interfaceC35745a59 == null) {
            interfaceC35745a59 = null;
        }
        cVar.b(lD4.j0(interfaceC35745a59.e()).t0(new C34484h0(this)));
        M0 m011 = this.f259245B0;
        if (m011 == null) {
            m011 = null;
        }
        com.jakewharton.rxrelay3.c cVar11 = m011.f259415u0;
        cVar11.getClass();
        io.reactivex.rxjava3.internal.operators.observable.L lD5 = cVar11.C0(300L, timeUnit, h12).D(oVar);
        InterfaceC35745a5 interfaceC35745a510 = this.f259253q0;
        if (interfaceC35745a510 == null) {
            interfaceC35745a510 = null;
        }
        cVar.b(lD5.j0(interfaceC35745a510.e()).t0(new C34486i0(this)));
        M0 m012 = this.f259245B0;
        if (m012 == null) {
            m012 = null;
        }
        com.jakewharton.rxrelay3.c cVar12 = m012.f259417v0;
        cVar12.getClass();
        A1 a1C02 = cVar12.C0(300L, timeUnit, h12);
        InterfaceC35745a5 interfaceC35745a511 = this.f259253q0;
        if (interfaceC35745a511 == null) {
            interfaceC35745a511 = null;
        }
        cVar.b(a1C02.j0(interfaceC35745a511.e()).t0(new C34488j0(this)));
        M0 m013 = this.f259245B0;
        if (m013 == null) {
            m013 = null;
        }
        com.jakewharton.rxrelay3.c cVar13 = m013.f259425z0;
        InterfaceC35745a5 interfaceC35745a512 = this.f259253q0;
        if (interfaceC35745a512 == null) {
            interfaceC35745a512 = null;
        }
        cVar.b(cVar13.j0(interfaceC35745a512.e()).t0(new C34490k0(this)));
        M0 m014 = this.f259245B0;
        if (m014 == null) {
            m014 = null;
        }
        com.jakewharton.rxrelay3.c cVar14 = m014.f259419w0;
        cVar14.getClass();
        A1 a1C03 = cVar14.C0(300L, timeUnit, h12);
        InterfaceC35745a5 interfaceC35745a513 = this.f259253q0;
        if (interfaceC35745a513 == null) {
            interfaceC35745a513 = null;
        }
        cVar.b(a1C03.j0(interfaceC35745a513.e()).t0(new C34492l0(this)));
        M0 m015 = this.f259245B0;
        if (m015 == null) {
            m015 = null;
        }
        com.jakewharton.rxrelay3.c cVar15 = m015.f259423y0;
        cVar15.getClass();
        A1 a1C04 = cVar15.C0(300L, timeUnit, h12);
        InterfaceC35745a5 interfaceC35745a514 = this.f259253q0;
        if (interfaceC35745a514 == null) {
            interfaceC35745a514 = null;
        }
        cVar.b(a1C04.j0(interfaceC35745a514.e()).t0(new C34494m0(this)));
        M0 m016 = this.f259245B0;
        if (m016 == null) {
            m016 = null;
        }
        com.jakewharton.rxrelay3.c cVar16 = m016.f259421x0;
        cVar16.getClass();
        io.reactivex.rxjava3.internal.operators.observable.B0 b0D02 = cVar16.y(300L, timeUnit, h12).d0(new l41.o() { // from class: com.avito.android.sbc.create.mvi.n0
            @Override // l41.o
            public final Object apply(Object obj) {
                return C43066x.A0((String) obj).toString();
            }
        });
        InterfaceC35745a5 interfaceC35745a515 = this.f259253q0;
        if (interfaceC35745a515 == null) {
            interfaceC35745a515 = null;
        }
        cVar.b(b0D02.j0(interfaceC35745a515.e()).t0(new C34498o0(this)));
        M0 m017 = this.f259245B0;
        if (m017 == null) {
            m017 = null;
        }
        com.jakewharton.rxrelay3.c cVar17 = m017.f259335B0;
        cVar17.getClass();
        io.reactivex.rxjava3.internal.operators.observable.L lD6 = cVar17.y(300L, timeUnit, h12).d0(new l41.o() { // from class: com.avito.android.sbc.create.mvi.q0
            @Override // l41.o
            public final Object apply(Object obj) {
                return C43066x.A0((String) obj).toString();
            }
        }).D(oVar);
        InterfaceC35745a5 interfaceC35745a516 = this.f259253q0;
        if (interfaceC35745a516 == null) {
            interfaceC35745a516 = null;
        }
        cVar.b(lD6.j0(interfaceC35745a516.e()).t0(new C34503r0(this)));
        M0 m018 = this.f259245B0;
        if (m018 == null) {
            m018 = null;
        }
        com.jakewharton.rxrelay3.c cVar18 = m018.f259413t0;
        cVar18.getClass();
        A1 a1C05 = cVar18.C0(300L, timeUnit, h12);
        InterfaceC35745a5 interfaceC35745a517 = this.f259253q0;
        cVar.b(a1C05.j0((interfaceC35745a517 != null ? interfaceC35745a517 : null).e()).t0(new C34505s0(this)));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        this.f259244A0.e();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) {
        androidx.view.y f21241d;
        super.onViewCreated(view, bundle);
        InterfaceC28373a interfaceC28373a = this.f259252p0;
        InterfaceC28373a interfaceC28373a2 = interfaceC28373a != null ? interfaceC28373a : null;
        boolean z12 = this.f259246C0;
        boolean z13 = this.f259247D0;
        com.avito.android.sbc.utils.b bVar = this.f259256t0;
        com.avito.android.sbc.utils.b bVar2 = bVar != null ? bVar : null;
        com.avito.android.util.text.a aVar = this.f259258v0;
        com.avito.android.util.text.a aVar2 = aVar != null ? aVar : null;
        Resources resources = getResources();
        ScreenPerformanceTracker screenPerformanceTracker = this.f259260x0;
        this.f259245B0 = new M0(view, interfaceC28373a2, z12, z13, bVar2, aVar2, resources, screenPerformanceTracker != null ? screenPerformanceTracker : null);
        ActivityC22955m activityC22955mL1 = l1();
        if (activityC22955mL1 != null && (f21241d = activityC22955mL1.getF21241d()) != null) {
            f21241d.a(getViewLifecycleOwner(), this.f259249F0);
        }
        U0 u0Q5 = q5();
        C22960s.b(this, "discount_alternatives_result_key", new B0(this));
        C43259k.d(C22984Q.a(getViewLifecycleOwner()), null, null, new C0(this, u0Q5, null), 3);
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f259260x0;
        (screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null).d();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002d A[PHI: r4
  0x002d: PHI (r4v9 com.avito.android.sbc.create.mvi.entity.CreateDiscountDispatchArg$SbcConfiguratorArgs) = 
  (r4v3 com.avito.android.sbc.create.mvi.entity.CreateDiscountDispatchArg$SbcConfiguratorArgs)
  (r4v5 com.avito.android.sbc.create.mvi.entity.CreateDiscountDispatchArg$SbcConfiguratorArgs)
 binds: [B:10:0x002b, B:22:0x0050] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.avito.android.ui.fragments.BaseFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void p5(@Y61.l android.os.Bundle r18) {
        /*
            r17 = this;
            r7 = r17
            com.avito.android.analytics.screens.D$a r0 = com.avito.android.analytics.screens.D.f90335a
            r0.getClass()
            com.avito.android.analytics.screens.F r8 = com.avito.android.analytics.screens.D.a.a()
            android.os.Bundle r0 = r17.requireArguments()
            int r1 = android.os.Build.VERSION.SDK_INT
            java.lang.String r2 = "key_discount_dispatch_arg"
            r3 = 34
            if (r1 < r3) goto L1e
            java.lang.Object r4 = com.avito.android.return_checkout.c.n(r0)
            android.os.Parcelable r4 = (android.os.Parcelable) r4
            goto L22
        L1e:
            android.os.Parcelable r4 = r0.getParcelable(r2)
        L22:
            boolean r5 = r4 instanceof com.avito.android.sbc.create.mvi.entity.CreateDiscountDispatchArg.SbcConfiguratorArgs
            r9 = 0
            if (r5 == 0) goto L2a
            com.avito.android.sbc.create.mvi.entity.CreateDiscountDispatchArg$SbcConfiguratorArgs r4 = (com.avito.android.sbc.create.mvi.entity.CreateDiscountDispatchArg.SbcConfiguratorArgs) r4
            goto L2b
        L2a:
            r4 = r9
        L2b:
            if (r4 == 0) goto L2f
        L2d:
            r10 = r4
            goto L5f
        L2f:
            if (r1 < r3) goto L38
            java.lang.Object r0 = com.avito.android.return_checkout.c.o(r0)
            android.os.Parcelable r0 = (android.os.Parcelable) r0
            goto L3c
        L38:
            android.os.Parcelable r0 = r0.getParcelable(r2)
        L3c:
            boolean r1 = r0 instanceof com.avito.android.sbc.create.mvi.entity.CreateDiscountDispatchArg.SbcVasFlowConfiguratorArgs
            if (r1 == 0) goto L43
            com.avito.android.sbc.create.mvi.entity.CreateDiscountDispatchArg$SbcVasFlowConfiguratorArgs r0 = (com.avito.android.sbc.create.mvi.entity.CreateDiscountDispatchArg.SbcVasFlowConfiguratorArgs) r0
            goto L44
        L43:
            r0 = r9
        L44:
            if (r0 == 0) goto L4f
            r1 = 1
            r7.f259246C0 = r1
            boolean r1 = r0.f259611d
            r7.f259247D0 = r1
            r4 = r0
            goto L50
        L4f:
            r4 = r9
        L50:
            if (r4 == 0) goto L53
            goto L2d
        L53:
            com.avito.android.sbc.create.mvi.entity.CreateDiscountDispatchArg$SbcConfiguratorArgs r4 = new com.avito.android.sbc.create.mvi.entity.CreateDiscountDispatchArg$SbcConfiguratorArgs
            r12 = 0
            r13 = 0
            java.lang.String r11 = ""
            r14 = 6
            r15 = 0
            r10 = r4
            r10.<init>(r11, r12, r13, r14, r15)
        L5f:
            com.avito.android.sbc.di.c$a r0 = com.avito.android.sbc.di.h.a()
            com.avito.android.K r1 = com.avito.android.di.C29972i.b(r17)
            java.lang.Class<com.avito.android.sbc.di.d> r2 = com.avito.android.sbc.di.d.class
            com.avito.android.di.h r1 = com.avito.android.di.C29972i.a(r1, r2)
            com.avito.android.sbc.di.d r1 = (com.avito.android.sbc.di.d) r1
            android.content.res.Resources r4 = r17.getResources()
            cv.a r6 = cv.c.b(r17)
            com.avito.android.analytics.screens.k r5 = new com.avito.android.analytics.screens.k
            com.avito.android.sbc.perfomance.CreateDiscountDispatchScreen r12 = com.avito.android.sbc.perfomance.CreateDiscountDispatchScreen.f260181d
            com.avito.android.analytics.screens.r r13 = com.avito.android.analytics.screens.s.c(r17)
            r16 = 0
            r14 = 0
            r15 = 4
            r11 = r5
            r11.<init>(r12, r13, r14, r15, r16)
            r2 = r17
            r3 = r10
            com.avito.android.sbc.di.c r0 = r0.a(r1, r2, r3, r4, r5, r6)
            r0.a(r7)
            com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker r0 = r7.f259260x0
            if (r0 == 0) goto L96
            goto L97
        L96:
            r0 = r9
        L97:
            long r1 = r8.b()
            r0.a(r1)
            androidx.fragment.app.m r0 = r17.l1()
            boolean r0 = r0 instanceof v50.e
            if (r0 == 0) goto Lb6
            boolean r0 = r10 instanceof com.avito.android.sbc.create.mvi.entity.CreateDiscountDispatchArg.SbcVasFlowConfiguratorArgs
            if (r0 == 0) goto Lb6
            com.avito.android.deeplink_handler.handler.composite.a r0 = r7.f259254r0
            if (r0 == 0) goto Laf
            r9 = r0
        Laf:
            v50.d r0 = v50.C49166b.a(r17)
            v50.C49166b.c(r9, r0)
        Lb6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.sbc.create.mvi.CreateDiscountDispatchFragment.p5(android.os.Bundle):void");
    }

    public final U0 q5() {
        return (U0) this.f259251o0.getValue();
    }
}
