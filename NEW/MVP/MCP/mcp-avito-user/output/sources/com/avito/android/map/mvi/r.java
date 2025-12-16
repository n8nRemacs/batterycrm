package com.avito.android.map.mvi;

import com.avito.android.map.mvi.entity.MapInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: MapActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/map/mvi/entity/MapInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.map.mvi.MapActor$sendSearchByMapFlow$1", f = "MapActor.kt", i = {0}, l = {601, 611}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
/* loaded from: classes14.dex */
final class r extends SuspendLambda implements Y41.p<InterfaceC43172j<? super MapInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f185295q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f185296r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.map.mvi.entity.a f185297s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C31612a f185298t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(C31612a c31612a, com.avito.android.map.mvi.entity.a aVar, Continuation continuation) {
        super(2, continuation);
        this.f185297s = aVar;
        this.f185298t = c31612a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        r rVar = new r(this.f185298t, this.f185297s, continuation);
        rVar.f185296r = obj;
        return rVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super MapInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((r) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x007a A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r15) {
        /*
            r14 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r14.f185295q
            com.avito.android.map.mvi.a r2 = r14.f185298t
            r3 = 2
            r4 = 1
            com.avito.android.map.mvi.entity.a r5 = r14.f185297s
            if (r1 == 0) goto L26
            if (r1 == r4) goto L1e
            if (r1 != r3) goto L16
            kotlin.C42729a0.b(r15)
            goto L7b
        L16:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r15.<init>(r0)
            throw r15
        L1e:
            java.lang.Object r1 = r14.f185296r
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            kotlin.C42729a0.b(r15)
            goto L4d
        L26:
            kotlin.C42729a0.b(r15)
            java.lang.Object r15 = r14.f185296r
            r1 = r15
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            com.avito.android.map.analytics.ParentType r15 = r5.f185165p
            com.avito.android.map.analytics.ParentType r6 = com.avito.android.map.analytics.ParentType.f184822c
            if (r15 == r6) goto L7b
            com.avito.android.map.analytics.ParentType r6 = com.avito.android.map.analytics.ParentType.f184823d
            if (r15 == r6) goto L4d
            com.avito.android.map.analytics.a r15 = r2.f185008d
            r15.a()
            com.avito.android.map.mvi.entity.MapInternalAction$AnalyticsParentTypeUpdated r15 = new com.avito.android.map.mvi.entity.MapInternalAction$AnalyticsParentTypeUpdated
            r15.<init>(r6)
            r14.f185296r = r1
            r14.f185295q = r4
            java.lang.Object r15 = r1.emit(r15, r14)
            if (r15 != r0) goto L4d
            return r0
        L4d:
            com.avito.android.map.analytics.a r6 = r2.f185008d
            com.avito.android.remote.model.SearchParams r7 = r5.f185151b
            long r8 = r5.j()
            com.avito.android.remote.model.SearchParams r15 = r5.f185151b
            com.avito.android.remote.model.Source r15 = r15.getSource()
            boolean r12 = com.avito.android.remote.model.SourceKt.isRecommendations(r15)
            com.avito.android.map_core.analytics.event.SourceAction r13 = com.avito.android.map_core.analytics.event.SourceAction.f185597c
            com.google.android.gms.maps.model.LatLngBounds r10 = r5.f185157h
            java.lang.Float r11 = r5.f185156g
            r6.i(r7, r8, r10, r11, r12, r13)
            com.avito.android.map.mvi.entity.MapInternalAction$AnalyticsParentTypeUpdated r15 = new com.avito.android.map.mvi.entity.MapInternalAction$AnalyticsParentTypeUpdated
            com.avito.android.map.analytics.ParentType r2 = com.avito.android.map.analytics.ParentType.f184822c
            r15.<init>(r2)
            r2 = 0
            r14.f185296r = r2
            r14.f185295q = r3
            java.lang.Object r15 = r1.emit(r15, r14)
            if (r15 != r0) goto L7b
            return r0
        L7b:
            kotlin.G0 r15 = kotlin.G0.f406611a
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.map.mvi.r.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
