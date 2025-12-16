package com.avito.android.advert.item.hotel.hotel_offer.floating_view;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.advert.item.Z0;
import com.avito.android.advert.item.hotel.hotel_offer.m;
import com.avito.android.util.R0;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlinx.coroutines.U;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.internal.C43238h;

/* compiled from: AdvertHotelBookingInfoFloatingPresenter.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/hotel/hotel_offer/floating_view/f;", "Lcom/avito/android/advert/item/hotel/hotel_offer/floating_view/a;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class f implements a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final m f75976a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final G5.a f75977b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final R0 f75978c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final com.avito.android.deeplink_handler.handler.composite.a f75979d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final com.avito.android.advert.item.hotel.hotel_offer.j f75980e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public C43238h f75981f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public i f75982g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public Z0 f75983h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f75984i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f75985j;

    @Inject
    public f(@k m mVar, @k G5.a aVar, @k R0 r02, @k com.avito.android.deeplink_handler.handler.composite.a aVar2, @k com.avito.android.advert.item.hotel.hotel_offer.j jVar) {
        this.f75976a = mVar;
        this.f75977b = aVar;
        this.f75978c = r02;
        this.f75979d = aVar2;
        this.f75980e = jVar;
    }

    @Override // com.avito.android.advert.item.hotel.hotel_offer.floating_view.a
    public final void a(boolean z12) {
        this.f75984i = z12;
    }

    @Override // com.avito.android.advert.item.hotel.hotel_offer.floating_view.a
    public final void b(@l i iVar) {
        this.f75982g = iVar;
        C43238h c43238h = this.f75981f;
        if (c43238h != null) {
            U.b(c43238h, null);
        }
        this.f75981f = null;
        R0 r02 = this.f75978c;
        C43238h c43238hA = U.a(r02.b());
        this.f75981f = c43238hA;
        C43175k.K(C43175k.I(r02.b(), new C43197r1(new e(this, null), C43175k.s(this.f75976a.getState(), d.f75973l))), c43238hA);
    }

    @Override // com.avito.android.advert.item.hotel.hotel_offer.floating_view.a
    /* renamed from: c, reason: from getter */
    public final boolean getF75985j() {
        return this.f75985j;
    }

    @Override // com.avito.android.advert.item.hotel.hotel_offer.floating_view.a
    public final void c0() {
        this.f75983h = null;
    }

    @Override // com.avito.android.advert.item.hotel.hotel_offer.floating_view.a
    public final void e0() {
        this.f75982g = null;
        C43238h c43238h = this.f75981f;
        if (c43238h != null) {
            U.b(c43238h, null);
        }
        this.f75981f = null;
    }

    @Override // com.avito.android.advert.item.hotel.hotel_offer.floating_view.a
    public final void j0(@k Z0 z02) {
        this.f75983h = z02;
    }
}
