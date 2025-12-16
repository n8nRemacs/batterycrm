package Vy0;

import Y61.k;
import com.avito.android.beduin.common.component.select_calendar.BeduinSelectCalendarModel;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: DatesUtils.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_str-cancellation-settings_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: Vy0.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C15729a {
    @k
    public static final String a(@k Date date) {
        String str = new SimpleDateFormat("d MMMM", new Locale("ru", "RU")).format(date);
        int length = str.length();
        do {
            length--;
            if (-1 >= length) {
                return "";
            }
        } while (str.charAt(length) == '.');
        return str.substring(0, length + 1);
    }

    @k
    public static final String b(@k Date date) {
        return new SimpleDateFormat(BeduinSelectCalendarModel.DEFAULT_DATE_FORMAT, new Locale("ru", "RU")).format(date);
    }
}
