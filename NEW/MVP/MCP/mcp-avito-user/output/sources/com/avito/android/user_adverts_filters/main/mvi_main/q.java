package com.avito.android.user_adverts_filters.main.mvi_main;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.user_adverts_filters.main.mvi_main.entity.MainFiltersInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.internal.AbstractC43168f;

/* compiled from: SafeCollector.common.kt */
@s0
@Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/p1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class q implements InterfaceC43160i<MainFiltersInternalAction> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC43160i f316298b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Y41.a f316299c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r f316300d;

    /* compiled from: Emitters.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/p1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements InterfaceC43172j {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43172j f316301b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Y41.a f316302c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ r f316303d;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        @DebugMetadata(c = "com.avito.android.user_adverts_filters.main.mvi_main.MainFiltersActor$processSubmitAction$$inlined$map$1$2", f = "MainFiltersActor.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
        /* renamed from: com.avito.android.user_adverts_filters.main.mvi_main.q$a$a, reason: collision with other inner class name */
        public static final class C9822a extends ContinuationImpl {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f316304q;

            /* renamed from: r, reason: collision with root package name */
            public int f316305r;

            public C9822a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                this.f316304q = obj;
                this.f316305r |= BeduinInputModel.MIN_TEXT_VERSION;
                return a.this.emit(null, this);
            }
        }

        public a(InterfaceC43172j interfaceC43172j, Y41.a aVar, r rVar) {
            this.f316301b = interfaceC43172j;
            this.f316302c = aVar;
            this.f316303d = rVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // kotlinx.coroutines.flow.InterfaceC43172j
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(java.lang.Object r11, @Y61.k kotlin.coroutines.Continuation r12) {
            /*
                r10 = this;
                boolean r0 = r12 instanceof com.avito.android.user_adverts_filters.main.mvi_main.q.a.C9822a
                if (r0 == 0) goto L13
                r0 = r12
                com.avito.android.user_adverts_filters.main.mvi_main.q$a$a r0 = (com.avito.android.user_adverts_filters.main.mvi_main.q.a.C9822a) r0
                int r1 = r0.f316305r
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f316305r = r1
                goto L18
            L13:
                com.avito.android.user_adverts_filters.main.mvi_main.q$a$a r0 = new com.avito.android.user_adverts_filters.main.mvi_main.q$a$a
                r0.<init>(r12)
            L18:
                java.lang.Object r12 = r0.f316304q
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r0.f316305r
                r3 = 1
                if (r2 == 0) goto L31
                if (r2 != r3) goto L29
                kotlin.C42729a0.b(r12)
                goto L97
            L29:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r12)
                throw r11
            L31:
                kotlin.C42729a0.b(r12)
                pJ0.d r11 = (pJ0.d) r11
                Y41.a r12 = r10.f316302c
                java.lang.Object r12 = r12.invoke()
                rJ0.c r12 = (rJ0.c) r12
                java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
                r2.<init>()
                java.util.LinkedHashMap r4 = new java.util.LinkedHashMap
                r4.<init>()
                java.util.Map<com.avito.android.user_adverts_filters.main.model.UserAdvertsFiltersBeduinScreen, rJ0.c$a> r5 = r12.f429742d
                java.util.Collection r5 = r5.values()
                java.util.Iterator r5 = r5.iterator()
            L52:
                boolean r6 = r5.hasNext()
                if (r6 == 0) goto L77
                java.lang.Object r6 = r5.next()
                rJ0.c$a r6 = (rJ0.c.a) r6
                java.util.Map<java.lang.String, java.lang.Object> r7 = r6.f429745a
                java.util.List<java.lang.String> r8 = r11.f428504a
                com.avito.android.user_adverts_filters.main.mvi_main.r r9 = r10.f316303d
                java.util.Map r7 = com.avito.android.user_adverts_filters.main.mvi_main.r.c(r9, r7, r8)
                r2.putAll(r7)
                java.util.List<java.lang.String> r7 = r11.f428504a
                java.util.Map<java.lang.String, java.lang.Object> r6 = r6.f429746b
                java.util.Map r6 = com.avito.android.user_adverts_filters.main.mvi_main.r.c(r9, r6, r7)
                r4.putAll(r6)
                goto L52
            L77:
                com.avito.android.user_adverts_filters.UserAdvertsFiltersData r11 = r12.f429740b
                java.util.Map<java.lang.String, java.lang.Object> r12 = r11.f315951b
                boolean r12 = r2.equals(r12)
                if (r12 == 0) goto L84
                com.avito.android.user_adverts_filters.main.mvi_main.entity.MainFiltersInternalAction$Close r11 = com.avito.android.user_adverts_filters.main.mvi_main.entity.MainFiltersInternalAction.Close.f316224b
                goto L8c
            L84:
                com.avito.android.user_adverts_filters.main.mvi_main.entity.MainFiltersInternalAction$ApplyFilters r12 = new com.avito.android.user_adverts_filters.main.mvi_main.entity.MainFiltersInternalAction$ApplyFilters
                java.lang.String r11 = r11.f315953d
                r12.<init>(r11, r2, r4)
                r11 = r12
            L8c:
                r0.f316305r = r3
                kotlinx.coroutines.flow.j r12 = r10.f316301b
                java.lang.Object r11 = r12.emit(r11, r0)
                if (r11 != r1) goto L97
                return r1
            L97:
                kotlin.G0 r11 = kotlin.G0.f406611a
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.user_adverts_filters.main.mvi_main.q.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    public q(InterfaceC43160i interfaceC43160i, Y41.a aVar, r rVar) {
        this.f316298b = interfaceC43160i;
        this.f316299c = aVar;
        this.f316300d = rVar;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC43160i
    @Y61.l
    public final Object collect(@Y61.k InterfaceC43172j<? super MainFiltersInternalAction> interfaceC43172j, @Y61.k Continuation continuation) {
        Object objCollect = ((AbstractC43168f) this.f316298b).collect(new a(interfaceC43172j, this.f316299c, this.f316300d), continuation);
        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
    }
}
