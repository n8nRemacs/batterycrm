package com.vk.id.analytics.stat;

import Y61.k;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: AnalyticsStorage.kt */
@s0
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0000\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0018\u0010\u0006\u001a\n \b*\u0004\u0018\u00010\u00070\u0007X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\tR$\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000b8F@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lcom/vk/id/analytics/stat/AnalyticsStorage;", "", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "prefs", "Landroid/content/SharedPreferences;", "kotlin.jvm.PlatformType", "Landroid/content/SharedPreferences;", "value", "", "externalDeviceId", "getExternalDeviceId", "()Ljava/lang/String;", "setExternalDeviceId", "(Ljava/lang/String;)V", "Companion", "analytics_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class AnalyticsStorage {
    private final SharedPreferences prefs;

    public AnalyticsStorage(@k Context context) {
        this.prefs = PreferenceManager.getDefaultSharedPreferences(context);
    }

    @k
    public final String getExternalDeviceId() {
        String string = this.prefs.getString("KEY_EXTERNAL_DEVICE_ID", null);
        if (string != null) {
            return string;
        }
        String string2 = UUID.randomUUID().toString();
        setExternalDeviceId(string2);
        return string2;
    }

    @SuppressLint({"ApplySharedPref", "UseKtx"})
    public final void setExternalDeviceId(@k String str) {
        this.prefs.edit().putString("KEY_EXTERNAL_DEVICE_ID", str).commit();
    }
}
