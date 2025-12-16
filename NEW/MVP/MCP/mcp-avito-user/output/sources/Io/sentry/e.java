package io.sentry;

import io.sentry.event.Event;
import java.io.PrintStream;
import java.lang.Thread;
import y41.C50056b;

/* compiled from: SentryUncaughtExceptionHandler.java */
/* loaded from: classes8.dex */
public class e implements Thread.UncaughtExceptionHandler {

    /* renamed from: c, reason: collision with root package name */
    public static final org.slf4j.a f405156c = org.slf4j.b.d(d.class);

    /* renamed from: a, reason: collision with root package name */
    public Thread.UncaughtExceptionHandler f405157a;

    /* renamed from: b, reason: collision with root package name */
    public volatile Boolean f405158b;

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th2) {
        if (this.f405158b.booleanValue()) {
            f405156c.e("Uncaught exception received.");
            io.sentry.event.b bVar = new io.sentry.event.b();
            String message = th2.getMessage();
            Event event = bVar.f405189a;
            event.f405167c = message;
            event.f405169e = Event.Level.f405182b;
            bVar.d(new C50056b(th2), true);
            try {
                b.a(bVar);
            } catch (Exception e12) {
                f405156c.l("Error sending uncaught exception to Sentry.", e12);
            }
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f405157a;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th2);
            return;
        }
        if (th2 instanceof ThreadDeath) {
            return;
        }
        PrintStream printStream = System.err;
        printStream.print("Exception in thread \"" + thread.getName() + "\" ");
        th2.printStackTrace(printStream);
    }
}
