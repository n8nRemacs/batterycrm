package com.yandex.metrica.impl.ob;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.webkit.WebView;
import com.yandex.metrica.AppMetricaDeviceIDListener;
import com.yandex.metrica.DeferredDeeplinkListener;
import com.yandex.metrica.DeferredDeeplinkParametersListener;
import com.yandex.metrica.ReporterConfig;
import com.yandex.metrica.YandexMetricaConfig;

/* loaded from: classes7.dex */
public class Xf extends C38681ag {

    /* renamed from: j, reason: collision with root package name */
    private static final Kn<YandexMetricaConfig> f379910j = new Hn(new Gn("Config"));

    /* renamed from: k, reason: collision with root package name */
    private static final Kn<String> f379911k = new Hn(new Fn("Native crash"));

    /* renamed from: l, reason: collision with root package name */
    private static final Kn<Activity> f379912l = new Hn(new Gn("Activity"));

    /* renamed from: m, reason: collision with root package name */
    private static final Kn<Intent> f379913m = new Hn(new Gn("Intent"));

    /* renamed from: n, reason: collision with root package name */
    private static final Kn<Application> f379914n = new Hn(new Gn("Application"));

    /* renamed from: o, reason: collision with root package name */
    private static final Kn<Context> f379915o = new Hn(new Gn("Context"));

    /* renamed from: p, reason: collision with root package name */
    private static final Kn<Object> f379916p = new Hn(new Gn("Deeplink listener"));

    /* renamed from: q, reason: collision with root package name */
    private static final Kn<AppMetricaDeviceIDListener> f379917q = new Hn(new Gn("DeviceID listener"));

    /* renamed from: r, reason: collision with root package name */
    private static final Kn<ReporterConfig> f379918r = new Hn(new Gn("Reporter Config"));

    /* renamed from: s, reason: collision with root package name */
    private static final Kn<String> f379919s = new Hn(new Fn("Deeplink"));

    /* renamed from: t, reason: collision with root package name */
    private static final Kn<String> f379920t = new Hn(new Fn("Referral url"));

    /* renamed from: u, reason: collision with root package name */
    private static final Kn<String> f379921u = new Hn(new Ln());

    /* renamed from: v, reason: collision with root package name */
    private static final Kn<String> f379922v = new Hn(new Gn("Key"));

    /* renamed from: w, reason: collision with root package name */
    private static final Kn<WebView> f379923w = new Hn(new Gn("WebView"));

    /* renamed from: x, reason: collision with root package name */
    private static final Kn<String> f379924x = new Fn("value");

    /* renamed from: y, reason: collision with root package name */
    private static final Kn<String> f379925y = new Fn("name");

    public void a(@j.N Application application) {
        ((Hn) f379914n).a(application);
    }

    public void b(@j.N Context context) {
        ((Hn) f379915o).a(context);
    }

    public void c(String str) {
        ((Hn) f379911k).a(str);
    }

    public void d(@j.N String str) {
        ((Hn) f379922v).a(str);
    }

    public void e(@j.N String str) {
        ((Hn) f379919s).a(str);
    }

    public boolean f(@j.P String str) {
        return ((Fn) f379925y).a(str).b();
    }

    public boolean g(@j.P String str) {
        return ((Fn) f379924x).a(str).b();
    }

    public void a(@j.N Intent intent) {
        ((Hn) f379913m).a(intent);
    }

    public void c(@j.N Activity activity) {
        ((Hn) f379912l).a(activity);
    }

    public void a(@j.N String str) {
        ((Hn) f379920t).a(str);
    }

    public void a(@j.N Context context) {
        ((Hn) f379915o).a(context);
    }

    public void a(@j.N DeferredDeeplinkParametersListener deferredDeeplinkParametersListener) {
        ((Hn) f379916p).a(deferredDeeplinkParametersListener);
    }

    public void a(@j.N DeferredDeeplinkListener deferredDeeplinkListener) {
        ((Hn) f379916p).a(deferredDeeplinkListener);
    }

    public void a(@j.N AppMetricaDeviceIDListener appMetricaDeviceIDListener) {
        ((Hn) f379917q).a(appMetricaDeviceIDListener);
    }

    public void a(@j.N Context context, @j.N String str) {
        ((Hn) f379915o).a(context);
        ((Hn) f379921u).a(str);
    }

    public void a(@j.N Context context, @j.N ReporterConfig reporterConfig) {
        ((Hn) f379915o).a(context);
        ((Hn) f379918r).a(reporterConfig);
    }

    public void a(@j.N Context context, @j.N YandexMetricaConfig yandexMetricaConfig) {
        ((Hn) f379915o).a(context);
        ((Hn) f379910j).a(yandexMetricaConfig);
    }

    public void a(@j.P WebView webView) {
        ((Hn) f379923w).a(webView);
    }
}
