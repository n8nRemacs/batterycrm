package ru.ok.android.externcalls.analytics.internal.api;

import defpackage.gy7;
import defpackage.jt0;
import java.io.IOException;
import java.util.Iterator;
import ru.ok.android.api.json.JsonSerializeException;
import ru.ok.android.externcalls.analytics.events.CallAnalyticsEvent;
import ru.ok.android.externcalls.analytics.internal.event.EventSerializer;

@Deprecated
/* loaded from: classes2.dex */
public class SimpleItemsApiValue extends jt0 {
    private final Iterable<CallAnalyticsEvent> items;

    public SimpleItemsApiValue(Iterable<CallAnalyticsEvent> iterable) {
        this.items = iterable;
    }

    @Override // defpackage.jt0
    public void write(gy7 gy7Var) throws JsonSerializeException, IOException {
        gy7Var.r();
        Iterator<CallAnalyticsEvent> it = this.items.iterator();
        while (it.hasNext()) {
            EventSerializer.INSTANCE.serialize(gy7Var, it.next());
        }
        gy7Var.q();
    }
}
