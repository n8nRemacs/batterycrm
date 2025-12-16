package com.avito.android.advert.item.hotel.hotel_offer;

import androidx.compose.runtime.internal.P;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.d2;
import kotlinx.coroutines.flow.e2;
import kotlinx.coroutines.flow.f2;

/* compiled from: AdvertDetailsHotelOfferActionProvider.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/item/hotel/hotel_offer/c;", "Lcom/avito/android/advert/item/hotel/hotel_offer/b;", "<init>", "()V", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class c implements b {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final e2 f75941a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final d2<a> f75942b;

    @Inject
    public c() {
        e2 e2VarA = f2.a(0, 1, BufferOverflow.f410778c);
        this.f75941a = e2VarA;
        this.f75942b = C43175k.a(e2VarA);
    }

    @Override // com.avito.android.advert.item.hotel.hotel_offer.b
    public final void a(@Y61.k a aVar) {
        this.f75941a.K5(aVar);
    }

    @Override // com.avito.android.advert.item.hotel.hotel_offer.b
    @Y61.k
    public final d2<a> getActions() {
        return this.f75942b;
    }
}
