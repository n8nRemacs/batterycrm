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
@DebugMetadata(c = "com.avito.android.short_term_rent.soft_booking.mvi.StrSoftBookingActor$handlePromoCodeDisabled$1", f = "StrSoftBookingActor.kt", i = {0, 0}, l = {476, 477}, m = "invokeSuspend", n = {"$this$flow", "updatedPromoCodeData"}, s = {"L$0", "L$1"})
/* loaded from: classes3.dex */
final class k extends SuspendLambda implements Y41.p<InterfaceC43172j<? super StrSoftBookingInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public pw0.i f282763q;

    /* renamed from: r, reason: collision with root package name */
    public int f282764r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f282765s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.short_term_rent.soft_booking.mvi.state.a f282766t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ InterfaceC44950a.s f282767u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(com.avito.android.short_term_rent.soft_booking.mvi.state.a aVar, InterfaceC44950a.s sVar, Continuation<? super k> continuation) {
        super(2, continuation);
        this.f282766t = aVar;
        this.f282767u = sVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        k kVar = new k(this.f282766t, this.f282767u, continuation);
        kVar.f282765s = obj;
        return kVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super StrSoftBookingInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((k) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0060 A[RETURN] */
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
            int r1 = r8.f282764r
            r2 = 1
            r3 = 2
            r4 = 0
            if (r1 == 0) goto L25
            if (r1 == r2) goto L1b
            if (r1 != r3) goto L13
            kotlin.C42729a0.b(r9)
            goto L61
        L13:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L1b:
            pw0.i r1 = r8.f282763q
            java.lang.Object r2 = r8.f282765s
            kotlinx.coroutines.flow.j r2 = (kotlinx.coroutines.flow.InterfaceC43172j) r2
            kotlin.C42729a0.b(r9)
            goto L4e
        L25:
            kotlin.C42729a0.b(r9)
            java.lang.Object r9 = r8.f282765s
            kotlinx.coroutines.flow.j r9 = (kotlinx.coroutines.flow.InterfaceC43172j) r9
            com.avito.android.short_term_rent.soft_booking.mvi.state.a r1 = r8.f282766t
            pw0.i r1 = r1.f282799h
            pw0.i r1 = pw0.i.a(r1, r4)
            ow0.a$s r5 = r8.f282767u
            java.lang.String r5 = r5.f422355a
            if (r5 == 0) goto L4f
            com.avito.android.short_term_rent.soft_booking.mvi.entity.StrSoftBookingInternalAction$ShowPromoCodeMessage r6 = new com.avito.android.short_term_rent.soft_booking.mvi.entity.StrSoftBookingInternalAction$ShowPromoCodeMessage
            r7 = 0
            r6.<init>(r5, r7)
            r8.f282765s = r9
            r8.f282763q = r1
            r8.f282764r = r2
            java.lang.Object r2 = r9.emit(r6, r8)
            if (r2 != r0) goto L4d
            return r0
        L4d:
            r2 = r9
        L4e:
            r9 = r2
        L4f:
            com.avito.android.short_term_rent.soft_booking.mvi.entity.StrSoftBookingInternalAction$UpdateSelectedPromoCode r2 = new com.avito.android.short_term_rent.soft_booking.mvi.entity.StrSoftBookingInternalAction$UpdateSelectedPromoCode
            r2.<init>(r1)
            r8.f282765s = r4
            r8.f282763q = r4
            r8.f282764r = r3
            java.lang.Object r9 = r9.emit(r2, r8)
            if (r9 != r0) goto L61
            return r0
        L61:
            kotlin.G0 r9 = kotlin.G0.f406611a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.short_term_rent.soft_booking.mvi.k.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
