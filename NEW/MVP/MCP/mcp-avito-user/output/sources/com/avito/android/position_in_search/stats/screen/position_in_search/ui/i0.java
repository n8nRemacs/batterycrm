package com.avito.android.position_in_search.stats.screen.position_in_search.ui;

import androidx.compose.foundation.layout.A3;
import androidx.compose.foundation.layout.C20581j;
import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.C20632w;
import androidx.compose.foundation.layout.C20644z;
import androidx.compose.foundation.layout.H2;
import androidx.compose.foundation.layout.InterfaceC20639x2;
import androidx.compose.foundation.layout.N2;
import androidx.compose.foundation.layout.R1;
import androidx.compose.foundation.layout.q3;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.C22126m3;
import androidx.compose.runtime.C22187u0;
import androidx.compose.runtime.C22190v;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.runtime.InterfaceC22196w1;
import androidx.compose.runtime.InterfaceC22204y1;
import androidx.compose.runtime.O1;
import androidx.compose.runtime.R3;
import androidx.compose.runtime.U2;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.layout.InterfaceC22365i0;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;
import c90.InterfaceC26960a;
import c90.InterfaceC26961b;
import com.avito.android.R;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: PositionInSearchScreen.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003¨\u0006\u000b²\u0006\u0012\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00008\nX\u008a\u0084\u0002²\u0006\u000e\u0010\u0004\u001a\u00020\u00038\n@\nX\u008a\u008e\u0002²\u0006\u0018\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u00058\nX\u008a\u0084\u0002²\u0006\u0018\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u00058\nX\u008a\u0084\u0002²\u0006\u0018\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00058\nX\u008a\u0084\u0002"}, d2 = {"Lkotlin/Function0;", "Lkotlin/G0;", "onCloseState", "", "footerHeight", "Lkotlin/Function1;", "Lc90/a;", "onActionState", "Lcom/avito/android/deep_linking/links/DeepLink;", "handleDeeplinkState", "onMeasureFooterHeightState", "_avito_position-in-search_stats_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class i0 {

    /* renamed from: a, reason: collision with root package name */
    public static final float f221665a;

    /* compiled from: PositionInSearchScreen.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.position_in_search.stats.screen.position_in_search.ui.PositionInSearchScreenKt$PositionInSearchScreen$1", f = "PositionInSearchScreen.kt", i = {}, l = {69}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f221666q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f221667r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43160i<InterfaceC26961b> f221668s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22204y1 f221669t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ com.akita.compose.component.toast_bar.u f221670u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ String f221671v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ com.akita.compose.component.toast_bar.J f221672w;

        /* renamed from: x, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22204y1 f221673x;

        /* compiled from: PositionInSearchScreen.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lc90/b;", "event", "Lkotlin/G0;", "emit", "(Lc90/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.position_in_search.stats.screen.position_in_search.ui.i0$a$a, reason: collision with other inner class name */
        public static final class C6705a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ kotlinx.coroutines.T f221674b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ InterfaceC22204y1 f221675c;

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ com.akita.compose.component.toast_bar.u f221676d;

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ String f221677e;

            /* renamed from: f, reason: collision with root package name */
            public final /* synthetic */ com.akita.compose.component.toast_bar.J f221678f;

            /* renamed from: g, reason: collision with root package name */
            public final /* synthetic */ InterfaceC22204y1 f221679g;

            public C6705a(kotlinx.coroutines.T t12, InterfaceC22204y1 interfaceC22204y1, com.akita.compose.component.toast_bar.u uVar, String str, com.akita.compose.component.toast_bar.J j12, InterfaceC22204y1 interfaceC22204y12) {
                this.f221674b = t12;
                this.f221675c = interfaceC22204y1;
                this.f221676d = uVar;
                this.f221677e = str;
                this.f221678f = j12;
                this.f221679g = interfaceC22204y12;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC43172j
            public final Object emit(Object obj, Continuation continuation) {
                InterfaceC26961b interfaceC26961b = (InterfaceC26961b) obj;
                if (interfaceC26961b instanceof InterfaceC26961b.a) {
                    float f12 = i0.f221665a;
                    ((Y41.a) this.f221675c.getF42167b()).invoke();
                } else {
                    boolean z12 = interfaceC26961b instanceof InterfaceC26961b.c;
                    kotlinx.coroutines.T t12 = this.f221674b;
                    com.akita.compose.component.toast_bar.u uVar = this.f221676d;
                    if (z12) {
                        C43259k.d(t12, null, null, new f0(uVar, null), 3);
                    } else {
                        boolean z13 = interfaceC26961b instanceof InterfaceC26961b.d;
                        com.akita.compose.component.toast_bar.J j12 = this.f221678f;
                        if (z13) {
                            String str = ((InterfaceC26961b.d) interfaceC26961b).f57700a;
                            if (str.length() == 0) {
                                str = this.f221677e;
                            }
                            C43259k.d(t12, null, null, new g0(uVar, j12, str, null), 3);
                        } else if (interfaceC26961b instanceof InterfaceC26961b.e) {
                            C43259k.d(t12, null, null, new h0(uVar, j12, interfaceC26961b, null), 3);
                        } else if (interfaceC26961b instanceof InterfaceC26961b.C2033b) {
                            float f13 = i0.f221665a;
                            ((Y41.l) this.f221679g.getF42167b()).invoke(((InterfaceC26961b.C2033b) interfaceC26961b).f57698a);
                        }
                    }
                }
                return G0.f406611a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC43160i interfaceC43160i, InterfaceC22204y1 interfaceC22204y1, com.akita.compose.component.toast_bar.u uVar, String str, com.akita.compose.component.toast_bar.J j12, InterfaceC22204y1 interfaceC22204y12, Continuation continuation) {
            super(2, continuation);
            this.f221668s = interfaceC43160i;
            this.f221669t = interfaceC22204y1;
            this.f221670u = uVar;
            this.f221671v = str;
            this.f221672w = j12;
            this.f221673x = interfaceC22204y12;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            InterfaceC22204y1 interfaceC22204y1 = this.f221673x;
            a aVar = new a(this.f221668s, this.f221669t, this.f221670u, this.f221671v, this.f221672w, interfaceC22204y1, continuation);
            aVar.f221667r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f221666q;
            if (i12 == 0) {
                C42729a0.b(obj);
                C6705a c6705a = new C6705a((kotlinx.coroutines.T) this.f221667r, this.f221669t, this.f221670u, this.f221671v, this.f221672w, this.f221673x);
                this.f221666q = 1;
                if (this.f221668s.collect(c6705a, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: PositionInSearchScreen.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends kotlin.jvm.internal.N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22204y1 f221680l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC22204y1 interfaceC22204y1) {
            super(0);
            this.f221680l = interfaceC22204y1;
        }

        @Override // Y41.a
        public final G0 invoke() {
            float f12 = i0.f221665a;
            ((Y41.l) this.f221680l.getF42167b()).invoke(InterfaceC26960a.b.f57688a);
            return G0.f406611a;
        }
    }

    /* compiled from: PositionInSearchScreen.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/akita/compose/component/toast_bar/u;", "it", "Lkotlin/G0;", "invoke", "(Lcom/akita/compose/component/toast_bar/u;Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends kotlin.jvm.internal.N implements Y41.q<com.akita.compose.component.toast_bar.u, androidx.compose.runtime.A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22196w1 f221681l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(InterfaceC22196w1 interfaceC22196w1) {
            super(3);
            this.f221681l = interfaceC22196w1;
        }

        @Override // Y41.q
        public final G0 invoke(com.akita.compose.component.toast_bar.u uVar, androidx.compose.runtime.A a12, Integer num) {
            com.akita.compose.component.toast_bar.u uVar2 = uVar;
            androidx.compose.runtime.A a13 = a12;
            int iIntValue = num.intValue();
            if ((iIntValue & 14) == 0) {
                iIntValue |= a13.B(uVar2) ? 4 : 2;
            }
            if ((iIntValue & 91) == 18 && a13.c()) {
                a13.f();
            } else {
                float f12 = i0.f221665a;
                i0.b(uVar2, this.f221681l.e(), a13, iIntValue & 14);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: PositionInSearchScreen.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/foundation/layout/x2;", "invoke", "(Landroidx/compose/runtime/A;I)Landroidx/compose/foundation/layout/x2;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, InterfaceC20639x2> {

        /* renamed from: l, reason: collision with root package name */
        public static final d f221682l = new d();

        public d() {
            super(2);
        }

        @Override // Y41.p
        public final InterfaceC20639x2 invoke(androidx.compose.runtime.A a12, Integer num) {
            androidx.compose.runtime.A a13 = a12;
            num.intValue();
            a13.C(-1846087899);
            int i12 = InterfaceC20639x2.f28800a;
            C20581j c20581jA = A3.a(a13);
            C20581j c20581jC = A3.c(a13);
            q3.f28716b.getClass();
            InterfaceC20639x2 interfaceC20639x2G = H2.g(c20581jA, H2.f(c20581jC, q3.f28723i));
            a13.h();
            return interfaceC20639x2G;
        }
    }

    /* compiled from: PositionInSearchScreen.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/layout/J;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/foundation/layout/J;Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends kotlin.jvm.internal.N implements Y41.q<androidx.compose.foundation.layout.J, androidx.compose.runtime.A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ c90.c f221683l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22204y1 f221684m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22196w1 f221685n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(c90.c cVar, InterfaceC22204y1 interfaceC22204y1, InterfaceC22196w1 interfaceC22196w1) {
            super(3);
            this.f221683l = cVar;
            this.f221684m = interfaceC22204y1;
            this.f221685n = interfaceC22196w1;
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x0066  */
        @Override // Y41.q
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final kotlin.G0 invoke(androidx.compose.foundation.layout.J r11, androidx.compose.runtime.A r12, java.lang.Integer r13) {
            /*
                Method dump skipped, instructions count: 424
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.position_in_search.stats.screen.position_in_search.ui.i0.e.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: PositionInSearchScreen.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class f extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ c90.c f221686l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Y41.l<InterfaceC26960a, G0> f221687m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f221688n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43160i<InterfaceC26961b> f221689o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ Y41.l<DeepLink, G0> f221690p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public f(c90.c cVar, Y41.l<? super InterfaceC26960a, G0> lVar, Y41.a<G0> aVar, InterfaceC43160i<? extends InterfaceC26961b> interfaceC43160i, Y41.l<? super DeepLink, G0> lVar2, int i12) {
            super(2);
            this.f221686l = cVar;
            this.f221687m = lVar;
            this.f221688n = aVar;
            this.f221689o = interfaceC43160i;
            this.f221690p = lVar2;
        }

        @Override // Y41.p
        public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(4105);
            Y41.a<G0> aVar = this.f221688n;
            i0.a(this.f221686l, this.f221687m, aVar, this.f221689o, this.f221690p, a12, iA2);
            return G0.f406611a;
        }
    }

    static {
        h.a aVar = androidx.compose.ui.unit.h.f42849c;
        f221665a = 40;
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(@Y61.k c90.c cVar, @Y61.k Y41.l<? super InterfaceC26960a, G0> lVar, @Y61.k Y41.a<G0> aVar, @Y61.k InterfaceC43160i<? extends InterfaceC26961b> interfaceC43160i, @Y61.k Y41.l<? super DeepLink, G0> lVar2, @Y61.l androidx.compose.runtime.A a12, int i12) {
        androidx.compose.runtime.B bE2 = a12.E(610380807);
        InterfaceC22204y1 interfaceC22204y1M = C22126m3.m(aVar, bE2);
        bE2.C(31481623);
        Object objT = bE2.t();
        androidx.compose.runtime.A.f37866a.getClass();
        Object obj = A.a.f37868b;
        if (objT == obj) {
            objT = U2.a(0);
            bE2.H(objT);
        }
        InterfaceC22196w1 interfaceC22196w1 = (InterfaceC22196w1) objT;
        bE2.X(false);
        com.akita.compose.component.toast_bar.u uVarA = com.akita.compose.component.toast_bar.w.a(bE2);
        InterfaceC22204y1 interfaceC22204y1M2 = C22126m3.m(lVar, bE2);
        InterfaceC22204y1 interfaceC22204y1M3 = C22126m3.m(lVar2, bE2);
        com.akita.compose.theme.re23.b.f63983a.getClass();
        C22187u0.d(new a(interfaceC43160i, interfaceC22204y1M, uVarA, u0.i.c(bE2, R.string.position_in_search_stats_unknown_error_description), com.akita.compose.theme.re23.b.u(bE2).getF66804a(), interfaceC22204y1M3, null), bE2, interfaceC43160i);
        bE2.C(31547081);
        boolean zB2 = bE2.B(interfaceC22204y1M2);
        Object objT2 = bE2.t();
        if (zB2 || objT2 == obj) {
            objT2 = new b(interfaceC22204y1M2);
            bE2.H(objT2);
        }
        bE2.X(false);
        com.akita.compose.component.bottom_sheet.H.a((Y41.a) objT2, null, null, uVarA, androidx.compose.runtime.internal.r.c(802320275, new c(interfaceC22196w1), bE2), null, null, false, false, d.f221682l, null, null, androidx.compose.runtime.internal.r.c(463082791, new e(cVar, interfaceC22204y1M2, interfaceC22196w1), bE2), bE2, 24576, 384, 3558);
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new f(cVar, lVar, aVar, interfaceC43160i, lVar2, i12);
        }
    }

    public static final void b(com.akita.compose.component.toast_bar.u uVar, int i12, androidx.compose.runtime.A a12, int i13) {
        int i14;
        androidx.compose.runtime.B bE2 = a12.E(-779515922);
        if ((i13 & 14) == 0) {
            i14 = (bE2.B(uVar) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 112) == 0) {
            i14 |= bE2.m(i12) ? 32 : 16;
        }
        if ((i14 & 91) == 18 && bE2.c()) {
            bE2.f();
        } else {
            v.a aVar = androidx.compose.ui.v.f42878y1;
            androidx.compose.ui.v vVarD = C20588k2.d(aVar, 1.0f);
            InterfaceC22215f.f39074a.getClass();
            InterfaceC22365i0 interfaceC22365i0D = C20632w.d(InterfaceC22215f.a.f39076b, false);
            int i15 = bE2.f37888Q;
            O1 o1S = bE2.S();
            androidx.compose.ui.v vVarC = androidx.compose.ui.n.c(bE2, vVarD);
            InterfaceC22413h.f40789C1.getClass();
            Y41.a<InterfaceC22413h> aVar2 = InterfaceC22413h.a.f40791b;
            if (bE2.f37890b == null) {
                C22190v.b();
                throw null;
            }
            bE2.A();
            if (bE2.f37887P) {
                bE2.b(aVar2);
            } else {
                bE2.d();
            }
            R3.b(InterfaceC22413h.a.f40796g, bE2, interfaceC22365i0D);
            R3.b(InterfaceC22413h.a.f40795f, bE2, o1S);
            Y41.p<InterfaceC22413h, Integer, G0> pVar = InterfaceC22413h.a.f40799j;
            if (bE2.f37887P || !kotlin.jvm.internal.L.f(bE2.t(), Integer.valueOf(i15))) {
                AK.c.y(i15, bE2, i15, pVar);
            }
            R3.b(InterfaceC22413h.a.f40793d, bE2, vVarC);
            androidx.compose.ui.v vVarD2 = C20644z.f28804a.d(aVar, InterfaceC22215f.a.f39077c);
            int i16 = InterfaceC20639x2.f28800a;
            com.akita.compose.component.toast_bar.q.b(uVar, R1.m(N2.b(vVarD2, A3.b(bE2)), 0.0f, 0.0f, 0.0f, com.avito.android.position_in_search.stats.screen.position_in_search.util.a.a(bE2, i12), 7), null, bE2, i14 & 14, 4);
            bE2.X(true);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new C33277a0(uVar, i12, i13);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0347  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x018a  */
    /* JADX WARN: Type inference failed for: r1v10, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(c90.c r22, Y41.l r23, Y41.l r24, float r25, androidx.compose.runtime.A r26, int r27) {
        /*
            Method dump skipped, instructions count: 905
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.position_in_search.stats.screen.position_in_search.ui.i0.c(c90.c, Y41.l, Y41.l, float, androidx.compose.runtime.A, int):void");
    }
}
