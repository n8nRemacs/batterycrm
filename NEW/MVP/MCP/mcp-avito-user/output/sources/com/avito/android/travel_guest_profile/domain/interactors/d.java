package com.avito.android.travel_guest_profile.domain.interactors;

import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: TravelGuestProfileInteractor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.travel_guest_profile.domain.interactors.TravelGuestProfileInteractor$loadMockContent$1", f = "TravelGuestProfileInteractor.kt", i = {0, 1}, l = {57, 58, 59}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
/* loaded from: classes4.dex */
final class d extends SuspendLambda implements Y41.p<InterfaceC43172j<?>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f301990q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f301991r;

    public d() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        d dVar = new d(2, continuation);
        dVar.f301991r = obj;
        return dVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<?> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((d) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x006e A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r6) {
        /*
            r5 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r5.f301990q
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L2d
            if (r1 == r4) goto L25
            if (r1 == r3) goto L1d
            if (r1 != r2) goto L15
            kotlin.C42729a0.b(r6)
            goto L6f
        L15:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L1d:
            java.lang.Object r1 = r5.f301991r
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            kotlin.C42729a0.b(r6)
            goto L52
        L25:
            java.lang.Object r1 = r5.f301991r
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            kotlin.C42729a0.b(r6)
            goto L45
        L2d:
            kotlin.C42729a0.b(r6)
            java.lang.Object r6 = r5.f301991r
            kotlinx.coroutines.flow.j r6 = (kotlinx.coroutines.flow.InterfaceC43172j) r6
            com.avito.android.travel_guest_profile.mvi.entity.TravelGuestProfileInternalAction$LoadingStarted r1 = new com.avito.android.travel_guest_profile.mvi.entity.TravelGuestProfileInternalAction$LoadingStarted
            r1.<init>()
            r5.f301991r = r6
            r5.f301990q = r4
            java.lang.Object r1 = r6.emit(r1, r5)
            if (r1 != r0) goto L44
            return r0
        L44:
            r1 = r6
        L45:
            r5.f301991r = r1
            r5.f301990q = r3
            r3 = 2000(0x7d0, double:9.88E-321)
            java.lang.Object r6 = kotlinx.coroutines.C43131e0.b(r3, r5)
            if (r6 != r0) goto L52
            return r0
        L52:
            com.avito.android.travel_guest_profile.mvi.entity.TravelGuestProfileInternalAction$ContentLoaded r6 = new com.avito.android.travel_guest_profile.mvi.entity.TravelGuestProfileInternalAction$ContentLoaded
            OE0.b r3 = new OE0.b
            com.avito.android.travel_guest_profile.domain.a r4 = com.avito.android.travel_guest_profile.domain.a.f301931a
            r4.getClass()
            java.util.List<OE0.a> r4 = com.avito.android.travel_guest_profile.domain.a.f301932b
            r3.<init>(r4)
            r6.<init>(r3)
            r3 = 0
            r5.f301991r = r3
            r5.f301990q = r2
            java.lang.Object r6 = r1.emit(r6, r5)
            if (r6 != r0) goto L6f
            return r0
        L6f:
            kotlin.G0 r6 = kotlin.G0.f406611a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.travel_guest_profile.domain.interactors.d.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
