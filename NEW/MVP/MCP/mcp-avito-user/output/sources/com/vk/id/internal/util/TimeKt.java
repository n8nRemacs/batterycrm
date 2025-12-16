package com.vk.id.internal.util;

import android.os.Build;
import android.os.SystemClock;
import com.vk.id.logger.InternalVKIDLog;
import kotlin.Metadata;

/* compiled from: Time.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\t\n\u0000\u001a\b\u0010\u0000\u001a\u00020\u0001H\u0000¨\u0006\u0002"}, d2 = {"currentTime", "", "vkid_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TimeKt {
    public static final long currentTime() {
        if (Build.VERSION.SDK_INT < 33) {
            return System.currentTimeMillis();
        }
        try {
            return SystemClock.currentNetworkTimeClock().millis();
        } catch (RuntimeException e12) {
            InternalVKIDLog.INSTANCE.createLoggerForTag("com.vk.id.internal.util.currentTime").error("Most likely device was started without access to internet", e12);
            return System.currentTimeMillis();
        }
    }
}
