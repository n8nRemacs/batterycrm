package ru.ok.android.externcalls.sdk.log;

import android.content.Context;
import defpackage.dwa;
import defpackage.y6d;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bq\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0001\u0002\b\tø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, d2 = {"Lru/ok/android/externcalls/sdk/log/ItemToLogConverter;", "", "Lru/ok/android/externcalls/sdk/log/LogItem;", "item", "Lqqg;", "log", "(Lru/ok/android/externcalls/sdk/log/LogItem;)V", "Companion", "Lru/ok/android/externcalls/sdk/log/OneLogItemLogger;", "Lru/ok/android/externcalls/sdk/log/ProductStatItemLogger;", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface ItemToLogConverter {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lru/ok/android/externcalls/sdk/log/ItemToLogConverter$Companion;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "isOneLoggerEnabled", "isObsoleteStatisticsEnabled", "Ly6d;", "log", "Lru/ok/android/externcalls/sdk/log/ItemToLogConverter;", "create", "(Landroid/content/Context;ZZLy6d;)Lru/ok/android/externcalls/sdk/log/ItemToLogConverter;", "", "LOG_TAG", "Ljava/lang/String;", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final String LOG_TAG = "ItemToLogConverter";

        private Companion() {
        }

        public final ItemToLogConverter create(Context context, boolean isOneLoggerEnabled, boolean isObsoleteStatisticsEnabled, y6d log) {
            if (!isOneLoggerEnabled || !isObsoleteStatisticsEnabled) {
                return new ProductStatItemLogger(context, isObsoleteStatisticsEnabled, log);
            }
            try {
                if (dwa.a != null) {
                    return new OneLogItemLogger(log);
                }
                throw new IllegalStateException(dwa.class.getName().concat(" is not initialized, please call init() method on this class\nYou can find this class in \"ru.ok.android:onelogger:0.2.7\""));
            } catch (Throwable th) {
                log.reportException(LOG_TAG, "Can't initialize OneLogger, fallback to native implementation", th);
                return new ProductStatItemLogger(context, true, log);
            }
        }
    }

    static ItemToLogConverter create(Context context, boolean z, boolean z2, y6d y6dVar) {
        return INSTANCE.create(context, z, z2, y6dVar);
    }

    void log(LogItem item);
}
