package ru.cyberity.log.logger;

import Y61.k;
import Y61.l;
import kotlin.Metadata;
import ru.cyberity.cbr.core.PublicApi;

/* compiled from: Logger.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\bg\u0018\u00002\u00020\u0001J+\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H&¢\u0006\u0004\b\b\u0010\tJ+\u0010\n\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H&¢\u0006\u0004\b\n\u0010\tJ+\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H&¢\u0006\u0004\b\u000b\u0010\tJ+\u0010\f\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H&¢\u0006\u0004\b\f\u0010\tJ+\u0010\r\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H&¢\u0006\u0004\b\r\u0010\tø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000eÀ\u0006\u0001"}, d2 = {"Lru/cyberity/log/logger/Logger;", "", "", "tag", "message", "", "throwable", "Lkotlin/G0;", "e", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V", "w", "d", "i", "v", "cyberity-mobile-sdk-publicapi_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
@PublicApi
/* loaded from: classes9.dex */
public interface Logger {
    static /* synthetic */ void d$default(Logger logger, String str, String str2, Throwable th2, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: d");
        }
        if ((i12 & 4) != 0) {
            th2 = null;
        }
        logger.d(str, str2, th2);
    }

    static /* synthetic */ void e$default(Logger logger, String str, String str2, Throwable th2, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: e");
        }
        if ((i12 & 4) != 0) {
            th2 = null;
        }
        logger.e(str, str2, th2);
    }

    static /* synthetic */ void i$default(Logger logger, String str, String str2, Throwable th2, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: i");
        }
        if ((i12 & 4) != 0) {
            th2 = null;
        }
        logger.i(str, str2, th2);
    }

    static /* synthetic */ void v$default(Logger logger, String str, String str2, Throwable th2, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: v");
        }
        if ((i12 & 4) != 0) {
            th2 = null;
        }
        logger.v(str, str2, th2);
    }

    static /* synthetic */ void w$default(Logger logger, String str, String str2, Throwable th2, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: w");
        }
        if ((i12 & 4) != 0) {
            th2 = null;
        }
        logger.w(str, str2, th2);
    }

    void d(@k String tag, @k String message, @l Throwable throwable);

    void e(@k String tag, @k String message, @l Throwable throwable);

    void i(@k String tag, @k String message, @l Throwable throwable);

    void v(@k String tag, @k String message, @l Throwable throwable);

    void w(@k String tag, @k String message, @l Throwable throwable);
}
