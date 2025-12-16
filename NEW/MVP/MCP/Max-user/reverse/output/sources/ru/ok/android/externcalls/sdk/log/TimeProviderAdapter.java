package ru.ok.android.externcalls.sdk.log;

import defpackage.y8g;
import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.log.ExtLogger;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0011\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\f\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000e\u0010\nJ\u000f\u0010\u000f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0010¨\u0006\u0011"}, d2 = {"Lru/ok/android/externcalls/sdk/log/TimeProviderAdapter;", "Ly8g;", "Lru/ok/android/externcalls/sdk/log/ExtLogger$TimeProvider;", "loggerTimeProvider", "<init>", "(Lru/ok/android/externcalls/sdk/log/ExtLogger$TimeProvider;)V", "", "getServerTimeMs", "()Ljava/lang/Long;", "getMsSinceBoot", "()J", "serverTimePointMs", "mapToLocalTimeMs", "(J)Ljava/lang/Long;", "localTimeMs", "utcTimeMs", "Lru/ok/android/externcalls/sdk/log/ExtLogger$TimeProvider;", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TimeProviderAdapter implements y8g {
    private final ExtLogger.TimeProvider loggerTimeProvider;

    public TimeProviderAdapter(ExtLogger.TimeProvider timeProvider) {
        this.loggerTimeProvider = timeProvider;
    }

    @Override // defpackage.y8g
    public long getMsSinceBoot() {
        return 0L;
    }

    @Override // defpackage.y8g
    public Long getServerTimeMs() {
        return null;
    }

    @Override // defpackage.y8g
    public long localTimeMs() {
        return 0L;
    }

    @Override // defpackage.y8g
    public Long mapToLocalTimeMs(long serverTimePointMs) {
        return null;
    }

    @Override // defpackage.y8g
    public long utcTimeMs() {
        return this.loggerTimeProvider.getCurrentTimeMillis();
    }
}
