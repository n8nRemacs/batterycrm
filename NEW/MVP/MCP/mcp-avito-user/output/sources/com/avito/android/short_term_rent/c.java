package com.avito.android.short_term_rent;

import android.app.Application;
import android.content.Intent;
import com.avito.android.remote.model.SearchParamsConverterKt;
import com.avito.android.str_calendar.booking_calendar.StrBookingCalendarActivity;
import com.avito.android.str_calendar.common.models.CalendarConstraintsPicker;
import com.avito.android.str_calendar.common.models.SelectedDateRange;
import com.avito.android.str_calendar.seller.SellerCalendarActivity;
import com.squareup.anvil.annotations.ContributesBinding;
import java.util.Date;
import javax.inject.Inject;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;

/* compiled from: StrBookingIntentFactoryImpl.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/short_term_rent/c;", "Lcom/avito/android/short_term_rent/StrBookingIntentFactory;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class c implements StrBookingIntentFactory {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Application f282216a;

    @Inject
    public c(@Y61.k Application application) {
        this.f282216a = application;
    }

    @Override // com.avito.android.short_term_rent.StrBookingIntentFactory
    @Y61.k
    public final Intent a(@Y61.k String str, @Y61.k String str2, @Y61.l String str3, @Y61.l String str4, @Y61.l Integer num, boolean z12, @Y61.l String str5, @Y61.l Boolean bool, @Y61.l String str6, @Y61.l Boolean bool2, @Y61.l String str7, @Y61.l String str8) {
        return new Intent(this.f282216a, (Class<?>) StrSoftBookingActivity.class).putExtra("advert_id", str).putExtra(SearchParamsConverterKt.SOURCE, str2).putExtra("check_in_date", str3).putExtra("check_out_date", str4).putExtra("guest_count", num).putExtra("show_calendar", z12).putExtra("guests_detailed", str5).putExtra("is_children", bool).putExtra("x_hash", str6).putExtra("no_refund", bool2).putExtra("payment_type", str7).putExtra("from_page", str8);
    }

    @Override // com.avito.android.short_term_rent.StrBookingIntentFactory
    @Y61.k
    @InterfaceC42830m
    public final Intent b(@Y61.l String str, @Y61.l Date date, @Y61.l Date date2) {
        return com.avito.android.str_calendar.booking_calendar.b.a(this.f282216a, new SelectedDateRange(date, date2, null, null, 12, null), null, str);
    }

    @Override // com.avito.android.short_term_rent.StrBookingIntentFactory
    @Y61.k
    @InterfaceC42830m
    public final Intent c(@Y61.l Date date, @Y61.l Date date2, @Y61.k Date date3, @Y61.k Date date4) {
        return com.avito.android.str_calendar.booking_calendar.b.a(this.f282216a, new SelectedDateRange(date, date2, null, null, 12, null), new CalendarConstraintsPicker(date3, date4, true), "");
    }

    @Override // com.avito.android.short_term_rent.StrBookingIntentFactory
    @Y61.k
    public final Intent d(@Y61.l Date date, @Y61.l Date date2, @Y61.k String str, @Y61.l String str2) {
        return new Intent(this.f282216a, (Class<?>) StrBookingCalendarActivity.class).putExtra("advert_id", str).putExtra("date_range", new SelectedDateRange(date, date2, null, null, 12, null)).putExtra("calendar_title", str2);
    }

    @Override // com.avito.android.short_term_rent.StrBookingIntentFactory
    @Y61.k
    public final Intent e(@Y61.k String str, @Y61.l String str2, @Y61.l String str3) {
        return new Intent(this.f282216a, (Class<?>) SellerCalendarActivity.class).putExtra("advert_id", str).putExtra("first_selected_date", str2).putExtra("last_selected_date", str3);
    }
}
