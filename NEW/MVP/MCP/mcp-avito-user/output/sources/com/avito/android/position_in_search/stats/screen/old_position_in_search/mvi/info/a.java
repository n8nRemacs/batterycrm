package com.avito.android.position_in_search.stats.screen.old_position_in_search.mvi.info;

import W80.a;
import W80.d;
import androidx.compose.runtime.internal.P;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.position_in_search.stats.screen.old_position_in_search.domain.model.PositionInfoBanner;
import com.avito.android.position_in_search.stats.screen.old_position_in_search.domain.model.PositionInfoButton;
import com.avito.android.position_in_search.stats.screen.old_position_in_search.mvi.info.entity.PositionInfoInternalAction;
import com.avito.android.util.R0;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43137a0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: PositionInfoActor.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/mvi/info/a;", "Lcom/avito/android/arch/mvi/a;", "LW80/a;", "Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/mvi/info/entity/PositionInfoInternalAction;", "LW80/h;", "a", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class a implements com.avito.android.arch.mvi.a<W80.a, PositionInfoInternalAction, W80.h> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.position_in_search.storage.g f220484a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.position_in_search.stats.screen.old_position_in_search.domain.i f220485b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final R0 f220486c;

    /* compiled from: PositionInfoActor.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/mvi/info/a$a;", "", "<init>", "()V", "", "LOADING_DEBOUNCE_MS", "J", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.position_in_search.stats.screen.old_position_in_search.mvi.info.a$a, reason: collision with other inner class name */
    public static final class C6630a {
        public /* synthetic */ C6630a(C42822w c42822w) {
            this();
        }

        public C6630a() {
        }
    }

    /* compiled from: SafeCollector.common.kt */
    @s0
    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/p1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements InterfaceC43160i<PositionInfoInternalAction> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43160i f220487b;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/p1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.position_in_search.stats.screen.old_position_in_search.mvi.info.a$b$a, reason: collision with other inner class name */
        public static final class C6631a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43172j f220488b;

            /* compiled from: Emitters.kt */
            @s0
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "com.avito.android.position_in_search.stats.screen.old_position_in_search.mvi.info.PositionInfoActor$info$$inlined$map$1$2", f = "PositionInfoActor.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
            /* renamed from: com.avito.android.position_in_search.stats.screen.old_position_in_search.mvi.info.a$b$a$a, reason: collision with other inner class name */
            public static final class C6632a extends ContinuationImpl {

                /* renamed from: q, reason: collision with root package name */
                public /* synthetic */ Object f220489q;

                /* renamed from: r, reason: collision with root package name */
                public int f220490r;

                public C6632a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    this.f220489q = obj;
                    this.f220490r |= BeduinInputModel.MIN_TEXT_VERSION;
                    return C6631a.this.emit(null, this);
                }
            }

            public C6631a(InterfaceC43172j interfaceC43172j) {
                this.f220488b = interfaceC43172j;
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
                    boolean r0 = r6 instanceof com.avito.android.position_in_search.stats.screen.old_position_in_search.mvi.info.a.b.C6631a.C6632a
                    if (r0 == 0) goto L13
                    r0 = r6
                    com.avito.android.position_in_search.stats.screen.old_position_in_search.mvi.info.a$b$a$a r0 = (com.avito.android.position_in_search.stats.screen.old_position_in_search.mvi.info.a.b.C6631a.C6632a) r0
                    int r1 = r0.f220490r
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f220490r = r1
                    goto L18
                L13:
                    com.avito.android.position_in_search.stats.screen.old_position_in_search.mvi.info.a$b$a$a r0 = new com.avito.android.position_in_search.stats.screen.old_position_in_search.mvi.info.a$b$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f220489q
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f220490r
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
                    V80.l r5 = (V80.l) r5
                    boolean r6 = r5 instanceof V80.l.a
                    if (r6 == 0) goto L46
                    com.avito.android.position_in_search.stats.screen.old_position_in_search.mvi.info.entity.PositionInfoInternalAction$LoadingError r6 = new com.avito.android.position_in_search.stats.screen.old_position_in_search.mvi.info.entity.PositionInfoInternalAction$LoadingError
                    V80.l$a r5 = (V80.l.a) r5
                    com.avito.android.remote.error.ApiError r2 = r5.f16985a
                    java.lang.Throwable r5 = r5.f16986b
                    r6.<init>(r2, r5)
                    goto L55
                L46:
                    boolean r6 = r5 instanceof V80.l.b
                    if (r6 == 0) goto L63
                    com.avito.android.position_in_search.stats.screen.old_position_in_search.mvi.info.entity.PositionInfoInternalAction$LoadingResult r6 = new com.avito.android.position_in_search.stats.screen.old_position_in_search.mvi.info.entity.PositionInfoInternalAction$LoadingResult
                    V80.l$b r5 = (V80.l.b) r5
                    V80.h r2 = r5.f16987a
                    java.util.Set<java.lang.String> r5 = r5.f16988b
                    r6.<init>(r2, r5)
                L55:
                    r0.f220490r = r3
                    kotlinx.coroutines.flow.j r5 = r4.f220488b
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
                throw new UnsupportedOperationException("Method not decompiled: com.avito.android.position_in_search.stats.screen.old_position_in_search.mvi.info.a.b.C6631a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public b(InterfaceC43160i interfaceC43160i) {
            this.f220487b = interfaceC43160i;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43160i
        @Y61.l
        public final Object collect(@Y61.k InterfaceC43172j<? super PositionInfoInternalAction> interfaceC43172j, @Y61.k Continuation continuation) {
            Object objCollect = this.f220487b.collect(new C6631a(interfaceC43172j), continuation);
            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
        }
    }

    /* compiled from: PositionInfoActor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "LV80/l;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.position_in_search.stats.screen.old_position_in_search.mvi.info.PositionInfoActor$info$1", f = "PositionInfoActor.kt", i = {}, l = {175, 175}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Y41.p<InterfaceC43172j<? super V80.l>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f220492q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f220493r;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ V80.k f220495t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(V80.k kVar, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f220495t = kVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            c cVar = a.this.new c(this.f220495t, continuation);
            cVar.f220493r = obj;
            return cVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super V80.l> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((c) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            InterfaceC43172j interfaceC43172j;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f220492q;
            if (i12 == 0) {
                C42729a0.b(obj);
                interfaceC43172j = (InterfaceC43172j) this.f220493r;
                com.avito.android.position_in_search.stats.screen.old_position_in_search.domain.i iVar = a.this.f220485b;
                this.f220493r = interfaceC43172j;
                this.f220492q = 1;
                obj = iVar.a(this.f220495t, this);
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
                interfaceC43172j = (InterfaceC43172j) this.f220493r;
                C42729a0.b(obj);
            }
            this.f220493r = null;
            this.f220492q = 2;
            if (interfaceC43172j.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return G0.f406611a;
        }
    }

    /* compiled from: PositionInfoActor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/mvi/info/entity/PositionInfoInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.position_in_search.stats.screen.old_position_in_search.mvi.info.PositionInfoActor$info$3", f = "PositionInfoActor.kt", i = {}, l = {185}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements Y41.p<InterfaceC43172j<? super PositionInfoInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f220496q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f220497r;

        public d() {
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            d dVar = new d(2, continuation);
            dVar.f220497r = obj;
            return dVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super PositionInfoInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((d) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f220496q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f220497r;
                PositionInfoInternalAction.LoadingStart loadingStart = new PositionInfoInternalAction.LoadingStart();
                this.f220496q = 1;
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
        new C6630a(null);
    }

    @Inject
    public a(@Y61.k com.avito.android.position_in_search.storage.g gVar, @Y61.k com.avito.android.position_in_search.stats.screen.old_position_in_search.domain.i iVar, @Y61.k R0 r02) {
        this.f220484a = gVar;
        this.f220485b = iVar;
        this.f220486c = r02;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return new C43137a0(new com.avito.android.position_in_search.stats.screen.old_position_in_search.mvi.info.b(this, null), C43175k.N(C43175k.Y(new C43137a0(new j(aVar, null), new com.avito.android.position_in_search.stats.screen.old_position_in_search.mvi.info.c(C43175k.o(new h(c43197r1), com.avito.android.position_in_search.stats.screen.old_position_in_search.mvi.info.d.f220507l), aVar)), new i(aVar, this, null)), C43175k.C(new g(aVar, this, null), new f(c43197r1))));
    }

    public final InterfaceC43160i<PositionInfoInternalAction> c(V80.k kVar) {
        return C43175k.I(this.f220486c.a(), new C43137a0(new d(2, null), new b(C43175k.G(new c(kVar, null)))));
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final InterfaceC43160i<PositionInfoInternalAction> b(@Y61.k W80.a aVar, @Y61.k W80.h hVar) {
        InterfaceC43160i<PositionInfoInternalAction> c43210w;
        W80.j jVar;
        PositionInfoButton positionInfoButton;
        DeepLink deepLink;
        W80.b bVar;
        boolean z12 = aVar instanceof a.g;
        long j12 = hVar.f17796b;
        String str = hVar.f17797c;
        W80.d dVar = hVar.f17799e;
        if (z12) {
            return !(dVar instanceof d.C1254d) ? new C43210w(PositionInfoInternalAction.NoChange.f220523b) : c(new V80.k(j12, str));
        }
        if (aVar instanceof a.j) {
            if (!(dVar instanceof d.b)) {
                return new C43210w(PositionInfoInternalAction.NoChange.f220523b);
            }
            c43210w = c(new V80.k(j12, str));
        } else if (aVar instanceof a.i) {
            c43210w = new C43210w(new PositionInfoInternalAction.PeriodSelected(((a.i) aVar).f17771a));
        } else {
            String str2 = null;
            DeepLink deepLink2 = null;
            str2 = null;
            if (aVar instanceof a.c) {
                a.c cVar = (a.c) aVar;
                d.a aVarB = W80.i.b(dVar);
                if (aVarB != null && (bVar = aVarB.f17783e) != null) {
                    W80.c cVar2 = bVar.f17775b;
                    String str3 = cVar2 != null ? cVar2.f17777a : null;
                    String str4 = cVar.f17767a;
                    if (L.f(str3, str4)) {
                        deepLink2 = cVar2.f17778b.f220425b;
                    } else {
                        W80.c cVar3 = bVar.f17776c;
                        if (L.f(cVar3 != null ? cVar3.f17777a : null, str4)) {
                            deepLink2 = cVar3.f17778b.f220425b;
                        }
                    }
                    if (deepLink2 != null) {
                        return new C43210w(new PositionInfoInternalAction.OpenDeepLink(deepLink2));
                    }
                }
                return new C43210w(PositionInfoInternalAction.NoChange.f220523b);
            }
            if (aVar instanceof a.b) {
                a.b bVar2 = (a.b) aVar;
                if (W80.i.a(hVar, bVar2.f17766a) == null) {
                    return new C43210w(PositionInfoInternalAction.NoChange.f220523b);
                }
                c43210w = C43175k.I(this.f220486c.a(), C43175k.G(new e(this, bVar2, null)));
            } else if (aVar instanceof a.C1253a) {
                PositionInfoBanner positionInfoBannerA = W80.i.a(hVar, ((a.C1253a) aVar).f17765a);
                if (positionInfoBannerA == null || (positionInfoButton = positionInfoBannerA.f220418e) == null || (deepLink = positionInfoButton.f220425b) == null) {
                    return new C43210w(PositionInfoInternalAction.NoChange.f220523b);
                }
                c43210w = new C43210w(new PositionInfoInternalAction.OpenDeepLink(deepLink));
            } else if (aVar instanceof a.f) {
                c43210w = new C43210w(new PositionInfoInternalAction.OpenDeepLink(((a.f) aVar).f17769a));
            } else {
                if (!(aVar instanceof a.k)) {
                    if (aVar instanceof a.e) {
                        return new C43210w(PositionInfoInternalAction.Close.f220513b);
                    }
                    throw new NoWhenBranchMatchedException();
                }
                a.k kVar = (a.k) aVar;
                d.a aVarB2 = W80.i.b(dVar);
                if (aVarB2 != null && (jVar = aVarB2.f17784f) != null) {
                    str2 = jVar.f17803a;
                }
                String str5 = kVar.f17773a;
                if (!L.f(str2, str5)) {
                    return new C43210w(PositionInfoInternalAction.NoChange.f220523b);
                }
                c43210w = new C43210w(new PositionInfoInternalAction.ToastClosed(str5));
            }
        }
        return c43210w;
    }
}
