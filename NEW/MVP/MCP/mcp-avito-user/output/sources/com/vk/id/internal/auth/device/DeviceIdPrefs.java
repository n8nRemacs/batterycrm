package com.vk.id.internal.auth.device;

import Y61.k;
import android.content.Context;
import android.content.SharedPreferences;
import androidx.compose.runtime.internal.P;
import androidx.preference.s;
import com.vk.id.internal.auth.device.InternalVKIDDeviceIdProvider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: DeviceIdPrefs.kt */
@P
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0010¨\u0006\u0012"}, d2 = {"Lcom/vk/id/internal/auth/device/DeviceIdPrefs;", "Lcom/vk/id/internal/auth/device/InternalVKIDDeviceIdProvider$DeviceIdStorage;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/content/SharedPreferences;", "getPrefs", "(Landroid/content/Context;)Landroid/content/SharedPreferences;", "", "getDeviceId", "()Ljava/lang/String;", "deviceId", "Lkotlin/G0;", "setDeviceId", "(Ljava/lang/String;)V", "Landroid/content/Context;", "Companion", "vkid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DeviceIdPrefs implements InternalVKIDDeviceIdProvider.DeviceIdStorage {

    @k
    private final Context context;

    @k
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: DeviceIdPrefs.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/vk/id/internal/auth/device/DeviceIdPrefs$Companion;", "", "<init>", "()V", "DEVICE_ID", "", "SYSTEM_DEVICE_ID", "DEVICE_TOKEN_PREFIX", "vkid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        private Companion() {
        }
    }

    public DeviceIdPrefs(@k Context context) {
        this.context = context;
    }

    private final SharedPreferences getPrefs(Context context) {
        return context.getSharedPreferences(s.a(context), 0);
    }

    @Override // com.vk.id.internal.auth.device.InternalVKIDDeviceIdProvider.DeviceIdStorage
    @k
    public String getDeviceId() {
        String string = getPrefs(this.context).getString("__vk_device_id__", "");
        return string == null ? "" : string;
    }

    @Override // com.vk.id.internal.auth.device.InternalVKIDDeviceIdProvider.DeviceIdStorage
    public void setDeviceId(@k String deviceId) {
        getPrefs(this.context).edit().putString("__vk_device_id__", deviceId).apply();
    }
}
