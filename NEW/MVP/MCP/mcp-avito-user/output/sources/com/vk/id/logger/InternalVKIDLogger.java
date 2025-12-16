package com.vk.id.logger;

import Y61.k;
import Y61.l;
import com.avito.android.remote.model.messenger.RequestReviewResultKt;
import com.vk.id.common.InternalVKIDApi;
import kotlin.Metadata;

/* compiled from: InternalVKIDLogger.kt */
@InternalVKIDApi
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0007\u0010\u0006J!\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\bH&¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/vk/id/logger/InternalVKIDLogger;", "", "", "message", "Lkotlin/G0;", RequestReviewResultKt.INFO_TYPE, "(Ljava/lang/String;)V", "debug", "", "throwable", "error", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "logger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface InternalVKIDLogger {
    void debug(@k String message);

    void error(@k String message, @l Throwable throwable);

    void info(@k String message);
}
