package io.sentry.buffer;

import io.sentry.event.Event;
import java.util.Iterator;

/* compiled from: Buffer.java */
/* loaded from: classes8.dex */
public interface a {
    void a(Event event);

    void b(Event event);

    Iterator<Event> getEvents();
}
