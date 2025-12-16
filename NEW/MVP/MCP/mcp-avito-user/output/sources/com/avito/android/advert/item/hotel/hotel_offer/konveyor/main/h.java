package com.avito.android.advert.item.hotel.hotel_offer.konveyor.main;

import androidx.compose.runtime.internal.P;
import androidx.core.os.C22777e;
import com.avito.android.advert.item.Z0;
import com.avito.android.advert.item.hotel.hotel_offer.HotelOfferState;
import com.avito.android.advert.item.hotel.hotel_offer.HotelOfferViewState;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.hotel.model.DateFilter;
import com.avito.android.hotel.model.GuestFilter;
import com.avito.android.hotel.model.HotelOfferFilter;
import com.avito.android.hotel.model.HotelOfferInstallments;
import com.avito.android.hotel.model.HotelOfferRequestParams;
import com.avito.android.hotel.model.HotelRoomOffer;
import com.avito.android.remote.model.Image;
import com.avito.android.util.R0;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.U;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.internal.C43238h;
import kotlinx.coroutines.rx3.y;

/* compiled from: AdvertDetailsHotelOfferPresenter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/hotel/hotel_offer/konveyor/main/h;", "Lcom/avito/android/advert/item/hotel/hotel_offer/konveyor/main/c;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class h implements com.avito.android.advert.item.hotel.hotel_offer.konveyor.main.c {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f76095b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.item.hotel.hotel_offer.m f76096c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.item.hotel.hotel_offer.e f76097d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.item.hotel.hotel_offer.j f76098e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final G5.a f76099f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final R0 f76100g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final J5.a f76101h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.item.hotel.hotel_offer.b f76102i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final com.avito.konveyor.adapter.d f76103j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final SimpleDateFormat f76104k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.l
    public C43238h f76105l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.l
    public q f76106m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.l
    public AdvertDetailsHotelOfferItem f76107n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.l
    public Z0 f76108o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f76109p = C42727D.c(a.f76110l);

    /* compiled from: AdvertDetailsHotelOfferPresenter.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LSV/a;", "invoke", "()LSV/a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<SV.a> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f76110l = new a();

        public a() {
            super(0);
        }

        @Override // Y41.a
        public final SV.a invoke() {
            return new SV.a(8388611, 0);
        }
    }

    /* compiled from: AdvertDetailsHotelOfferPresenter.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ HotelOfferViewState f76111l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ h f76112m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(HotelOfferViewState hotelOfferViewState, h hVar) {
            super(0);
            this.f76111l = hotelOfferViewState;
            this.f76112m = hVar;
        }

        @Override // Y41.a
        public final G0 invoke() {
            Z0 z02;
            List<Image> images = ((HotelOfferViewState.HasOffer) this.f76111l).f75917b.getImages();
            if (images != null && (z02 = this.f76112m.f76108o) != null) {
                z02.y(images);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: AdvertDetailsHotelOfferPresenter.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ HotelOfferViewState f76113l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ h f76114m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(HotelOfferViewState hotelOfferViewState, h hVar) {
            super(0);
            this.f76113l = hotelOfferViewState;
            this.f76114m = hVar;
        }

        @Override // Y41.a
        public final G0 invoke() {
            DeepLink deepLink;
            HotelOfferInstallments installments = ((HotelOfferViewState.HasOffer) this.f76113l).f75917b.getInstallments();
            if (installments != null && (deepLink = installments.getDeepLink()) != null) {
                b.a.a(this.f76114m.f76095b, deepLink, null, null, 6);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: AdvertDetailsHotelOfferPresenter.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ HotelOfferViewState f76115l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ h f76116m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(HotelOfferViewState hotelOfferViewState, h hVar) {
            super(0);
            this.f76115l = hotelOfferViewState;
            this.f76116m = hVar;
        }

        @Override // Y41.a
        public final G0 invoke() {
            DeepLink deepLink = ((HotelOfferViewState.HasOffers) this.f76115l).f75925h;
            if (deepLink != null) {
                h hVar = this.f76116m;
                hVar.getClass();
                hVar.f76095b.r6(C22777e.b(new Q("should_refresh_offers_key", Boolean.TRUE)), deepLink, "key_advert_details_hotel");
            }
            return G0.f406611a;
        }
    }

    /* compiled from: AdvertDetailsHotelOfferPresenter.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ h f76117l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ HotelOfferViewState f76118m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(HotelOfferViewState hotelOfferViewState, h hVar) {
            super(0);
            this.f76117l = hVar;
            this.f76118m = hotelOfferViewState;
        }

        @Override // Y41.a
        public final G0 invoke() {
            h.O(this.f76117l, ((HotelOfferViewState.HasOffers) this.f76118m).f75922e.f75868d);
            return G0.f406611a;
        }
    }

    /* compiled from: AdvertDetailsHotelOfferPresenter.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ h f76119l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ HotelOfferViewState f76120m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(HotelOfferViewState hotelOfferViewState, h hVar) {
            super(0);
            this.f76119l = hVar;
            this.f76120m = hotelOfferViewState;
        }

        @Override // Y41.a
        public final G0 invoke() {
            h.O(this.f76119l, ((HotelOfferViewState.OfferNotFound) this.f76120m).f75928b.f162635e);
            return G0.f406611a;
        }
    }

    /* compiled from: AdvertDetailsHotelOfferPresenter.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ h f76121l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ HotelOfferViewState f76122m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(HotelOfferViewState hotelOfferViewState, h hVar) {
            super(0);
            this.f76121l = hVar;
            this.f76122m = hotelOfferViewState;
        }

        @Override // Y41.a
        public final G0 invoke() {
            h.O(this.f76121l, ((HotelOfferViewState.OfferNotFound) this.f76122m).f75929c.f162635e);
            return G0.f406611a;
        }
    }

    /* compiled from: AdvertDetailsHotelOfferPresenter.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.advert.item.hotel.hotel_offer.konveyor.main.h$h, reason: collision with other inner class name */
    public static final class C2261h extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ h f76123l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ HotelOfferViewState f76124m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2261h(HotelOfferViewState hotelOfferViewState, h hVar) {
            super(0);
            this.f76123l = hVar;
            this.f76124m = hotelOfferViewState;
        }

        @Override // Y41.a
        public final G0 invoke() {
            h.O(this.f76123l, ((HotelOfferViewState.OfferNotRequested) this.f76124m).f75931b.f162635e);
            return G0.f406611a;
        }
    }

    /* compiled from: AdvertDetailsHotelOfferPresenter.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ h f76125l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ HotelOfferViewState f76126m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(HotelOfferViewState hotelOfferViewState, h hVar) {
            super(0);
            this.f76125l = hVar;
            this.f76126m = hotelOfferViewState;
        }

        @Override // Y41.a
        public final G0 invoke() {
            h.O(this.f76125l, ((HotelOfferViewState.OfferNotRequested) this.f76126m).f75932c.f162635e);
            return G0.f406611a;
        }
    }

    @Inject
    public h(@Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar, @Y61.k com.avito.android.advert.item.hotel.hotel_offer.m mVar, @Y61.k com.avito.android.advert.item.hotel.hotel_offer.e eVar, @Y61.k com.avito.android.advert.item.hotel.hotel_offer.j jVar, @Y61.k G5.a aVar2, @Y61.k R0 r02, @Y61.k J5.a aVar3, @I5.k @Y61.k com.avito.android.advert.item.hotel.hotel_offer.b bVar, @I5.l @Y61.k com.avito.konveyor.adapter.d dVar, @I5.m @Y61.k SimpleDateFormat simpleDateFormat) {
        this.f76095b = aVar;
        this.f76096c = mVar;
        this.f76097d = eVar;
        this.f76098e = jVar;
        this.f76099f = aVar2;
        this.f76100g = r02;
        this.f76101h = aVar3;
        this.f76102i = bVar;
        this.f76103j = dVar;
        this.f76104k = simpleDateFormat;
    }

    public static void O(h hVar, DeepLink deepLink) {
        hVar.getClass();
        if (deepLink == null) {
            return;
        }
        hVar.f76095b.r6(C22777e.b(new Q("should_refresh_offers_key", false)), deepLink, "key_advert_details_hotel");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void g0(h hVar, Integer num, ArrayList arrayList, String str, String str2, int i12) {
        if ((i12 & 1) != 0) {
            num = hVar.k().f162640d.getAdultGuests();
        }
        List listD = arrayList;
        if ((i12 & 2) != 0) {
            listD = hVar.k().f162640d.d();
        }
        if ((i12 & 4) != 0) {
            str = hVar.k().f162639c.getCheckIn();
        }
        if ((i12 & 8) != 0) {
            str2 = hVar.k().f162639c.getCheckOut();
        }
        HotelOfferRequestParams hotelOfferRequestParamsK = hVar.k();
        hVar.f76097d.b(new HotelOfferRequestParams(hotelOfferRequestParamsK.f162638b, DateFilter.a(hVar.k().f162639c, str, str2), GuestFilter.a(hVar.k().f162640d, num, listD), hotelOfferRequestParamsK.f162641e));
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        q qVar = (q) eVar;
        AdvertDetailsHotelOfferItem advertDetailsHotelOfferItem = (AdvertDetailsHotelOfferItem) aVar;
        HotelOfferState value = this.f76096c.getState().getValue();
        advertDetailsHotelOfferItem.f76083g = value;
        this.f76106m = qVar;
        this.f76107n = advertDetailsHotelOfferItem;
        if (value.f75905e && !this.f76098e.a()) {
            V(k());
        }
        qVar.uT();
        qVar.setAdapter(this.f76103j);
        qVar.zB((androidx.recyclerview.widget.P) this.f76109p.getValue());
        qVar.CL(this.f76101h);
        qVar.EG(advertDetailsHotelOfferItem.f76084h);
        Y(qVar, advertDetailsHotelOfferItem.f76083g.f75908h);
        qVar.qd(new com.avito.android.advert.item.hotel.hotel_offer.konveyor.main.d(this));
        qVar.g1(new com.avito.android.advert.item.hotel.hotel_offer.konveyor.main.e(1, this, h.class, "handleDeeplink", "handleDeeplink(Lcom/avito/android/deep_linking/links/DeepLink;Z)V", 0));
        qVar.e4(new com.avito.android.advert.item.hotel.hotel_offer.konveyor.main.f(1, this, h.class, "handleHotelActionButtonClick", "handleHotelActionButtonClick(Lcom/avito/android/hotel/model/HotelActionButton;)V", 0));
        qVar.t(new com.avito.android.advert.item.hotel.hotel_offer.konveyor.main.g(advertDetailsHotelOfferItem, qVar, this));
    }

    public final void V(HotelOfferRequestParams hotelOfferRequestParams) {
        this.f76098e.b(hotelOfferRequestParams);
    }

    public final void Y(q qVar, HotelOfferViewState hotelOfferViewState) {
        Image image = null;
        if (hotelOfferViewState instanceof HotelOfferViewState.Loading) {
            qVar.rL(true);
            qVar.yk(false);
            qVar.ge(false);
            qVar.gt(false);
            qVar.m10(false);
            qVar.OJ(false);
            qVar.Lc(null);
            qVar.ne(null);
            return;
        }
        boolean z12 = hotelOfferViewState instanceof HotelOfferViewState.RedesignLoading;
        com.avito.konveyor.adapter.d dVar = this.f76103j;
        if (z12) {
            qVar.rL(false);
            qVar.ge(false);
            qVar.gt(false);
            qVar.m10(false);
            qVar.OJ(false);
            qVar.Lc(null);
            qVar.ne(null);
            qVar.yk(true);
            dVar.l(((HotelOfferViewState.RedesignLoading) hotelOfferViewState).f75934b, null);
            return;
        }
        if (hotelOfferViewState instanceof HotelOfferViewState.HasOffer) {
            qVar.rL(false);
            qVar.yk(false);
            qVar.ge(false);
            qVar.gt(false);
            qVar.OJ(false);
            qVar.m10(true);
            qVar.Lc(new b(hotelOfferViewState, this));
            HotelOfferViewState.HasOffer hasOffer = (HotelOfferViewState.HasOffer) hotelOfferViewState;
            qVar.Gz(hasOffer.f75917b.getPrice());
            HotelRoomOffer hotelRoomOffer = hasOffer.f75917b;
            qVar.OR(hotelRoomOffer.getDetails());
            qVar.xK(hotelRoomOffer.getDiscount());
            qVar.EV(hotelRoomOffer.getDescription());
            Image previewImage = hotelRoomOffer.getPreviewImage();
            if (previewImage == null) {
                List<Image> images = hotelRoomOffer.getImages();
                if (images != null) {
                    image = (Image) C42745f0.G(images);
                }
            } else {
                image = previewImage;
            }
            qVar.QI(image);
            qVar.wt(hotelRoomOffer.getInstallments());
            qVar.h4(new c(hotelOfferViewState, this));
            qVar.ne(hasOffer.f75918c);
            return;
        }
        if (hotelOfferViewState instanceof HotelOfferViewState.HasOffers) {
            qVar.rL(false);
            qVar.yk(false);
            qVar.ge(false);
            qVar.gt(false);
            qVar.m10(false);
            qVar.OJ(true);
            qVar.ne(null);
            HotelOfferViewState.HasOffers hasOffers = (HotelOfferViewState.HasOffers) hotelOfferViewState;
            dVar.l(hasOffers.f75920c, null);
            qVar.setTitle(hasOffers.f75923f);
            qVar.o10(hasOffers.f75924g);
            qVar.ZJ(new d(hotelOfferViewState, this));
            qVar.VK(hasOffers.f75926i ? hasOffers.f75922e : null, new e(hotelOfferViewState, this));
            return;
        }
        if (hotelOfferViewState instanceof HotelOfferViewState.OfferNotFound) {
            qVar.rL(false);
            qVar.yk(false);
            qVar.ge(false);
            qVar.gt(true);
            qVar.m10(false);
            qVar.OJ(false);
            qVar.Lc(null);
            qVar.Ni();
            HotelOfferViewState.OfferNotFound offerNotFound = (HotelOfferViewState.OfferNotFound) hotelOfferViewState;
            qVar.RM(offerNotFound.f75928b.f162632b);
            HotelOfferFilter hotelOfferFilter = offerNotFound.f75928b;
            qVar.go(hotelOfferFilter.f162634d);
            qVar.Bm(hotelOfferFilter.f162633c);
            qVar.eX(new f(hotelOfferViewState, this));
            qVar.lq();
            HotelOfferFilter hotelOfferFilter2 = offerNotFound.f75929c;
            qVar.dM(hotelOfferFilter2.f162632b);
            qVar.Tn(hotelOfferFilter2.f162634d);
            qVar.Tp(hotelOfferFilter2.f162633c);
            qVar.UW(new g(hotelOfferViewState, this));
            qVar.ne(offerNotFound.f75930d);
            return;
        }
        if (!(hotelOfferViewState instanceof HotelOfferViewState.OfferNotRequested)) {
            if (hotelOfferViewState instanceof HotelOfferViewState.ErrorRequest) {
                qVar.rL(false);
                qVar.yk(false);
                qVar.ge(true);
                qVar.gt(false);
                qVar.m10(false);
                qVar.OJ(false);
                qVar.Lc(null);
                qVar.ne(null);
                return;
            }
            return;
        }
        qVar.rL(false);
        qVar.yk(false);
        qVar.ge(false);
        qVar.gt(true);
        qVar.m10(false);
        qVar.OJ(false);
        qVar.Lc(null);
        qVar.Ni();
        HotelOfferViewState.OfferNotRequested offerNotRequested = (HotelOfferViewState.OfferNotRequested) hotelOfferViewState;
        qVar.RM(offerNotRequested.f75931b.f162632b);
        HotelOfferFilter hotelOfferFilter3 = offerNotRequested.f75931b;
        qVar.go(hotelOfferFilter3.f162634d);
        qVar.Bm(hotelOfferFilter3.f162633c);
        qVar.eX(new C2261h(hotelOfferViewState, this));
        qVar.lq();
        HotelOfferFilter hotelOfferFilter4 = offerNotRequested.f75932c;
        qVar.dM(hotelOfferFilter4.f162632b);
        qVar.Tn(hotelOfferFilter4.f162634d);
        qVar.Tp(hotelOfferFilter4.f162633c);
        qVar.UW(new i(hotelOfferViewState, this));
        qVar.ne(offerNotRequested.f75933d);
    }

    @Override // com.avito.android.advert.item.hotel.hotel_offer.konveyor.main.c
    public final void c0() {
        this.f76108o = null;
    }

    @Override // com.avito.android.advert.item.hotel.hotel_offer.konveyor.main.c
    public final void i() {
        C43238h c43238h = this.f76105l;
        if (c43238h != null) {
            U.b(c43238h, null);
        }
        this.f76105l = null;
        R0 r02 = this.f76100g;
        C43238h c43238hA = U.a(r02.a());
        this.f76105l = c43238hA;
        C43175k.K(new C43197r1(new k(this, null), new j(y.a(this.f76095b.d9()))), c43238hA);
        C43238h c43238h2 = this.f76105l;
        if (c43238h2 != null) {
            C43175k.K(C43175k.I(r02.b(), new C43197r1(new n(this, null), C43175k.s(new C43197r1(new l(this, null), this.f76096c.getState()), m.f76136l))), c43238h2);
        }
        C43238h c43238h3 = this.f76105l;
        if (c43238h3 == null) {
            return;
        }
        C43175k.K(C43175k.I(r02.b(), new C43197r1(new com.avito.android.advert.item.hotel.hotel_offer.konveyor.main.i(2, this, h.class, "handleAction", "handleAction(Lcom/avito/android/advert/item/hotel/hotel_offer/AdvertDetailsHotelOfferAction;)V", 4), this.f76102i.getActions())), c43238h3);
    }

    public final HotelOfferRequestParams k() {
        return this.f76096c.getState().getValue().f75902b;
    }

    @Override // com.avito.android.advert.item.hotel.hotel_offer.konveyor.main.c
    public final void onDestroyView() {
        C43238h c43238h = this.f76105l;
        if (c43238h != null) {
            U.b(c43238h, null);
        }
        this.f76105l = null;
        this.f76106m = null;
    }

    @Override // com.avito.android.advert.item.hotel.hotel_offer.konveyor.main.c
    public final void r5(@Y61.k Z0 z02) {
        this.f76108o = z02;
    }
}
