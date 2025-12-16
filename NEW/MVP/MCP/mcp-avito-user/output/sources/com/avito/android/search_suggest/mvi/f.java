package com.avito.android.search_suggest.mvi;

import Y41.p;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.search_suggest.SearchSuggestArguments;
import com.avito.android.search_suggest.mvi.entity.SearchSuggestInternalAction;
import com.google.crypto.tink.aead.internal.InsecureNonceXChaCha20;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: SearchSuggestBootstrap.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/search_suggest/mvi/f;", "Lcom/avito/android/arch/mvi/b;", "Lcom/avito/android/search_suggest/mvi/entity/SearchSuggestInternalAction;", "_avito_search-suggest_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class f implements com.avito.android.arch.mvi.b<SearchSuggestInternalAction> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final SearchSuggestArguments f264336a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.search_suggest.g f264337b;

    /* compiled from: SearchSuggestBootstrap.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/search_suggest/mvi/entity/SearchSuggestInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.search_suggest.mvi.SearchSuggestBootstrap$produce$1", f = "SearchSuggestBootstrap.kt", i = {0, 1}, l = {21, 22, InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES, 23}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
    public static final class a extends SuspendLambda implements p<InterfaceC43172j<? super SearchSuggestInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f264338q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f264339r;

        /* compiled from: SafeCollector.common.kt */
        @s0
        @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/p1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.search_suggest.mvi.f$a$a, reason: collision with other inner class name */
        public static final class C7897a implements InterfaceC43160i<SearchSuggestInternalAction.SearchSuggestLoaded> {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43160i f264341b;

            /* compiled from: Emitters.kt */
            @s0
            @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/p1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
            /* renamed from: com.avito.android.search_suggest.mvi.f$a$a$a, reason: collision with other inner class name */
            public static final class C7898a<T> implements InterfaceC43172j {

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ InterfaceC43172j f264342b;

                /* compiled from: Emitters.kt */
                @s0
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                @DebugMetadata(c = "com.avito.android.search_suggest.mvi.SearchSuggestBootstrap$produce$1$invokeSuspend$$inlined$map$1$2", f = "SearchSuggestBootstrap.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
                /* renamed from: com.avito.android.search_suggest.mvi.f$a$a$a$a, reason: collision with other inner class name */
                public static final class C7899a extends ContinuationImpl {

                    /* renamed from: q, reason: collision with root package name */
                    public /* synthetic */ Object f264343q;

                    /* renamed from: r, reason: collision with root package name */
                    public int f264344r;

                    public C7899a(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @Y61.l
                    public final Object invokeSuspend(@Y61.k Object obj) {
                        this.f264343q = obj;
                        this.f264344r |= BeduinInputModel.MIN_TEXT_VERSION;
                        return C7898a.this.emit(null, this);
                    }
                }

                public C7898a(InterfaceC43172j interfaceC43172j) {
                    this.f264342b = interfaceC43172j;
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
                        boolean r0 = r6 instanceof com.avito.android.search_suggest.mvi.f.a.C7897a.C7898a.C7899a
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.avito.android.search_suggest.mvi.f$a$a$a$a r0 = (com.avito.android.search_suggest.mvi.f.a.C7897a.C7898a.C7899a) r0
                        int r1 = r0.f264344r
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f264344r = r1
                        goto L18
                    L13:
                        com.avito.android.search_suggest.mvi.f$a$a$a$a r0 = new com.avito.android.search_suggest.mvi.f$a$a$a$a
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.f264343q
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                        int r2 = r0.f264344r
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
                        r0.f264344r = r3
                        kotlinx.coroutines.flow.j r5 = r4.f264342b
                        java.lang.Object r5 = r5.emit(r6, r0)
                        if (r5 != r1) goto L46
                        return r1
                    L46:
                        kotlin.G0 r5 = kotlin.G0.f406611a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.avito.android.search_suggest.mvi.f.a.C7897a.C7898a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            public C7897a(InterfaceC43160i interfaceC43160i) {
                this.f264341b = interfaceC43160i;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC43160i
            @Y61.l
            public final Object collect(@Y61.k InterfaceC43172j<? super SearchSuggestInternalAction.SearchSuggestLoaded> interfaceC43172j, @Y61.k Continuation continuation) {
                Object objCollect = this.f264341b.collect(new C7898a(interfaceC43172j), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
            }
        }

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = f.this.new a(continuation);
            aVar.f264339r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super SearchSuggestInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0076 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0089 A[RETURN] */
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
                int r1 = r7.f264338q
                r2 = 4
                r3 = 3
                r4 = 2
                r5 = 1
                if (r1 == 0) goto L38
                if (r1 == r5) goto L30
                if (r1 == r4) goto L28
                if (r1 == r3) goto L20
                if (r1 != r2) goto L18
                kotlin.C42729a0.b(r8)
                goto L8a
            L18:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L20:
                java.lang.Object r1 = r7.f264339r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r8)
                goto L77
            L28:
                java.lang.Object r1 = r7.f264339r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r8)
                goto L5d
            L30:
                java.lang.Object r1 = r7.f264339r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r8)
                goto L4d
            L38:
                kotlin.C42729a0.b(r8)
                java.lang.Object r8 = r7.f264339r
                r1 = r8
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                com.avito.android.search_suggest.mvi.entity.SearchSuggestInternalAction$RequestInputFocus r8 = com.avito.android.search_suggest.mvi.entity.SearchSuggestInternalAction.RequestInputFocus.f264331b
                r7.f264339r = r1
                r7.f264338q = r5
                java.lang.Object r8 = r1.emit(r8, r7)
                if (r8 != r0) goto L4d
                return r0
            L4d:
                com.avito.android.search_suggest.mvi.entity.SearchSuggestInternalAction$SearchSuggestLoading r8 = new com.avito.android.search_suggest.mvi.entity.SearchSuggestInternalAction$SearchSuggestLoading
                r8.<init>()
                r7.f264339r = r1
                r7.f264338q = r4
                java.lang.Object r8 = r1.emit(r8, r7)
                if (r8 != r0) goto L5d
                return r0
            L5d:
                com.avito.android.search_suggest.mvi.f r8 = com.avito.android.search_suggest.mvi.f.this
                com.avito.android.search_suggest.g r4 = r8.f264337b
                com.avito.android.search_suggest.SearchSuggestArguments r8 = r8.f264336a
                java.lang.String r5 = r8.f264105b
                java.util.Map r6 = kotlin.collections.P0.c()
                com.avito.android.remote.model.SearchParams r8 = r8.f264107d
                r7.f264339r = r1
                r7.f264338q = r3
                r8 = 0
                java.lang.Object r8 = r4.a(r5, r6, r8)
                if (r8 != r0) goto L77
                return r0
            L77:
                kotlinx.coroutines.flow.i r8 = (kotlinx.coroutines.flow.InterfaceC43160i) r8
                com.avito.android.search_suggest.mvi.f$a$a r3 = new com.avito.android.search_suggest.mvi.f$a$a
                r3.<init>(r8)
                r8 = 0
                r7.f264339r = r8
                r7.f264338q = r2
                java.lang.Object r8 = kotlinx.coroutines.flow.C43175k.u(r7, r3, r1)
                if (r8 != r0) goto L8a
                return r0
            L8a:
                kotlin.G0 r8 = kotlin.G0.f406611a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.search_suggest.mvi.f.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Inject
    public f(@Y61.k SearchSuggestArguments searchSuggestArguments, @Y61.k com.avito.android.search_suggest.g gVar) {
        this.f264336a = searchSuggestArguments;
        this.f264337b = gVar;
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.k
    public final InterfaceC43160i<SearchSuggestInternalAction> a() {
        return this.f264336a.f264111h ? C43175k.G(new a(null)) : C43175k.w();
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.l
    public final Object b(@Y61.k Continuation<? super G0> continuation) {
        return G0.f406611a;
    }
}
