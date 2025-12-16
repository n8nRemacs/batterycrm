package com.avito.android.util;

import java.util.Calendar;
import java.util.Date;
import kotlin.Metadata;

/* compiled from: Dates.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_common_lang_util"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class G0 {
    @Y61.k
    public static final Date a(@Y61.k Date date, int i12) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(i12, 1);
        return calendar.getTime();
    }
}
