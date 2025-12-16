package com.avito.android.competitor_analytics.ui;

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
import androidx.compose.ui.v;
import com.avito.android.competitor_analytics.mvi.entity.a;
import com.avito.android.deep_linking.links.DeepLink;
import er.InterfaceC40148a;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: CompetitorAnalyticsScreen.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004¨\u0006\f²\u0006\u0018\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00008\nX\u008a\u0084\u0002²\u0006\u000e\u0010\u0005\u001a\u00020\u00048\n@\nX\u008a\u008e\u0002²\u0006\u0018\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00008\nX\u008a\u0084\u0002²\u0006\u0012\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068\nX\u008a\u0084\u0002²\u0006\u0018\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00020\u00008\nX\u008a\u0084\u0002²\u0006\u0018\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00020\u00008\nX\u008a\u0084\u0002²\u0006\u000e\u0010\u000b\u001a\u00020\u00048\n@\nX\u008a\u008e\u0002"}, d2 = {"Lkotlin/Function1;", "Lcom/avito/android/competitor_analytics/mvi/entity/a;", "Lkotlin/G0;", "onActionState", "", "footerHeight", "Lkotlin/Function0;", "onCloseState", "Lcom/avito/android/deep_linking/links/DeepLink;", "handleDeeplinkState", "onMeasureFooterHeightState", "suggestsHeight", "_avito_competitor-analytics_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.competitor_analytics.ui.h0, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C29533h0 {

    /* compiled from: CompetitorAnalyticsScreen.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.competitor_analytics.ui.h0$a */
    public static final class a extends kotlin.jvm.internal.N implements Y41.a<kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22204y1 f124751l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC22204y1 interfaceC22204y1) {
            super(0);
            this.f124751l = interfaceC22204y1;
        }

        @Override // Y41.a
        public final kotlin.G0 invoke() {
            ((Y41.l) this.f124751l.getF42167b()).invoke(a.f.f124461a);
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: CompetitorAnalyticsScreen.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/akita/compose/component/toast_bar/u;", "it", "Lkotlin/G0;", "invoke", "(Lcom/akita/compose/component/toast_bar/u;Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.competitor_analytics.ui.h0$b */
    public static final class b extends kotlin.jvm.internal.N implements Y41.q<com.akita.compose.component.toast_bar.u, androidx.compose.runtime.A, Integer, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22196w1 f124752l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC22196w1 interfaceC22196w1) {
            super(3);
            this.f124752l = interfaceC22196w1;
        }

        @Override // Y41.q
        public final kotlin.G0 invoke(com.akita.compose.component.toast_bar.u uVar, androidx.compose.runtime.A a12, Integer num) {
            com.akita.compose.component.toast_bar.u uVar2 = uVar;
            androidx.compose.runtime.A a13 = a12;
            int iIntValue = num.intValue();
            if ((iIntValue & 14) == 0) {
                iIntValue |= a13.B(uVar2) ? 4 : 2;
            }
            if ((iIntValue & 91) == 18 && a13.c()) {
                a13.f();
            } else {
                C29533h0.c(uVar2, this.f124752l.e(), a13, iIntValue & 14);
            }
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: CompetitorAnalyticsScreen.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/foundation/layout/x2;", "invoke", "(Landroidx/compose/runtime/A;I)Landroidx/compose/foundation/layout/x2;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.competitor_analytics.ui.h0$c */
    public static final class c extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, InterfaceC20639x2> {

        /* renamed from: l, reason: collision with root package name */
        public static final c f124753l = new c();

        public c() {
            super(2);
        }

        @Override // Y41.p
        public final InterfaceC20639x2 invoke(androidx.compose.runtime.A a12, Integer num) {
            androidx.compose.runtime.A a13 = a12;
            num.intValue();
            a13.C(-915485783);
            int i12 = InterfaceC20639x2.f28800a;
            C20581j c20581jA = A3.a(a13);
            C20581j c20581jC = A3.c(a13);
            q3.f28716b.getClass();
            InterfaceC20639x2 interfaceC20639x2G = H2.g(c20581jA, H2.f(c20581jC, q3.f28723i));
            a13.h();
            return interfaceC20639x2G;
        }
    }

    /* compiled from: CompetitorAnalyticsScreen.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/layout/J;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/foundation/layout/J;Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.competitor_analytics.ui.h0$d */
    public static final class d extends kotlin.jvm.internal.N implements Y41.q<androidx.compose.foundation.layout.J, androidx.compose.runtime.A, Integer, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.competitor_analytics.mvi.entity.b f124754l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22204y1 f124755m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22196w1 f124756n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(com.avito.android.competitor_analytics.mvi.entity.b bVar, InterfaceC22204y1 interfaceC22204y1, InterfaceC22196w1 interfaceC22196w1) {
            super(3);
            this.f124754l = bVar;
            this.f124755m = interfaceC22204y1;
            this.f124756n = interfaceC22196w1;
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x007d  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x00b2  */
        @Override // Y41.q
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final kotlin.G0 invoke(androidx.compose.foundation.layout.J r11, androidx.compose.runtime.A r12, java.lang.Integer r13) {
            /*
                Method dump skipped, instructions count: 486
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.competitor_analytics.ui.C29533h0.d.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: CompetitorAnalyticsScreen.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.competitor_analytics.ui.h0$e */
    public static final class e extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.competitor_analytics.mvi.entity.b f124757l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Y41.a<kotlin.G0> f124758m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ Y41.l<com.avito.android.competitor_analytics.mvi.entity.a, kotlin.G0> f124759n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ Y41.l<DeepLink, kotlin.G0> f124760o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43160i<InterfaceC40148a> f124761p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public e(com.avito.android.competitor_analytics.mvi.entity.b bVar, Y41.a<kotlin.G0> aVar, Y41.l<? super com.avito.android.competitor_analytics.mvi.entity.a, kotlin.G0> lVar, Y41.l<? super DeepLink, kotlin.G0> lVar2, InterfaceC43160i<? extends InterfaceC40148a> interfaceC43160i, int i12) {
            super(2);
            this.f124757l = bVar;
            this.f124758m = aVar;
            this.f124759n = lVar;
            this.f124760o = lVar2;
            this.f124761p = interfaceC43160i;
        }

        @Override // Y41.p
        public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(32777);
            Y41.a<kotlin.G0> aVar = this.f124758m;
            Y41.l<com.avito.android.competitor_analytics.mvi.entity.a, kotlin.G0> lVar = this.f124759n;
            C29533h0.a(this.f124757l, aVar, lVar, this.f124760o, this.f124761p, a12, iA2);
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: CompetitorAnalyticsScreen.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.competitor_analytics.ui.CompetitorAnalyticsScreenKt$HandleEvents$1", f = "CompetitorAnalyticsScreen.kt", i = {}, l = {129}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.competitor_analytics.ui.h0$f */
    public static final class f extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super kotlin.G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f124762q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f124763r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43160i<InterfaceC40148a> f124764s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22204y1 f124765t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ com.akita.compose.component.toast_bar.u f124766u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ com.akita.compose.component.toast_bar.J f124767v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22204y1 f124768w;

        /* renamed from: x, reason: collision with root package name */
        public final /* synthetic */ com.akita.compose.component.toast_bar.J f124769x;

        /* renamed from: y, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22204y1 f124770y;

        /* compiled from: CompetitorAnalyticsScreen.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ler/a;", "event", "Lkotlin/G0;", "emit", "(Ler/a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.competitor_analytics.ui.h0$f$a */
        public static final class a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ kotlinx.coroutines.T f124771b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ InterfaceC22204y1 f124772c;

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ com.akita.compose.component.toast_bar.u f124773d;

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ com.akita.compose.component.toast_bar.J f124774e;

            /* renamed from: f, reason: collision with root package name */
            public final /* synthetic */ InterfaceC22204y1 f124775f;

            /* renamed from: g, reason: collision with root package name */
            public final /* synthetic */ com.akita.compose.component.toast_bar.J f124776g;

            /* renamed from: h, reason: collision with root package name */
            public final /* synthetic */ InterfaceC22204y1 f124777h;

            public a(kotlinx.coroutines.T t12, InterfaceC22204y1 interfaceC22204y1, com.akita.compose.component.toast_bar.u uVar, com.akita.compose.component.toast_bar.J j12, InterfaceC22204y1 interfaceC22204y12, com.akita.compose.component.toast_bar.J j13, InterfaceC22204y1 interfaceC22204y13) {
                this.f124771b = t12;
                this.f124772c = interfaceC22204y1;
                this.f124773d = uVar;
                this.f124774e = j12;
                this.f124775f = interfaceC22204y12;
                this.f124776g = j13;
                this.f124777h = interfaceC22204y13;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC43172j
            public final Object emit(Object obj, Continuation continuation) {
                InterfaceC40148a interfaceC40148a = (InterfaceC40148a) obj;
                if (interfaceC40148a instanceof InterfaceC40148a.C11107a) {
                    ((Y41.a) this.f124772c.getF42167b()).invoke();
                } else {
                    boolean z12 = interfaceC40148a instanceof InterfaceC40148a.c;
                    kotlinx.coroutines.T t12 = this.f124771b;
                    com.akita.compose.component.toast_bar.u uVar = this.f124773d;
                    if (z12) {
                        C43259k.d(t12, null, null, new m0(uVar, null), 3);
                    } else if (interfaceC40148a instanceof InterfaceC40148a.d) {
                        C43259k.d(t12, null, null, new n0(uVar, this.f124774e, interfaceC40148a, this.f124775f, null), 3);
                    } else if (interfaceC40148a instanceof InterfaceC40148a.e) {
                        C43259k.d(t12, null, null, new o0(uVar, this.f124776g, interfaceC40148a, null), 3);
                    } else if (interfaceC40148a instanceof InterfaceC40148a.b) {
                        ((Y41.l) this.f124777h.getF42167b()).invoke(((InterfaceC40148a.b) interfaceC40148a).f395396a);
                    }
                }
                return kotlin.G0.f406611a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(InterfaceC43160i interfaceC43160i, InterfaceC22204y1 interfaceC22204y1, com.akita.compose.component.toast_bar.u uVar, com.akita.compose.component.toast_bar.J j12, InterfaceC22204y1 interfaceC22204y12, com.akita.compose.component.toast_bar.J j13, InterfaceC22204y1 interfaceC22204y13, Continuation continuation) {
            super(2, continuation);
            this.f124764s = interfaceC43160i;
            this.f124765t = interfaceC22204y1;
            this.f124766u = uVar;
            this.f124767v = j12;
            this.f124768w = interfaceC22204y12;
            this.f124769x = j13;
            this.f124770y = interfaceC22204y13;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            InterfaceC22204y1 interfaceC22204y1 = this.f124770y;
            f fVar = new f(this.f124764s, this.f124765t, this.f124766u, this.f124767v, this.f124768w, this.f124769x, interfaceC22204y1, continuation);
            fVar.f124763r = obj;
            return fVar;
        }

        @Override // Y41.p
        public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super kotlin.G0> continuation) {
            return ((f) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f124762q;
            if (i12 == 0) {
                C42729a0.b(obj);
                kotlinx.coroutines.T t12 = (kotlinx.coroutines.T) this.f124763r;
                InterfaceC22204y1 interfaceC22204y1 = this.f124770y;
                a aVar = new a(t12, this.f124765t, this.f124766u, this.f124767v, this.f124768w, this.f124769x, interfaceC22204y1);
                this.f124762q = 1;
                if (this.f124764s.collect(aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: CompetitorAnalyticsScreen.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.competitor_analytics.ui.h0$g */
    public static final class g extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a<kotlin.G0> f124778l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Y41.l<com.avito.android.competitor_analytics.mvi.entity.a, kotlin.G0> f124779m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ Y41.l<DeepLink, kotlin.G0> f124780n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ com.akita.compose.component.toast_bar.u f124781o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43160i<InterfaceC40148a> f124782p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ int f124783q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public g(Y41.a<kotlin.G0> aVar, Y41.l<? super com.avito.android.competitor_analytics.mvi.entity.a, kotlin.G0> lVar, Y41.l<? super DeepLink, kotlin.G0> lVar2, com.akita.compose.component.toast_bar.u uVar, InterfaceC43160i<? extends InterfaceC40148a> interfaceC43160i, int i12) {
            super(2);
            this.f124778l = aVar;
            this.f124779m = lVar;
            this.f124780n = lVar2;
            this.f124781o = uVar;
            this.f124782p = interfaceC43160i;
            this.f124783q = i12;
        }

        @Override // Y41.p
        public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(this.f124783q | 1);
            com.akita.compose.component.toast_bar.u uVar = this.f124781o;
            InterfaceC43160i<InterfaceC40148a> interfaceC43160i = this.f124782p;
            C29533h0.b(this.f124778l, this.f124779m, this.f124780n, uVar, interfaceC43160i, a12, iA2);
            return kotlin.G0.f406611a;
        }
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(@Y61.k com.avito.android.competitor_analytics.mvi.entity.b bVar, @Y61.k Y41.a<kotlin.G0> aVar, @Y61.k Y41.l<? super com.avito.android.competitor_analytics.mvi.entity.a, kotlin.G0> lVar, @Y61.k Y41.l<? super DeepLink, kotlin.G0> lVar2, @Y61.k InterfaceC43160i<? extends InterfaceC40148a> interfaceC43160i, @Y61.l androidx.compose.runtime.A a12, int i12) {
        androidx.compose.runtime.B bE2 = a12.E(-786856569);
        InterfaceC22204y1 interfaceC22204y1M = C22126m3.m(lVar, bE2);
        bE2.C(1589914909);
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
        b(aVar, (Y41.l) interfaceC22204y1M.getF42167b(), lVar2, uVarA, interfaceC43160i, bE2, 32768);
        bE2.C(1589925595);
        boolean zB2 = bE2.B(interfaceC22204y1M);
        Object objT2 = bE2.t();
        if (zB2 || objT2 == obj) {
            objT2 = new a(interfaceC22204y1M);
            bE2.H(objT2);
        }
        bE2.X(false);
        com.akita.compose.component.bottom_sheet.H.a((Y41.a) objT2, null, null, uVarA, androidx.compose.runtime.internal.r.c(-711449989, new b(interfaceC22196w1), bE2), null, null, false, false, c.f124753l, null, null, androidx.compose.runtime.internal.r.c(103655527, new d(bVar, interfaceC22204y1M, interfaceC22196w1), bE2), bE2, 24576, 384, 3558);
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new e(bVar, aVar, lVar, lVar2, interfaceC43160i, i12);
        }
    }

    @InterfaceC22132o
    public static final void b(Y41.a<kotlin.G0> aVar, Y41.l<? super com.avito.android.competitor_analytics.mvi.entity.a, kotlin.G0> lVar, Y41.l<? super DeepLink, kotlin.G0> lVar2, com.akita.compose.component.toast_bar.u uVar, InterfaceC43160i<? extends InterfaceC40148a> interfaceC43160i, androidx.compose.runtime.A a12, int i12) {
        androidx.compose.runtime.B bE2 = a12.E(-1983942428);
        InterfaceC22204y1 interfaceC22204y1M = C22126m3.m(lVar, bE2);
        InterfaceC22204y1 interfaceC22204y1M2 = C22126m3.m(aVar, bE2);
        InterfaceC22204y1 interfaceC22204y1M3 = C22126m3.m(lVar2, bE2);
        com.akita.compose.theme.re23.b.f63983a.getClass();
        C22187u0.d(new f(interfaceC43160i, interfaceC22204y1M2, uVar, com.akita.compose.theme.re23.b.u(bE2).getF66806c(), interfaceC22204y1M, com.akita.compose.theme.re23.b.u(bE2).getF66804a(), interfaceC22204y1M3, null), bE2, interfaceC43160i);
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new g(aVar, lVar, lVar2, uVar, interfaceC43160i, i12);
        }
    }

    public static final void c(com.akita.compose.component.toast_bar.u uVar, int i12, androidx.compose.runtime.A a12, int i13) {
        int i14;
        androidx.compose.runtime.B bE2 = a12.E(1475972354);
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
            Y41.p<InterfaceC22413h, Integer, kotlin.G0> pVar = InterfaceC22413h.a.f40799j;
            if (bE2.f37887P || !kotlin.jvm.internal.L.f(bE2.t(), Integer.valueOf(i15))) {
                AK.c.y(i15, bE2, i15, pVar);
            }
            R3.b(InterfaceC22413h.a.f40793d, bE2, vVarC);
            androidx.compose.ui.v vVarD2 = C20644z.f28804a.d(aVar, InterfaceC22215f.a.f39077c);
            int i16 = InterfaceC20639x2.f28800a;
            com.akita.compose.component.toast_bar.q.b(uVar, R1.m(N2.b(vVarD2, A3.b(bE2)), 0.0f, 0.0f, 0.0f, com.avito.android.competitor_analytics.util.c.b(bE2, i12), 7), null, bE2, i14 & 14, 4);
            bE2.X(true);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new C29531g0(uVar, i12, i13);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x027c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(com.avito.android.competitor_analytics.mvi.entity.b r25, Y41.l r26, Y41.l r27, float r28, androidx.compose.runtime.A r29, int r30) {
        /*
            Method dump skipped, instructions count: 644
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.competitor_analytics.ui.C29533h0.d(com.avito.android.competitor_analytics.mvi.entity.b, Y41.l, Y41.l, float, androidx.compose.runtime.A, int):void");
    }
}
