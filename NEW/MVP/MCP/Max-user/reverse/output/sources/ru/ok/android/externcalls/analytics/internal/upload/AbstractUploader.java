package ru.ok.android.externcalls.analytics.internal.upload;

import android.app.Application;
import android.content.pm.PackageManager;
import defpackage.cm6;
import defpackage.fni;
import defpackage.hz5;
import defpackage.jt0;
import defpackage.ml;
import defpackage.mri;
import defpackage.qqg;
import defpackage.tk4;
import defpackage.u08;
import defpackage.yg5;
import defpackage.yl;
import defpackage.zg5;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.locks.Lock;
import javax.inject.Provider;
import kotlin.Metadata;
import ru.ok.android.api.core.ApiException;
import ru.ok.android.api.core.ApiInvocationException;
import ru.ok.android.api.core.ApiRequestException;
import ru.ok.android.api.json.JsonSerializeException;
import ru.ok.android.commons.app.ApplicationProvider;
import ru.ok.android.externcalls.analytics.config.CallAnalyticsConfig;
import ru.ok.android.externcalls.analytics.config.EventMetaParamsConfig;
import ru.ok.android.externcalls.analytics.internal.api.CallAnalyticsApiRequest;
import ru.ok.android.externcalls.analytics.internal.api.CallExternalAnalyticsApiRequest;
import ru.ok.android.externcalls.analytics.internal.api.CallNativeAnalyticsApiRequest;
import ru.ok.android.externcalls.analytics.internal.api.StreamingItemsApiValue;
import ru.ok.android.externcalls.analytics.internal.config.CallAnalyticsConfigStorage;
import ru.ok.android.externcalls.analytics.internal.event.EventChannel;
import ru.ok.android.externcalls.analytics.internal.upload.Uploader;
import ru.ok.android.externcalls.analytics.log.CallAnalyticsLogger;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\r\b!\u0018\u0000 D2\u00020\u0001:\u0002DEB=\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J'\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0019H\u0016¢\u0006\u0004\b \u0010!J\u0019\u0010$\u001a\u00020\u00192\b\u0010#\u001a\u0004\u0018\u00010\"H\u0016¢\u0006\u0004\b$\u0010%J\u0017\u0010'\u001a\u00020\u00032\u0006\u0010&\u001a\u00020\tH\u0004¢\u0006\u0004\b'\u0010(J\u0017\u0010)\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0003H\u0004¢\u0006\u0004\b)\u0010*J#\u0010.\u001a\u00028\u0000\"\u0004\b\u0000\u0010+2\f\u0010-\u001a\b\u0012\u0004\u0012\u00028\u00000,H\u0004¢\u0006\u0004\b.\u0010/R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0004\u00100\u001a\u0004\b1\u00102R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u00103R\u001a\u0010\b\u001a\u00020\u00078\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\b\u00104\u001a\u0004\b5\u00106R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u00107R\u0014\u0010\u000b\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u00107R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u00108R\u001a\u0010:\u001a\u0002098\u0004X\u0084\u0004¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R$\u0010>\u001a\u0004\u0018\u00010\"8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b>\u0010?\u001a\u0004\b@\u0010A\"\u0004\bB\u0010%R\u0018\u0010C\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u00108¨\u0006F"}, d2 = {"Lru/ok/android/externcalls/analytics/internal/upload/AbstractUploader;", "Lru/ok/android/externcalls/analytics/internal/upload/Uploader;", "Ljavax/inject/Provider;", "Ljava/io/File;", "storage", "Ljava/util/concurrent/locks/Lock;", "lock", "Lru/ok/android/externcalls/analytics/internal/event/EventChannel;", "channel", "", "isContentCompressed", "autoDetectContentCompression", "", "logTag", "<init>", "(Ljavax/inject/Provider;Ljava/util/concurrent/locks/Lock;Lru/ok/android/externcalls/analytics/internal/event/EventChannel;ZZLjava/lang/String;)V", "Lml;", "client", "file", "Lru/ok/android/externcalls/analytics/internal/upload/AbstractUploader$UploadResult;", "uploadFileWithContent", "(Lml;Ljava/io/File;)Lru/ok/android/externcalls/analytics/internal/upload/AbstractUploader$UploadResult;", "apiClient", "Ljt0;", CallAnalyticsApiRequest.KEY_ITEMS, "Lqqg;", "executeApiMethod", "(Lml;Lru/ok/android/externcalls/analytics/internal/event/EventChannel;Ljt0;)V", "Lru/ok/android/externcalls/analytics/internal/upload/UploadException;", "ex", "reportApiInvocationError", "(Lru/ok/android/externcalls/analytics/internal/upload/UploadException;)V", "drop", "()V", "Lru/ok/android/externcalls/analytics/internal/upload/Uploader$IdleStateProvider;", "idleStateProvider", "setIdleStateProvider", "(Lru/ok/android/externcalls/analytics/internal/upload/Uploader$IdleStateProvider;)V", "isDirectory", "ensureStorageIsOfCorrectType", "(Z)Ljava/io/File;", "uploadFile", "(Ljava/io/File;)Lru/ok/android/externcalls/analytics/internal/upload/AbstractUploader$UploadResult;", "T", "Lkotlin/Function0;", "block", "withLock", "(Lcm6;)Ljava/lang/Object;", "Ljavax/inject/Provider;", "getStorage", "()Ljavax/inject/Provider;", "Ljava/util/concurrent/locks/Lock;", "Lru/ok/android/externcalls/analytics/internal/event/EventChannel;", "getChannel", "()Lru/ok/android/externcalls/analytics/internal/event/EventChannel;", "Z", "Ljava/lang/String;", "Lru/ok/android/externcalls/analytics/log/CallAnalyticsLogger;", "logger", "Lru/ok/android/externcalls/analytics/log/CallAnalyticsLogger;", "getLogger", "()Lru/ok/android/externcalls/analytics/log/CallAnalyticsLogger;", "idleState", "Lru/ok/android/externcalls/analytics/internal/upload/Uploader$IdleStateProvider;", "getIdleState", "()Lru/ok/android/externcalls/analytics/internal/upload/Uploader$IdleStateProvider;", "setIdleState", "lastReportedError", "Companion", "UploadResult", "calls-sdk-analytics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class AbstractUploader implements Uploader {
    private static final Companion Companion = new Companion(null);

    @Deprecated
    public static final String SDK_TYPE_STRING = "ANDROID";

    @Deprecated
    public static final String SDK_VERSION_STRING = "125.1.0.73.1";

    @Deprecated
    public static final int VERSION_INT = 1;
    private static String appVersionString;
    private final boolean autoDetectContentCompression;
    private final EventChannel channel;
    private volatile Uploader.IdleStateProvider idleState;
    private final boolean isContentCompressed;
    private String lastReportedError;
    private final Lock lock;
    private final String logTag;
    private final CallAnalyticsLogger logger = CallAnalyticsConfigStorage.INSTANCE.getLogger();
    private final Provider<File> storage;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u00020\u00048FX\u0087\u0004¢\u0006\f\u0012\u0004\b\n\u0010\u0002\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\f¨\u0006\u000f"}, d2 = {"Lru/ok/android/externcalls/analytics/internal/upload/AbstractUploader$Companion;", "", "()V", "SDK_TYPE_STRING", "", "SDK_VERSION_STRING", "VERSION_INT", "", "appVersionString", "applicationVersionParams", "getApplicationVersionParams$annotations", "getApplicationVersionParams", "()Ljava/lang/String;", "platformParam", "getPlatformParam", "calls-sdk-analytics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(tk4 tk4Var) {
            this();
        }

        public static /* synthetic */ void getApplicationVersionParams$annotations() {
        }

        public final String getApplicationVersionParams() throws PackageManager.NameNotFoundException {
            String str = AbstractUploader.appVersionString;
            if (str != null) {
                return str;
            }
            Application application = ApplicationProvider.a;
            String str2 = mri.d() + ":" + mri.c();
            Companion unused = AbstractUploader.Companion;
            AbstractUploader.appVersionString = str2;
            return str2;
        }

        public final String getPlatformParam() {
            EventMetaParamsConfig eventMetaParams;
            cm6 appName;
            String str;
            CallAnalyticsConfig config = CallAnalyticsConfigStorage.INSTANCE.getConfig();
            return (config == null || (eventMetaParams = config.getEventMetaParams()) == null || (appName = eventMetaParams.getAppName()) == null || (str = (String) appName.invoke()) == null) ? "debug" : str;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0084\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lru/ok/android/externcalls/analytics/internal/upload/AbstractUploader$UploadResult;", "", "(Ljava/lang/String;I)V", "SUCCESS", "SKIP", "ERROR", "BAD_CONTENT", "RECOVERABLE_ERROR", "calls-sdk-analytics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class UploadResult {
        private static final /* synthetic */ yg5 $ENTRIES;
        private static final /* synthetic */ UploadResult[] $VALUES;
        public static final UploadResult SUCCESS = new UploadResult("SUCCESS", 0);
        public static final UploadResult SKIP = new UploadResult("SKIP", 1);
        public static final UploadResult ERROR = new UploadResult("ERROR", 2);
        public static final UploadResult BAD_CONTENT = new UploadResult("BAD_CONTENT", 3);
        public static final UploadResult RECOVERABLE_ERROR = new UploadResult("RECOVERABLE_ERROR", 4);

        private static final /* synthetic */ UploadResult[] $values() {
            return new UploadResult[]{SUCCESS, SKIP, ERROR, BAD_CONTENT, RECOVERABLE_ERROR};
        }

        static {
            UploadResult[] uploadResultArr$values = $values();
            $VALUES = uploadResultArr$values;
            $ENTRIES = new zg5(uploadResultArr$values);
        }

        private UploadResult(String str, int i) {
        }

        public static yg5 getEntries() {
            return $ENTRIES;
        }

        public static UploadResult valueOf(String str) {
            return (UploadResult) Enum.valueOf(UploadResult.class, str);
        }

        public static UploadResult[] values() {
            return (UploadResult[]) $VALUES.clone();
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lqqg;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ru.ok.android.externcalls.analytics.internal.upload.AbstractUploader$drop$1, reason: invalid class name */
    public static final class AnonymousClass1 extends u08 implements cm6 {
        public AnonymousClass1() {
            super(0);
        }

        @Override // defpackage.cm6
        public /* bridge */ /* synthetic */ Object invoke() {
            m99invoke();
            return qqg.a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m99invoke() {
            File file = AbstractUploader.this.getStorage().get();
            try {
                if (file.exists()) {
                    hz5.b(file);
                    AbstractUploader.this.getLogger().d(AbstractUploader.this.logTag, "storage dropped:  " + file);
                    return;
                }
                AbstractUploader.this.getLogger().d(AbstractUploader.this.logTag, "don't drop storage " + file + ", file doesn't exist");
            } catch (IOException e) {
                AbstractUploader.this.getLogger().e(AbstractUploader.this.logTag, "storage drop failed " + file, e);
            }
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ok/android/externcalls/analytics/internal/upload/AbstractUploader$UploadResult;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ru.ok.android.externcalls.analytics.internal.upload.AbstractUploader$uploadFile$1, reason: invalid class name and case insensitive filesystem */
    public static final class C00051 extends u08 implements cm6 {
        final /* synthetic */ File $file;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C00051(File file) {
            super(0);
            this.$file = file;
        }

        @Override // defpackage.cm6
        public final UploadResult invoke() {
            CallAnalyticsConfig config = CallAnalyticsConfigStorage.INSTANCE.getConfig();
            if (config == null) {
                AbstractUploader.this.getLogger().d(AbstractUploader.this.logTag, "api not initialized, will retry");
                return UploadResult.SKIP;
            }
            try {
                if (this.$file.isFile() && hz5.e(this.$file) != 0) {
                    UploadResult uploadResultUploadFileWithContent = AbstractUploader.this.uploadFileWithContent(config.getOkApi().b(), this.$file);
                    hz5.b(this.$file);
                    return uploadResultUploadFileWithContent;
                }
                AbstractUploader.this.getLogger().d(AbstractUploader.this.logTag, "nothing to upload");
                try {
                    hz5.b(this.$file);
                } catch (Throwable th) {
                    AbstractUploader.this.getLogger().e(AbstractUploader.this.logTag, "can't delete empty file " + this.$file.getPath(), th);
                }
                return UploadResult.SKIP;
            } catch (IOException e) {
                AbstractUploader.this.getLogger().e(AbstractUploader.this.logTag, "upload failed due to io error", e);
                return UploadResult.ERROR;
            } catch (ApiException e2) {
                AbstractUploader.this.getLogger().e(AbstractUploader.this.logTag, "upload failed due to api error", e2);
                return UploadResult.RECOVERABLE_ERROR;
            }
        }
    }

    public AbstractUploader(Provider<File> provider, Lock lock, EventChannel eventChannel, boolean z, boolean z2, String str) {
        this.storage = provider;
        this.lock = lock;
        this.channel = eventChannel;
        this.isContentCompressed = z;
        this.autoDetectContentCompression = z2;
        this.logTag = str;
    }

    private final void executeApiMethod(ml apiClient, EventChannel channel, jt0 items) throws IOException, ApiException {
        yl callNativeAnalyticsApiRequest;
        if (channel.isExternal()) {
            callNativeAnalyticsApiRequest = new CallExternalAnalyticsApiRequest(channel.getApiMethod(), channel.getApplication(), channel.getCollector(), channel.getPlatform(), items, CallAnalyticsConfigStorage.INSTANCE.getLogger());
        } else {
            String apiMethod = channel.getApiMethod();
            Companion companion = Companion;
            callNativeAnalyticsApiRequest = new CallNativeAnalyticsApiRequest(apiMethod, companion.getPlatformParam(), companion.getApplicationVersionParams(), SDK_TYPE_STRING, "125.1.0.73.1", 1, items, CallAnalyticsConfigStorage.INSTANCE.getLogger());
        }
        try {
            apiClient.a(callNativeAnalyticsApiRequest);
            this.lastReportedError = null;
        } catch (IOException e) {
            throw e;
        } catch (ApiInvocationException e2) {
            reportApiInvocationError(new UploadException(channel.getApiMethod(), e2));
            throw e2;
        } catch (Throwable th) {
            reportApiInvocationError(new UploadException(channel.getApiMethod(), th));
            throw th;
        }
    }

    public static final String getApplicationVersionParams() {
        return Companion.getApplicationVersionParams();
    }

    private final void reportApiInvocationError(UploadException ex) {
        CallAnalyticsLogger logger = CallAnalyticsConfigStorage.INSTANCE.getLogger();
        if (logger == null) {
            return;
        }
        String message = ex.getMessage();
        if (fni.a(this.lastReportedError, message)) {
            String str = this.logTag;
            if (message == null) {
                message = "";
            }
            logger.e(str, message, ex);
            return;
        }
        this.lastReportedError = message;
        String str2 = this.logTag;
        if (message == null) {
            message = "";
        }
        logger.report(str2, message, ex);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final UploadResult uploadFileWithContent(ml client, File file) throws IOException, ApiException {
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            executeApiMethod(client, this.channel, new StreamingItemsApiValue(file, this.autoDetectContentCompression ? hz5.d(file) : this.isContentCompressed));
            long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
            CallAnalyticsLogger callAnalyticsLogger = this.logger;
            String str = this.logTag;
            String apiMethod = this.channel.getApiMethod();
            String collector = this.channel.getCollector();
            if (collector == null) {
                collector = "-";
            }
            callAnalyticsLogger.d(str, "upload completed, took " + jCurrentTimeMillis2 + "ms. channel=" + apiMethod + ", collector=" + collector);
            return UploadResult.SUCCESS;
        } catch (ApiInvocationException e) {
            int i = e.a;
            if (i == 2 || i == 453 || i == 102 || i == 103) {
                this.logger.w(this.logTag, "recoverable invocation error occurred, will retry");
                throw e;
            }
            this.logger.e(this.logTag, "upload failed: " + e.b + ", removing possibly broken logs");
            return UploadResult.BAD_CONTENT;
        } catch (ApiRequestException e2) {
            this.logger.e(this.logTag, "upload failed: " + e2.getMessage() + ", removing likely broken logs");
            return UploadResult.BAD_CONTENT;
        } catch (JsonSerializeException e3) {
            this.logger.e(this.logTag, "upload failed: " + e3.getMessage() + ", removing likely broken logs");
            return UploadResult.BAD_CONTENT;
        }
    }

    @Override // ru.ok.android.externcalls.analytics.internal.upload.Uploader
    public void drop() {
        withLock(new AnonymousClass1());
    }

    public final File ensureStorageIsOfCorrectType(boolean isDirectory) {
        File file = this.storage.get();
        if (file.exists() && file.isDirectory() != isDirectory) {
            try {
                hz5.b(file);
                return file;
            } catch (IOException unused) {
                this.logger.d(this.logTag, "File " + file.getName() + " isDirectory != " + isDirectory + " but can not be deleted");
            }
        }
        return file;
    }

    public final EventChannel getChannel() {
        return this.channel;
    }

    public final Uploader.IdleStateProvider getIdleState() {
        return this.idleState;
    }

    public final CallAnalyticsLogger getLogger() {
        return this.logger;
    }

    public final Provider<File> getStorage() {
        return this.storage;
    }

    public final void setIdleState(Uploader.IdleStateProvider idleStateProvider) {
        this.idleState = idleStateProvider;
    }

    @Override // ru.ok.android.externcalls.analytics.internal.upload.Uploader
    public void setIdleStateProvider(Uploader.IdleStateProvider idleStateProvider) {
        this.idleState = idleStateProvider;
    }

    public final UploadResult uploadFile(File file) {
        return (UploadResult) withLock(new C00051(file));
    }

    public final <T> T withLock(cm6 block) {
        try {
            this.lock.lock();
            return (T) block.invoke();
        } finally {
            this.lock.unlock();
        }
    }
}
