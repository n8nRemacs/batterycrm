package com.avito.android.advert.item.hotel.hotel_offer.floating_view;

import Y41.p;
import Y61.k;
import Y61.l;
import android.widget.LinearLayout;
import com.avito.android.advert.item.hotel.hotel_offer.HotelOfferFloatingViewState;
import com.avito.android.advert.item.hotel.hotel_offer.HotelOfferState;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.D6;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: AdvertHotelBookingInfoFloatingPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/advert/item/hotel/hotel_offer/HotelOfferState;", "it", "Lkotlin/G0;", "<anonymous>", "(Lcom/avito/android/advert/item/hotel/hotel_offer/HotelOfferState;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.advert.item.hotel.hotel_offer.floating_view.AdvertHotelBookingInfoFloatingPresenterImpl$subscribeOnState$2", f = "AdvertHotelBookingInfoFloatingPresenter.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes10.dex */
final class e extends SuspendLambda implements p<HotelOfferState, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f75974q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ f f75975r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, Continuation<? super e> continuation) {
        super(2, continuation);
        this.f75975r = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
        e eVar = new e(this.f75975r, continuation);
        eVar.f75974q = obj;
        return eVar;
    }

    @Override // Y41.p
    public final Object invoke(HotelOfferState hotelOfferState, Continuation<? super G0> continuation) {
        return ((e) create(hotelOfferState, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        HotelOfferFloatingViewState hotelOfferFloatingViewState = ((HotelOfferState) this.f75974q).f75909i;
        f fVar = this.f75975r;
        i iVar = fVar.f75982g;
        if (iVar != null) {
            iVar.f75999g = new b(1, fVar, f.class, "handleHotelActionButtonClick", "handleHotelActionButtonClick(Lcom/avito/android/hotel/model/HotelActionButton;)V", 0);
        }
        if (hotelOfferFloatingViewState instanceof HotelOfferFloatingViewState.ErrorRequest ? true : hotelOfferFloatingViewState instanceof HotelOfferFloatingViewState.NoBookingInfo ? true : hotelOfferFloatingViewState instanceof HotelOfferFloatingViewState.Loading) {
            fVar.f75985j = false;
            i iVar2 = fVar.f75982g;
            if (iVar2 != null) {
                iVar2.c();
            }
        } else {
            if (hotelOfferFloatingViewState instanceof HotelOfferFloatingViewState.HasOffer) {
                fVar.f75985j = true;
                HotelOfferFloatingViewState.HasOffer hasOffer = (HotelOfferFloatingViewState.HasOffer) hotelOfferFloatingViewState;
                AttributedText attributedText = hasOffer.f75892e;
                AttributedText attributedText2 = hasOffer.f75893f;
                if (attributedText == null && attributedText2 == null) {
                    z = false;
                }
                i iVar3 = fVar.f75982g;
                if (iVar3 != null) {
                    iVar3.b(hasOffer.f75891d);
                }
                i iVar4 = fVar.f75982g;
                if (iVar4 != null) {
                    com.avito.android.util.text.j.a(iVar4.f75996d, hasOffer.f75892e, null);
                }
                i iVar5 = fVar.f75982g;
                if (iVar5 != null) {
                    com.avito.android.util.text.j.a(iVar5.f75997e, attributedText2, null);
                }
                i iVar6 = fVar.f75982g;
                if (iVar6 != null) {
                    iVar6.a(((HotelOfferFloatingViewState.HasOffer) hotelOfferFloatingViewState).f75890c);
                }
                i iVar7 = fVar.f75982g;
                if (iVar7 != null) {
                    ((LinearLayout.LayoutParams) iVar7.f75995c.getLayoutParams()).weight = z ? 0.0f : 1.0f;
                }
                i iVar8 = fVar.f75982g;
                if (iVar8 != null) {
                    iVar8.f75998f.setVisibility(z ? 0 : 8);
                }
                i iVar9 = fVar.f75982g;
                if (iVar9 != null) {
                    D6.a(new c(hotelOfferFloatingViewState, fVar), iVar9.f75994b);
                }
                if (fVar.f75984i) {
                    i iVar10 = fVar.f75982g;
                    if (iVar10 != null) {
                        iVar10.d();
                    }
                } else {
                    i iVar11 = fVar.f75982g;
                    if (iVar11 != null) {
                        iVar11.c();
                    }
                }
            } else {
                if (hotelOfferFloatingViewState instanceof HotelOfferFloatingViewState.HasOffers ? true : hotelOfferFloatingViewState instanceof HotelOfferFloatingViewState.OfferNotFound ? true : hotelOfferFloatingViewState instanceof HotelOfferFloatingViewState.OfferNotRequested) {
                    fVar.f75985j = hotelOfferFloatingViewState.getF75888b() != null;
                    i iVar12 = fVar.f75982g;
                    if (iVar12 != null) {
                        iVar12.b(null);
                    }
                    i iVar13 = fVar.f75982g;
                    if (iVar13 != null) {
                        iVar13.a(hotelOfferFloatingViewState.getF75888b());
                    }
                    i iVar14 = fVar.f75982g;
                    if (iVar14 != null) {
                        ((LinearLayout.LayoutParams) iVar14.f75995c.getLayoutParams()).weight = 1.0f;
                    }
                    i iVar15 = fVar.f75982g;
                    if (iVar15 != null) {
                        iVar15.f75998f.setVisibility(8);
                    }
                    i iVar16 = fVar.f75982g;
                    if (iVar16 != null) {
                        D6.a(null, iVar16.f75994b);
                    }
                    if (fVar.f75984i) {
                        i iVar17 = fVar.f75982g;
                        if (iVar17 != null) {
                            iVar17.d();
                        }
                    } else {
                        i iVar18 = fVar.f75982g;
                        if (iVar18 != null) {
                            iVar18.c();
                        }
                    }
                }
            }
        }
        return G0.f406611a;
    }
}
