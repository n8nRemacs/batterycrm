package ru.ok.android.externcalls.analytics.events;

import java.util.Collection;
import java.util.Map;
import kotlin.Metadata;
import ru.ok.android.externcalls.analytics.events.EventItemValue;

@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0010\b\n\u0002\u0010\t\n\u0002\u0010\u000e\n\u0002\u0010\u001e\n\u0002\u0010$\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0003\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0004\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0005\u001a\u0010\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00050\u0006\u001a\u0016\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0007¨\u0006\b"}, d2 = {"toEventItemValue", "Lru/ok/android/externcalls/analytics/events/EventItemValue;", "", "", "", "", "", "", "calls-sdk-analytics_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class EventItemValueKt {
    public static final EventItemValue toEventItemValue(String str) {
        return EventItemValue.StringValue.m90boximpl(EventItemValue.StringValue.m91constructorimpl(str));
    }

    public static final EventItemValue toEventItemValue(int i) {
        return EventItemValue.IntValue.m69boximpl(EventItemValue.IntValue.m70constructorimpl(i));
    }

    public static final EventItemValue toEventItemValue(long j) {
        return EventItemValue.LongValue.m76boximpl(EventItemValue.LongValue.m77constructorimpl(j));
    }

    public static final EventItemValue toEventItemValue(float f) {
        return EventItemValue.FloatValue.m62boximpl(EventItemValue.FloatValue.m63constructorimpl(f));
    }

    public static final EventItemValue toEventItemValue(Collection<String> collection) {
        return EventItemValue.ArrStringValue.m55boximpl(EventItemValue.ArrStringValue.m56constructorimpl(collection));
    }

    public static final EventItemValue toEventItemValue(Map<String, String> map) {
        return EventItemValue.MapStringStringValue.m83boximpl(EventItemValue.MapStringStringValue.m84constructorimpl(map));
    }
}
