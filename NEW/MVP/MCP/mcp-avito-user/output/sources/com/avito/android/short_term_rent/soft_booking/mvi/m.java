package com.avito.android.short_term_rent.soft_booking.mvi;

import com.avito.android.short_term_rent.soft_booking.mvi.entity.StrSoftBookingInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43172j;
import ow0.InterfaceC44950a;

/* compiled from: StrSoftBookingActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/short_term_rent/soft_booking/mvi/entity/StrSoftBookingInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.short_term_rent.soft_booking.mvi.StrSoftBookingActor$handlePromoCodeSelected$1", f = "StrSoftBookingActor.kt", i = {0, 0}, l = {464, 465}, m = "invokeSuspend", n = {"$this$flow", "updatedPromoCodeData"}, s = {"L$0", "L$1"})
/* loaded from: classes3.dex */
final class m extends SuspendLambda implements Y41.p<InterfaceC43172j<? super StrSoftBookingInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public pw0.i f282772q;

    /* renamed from: r, reason: collision with root package name */
    public int f282773r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f282774s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.short_term_rent.soft_booking.mvi.state.a f282775t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ InterfaceC44950a.u f282776u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(com.avito.android.short_term_rent.soft_booking.mvi.state.a aVar, InterfaceC44950a.u uVar, Continuation<? super m> continuation) {
        super(2, continuation);
        this.f282775t = aVar;
        this.f282776u = uVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        m mVar = new m(this.f282775t, this.f282776u, continuation);
        mVar.f282774s = obj;
        return mVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super StrSoftBookingInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((m) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0061 A[RETURN] */
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
            int r1 = r6.f282773r
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L24
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            kotlin.C42729a0.b(r7)
            goto L62
        L12:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1a:
            pw0.i r1 = r6.f282772q
            java.lang.Object r3 = r6.f282774s
            kotlinx.coroutines.flow.j r3 = (kotlinx.coroutines.flow.InterfaceC43172j) r3
            kotlin.C42729a0.b(r7)
            goto L4e
        L24:
            kotlin.C42729a0.b(r7)
            java.lang.Object r7 = r6.f282774s
            kotlinx.coroutines.flow.j r7 = (kotlinx.coroutines.flow.InterfaceC43172j) r7
            com.avito.android.short_term_rent.soft_booking.mvi.state.a r1 = r6.f282775t
            pw0.i r1 = r1.f282799h
            ow0.a$u r4 = r6.f282776u
            com.avito.android.short_term_rent.common.entity.PromoCode r5 = r4.f422357a
            pw0.i r1 = pw0.i.a(r1, r5)
            java.lang.String r4 = r4.f422358b
            if (r4 == 0) goto L4f
            com.avito.android.short_term_rent.soft_booking.mvi.entity.StrSoftBookingInternalAction$ShowPromoCodeMessage r5 = new com.avito.android.short_term_rent.soft_booking.mvi.entity.StrSoftBookingInternalAction$ShowPromoCodeMessage
            r5.<init>(r4, r3)
            r6.f282774s = r7
            r6.f282772q = r1
            r6.f282773r = r3
            java.lang.Object r3 = r7.emit(r5, r6)
            if (r3 != r0) goto L4d
            return r0
        L4d:
            r3 = r7
        L4e:
            r7 = r3
        L4f:
            com.avito.android.short_term_rent.soft_booking.mvi.entity.StrSoftBookingInternalAction$UpdateSelectedPromoCode r3 = new com.avito.android.short_term_rent.soft_booking.mvi.entity.StrSoftBookingInternalAction$UpdateSelectedPromoCode
            r3.<init>(r1)
            r1 = 0
            r6.f282774s = r1
            r6.f282772q = r1
            r6.f282773r = r2
            java.lang.Object r7 = r7.emit(r3, r6)
            if (r7 != r0) goto L62
            return r0
        L62:
            kotlin.G0 r7 = kotlin.G0.f406611a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.short_term_rent.soft_booking.mvi.m.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
