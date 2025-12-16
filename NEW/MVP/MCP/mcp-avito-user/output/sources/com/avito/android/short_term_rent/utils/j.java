package com.avito.android.short_term_rent.utils;

import com.avito.android.beduin.common.component.select_calendar.BeduinSelectCalendarModel;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.Metadata;

/* compiled from: StrDateUtils.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_short-term-rent_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class j {
    @Y61.l
    public static final Date a(@Y61.k String str) {
        return new SimpleDateFormat(BeduinSelectCalendarModel.DEFAULT_DATE_FORMAT, new Locale("ru", "RU")).parse(str);
    }

    @Y61.k
    public static final String b(@Y61.k Date date) {
        return new SimpleDateFormat(BeduinSelectCalendarModel.DEFAULT_DATE_FORMAT, new Locale("ru", "RU")).format(date);
    }
}
