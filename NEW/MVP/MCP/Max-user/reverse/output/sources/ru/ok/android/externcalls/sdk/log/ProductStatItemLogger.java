package ru.ok.android.externcalls.sdk.log;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import defpackage.tk4;
import defpackage.wy1;
import defpackage.y6d;
import kotlin.Metadata;
import ru.ok.android.externcalls.analytics.internal.api.CallAnalyticsApiRequest;
import ru.ok.android.externcalls.analytics.internal.event.EventChannel;
import ru.ok.android.externcalls.analytics.internal.event.EventQueueCollector;
import ru.ok.android.externcalls.sdk.log.LogItem;
import ru.ok.android.externcalls.sdk.log.stat.item.ProductAnalyticsEvent;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0003\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u0007\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0007\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000eR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0012¨\u0006\u0015"}, d2 = {"Lru/ok/android/externcalls/sdk/log/ProductStatItemLogger;", "Lru/ok/android/externcalls/sdk/log/ItemToLogConverter;", "Landroid/content/Context;", "context", "", "isObsoleteStatisticsEnabled", "Ly6d;", "log", "<init>", "(Landroid/content/Context;ZLy6d;)V", "Lru/ok/android/externcalls/sdk/log/LogItem;", "item", "Lqqg;", "(Lru/ok/android/externcalls/sdk/log/LogItem;)V", "Z", "Ly6d;", "", CallAnalyticsApiRequest.KEY_APPLICATION, "Ljava/lang/String;", CallAnalyticsApiRequest.KEY_PLATFORM, "Companion", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
final class ProductStatItemLogger implements ItemToLogConverter {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String FORM_FACTOR_PHONE = "phone";
    private static final String FORM_FACTOR_TABLET = "tablet";
    private static final String LOG_TAG = "ProductStatItemLogger";
    private final String application;
    private final boolean isObsoleteStatisticsEnabled;
    private final y6d log;
    private final String platform;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tH\u0003J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tH\u0003R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lru/ok/android/externcalls/sdk/log/ProductStatItemLogger$Companion;", "", "()V", "FORM_FACTOR_PHONE", "", "FORM_FACTOR_TABLET", "LOG_TAG", "calcApplicationName", "context", "Landroid/content/Context;", "calcApplicationPlatform", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(tk4 tk4Var) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String calcApplicationName(Context context) throws PackageManager.NameNotFoundException {
            String packageName = context.getPackageName();
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
            return packageName + ":" + packageInfo.versionName + ":" + packageInfo.versionCode;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String calcApplicationPlatform(Context context) {
            return wy1.i("android:", context.getResources().getConfiguration().smallestScreenWidthDp < 600 ? ProductStatItemLogger.FORM_FACTOR_PHONE : ProductStatItemLogger.FORM_FACTOR_TABLET, ":", Build.VERSION.RELEASE);
        }

        private Companion() {
        }
    }

    public ProductStatItemLogger(Context context, boolean z, y6d y6dVar) {
        this.isObsoleteStatisticsEnabled = z;
        this.log = y6dVar;
        this.application = z ? INSTANCE.calcApplicationName(context) : "";
        this.platform = z ? INSTANCE.calcApplicationPlatform(context) : "";
    }

    private static final String calcApplicationName(Context context) {
        return INSTANCE.calcApplicationName(context);
    }

    private static final String calcApplicationPlatform(Context context) {
        return INSTANCE.calcApplicationPlatform(context);
    }

    @Override // ru.ok.android.externcalls.sdk.log.ItemToLogConverter
    public void log(LogItem item) {
        if (this.isObsoleteStatisticsEnabled) {
            try {
                LogItem.Builder builder = item instanceof LogItem.Builder ? (LogItem.Builder) item : null;
                if (builder == null) {
                    return;
                }
                ProductAnalyticsEvent productAnalyticsEvent = new ProductAnalyticsEvent(builder.toProductStatItem$calls_sdk_release());
                EventQueueCollector.getInstance(new EventChannel(productAnalyticsEvent.getApiMethodName(), productAnalyticsEvent.getCollector(), this.application, this.platform, true)).addEvent(productAnalyticsEvent);
            } catch (Throwable th) {
                this.log.reportException(LOG_TAG, "Can't log", th);
            }
        }
    }
}
