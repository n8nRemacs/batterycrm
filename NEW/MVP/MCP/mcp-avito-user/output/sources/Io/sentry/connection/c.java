package io.sentry.connection;

import io.sentry.event.Event;
import java.io.IOException;
import java.io.NotSerializableException;
import java.util.Date;
import java.util.Iterator;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* compiled from: BufferedConnection.java */
/* loaded from: classes8.dex */
public class c implements io.sentry.connection.d {

    /* renamed from: i, reason: collision with root package name */
    public static final org.slf4j.a f405109i = org.slf4j.b.d(c.class);

    /* renamed from: b, reason: collision with root package name */
    public final d f405110b;

    /* renamed from: c, reason: collision with root package name */
    public final ScheduledExecutorService f405111c;

    /* renamed from: d, reason: collision with root package name */
    public final io.sentry.connection.a f405112d;

    /* renamed from: e, reason: collision with root package name */
    public final io.sentry.buffer.a f405113e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f405114f;

    /* renamed from: g, reason: collision with root package name */
    public final long f405115g;

    /* renamed from: h, reason: collision with root package name */
    public volatile boolean f405116h;

    /* compiled from: BufferedConnection.java */
    public class a implements ThreadFactory {
        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setDaemon(true);
            return thread;
        }
    }

    /* compiled from: BufferedConnection.java */
    public class b implements io.sentry.connection.d {

        /* renamed from: b, reason: collision with root package name */
        public final io.sentry.connection.d f405117b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ io.sentry.connection.d f405118c;

        public b(io.sentry.connection.d dVar) {
            this.f405118c = dVar;
            this.f405117b = dVar;
        }

        @Override // io.sentry.connection.d
        public final void L2(Event event) {
            try {
                c.this.f405113e.a(event);
            } catch (Exception e12) {
                c.f405109i.l("Exception occurred while attempting to add Event to buffer: ", e12);
            }
            this.f405117b.L2(event);
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            this.f405117b.close();
        }
    }

    /* compiled from: BufferedConnection.java */
    /* renamed from: io.sentry.connection.c$c, reason: collision with other inner class name */
    public class RunnableC11529c implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        public final long f405120b;

        public RunnableC11529c(long j12) {
            this.f405120b = j12;
        }

        @Override // java.lang.Runnable
        public final void run() {
            c.f405109i.e("Running Flusher");
            io.sentry.environment.a.b();
            try {
                try {
                    Iterator<Event> events = c.this.f405113e.getEvents();
                    while (events.hasNext() && !c.this.f405116h) {
                        Event next = events.next();
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        Date date = next.f405168d;
                        long time = jCurrentTimeMillis - (date != null ? (Date) date.clone() : null).getTime();
                        if (time < this.f405120b) {
                            c.f405109i.e("Ignoring buffered event because it only " + time + "ms old.");
                            return;
                        }
                        try {
                            org.slf4j.a aVar = c.f405109i;
                            aVar.e("Flusher attempting to send Event: " + next.f405166b);
                            c.this.L2(next);
                            aVar.e("Flusher successfully sent Event: " + next.f405166b);
                        } catch (Exception e12) {
                            org.slf4j.a aVar2 = c.f405109i;
                            aVar2.a("Flusher failed to send Event: " + next.f405166b, e12);
                            aVar2.e("Flusher run exiting early.");
                            return;
                        }
                    }
                    c.f405109i.e("Flusher run exiting, no more events to send.");
                } catch (Exception e13) {
                    c.f405109i.l("Error running Flusher: ", e13);
                }
            } finally {
                io.sentry.environment.a.c();
            }
        }
    }

    /* compiled from: BufferedConnection.java */
    public final class d extends Thread {

        /* renamed from: b, reason: collision with root package name */
        public volatile boolean f405122b = true;

        public d(a aVar) {
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            if (this.f405122b) {
                io.sentry.environment.a.b();
                try {
                    try {
                        c.this.close();
                    } catch (Exception e12) {
                        c.f405109i.l("An exception occurred while closing the connection.", e12);
                    }
                } finally {
                    io.sentry.environment.a.c();
                }
            }
        }
    }

    public c(io.sentry.connection.a aVar, io.sentry.buffer.a aVar2, long j12, boolean z12, long j13) {
        d dVar = new d(null);
        this.f405110b = dVar;
        ScheduledExecutorService scheduledExecutorServiceNewSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor(new a());
        this.f405111c = scheduledExecutorServiceNewSingleThreadScheduledExecutor;
        this.f405116h = false;
        this.f405112d = aVar;
        this.f405113e = aVar2;
        this.f405114f = z12;
        this.f405115g = j13;
        if (z12) {
            Runtime.getRuntime().addShutdownHook(dVar);
        }
        scheduledExecutorServiceNewSingleThreadScheduledExecutor.scheduleWithFixedDelay(new RunnableC11529c(j12), j12, j12, TimeUnit.MILLISECONDS);
    }

    @Override // io.sentry.connection.d
    public final void L2(Event event) {
        io.sentry.buffer.a aVar = this.f405113e;
        try {
            this.f405112d.L2(event);
            aVar.b(event);
        } catch (ConnectionException e12) {
            if ((e12.getCause() instanceof NotSerializableException) || e12.f405090c != null) {
                aVar.b(event);
            }
            throw e12;
        }
    }

    public final io.sentry.connection.d a(io.sentry.connection.d dVar) {
        return new b(dVar);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f405114f) {
            try {
                Runtime.getRuntime().removeShutdownHook(this.f405110b);
            } catch (IllegalStateException e12) {
                if (!e12.getMessage().equals("Shutdown in progress")) {
                    throw e12;
                }
            }
            this.f405110b.f405122b = false;
        }
        org.slf4j.a aVar = f405109i;
        aVar.debug("Gracefully shutting down Sentry buffer threads.");
        this.f405116h = true;
        this.f405111c.shutdown();
        try {
            try {
                long j12 = this.f405115g;
                if (j12 == -1) {
                    while (!this.f405111c.awaitTermination(5000L, TimeUnit.MILLISECONDS)) {
                        f405109i.debug("Still waiting on buffer flusher executor to terminate.");
                    }
                } else if (!this.f405111c.awaitTermination(j12, TimeUnit.MILLISECONDS)) {
                    aVar.f("Graceful shutdown took too much time, forcing the shutdown.");
                    aVar.g(Integer.valueOf(this.f405111c.shutdownNow().size()), "{} tasks failed to execute before the shutdown.");
                }
                f405109i.debug("Shutdown finished.");
            } catch (Throwable th2) {
                this.f405112d.close();
                throw th2;
            }
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            org.slf4j.a aVar2 = f405109i;
            aVar2.f("Graceful shutdown interrupted, forcing the shutdown.");
            aVar2.g(Integer.valueOf(this.f405111c.shutdownNow().size()), "{} tasks failed to execute before the shutdown.");
        }
        this.f405112d.close();
    }
}
