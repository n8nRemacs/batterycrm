package I5;

import android.content.Context;
import com.avito.android.R;
import dagger.internal.x;
import dagger.internal.y;
import java.util.Map;
import javax.inject.Provider;
import kotlin.Q;
import kotlin.collections.P0;

/* compiled from: AdvertDetailsHotelOfferModule_ProvideHotelFilterMonthNamesFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class c implements dagger.internal.h<Map<Integer, String>> {

    /* renamed from: a, reason: collision with root package name */
    public final a f7932a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<Context> f7933b;

    public c(a aVar, Provider<Context> provider) {
        this.f7932a = aVar;
        this.f7933b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        Context context = this.f7933b.get();
        this.f7932a.getClass();
        return P0.g(new Q(0, context.getString(R.string.advert_details_hotel_month_jan)), new Q(1, context.getString(R.string.advert_details_hotel_month_feb)), new Q(2, context.getString(R.string.advert_details_hotel_month_mar)), new Q(3, context.getString(R.string.advert_details_hotel_month_apr)), new Q(4, context.getString(R.string.advert_details_hotel_month_may)), new Q(5, context.getString(R.string.advert_details_hotel_month_jun)), new Q(6, context.getString(R.string.advert_details_hotel_month_jul)), new Q(7, context.getString(R.string.advert_details_hotel_month_aug)), new Q(8, context.getString(R.string.advert_details_hotel_month_sep)), new Q(9, context.getString(R.string.advert_details_hotel_month_oct)), new Q(10, context.getString(R.string.advert_details_hotel_month_nov)), new Q(11, context.getString(R.string.advert_details_hotel_month_dec)));
    }
}
