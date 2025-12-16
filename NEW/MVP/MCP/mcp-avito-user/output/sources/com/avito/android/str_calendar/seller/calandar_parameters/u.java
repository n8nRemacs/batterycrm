package com.avito.android.str_calendar.seller.calandar_parameters;

import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.str_calendar.common.models.DateRange;
import java.io.Serializable;
import java.util.Date;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: SellerCalendarParamsResourceProvider.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/str_calendar/seller/calandar_parameters/u;", "Lcom/avito/android/str_calendar/seller/calandar_parameters/t;", "<init>", "()V", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class u implements t {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final PrintableText f287466a = com.avito.android.printable_text.b.c(R.string.str_has_error_occurred, new Serializable[0]);

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final PrintableText f287467b = com.avito.android.printable_text.b.c(R.string.seller_calendar_params_cancellation_button_text, new Serializable[0]);

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final PrintableText f287468c = com.avito.android.printable_text.b.c(R.string.str_calendar_params_link_item_button_text, new Serializable[0]);

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final PrintableText f287469d = com.avito.android.printable_text.b.c(R.string.seller_calendar_params_changes_applied_text, new Serializable[0]);

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final PrintableText f287470e = com.avito.android.printable_text.b.c(R.string.seller_calendar_params_is_new, new Serializable[0]);

    @Inject
    public u() {
    }

    @Override // com.avito.android.str_calendar.seller.calandar_parameters.t
    @Y61.k
    /* renamed from: a, reason: from getter */
    public final PrintableText getF287466a() {
        return this.f287466a;
    }

    @Override // com.avito.android.str_calendar.seller.calandar_parameters.t
    @Y61.k
    /* renamed from: b, reason: from getter */
    public final PrintableText getF287467b() {
        return this.f287467b;
    }

    @Override // com.avito.android.str_calendar.seller.calandar_parameters.t
    @Y61.k
    /* renamed from: c, reason: from getter */
    public final PrintableText getF287469d() {
        return this.f287469d;
    }

    @Override // com.avito.android.str_calendar.seller.calandar_parameters.t
    @Y61.k
    /* renamed from: d, reason: from getter */
    public final PrintableText getF287468c() {
        return this.f287468c;
    }

    @Override // com.avito.android.str_calendar.seller.calandar_parameters.t
    @Y61.k
    public final PrintableText e(@Y61.l Date date, @Y61.l Date date2) {
        return (date == null || date2 == null) ? date != null ? com.avito.android.printable_text.b.f(wy0.b.b(date)) : com.avito.android.printable_text.b.c(R.string.seller_calendar_params_toolbar_title, new Serializable[0]) : com.avito.android.printable_text.b.f(wy0.b.f(new DateRange(date, date2)));
    }
}
