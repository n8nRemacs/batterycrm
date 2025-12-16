package ru.ok.android.externcalls.sdk.factory.internal;

import defpackage.cm6;
import defpackage.y6d;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0010\u0010\u000fR\u001c\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0011¨\u0006\u0012"}, d2 = {"Lru/ok/android/externcalls/sdk/factory/internal/RTCLogWrapper;", "Ly6d;", "Lkotlin/Function0;", "logger", "<init>", "(Lcm6;)V", "", "tag", "msg", "Lqqg;", "log", "(Ljava/lang/String;Ljava/lang/String;)V", "", "throwable", "logException", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V", "reportException", "Lcm6;", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class RTCLogWrapper implements y6d {
    private final cm6 logger;

    public RTCLogWrapper(cm6 cm6Var) {
        this.logger = cm6Var;
    }

    @Override // defpackage.y6d
    public void log(String tag, String msg) {
        y6d y6dVar = (y6d) this.logger.invoke();
        if (y6dVar != null) {
            y6dVar.log(tag, msg);
        }
    }

    @Override // defpackage.y6d
    public void logException(String tag, String msg, Throwable throwable) {
        y6d y6dVar = (y6d) this.logger.invoke();
        if (y6dVar != null) {
            y6dVar.logException(tag, msg, throwable);
        }
    }

    @Override // defpackage.y6d
    public void reportException(String tag, String msg, Throwable throwable) {
        y6d y6dVar = (y6d) this.logger.invoke();
        if (y6dVar != null) {
            y6dVar.reportException(tag, msg, throwable);
        }
    }
}
