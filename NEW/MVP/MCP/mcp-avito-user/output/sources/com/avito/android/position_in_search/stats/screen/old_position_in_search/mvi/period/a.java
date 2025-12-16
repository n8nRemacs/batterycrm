package com.avito.android.position_in_search.stats.screen.old_position_in_search.mvi.period;

import X80.c;
import androidx.compose.runtime.internal.P;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.position_in_search.stats.screen.old_position_in_search.domain.model.PeriodSortDirection;
import com.avito.android.position_in_search.stats.screen.old_position_in_search.domain.model.PositionInfoPeriodAction;
import com.avito.android.position_in_search.stats.screen.old_position_in_search.mvi.period.entity.PeriodInfoInternalAction;
import com.avito.android.util.R0;
import fv.C40482a;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43137a0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: PeriodInfoActor.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/mvi/period/a;", "Lcom/avito/android/arch/mvi/a;", "LX80/b;", "Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/mvi/period/entity/PeriodInfoInternalAction;", "LX80/j;", "a", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class a implements com.avito.android.arch.mvi.a<X80.b, PeriodInfoInternalAction, X80.j> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.position_in_search.stats.screen.old_position_in_search.domain.f f220556a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final R0 f220557b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f220558c;

    /* compiled from: PeriodInfoActor.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/mvi/period/a$a;", "", "<init>", "()V", "", "LOADING_DEBOUNCE_MS", "J", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.position_in_search.stats.screen.old_position_in_search.mvi.period.a$a, reason: collision with other inner class name */
    public static final class C6636a {
        public /* synthetic */ C6636a(C42822w c42822w) {
            this();
        }

        public C6636a() {
        }
    }

    /* compiled from: PeriodInfoActor.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b {
        static {
            int[] iArr = new int[PeriodSortDirection.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                PeriodSortDirection periodSortDirection = PeriodSortDirection.f220409c;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* compiled from: SafeCollector.common.kt */
    @s0
    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/p1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c implements InterfaceC43160i<PeriodInfoInternalAction.LoadingAction> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43160i f220559b;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/p1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.position_in_search.stats.screen.old_position_in_search.mvi.period.a$c$a, reason: collision with other inner class name */
        public static final class C6637a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43172j f220560b;

            /* compiled from: Emitters.kt */
            @s0
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "com.avito.android.position_in_search.stats.screen.old_position_in_search.mvi.period.PeriodInfoActor$info$$inlined$map$1$2", f = "PeriodInfoActor.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
            /* renamed from: com.avito.android.position_in_search.stats.screen.old_position_in_search.mvi.period.a$c$a$a, reason: collision with other inner class name */
            public static final class C6638a extends ContinuationImpl {

                /* renamed from: q, reason: collision with root package name */
                public /* synthetic */ Object f220561q;

                /* renamed from: r, reason: collision with root package name */
                public int f220562r;

                public C6638a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    this.f220561q = obj;
                    this.f220562r |= BeduinInputModel.MIN_TEXT_VERSION;
                    return C6637a.this.emit(null, this);
                }
            }

            public C6637a(InterfaceC43172j interfaceC43172j) {
                this.f220560b = interfaceC43172j;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.InterfaceC43172j
            @Y61.l
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r5, @Y61.k kotlin.coroutines.Continuation r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof com.avito.android.position_in_search.stats.screen.old_position_in_search.mvi.period.a.c.C6637a.C6638a
                    if (r0 == 0) goto L13
                    r0 = r6
                    com.avito.android.position_in_search.stats.screen.old_position_in_search.mvi.period.a$c$a$a r0 = (com.avito.android.position_in_search.stats.screen.old_position_in_search.mvi.period.a.c.C6637a.C6638a) r0
                    int r1 = r0.f220562r
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f220562r = r1
                    goto L18
                L13:
                    com.avito.android.position_in_search.stats.screen.old_position_in_search.mvi.period.a$c$a$a r0 = new com.avito.android.position_in_search.stats.screen.old_position_in_search.mvi.period.a$c$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f220561q
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f220562r
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    kotlin.C42729a0.b(r6)
                    goto L60
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    kotlin.C42729a0.b(r6)
                    V80.j r5 = (V80.j) r5
                    boolean r6 = r5 instanceof V80.j.a
                    if (r6 == 0) goto L46
                    com.avito.android.position_in_search.stats.screen.old_position_in_search.mvi.period.entity.PeriodInfoInternalAction$LoadingError r6 = new com.avito.android.position_in_search.stats.screen.old_position_in_search.mvi.period.entity.PeriodInfoInternalAction$LoadingError
                    V80.j$a r5 = (V80.j.a) r5
                    com.avito.android.remote.error.ApiError r2 = r5.f16979a
                    java.lang.Throwable r5 = r5.f16980b
                    r6.<init>(r2, r5)
                    goto L55
                L46:
                    boolean r6 = r5 instanceof V80.j.b
                    if (r6 == 0) goto L63
                    com.avito.android.position_in_search.stats.screen.old_position_in_search.mvi.period.entity.PeriodInfoInternalAction$LoadingResult r6 = new com.avito.android.position_in_search.stats.screen.old_position_in_search.mvi.period.entity.PeriodInfoInternalAction$LoadingResult
                    V80.j$b r5 = (V80.j.b) r5
                    com.avito.android.position_in_search.stats.screen.old_position_in_search.domain.model.PositionInfoPeriod r2 = r5.f16981a
                    V80.c r5 = r5.f16982b
                    r6.<init>(r2, r5)
                L55:
                    r0.f220562r = r3
                    kotlinx.coroutines.flow.j r5 = r4.f220560b
                    java.lang.Object r5 = r5.emit(r6, r0)
                    if (r5 != r1) goto L60
                    return r1
                L60:
                    kotlin.G0 r5 = kotlin.G0.f406611a
                    return r5
                L63:
                    kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
                    r5.<init>()
                    throw r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.avito.android.position_in_search.stats.screen.old_position_in_search.mvi.period.a.c.C6637a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public c(InterfaceC43160i interfaceC43160i) {
            this.f220559b = interfaceC43160i;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43160i
        @Y61.l
        public final Object collect(@Y61.k InterfaceC43172j<? super PeriodInfoInternalAction.LoadingAction> interfaceC43172j, @Y61.k Continuation continuation) {
            Object objCollect = this.f220559b.collect(new C6637a(interfaceC43172j), continuation);
            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
        }
    }

    /* compiled from: PeriodInfoActor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "LV80/j;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.position_in_search.stats.screen.old_position_in_search.mvi.period.PeriodInfoActor$info$1", f = "PeriodInfoActor.kt", i = {}, l = {250, 250}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements Y41.p<InterfaceC43172j<? super V80.j>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f220564q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f220565r;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ V80.i f220567t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(V80.i iVar, Continuation<? super d> continuation) {
            super(2, continuation);
            this.f220567t = iVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            d dVar = a.this.new d(this.f220567t, continuation);
            dVar.f220565r = obj;
            return dVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super V80.j> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((d) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            InterfaceC43172j interfaceC43172j;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f220564q;
            if (i12 == 0) {
                C42729a0.b(obj);
                interfaceC43172j = (InterfaceC43172j) this.f220565r;
                com.avito.android.position_in_search.stats.screen.old_position_in_search.domain.f fVar = a.this.f220556a;
                this.f220565r = interfaceC43172j;
                this.f220564q = 1;
                obj = fVar.a(this.f220567t, this);
                if (obj == coroutine_suspended) {
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
                interfaceC43172j = (InterfaceC43172j) this.f220565r;
                C42729a0.b(obj);
            }
            this.f220565r = null;
            this.f220564q = 2;
            if (interfaceC43172j.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return G0.f406611a;
        }
    }

    /* compiled from: PeriodInfoActor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/mvi/period/entity/PeriodInfoInternalAction$LoadingAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.position_in_search.stats.screen.old_position_in_search.mvi.period.PeriodInfoActor$info$3", f = "PeriodInfoActor.kt", i = {}, l = {260}, m = "invokeSuspend", n = {}, s = {})
    public static final class e extends SuspendLambda implements Y41.p<InterfaceC43172j<? super PeriodInfoInternalAction.LoadingAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f220568q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f220569r;

        public e() {
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            e eVar = new e(2, continuation);
            eVar.f220569r = obj;
            return eVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super PeriodInfoInternalAction.LoadingAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((e) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f220568q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f220569r;
                PeriodInfoInternalAction.LoadingStart loadingStart = new PeriodInfoInternalAction.LoadingStart();
                this.f220568q = 1;
                if (interfaceC43172j.emit(loadingStart, this) == coroutine_suspended) {
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

    static {
        new C6636a(null);
    }

    @Inject
    public a(@Y61.k com.avito.android.position_in_search.stats.screen.old_position_in_search.domain.f fVar, @Y61.k R0 r02, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar) {
        this.f220556a = fVar;
        this.f220557b = r02;
        this.f220558c = aVar;
    }

    public static V80.i e(a aVar, X80.j jVar, PositionInfoPeriodAction positionInfoPeriodAction, String str, PeriodSortDirection periodSortDirection, int i12) {
        c.a aVarA;
        X80.e eVar;
        String str2 = jVar.f18711c;
        Long lValueOf = null;
        if ((i12 & 2) != 0 && (aVarA = X80.k.a(jVar.f18714f)) != null && (eVar = aVarA.f18677g) != null) {
            lValueOf = Long.valueOf(eVar.f18697c);
        }
        Long l12 = lValueOf;
        if ((i12 & 4) != 0) {
            positionInfoPeriodAction = jVar.f18712d;
        }
        aVar.getClass();
        return new V80.i(jVar.f18710b, str2, l12, positionInfoPeriodAction, str, periodSortDirection);
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return C43175k.N(C43175k.Y(new com.avito.android.position_in_search.stats.screen.old_position_in_search.mvi.period.b(C43175k.o(new l(c43197r1), com.avito.android.position_in_search.stats.screen.old_position_in_search.mvi.period.c.f220577l), aVar), new m(aVar, this, null)), C43175k.C(new f(aVar, this, null), new com.avito.android.position_in_search.stats.screen.old_position_in_search.mvi.period.e(c43197r1)), C43175k.Y(new g(C40482a.a(this.f220558c)), new h(aVar, this, null)));
    }

    public final InterfaceC43160i<PeriodInfoInternalAction.LoadingAction> c(V80.i iVar) {
        return C43175k.I(this.f220557b.a(), new C43137a0(new e(2, null), new c(C43175k.G(new d(iVar, null)))));
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x01c3  */
    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlinx.coroutines.flow.InterfaceC43160i<com.avito.android.position_in_search.stats.screen.old_position_in_search.mvi.period.entity.PeriodInfoInternalAction> b(@Y61.k X80.b r10, @Y61.k X80.j r11) {
        /*
            Method dump skipped, instructions count: 775
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.position_in_search.stats.screen.old_position_in_search.mvi.period.a.b(X80.b, X80.j):kotlinx.coroutines.flow.i");
    }
}
