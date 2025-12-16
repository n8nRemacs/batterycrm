package defpackage;

import ru.ok.android.externcalls.analytics.events.EventItemValue;
import ru.ok.android.externcalls.analytics.events.EventItemsMap;

/* loaded from: classes2.dex */
public interface m81 {
    static /* synthetic */ void a(m81 m81Var, String str, EventItemValue eventItemValue, EventItemsMap eventItemsMap, int i) {
        if ((i & 2) != 0) {
            eventItemValue = null;
        }
        if ((i & 4) != 0) {
            eventItemsMap = new EventItemsMap();
        }
        ((n81) m81Var).c(str, eventItemValue, eventItemsMap);
    }
}
