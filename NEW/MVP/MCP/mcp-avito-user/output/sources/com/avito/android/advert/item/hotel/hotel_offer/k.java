package com.avito.android.advert.item.hotel.hotel_offer;

import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.advert.item.Z0;
import com.avito.android.advert.item.hotel.hotel_offer.AdvertDetailsHotelOffer;
import com.avito.android.advert.item.hotel.hotel_offer.HotelOfferState;
import com.avito.android.di.module.InterfaceC30174s;
import com.avito.android.hotel.model.HotelOfferRequestParams;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.util.R0;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.N0;
import kotlinx.coroutines.U;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.X;
import kotlinx.coroutines.internal.C43238h;

/* compiled from: AdvertHotelOfferLoaderPresenter.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/hotel/hotel_offer/k;", "Lcom/avito/android/advert/item/hotel/hotel_offer/j;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class k implements j {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f76009a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final R0 f76010b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final e f76011c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public C43238h f76012d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public Z0 f76013e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public N0 f76014f;

    /* compiled from: AdvertHotelOfferLoaderPresenter.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/advert/item/hotel/hotel_offer/HotelOfferState$RequestState;", VoiceInfo.STATE, "Lkotlin/G0;", "<anonymous>", "(Lcom/avito/android/advert/item/hotel/hotel_offer/HotelOfferState$RequestState;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.advert.item.hotel.hotel_offer.AdvertHotelOfferLoaderPresenterImpl$loadOffer$1", f = "AdvertHotelOfferLoaderPresenter.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.p<HotelOfferState.RequestState, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f76015q;

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = k.this.new a(continuation);
            aVar.f76015q = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(HotelOfferState.RequestState requestState, Continuation<? super G0> continuation) {
            return ((a) create(requestState, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            int i12;
            Z0 z02;
            String str;
            Z0 z03;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            HotelOfferState.RequestState requestState = (HotelOfferState.RequestState) this.f76015q;
            boolean z12 = requestState instanceof HotelOfferState.RequestState.Error;
            k kVar = k.this;
            if (z12 && (str = ((HotelOfferState.RequestState.Error) requestState).f75911c) != null && (z03 = kVar.f76013e) != null) {
                z03.J(com.avito.android.printable_text.b.f(str));
            }
            if (requestState instanceof HotelOfferState.RequestState.RedesignLoaded) {
                ArrayList arrayList = ((HotelOfferState.RequestState.RedesignLoaded) requestState).f75914b.f75862c;
                if (arrayList.isEmpty()) {
                    i12 = 0;
                } else {
                    Iterator it = arrayList.iterator();
                    i12 = 0;
                    while (it.hasNext()) {
                        if ((((AdvertDetailsHotelOffer.Item) it.next()) instanceof AdvertDetailsHotelOffer.Item.Offer) && (i12 = i12 + 1) < 0) {
                            C42745f0.G0();
                            throw null;
                        }
                    }
                }
                if (i12 == 0 && (z02 = kVar.f76013e) != null) {
                    z02.J(com.avito.android.printable_text.b.c(R.string.advert_details_hotel_offer_empty_items_title, new Serializable[0]));
                }
            }
            return G0.f406611a;
        }
    }

    /* compiled from: AdvertHotelOfferLoaderPresenter.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/advert/item/hotel/hotel_offer/HotelOfferState$RequestState;", "", "it", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.advert.item.hotel.hotel_offer.AdvertHotelOfferLoaderPresenterImpl$loadOffer$2", f = "AdvertHotelOfferLoaderPresenter.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Y41.q<InterfaceC43172j<? super HotelOfferState.RequestState>, Throwable, Continuation<? super G0>, Object> {
        public b(Continuation<? super b> continuation) {
            super(3, continuation);
        }

        @Override // Y41.q
        public final Object invoke(InterfaceC43172j<? super HotelOfferState.RequestState> interfaceC43172j, Throwable th2, Continuation<? super G0> continuation) {
            return k.this.new b(continuation).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            k kVar = k.this;
            N0 n02 = kVar.f76014f;
            if (n02 != null) {
                n02.c(null);
            }
            kVar.f76014f = null;
            return G0.f406611a;
        }
    }

    @Inject
    public k(@Y61.k @InterfaceC30174s String str, @Y61.k R0 r02, @Y61.k e eVar) {
        this.f76009a = str;
        this.f76010b = r02;
        this.f76011c = eVar;
    }

    @Override // com.avito.android.advert.item.hotel.hotel_offer.j
    public final boolean a() {
        return this.f76014f != null;
    }

    @Override // com.avito.android.advert.item.hotel.hotel_offer.j
    public final void b(@Y61.k HotelOfferRequestParams hotelOfferRequestParams) {
        C43238h c43238h = this.f76012d;
        if (c43238h == null) {
            return;
        }
        N0 n02 = this.f76014f;
        if (n02 != null) {
            n02.c(null);
        }
        this.f76014f = C43175k.K(new X(C43175k.I(this.f76010b.b(), new C43197r1(new a(null), this.f76011c.a(this.f76009a, hotelOfferRequestParams))), new b(null)), c43238h);
    }

    @Override // com.avito.android.advert.item.hotel.hotel_offer.j
    public final void c0() {
        this.f76013e = null;
    }

    @Override // com.avito.android.advert.item.hotel.hotel_offer.j
    public final void i() {
        C43238h c43238h = this.f76012d;
        if (c43238h != null) {
            U.b(c43238h, null);
        }
        this.f76012d = null;
        this.f76012d = U.a(this.f76010b.b());
    }

    @Override // com.avito.android.advert.item.hotel.hotel_offer.j
    public final void j0(@Y61.k Z0 z02) {
        this.f76013e = z02;
    }

    @Override // com.avito.android.advert.item.hotel.hotel_offer.j
    public final void onDestroyView() {
        C43238h c43238h = this.f76012d;
        if (c43238h != null) {
            U.b(c43238h, null);
        }
        this.f76012d = null;
    }
}
