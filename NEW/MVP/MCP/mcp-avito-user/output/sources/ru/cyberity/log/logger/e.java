package ru.cyberity.log.logger;

import Y61.k;
import Y61.l;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;

/* compiled from: ModifiableLogger.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ)\u0010\f\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\f\u0010\u000bJ)\u0010\r\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\r\u0010\u000bJ)\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\u000e\u0010\u000bJ)\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\u000f\u0010\u000bJ\u0015\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\t¢\u0006\u0004\b\u0013\u0010\u0003R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00010\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0015R\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00010\u00178F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Lru/cyberity/log/logger/e;", "Lru/cyberity/log/logger/Logger;", "<init>", "()V", "", "tag", "message", "", "throwable", "Lkotlin/G0;", "e", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V", "w", "d", "i", "v", "logger", "a", "(Lru/cyberity/log/logger/Logger;)V", "clear", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Ljava/util/concurrent/CopyOnWriteArrayList;", "_loggers", "", "c", "()Ljava/util/List;", "loggers", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final class e implements Logger {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @k
    private final CopyOnWriteArrayList<Logger> _loggers = new CopyOnWriteArrayList<>();

    public final void a(@k Logger logger) {
        this._loggers.add(logger);
    }

    @k
    public final List<Logger> c() {
        return this._loggers;
    }

    public final void clear() {
        this._loggers.clear();
    }

    @Override // ru.cyberity.log.logger.Logger
    public void d(@k String tag, @k String message, @l Throwable throwable) {
        Iterator<T> it = this._loggers.iterator();
        while (it.hasNext()) {
            ((Logger) it.next()).d(tag, message, throwable);
        }
    }

    @Override // ru.cyberity.log.logger.Logger
    public void e(@k String tag, @k String message, @l Throwable throwable) {
        Iterator<T> it = this._loggers.iterator();
        while (it.hasNext()) {
            ((Logger) it.next()).e(tag, message, throwable);
        }
    }

    @Override // ru.cyberity.log.logger.Logger
    public void i(@k String tag, @k String message, @l Throwable throwable) {
        Iterator<T> it = this._loggers.iterator();
        while (it.hasNext()) {
            ((Logger) it.next()).i(tag, message, throwable);
        }
    }

    @Override // ru.cyberity.log.logger.Logger
    public void v(@k String tag, @k String message, @l Throwable throwable) {
        Iterator<T> it = this._loggers.iterator();
        while (it.hasNext()) {
            ((Logger) it.next()).v(tag, message, throwable);
        }
    }

    @Override // ru.cyberity.log.logger.Logger
    public void w(@k String tag, @k String message, @l Throwable throwable) {
        Iterator<T> it = this._loggers.iterator();
        while (it.hasNext()) {
            ((Logger) it.next()).w(tag, message, throwable);
        }
    }
}
