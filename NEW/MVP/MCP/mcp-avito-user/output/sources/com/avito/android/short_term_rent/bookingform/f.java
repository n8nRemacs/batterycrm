package com.avito.android.short_term_rent.bookingform;

import android.content.Context;
import android.content.Intent;
import com.avito.android.short_term_rent.bookingform.BookingFormActivity;
import com.squareup.anvil.annotations.ContributesBinding;
import java.util.Date;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: BookingFormIntentFactory.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/short_term_rent/bookingform/f;", "Lcom/avito/android/short_term_rent/bookingform/e;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class f implements e {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Context f281444a;

    @Inject
    public f(@Y61.k Context context) {
        this.f281444a = context;
    }

    @Override // com.avito.android.short_term_rent.bookingform.e
    @Y61.k
    public final Intent a(@Y61.l Boolean bool, @Y61.l Boolean bool2, @Y61.l Integer num, @Y61.l Integer num2, @Y61.l Integer num3, @Y61.k String str, @Y61.l String str2, @Y61.l String str3, @Y61.l String str4, @Y61.k Date date, @Y61.k Date date2, @Y61.l List list) {
        BookingFormActivity.a aVar = BookingFormActivity.f281179n;
        BookingFormOpenParams bookingFormOpenParams = new BookingFormOpenParams(bool, bool2, num, num2, num3, str, str2, str3, str4, date, date2, list);
        aVar.getClass();
        return new Intent(this.f281444a, (Class<?>) BookingFormActivity.class).putExtra("open_params", bookingFormOpenParams);
    }
}
