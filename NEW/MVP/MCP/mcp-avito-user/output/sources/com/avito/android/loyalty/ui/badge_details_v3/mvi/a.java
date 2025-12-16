package com.avito.android.loyalty.ui.badge_details_v3.mvi;

import Y41.p;
import com.avito.android.loyalty.ui.badge_details_v3.mvi.entity.BadgeDetailsV3InternalAction;
import com.huawei.hms.adapter.internal.AvailableCode;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: BadgeDetailsV3Actor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/loyalty/ui/badge_details_v3/mvi/entity/BadgeDetailsV3InternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.loyalty.ui.badge_details_v3.mvi.BadgeDetailsV3Actor$process$1", f = "BadgeDetailsV3Actor.kt", i = {0}, l = {AvailableCode.HMS_IS_SPOOF, 30, 30}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
/* loaded from: classes14.dex */
final class a extends SuspendLambda implements p<InterfaceC43172j<? super BadgeDetailsV3InternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f183313q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f183314r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ b f183315s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, Continuation<? super a> continuation) {
        super(2, continuation);
        this.f183315s = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        a aVar = new a(this.f183315s, continuation);
        aVar.f183314r = obj;
        return aVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super BadgeDetailsV3InternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005e A[RETURN] */
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
            int r1 = r5.f183313q
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L2d
            if (r1 == r4) goto L25
            if (r1 == r3) goto L1d
            if (r1 != r2) goto L15
            kotlin.C42729a0.b(r6)
            goto L5f
        L15:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L1d:
            java.lang.Object r1 = r5.f183314r
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            kotlin.C42729a0.b(r6)
            goto L53
        L25:
            java.lang.Object r1 = r5.f183314r
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            kotlin.C42729a0.b(r6)
            goto L42
        L2d:
            kotlin.C42729a0.b(r6)
            java.lang.Object r6 = r5.f183314r
            kotlinx.coroutines.flow.j r6 = (kotlinx.coroutines.flow.InterfaceC43172j) r6
            com.avito.android.loyalty.ui.badge_details_v3.mvi.entity.BadgeDetailsV3InternalAction$Loading r1 = com.avito.android.loyalty.ui.badge_details_v3.mvi.entity.BadgeDetailsV3InternalAction.Loading.f183339b
            r5.f183314r = r6
            r5.f183313q = r4
            java.lang.Object r1 = r6.emit(r1, r5)
            if (r1 != r0) goto L41
            return r0
        L41:
            r1 = r6
        L42:
            com.avito.android.loyalty.ui.badge_details_v3.mvi.b r6 = r5.f183315s
            com.avito.android.loyalty.ui.badge_details_v3.e r4 = r6.f183316a
            r5.f183314r = r1
            r5.f183313q = r3
            java.lang.String r6 = r6.f183317b
            java.lang.Object r6 = r4.a(r6, r5)
            if (r6 != r0) goto L53
            return r0
        L53:
            r3 = 0
            r5.f183314r = r3
            r5.f183313q = r2
            java.lang.Object r6 = r1.emit(r6, r5)
            if (r6 != r0) goto L5f
            return r0
        L5f:
            kotlin.G0 r6 = kotlin.G0.f406611a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.loyalty.ui.badge_details_v3.mvi.a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
