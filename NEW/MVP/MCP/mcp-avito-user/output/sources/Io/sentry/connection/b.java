package io.sentry.connection;

import io.sentry.event.Event;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: AsyncConnection.java */
/* loaded from: classes8.dex */
public class b implements d {

    /* renamed from: h, reason: collision with root package name */
    public static final org.slf4j.a f405096h = org.slf4j.b.d(b.class);

    /* renamed from: i, reason: collision with root package name */
    public static final org.slf4j.a f405097i = org.slf4j.b.e(io.sentry.c.class.getName().concat(".lockdown"));

    /* renamed from: b, reason: collision with root package name */
    public final long f405098b;

    /* renamed from: c, reason: collision with root package name */
    public final d f405099c;

    /* renamed from: d, reason: collision with root package name */
    public final ExecutorService f405100d;

    /* renamed from: e, reason: collision with root package name */
    public final c f405101e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f405102f;

    /* renamed from: g, reason: collision with root package name */
    public volatile boolean f405103g;

    /* compiled from: AsyncConnection.java */
    /* renamed from: io.sentry.connection.b$b, reason: collision with other inner class name */
    public final class RunnableC11528b implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        public final Event f405104b;

        /* renamed from: c, reason: collision with root package name */
        public final Map<String, String> f405105c;

        public RunnableC11528b() {
            throw null;
        }

        public RunnableC11528b(Event event, Map map, a aVar) {
            this.f405104b = event;
            this.f405105c = map;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Event event = this.f405104b;
            io.sentry.environment.a.b();
            Map<String, String> mapC = org.slf4j.c.c();
            Map<String, String> map = this.f405105c;
            if (map == null) {
                org.slf4j.c.b();
            } else {
                org.slf4j.c.d(map);
            }
            try {
                try {
                    b.this.f405099c.L2(event);
                } catch (LockedDownException | TooManyRequestsException unused) {
                    b.f405096h.debug("Dropping an Event due to lockdown: " + event);
                    if (mapC == null) {
                    }
                } catch (Exception e12) {
                    b.f405096h.l("An exception occurred while sending the event to Sentry.", e12);
                    if (mapC == null) {
                    }
                }
            } finally {
                if (mapC == null) {
                    org.slf4j.c.b();
                } else {
                    org.slf4j.c.d(mapC);
                }
                io.sentry.environment.a.c();
            }
        }
    }

    /* compiled from: AsyncConnection.java */
    public final class c extends Thread {

        /* renamed from: b, reason: collision with root package name */
        public volatile boolean f405107b = true;

        public c(a aVar) {
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            if (this.f405107b) {
                io.sentry.environment.a.b();
                try {
                    try {
                        b bVar = b.this;
                        org.slf4j.a aVar = b.f405096h;
                        bVar.a();
                    } catch (Exception e12) {
                        b.f405096h.l("An exception occurred while closing the connection.", e12);
                    }
                } finally {
                    io.sentry.environment.a.c();
                }
            }
        }
    }

    public b(d dVar, ThreadPoolExecutor threadPoolExecutor, boolean z12, long j12) {
        c cVar = new c(null);
        this.f405101e = cVar;
        this.f405099c = dVar;
        this.f405100d = threadPoolExecutor;
        if (z12) {
            this.f405102f = z12;
            Runtime.getRuntime().addShutdownHook(cVar);
        }
        this.f405098b = j12;
    }

    @Override // io.sentry.connection.d
    public final void L2(Event event) {
        if (this.f405103g) {
            return;
        }
        this.f405100d.execute(new RunnableC11528b(event, org.slf4j.c.c(), null));
    }

    public final void a() throws IOException {
        org.slf4j.a aVar = f405096h;
        aVar.debug("Gracefully shutting down Sentry async threads.");
        this.f405103g = true;
        this.f405100d.shutdown();
        try {
            try {
                long j12 = this.f405098b;
                if (j12 == -1) {
                    while (!this.f405100d.awaitTermination(5000L, TimeUnit.MILLISECONDS)) {
                        f405096h.debug("Still waiting on async executor to terminate.");
                    }
                } else if (!this.f405100d.awaitTermination(j12, TimeUnit.MILLISECONDS)) {
                    aVar.f("Graceful shutdown took too much time, forcing the shutdown.");
                    aVar.g(Integer.valueOf(this.f405100d.shutdownNow().size()), "{} tasks failed to execute before shutdown.");
                }
                f405096h.debug("Shutdown finished.");
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                org.slf4j.a aVar2 = f405096h;
                aVar2.f("Graceful shutdown interrupted, forcing the shutdown.");
                aVar2.g(Integer.valueOf(this.f405100d.shutdownNow().size()), "{} tasks failed to execute before shutdown.");
            }
            this.f405099c.close();
        } catch (Throwable th2) {
            this.f405099c.close();
            throw th2;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f405102f) {
            try {
                Runtime.getRuntime().removeShutdownHook(this.f405101e);
            } catch (IllegalStateException e12) {
                if (!e12.getMessage().equals("Shutdown in progress")) {
                    throw e12;
                }
            }
            this.f405101e.f405107b = false;
        }
        a();
    }
}
