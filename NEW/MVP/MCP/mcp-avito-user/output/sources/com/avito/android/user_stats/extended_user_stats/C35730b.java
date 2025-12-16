package com.avito.android.user_stats.extended_user_stats;

import com.avito.android.beduin.common.component.select_calendar.BeduinSelectCalendarModel;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ConfigApiConverter.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_user-stats_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.user_stats.extended_user_stats.b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C35730b {
    @Y61.k
    public static final Date a(@Y61.k String str) throws ParseException {
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(BeduinSelectCalendarModel.DEFAULT_DATE_FORMAT, Locale.getDefault());
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
            Date date = simpleDateFormat.parse(str);
            return date == null ? new Date() : date;
        } catch (Exception unused) {
            return new Date();
        }
    }

    @Y61.k
    public static final fW0.o b(@Y61.k ZJ0.m mVar) {
        Long id2 = mVar.getId();
        ArrayList arrayList = null;
        String string = id2 != null ? id2.toString() : null;
        String name = mVar.getName();
        List<ZJ0.m> listA = mVar.a();
        if (listA != null) {
            ArrayList arrayList2 = new ArrayList();
            for (ZJ0.m mVar2 : listA) {
                fW0.o oVarB = mVar2 != null ? b(mVar2) : null;
                if (oVarB != null) {
                    arrayList2.add(oVarB);
                }
            }
            arrayList = arrayList2;
        }
        return new fW0.o(string, name, arrayList);
    }
}
