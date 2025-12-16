package ru.cyberity.cbr.core.common;

import java.util.List;
import java.util.Locale;
import kotlin.Metadata;

/* compiled from: StringUtils.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u0017\u0010\u0002\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"", "", "a", "(Ljava/util/List;)Ljava/lang/String;", "cyberity-mobile-sdk-internal-core_release"}, k = 2, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final class x0 {
    @Y61.k
    public static final String a(@Y61.k List<String> list) {
        if (list.isEmpty()) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder(list.get(0).toLowerCase(Locale.ROOT));
        kotlin.ranges.k it = kotlin.ranges.s.r(1, list.size()).iterator();
        while (it.f406910d) {
            int iA2 = it.a();
            String strValueOf = String.valueOf(list.get(iA2).charAt(0));
            Locale locale = Locale.ROOT;
            sb2.append(strValueOf.toUpperCase(locale));
            sb2.append(list.get(iA2).substring(1).toLowerCase(locale));
        }
        return sb2.toString();
    }
}
