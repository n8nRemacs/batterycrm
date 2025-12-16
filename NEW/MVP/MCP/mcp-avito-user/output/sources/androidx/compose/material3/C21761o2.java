package androidx.compose.material3;

import android.text.format.DateFormat;
import androidx.compose.material3.C21715m2;
import java.util.LinkedHashMap;
import java.util.Locale;
import kotlin.Metadata;

/* compiled from: CalendarModel.android.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.compose.material3.o2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C21761o2 {
    @InterfaceC21537e7
    @Y61.k
    public static final String a(long j12, @Y61.k String str, @Y61.k Locale locale, @Y61.k LinkedHashMap linkedHashMap) {
        String str2 = "S:" + str + locale.toLanguageTag();
        Object bestDateTimePattern = linkedHashMap.get(str2);
        if (bestDateTimePattern == null) {
            bestDateTimePattern = DateFormat.getBestDateTimePattern(locale, str);
            linkedHashMap.put(str2, bestDateTimePattern);
        }
        String string = bestDateTimePattern.toString();
        C21715m2.f36819d.getClass();
        return C21715m2.a.a(j12, string, locale, linkedHashMap);
    }
}
