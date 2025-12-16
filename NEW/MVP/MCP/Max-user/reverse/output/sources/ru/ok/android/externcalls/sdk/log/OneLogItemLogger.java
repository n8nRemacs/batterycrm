package ru.ok.android.externcalls.sdk.log;

import defpackage.y6d;
import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.log.LogItem;
import ru.ok.android.onelog.OneLogItem;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0003\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0003\u0010\tR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\n¨\u0006\f"}, d2 = {"Lru/ok/android/externcalls/sdk/log/OneLogItemLogger;", "Lru/ok/android/externcalls/sdk/log/ItemToLogConverter;", "Ly6d;", "log", "<init>", "(Ly6d;)V", "Lru/ok/android/externcalls/sdk/log/LogItem;", "item", "Lqqg;", "(Lru/ok/android/externcalls/sdk/log/LogItem;)V", "Ly6d;", "Companion", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
final class OneLogItemLogger implements ItemToLogConverter {
    private static final String LOG_TAG = "OneLogItemLogger";
    private final y6d log;

    public OneLogItemLogger(y6d y6dVar) {
        this.log = y6dVar;
    }

    @Override // ru.ok.android.externcalls.sdk.log.ItemToLogConverter
    public void log(LogItem item) {
        OneLogItem oneLogItem$calls_sdk_release;
        try {
            LogItem.Builder builder = item instanceof LogItem.Builder ? (LogItem.Builder) item : null;
            if (builder == null || (oneLogItem$calls_sdk_release = builder.toOneLogItem$calls_sdk_release()) == null) {
                return;
            }
            oneLogItem$calls_sdk_release.log();
        } catch (Throwable th) {
            this.log.reportException(LOG_TAG, "Can't log", th);
        }
    }
}
