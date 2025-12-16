package com.yandex.metrica;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.webkit.WebView;
import com.yandex.metrica.ecommerce.ECommerceEvent;
import com.yandex.metrica.impl.ob.Vf;
import com.yandex.metrica.impl.ob.W2;
import com.yandex.metrica.plugins.YandexMetricaPlugins;
import com.yandex.metrica.profile.UserProfile;
import j.K;
import j.N;
import j.P;
import java.util.Map;

/* loaded from: classes7.dex */
public final class YandexMetrica {
    public static void activate(@N Context context, @N YandexMetricaConfig yandexMetricaConfig) {
        Vf.a().a(context, yandexMetricaConfig);
    }

    public static void activateReporter(@N Context context, @N ReporterConfig reporterConfig) {
        Vf.a().a(context, reporterConfig);
    }

    public static void enableActivityAutoTracking(@N Application application) {
        Vf.a().a(application);
    }

    public static int getLibraryApiLevel() {
        return 106;
    }

    @N
    public static String getLibraryVersion() {
        return "5.3.0";
    }

    @N
    public static YandexMetricaPlugins getPluginExtension() {
        return W2.a();
    }

    @N
    public static IReporter getReporter(@N Context context, @N String str) {
        return Vf.a().a(context, str);
    }

    @K
    public static void initWebViewReporting(@N WebView webView) {
        Vf.a().a(webView);
    }

    public static void pauseSession(@P Activity activity) {
        Vf.a().a(activity);
    }

    public static void putErrorEnvironmentValue(@N String str, @P String str2) {
        Vf.a().a(str, str2);
    }

    public static void reportAdRevenue(@N AdRevenue adRevenue) {
        Vf.a().a(adRevenue);
    }

    public static void reportAppOpen(@N Activity activity) {
        Vf.a().b(activity);
    }

    public static void reportECommerce(@N ECommerceEvent eCommerceEvent) {
        Vf.a().a(eCommerceEvent);
    }

    public static void reportError(@N String str, @P Throwable th2) {
        Vf.a().a(str, th2);
    }

    public static void reportEvent(@N String str) {
        Vf.a().b(str);
    }

    @Deprecated
    public static void reportNativeCrash(@N String str) {
        Vf.a().d(str);
    }

    public static void reportReferralUrl(@N String str) {
        Vf.a().e(str);
    }

    public static void reportRevenue(@N Revenue revenue) {
        Vf.a().a(revenue);
    }

    public static void reportUnhandledException(@N Throwable th2) {
        Vf.a().a(th2);
    }

    public static void reportUserProfile(@N UserProfile userProfile) {
        Vf.a().a(userProfile);
    }

    public static void requestAppMetricaDeviceID(@N AppMetricaDeviceIDListener appMetricaDeviceIDListener) {
        Vf.a().a(appMetricaDeviceIDListener);
    }

    public static void requestDeferredDeeplink(@N DeferredDeeplinkListener deferredDeeplinkListener) {
        Vf.a().a(deferredDeeplinkListener);
    }

    public static void requestDeferredDeeplinkParameters(@N DeferredDeeplinkParametersListener deferredDeeplinkParametersListener) {
        Vf.a().a(deferredDeeplinkParametersListener);
    }

    public static void resumeSession(@P Activity activity) {
        Vf.a().c(activity);
    }

    public static void sendEventsBuffer() {
        Vf.a().i();
    }

    public static void setLocation(@P Location location) {
        Vf.a().a(location);
    }

    public static void setLocationTracking(boolean z12) {
        Vf.a().a(z12);
    }

    public static void setStatisticsSending(@N Context context, boolean z12) {
        Vf.a().b(context, z12);
    }

    public static void setUserProfileID(@P String str) {
        Vf.a().f(str);
    }

    public static void reportAppOpen(@N String str) {
        Vf.a().a(str);
    }

    public static void reportError(@N String str, @P String str2) {
        Vf.a().a(str, str2, null);
    }

    public static void reportEvent(@N String str, @P String str2) {
        Vf.a().b(str, str2);
    }

    public static void setLocationTracking(@N Context context, boolean z12) {
        Vf.a().a(context, z12);
    }

    public static void reportAppOpen(@N Intent intent) {
        Vf.a().a(intent);
    }

    public static void reportError(@N String str, @P String str2, @P Throwable th2) {
        Vf.a().a(str, str2, th2);
    }

    public static void reportEvent(@N String str, @P Map<String, Object> map) {
        Vf.a().a(str, map);
    }
}
