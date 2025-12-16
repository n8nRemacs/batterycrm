package com.avito.android.advert.item.hotel.hotel_offer.konveyor.main;

import com.avito.android.advert.item.hotel.hotel_offer.HotelOfferState;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: AdvertDetailsHotelOfferPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/advert/item/hotel/hotel_offer/HotelOfferState;", VoiceInfo.STATE, "Lkotlin/G0;", "<anonymous>", "(Lcom/avito/android/advert/item/hotel/hotel_offer/HotelOfferState;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.advert.item.hotel.hotel_offer.konveyor.main.AdvertDetailsHotelOfferPresenterImpl$observeOnState$1", f = "AdvertDetailsHotelOfferPresenter.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes10.dex */
final class l extends SuspendLambda implements Y41.p<HotelOfferState, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f76134q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ h f76135r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(h hVar, Continuation<? super l> continuation) {
        super(2, continuation);
        this.f76135r = hVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        l lVar = new l(this.f76135r, continuation);
        lVar.f76134q = obj;
        return lVar;
    }

    @Override // Y41.p
    public final Object invoke(HotelOfferState hotelOfferState, Continuation<? super G0> continuation) {
        return ((l) create(hotelOfferState, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        HotelOfferState hotelOfferState = (HotelOfferState) this.f76134q;
        AdvertDetailsHotelOfferItem advertDetailsHotelOfferItem = this.f76135r.f76107n;
        if (advertDetailsHotelOfferItem != null) {
            advertDetailsHotelOfferItem.f76083g = hotelOfferState;
        }
        return G0.f406611a;
    }
}
