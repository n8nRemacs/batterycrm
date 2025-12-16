package com.vk.id.logger;

import Y61.k;
import Y61.l;
import com.avito.android.remote.model.messenger.RequestReviewResultKt;
import com.vk.id.common.InternalVKIDApi;
import com.vk.id.logger.LogEngine;
import kotlin.Metadata;

/* compiled from: InternalVKIDLoggerWithTag.kt */
@InternalVKIDApi
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\u000bJ!\u0010\u000f\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/vk/id/logger/InternalVKIDLoggerWithTag;", "Lcom/vk/id/logger/InternalVKIDLogger;", "", "tag", "Lcom/vk/id/logger/LogEngine;", "logEngine", "<init>", "(Ljava/lang/String;Lcom/vk/id/logger/LogEngine;)V", "message", "Lkotlin/G0;", RequestReviewResultKt.INFO_TYPE, "(Ljava/lang/String;)V", "debug", "", "throwable", "error", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "Ljava/lang/String;", "Lcom/vk/id/logger/LogEngine;", "logger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class InternalVKIDLoggerWithTag implements InternalVKIDLogger {

    @k
    private final LogEngine logEngine;

    @k
    private final String tag;

    public InternalVKIDLoggerWithTag(@k String str, @k LogEngine logEngine) {
        this.tag = str;
        this.logEngine = logEngine;
    }

    @Override // com.vk.id.logger.InternalVKIDLogger
    public void debug(@k String message) {
        this.logEngine.log(LogEngine.LogLevel.DEBUG, this.tag, message, null);
    }

    @Override // com.vk.id.logger.InternalVKIDLogger
    public void error(@k String message, @l Throwable throwable) {
        this.logEngine.log(LogEngine.LogLevel.ERROR, this.tag, message, throwable);
    }

    @Override // com.vk.id.logger.InternalVKIDLogger
    public void info(@k String message) {
        this.logEngine.log(LogEngine.LogLevel.INFO, this.tag, message, null);
    }
}
