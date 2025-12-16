package com.avito.android.position_in_search.stats.screen.position_in_search.mvi;

import Y41.p;
import androidx.compose.runtime.internal.P;
import c90.InterfaceC26960a;
import c90.c;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.position_in_search.stats.screen.position_in_search.domain.model.ActionButton;
import com.avito.android.position_in_search.stats.screen.position_in_search.domain.model.PeriodType;
import com.avito.android.position_in_search.stats.screen.position_in_search.domain.model.PositionInfoPeriodAction;
import com.avito.android.position_in_search.stats.screen.position_in_search.mvi.entity.PositionInSearchInternalAction;
import com.avito.android.position_in_search.stats.screen.position_in_search.storage.PositionInSearchStorage;
import com.avito.android.remote.model.text.AttributedText;
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

/* compiled from: PositionInSearchActor.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/position_in_search/stats/screen/position_in_search/mvi/a;", "Lcom/avito/android/arch/mvi/a;", "Lc90/a;", "Lcom/avito/android/position_in_search/stats/screen/position_in_search/mvi/entity/PositionInSearchInternalAction;", "Lc90/c;", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class a implements com.avito.android.arch.mvi.a<InterfaceC26960a, PositionInSearchInternalAction, c90.c> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.position_in_search.stats.screen.position_in_search.domain.j f221457a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.position_in_search.stats.screen.position_in_search.domain.a f221458b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.position_in_search.stats.screen.position_in_search.domain.g f221459c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final PositionInSearchStorage f221460d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final String f221461e;

    /* compiled from: PositionInSearchActor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/position_in_search/stats/screen/position_in_search/mvi/entity/PositionInSearchInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.position_in_search.stats.screen.position_in_search.mvi.PositionInSearchActor$process$1", f = "PositionInSearchActor.kt", i = {0}, l = {51, 52}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
    /* renamed from: com.avito.android.position_in_search.stats.screen.position_in_search.mvi.a$a, reason: collision with other inner class name */
    public static final class C6701a extends SuspendLambda implements p<InterfaceC43172j<? super PositionInSearchInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f221462q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f221463r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ InterfaceC26960a f221464s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ a f221465t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6701a(InterfaceC26960a interfaceC26960a, a aVar, Continuation<? super C6701a> continuation) {
            super(2, continuation);
            this.f221464s = interfaceC26960a;
            this.f221465t = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            C6701a c6701a = new C6701a(this.f221464s, this.f221465t, continuation);
            c6701a.f221463r = obj;
            return c6701a;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super PositionInSearchInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((C6701a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0056 A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r6.f221462q
                c90.a r2 = r6.f221464s
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L24
                if (r1 == r4) goto L1c
                if (r1 != r3) goto L14
                kotlin.C42729a0.b(r7)
                goto L6c
            L14:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1c:
                java.lang.Object r1 = r6.f221463r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r7)
                goto L57
            L24:
                kotlin.C42729a0.b(r7)
                java.lang.Object r7 = r6.f221463r
                r1 = r7
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                r7 = r2
                c90.a$c r7 = (c90.InterfaceC26960a.c) r7
                boolean r5 = r7.f57690b
                if (r5 == 0) goto L36
                com.avito.android.position_in_search.stats.screen.position_in_search.storage.PositionInSearchStorage$Place r5 = com.avito.android.position_in_search.stats.screen.position_in_search.storage.PositionInSearchStorage.Place.f221564c
                goto L38
            L36:
                com.avito.android.position_in_search.stats.screen.position_in_search.storage.PositionInSearchStorage$Place r5 = com.avito.android.position_in_search.stats.screen.position_in_search.storage.PositionInSearchStorage.Place.f221563b
            L38:
                java.lang.String r7 = r7.f57689a
                r6.f221463r = r1
                r6.f221462q = r4
                com.avito.android.position_in_search.stats.screen.position_in_search.mvi.a r4 = r6.f221465t
                if (r7 == 0) goto L4f
                com.avito.android.position_in_search.stats.screen.position_in_search.storage.PositionInSearchStorage r4 = r4.f221460d
                java.lang.Object r7 = r4.a(r5, r7, r6)
                java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                if (r7 != r4) goto L52
                goto L54
            L4f:
                r4.getClass()
            L52:
                kotlin.G0 r7 = kotlin.G0.f406611a
            L54:
                if (r7 != r0) goto L57
                return r0
            L57:
                com.avito.android.position_in_search.stats.screen.position_in_search.mvi.entity.PositionInSearchInternalAction$CloseBanner r7 = new com.avito.android.position_in_search.stats.screen.position_in_search.mvi.entity.PositionInSearchInternalAction$CloseBanner
                c90.a$c r2 = (c90.InterfaceC26960a.c) r2
                boolean r2 = r2.f57690b
                r7.<init>(r2)
                r2 = 0
                r6.f221463r = r2
                r6.f221462q = r3
                java.lang.Object r7 = r1.emit(r7, r6)
                if (r7 != r0) goto L6c
                return r0
            L6c:
                kotlin.G0 r7 = kotlin.G0.f406611a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.position_in_search.stats.screen.position_in_search.mvi.a.C6701a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: PositionInSearchActor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/position_in_search/stats/screen/position_in_search/mvi/entity/PositionInSearchInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.position_in_search.stats.screen.position_in_search.mvi.PositionInSearchActor$process$2", f = "PositionInSearchActor.kt", i = {}, l = {57}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements p<InterfaceC43172j<? super PositionInSearchInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f221466q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f221467r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ c90.c f221468s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(c90.c cVar, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f221468s = cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            b bVar = new b(this.f221468s, continuation);
            bVar.f221467r = obj;
            return bVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super PositionInSearchInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((b) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            ActionButton actionButton;
            DeepLink deepLink;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f221466q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f221467r;
                c.a aVar = this.f221468s.f57710f;
                if (aVar != null && (actionButton = aVar.f57723e) != null && (deepLink = actionButton.f221438b) != null) {
                    PositionInSearchInternalAction.HandleDeeplink handleDeeplink = new PositionInSearchInternalAction.HandleDeeplink(deepLink);
                    this.f221466q = 1;
                    if (interfaceC43172j.emit(handleDeeplink, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
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

    /* compiled from: PositionInSearchActor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/position_in_search/stats/screen/position_in_search/mvi/entity/PositionInSearchInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.position_in_search.stats.screen.position_in_search.mvi.PositionInSearchActor$process$3", f = "PositionInSearchActor.kt", i = {}, l = {63}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements p<InterfaceC43172j<? super PositionInSearchInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f221469q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f221470r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ c90.c f221471s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ a f221472t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ InterfaceC26960a f221473u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(InterfaceC26960a interfaceC26960a, c90.c cVar, a aVar, Continuation continuation) {
            super(2, continuation);
            this.f221471s = cVar;
            this.f221472t = aVar;
            this.f221473u = interfaceC26960a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            c cVar = new c(this.f221473u, this.f221471s, this.f221472t, continuation);
            cVar.f221470r = obj;
            return cVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super PositionInSearchInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((c) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            PeriodType periodTypeA;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f221469q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f221470r;
                c.e.a aVar = this.f221471s.f57708d;
                a aVar2 = this.f221472t;
                if (aVar == null || (periodTypeA = aVar.f57743a) == null) {
                    PeriodType.a aVar3 = PeriodType.f221444c;
                    String str = aVar2.f221461e;
                    aVar3.getClass();
                    periodTypeA = PeriodType.a.a(str);
                }
                InterfaceC43160i<PositionInSearchInternalAction> interfaceC43160iA = aVar2.f221459c.a(periodTypeA, ((InterfaceC26960a.g) this.f221473u).f57693a);
                this.f221469q = 1;
                if (C43175k.u(this, interfaceC43160iA, interfaceC43172j) == coroutine_suspended) {
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

    /* compiled from: PositionInSearchActor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/position_in_search/stats/screen/position_in_search/mvi/entity/PositionInSearchInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.position_in_search.stats.screen.position_in_search.mvi.PositionInSearchActor$process$4", f = "PositionInSearchActor.kt", i = {}, l = {72}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements p<InterfaceC43172j<? super PositionInSearchInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f221474q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f221475r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ InterfaceC26960a f221476s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(InterfaceC26960a interfaceC26960a, Continuation<? super d> continuation) {
            super(2, continuation);
            this.f221476s = interfaceC26960a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            d dVar = new d(this.f221476s, continuation);
            dVar.f221475r = obj;
            return dVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super PositionInSearchInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((d) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f221474q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f221475r;
                ((InterfaceC26960a.f) this.f221476s).getClass();
                PositionInSearchInternalAction.HandleDeeplink handleDeeplink = new PositionInSearchInternalAction.HandleDeeplink(null);
                this.f221474q = 1;
                if (interfaceC43172j.emit(handleDeeplink, this) == coroutine_suspended) {
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

    /* compiled from: PositionInSearchActor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/position_in_search/stats/screen/position_in_search/mvi/entity/PositionInSearchInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.position_in_search.stats.screen.position_in_search.mvi.PositionInSearchActor$process$5", f = "PositionInSearchActor.kt", i = {0, 0}, l = {78, 79}, m = "invokeSuspend", n = {"$this$flow", "period"}, s = {"L$0", "L$1"})
    public static final class e extends SuspendLambda implements p<InterfaceC43172j<? super PositionInSearchInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public c.e.a f221477q;

        /* renamed from: r, reason: collision with root package name */
        public a f221478r;

        /* renamed from: s, reason: collision with root package name */
        public int f221479s;

        /* renamed from: t, reason: collision with root package name */
        public /* synthetic */ Object f221480t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ c90.c f221481u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ InterfaceC26960a f221482v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ a f221483w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(InterfaceC26960a interfaceC26960a, c90.c cVar, a aVar, Continuation continuation) {
            super(2, continuation);
            this.f221481u = cVar;
            this.f221482v = interfaceC26960a;
            this.f221483w = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            e eVar = new e(this.f221482v, this.f221481u, this.f221483w, continuation);
            eVar.f221480t = obj;
            return eVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super PositionInSearchInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((e) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x007d A[RETURN] */
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
                int r1 = r7.f221479s
                r2 = 2
                r3 = 1
                r4 = 0
                if (r1 == 0) goto L27
                if (r1 == r3) goto L1b
                if (r1 != r2) goto L13
                kotlin.C42729a0.b(r8)
                goto L7e
            L13:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L1b:
                com.avito.android.position_in_search.stats.screen.position_in_search.mvi.a r1 = r7.f221478r
                c90.c$e$a r3 = r7.f221477q
                java.lang.Object r5 = r7.f221480t
                kotlinx.coroutines.flow.j r5 = (kotlinx.coroutines.flow.InterfaceC43172j) r5
                kotlin.C42729a0.b(r8)
                goto L65
            L27:
                kotlin.C42729a0.b(r8)
                java.lang.Object r8 = r7.f221480t
                r5 = r8
                kotlinx.coroutines.flow.j r5 = (kotlinx.coroutines.flow.InterfaceC43172j) r5
                c90.c r8 = r7.f221481u
                c90.c$e r8 = r8.f57709e
                c90.a r1 = r7.f221482v
                if (r8 == 0) goto L47
                java.util.List<c90.c$e$a> r8 = r8.f57741b
                if (r8 == 0) goto L47
                r6 = r1
                c90.a$h r6 = (c90.InterfaceC26960a.h) r6
                int r6 = r6.f57694a
                java.lang.Object r8 = kotlin.collections.C42745f0.K(r6, r8)
                c90.c$e$a r8 = (c90.c.e.a) r8
                goto L48
            L47:
                r8 = r4
            L48:
                if (r8 == 0) goto L7e
                com.avito.android.position_in_search.stats.screen.position_in_search.mvi.entity.PositionInSearchInternalAction$PeriodClicked r6 = new com.avito.android.position_in_search.stats.screen.position_in_search.mvi.entity.PositionInSearchInternalAction$PeriodClicked
                c90.a$h r1 = (c90.InterfaceC26960a.h) r1
                int r1 = r1.f57694a
                r6.<init>(r1)
                r7.f221480t = r5
                r7.f221477q = r8
                com.avito.android.position_in_search.stats.screen.position_in_search.mvi.a r1 = r7.f221483w
                r7.f221478r = r1
                r7.f221479s = r3
                java.lang.Object r3 = r5.emit(r6, r7)
                if (r3 != r0) goto L64
                return r0
            L64:
                r3 = r8
            L65:
                com.avito.android.position_in_search.stats.screen.position_in_search.domain.a r8 = r1.f221458b
                com.avito.android.position_in_search.stats.screen.position_in_search.domain.model.PeriodType r1 = r3.f57743a
                com.avito.android.position_in_search.stats.screen.position_in_search.domain.model.PositionInfoPeriodAction r3 = com.avito.android.position_in_search.stats.screen.position_in_search.domain.model.PositionInfoPeriodAction.f221450c
                kotlinx.coroutines.flow.i r8 = r8.a(r1, r4, r3)
                r7.f221480t = r4
                r7.f221477q = r4
                r7.f221478r = r4
                r7.f221479s = r2
                java.lang.Object r8 = kotlinx.coroutines.flow.C43175k.u(r7, r8, r5)
                if (r8 != r0) goto L7e
                return r0
            L7e:
                kotlin.G0 r8 = kotlin.G0.f406611a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.position_in_search.stats.screen.position_in_search.mvi.a.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: PositionInSearchActor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/position_in_search/stats/screen/position_in_search/mvi/entity/PositionInSearchInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.position_in_search.stats.screen.position_in_search.mvi.PositionInSearchActor$process$6", f = "PositionInSearchActor.kt", i = {}, l = {92}, m = "invokeSuspend", n = {}, s = {})
    public static final class f extends SuspendLambda implements p<InterfaceC43172j<? super PositionInSearchInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f221484q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f221485r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ c90.c f221486s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ InterfaceC26960a f221487t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(c90.c cVar, InterfaceC26960a interfaceC26960a, Continuation<? super f> continuation) {
            super(2, continuation);
            this.f221486s = cVar;
            this.f221487t = interfaceC26960a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            f fVar = new f(this.f221486s, this.f221487t, continuation);
            fVar.f221485r = obj;
            return fVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super PositionInSearchInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((f) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            AttributedText attributedText;
            List<c.e.a> list;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f221484q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f221485r;
                c.e eVar = this.f221486s.f57709e;
                c.e.a aVar = (eVar == null || (list = eVar.f57741b) == null) ? null : (c.e.a) C42745f0.K(((InterfaceC26960a.e) this.f221487t).f57692a, list);
                if (aVar != null && (attributedText = aVar.f57744b.f57750c) != null) {
                    PositionInSearchInternalAction.ShowMessage showMessage = new PositionInSearchInternalAction.ShowMessage(attributedText.getText());
                    this.f221484q = 1;
                    if (interfaceC43172j.emit(showMessage, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
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
    public a(@Y61.k com.avito.android.position_in_search.stats.screen.position_in_search.domain.j jVar, @Y61.k com.avito.android.position_in_search.stats.screen.position_in_search.domain.a aVar, @Y61.k com.avito.android.position_in_search.stats.screen.position_in_search.domain.g gVar, @Y61.k PositionInSearchStorage positionInSearchStorage, @Y61.k String str) {
        this.f221457a = jVar;
        this.f221458b = aVar;
        this.f221459c = gVar;
        this.f221460d = positionInSearchStorage;
        this.f221461e = str;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return com.avito.android.arch.mvi.utils.h.e(c43197r1, com.avito.android.position_in_search.stats.screen.position_in_search.mvi.b.f221488l, new com.avito.android.position_in_search.stats.screen.position_in_search.mvi.c(this, aVar), 1000L);
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final InterfaceC43160i<PositionInSearchInternalAction> b(@Y61.k InterfaceC26960a interfaceC26960a, @Y61.k c90.c cVar) {
        PeriodType periodTypeA;
        PeriodType periodTypeA2;
        if (interfaceC26960a instanceof InterfaceC26960a.b) {
            return new C43210w(PositionInSearchInternalAction.Close.f221498b);
        }
        boolean z12 = interfaceC26960a instanceof InterfaceC26960a.i;
        PositionInfoPeriodAction positionInfoPeriodAction = cVar.f57718n;
        String str = this.f221461e;
        c.e.a aVar = cVar.f57708d;
        if (z12) {
            if (aVar == null || (periodTypeA2 = aVar.f57743a) == null) {
                PeriodType.f221444c.getClass();
                periodTypeA2 = PeriodType.a.a(str);
            }
            return this.f221457a.a(periodTypeA2, positionInfoPeriodAction);
        }
        if (interfaceC26960a instanceof InterfaceC26960a.j) {
            if (aVar == null || (periodTypeA = aVar.f57743a) == null) {
                PeriodType.f221444c.getClass();
                periodTypeA = PeriodType.a.a(str);
            }
            return this.f221458b.a(periodTypeA, null, positionInfoPeriodAction);
        }
        if (interfaceC26960a instanceof InterfaceC26960a.c) {
            return C43175k.G(new C6701a(interfaceC26960a, this, null));
        }
        if (interfaceC26960a instanceof InterfaceC26960a.C2032a) {
            return C43175k.G(new b(cVar, null));
        }
        if (interfaceC26960a instanceof InterfaceC26960a.g) {
            return C43175k.G(new c(interfaceC26960a, cVar, this, null));
        }
        if (interfaceC26960a instanceof InterfaceC26960a.f) {
            return C43175k.G(new d(interfaceC26960a, null));
        }
        if (interfaceC26960a instanceof InterfaceC26960a.h) {
            return C43175k.G(new e(interfaceC26960a, cVar, this, null));
        }
        if (interfaceC26960a instanceof InterfaceC26960a.e) {
            return C43175k.G(new f(cVar, interfaceC26960a, null));
        }
        if (interfaceC26960a instanceof InterfaceC26960a.d) {
            return new C43210w(new PositionInSearchInternalAction.HandleDeeplink(((InterfaceC26960a.d) interfaceC26960a).f57691a));
        }
        throw new NoWhenBranchMatchedException();
    }
}
