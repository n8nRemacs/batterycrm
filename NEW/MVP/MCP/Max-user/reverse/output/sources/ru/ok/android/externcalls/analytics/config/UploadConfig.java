package ru.ok.android.externcalls.analytics.config;

import defpackage.a9h;
import defpackage.az1;
import defpackage.cm6;
import defpackage.fni;
import defpackage.tk4;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import ru.ok.android.onelog.impl.BuildConfig;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0010\u000e\n\u0002\b'\b\u0086\b\u0018\u0000 K2\u00020\u0001:\u0001KB½\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\u0012\b\u0002\u0010\n\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\t\u0012\u0012\b\u0002\u0010\u000b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\t\u0012\u0012\b\u0002\u0010\f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\t\u0012\u0012\b\u0002\u0010\r\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\t\u0012\u0012\b\u0002\u0010\u000f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0018\u00010\t\u0012\u0012\b\u0002\u0010\u0010\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0018\u00010\t\u0012\u0012\b\u0002\u0010\u0011\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0018\u00010\t¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u001a\u0010\u001b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001d\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\u001a\u0010\u001e\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001cJ\u001a\u0010\u001f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001cJ\u001a\u0010 \u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b \u0010\u001cJ\u001a\u0010!\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b!\u0010\u001cJ\u001a\u0010\"\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\"\u0010\u001cJÆ\u0001\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\u0012\b\u0002\u0010\n\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\t2\u0012\b\u0002\u0010\u000b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\t2\u0012\b\u0002\u0010\f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\t2\u0012\b\u0002\u0010\r\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\t2\u0012\b\u0002\u0010\u000f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0018\u00010\t2\u0012\b\u0002\u0010\u0010\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0018\u00010\t2\u0012\b\u0002\u0010\u0011\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010&\u001a\u00020%HÖ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b(\u0010\u0015J\u001a\u0010*\u001a\u00020\u000e2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b*\u0010+R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010,\u001a\u0004\b-\u0010\u0015R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010.\u001a\u0004\b/\u0010\u0017R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00100\u001a\u0004\b1\u0010\u0019R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\b\u00100\u001a\u0004\b2\u0010\u0019R!\u0010\n\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u00103\u001a\u0004\b4\u0010\u001cR!\u0010\u000b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u000b\u00103\u001a\u0004\b5\u0010\u001cR!\u0010\f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\f\u00103\u001a\u0004\b6\u0010\u001cR!\u0010\r\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\r\u00103\u001a\u0004\b7\u0010\u001cR!\u0010\u000f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u000f\u00103\u001a\u0004\b8\u0010\u001cR!\u0010\u0010\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u0010\u00103\u001a\u0004\b9\u0010\u001cR!\u0010\u0011\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u0011\u00103\u001a\u0004\b:\u0010\u001cR\u0011\u0010<\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b;\u0010\u0015R\u0011\u0010>\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b=\u0010\u0015R\u0011\u0010@\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b?\u0010\u0015R\u0013\u0010C\u001a\u0004\u0018\u00010\u00068F¢\u0006\u0006\u001a\u0004\bA\u0010BR\u0011\u0010F\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\bD\u0010ER\u0011\u0010H\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\bG\u0010ER\u0011\u0010J\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\bI\u0010E¨\u0006L"}, d2 = {"Lru/ok/android/externcalls/analytics/config/UploadConfig;", "", "", "uploadJobId", "Ljava/util/concurrent/Executor;", "uploadExecutor", "", "maxTimeToUploadMillis", "silenceToUploadMillis", "Lkotlin/Function0;", "maxFileLengthKbProvider", "maxEventCountProvider", "maxLocalCacheFileCountProvider", "timeToUploadNextMsProvider", "", "compressContentProvider", "disableUploadWhenCallIsActiveProvider", "autoDetectFileCompressionProvider", "<init>", "(ILjava/util/concurrent/Executor;JJLcm6;Lcm6;Lcm6;Lcm6;Lcm6;Lcm6;Lcm6;)V", "component1", "()I", "component2", "()Ljava/util/concurrent/Executor;", "component3", "()J", "component4", "component5", "()Lcm6;", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "(ILjava/util/concurrent/Executor;JJLcm6;Lcm6;Lcm6;Lcm6;Lcm6;Lcm6;Lcm6;)Lru/ok/android/externcalls/analytics/config/UploadConfig;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "I", "getUploadJobId", "Ljava/util/concurrent/Executor;", "getUploadExecutor", "J", "getMaxTimeToUploadMillis", "getSilenceToUploadMillis", "Lcm6;", "getMaxFileLengthKbProvider", "getMaxEventCountProvider", "getMaxLocalCacheFileCountProvider", "getTimeToUploadNextMsProvider", "getCompressContentProvider", "getDisableUploadWhenCallIsActiveProvider", "getAutoDetectFileCompressionProvider", "getFileLengthTriggerToUploadBytes", "fileLengthTriggerToUploadBytes", "getEventCountToUploadNumber", "eventCountToUploadNumber", "getMaxLocalCacheFileCount", "maxLocalCacheFileCount", "getTimeToUploadNextMs", "()Ljava/lang/Long;", "timeToUploadNextMs", "getCompressContent", "()Z", "compressContent", "getAutoDetectFileCompression", "autoDetectFileCompression", "getDisableUploadWhenCallIsActive", "disableUploadWhenCallIsActive", "Companion", "calls-sdk-analytics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class UploadConfig {
    public static final boolean DEFAULT_COMPRESS_CONTENT = true;
    public static final boolean DEFAULT_DISABLE_UPLOAD_IN_CALL = true;
    public static final int DEFAULT_LOCAL_FILE_COUNT = 10;
    public static final int DEFAULT_MAX_EVENT_COUNT = 800;
    public static final int DEFAULT_MAX_FILE_SIZE_KB = 100;
    private final cm6 autoDetectFileCompressionProvider;
    private final cm6 compressContentProvider;
    private final cm6 disableUploadWhenCallIsActiveProvider;
    private final cm6 maxEventCountProvider;
    private final cm6 maxFileLengthKbProvider;
    private final cm6 maxLocalCacheFileCountProvider;
    private final long maxTimeToUploadMillis;
    private final long silenceToUploadMillis;
    private final cm6 timeToUploadNextMsProvider;
    private final Executor uploadExecutor;
    private final int uploadJobId;

    public UploadConfig() {
        this(0, null, 0L, 0L, null, null, null, null, null, null, null, 2047, null);
    }

    public static /* synthetic */ UploadConfig copy$default(UploadConfig uploadConfig, int i, Executor executor, long j, long j2, cm6 cm6Var, cm6 cm6Var2, cm6 cm6Var3, cm6 cm6Var4, cm6 cm6Var5, cm6 cm6Var6, cm6 cm6Var7, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = uploadConfig.uploadJobId;
        }
        return uploadConfig.copy(i, (i2 & 2) != 0 ? uploadConfig.uploadExecutor : executor, (i2 & 4) != 0 ? uploadConfig.maxTimeToUploadMillis : j, (i2 & 8) != 0 ? uploadConfig.silenceToUploadMillis : j2, (i2 & 16) != 0 ? uploadConfig.maxFileLengthKbProvider : cm6Var, (i2 & 32) != 0 ? uploadConfig.maxEventCountProvider : cm6Var2, (i2 & 64) != 0 ? uploadConfig.maxLocalCacheFileCountProvider : cm6Var3, (i2 & 128) != 0 ? uploadConfig.timeToUploadNextMsProvider : cm6Var4, (i2 & 256) != 0 ? uploadConfig.compressContentProvider : cm6Var5, (i2 & 512) != 0 ? uploadConfig.disableUploadWhenCallIsActiveProvider : cm6Var6, (i2 & 1024) != 0 ? uploadConfig.autoDetectFileCompressionProvider : cm6Var7);
    }

    /* renamed from: component1, reason: from getter */
    public final int getUploadJobId() {
        return this.uploadJobId;
    }

    /* renamed from: component10, reason: from getter */
    public final cm6 getDisableUploadWhenCallIsActiveProvider() {
        return this.disableUploadWhenCallIsActiveProvider;
    }

    /* renamed from: component11, reason: from getter */
    public final cm6 getAutoDetectFileCompressionProvider() {
        return this.autoDetectFileCompressionProvider;
    }

    /* renamed from: component2, reason: from getter */
    public final Executor getUploadExecutor() {
        return this.uploadExecutor;
    }

    /* renamed from: component3, reason: from getter */
    public final long getMaxTimeToUploadMillis() {
        return this.maxTimeToUploadMillis;
    }

    /* renamed from: component4, reason: from getter */
    public final long getSilenceToUploadMillis() {
        return this.silenceToUploadMillis;
    }

    /* renamed from: component5, reason: from getter */
    public final cm6 getMaxFileLengthKbProvider() {
        return this.maxFileLengthKbProvider;
    }

    /* renamed from: component6, reason: from getter */
    public final cm6 getMaxEventCountProvider() {
        return this.maxEventCountProvider;
    }

    /* renamed from: component7, reason: from getter */
    public final cm6 getMaxLocalCacheFileCountProvider() {
        return this.maxLocalCacheFileCountProvider;
    }

    /* renamed from: component8, reason: from getter */
    public final cm6 getTimeToUploadNextMsProvider() {
        return this.timeToUploadNextMsProvider;
    }

    /* renamed from: component9, reason: from getter */
    public final cm6 getCompressContentProvider() {
        return this.compressContentProvider;
    }

    public final UploadConfig copy(int uploadJobId, Executor uploadExecutor, long maxTimeToUploadMillis, long silenceToUploadMillis, cm6 maxFileLengthKbProvider, cm6 maxEventCountProvider, cm6 maxLocalCacheFileCountProvider, cm6 timeToUploadNextMsProvider, cm6 compressContentProvider, cm6 disableUploadWhenCallIsActiveProvider, cm6 autoDetectFileCompressionProvider) {
        return new UploadConfig(uploadJobId, uploadExecutor, maxTimeToUploadMillis, silenceToUploadMillis, maxFileLengthKbProvider, maxEventCountProvider, maxLocalCacheFileCountProvider, timeToUploadNextMsProvider, compressContentProvider, disableUploadWhenCallIsActiveProvider, autoDetectFileCompressionProvider);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UploadConfig)) {
            return false;
        }
        UploadConfig uploadConfig = (UploadConfig) other;
        return this.uploadJobId == uploadConfig.uploadJobId && fni.a(this.uploadExecutor, uploadConfig.uploadExecutor) && this.maxTimeToUploadMillis == uploadConfig.maxTimeToUploadMillis && this.silenceToUploadMillis == uploadConfig.silenceToUploadMillis && fni.a(this.maxFileLengthKbProvider, uploadConfig.maxFileLengthKbProvider) && fni.a(this.maxEventCountProvider, uploadConfig.maxEventCountProvider) && fni.a(this.maxLocalCacheFileCountProvider, uploadConfig.maxLocalCacheFileCountProvider) && fni.a(this.timeToUploadNextMsProvider, uploadConfig.timeToUploadNextMsProvider) && fni.a(this.compressContentProvider, uploadConfig.compressContentProvider) && fni.a(this.disableUploadWhenCallIsActiveProvider, uploadConfig.disableUploadWhenCallIsActiveProvider) && fni.a(this.autoDetectFileCompressionProvider, uploadConfig.autoDetectFileCompressionProvider);
    }

    public final boolean getAutoDetectFileCompression() {
        Boolean bool;
        cm6 cm6Var = this.autoDetectFileCompressionProvider;
        if (cm6Var == null || (bool = (Boolean) cm6Var.invoke()) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public final cm6 getAutoDetectFileCompressionProvider() {
        return this.autoDetectFileCompressionProvider;
    }

    public final boolean getCompressContent() {
        Boolean bool;
        cm6 cm6Var = this.compressContentProvider;
        if (cm6Var == null || (bool = (Boolean) cm6Var.invoke()) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public final cm6 getCompressContentProvider() {
        return this.compressContentProvider;
    }

    public final boolean getDisableUploadWhenCallIsActive() {
        Boolean bool;
        cm6 cm6Var = this.disableUploadWhenCallIsActiveProvider;
        if (cm6Var == null || (bool = (Boolean) cm6Var.invoke()) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public final cm6 getDisableUploadWhenCallIsActiveProvider() {
        return this.disableUploadWhenCallIsActiveProvider;
    }

    public final int getEventCountToUploadNumber() {
        Integer num;
        cm6 cm6Var = this.maxEventCountProvider;
        return (cm6Var == null || (num = (Integer) cm6Var.invoke()) == null) ? DEFAULT_MAX_EVENT_COUNT : num.intValue();
    }

    public final int getFileLengthTriggerToUploadBytes() {
        Integer num;
        cm6 cm6Var = this.maxFileLengthKbProvider;
        return ((cm6Var == null || (num = (Integer) cm6Var.invoke()) == null) ? 100 : num.intValue()) * 1000;
    }

    public final cm6 getMaxEventCountProvider() {
        return this.maxEventCountProvider;
    }

    public final cm6 getMaxFileLengthKbProvider() {
        return this.maxFileLengthKbProvider;
    }

    public final int getMaxLocalCacheFileCount() {
        Integer num;
        cm6 cm6Var = this.maxLocalCacheFileCountProvider;
        if (cm6Var == null || (num = (Integer) cm6Var.invoke()) == null) {
            return 10;
        }
        return num.intValue();
    }

    public final cm6 getMaxLocalCacheFileCountProvider() {
        return this.maxLocalCacheFileCountProvider;
    }

    public final long getMaxTimeToUploadMillis() {
        return this.maxTimeToUploadMillis;
    }

    public final long getSilenceToUploadMillis() {
        return this.silenceToUploadMillis;
    }

    public final Long getTimeToUploadNextMs() {
        cm6 cm6Var = this.timeToUploadNextMsProvider;
        if (cm6Var != null) {
            return (Long) cm6Var.invoke();
        }
        return null;
    }

    public final cm6 getTimeToUploadNextMsProvider() {
        return this.timeToUploadNextMsProvider;
    }

    public final Executor getUploadExecutor() {
        return this.uploadExecutor;
    }

    public final int getUploadJobId() {
        return this.uploadJobId;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.uploadJobId) * 31;
        Executor executor = this.uploadExecutor;
        int iA = a9h.a(a9h.a((iHashCode + (executor == null ? 0 : executor.hashCode())) * 31, 31, this.maxTimeToUploadMillis), 31, this.silenceToUploadMillis);
        cm6 cm6Var = this.maxFileLengthKbProvider;
        int iHashCode2 = (iA + (cm6Var == null ? 0 : cm6Var.hashCode())) * 31;
        cm6 cm6Var2 = this.maxEventCountProvider;
        int iHashCode3 = (iHashCode2 + (cm6Var2 == null ? 0 : cm6Var2.hashCode())) * 31;
        cm6 cm6Var3 = this.maxLocalCacheFileCountProvider;
        int iHashCode4 = (iHashCode3 + (cm6Var3 == null ? 0 : cm6Var3.hashCode())) * 31;
        cm6 cm6Var4 = this.timeToUploadNextMsProvider;
        int iHashCode5 = (iHashCode4 + (cm6Var4 == null ? 0 : cm6Var4.hashCode())) * 31;
        cm6 cm6Var5 = this.compressContentProvider;
        int iHashCode6 = (iHashCode5 + (cm6Var5 == null ? 0 : cm6Var5.hashCode())) * 31;
        cm6 cm6Var6 = this.disableUploadWhenCallIsActiveProvider;
        int iHashCode7 = (iHashCode6 + (cm6Var6 == null ? 0 : cm6Var6.hashCode())) * 31;
        cm6 cm6Var7 = this.autoDetectFileCompressionProvider;
        return iHashCode7 + (cm6Var7 != null ? cm6Var7.hashCode() : 0);
    }

    public String toString() {
        int i = this.uploadJobId;
        Executor executor = this.uploadExecutor;
        long j = this.maxTimeToUploadMillis;
        long j2 = this.silenceToUploadMillis;
        cm6 cm6Var = this.maxFileLengthKbProvider;
        cm6 cm6Var2 = this.maxEventCountProvider;
        cm6 cm6Var3 = this.maxLocalCacheFileCountProvider;
        cm6 cm6Var4 = this.timeToUploadNextMsProvider;
        cm6 cm6Var5 = this.compressContentProvider;
        cm6 cm6Var6 = this.disableUploadWhenCallIsActiveProvider;
        cm6 cm6Var7 = this.autoDetectFileCompressionProvider;
        StringBuilder sb = new StringBuilder("UploadConfig(uploadJobId=");
        sb.append(i);
        sb.append(", uploadExecutor=");
        sb.append(executor);
        sb.append(", maxTimeToUploadMillis=");
        sb.append(j);
        az1.r(j2, ", silenceToUploadMillis=", ", maxFileLengthKbProvider=", sb);
        sb.append(cm6Var);
        sb.append(", maxEventCountProvider=");
        sb.append(cm6Var2);
        sb.append(", maxLocalCacheFileCountProvider=");
        sb.append(cm6Var3);
        sb.append(", timeToUploadNextMsProvider=");
        sb.append(cm6Var4);
        sb.append(", compressContentProvider=");
        sb.append(cm6Var5);
        sb.append(", disableUploadWhenCallIsActiveProvider=");
        sb.append(cm6Var6);
        sb.append(", autoDetectFileCompressionProvider=");
        sb.append(cm6Var7);
        sb.append(")");
        return sb.toString();
    }

    public UploadConfig(int i, Executor executor, long j, long j2, cm6 cm6Var, cm6 cm6Var2, cm6 cm6Var3, cm6 cm6Var4, cm6 cm6Var5, cm6 cm6Var6, cm6 cm6Var7) {
        this.uploadJobId = i;
        this.uploadExecutor = executor;
        this.maxTimeToUploadMillis = j;
        this.silenceToUploadMillis = j2;
        this.maxFileLengthKbProvider = cm6Var;
        this.maxEventCountProvider = cm6Var2;
        this.maxLocalCacheFileCountProvider = cm6Var3;
        this.timeToUploadNextMsProvider = cm6Var4;
        this.compressContentProvider = cm6Var5;
        this.disableUploadWhenCallIsActiveProvider = cm6Var6;
        this.autoDetectFileCompressionProvider = cm6Var7;
    }

    public /* synthetic */ UploadConfig(int i, Executor executor, long j, long j2, cm6 cm6Var, cm6 cm6Var2, cm6 cm6Var3, cm6 cm6Var4, cm6 cm6Var5, cm6 cm6Var6, cm6 cm6Var7, int i2, tk4 tk4Var) {
        this((i2 & 1) != 0 ? 3815413 : i, (i2 & 2) != 0 ? null : executor, (i2 & 4) != 0 ? BuildConfig.MAX_TIME_TO_UPLOAD : j, (i2 & 8) != 0 ? BuildConfig.SILENCE_TIME_TO_UPLOAD : j2, (i2 & 16) != 0 ? null : cm6Var, (i2 & 32) != 0 ? null : cm6Var2, (i2 & 64) != 0 ? null : cm6Var3, (i2 & 128) != 0 ? null : cm6Var4, (i2 & 256) != 0 ? null : cm6Var5, (i2 & 512) != 0 ? null : cm6Var6, (i2 & 1024) != 0 ? null : cm6Var7);
    }
}
