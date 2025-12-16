package P91;

import java.util.Iterator;
import java.util.Locale;
import kotlin.collections.AbstractC42738c;

/* loaded from: classes9.dex */
public final class c {
    public static ru.mts.biometry.sdk.feature.document.intro.domain.d a(String str) {
        Object next;
        Iterator it = ((AbstractC42738c) ru.mts.biometry.sdk.feature.document.intro.domain.d.f436442f).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            String strName = ((ru.mts.biometry.sdk.feature.document.intro.domain.d) next).name();
            Locale locale = Locale.ROOT;
            if (strName.toLowerCase(locale).equals(str.toLowerCase(locale))) {
                break;
            }
        }
        return (ru.mts.biometry.sdk.feature.document.intro.domain.d) next;
    }
}
