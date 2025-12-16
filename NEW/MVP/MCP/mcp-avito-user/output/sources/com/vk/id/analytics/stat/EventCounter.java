package com.vk.id.analytics.stat;

import java.util.concurrent.TimeUnit;
import kotlin.Metadata;

/* compiled from: EventCounter.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR$\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00068\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\n\u0010\b\u001a\u0004\b\u000b\u0010\fR$\u0010\r\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00068\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\r\u0010\b\u001a\u0004\b\u000e\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/vk/id/analytics/stat/EventCounter;", "", "<init>", "()V", "Lkotlin/G0;", "increment", "", "startId", "I", "value", "prevEventId", "getPrevEventId", "()I", "eventId", "getEventId", "analytics_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class EventCounter {
    private volatile int eventId;
    private volatile int prevEventId;
    private final int startId;

    public EventCounter() {
        int seconds = (int) TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
        this.startId = seconds;
        this.eventId = seconds;
    }

    public final int getEventId() {
        return this.eventId;
    }

    public final int getPrevEventId() {
        return this.prevEventId;
    }

    public final synchronized void increment() {
        this.prevEventId = this.eventId;
        this.eventId++;
    }
}
