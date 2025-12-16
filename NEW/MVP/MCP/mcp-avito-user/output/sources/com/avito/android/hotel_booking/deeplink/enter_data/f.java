package com.avito.android.hotel_booking.deeplink.enter_data;

import Ku.AbstractC14350a;
import Y61.k;
import android.net.Uri;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.error.DeeplinkParsingError;
import com.avito.android.deep_linking.x;
import com.avito.android.hotel_booking.EnterData;
import com.avito.android.hotel_booking.HotelBookingEnterDataDeeplink;
import com.avito.android.hotel_booking.di.v;
import com.google.gson.Gson;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: HotelBookingEnterDataDeeplinkParser.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/hotel_booking/deeplink/enter_data/f;", "LKu/a;", "Lcom/avito/android/hotel_booking/HotelBookingEnterDataDeeplink;", "_avito_hotel-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class f extends AbstractC14350a<HotelBookingEnterDataDeeplink> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Gson f163313a;

    @Inject
    public f(@v @k Gson gson) {
        this.f163313a = gson;
    }

    @Override // Ku.AbstractC14350a
    public final DeepLink r(Uri uri, Gson gson, x xVar) throws DeeplinkParsingError.WrongParameterValue {
        Gson gson2 = this.f163313a;
        d dVar = new d(uri);
        try {
            Type type = new e().getType();
            String queryParameter = uri.getQueryParameter("data");
            Object objE = queryParameter != null ? gson2.e(queryParameter, type) : null;
            if (objE != null) {
                return new HotelBookingEnterDataDeeplink((EnterData) objE);
            }
            dVar.invoke(new IllegalArgumentException("Parameter data is null!"));
            throw null;
        } catch (JsonParseException e12) {
            dVar.invoke(e12);
            throw null;
        }
    }
}
