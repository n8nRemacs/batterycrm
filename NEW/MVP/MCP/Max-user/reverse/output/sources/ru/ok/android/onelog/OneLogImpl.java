package ru.ok.android.onelog;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;
import defpackage.awa;
import defpackage.erf;
import defpackage.ml;
import defpackage.mri;
import java.io.IOException;
import java.util.Collection;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import javax.inject.Provider;
import ru.ok.android.api.core.ApiException;
import ru.ok.android.commons.app.ApplicationProvider;
import ru.ok.android.onelog.OneLogErrorHandler;

/* loaded from: classes2.dex */
public final class OneLogImpl implements OneLogAppender {

    @SuppressLint({"StaticFieldLeak"})
    private static OneLogImpl INSTANCE = new OneLogImpl();
    private volatile Provider<ml> apiClient;
    private volatile erf forceFallbackLogs;
    private volatile Executor uploadExecutor;
    private volatile int uploadJobId = 15261;
    private volatile long defSilenceMillisToUpload = ru.ok.android.onelog.impl.BuildConfig.SILENCE_TIME_TO_UPLOAD;
    private volatile long defMaxMillisToUpload = ru.ok.android.onelog.impl.BuildConfig.MAX_TIME_TO_UPLOAD;
    private volatile int defFileLengthToUpload = ru.ok.android.onelog.impl.BuildConfig.FILE_LENGTH_TO_UPLOAD;
    private volatile int defCountToUpload = 500;
    private volatile OneLogErrorHandler errorHandler = new OneLogErrorHandler.Default();

    public static OneLogImpl getInstance() {
        return INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$startUpload$0(String str) {
        try {
            upload(str);
        } catch (IOException unused) {
        }
    }

    private static long toMillis(long j, TimeUnit timeUnit) {
        return j == ru.ok.android.onelog.impl.BuildConfig.MAX_TIME_TO_UPLOAD ? ru.ok.android.onelog.impl.BuildConfig.MAX_TIME_TO_UPLOAD : timeUnit.toMillis(j);
    }

    @Override // ru.ok.android.onelog.OneLogAppender
    public void append(OneLogItem oneLogItem) {
        Collector.getInstance(oneLogItem.collector()).append(oneLogItem);
    }

    public void attachApiClient(Provider<ml> provider) {
        this.apiClient = provider;
    }

    @Deprecated
    public void attachBaseContext(Context context) {
    }

    public void clearAllMaxTimeToUpload() {
        this.defMaxMillisToUpload = ru.ok.android.onelog.impl.BuildConfig.MAX_TIME_TO_UPLOAD;
        Collector.clearAllMaxTimeToUpload();
    }

    @Override // ru.ok.android.onelog.OneLogAppender, java.io.Flushable
    public void flush() {
        Collector.flushAll();
    }

    public ml getApiClient() {
        if (this.apiClient == null) {
            throw new IllegalStateException("ApiClient not attached to Collector");
        }
        ml mlVar = this.apiClient.get();
        if (mlVar != null) {
            return mlVar;
        }
        throw new IllegalStateException("ApiClient not attached to Collector");
    }

    @Deprecated
    public String getApplicationParam() {
        return Uploader.getApplicationParam();
    }

    @Deprecated
    public Context getContext() {
        Application application = ApplicationProvider.a;
        return mri.a();
    }

    public int getDefCountToUpload() {
        return this.defCountToUpload;
    }

    public int getDefFileLengthToUpload() {
        return this.defFileLengthToUpload;
    }

    public long getDefMaxMillisToUpload() {
        return this.defMaxMillisToUpload;
    }

    public long getDefSilenceMillisToUpload() {
        return this.defSilenceMillisToUpload;
    }

    public OneLogErrorHandler getErrorHandler() {
        return this.errorHandler;
    }

    public boolean getForceFallbackLogs() {
        return false;
    }

    @Deprecated
    public String getPlatformParam() {
        return Uploader.getPlatformParam();
    }

    public int getUploadJobId() {
        return this.uploadJobId;
    }

    @Deprecated
    public void setApplicationInfo(String str, String str2, int i) {
    }

    public void setDefCountToUpload(int i) {
        this.defCountToUpload = i;
    }

    public void setDefFileLengthToUpload(int i) {
        this.defFileLengthToUpload = i;
    }

    public void setDefMaxTimeToUpload(long j, TimeUnit timeUnit) {
        this.defMaxMillisToUpload = toMillis(j, timeUnit);
    }

    public void setDefSilenceTimeToUpload(long j, TimeUnit timeUnit) {
        this.defSilenceMillisToUpload = toMillis(j, timeUnit);
    }

    public void setErrorHandler(OneLogErrorHandler oneLogErrorHandler) {
        this.errorHandler = oneLogErrorHandler;
    }

    public void setForceFallbackLogs(erf erfVar) {
    }

    public void setMaxTimeToUpload(String str, String str2, long j, TimeUnit timeUnit) {
        Collector.getInstance(str).setMaxMillisToUpload(str2, toMillis(j, timeUnit));
    }

    public void setMaxTimeToUploadAny(String str, long j, TimeUnit timeUnit) {
        Collector.getInstance(str).setMaxMillisToUploadAny(toMillis(j, timeUnit));
    }

    public void setUploadExecutor(Executor executor) {
        this.uploadExecutor = executor;
    }

    public void setUploadJobId(int i) {
        this.uploadJobId = i;
    }

    public void startUpload(String str) {
        Executor executor = this.uploadExecutor;
        if (executor == null) {
            UploadService.startUpload(str);
        } else {
            executor.execute(new awa(0, str));
        }
    }

    public void upload(OneLogItem oneLogItem) throws IOException, ApiException {
        Uploader.execute(getApiClient(), oneLogItem);
    }

    public void upload(Collection<OneLogItem> collection) throws IOException, ApiException {
        Uploader.execute(getApiClient(), collection);
    }

    public static void upload(String str) throws IOException {
        Collector.getInstance(str).upload();
    }
}
