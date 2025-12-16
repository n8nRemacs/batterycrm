package com.avito.android.short_term_rent.promo_codes.mvi.domain;

import Y41.p;
import Y61.k;
import Y61.l;
import com.avito.android.remote.model.StrBookingPromoCodeApplyResponse;
import com.avito.android.short_term_rent.promo_codes.mvi.entity.StrSoftBookingPromoCodesInternalAction;
import com.huawei.hms.adapter.internal.AvailableCode;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: StrSoftBookingPromoCodesApplyUseCase.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/short_term_rent/promo_codes/mvi/entity/StrSoftBookingPromoCodesInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.short_term_rent.promo_codes.mvi.domain.StrSoftBookingPromoCodesApplyUseCaseImpl$invoke$1", f = "StrSoftBookingPromoCodesApplyUseCase.kt", i = {0, 2, 2}, l = {AvailableCode.ERROR_ON_ACTIVITY_RESULT, AvailableCode.USER_IGNORE_PREVIOUS_POPUP, 34, 35, 41}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "successResult"}, s = {"L$0", "L$0", "L$1"})
/* loaded from: classes3.dex */
final class b extends SuspendLambda implements p<InterfaceC43172j<? super StrSoftBookingPromoCodesInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public StrBookingPromoCodeApplyResponse.Ok f282447q;

    /* renamed from: r, reason: collision with root package name */
    public int f282448r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f282449s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ d f282450t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ String f282451u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, String str, Continuation<? super b> continuation) {
        super(2, continuation);
        this.f282450t = dVar;
        this.f282451u = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
        b bVar = new b(this.f282450t, this.f282451u, continuation);
        bVar.f282449s = obj;
        return bVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super StrSoftBookingPromoCodesInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((b) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00af A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r13) {
        /*
            Method dump skipped, instructions count: 209
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.short_term_rent.promo_codes.mvi.domain.b.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
