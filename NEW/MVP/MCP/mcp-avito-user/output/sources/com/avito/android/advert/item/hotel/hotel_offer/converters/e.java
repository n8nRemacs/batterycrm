package com.avito.android.advert.item.hotel.hotel_offer.converters;

import I5.m;
import Y61.k;
import androidx.compose.runtime.internal.P;
import java.text.SimpleDateFormat;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: AdvertDetailsOffersDatesFormatter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/hotel/hotel_offer/converters/e;", "", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final SimpleDateFormat f75946a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Map<Integer, String> f75947b;

    @Inject
    public e(@m @k SimpleDateFormat simpleDateFormat, @m @k Map<Integer, String> map) {
        this.f75946a = simpleDateFormat;
        this.f75947b = map;
    }
}
