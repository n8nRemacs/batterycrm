package ru.cyberity.log.logger;

import Y61.k;
import Y61.l;
import android.util.Log;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import ru.cyberity.log.LoggerType;

/* compiled from: BatchingLogger.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00112\u00020\u00012\u00020\u0002:\u0001\u000fB\u0019\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0001¢\u0006\u0004\b\u0006\u0010\u0007J1\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u00032\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J)\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u00032\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J)\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u00032\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u0013\u0010\u0012J)\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u00032\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u0014\u0010\u0012J)\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u00032\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u0015\u0010\u0012J)\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u00032\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u0016\u0010\u0012J\u000f\u0010\u0017\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0019\u0010\u0018R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u001a\u001a\u0004\b\u000f\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR$\u0010\"\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u001ej\b\u0012\u0004\u0012\u00020\u0003`\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R6\u0010)\u001a\b\u0012\u0004\u0012\u00020$0#2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020$0#8V@VX\u0096\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010&\u001a\u0004\b\u001c\u0010'\"\u0004\b\u000f\u0010(¨\u0006*"}, d2 = {"Lru/cyberity/log/logger/a;", "Lru/cyberity/log/logger/Logger;", "Lru/cyberity/log/logger/b;", "", "batchName", "defaultLogger", "<init>", "(Ljava/lang/String;Lru/cyberity/log/logger/Logger;)V", "", "severity", "tag", "message", "", "throwable", "Lkotlin/G0;", "a", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V", "e", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V", "w", "d", "i", "v", "clear", "()V", "flush", "Ljava/lang/String;", "()Ljava/lang/String;", "b", "Lru/cyberity/log/logger/Logger;", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "c", "Ljava/util/ArrayList;", "inMemoryLog", "", "Lru/cyberity/log/LoggerType;", "<set-?>", "Ljava/util/List;", "()Ljava/util/List;", "(Ljava/util/List;)V", "flushDestination", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final class a implements Logger, b {

    /* renamed from: e, reason: collision with root package name */
    @k
    private static final C12564a f436099e = new C12564a(null);

    /* renamed from: f, reason: collision with root package name */
    @k
    @Deprecated
    private static final SimpleDateFormat f436100f = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.ROOT);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @k
    private final String batchName;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @k
    private final Logger defaultLogger;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @k
    private final ArrayList<String> inMemoryLog = new ArrayList<>();

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @k
    private List<? extends LoggerType> flushDestination = Collections.singletonList(LoggerType.KIBANA);

    /* compiled from: BatchingLogger.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ(\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Lru/cyberity/log/logger/a$a;", "", "", "severity", "", "tag", "message", "", "throwable", "a", "Ljava/text/SimpleDateFormat;", "simpleDateFormat", "Ljava/text/SimpleDateFormat;", "<init>", "()V", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
    /* renamed from: ru.cyberity.log.logger.a$a, reason: collision with other inner class name */
    public static final class C12564a {
        public /* synthetic */ C12564a(C42822w c42822w) {
            this();
        }

        @k
        public final String a(int severity, @k String tag, @k String message, @l Throwable throwable) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(a.f436100f.format(new Date()).toString());
            sb2.append(' ');
            sb2.append(ru.cyberity.log.b.a().get(Integer.valueOf(severity)));
            sb2.append('/');
            sb2.append(tag);
            sb2.append(": ");
            sb2.append(message);
            if (throwable != null) {
                sb2.append('\n');
                sb2.append(Log.getStackTraceString(throwable));
            }
            return sb2.toString();
        }

        private C12564a() {
        }
    }

    public a(@k String str, @k Logger logger) {
        this.batchName = str;
        this.defaultLogger = logger;
    }

    @k
    /* renamed from: a, reason: from getter */
    public String getBatchName() {
        return this.batchName;
    }

    @k
    public synchronized List<LoggerType> b() {
        return this.flushDestination;
    }

    @Override // ru.cyberity.log.logger.b
    public synchronized void clear() {
        this.inMemoryLog.clear();
    }

    @Override // ru.cyberity.log.logger.Logger
    public void d(@k String tag, @k String message, @l Throwable throwable) {
        this.defaultLogger.d(tag, message, throwable);
        a(3, tag, message, throwable);
    }

    @Override // ru.cyberity.log.logger.Logger
    public void e(@k String tag, @k String message, @l Throwable throwable) {
        this.defaultLogger.e(tag, message, throwable);
        a(6, tag, message, throwable);
    }

    @Override // ru.cyberity.log.logger.b
    public synchronized void flush() {
        try {
            if (this.inMemoryLog.isEmpty()) {
                return;
            }
            StringBuilder sb2 = new StringBuilder();
            Iterator<T> it = this.inMemoryLog.iterator();
            while (it.hasNext()) {
                sb2.append((String) it.next());
                sb2.append('\n');
            }
            this.inMemoryLog.clear();
            String string = sb2.toString();
            Iterator<T> it2 = ru.cyberity.log.a.f436064a.b(b()).iterator();
            while (it2.hasNext()) {
                Logger.i$default((Logger) it2.next(), getBatchName(), string, null, 4, null);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // ru.cyberity.log.logger.Logger
    public void i(@k String tag, @k String message, @l Throwable throwable) {
        this.defaultLogger.i(tag, message, throwable);
        a(4, tag, message, throwable);
    }

    @Override // ru.cyberity.log.logger.Logger
    public void v(@k String tag, @k String message, @l Throwable throwable) {
        this.defaultLogger.v(tag, message, throwable);
        a(2, tag, message, throwable);
    }

    @Override // ru.cyberity.log.logger.Logger
    public void w(@k String tag, @k String message, @l Throwable throwable) {
        this.defaultLogger.w(tag, message, throwable);
        a(5, tag, message, throwable);
    }

    private final synchronized void a(int severity, String tag, String message, Throwable throwable) {
        this.inMemoryLog.add(f436099e.a(severity, tag, message, throwable));
    }
}
