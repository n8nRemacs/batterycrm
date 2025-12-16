package ru.ok.android.externcalls.analytics.internal.event;

import defpackage.e2;
import defpackage.gy7;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import ru.ok.android.externcalls.analytics.events.CallAnalyticsEvent;
import ru.ok.android.externcalls.analytics.events.EventItemValue;
import ru.ok.android.externcalls.analytics.events.SdkMetricStatEvent;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\"\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u000bH\u0002ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ\"\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u000eH\u0002ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0015"}, d2 = {"Lru/ok/android/externcalls/analytics/internal/event/EventSerializer;", "", "<init>", "()V", "Lgy7;", "writer", "Lru/ok/android/externcalls/analytics/events/EventItemValue;", SdkMetricStatEvent.VALUE_KEY, "Lqqg;", "writeValue", "(Lgy7;Lru/ok/android/externcalls/analytics/events/EventItemValue;)V", "Lru/ok/android/externcalls/analytics/events/EventItemValue$ArrStringValue;", "writeValue-iurDigI", "(Lgy7;Ljava/util/Collection;)V", "Lru/ok/android/externcalls/analytics/events/EventItemValue$MapStringStringValue;", "writeValue-4i0utlQ", "(Lgy7;Ljava/util/Map;)V", "Lru/ok/android/externcalls/analytics/events/CallAnalyticsEvent;", "event", "serialize", "(Lgy7;Lru/ok/android/externcalls/analytics/events/CallAnalyticsEvent;)V", "calls-sdk-analytics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class EventSerializer {
    public static final EventSerializer INSTANCE = new EventSerializer();

    private EventSerializer() {
    }

    private final void writeValue(gy7 writer, EventItemValue value) {
        if (value instanceof EventItemValue.FloatValue) {
            Float fValueOf = Float.valueOf(((EventItemValue.FloatValue) value).m68unboximpl());
            e2 e2Var = (e2) writer;
            e2Var.getClass();
            e2Var.i(fValueOf.doubleValue());
            return;
        }
        if (value instanceof EventItemValue.IntValue) {
            ((e2) writer).l(((EventItemValue.IntValue) value).m75unboximpl());
            return;
        }
        if (value instanceof EventItemValue.LongValue) {
            long jM82unboximpl = ((EventItemValue.LongValue) value).m82unboximpl();
            e2 e2Var2 = (e2) writer;
            e2Var2.getClass();
            e2Var2.c(Long.toString(jM82unboximpl));
            return;
        }
        if (value instanceof EventItemValue.StringValue) {
            writer.h(((EventItemValue.StringValue) value).m96unboximpl());
        } else if (value instanceof EventItemValue.ArrStringValue) {
            m98writeValueiurDigI(writer, ((EventItemValue.ArrStringValue) value).getValue());
        } else if (value instanceof EventItemValue.MapStringStringValue) {
            m97writeValue4i0utlQ(writer, ((EventItemValue.MapStringStringValue) value).getValue());
        }
    }

    /* renamed from: writeValue-4i0utlQ, reason: not valid java name */
    private final void m97writeValue4i0utlQ(gy7 writer, Map<String, ? extends String> value) {
        try {
            writer.p();
            for (Map.Entry<String, ? extends String> entry : value.entrySet()) {
                writer.b0(entry.getKey());
                writer.h(entry.getValue());
            }
        } finally {
            writer.n();
        }
    }

    /* renamed from: writeValue-iurDigI, reason: not valid java name */
    private final void m98writeValueiurDigI(gy7 writer, Collection<? extends String> value) {
        try {
            writer.r();
            Iterator<? extends String> it = value.iterator();
            while (it.hasNext()) {
                writer.h(it.next());
            }
        } finally {
            writer.q();
        }
    }

    public final void serialize(gy7 writer, CallAnalyticsEvent event) {
        writer.p();
        for (Map.Entry<String, EventItemValue> entry : event.getItems().entrySet()) {
            writer.b0(entry.getKey());
            writeValue(writer, entry.getValue());
        }
        writer.n();
    }
}
