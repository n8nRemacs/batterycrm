package ru.cyberity.log.logger;

import Y61.k;
import Y61.l;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

/* compiled from: GroupLogger.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J)\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\f\u0010\rJ)\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000e\u0010\rJ)\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000f\u0010\rJ)\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u0010\u0010\rJ)\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u0011\u0010\rR\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/cyberity/log/logger/c;", "Lru/cyberity/log/logger/Logger;", "", "loggers", "<init>", "(Ljava/util/List;)V", "", "tag", "message", "", "throwable", "Lkotlin/G0;", "e", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V", "w", "d", "i", "v", "a", "Ljava/util/List;", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final class c implements Logger {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @k
    private final List<Logger> loggers;

    /* JADX WARN: Multi-variable type inference failed */
    public c(@k List<? extends Logger> list) {
        this.loggers = list;
    }

    @Override // ru.cyberity.log.logger.Logger
    public void d(@k String tag, @k String message, @l Throwable throwable) {
        Iterator<T> it = this.loggers.iterator();
        while (it.hasNext()) {
            ((Logger) it.next()).d(tag, message, throwable);
        }
    }

    @Override // ru.cyberity.log.logger.Logger
    public void e(@k String tag, @k String message, @l Throwable throwable) {
        Iterator<T> it = this.loggers.iterator();
        while (it.hasNext()) {
            ((Logger) it.next()).e(tag, message, throwable);
        }
    }

    @Override // ru.cyberity.log.logger.Logger
    public void i(@k String tag, @k String message, @l Throwable throwable) {
        Iterator<T> it = this.loggers.iterator();
        while (it.hasNext()) {
            ((Logger) it.next()).i(tag, message, throwable);
        }
    }

    @Override // ru.cyberity.log.logger.Logger
    public void v(@k String tag, @k String message, @l Throwable throwable) {
        Iterator<T> it = this.loggers.iterator();
        while (it.hasNext()) {
            ((Logger) it.next()).v(tag, message, throwable);
        }
    }

    @Override // ru.cyberity.log.logger.Logger
    public void w(@k String tag, @k String message, @l Throwable throwable) {
        Iterator<T> it = this.loggers.iterator();
        while (it.hasNext()) {
            ((Logger) it.next()).w(tag, message, throwable);
        }
    }
}
