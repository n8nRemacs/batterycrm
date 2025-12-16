package com.yandex.metrica;

import com.yandex.metrica.ecommerce.ECommerceEvent;
import com.yandex.metrica.plugins.IPluginReporter;
import com.yandex.metrica.profile.UserProfile;
import j.N;
import j.P;
import java.util.Map;

/* loaded from: classes7.dex */
public interface IReporter {
    @N
    IPluginReporter getPluginExtension();

    void pauseSession();

    void reportAdRevenue(@N AdRevenue adRevenue);

    void reportECommerce(@N ECommerceEvent eCommerceEvent);

    void reportError(@N String str, @P String str2);

    void reportError(@N String str, @P String str2, @P Throwable th2);

    void reportError(@N String str, @P Throwable th2);

    void reportEvent(@N String str);

    void reportEvent(@N String str, @P String str2);

    void reportEvent(@N String str, @P Map<String, Object> map);

    void reportRevenue(@N Revenue revenue);

    void reportUnhandledException(@N Throwable th2);

    void reportUserProfile(@N UserProfile userProfile);

    void resumeSession();

    void sendEventsBuffer();

    void setStatisticsSending(boolean z12);

    void setUserProfileID(@P String str);
}
