package com.avito.android.travel_search.mvi;

import com.avito.android.travel_search.TravelSearchOpenParams;
import com.avito.android.travel_search.mvi.entity.TravelSearchInternalAction;
import com.google.crypto.tink.aead.internal.InsecureNonceXChaCha20;
import com.huawei.hms.adapter.internal.AvailableCode;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: TravelSearchBootstrap.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/travel_search/mvi/g;", "Lcom/avito/android/arch/mvi/b;", "Lcom/avito/android/travel_search/mvi/entity/TravelSearchInternalAction;", "_avito_travel-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class g implements com.avito.android.arch.mvi.b<TravelSearchInternalAction> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.travel_search.domain.h f303174a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final TravelSearchOpenParams f303175b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f303176c;

    /* compiled from: TravelSearchBootstrap.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/travel_search/mvi/entity/TravelSearchInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.travel_search.mvi.TravelSearchBootstrap$produce$1", f = "TravelSearchBootstrap.kt", i = {0, 1}, l = {23, InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES, AvailableCode.ERROR_ON_ACTIVITY_RESULT}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
    public static final class a extends SuspendLambda implements Y41.p<InterfaceC43172j<? super TravelSearchInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f303177q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f303178r;

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = g.this.new a(continuation);
            aVar.f303178r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super TravelSearchInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:25:0x007b A[RETURN] */
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
                int r1 = r7.f303177q
                r2 = 3
                r3 = 2
                r4 = 1
                com.avito.android.travel_search.mvi.g r5 = com.avito.android.travel_search.mvi.g.this
                if (r1 == 0) goto L2f
                if (r1 == r4) goto L27
                if (r1 == r3) goto L1f
                if (r1 != r2) goto L17
                kotlin.C42729a0.b(r8)
                goto L7c
            L17:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L1f:
                java.lang.Object r1 = r7.f303178r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r8)
                goto L64
            L27:
                java.lang.Object r1 = r7.f303178r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r8)
                goto L50
            L2f:
                kotlin.C42729a0.b(r8)
                java.lang.Object r8 = r7.f303178r
                kotlinx.coroutines.flow.j r8 = (kotlinx.coroutines.flow.InterfaceC43172j) r8
                boolean r1 = r5.f303176c
                if (r1 == 0) goto L3d
                kotlin.G0 r8 = kotlin.G0.f406611a
                return r8
            L3d:
                com.avito.android.travel_search.mvi.entity.TravelSearchInternalAction$InitState r1 = new com.avito.android.travel_search.mvi.entity.TravelSearchInternalAction$InitState
                com.avito.android.travel_search.TravelSearchOpenParams r6 = r5.f303175b
                r1.<init>(r6)
                r7.f303178r = r8
                r7.f303177q = r4
                java.lang.Object r1 = r8.emit(r1, r7)
                if (r1 != r0) goto L4f
                return r0
            L4f:
                r1 = r8
            L50:
                com.avito.android.travel_search.mvi.entity.TravelSearchInternalAction$InitInlineFilters r8 = new com.avito.android.travel_search.mvi.entity.TravelSearchInternalAction$InitInlineFilters
                com.avito.android.travel_search.TravelSearchOpenParams r6 = r5.f303175b
                com.avito.android.remote.model.SearchParams r6 = r6.f302764b
                r8.<init>(r6)
                r7.f303178r = r1
                r7.f303177q = r3
                java.lang.Object r8 = r1.emit(r8, r7)
                if (r8 != r0) goto L64
                return r0
            L64:
                com.avito.android.travel_search.domain.h r8 = r5.f303174a
                com.avito.android.travel_search.TravelSearchOpenParams r3 = r5.f303175b
                com.avito.android.travel_search.deeplink.TravelSearchLink$TravelSearchFlow r6 = r3.f302765c
                com.avito.android.remote.model.SearchParams r3 = r3.f302764b
                kotlinx.coroutines.flow.i r8 = r8.a(r3, r6)
                r3 = 0
                r7.f303178r = r3
                r7.f303177q = r2
                java.lang.Object r8 = kotlinx.coroutines.flow.C43175k.u(r7, r8, r1)
                if (r8 != r0) goto L7c
                return r0
            L7c:
                r5.f303176c = r4
                kotlin.G0 r8 = kotlin.G0.f406611a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.travel_search.mvi.g.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Inject
    public g(@Y61.k com.avito.android.travel_search.domain.h hVar, @Y61.k TravelSearchOpenParams travelSearchOpenParams) {
        this.f303174a = hVar;
        this.f303175b = travelSearchOpenParams;
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.k
    public final InterfaceC43160i<TravelSearchInternalAction> a() {
        return C43175k.G(new a(null));
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.l
    public final Object b(@Y61.k Continuation<? super G0> continuation) {
        return G0.f406611a;
    }
}
