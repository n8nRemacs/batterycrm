package com.vk.id.internal.auth.device;

import Y61.k;
import android.annotation.SuppressLint;
import android.content.Context;
import android.provider.Settings;
import android.text.TextUtils;
import androidx.compose.runtime.internal.P;
import com.vk.id.common.InternalVKIDApi;
import com.vk.id.logger.InternalVKIDLog;
import com.vk.id.logger.InternalVKIDLogger;
import java.util.ArrayList;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: InternalVKIDDeviceIdProvider.kt */
@P
@s0
@InternalVKIDApi
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00192\u00020\u0001:\u0002\u001a\u0019B\u0019\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\r\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u0010\u001a\u00020\bH\u0000¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001b"}, d2 = {"Lcom/vk/id/internal/auth/device/InternalVKIDDeviceIdProvider;", "", "Landroid/content/Context;", "context", "Lcom/vk/id/internal/auth/device/InternalVKIDDeviceIdProvider$DeviceIdStorage;", "deviceIdStorage", "<init>", "(Landroid/content/Context;Lcom/vk/id/internal/auth/device/InternalVKIDDeviceIdProvider$DeviceIdStorage;)V", "", "deviceId", "Lkotlin/G0;", "setDeviceId$vkid_release", "(Ljava/lang/String;)V", "setDeviceId", "getDeviceId$vkid_release", "()Ljava/lang/String;", "getDeviceId", "Landroid/content/Context;", "Lcom/vk/id/internal/auth/device/InternalVKIDDeviceIdProvider$DeviceIdStorage;", "Ljava/util/concurrent/locks/ReentrantLock;", "mutex", "Ljava/util/concurrent/locks/ReentrantLock;", "Lcom/vk/id/logger/InternalVKIDLogger;", "logger", "Lcom/vk/id/logger/InternalVKIDLogger;", "Companion", "DeviceIdStorage", "vkid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class InternalVKIDDeviceIdProvider {

    @k
    private final Context context;

    @k
    private final DeviceIdStorage deviceIdStorage;

    /* renamed from: Companion, reason: from kotlin metadata */
    @k
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @k
    private final ReentrantLock mutex = new ReentrantLock();

    @k
    private final InternalVKIDLogger logger = InternalVKIDLog.INSTANCE.createLoggerForTag("InternalVKIDDeviceIdProvider");

    /* compiled from: InternalVKIDDeviceIdProvider.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/vk/id/internal/auth/device/InternalVKIDDeviceIdProvider$Companion;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "findDeviceIdByAndroidId", "(Landroid/content/Context;)Ljava/lang/String;", "DEFAULT_ID", "Ljava/lang/String;", "vkid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        @SuppressLint({"HardwareIds"})
        public final String findDeviceIdByAndroidId(Context context) {
            return Settings.Secure.getString(context.getContentResolver(), "android_id");
        }

        private Companion() {
        }
    }

    /* compiled from: InternalVKIDDeviceIdProvider.kt */
    @InternalVKIDApi
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002H&¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/vk/id/internal/auth/device/InternalVKIDDeviceIdProvider$DeviceIdStorage;", "", "", "getDeviceId", "()Ljava/lang/String;", "deviceId", "Lkotlin/G0;", "setDeviceId", "(Ljava/lang/String;)V", "vkid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface DeviceIdStorage {
        @k
        String getDeviceId();

        void setDeviceId(@k String deviceId);
    }

    public InternalVKIDDeviceIdProvider(@k Context context, @k DeviceIdStorage deviceIdStorage) {
        this.context = context;
        this.deviceIdStorage = deviceIdStorage;
    }

    @k
    public final String getDeviceId$vkid_release() {
        ReentrantLock reentrantLock = this.mutex;
        reentrantLock.lock();
        try {
            String deviceId = this.deviceIdStorage.getDeviceId();
            if (TextUtils.isEmpty(deviceId)) {
                this.logger.debug("nextDeviceId is null or empty: " + deviceId);
                String strFindDeviceIdByAndroidId = INSTANCE.findDeviceIdByAndroidId(this.context);
                ArrayList arrayList = new ArrayList();
                if (TextUtils.isEmpty(strFindDeviceIdByAndroidId)) {
                    strFindDeviceIdByAndroidId = "default";
                }
                arrayList.add(strFindDeviceIdByAndroidId);
                StringBuilder sb2 = new StringBuilder();
                int size = arrayList.size();
                for (int i12 = 0; i12 < size; i12++) {
                    sb2.append((String) arrayList.get(i12));
                    if (i12 < arrayList.size() - 1) {
                        sb2.append(":");
                    }
                }
                deviceId = sb2.toString();
                this.logger.debug("new nextDeviceId: " + deviceId);
                this.deviceIdStorage.setDeviceId(deviceId);
            }
            reentrantLock.unlock();
            return deviceId;
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public final void setDeviceId$vkid_release(@k String deviceId) {
        this.deviceIdStorage.setDeviceId(deviceId);
    }
}
