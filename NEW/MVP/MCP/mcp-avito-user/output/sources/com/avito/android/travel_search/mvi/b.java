package com.avito.android.travel_search.mvi;

import com.avito.android.remote.model.SearchParams;
import com.avito.android.travel_search.mvi.entity.TravelSearchInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;
import vF0.InterfaceC49206a;

/* compiled from: TravelSearchActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/travel_search/mvi/entity/TravelSearchInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.travel_search.mvi.TravelSearchActor$process$2", f = "TravelSearchActor.kt", i = {0, 0}, l = {64, 70}, m = "invokeSuspend", n = {"$this$flow", "updatedSearchParams"}, s = {"L$0", "L$1"})
/* loaded from: classes4.dex */
final class b extends SuspendLambda implements Y41.p<InterfaceC43172j<? super TravelSearchInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public SearchParams f303128q;

    /* renamed from: r, reason: collision with root package name */
    public int f303129r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f303130s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ InterfaceC49206a f303131t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ e f303132u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ vF0.g f303133v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(InterfaceC49206a interfaceC49206a, e eVar, vF0.g gVar, Continuation<? super b> continuation) {
        super(2, continuation);
        this.f303131t = interfaceC49206a;
        this.f303132u = eVar;
        this.f303133v = gVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        b bVar = new b(this.f303131t, this.f303132u, this.f303133v, continuation);
        bVar.f303130s = obj;
        return bVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super TravelSearchInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((b) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x006d A[RETURN] */
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
            int r1 = r6.f303129r
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L24
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            kotlin.C42729a0.b(r7)
            goto L6e
        L12:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1a:
            com.avito.android.remote.model.SearchParams r1 = r6.f303128q
            java.lang.Object r3 = r6.f303130s
            kotlinx.coroutines.flow.j r3 = (kotlinx.coroutines.flow.InterfaceC43172j) r3
            kotlin.C42729a0.b(r7)
            goto L5b
        L24:
            kotlin.C42729a0.b(r7)
            java.lang.Object r7 = r6.f303130s
            kotlinx.coroutines.flow.j r7 = (kotlinx.coroutines.flow.InterfaceC43172j) r7
            vF0.a r1 = r6.f303131t
            vF0.a$d r1 = (vF0.InterfaceC49206a.d) r1
            com.avito.android.deep_linking.links.DeepLink r1 = r1.f440564a
            boolean r4 = r1 instanceof com.avito.android.travel_search.deeplink.TravelSearchLink
            if (r4 == 0) goto L6e
            com.avito.android.travel_search.deeplink.TravelSearchLink r1 = (com.avito.android.travel_search.deeplink.TravelSearchLink) r1
            com.avito.android.remote.model.SearchParams r1 = r1.f302770b
            if (r1 != 0) goto L41
            com.avito.android.remote.model.SearchParams$Companion r1 = com.avito.android.remote.model.SearchParams.INSTANCE
            com.avito.android.remote.model.SearchParams r1 = r1.getEMPTY()
        L41:
            com.avito.android.travel_search.mvi.e r4 = r6.f303132u
            com.avito.android.travel_search.domain.h r4 = r4.f303141a
            vF0.g r5 = r6.f303133v
            com.avito.android.travel_search.deeplink.TravelSearchLink$TravelSearchFlow r5 = r5.f440608c
            kotlinx.coroutines.flow.i r4 = r4.a(r1, r5)
            r6.f303130s = r7
            r6.f303128q = r1
            r6.f303129r = r3
            java.lang.Object r3 = kotlinx.coroutines.flow.C43175k.u(r6, r4, r7)
            if (r3 != r0) goto L5a
            return r0
        L5a:
            r3 = r7
        L5b:
            com.avito.android.travel_search.mvi.entity.TravelSearchInternalAction$UpdateSearchParams r7 = new com.avito.android.travel_search.mvi.entity.TravelSearchInternalAction$UpdateSearchParams
            r7.<init>(r1)
            r1 = 0
            r6.f303130s = r1
            r6.f303128q = r1
            r6.f303129r = r2
            java.lang.Object r7 = r3.emit(r7, r6)
            if (r7 != r0) goto L6e
            return r0
        L6e:
            kotlin.G0 r7 = kotlin.G0.f406611a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.travel_search.mvi.b.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
