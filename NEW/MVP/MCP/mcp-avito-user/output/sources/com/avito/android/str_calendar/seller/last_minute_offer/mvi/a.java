package com.avito.android.str_calendar.seller.last_minute_offer.mvi;

import Ky0.b;
import com.avito.android.remote.model.LastMinuteOfferDiscount;
import com.avito.android.remote.model.LastMinuteOfferLimits;
import com.avito.android.remote.model.StrSellerCalendarLastMinuteOfferResponse;
import com.avito.android.str_calendar.seller.last_minute_offer.mvi.entity.LastMinuteOfferInternalAction;
import com.avito.android.str_calendar.seller.last_minute_offer.mvi.entity.LastMinuteOfferState;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: LastMinuteOfferActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/str_calendar/seller/last_minute_offer/mvi/entity/LastMinuteOfferInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.str_calendar.seller.last_minute_offer.mvi.LastMinuteOfferActor$handleSaveButtonClick$1", f = "LastMinuteOfferActor.kt", i = {}, l = {51, 52, 53, 57}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
final class a extends SuspendLambda implements Y41.p<InterfaceC43172j<? super LastMinuteOfferInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f287911q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f287912r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ LastMinuteOfferState f287913s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ b.f f287914t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ c f287915u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(LastMinuteOfferState lastMinuteOfferState, b.f fVar, c cVar, Continuation<? super a> continuation) {
        super(2, continuation);
        this.f287913s = lastMinuteOfferState;
        this.f287914t = fVar;
        this.f287915u = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        a aVar = new a(this.f287913s, this.f287914t, this.f287915u, continuation);
        aVar.f287912r = obj;
        return aVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super LastMinuteOfferInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        LastMinuteOfferDiscount discount;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f287911q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f287912r;
            StrSellerCalendarLastMinuteOfferResponse strSellerCalendarLastMinuteOfferResponse = this.f287913s.f287940c;
            LastMinuteOfferLimits limits = (strSellerCalendarLastMinuteOfferResponse == null || (discount = strSellerCalendarLastMinuteOfferResponse.getDiscount()) == null) ? null : discount.getLimits();
            b.f fVar = this.f287914t;
            boolean z12 = fVar.f9734b;
            c cVar = this.f287915u;
            if (!z12) {
                InterfaceC43160i interfaceC43160iA = cVar.f287919a.a(P0.j(new Q("parameters[lastMinuteOfferDiscount]", String.valueOf(0))));
                this.f287911q = 4;
                if (C43175k.u(this, interfaceC43160iA, interfaceC43172j) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (limits != null) {
                int value = limits.getMin().getValue();
                int i13 = fVar.f9733a;
                if (i13 < value) {
                    String text = limits.getMin().getText();
                    this.f287911q = 1;
                    cVar.getClass();
                    Object objEmit = interfaceC43172j.emit(new LastMinuteOfferInternalAction.ShowInputError(text), this);
                    if (objEmit != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        objEmit = G0.f406611a;
                    }
                    if (objEmit == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (i13 > limits.getMax().getValue()) {
                    String text2 = limits.getMax().getText();
                    this.f287911q = 2;
                    cVar.getClass();
                    Object objEmit2 = interfaceC43172j.emit(new LastMinuteOfferInternalAction.ShowInputError(text2), this);
                    if (objEmit2 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        objEmit2 = G0.f406611a;
                    }
                    if (objEmit2 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    InterfaceC43160i interfaceC43160iA2 = cVar.f287919a.a(P0.j(new Q("parameters[lastMinuteOfferDiscount]", String.valueOf(i13))));
                    this.f287911q = 3;
                    if (C43175k.u(this, interfaceC43160iA2, interfaceC43172j) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            }
        } else {
            if (i12 != 1 && i12 != 2 && i12 != 3 && i12 != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        return G0.f406611a;
    }
}
