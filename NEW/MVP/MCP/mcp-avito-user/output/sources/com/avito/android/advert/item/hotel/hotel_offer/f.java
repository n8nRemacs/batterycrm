package com.avito.android.advert.item.hotel.hotel_offer;

import androidx.compose.runtime.internal.P;
import com.avito.android.ab_tests.groups.SimpleTestGroup;
import com.avito.android.advert.item.hotel.hotel_offer.HotelOfferState;
import com.avito.android.hotel.model.AdvertHotelRoom;
import com.avito.android.hotel.model.HotelOfferRequestParams;
import com.avito.android.util.R0;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43137a0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import lE.C43624b;

/* compiled from: AdvertDetailsHotelOfferInteractor.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/hotel/hotel_offer/f;", "Lcom/avito/android/advert/item/hotel/hotel_offer/e;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class f implements e {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final DI.c f75952a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final ZI.a f75953b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final R0 f75954c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final m f75955d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.item.hotel.hotel_offer.converters.c f75956e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final C43624b f75957f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.item.hotel.hotel_offer.converters.a f75958g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final u3.f<SimpleTestGroup> f75959h;

    /* compiled from: AdvertDetailsHotelOfferInteractor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/advert/item/hotel/hotel_offer/HotelOfferState$RequestState;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.advert.item.hotel.hotel_offer.AdvertDetailsHotelOfferInteractorImpl$loadOffer$1", f = "AdvertDetailsHotelOfferInteractor.kt", i = {0, 3, 7}, l = {50, 58, 61, 71, 81, 85, 95, 104, 106, 110}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "$this$flow"}, s = {"L$0", "L$0", "L$0"})
    public static final class a extends SuspendLambda implements Y41.p<InterfaceC43172j<? super HotelOfferState.RequestState>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f75960q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f75961r;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ String f75963t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ HotelOfferRequestParams f75964u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, HotelOfferRequestParams hotelOfferRequestParams, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f75963t = str;
            this.f75964u = hotelOfferRequestParams;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = f.this.new a(this.f75963t, this.f75964u, continuation);
            aVar.f75961r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super HotelOfferState.RequestState> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:120:0x030e  */
        /* JADX WARN: Removed duplicated region for block: B:177:0x0482  */
        /* JADX WARN: Removed duplicated region for block: B:218:0x0591  */
        /* JADX WARN: Removed duplicated region for block: B:221:0x05ac  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x00d3  */
        /* JADX WARN: Removed duplicated region for block: B:76:0x0231  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r32) {
            /*
                Method dump skipped, instructions count: 1538
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.advert.item.hotel.hotel_offer.f.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: AdvertDetailsHotelOfferInteractor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/advert/item/hotel/hotel_offer/HotelOfferState$RequestState;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.advert.item.hotel.hotel_offer.AdvertDetailsHotelOfferInteractorImpl$loadOffer$2", f = "AdvertDetailsHotelOfferInteractor.kt", i = {}, l = {123, 125}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Y41.p<InterfaceC43172j<? super HotelOfferState.RequestState>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f75965q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f75966r;

        public b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            b bVar = f.this.new b(continuation);
            bVar.f75966r = obj;
            return bVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super HotelOfferState.RequestState> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((b) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f75965q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f75966r;
                if (f.this.f75959h.a().a()) {
                    HotelOfferState.RequestState.RedesignLoading redesignLoading = HotelOfferState.RequestState.RedesignLoading.f75915b;
                    this.f75965q = 1;
                    if (interfaceC43172j.emit(redesignLoading, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    HotelOfferState.RequestState.Loading loading = HotelOfferState.RequestState.Loading.f75913b;
                    this.f75965q = 2;
                    if (interfaceC43172j.emit(loading, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else {
                if (i12 != 1 && i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: AdvertDetailsHotelOfferInteractor.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/advert/item/hotel/hotel_offer/HotelOfferState$RequestState;", "requestState", "Lkotlin/G0;", "<anonymous>", "(Lcom/avito/android/advert/item/hotel/hotel_offer/HotelOfferState$RequestState;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.advert.item.hotel.hotel_offer.AdvertDetailsHotelOfferInteractorImpl$loadOffer$3", f = "AdvertDetailsHotelOfferInteractor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Y41.p<HotelOfferState.RequestState, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f75968q;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ HotelOfferRequestParams f75970s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(HotelOfferRequestParams hotelOfferRequestParams, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f75970s = hotelOfferRequestParams;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            c cVar = f.this.new c(this.f75970s, continuation);
            cVar.f75968q = obj;
            return cVar;
        }

        @Override // Y41.p
        public final Object invoke(HotelOfferState.RequestState requestState, Continuation<? super G0> continuation) {
            return ((c) create(requestState, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            HotelOfferState.RequestState requestState = (HotelOfferState.RequestState) this.f75968q;
            m mVar = f.this.f75955d;
            HotelOfferState value = mVar.getState().getValue();
            HotelOfferState.RequestState.Loaded loaded = requestState instanceof HotelOfferState.RequestState.Loaded ? (HotelOfferState.RequestState.Loaded) requestState : null;
            AdvertHotelRoom advertHotelRoom = loaded != null ? loaded.f75912b : null;
            HotelOfferState.RequestState.RedesignLoaded redesignLoaded = requestState instanceof HotelOfferState.RequestState.RedesignLoaded ? (HotelOfferState.RequestState.RedesignLoaded) requestState : null;
            mVar.a(HotelOfferState.a(value, this.f75970s, advertHotelRoom, redesignLoaded != null ? redesignLoaded.f75914b : null, (requestState instanceof HotelOfferState.RequestState.Loading) || (requestState instanceof HotelOfferState.RequestState.RedesignLoading), requestState, false, null, null, 224));
            return G0.f406611a;
        }
    }

    @Inject
    public f(@Y61.k DI.c cVar, @Y61.k ZI.a aVar, @Y61.k R0 r02, @Y61.k m mVar, @Y61.k com.avito.android.advert.item.hotel.hotel_offer.converters.c cVar2, @Y61.k C43624b c43624b, @Y61.k com.avito.android.advert.item.hotel.hotel_offer.converters.a aVar2, @FI.c @Y61.k u3.f<SimpleTestGroup> fVar) {
        this.f75952a = cVar;
        this.f75953b = aVar;
        this.f75954c = r02;
        this.f75955d = mVar;
        this.f75956e = cVar2;
        this.f75957f = c43624b;
        this.f75958g = aVar2;
        this.f75959h = fVar;
    }

    @Override // com.avito.android.advert.item.hotel.hotel_offer.e
    @Y61.k
    public final InterfaceC43160i<HotelOfferState.RequestState> a(@Y61.k String str, @Y61.k HotelOfferRequestParams hotelOfferRequestParams) {
        return C43175k.I(this.f75954c.a(), new C43197r1(new c(hotelOfferRequestParams, null), new C43137a0(new b(null), C43175k.G(new a(str, hotelOfferRequestParams, null)))));
    }

    @Override // com.avito.android.advert.item.hotel.hotel_offer.e
    public final void b(@Y61.k HotelOfferRequestParams hotelOfferRequestParams) {
        m mVar = this.f75955d;
        mVar.a(HotelOfferState.a(mVar.getState().getValue(), hotelOfferRequestParams, null, null, false, null, false, null, null, 254));
    }
}
