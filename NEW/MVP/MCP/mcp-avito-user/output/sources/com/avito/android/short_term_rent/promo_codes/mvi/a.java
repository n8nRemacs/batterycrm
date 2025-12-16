package com.avito.android.short_term_rent.promo_codes.mvi;

import Y41.p;
import com.avito.android.short_term_rent.promo_codes.mvi.entity.StrSoftBookingPromoCodesInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;
import nw0.InterfaceC44484a;

/* compiled from: StrSoftBookingPromoCodesActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/short_term_rent/promo_codes/mvi/entity/StrSoftBookingPromoCodesInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.short_term_rent.promo_codes.mvi.StrSoftBookingPromoCodesActor$process$1", f = "StrSoftBookingPromoCodesActor.kt", i = {0}, l = {35, 36}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
/* loaded from: classes3.dex */
final class a extends SuspendLambda implements p<InterfaceC43172j<? super StrSoftBookingPromoCodesInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f282435q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f282436r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ nw0.c f282437s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ InterfaceC44484a f282438t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(nw0.c cVar, InterfaceC44484a interfaceC44484a, Continuation<? super a> continuation) {
        super(2, continuation);
        this.f282437s = cVar;
        this.f282438t = interfaceC44484a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        a aVar = new a(this.f282437s, this.f282438t, continuation);
        aVar.f282436r = obj;
        return aVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super StrSoftBookingPromoCodesInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0059 A[RETURN] */
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
            int r1 = r6.f282435q
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L22
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            kotlin.C42729a0.b(r7)
            goto L5a
        L12:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1a:
            java.lang.Object r1 = r6.f282436r
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            kotlin.C42729a0.b(r7)
            goto L4c
        L22:
            kotlin.C42729a0.b(r7)
            java.lang.Object r7 = r6.f282436r
            r1 = r7
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            nw0.c r7 = r6.f282437s
            com.avito.android.short_term_rent.common.entity.PromoCode r7 = r7.f419248k
            nw0.a r4 = r6.f282438t
            nw0.a$f r4 = (nw0.InterfaceC44484a.f) r4
            com.avito.android.short_term_rent.common.entity.PromoCode r5 = r4.f419231a
            boolean r7 = kotlin.jvm.internal.L.f(r7, r5)
            if (r7 != 0) goto L5a
            com.avito.android.short_term_rent.promo_codes.mvi.entity.StrSoftBookingPromoCodesInternalAction$ChangeSelectedPromoCode r7 = new com.avito.android.short_term_rent.promo_codes.mvi.entity.StrSoftBookingPromoCodesInternalAction$ChangeSelectedPromoCode
            com.avito.android.short_term_rent.common.entity.PromoCode r4 = r4.f419231a
            r7.<init>(r4)
            r6.f282436r = r1
            r6.f282435q = r3
            java.lang.Object r7 = r1.emit(r7, r6)
            if (r7 != r0) goto L4c
            return r0
        L4c:
            com.avito.android.short_term_rent.promo_codes.mvi.entity.StrSoftBookingPromoCodesInternalAction$CloseScreen r7 = com.avito.android.short_term_rent.promo_codes.mvi.entity.StrSoftBookingPromoCodesInternalAction.CloseScreen.f282463b
            r3 = 0
            r6.f282436r = r3
            r6.f282435q = r2
            java.lang.Object r7 = r1.emit(r7, r6)
            if (r7 != r0) goto L5a
            return r0
        L5a:
            kotlin.G0 r7 = kotlin.G0.f406611a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.short_term_rent.promo_codes.mvi.a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
