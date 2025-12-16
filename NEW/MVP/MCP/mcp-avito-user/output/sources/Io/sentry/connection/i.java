package io.sentry.connection;

import io.sentry.event.Event;

/* compiled from: NoopConnection.java */
/* loaded from: classes8.dex */
public class i extends a {
    public i() {
        super(null, null);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // io.sentry.connection.a
    public final void a(Event event) {
    }
}
