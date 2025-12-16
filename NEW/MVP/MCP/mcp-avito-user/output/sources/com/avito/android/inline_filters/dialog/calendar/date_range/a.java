package com.avito.android.inline_filters.dialog.calendar.date_range;

import EN.b;
import Y61.k;
import Y61.l;
import com.avito.android.remote.model.search.InlineFilterValue;
import java.util.Date;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: InlineFilterDateRangeValueFactory.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/inline_filters/dialog/calendar/date_range/a;", "", "<init>", "()V", "_avito_inline-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class a {
    @Inject
    public a() {
    }

    @l
    public static InlineFilterValue.InlineFilterDateRangeValue a(@k EN.b bVar) {
        if (bVar instanceof b.d) {
            b.d dVar = (b.d) bVar;
            return new InlineFilterValue.InlineFilterDateRangeValue(dVar.f3942a, dVar.f3943b, dVar.f3944c);
        }
        if (bVar instanceof b.a) {
            b.a aVar = (b.a) bVar;
            Date date = aVar.f3938a;
            return new InlineFilterValue.InlineFilterDateRangeValue(date, date, aVar.f3939b);
        }
        if (bVar.equals(b.C0228b.f3940a)) {
            return new InlineFilterValue.InlineFilterDateRangeValue(null, null, null);
        }
        if (bVar.equals(b.c.f3941a)) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }
}
