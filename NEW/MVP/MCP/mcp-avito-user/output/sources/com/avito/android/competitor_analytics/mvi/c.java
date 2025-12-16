package com.avito.android.competitor_analytics.mvi;

import Y41.p;
import androidx.compose.runtime.internal.P;
import com.avito.android.competitor_analytics.domain.model.StateType;
import com.avito.android.competitor_analytics.mvi.entity.CompetitorAnalyticsInternalAction;
import com.avito.android.competitor_analytics.mvi.entity.a;
import com.avito.android.competitor_analytics.mvi.entity.b;
import com.yandex.metrica.YandexMetricaDefaultValues;
import java.util.List;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: CompetitorAnalyticsActor.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/competitor_analytics/mvi/c;", "Lcom/avito/android/arch/mvi/a;", "Lcom/avito/android/competitor_analytics/mvi/entity/a;", "Lcom/avito/android/competitor_analytics/mvi/entity/CompetitorAnalyticsInternalAction;", "Lcom/avito/android/competitor_analytics/mvi/entity/b;", "_avito_competitor-analytics_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class c implements com.avito.android.arch.mvi.a<com.avito.android.competitor_analytics.mvi.entity.a, CompetitorAnalyticsInternalAction, com.avito.android.competitor_analytics.mvi.entity.b> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.competitor_analytics.domain.d f124393a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.competitor_analytics.storage.a f124394b;

    /* compiled from: CompetitorAnalyticsActor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/competitor_analytics/mvi/entity/CompetitorAnalyticsInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.competitor_analytics.mvi.CompetitorAnalyticsActor$process$1", f = "CompetitorAnalyticsActor.kt", i = {0}, l = {38, 39}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
    public static final class a extends SuspendLambda implements p<InterfaceC43172j<? super CompetitorAnalyticsInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f124395q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f124396r;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.competitor_analytics.mvi.entity.b f124398t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.avito.android.competitor_analytics.mvi.entity.b bVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f124398t = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = c.this.new a(this.f124398t, continuation);
            aVar.f124396r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super CompetitorAnalyticsInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x0055  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r7.f124395q
                r2 = 0
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L23
                if (r1 == r4) goto L1b
                if (r1 != r3) goto L13
                kotlin.C42729a0.b(r8)
                goto L67
            L13:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L1b:
                java.lang.Object r1 = r7.f124396r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r8)
                goto L5a
            L23:
                kotlin.C42729a0.b(r8)
                java.lang.Object r8 = r7.f124396r
                r1 = r8
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                com.avito.android.competitor_analytics.mvi.entity.b r8 = r7.f124398t
                com.avito.android.competitor_analytics.mvi.entity.b$a r8 = r8.f124474e
                if (r8 == 0) goto L38
                long r5 = r8.f124486a
                java.lang.Long r8 = kotlin.coroutines.jvm.internal.Boxing.boxLong(r5)
                goto L39
            L38:
                r8 = r2
            L39:
                r7.f124396r = r1
                r7.f124395q = r4
                com.avito.android.competitor_analytics.mvi.c r4 = com.avito.android.competitor_analytics.mvi.c.this
                r4.getClass()
                if (r8 == 0) goto L55
                long r5 = r8.longValue()
                com.avito.android.competitor_analytics.storage.a r8 = r4.f124394b
                java.lang.Object r8 = r8.a(r5, r7)
                java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                if (r8 != r4) goto L55
                goto L57
            L55:
                kotlin.G0 r8 = kotlin.G0.f406611a
            L57:
                if (r8 != r0) goto L5a
                return r0
            L5a:
                com.avito.android.competitor_analytics.mvi.entity.CompetitorAnalyticsInternalAction$CloseBanner r8 = com.avito.android.competitor_analytics.mvi.entity.CompetitorAnalyticsInternalAction.CloseBanner.f124436b
                r7.f124396r = r2
                r7.f124395q = r3
                java.lang.Object r8 = r1.emit(r8, r7)
                if (r8 != r0) goto L67
                return r0
            L67:
                kotlin.G0 r8 = kotlin.G0.f406611a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.competitor_analytics.mvi.c.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: CompetitorAnalyticsActor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/competitor_analytics/mvi/entity/CompetitorAnalyticsInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.competitor_analytics.mvi.CompetitorAnalyticsActor$process$2", f = "CompetitorAnalyticsActor.kt", i = {0, 1}, l = {43, 44, 46}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
    public static final class b extends SuspendLambda implements p<InterfaceC43172j<? super CompetitorAnalyticsInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f124399q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f124400r;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.competitor_analytics.mvi.entity.b f124402t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(com.avito.android.competitor_analytics.mvi.entity.b bVar, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f124402t = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            b bVar = c.this.new b(this.f124402t, continuation);
            bVar.f124400r = obj;
            return bVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super CompetitorAnalyticsInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((b) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x0060  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x008c A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r9.f124399q
                r2 = 0
                com.avito.android.competitor_analytics.mvi.entity.b r3 = r9.f124402t
                r4 = 3
                r5 = 2
                r6 = 1
                if (r1 == 0) goto L31
                if (r1 == r6) goto L29
                if (r1 == r5) goto L21
                if (r1 != r4) goto L19
                kotlin.C42729a0.b(r10)
                goto L8d
            L19:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L21:
                java.lang.Object r1 = r9.f124400r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r10)
                goto L73
            L29:
                java.lang.Object r1 = r9.f124400r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r10)
                goto L66
            L31:
                kotlin.C42729a0.b(r10)
                java.lang.Object r10 = r9.f124400r
                kotlinx.coroutines.flow.j r10 = (kotlinx.coroutines.flow.InterfaceC43172j) r10
                com.avito.android.competitor_analytics.mvi.entity.b$a r1 = r3.f124474e
                if (r1 == 0) goto L43
                long r7 = r1.f124486a
                java.lang.Long r1 = kotlin.coroutines.jvm.internal.Boxing.boxLong(r7)
                goto L44
            L43:
                r1 = r2
            L44:
                r9.f124400r = r10
                r9.f124399q = r6
                com.avito.android.competitor_analytics.mvi.c r6 = com.avito.android.competitor_analytics.mvi.c.this
                r6.getClass()
                if (r1 == 0) goto L60
                long r7 = r1.longValue()
                com.avito.android.competitor_analytics.storage.a r1 = r6.f124394b
                java.lang.Object r1 = r1.a(r7, r9)
                java.lang.Object r6 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                if (r1 != r6) goto L60
                goto L62
            L60:
                kotlin.G0 r1 = kotlin.G0.f406611a
            L62:
                if (r1 != r0) goto L65
                return r0
            L65:
                r1 = r10
            L66:
                com.avito.android.competitor_analytics.mvi.entity.CompetitorAnalyticsInternalAction$CloseBanner r10 = com.avito.android.competitor_analytics.mvi.entity.CompetitorAnalyticsInternalAction.CloseBanner.f124436b
                r9.f124400r = r1
                r9.f124399q = r5
                java.lang.Object r10 = r1.emit(r10, r9)
                if (r10 != r0) goto L73
                return r0
            L73:
                com.avito.android.competitor_analytics.mvi.entity.b$a r10 = r3.f124474e
                if (r10 == 0) goto L8d
                com.avito.android.competitor_analytics.domain.model.ActionButton r10 = r10.f124490e
                com.avito.android.deep_linking.links.DeepLink r10 = r10.f124316b
                if (r10 == 0) goto L8d
                com.avito.android.competitor_analytics.mvi.entity.CompetitorAnalyticsInternalAction$HandleDeeplink r3 = new com.avito.android.competitor_analytics.mvi.entity.CompetitorAnalyticsInternalAction$HandleDeeplink
                r3.<init>(r10)
                r9.f124400r = r2
                r9.f124399q = r4
                java.lang.Object r10 = r1.emit(r3, r9)
                if (r10 != r0) goto L8d
                return r0
            L8d:
                kotlin.G0 r10 = kotlin.G0.f406611a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.competitor_analytics.mvi.c.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: CompetitorAnalyticsActor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/competitor_analytics/mvi/entity/CompetitorAnalyticsInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.competitor_analytics.mvi.CompetitorAnalyticsActor$process$3", f = "CompetitorAnalyticsActor.kt", i = {0, 0, 1, 1}, l = {53, 55, 57}, m = "invokeSuspend", n = {"$this$flow", "period", "$this$flow", "period"}, s = {"L$0", "L$1", "L$0", "L$1"})
    /* renamed from: com.avito.android.competitor_analytics.mvi.c$c, reason: collision with other inner class name */
    public static final class C3710c extends SuspendLambda implements p<InterfaceC43172j<? super CompetitorAnalyticsInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public b.h.a f124403q;

        /* renamed from: r, reason: collision with root package name */
        public c f124404r;

        /* renamed from: s, reason: collision with root package name */
        public int f124405s;

        /* renamed from: t, reason: collision with root package name */
        public /* synthetic */ Object f124406t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.competitor_analytics.mvi.entity.b f124407u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.competitor_analytics.mvi.entity.a f124408v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ c f124409w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3710c(com.avito.android.competitor_analytics.mvi.entity.b bVar, com.avito.android.competitor_analytics.mvi.entity.a aVar, c cVar, Continuation<? super C3710c> continuation) {
            super(2, continuation);
            this.f124407u = bVar;
            this.f124408v = aVar;
            this.f124409w = cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            C3710c c3710c = new C3710c(this.f124407u, this.f124408v, this.f124409w, continuation);
            c3710c.f124406t = obj;
            return c3710c;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super CompetitorAnalyticsInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((C3710c) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x0078  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x00a8 A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r8.f124405s
                r2 = 3
                r3 = 2
                r4 = 1
                r5 = 0
                if (r1 == 0) goto L38
                if (r1 == r4) goto L29
                if (r1 == r3) goto L1f
                if (r1 != r2) goto L17
                kotlin.C42729a0.b(r9)
                goto La9
            L17:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L1f:
                com.avito.android.competitor_analytics.mvi.entity.b$h$a r1 = r8.f124403q
                java.lang.Object r3 = r8.f124406t
                kotlinx.coroutines.flow.j r3 = (kotlinx.coroutines.flow.InterfaceC43172j) r3
                kotlin.C42729a0.b(r9)
                goto L90
            L29:
                com.avito.android.competitor_analytics.mvi.c r1 = r8.f124404r
                com.avito.android.competitor_analytics.mvi.entity.b$h$a r4 = r8.f124403q
                java.lang.Object r6 = r8.f124406t
                kotlinx.coroutines.flow.j r6 = (kotlinx.coroutines.flow.InterfaceC43172j) r6
                kotlin.C42729a0.b(r9)
                r9 = r6
                r6 = r1
                r1 = r4
                goto L74
            L38:
                kotlin.C42729a0.b(r9)
                java.lang.Object r9 = r8.f124406t
                kotlinx.coroutines.flow.j r9 = (kotlinx.coroutines.flow.InterfaceC43172j) r9
                com.avito.android.competitor_analytics.mvi.entity.b r1 = r8.f124407u
                com.avito.android.competitor_analytics.mvi.entity.b$h r1 = r1.f124475f
                com.avito.android.competitor_analytics.mvi.entity.a r6 = r8.f124408v
                if (r1 == 0) goto L57
                java.util.List<com.avito.android.competitor_analytics.mvi.entity.b$h$a> r1 = r1.f124524b
                if (r1 == 0) goto L57
                r7 = r6
                com.avito.android.competitor_analytics.mvi.entity.a$k r7 = (com.avito.android.competitor_analytics.mvi.entity.a.k) r7
                int r7 = r7.f124466a
                java.lang.Object r1 = kotlin.collections.C42745f0.K(r7, r1)
                com.avito.android.competitor_analytics.mvi.entity.b$h$a r1 = (com.avito.android.competitor_analytics.mvi.entity.b.h.a) r1
                goto L58
            L57:
                r1 = r5
            L58:
                if (r1 == 0) goto La9
                com.avito.android.competitor_analytics.mvi.entity.CompetitorAnalyticsInternalAction$PeriodClicked r7 = new com.avito.android.competitor_analytics.mvi.entity.CompetitorAnalyticsInternalAction$PeriodClicked
                com.avito.android.competitor_analytics.mvi.entity.a$k r6 = (com.avito.android.competitor_analytics.mvi.entity.a.k) r6
                int r6 = r6.f124466a
                r7.<init>(r1, r6)
                r8.f124406t = r9
                r8.f124403q = r1
                com.avito.android.competitor_analytics.mvi.c r6 = r8.f124409w
                r8.f124404r = r6
                r8.f124405s = r4
                java.lang.Object r4 = r9.emit(r7, r8)
                if (r4 != r0) goto L74
                return r0
            L74:
                java.lang.String r4 = r1.f124528c
                if (r4 != 0) goto L91
                com.avito.android.competitor_analytics.domain.d r4 = r6.f124393a
                com.avito.android.competitor_analytics.domain.model.StateType r6 = r1.f124526a
                kotlinx.coroutines.flow.i r4 = r4.a(r6)
                r8.f124406t = r9
                r8.f124403q = r1
                r8.f124404r = r5
                r8.f124405s = r3
                java.lang.Object r3 = kotlinx.coroutines.flow.C43175k.u(r8, r4, r9)
                if (r3 != r0) goto L8f
                return r0
            L8f:
                r3 = r9
            L90:
                r9 = r3
            L91:
                com.avito.android.competitor_analytics.mvi.entity.CompetitorAnalyticsInternalAction$TrackChangePeriodEvent r3 = new com.avito.android.competitor_analytics.mvi.entity.CompetitorAnalyticsInternalAction$TrackChangePeriodEvent
                com.avito.android.competitor_analytics.domain.model.StateType r1 = r1.f124526a
                java.lang.String r1 = r1.f124342b
                r3.<init>(r1)
                r8.f124406t = r5
                r8.f124403q = r5
                r8.f124404r = r5
                r8.f124405s = r2
                java.lang.Object r9 = r9.emit(r3, r8)
                if (r9 != r0) goto La9
                return r0
            La9:
                kotlin.G0 r9 = kotlin.G0.f406611a
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.competitor_analytics.mvi.c.C3710c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: CompetitorAnalyticsActor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/competitor_analytics/mvi/entity/CompetitorAnalyticsInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.competitor_analytics.mvi.CompetitorAnalyticsActor$process$4", f = "CompetitorAnalyticsActor.kt", i = {0, 0}, l = {64, 65}, m = "invokeSuspend", n = {"$this$flow", "period"}, s = {"L$0", "L$1"})
    public static final class d extends SuspendLambda implements p<InterfaceC43172j<? super CompetitorAnalyticsInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public b.h.a f124410q;

        /* renamed from: r, reason: collision with root package name */
        public int f124411r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object f124412s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.competitor_analytics.mvi.entity.b f124413t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.competitor_analytics.mvi.entity.a f124414u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(com.avito.android.competitor_analytics.mvi.entity.b bVar, com.avito.android.competitor_analytics.mvi.entity.a aVar, Continuation<? super d> continuation) {
            super(2, continuation);
            this.f124413t = bVar;
            this.f124414u = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            d dVar = new d(this.f124413t, this.f124414u, continuation);
            dVar.f124412s = obj;
            return dVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super CompetitorAnalyticsInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((d) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            InterfaceC43172j interfaceC43172j;
            b.h.a aVar;
            InterfaceC43172j interfaceC43172j2;
            List<b.h.a> list;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f124411r;
            if (i12 == 0) {
                C42729a0.b(obj);
                interfaceC43172j = (InterfaceC43172j) this.f124412s;
                b.h hVar = this.f124413t.f124475f;
                aVar = (hVar == null || (list = hVar.f124524b) == null) ? null : (b.h.a) C42745f0.K(((a.j) this.f124414u).f124465a, list);
                if (aVar != null) {
                    String str = aVar.f124527b;
                    if (str != null) {
                        CompetitorAnalyticsInternalAction.ShowMessage showMessage = new CompetitorAnalyticsInternalAction.ShowMessage(str);
                        this.f124412s = interfaceC43172j;
                        this.f124410q = aVar;
                        this.f124411r = 1;
                        if (interfaceC43172j.emit(showMessage, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        interfaceC43172j2 = interfaceC43172j;
                        interfaceC43172j = interfaceC43172j2;
                    }
                }
                return G0.f406611a;
            }
            if (i12 != 1) {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
                return G0.f406611a;
            }
            aVar = this.f124410q;
            interfaceC43172j2 = (InterfaceC43172j) this.f124412s;
            C42729a0.b(obj);
            interfaceC43172j = interfaceC43172j2;
            CompetitorAnalyticsInternalAction.TrackChangePeriodEvent trackChangePeriodEvent = new CompetitorAnalyticsInternalAction.TrackChangePeriodEvent(aVar.f124526a.f124342b);
            this.f124412s = null;
            this.f124410q = null;
            this.f124411r = 2;
            if (interfaceC43172j.emit(trackChangePeriodEvent, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return G0.f406611a;
        }
    }

    /* compiled from: CompetitorAnalyticsActor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/competitor_analytics/mvi/entity/CompetitorAnalyticsInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.competitor_analytics.mvi.CompetitorAnalyticsActor$process$5", f = "CompetitorAnalyticsActor.kt", i = {0}, l = {74, 76}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
    public static final class e extends SuspendLambda implements p<InterfaceC43172j<? super CompetitorAnalyticsInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f124415q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f124416r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.competitor_analytics.mvi.entity.a f124417s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(com.avito.android.competitor_analytics.mvi.entity.a aVar, Continuation<? super e> continuation) {
            super(2, continuation);
            this.f124417s = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            e eVar = new e(this.f124417s, continuation);
            eVar.f124416r = obj;
            return eVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super CompetitorAnalyticsInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((e) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            InterfaceC43172j interfaceC43172j;
            String str;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f124415q;
            com.avito.android.competitor_analytics.mvi.entity.a aVar = this.f124417s;
            if (i12 == 0) {
                C42729a0.b(obj);
                interfaceC43172j = (InterfaceC43172j) this.f124416r;
                CompetitorAnalyticsInternalAction.ChartMetricClicked chartMetricClicked = new CompetitorAnalyticsInternalAction.ChartMetricClicked(((a.c) aVar).f124458a);
                this.f124416r = interfaceC43172j;
                this.f124415q = 1;
                if (interfaceC43172j.emit(chartMetricClicked, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    if (i12 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C42729a0.b(obj);
                    return G0.f406611a;
                }
                interfaceC43172j = (InterfaceC43172j) this.f124416r;
                C42729a0.b(obj);
            }
            b.g.C3713b c3713b = ((a.c) aVar).f124458a.f124507g;
            if (c3713b != null && (str = c3713b.f124513c) != null) {
                CompetitorAnalyticsInternalAction.TrackClickOnChartMetricEvent trackClickOnChartMetricEvent = new CompetitorAnalyticsInternalAction.TrackClickOnChartMetricEvent(str);
                this.f124416r = null;
                this.f124415q = 2;
                if (interfaceC43172j.emit(trackClickOnChartMetricEvent, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return G0.f406611a;
        }
    }

    /* compiled from: CompetitorAnalyticsActor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/competitor_analytics/mvi/entity/CompetitorAnalyticsInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.competitor_analytics.mvi.CompetitorAnalyticsActor$process$6", f = "CompetitorAnalyticsActor.kt", i = {}, l = {81}, m = "invokeSuspend", n = {}, s = {})
    public static final class f extends SuspendLambda implements p<InterfaceC43172j<? super CompetitorAnalyticsInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f124418q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f124419r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.competitor_analytics.mvi.entity.a f124420s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(com.avito.android.competitor_analytics.mvi.entity.a aVar, Continuation<? super f> continuation) {
            super(2, continuation);
            this.f124420s = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            f fVar = new f(this.f124420s, continuation);
            fVar.f124419r = obj;
            return fVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super CompetitorAnalyticsInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((f) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f124418q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f124419r;
                CompetitorAnalyticsInternalAction.TrackShowChartEvent trackShowChartEvent = new CompetitorAnalyticsInternalAction.TrackShowChartEvent(((a.d) this.f124420s).f124459a);
                this.f124418q = 1;
                if (interfaceC43172j.emit(trackShowChartEvent, this) == coroutine_suspended) {
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

    /* compiled from: CompetitorAnalyticsActor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/competitor_analytics/mvi/entity/CompetitorAnalyticsInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.competitor_analytics.mvi.CompetitorAnalyticsActor$process$7", f = "CompetitorAnalyticsActor.kt", i = {}, l = {85}, m = "invokeSuspend", n = {}, s = {})
    public static final class g extends SuspendLambda implements p<InterfaceC43172j<? super CompetitorAnalyticsInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f124421q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f124422r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.competitor_analytics.mvi.entity.a f124423s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(com.avito.android.competitor_analytics.mvi.entity.a aVar, Continuation<? super g> continuation) {
            super(2, continuation);
            this.f124423s = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            g gVar = new g(this.f124423s, continuation);
            gVar.f124422r = obj;
            return gVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super CompetitorAnalyticsInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((g) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f124421q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f124422r;
                CompetitorAnalyticsInternalAction.TrackClickInChartEvent trackClickInChartEvent = new CompetitorAnalyticsInternalAction.TrackClickInChartEvent(((a.e) this.f124423s).f124460a);
                this.f124421q = 1;
                if (interfaceC43172j.emit(trackClickInChartEvent, this) == coroutine_suspended) {
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

    /* compiled from: CompetitorAnalyticsActor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/competitor_analytics/mvi/entity/CompetitorAnalyticsInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.competitor_analytics.mvi.CompetitorAnalyticsActor$process$8", f = "CompetitorAnalyticsActor.kt", i = {0}, l = {89, YandexMetricaDefaultValues.DEFAULT_DISPATCH_PERIOD_SECONDS}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
    public static final class h extends SuspendLambda implements p<InterfaceC43172j<? super CompetitorAnalyticsInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f124424q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f124425r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.competitor_analytics.mvi.entity.a f124426s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(com.avito.android.competitor_analytics.mvi.entity.a aVar, Continuation<? super h> continuation) {
            super(2, continuation);
            this.f124426s = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            h hVar = new h(this.f124426s, continuation);
            hVar.f124425r = obj;
            return hVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super CompetitorAnalyticsInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((h) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            InterfaceC43172j interfaceC43172j;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f124424q;
            com.avito.android.competitor_analytics.mvi.entity.a aVar = this.f124426s;
            if (i12 == 0) {
                C42729a0.b(obj);
                interfaceC43172j = (InterfaceC43172j) this.f124425r;
                CompetitorAnalyticsInternalAction.SuggestsBlockClicked suggestsBlockClicked = new CompetitorAnalyticsInternalAction.SuggestsBlockClicked(((a.m) aVar).f124468a);
                this.f124425r = interfaceC43172j;
                this.f124424q = 1;
                if (interfaceC43172j.emit(suggestsBlockClicked, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    if (i12 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C42729a0.b(obj);
                    return G0.f406611a;
                }
                interfaceC43172j = (InterfaceC43172j) this.f124425r;
                C42729a0.b(obj);
            }
            CompetitorAnalyticsInternalAction.TrackClickSuggestsBlockEvent trackClickSuggestsBlockEvent = new CompetitorAnalyticsInternalAction.TrackClickSuggestsBlockEvent(((a.m) aVar).f124468a);
            this.f124425r = null;
            this.f124424q = 2;
            if (interfaceC43172j.emit(trackClickSuggestsBlockEvent, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return G0.f406611a;
        }
    }

    /* compiled from: CompetitorAnalyticsActor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/competitor_analytics/mvi/entity/CompetitorAnalyticsInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.competitor_analytics.mvi.CompetitorAnalyticsActor$process$9", f = "CompetitorAnalyticsActor.kt", i = {}, l = {97}, m = "invokeSuspend", n = {}, s = {})
    public static final class i extends SuspendLambda implements p<InterfaceC43172j<? super CompetitorAnalyticsInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f124427q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f124428r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.competitor_analytics.mvi.entity.b f124429s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(com.avito.android.competitor_analytics.mvi.entity.b bVar, Continuation<? super i> continuation) {
            super(2, continuation);
            this.f124429s = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            i iVar = new i(this.f124429s, continuation);
            iVar.f124428r = obj;
            return iVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super CompetitorAnalyticsInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((i) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            int size;
            b.k kVar;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f124427q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f124428r;
                com.avito.android.competitor_analytics.mvi.entity.b bVar = this.f124429s;
                b.h.a aVar = bVar.f124473d;
                if (aVar == null || (kVar = aVar.f124531f) == null) {
                    b.j jVar = bVar.f124477h;
                    size = jVar != null ? jVar.f124537b.size() : 0;
                } else {
                    size = kVar.f124545d.size();
                }
                CompetitorAnalyticsInternalAction.TrackShowCompetitorAnalyticsEvent trackShowCompetitorAnalyticsEvent = new CompetitorAnalyticsInternalAction.TrackShowCompetitorAnalyticsEvent(size);
                this.f124427q = 1;
                if (interfaceC43172j.emit(trackShowCompetitorAnalyticsEvent, this) == coroutine_suspended) {
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

    @Inject
    public c(@Y61.k com.avito.android.competitor_analytics.domain.d dVar, @Y61.k com.avito.android.competitor_analytics.storage.a aVar) {
        this.f124393a = dVar;
        this.f124394b = aVar;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return com.avito.android.arch.mvi.utils.h.e(c43197r1, com.avito.android.competitor_analytics.mvi.a.f124390l, new com.avito.android.competitor_analytics.mvi.b(this, aVar), 1000L);
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final InterfaceC43160i<CompetitorAnalyticsInternalAction> b(@Y61.k com.avito.android.competitor_analytics.mvi.entity.a aVar, @Y61.k com.avito.android.competitor_analytics.mvi.entity.b bVar) {
        if (aVar instanceof a.f) {
            return new C43210w(CompetitorAnalyticsInternalAction.Close.f124435b);
        }
        if (aVar instanceof a.C3711a) {
            return new C43210w(CompetitorAnalyticsInternalAction.Back.f124433b);
        }
        if (aVar instanceof a.l) {
            StateType stateType = ((a.l) aVar).f124467a;
            if (stateType == null) {
                stateType = StateType.f124336c;
            }
            return this.f124393a.a(stateType);
        }
        if (aVar instanceof a.g) {
            return C43175k.G(new a(bVar, null));
        }
        if (aVar instanceof a.b) {
            return C43175k.G(new b(bVar, null));
        }
        if (aVar instanceof a.k) {
            return C43175k.G(new C3710c(bVar, aVar, this, null));
        }
        if (aVar instanceof a.j) {
            return C43175k.G(new d(bVar, aVar, null));
        }
        if (aVar instanceof a.i) {
            return new C43210w(new CompetitorAnalyticsInternalAction.HandleDeeplink(((a.i) aVar).f124464a));
        }
        if (aVar instanceof a.c) {
            return C43175k.G(new e(aVar, null));
        }
        if (aVar instanceof a.d) {
            return C43175k.G(new f(aVar, null));
        }
        if (aVar instanceof a.e) {
            return C43175k.G(new g(aVar, null));
        }
        if (aVar instanceof a.m) {
            return C43175k.G(new h(aVar, null));
        }
        if (aVar instanceof a.h) {
            return C43175k.G(new i(bVar, null));
        }
        throw new NoWhenBranchMatchedException();
    }
}
