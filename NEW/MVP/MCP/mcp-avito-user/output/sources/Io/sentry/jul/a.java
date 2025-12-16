package io.sentry.jul;

import io.sentry.event.Event;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Filter;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.LogRecord;
import org.slf4j.c;
import y41.C50056b;
import y41.C50058d;

/* compiled from: SentryHandler.java */
/* loaded from: classes8.dex */
public class a extends Handler {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f405206a;

    /* compiled from: SentryHandler.java */
    public class b implements Filter {
        public b(a aVar, C11532a c11532a) {
        }

        @Override // java.util.logging.Filter
        public final boolean isLoggable(LogRecord logRecord) {
            String loggerName = logRecord.getLoggerName();
            return loggerName == null || !loggerName.startsWith("io.sentry");
        }
    }

    public a() throws SecurityException, IllegalArgumentException {
        Level level;
        LogManager logManager = LogManager.getLogManager();
        String name = a.class.getName();
        this.f405206a = Boolean.valueOf(logManager.getProperty(name.concat(".printfStyle"))).booleanValue();
        try {
            level = Level.parse(logManager.getProperty(name.concat(".level")).trim());
        } catch (Exception unused) {
            level = Level.WARNING;
        }
        setLevel(level);
        setFilter(new b(this, null));
    }

    public final io.sentry.event.b a(LogRecord logRecord) {
        String str;
        io.sentry.event.b bVar = new io.sentry.event.b();
        bVar.f405191c.add("java.util.logging");
        Level level = logRecord.getLevel();
        String str2 = null;
        Event.Level level2 = level.intValue() >= Level.SEVERE.intValue() ? Event.Level.f405183c : level.intValue() >= Level.WARNING.intValue() ? Event.Level.f405184d : level.intValue() >= Level.INFO.intValue() ? Event.Level.f405185e : level.intValue() >= Level.ALL.intValue() ? Event.Level.f405186f : null;
        Event event = bVar.f405189a;
        event.f405169e = level2;
        event.f405168d = new Date(logRecord.getMillis());
        event.f405170f = logRecord.getLoggerName();
        String message = logRecord.getMessage();
        if (logRecord.getResourceBundle() != null && logRecord.getResourceBundle().containsKey(logRecord.getMessage())) {
            message = logRecord.getResourceBundle().getString(logRecord.getMessage());
        }
        if (logRecord.getParameters() == null) {
            bVar.d(new C50058d(message, Collections.emptyList(), null), true);
        } else {
            Object[] parameters = logRecord.getParameters();
            ArrayList arrayList = new ArrayList(parameters.length);
            int length = parameters.length;
            for (int i12 = 0; i12 < length; i12++) {
                Object obj = parameters[i12];
                arrayList.add(obj != null ? obj.toString() : null);
            }
            try {
                Object[] parameters2 = logRecord.getParameters();
                str2 = this.f405206a ? String.format(message, parameters2) : MessageFormat.format(message, parameters2);
                str = str2;
            } catch (Exception unused) {
                str = message;
            }
            bVar.d(new C50058d(message, arrayList, str2), true);
            message = str;
        }
        event.f405167c = message;
        Throwable thrown = logRecord.getThrown();
        if (thrown != null) {
            bVar.d(new C50056b(thrown), true);
        }
        Map<String, String> mapA = c.f421817a.a();
        if (mapA != null) {
            for (Map.Entry entry : ((HashMap) mapA).entrySet()) {
                if (Collections.unmodifiableSet(io.sentry.b.d().f405082f).contains(entry.getKey())) {
                    event.f405173i.put((String) entry.getKey(), (String) entry.getValue());
                } else {
                    event.a().put((String) entry.getKey(), entry.getValue());
                }
            }
        }
        event.a().put("Sentry-ThreadId", Integer.valueOf(logRecord.getThreadID()));
        return bVar;
    }

    @Override // java.util.logging.Handler
    public final void close() {
        io.sentry.environment.a.b();
        try {
            try {
                io.sentry.b.b();
            } catch (Exception e12) {
                reportError("An exception occurred while closing the Sentry connection", e12, 3);
            }
        } finally {
            io.sentry.environment.a.c();
        }
    }

    @Override // java.util.logging.Handler
    public final void publish(LogRecord logRecord) {
        if (!isLoggable(logRecord) || io.sentry.environment.a.a()) {
            return;
        }
        io.sentry.environment.a.b();
        try {
            try {
                io.sentry.b.a(a(logRecord));
            } catch (Exception e12) {
                reportError("An exception occurred while creating a new event in Sentry", e12, 1);
            }
        } finally {
            io.sentry.environment.a.c();
        }
    }

    @Override // java.util.logging.Handler
    public final void flush() {
    }
}
