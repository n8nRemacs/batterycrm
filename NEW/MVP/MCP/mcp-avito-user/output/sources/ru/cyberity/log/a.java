package ru.cyberity.log;

import Y61.k;
import Y61.l;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.collections.C42756l;
import kotlin.jvm.internal.C42822w;
import ru.cyberity.log.logger.Logger;
import ru.cyberity.log.logger.e;

/* compiled from: L.kt */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0013B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J)\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u0005\u0010\u000bJ)\u0010\f\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\f\u0010\u000bJ)\u0010\r\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\r\u0010\u000bJ)\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000e\u0010\u000bJ)\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000f\u0010\u000bJ!\u0010\u0013\u001a\u00020\u00012\u0012\u0010\u0012\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00110\u0010\"\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u001b\u0010\u0017\u001a\u00020\u00012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00110\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u0013\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0006¢\u0006\u0004\b\u0013\u0010\u001bJ\r\u0010\u001c\u001a\u00020\u0004¢\u0006\u0004\b\u001c\u0010\u0003J'\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020\u00012\b\b\u0002\u0010 \u001a\u00020\u001f¢\u0006\u0004\b\u0013\u0010!J\r\u0010\r\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\u0003J\r\u0010\"\u001a\u00020\u0004¢\u0006\u0004\b\"\u0010\u0003J#\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00010\u00152\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00110\u0015H\u0000¢\u0006\u0004\b$\u0010%R\"\u0010)\u001a\u00020\u001f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010&\u001a\u0004\b\u0017\u0010'\"\u0004\b\u0013\u0010(R\u0014\u0010,\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010+R\u0014\u0010/\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010.R \u00102\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0001008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00101R \u00103\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u001a008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u00101¨\u00064"}, d2 = {"Lru/cyberity/log/a;", "Lru/cyberity/log/logger/Logger;", "<init>", "()V", "Lkotlin/G0;", "e", "", "tag", "message", "", "throwable", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V", "w", "d", "i", "v", "", "Lru/cyberity/log/LoggerType;", "loggers", "a", "([Lru/cyberity/log/LoggerType;)Lru/cyberity/log/logger/Logger;", "", "types", "c", "(Ljava/util/List;)Lru/cyberity/log/logger/Logger;", "batchName", "Lru/cyberity/log/logger/b;", "(Ljava/lang/String;)Lru/cyberity/log/logger/b;", "flush", "loggerType", "logger", "", "useByDefault", "(Lru/cyberity/log/LoggerType;Lru/cyberity/log/logger/Logger;Z)V", "f", "loggerList", "b", "(Ljava/util/List;)Ljava/util/List;", "Z", "()Z", "(Z)V", "isDebug", "Lru/cyberity/log/a$a;", "Lru/cyberity/log/a$a;", "resetHandler", "Lru/cyberity/log/logger/e;", "Lru/cyberity/log/logger/e;", "defaultLogger", "Ljava/util/concurrent/ConcurrentHashMap;", "Ljava/util/concurrent/ConcurrentHashMap;", "supportedLoggers", "batchingLoggers", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final class a implements Logger {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static boolean isDebug;

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final a f436064a = new a();

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @k
    private static final HandlerC12561a resetHandler = new HandlerC12561a();

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @k
    private static final e defaultLogger = new e();

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @k
    private static final ConcurrentHashMap<LoggerType, Logger> supportedLoggers = new ConcurrentHashMap<>();

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @k
    private static final ConcurrentHashMap<String, ru.cyberity.log.logger.b> batchingLoggers = new ConcurrentHashMap<>();

    /* compiled from: L.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\u0003J\r\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u0003¨\u0006\u000b"}, d2 = {"Lru/cyberity/log/a$a;", "Landroid/os/Handler;", "<init>", "()V", "Landroid/os/Message;", "msg", "Lkotlin/G0;", "handleMessage", "(Landroid/os/Message;)V", "b", "a", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
    /* renamed from: ru.cyberity.log.a$a, reason: collision with other inner class name */
    public static final class HandlerC12561a extends Handler {

        /* renamed from: a, reason: collision with root package name */
        @k
        private static final C12562a f436070a = new C12562a(null);

        /* compiled from: L.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lru/cyberity/log/a$a$a;", "", "", "MSG_RESET", "I", "", "RESET_DELAY_MS", "J", "<init>", "()V", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
        /* renamed from: ru.cyberity.log.a$a$a, reason: collision with other inner class name */
        public static final class C12562a {
            public /* synthetic */ C12562a(C42822w c42822w) {
                this();
            }

            private C12562a() {
            }
        }

        public HandlerC12561a() {
            super(Looper.getMainLooper());
        }

        public final void a() {
            removeMessages(0);
        }

        public final void b() {
            if (hasMessages(0)) {
                return;
            }
            sendMessageDelayed(obtainMessage(0), 10000L);
        }

        @Override // android.os.Handler
        public void handleMessage(@k Message msg) {
            if (msg.what == 0) {
                a.f436064a.e();
            }
        }
    }

    private a() {
    }

    @k
    public final List<Logger> b(@k List<? extends LoggerType> loggerList) {
        ArrayList arrayList = new ArrayList();
        for (LoggerType loggerType : loggerList) {
            Logger logger = supportedLoggers.get(loggerType);
            if (logger != null) {
                arrayList.add(logger);
            } else {
                Logger.e$default(defaultLogger, "L", "Failed to get logger for " + loggerType.name(), null, 4, null);
            }
        }
        return arrayList;
    }

    @k
    public final Logger c(@k List<? extends LoggerType> types) {
        Object next;
        ArrayList arrayList = new ArrayList(defaultLogger.c());
        for (Logger logger : b(types)) {
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((Logger) next) == logger) {
                    break;
                }
            }
            if (next == null) {
                arrayList.add(logger);
            }
        }
        return new ru.cyberity.log.logger.c(arrayList);
    }

    @Override // ru.cyberity.log.logger.Logger
    public void d(@k String tag, @k String message, @l Throwable throwable) {
        defaultLogger.d(tag, message, throwable);
    }

    @Override // ru.cyberity.log.logger.Logger
    public void e(@k String tag, @k String message, @l Throwable throwable) {
        defaultLogger.e(tag, message, throwable);
    }

    public final void f() {
        resetHandler.a();
        e();
    }

    public final void flush() {
        Iterator<T> it = batchingLoggers.values().iterator();
        while (it.hasNext()) {
            ((ru.cyberity.log.logger.b) it.next()).flush();
        }
    }

    @Override // ru.cyberity.log.logger.Logger
    public void i(@k String tag, @k String message, @l Throwable throwable) {
        defaultLogger.i(tag, message, throwable);
    }

    @Override // ru.cyberity.log.logger.Logger
    public void v(@k String tag, @k String message, @l Throwable throwable) {
        defaultLogger.v(tag, message, throwable);
    }

    @Override // ru.cyberity.log.logger.Logger
    public void w(@k String tag, @k String message, @l Throwable throwable) {
        defaultLogger.w(tag, message, throwable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e() {
        Iterator<Map.Entry<String, ru.cyberity.log.logger.b>> it = batchingLoggers.entrySet().iterator();
        while (it.hasNext()) {
            it.next().getValue().clear();
        }
        batchingLoggers.clear();
        supportedLoggers.clear();
        defaultLogger.clear();
    }

    public final void a(boolean z12) {
        isDebug = z12;
    }

    public final void d() {
        resetHandler.b();
    }

    @k
    public final Logger a(@k LoggerType... loggers) {
        return c(C42756l.g0(loggers));
    }

    @k
    public final ru.cyberity.log.logger.b a(@k String batchName) {
        ConcurrentHashMap<String, ru.cyberity.log.logger.b> concurrentHashMap = batchingLoggers;
        ru.cyberity.log.logger.b bVar = concurrentHashMap.get(batchName);
        if (bVar != null) {
            return bVar;
        }
        ru.cyberity.log.logger.a aVar = new ru.cyberity.log.logger.a(batchName, defaultLogger);
        concurrentHashMap.put(batchName, aVar);
        return aVar;
    }

    public static /* synthetic */ void a(a aVar, LoggerType loggerType, Logger logger, boolean z12, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            z12 = false;
        }
        aVar.a(loggerType, logger, z12);
    }

    public final void a(@k LoggerType loggerType, @k Logger logger, boolean useByDefault) {
        supportedLoggers.put(loggerType, logger);
        if (useByDefault) {
            defaultLogger.a(logger);
        }
    }
}
