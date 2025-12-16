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
@DebugMetadata(c = "com.avito.android.short_term_rent.soft_booking.mvi.StrSoftBookingActor$handleNewPromoCodeApplied$1", f = "StrSoftBookingActor.kt", i = {0, 0}, l = {442, 443}, m = "invokeSuspend", n = {"$this$flow", "updatedPromoCode"}, s = {"L$0", "L$1"})
/* loaded from: classes3.dex */
final class i extends SuspendLambda implements Y41.p<InterfaceC43172j<? super StrSoftBookingInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public pw0.i f282752q;

    /* renamed from: r, reason: collision with root package name */
    public int f282753r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f282754s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.short_term_rent.soft_booking.mvi.state.a f282755t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ InterfaceC44950a.r f282756u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ C34981a f282757v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(com.avito.android.short_term_rent.soft_booking.mvi.state.a aVar, InterfaceC44950a.r rVar, C34981a c34981a, Continuation<? super i> continuation) {
        super(2, continuation);
        this.f282755t = aVar;
        this.f282756u = rVar;
        this.f282757v = c34981a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        i iVar = new i(this.f282755t, this.f282756u, this.f282757v, continuation);
        iVar.f282754s = obj;
        return iVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super StrSoftBookingInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((i) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00a9 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r27) {
        /*
            r26 = this;
            r0 = r26
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f282753r
            com.avito.android.short_term_rent.soft_booking.mvi.state.a r3 = r0.f282755t
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L29
            if (r2 == r5) goto L1f
            if (r2 != r4) goto L17
            kotlin.C42729a0.b(r27)
            goto Laa
        L17:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L1f:
            pw0.i r2 = r0.f282752q
            java.lang.Object r5 = r0.f282754s
            kotlinx.coroutines.flow.j r5 = (kotlinx.coroutines.flow.InterfaceC43172j) r5
            kotlin.C42729a0.b(r27)
            goto L84
        L29:
            kotlin.C42729a0.b(r27)
            java.lang.Object r2 = r0.f282754s
            kotlinx.coroutines.flow.j r2 = (kotlinx.coroutines.flow.InterfaceC43172j) r2
            pw0.i r6 = r3.f282799h
            com.avito.android.short_term_rent.common.entity.PromoCode r7 = r6.f428880a
            ow0.a$r r8 = r0.f282756u
            if (r7 == 0) goto L4e
            java.lang.String r13 = r8.f422353a
            com.avito.android.short_term_rent.common.entity.PromoCode r16 = new com.avito.android.short_term_rent.common.entity.PromoCode
            java.lang.String r14 = r7.f282221f
            java.util.List<com.avito.android.short_term_rent.soft_booking.mvi.state.viewstate.entity.CostInfo> r15 = r7.f282222g
            java.lang.String r10 = r7.f282217b
            java.lang.String r11 = r7.f282218c
            com.avito.android.remote.model.UniversalImage r12 = r7.f282219d
            r9 = r16
            r9.<init>(r10, r11, r12, r13, r14, r15)
        L4b:
            r7 = r16
            goto L68
        L4e:
            com.avito.android.short_term_rent.common.entity.PromoCode r16 = new com.avito.android.short_term_rent.common.entity.PromoCode
            java.lang.String r7 = r8.f422353a
            r22 = 0
            r23 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r24 = 55
            r25 = 0
            r17 = r16
            r21 = r7
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25)
            goto L4b
        L68:
            pw0.i r6 = pw0.i.a(r6, r7)
            java.lang.String r7 = r8.f422354b
            if (r7 == 0) goto L87
            com.avito.android.short_term_rent.soft_booking.mvi.entity.StrSoftBookingInternalAction$ShowPromoCodeMessage r8 = new com.avito.android.short_term_rent.soft_booking.mvi.entity.StrSoftBookingInternalAction$ShowPromoCodeMessage
            r8.<init>(r7, r5)
            r0.f282754s = r2
            r0.f282752q = r6
            r0.f282753r = r5
            java.lang.Object r5 = r2.emit(r8, r0)
            if (r5 != r1) goto L82
            return r1
        L82:
            r5 = r2
            r2 = r6
        L84:
            r10 = r2
            r2 = r5
            goto L88
        L87:
            r10 = r6
        L88:
            com.avito.android.short_term_rent.soft_booking.mvi.a r5 = r0.f282757v
            com.avito.android.short_term_rent.soft_booking.domain.k r5 = r5.f282670a
            pw0.a r6 = r3.f282795d
            pw0.c r7 = r3.f282796e
            pw0.j r8 = r3.f282797f
            pw0.g r9 = r3.f282798g
            pw0.h r11 = r3.f282804m
            java.lang.Boolean r12 = r3.f282802k
            kotlinx.coroutines.flow.X r3 = r5.a(r6, r7, r8, r9, r10, r11, r12)
            r5 = 0
            r0.f282754s = r5
            r0.f282752q = r5
            r0.f282753r = r4
            java.lang.Object r2 = kotlinx.coroutines.flow.C43175k.u(r0, r3, r2)
            if (r2 != r1) goto Laa
            return r1
        Laa:
            kotlin.G0 r1 = kotlin.G0.f406611a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.short_term_rent.soft_booking.mvi.i.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
