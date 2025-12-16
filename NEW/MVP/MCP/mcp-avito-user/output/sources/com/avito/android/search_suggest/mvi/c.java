package com.avito.android.search_suggest.mvi;

import Op0.C14723a;
import Pp0.InterfaceC14824b;
import Y41.p;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.a0;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.remote.model.ParametrizedEvent;
import com.avito.android.remote.model.SearchParams;
import com.avito.android.remote.model.search.suggest.SuggestAction;
import com.avito.android.remote.model.search.suggest.SuggestAnalyticsEvent;
import com.avito.android.remote.model.search.suggest.SuggestDeeplink;
import com.avito.android.remote.model.search.suggest.SuggestNewQuery;
import com.avito.android.search_suggest.SearchSuggestArguments;
import com.avito.android.search_suggest.mvi.entity.SearchSuggestInternalAction;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43187o;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: SearchSuggestActor.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/search_suggest/mvi/c;", "Lcom/avito/android/arch/mvi/a;", "LPp0/b;", "Lcom/avito/android/search_suggest/mvi/entity/SearchSuggestInternalAction;", "LPp0/d;", "_avito_search-suggest_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class c implements com.avito.android.arch.mvi.a<InterfaceC14824b, SearchSuggestInternalAction, Pp0.d> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final SearchSuggestArguments f264284a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.search_suggest.g f264285b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f264286c;

    /* compiled from: SearchSuggestActor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/search_suggest/mvi/entity/SearchSuggestInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.search_suggest.mvi.SearchSuggestActor$process$3", f = "SearchSuggestActor.kt", i = {0, 1}, l = {63, 64, 70, 69}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
    public static final class a extends SuspendLambda implements p<InterfaceC43172j<? super SearchSuggestInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f264287q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f264288r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ InterfaceC14824b f264289s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ Pp0.d f264290t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ c f264291u;

        /* compiled from: SafeCollector.common.kt */
        @s0
        @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/p1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.search_suggest.mvi.c$a$a, reason: collision with other inner class name */
        public static final class C7889a implements InterfaceC43160i<SearchSuggestInternalAction.SearchSuggestLoaded> {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43160i f264292b;

            /* compiled from: Emitters.kt */
            @s0
            @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/p1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
            /* renamed from: com.avito.android.search_suggest.mvi.c$a$a$a, reason: collision with other inner class name */
            public static final class C7890a<T> implements InterfaceC43172j {

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ InterfaceC43172j f264293b;

                /* compiled from: Emitters.kt */
                @s0
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                @DebugMetadata(c = "com.avito.android.search_suggest.mvi.SearchSuggestActor$process$3$invokeSuspend$$inlined$map$1$2", f = "SearchSuggestActor.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
                /* renamed from: com.avito.android.search_suggest.mvi.c$a$a$a$a, reason: collision with other inner class name */
                public static final class C7891a extends ContinuationImpl {

                    /* renamed from: q, reason: collision with root package name */
                    public /* synthetic */ Object f264294q;

                    /* renamed from: r, reason: collision with root package name */
                    public int f264295r;

                    public C7891a(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @Y61.l
                    public final Object invokeSuspend(@Y61.k Object obj) {
                        this.f264294q = obj;
                        this.f264295r |= BeduinInputModel.MIN_TEXT_VERSION;
                        return C7890a.this.emit(null, this);
                    }
                }

                public C7890a(InterfaceC43172j interfaceC43172j) {
                    this.f264293b = interfaceC43172j;
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
                        boolean r0 = r6 instanceof com.avito.android.search_suggest.mvi.c.a.C7889a.C7890a.C7891a
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.avito.android.search_suggest.mvi.c$a$a$a$a r0 = (com.avito.android.search_suggest.mvi.c.a.C7889a.C7890a.C7891a) r0
                        int r1 = r0.f264295r
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f264295r = r1
                        goto L18
                    L13:
                        com.avito.android.search_suggest.mvi.c$a$a$a$a r0 = new com.avito.android.search_suggest.mvi.c$a$a$a$a
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.f264294q
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                        int r2 = r0.f264295r
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        kotlin.C42729a0.b(r6)
                        goto L46
                    L29:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L31:
                        kotlin.C42729a0.b(r6)
                        com.avito.android.search.o r5 = (com.avito.android.search.o) r5
                        com.avito.android.search_suggest.mvi.entity.SearchSuggestInternalAction$SearchSuggestLoaded r6 = new com.avito.android.search_suggest.mvi.entity.SearchSuggestInternalAction$SearchSuggestLoaded
                        r6.<init>(r5)
                        r0.f264295r = r3
                        kotlinx.coroutines.flow.j r5 = r4.f264293b
                        java.lang.Object r5 = r5.emit(r6, r0)
                        if (r5 != r1) goto L46
                        return r1
                    L46:
                        kotlin.G0 r5 = kotlin.G0.f406611a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.avito.android.search_suggest.mvi.c.a.C7889a.C7890a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            public C7889a(InterfaceC43160i interfaceC43160i) {
                this.f264292b = interfaceC43160i;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC43160i
            @Y61.l
            public final Object collect(@Y61.k InterfaceC43172j<? super SearchSuggestInternalAction.SearchSuggestLoaded> interfaceC43172j, @Y61.k Continuation continuation) {
                Object objCollect = this.f264292b.collect(new C7890a(interfaceC43172j), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC14824b interfaceC14824b, Pp0.d dVar, c cVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f264289s = interfaceC14824b;
            this.f264290t = dVar;
            this.f264291u = cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = new a(this.f264289s, this.f264290t, this.f264291u, continuation);
            aVar.f264288r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super SearchSuggestInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x0080  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x00ce A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:39:0x00e0 A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r14) {
            /*
                Method dump skipped, instructions count: 228
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.search_suggest.mvi.c.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: SearchSuggestActor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/search_suggest/mvi/entity/SearchSuggestInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.search_suggest.mvi.SearchSuggestActor$process$4", f = "SearchSuggestActor.kt", i = {0}, l = {82, 85, 84}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
    public static final class b extends SuspendLambda implements p<InterfaceC43172j<? super SearchSuggestInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f264297q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f264298r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ InterfaceC14824b f264299s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ c f264300t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ Pp0.d f264301u;

        /* compiled from: SafeCollector.common.kt */
        @s0
        @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/p1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a implements InterfaceC43160i<SearchSuggestInternalAction.SearchSuggestLoaded> {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43160i f264302b;

            /* compiled from: Emitters.kt */
            @s0
            @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/p1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
            /* renamed from: com.avito.android.search_suggest.mvi.c$b$a$a, reason: collision with other inner class name */
            public static final class C7892a<T> implements InterfaceC43172j {

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ InterfaceC43172j f264303b;

                /* compiled from: Emitters.kt */
                @s0
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                @DebugMetadata(c = "com.avito.android.search_suggest.mvi.SearchSuggestActor$process$4$invokeSuspend$$inlined$map$1$2", f = "SearchSuggestActor.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
                /* renamed from: com.avito.android.search_suggest.mvi.c$b$a$a$a, reason: collision with other inner class name */
                public static final class C7893a extends ContinuationImpl {

                    /* renamed from: q, reason: collision with root package name */
                    public /* synthetic */ Object f264304q;

                    /* renamed from: r, reason: collision with root package name */
                    public int f264305r;

                    public C7893a(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @Y61.l
                    public final Object invokeSuspend(@Y61.k Object obj) {
                        this.f264304q = obj;
                        this.f264305r |= BeduinInputModel.MIN_TEXT_VERSION;
                        return C7892a.this.emit(null, this);
                    }
                }

                public C7892a(InterfaceC43172j interfaceC43172j) {
                    this.f264303b = interfaceC43172j;
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
                        boolean r0 = r6 instanceof com.avito.android.search_suggest.mvi.c.b.a.C7892a.C7893a
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.avito.android.search_suggest.mvi.c$b$a$a$a r0 = (com.avito.android.search_suggest.mvi.c.b.a.C7892a.C7893a) r0
                        int r1 = r0.f264305r
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f264305r = r1
                        goto L18
                    L13:
                        com.avito.android.search_suggest.mvi.c$b$a$a$a r0 = new com.avito.android.search_suggest.mvi.c$b$a$a$a
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.f264304q
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                        int r2 = r0.f264305r
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        kotlin.C42729a0.b(r6)
                        goto L46
                    L29:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L31:
                        kotlin.C42729a0.b(r6)
                        com.avito.android.search.o r5 = (com.avito.android.search.o) r5
                        com.avito.android.search_suggest.mvi.entity.SearchSuggestInternalAction$SearchSuggestLoaded r6 = new com.avito.android.search_suggest.mvi.entity.SearchSuggestInternalAction$SearchSuggestLoaded
                        r6.<init>(r5)
                        r0.f264305r = r3
                        kotlinx.coroutines.flow.j r5 = r4.f264303b
                        java.lang.Object r5 = r5.emit(r6, r0)
                        if (r5 != r1) goto L46
                        return r1
                    L46:
                        kotlin.G0 r5 = kotlin.G0.f406611a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.avito.android.search_suggest.mvi.c.b.a.C7892a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            public a(InterfaceC43160i interfaceC43160i) {
                this.f264302b = interfaceC43160i;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC43160i
            @Y61.l
            public final Object collect(@Y61.k InterfaceC43172j<? super SearchSuggestInternalAction.SearchSuggestLoaded> interfaceC43172j, @Y61.k Continuation continuation) {
                Object objCollect = this.f264302b.collect(new C7892a(interfaceC43172j), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC14824b interfaceC14824b, Pp0.d dVar, c cVar, Continuation continuation) {
            super(2, continuation);
            this.f264299s = interfaceC14824b;
            this.f264300t = cVar;
            this.f264301u = dVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            c cVar = this.f264300t;
            b bVar = new b(this.f264299s, this.f264301u, cVar, continuation);
            bVar.f264298r = obj;
            return bVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super SearchSuggestInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((b) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x0080 A[RETURN] */
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
                int r1 = r8.f264297q
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L2d
                if (r1 == r4) goto L25
                if (r1 == r3) goto L1d
                if (r1 != r2) goto L15
                kotlin.C42729a0.b(r9)
                goto L81
            L15:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L1d:
                java.lang.Object r1 = r8.f264298r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r9)
                goto L6e
            L25:
                java.lang.Object r1 = r8.f264298r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r9)
                goto L45
            L2d:
                kotlin.C42729a0.b(r9)
                java.lang.Object r9 = r8.f264298r
                kotlinx.coroutines.flow.j r9 = (kotlinx.coroutines.flow.InterfaceC43172j) r9
                com.avito.android.search_suggest.mvi.entity.SearchSuggestInternalAction$SearchSuggestLoading r1 = new com.avito.android.search_suggest.mvi.entity.SearchSuggestInternalAction$SearchSuggestLoading
                r1.<init>()
                r8.f264298r = r9
                r8.f264297q = r4
                java.lang.Object r1 = r9.emit(r1, r8)
                if (r1 != r0) goto L44
                return r0
            L44:
                r1 = r9
            L45:
                Pp0.b r9 = r8.f264299s
                Pp0.b$f r9 = (Pp0.InterfaceC14824b.f) r9
                java.lang.String r4 = r9.f13313a
                boolean r9 = r9.f13314b
                java.lang.Boolean r9 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r9)
                java.util.Map r9 = java.util.Collections.singletonMap(r4, r9)
                com.avito.android.search_suggest.mvi.c r4 = r8.f264300t
                com.avito.android.search_suggest.g r5 = r4.f264285b
                Pp0.d r6 = r8.f264301u
                java.lang.String r7 = r6.f13323b
                com.avito.android.search_suggest.SearchSuggestArguments r4 = r4.f264284a
                com.avito.android.remote.model.SearchParams r4 = r4.f264107d
                r8.f264298r = r1
                r8.f264297q = r3
                boolean r3 = r6.f13327f
                java.lang.Object r9 = r5.a(r7, r9, r3)
                if (r9 != r0) goto L6e
                return r0
            L6e:
                kotlinx.coroutines.flow.i r9 = (kotlinx.coroutines.flow.InterfaceC43160i) r9
                com.avito.android.search_suggest.mvi.c$b$a r3 = new com.avito.android.search_suggest.mvi.c$b$a
                r3.<init>(r9)
                r9 = 0
                r8.f264298r = r9
                r8.f264297q = r2
                java.lang.Object r9 = kotlinx.coroutines.flow.C43175k.u(r8, r3, r1)
                if (r9 != r0) goto L81
                return r0
            L81:
                kotlin.G0 r9 = kotlin.G0.f406611a
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.search_suggest.mvi.c.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: SearchSuggestActor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/search_suggest/mvi/entity/SearchSuggestInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.search_suggest.mvi.SearchSuggestActor$process$5", f = "SearchSuggestActor.kt", i = {}, l = {98, 97}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.search_suggest.mvi.c$c, reason: collision with other inner class name */
    public static final class C7894c extends SuspendLambda implements p<InterfaceC43172j<? super SearchSuggestInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f264307q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f264308r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ c f264309s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ InterfaceC14824b f264310t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ Pp0.d f264311u;

        /* compiled from: SafeCollector.common.kt */
        @s0
        @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/p1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.search_suggest.mvi.c$c$a */
        public static final class a implements InterfaceC43160i<SearchSuggestInternalAction> {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43160i f264312b;

            /* compiled from: Emitters.kt */
            @s0
            @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/p1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
            /* renamed from: com.avito.android.search_suggest.mvi.c$c$a$a, reason: collision with other inner class name */
            public static final class C7895a<T> implements InterfaceC43172j {

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ InterfaceC43172j f264313b;

                /* compiled from: Emitters.kt */
                @s0
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                @DebugMetadata(c = "com.avito.android.search_suggest.mvi.SearchSuggestActor$process$5$invokeSuspend$$inlined$map$1$2", f = "SearchSuggestActor.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
                /* renamed from: com.avito.android.search_suggest.mvi.c$c$a$a$a, reason: collision with other inner class name */
                public static final class C7896a extends ContinuationImpl {

                    /* renamed from: q, reason: collision with root package name */
                    public /* synthetic */ Object f264314q;

                    /* renamed from: r, reason: collision with root package name */
                    public int f264315r;

                    public C7896a(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @Y61.l
                    public final Object invokeSuspend(@Y61.k Object obj) {
                        this.f264314q = obj;
                        this.f264315r |= BeduinInputModel.MIN_TEXT_VERSION;
                        return C7895a.this.emit(null, this);
                    }
                }

                public C7895a(InterfaceC43172j interfaceC43172j) {
                    this.f264313b = interfaceC43172j;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.InterfaceC43172j
                @Y61.l
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r6, @Y61.k kotlin.coroutines.Continuation r7) {
                    /*
                        r5 = this;
                        boolean r0 = r7 instanceof com.avito.android.search_suggest.mvi.c.C7894c.a.C7895a.C7896a
                        if (r0 == 0) goto L13
                        r0 = r7
                        com.avito.android.search_suggest.mvi.c$c$a$a$a r0 = (com.avito.android.search_suggest.mvi.c.C7894c.a.C7895a.C7896a) r0
                        int r1 = r0.f264315r
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f264315r = r1
                        goto L18
                    L13:
                        com.avito.android.search_suggest.mvi.c$c$a$a$a r0 = new com.avito.android.search_suggest.mvi.c$c$a$a$a
                        r0.<init>(r7)
                    L18:
                        java.lang.Object r7 = r0.f264314q
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                        int r2 = r0.f264315r
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        kotlin.C42729a0.b(r7)
                        goto L7c
                    L29:
                        java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                        java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                        r6.<init>(r7)
                        throw r6
                    L31:
                        kotlin.C42729a0.b(r7)
                        com.avito.android.remote.model.TypedResult r6 = (com.avito.android.remote.model.TypedResult) r6
                        boolean r7 = r6 instanceof com.avito.android.remote.model.TypedResult.Success
                        if (r7 == 0) goto L4c
                        com.avito.android.search_suggest.mvi.entity.SearchSuggestInternalAction$DeeplinkAsResult r7 = new com.avito.android.search_suggest.mvi.entity.SearchSuggestInternalAction$DeeplinkAsResult
                        com.avito.android.remote.model.TypedResult$Success r6 = (com.avito.android.remote.model.TypedResult.Success) r6
                        java.lang.Object r6 = r6.getResult()
                        com.avito.android.remote.model.DeepLinkResponse r6 = (com.avito.android.remote.model.DeepLinkResponse) r6
                        com.avito.android.deep_linking.links.DeepLink r6 = r6.getDeepLink()
                        r7.<init>(r6)
                        goto L71
                    L4c:
                        boolean r7 = r6 instanceof com.avito.android.remote.model.TypedResult.Error
                        if (r7 == 0) goto L7f
                        com.avito.android.util.V2 r7 = com.avito.android.util.V2.f318762a
                        java.lang.StringBuilder r2 = new java.lang.StringBuilder
                        java.lang.String r4 = "link loading failed with: "
                        r2.<init>(r4)
                        com.avito.android.remote.model.TypedResult$Error r6 = (com.avito.android.remote.model.TypedResult.Error) r6
                        com.avito.android.remote.error.ApiError r6 = r6.getError()
                        java.lang.String r6 = r6.getF244063c()
                        r2.append(r6)
                        java.lang.String r6 = r2.toString()
                        java.lang.String r2 = "SearchSuggestActor"
                        r7.d(r2, r6)
                        com.avito.android.search_suggest.mvi.entity.SearchSuggestInternalAction$SearchDeeplinkLoadingFailed r7 = com.avito.android.search_suggest.mvi.entity.SearchSuggestInternalAction.SearchDeeplinkLoadingFailed.f264332b
                    L71:
                        r0.f264315r = r3
                        kotlinx.coroutines.flow.j r6 = r5.f264313b
                        java.lang.Object r6 = r6.emit(r7, r0)
                        if (r6 != r1) goto L7c
                        return r1
                    L7c:
                        kotlin.G0 r6 = kotlin.G0.f406611a
                        return r6
                    L7f:
                        kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException
                        r6.<init>()
                        throw r6
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.avito.android.search_suggest.mvi.c.C7894c.a.C7895a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            public a(InterfaceC43160i interfaceC43160i) {
                this.f264312b = interfaceC43160i;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC43160i
            @Y61.l
            public final Object collect(@Y61.k InterfaceC43172j<? super SearchSuggestInternalAction> interfaceC43172j, @Y61.k Continuation continuation) {
                Object objCollect = this.f264312b.collect(new C7895a(interfaceC43172j), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7894c(InterfaceC14824b interfaceC14824b, Pp0.d dVar, c cVar, Continuation continuation) {
            super(2, continuation);
            this.f264309s = cVar;
            this.f264310t = interfaceC14824b;
            this.f264311u = dVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            C7894c c7894c = new C7894c(this.f264310t, this.f264311u, this.f264309s, continuation);
            c7894c.f264308r = obj;
            return c7894c;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super SearchSuggestInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((C7894c) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            InterfaceC43172j interfaceC43172j;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f264307q;
            if (i12 == 0) {
                C42729a0.b(obj);
                interfaceC43172j = (InterfaceC43172j) this.f264308r;
                c cVar = this.f264309s;
                com.avito.android.search_suggest.g gVar = cVar.f264285b;
                String str = ((InterfaceC14824b.c) this.f264310t).f13309a;
                SearchSuggestArguments searchSuggestArguments = cVar.f264284a;
                SearchParams searchParams = searchSuggestArguments.f264107d;
                Pp0.d dVar = this.f264311u;
                String str2 = dVar.f13328g;
                Boolean boolBoxBoolean = Boxing.boxBoolean(dVar.f13327f);
                this.f264308r = interfaceC43172j;
                this.f264307q = 1;
                obj = gVar.c(str, searchParams, searchSuggestArguments.f264108e, str2, boolBoxBoolean);
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
                interfaceC43172j = (InterfaceC43172j) this.f264308r;
                C42729a0.b(obj);
            }
            a aVar = new a((InterfaceC43160i) obj);
            this.f264308r = null;
            this.f264307q = 2;
            if (C43175k.u(this, aVar, interfaceC43172j) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return G0.f406611a;
        }
    }

    /* compiled from: SearchSuggestActor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/search_suggest/mvi/entity/SearchSuggestInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.search_suggest.mvi.SearchSuggestActor$process$6", f = "SearchSuggestActor.kt", i = {}, l = {120, 121}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements p<InterfaceC43172j<? super SearchSuggestInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f264317q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f264318r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ InterfaceC14824b f264319s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ c f264320t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(InterfaceC14824b interfaceC14824b, c cVar, Continuation<? super d> continuation) {
            super(2, continuation);
            this.f264319s = interfaceC14824b;
            this.f264320t = cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            d dVar = new d(this.f264319s, this.f264320t, continuation);
            dVar.f264318r = obj;
            return dVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super SearchSuggestInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((d) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f264317q;
            InterfaceC14824b interfaceC14824b = this.f264319s;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f264318r;
                SearchSuggestInternalAction.RemoveHistorySearch removeHistorySearch = new SearchSuggestInternalAction.RemoveHistorySearch(((InterfaceC14824b.d) interfaceC14824b).f13310a);
                this.f264317q = 1;
                if (interfaceC43172j.emit(removeHistorySearch, this) == coroutine_suspended) {
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
                C42729a0.b(obj);
            }
            com.avito.android.search_suggest.g gVar = this.f264320t.f264285b;
            String str = ((InterfaceC14824b.d) interfaceC14824b).f13311b;
            this.f264317q = 2;
            if (gVar.b(str) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return G0.f406611a;
        }
    }

    /* compiled from: SearchSuggestActor.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/remote/model/search/suggest/SuggestAction;", "suggestAction", "Lkotlinx/coroutines/flow/i;", "Lcom/avito/android/search_suggest/mvi/entity/SearchSuggestInternalAction;", "<anonymous>", "(Lcom/avito/android/remote/model/search/suggest/SuggestAction;)Lkotlinx/coroutines/flow/i;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.search_suggest.mvi.SearchSuggestActor$process$7", f = "SearchSuggestActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class e extends SuspendLambda implements p<SuggestAction, Continuation<? super InterfaceC43160i<? extends SearchSuggestInternalAction>>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f264321q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ InterfaceC14824b f264322r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ c f264323s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(InterfaceC14824b interfaceC14824b, c cVar, Continuation<? super e> continuation) {
            super(2, continuation);
            this.f264322r = interfaceC14824b;
            this.f264323s = cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            e eVar = new e(this.f264322r, this.f264323s, continuation);
            eVar.f264321q = obj;
            return eVar;
        }

        @Override // Y41.p
        public final Object invoke(SuggestAction suggestAction, Continuation<? super InterfaceC43160i<? extends SearchSuggestInternalAction>> continuation) {
            return ((e) create(suggestAction, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            SuggestAction suggestAction = (SuggestAction) this.f264321q;
            boolean z12 = suggestAction instanceof SuggestNewQuery;
            InterfaceC14824b interfaceC14824b = this.f264322r;
            if (z12) {
                return new C43210w(new SearchSuggestInternalAction.SuggestNewQuery(((SuggestNewQuery) suggestAction).getQuery(), ((InterfaceC14824b.C0869b) interfaceC14824b).f13308b instanceof C14723a));
            }
            if (suggestAction instanceof SuggestAnalyticsEvent) {
                SuggestAnalyticsEvent suggestAnalyticsEvent = (SuggestAnalyticsEvent) suggestAction;
                this.f264323s.f264286c.c(a0.a(new ParametrizedEvent(suggestAnalyticsEvent.getId(), suggestAnalyticsEvent.getVersion(), suggestAnalyticsEvent.getParameters())));
                return C43175k.w();
            }
            if (!(suggestAction instanceof SuggestDeeplink)) {
                return C43175k.w();
            }
            com.avito.android.search.l lVar = ((InterfaceC14824b.C0869b) interfaceC14824b).f13308b;
            return new C43210w(lVar instanceof com.avito.android.list.list_snippet.e ? true : lVar instanceof com.avito.android.list.grid_snippet.item.c ? new SearchSuggestInternalAction.DeeplinkAsNavigation(((SuggestDeeplink) suggestAction).getDeepLink()) : new SearchSuggestInternalAction.DeeplinkAsResult(((SuggestDeeplink) suggestAction).getDeepLink()));
        }
    }

    @Inject
    public c(@Y61.k SearchSuggestArguments searchSuggestArguments, @Y61.k com.avito.android.search_suggest.g gVar, @Y61.k InterfaceC28373a interfaceC28373a) {
        this.f264284a = searchSuggestArguments;
        this.f264285b = gVar;
        this.f264286c = interfaceC28373a;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return C43175k.C(new com.avito.android.search_suggest.mvi.b(aVar, this, null), com.avito.android.arch.mvi.utils.h.a(c43197r1, com.avito.android.search_suggest.mvi.a.f264272l));
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final InterfaceC43160i<SearchSuggestInternalAction> b(@Y61.k InterfaceC14824b interfaceC14824b, @Y61.k Pp0.d dVar) {
        if (interfaceC14824b instanceof InterfaceC14824b.e) {
            return C43175k.G(new a(interfaceC14824b, dVar, this, null));
        }
        if (interfaceC14824b instanceof InterfaceC14824b.f) {
            return C43175k.G(new b(interfaceC14824b, dVar, this, null));
        }
        if (interfaceC14824b instanceof InterfaceC14824b.c) {
            return C43175k.G(new C7894c(interfaceC14824b, dVar, this, null));
        }
        if (interfaceC14824b instanceof InterfaceC14824b.d) {
            return C43175k.G(new d(interfaceC14824b, this, null));
        }
        if (interfaceC14824b instanceof InterfaceC14824b.C0869b) {
            return C43175k.C(new e(interfaceC14824b, this, null), new C43187o(((InterfaceC14824b.C0869b) interfaceC14824b).f13307a));
        }
        if (interfaceC14824b instanceof InterfaceC14824b.g) {
            this.f264286c.c(((InterfaceC14824b.g) interfaceC14824b).f13315a);
            return C43175k.w();
        }
        if (interfaceC14824b instanceof InterfaceC14824b.a) {
            return new C43210w(SearchSuggestInternalAction.CancelClicked.f264327b);
        }
        throw new NoWhenBranchMatchedException();
    }
}
