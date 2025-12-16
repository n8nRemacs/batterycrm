package com.yandex.metrica.impl.ob;

import com.yandex.metrica.AdRevenue;
import com.yandex.metrica.IReporter;
import com.yandex.metrica.Revenue;
import com.yandex.metrica.ecommerce.ECommerceEvent;
import com.yandex.metrica.plugins.IPluginReporter;
import com.yandex.metrica.profile.UserProfile;
import java.util.Map;

/* loaded from: classes7.dex */
public class Zf implements IReporter {

    /* renamed from: b, reason: collision with root package name */
    static final Kn<String> f380001b = new Hn(new Fn("Event name"));

    /* renamed from: c, reason: collision with root package name */
    static final Kn<String> f380002c = new Hn(new Fn("Error message"));

    /* renamed from: d, reason: collision with root package name */
    static final Kn<String> f380003d = new Hn(new Fn("Error identifier"));

    /* renamed from: e, reason: collision with root package name */
    static final Kn<Throwable> f380004e = new Hn(new Gn("Unhandled exception"));

    /* renamed from: f, reason: collision with root package name */
    static final Kn<UserProfile> f380005f = new Hn(new Gn("User profile"));

    /* renamed from: g, reason: collision with root package name */
    static final Kn<Revenue> f380006g = new Hn(new Gn("Revenue"));

    /* renamed from: h, reason: collision with root package name */
    static final Kn<AdRevenue> f380007h = new Hn(new Gn("AdRevenue"));

    /* renamed from: i, reason: collision with root package name */
    static final Kn<ECommerceEvent> f380008i = new Hn(new Gn("ECommerceEvent"));

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final Yf f380009a;

    public Zf() {
        this(new Yf());
    }

    @j.N
    public Yf a() {
        return this.f380009a;
    }

    @Override // com.yandex.metrica.IReporter
    @j.N
    public IPluginReporter getPluginExtension() {
        return this.f380009a;
    }

    @Override // com.yandex.metrica.IReporter
    public void reportAdRevenue(@j.N AdRevenue adRevenue) {
        ((Hn) f380007h).a(adRevenue);
    }

    @Override // com.yandex.metrica.IReporter
    public void reportECommerce(@j.N ECommerceEvent eCommerceEvent) {
        ((Hn) f380008i).a(eCommerceEvent);
    }

    @Override // com.yandex.metrica.IReporter
    public void reportError(@j.N String str, @j.P Throwable th2) {
        ((Hn) f380002c).a(str);
    }

    @Override // com.yandex.metrica.IReporter
    public void reportEvent(@j.N String str) {
        ((Hn) f380001b).a(str);
    }

    @Override // com.yandex.metrica.IReporter
    public void reportRevenue(@j.N Revenue revenue) {
        ((Hn) f380006g).a(revenue);
    }

    @Override // com.yandex.metrica.IReporter
    public void reportUnhandledException(@j.N Throwable th2) {
        ((Hn) f380004e).a(th2);
    }

    @Override // com.yandex.metrica.IReporter
    public void reportUserProfile(@j.N UserProfile userProfile) {
        ((Hn) f380005f).a(userProfile);
    }

    @j.k0
    public Zf(@j.N Yf yf2) {
        this.f380009a = yf2;
    }

    @Override // com.yandex.metrica.IReporter
    public void reportError(@j.N String str, @j.P String str2) {
        ((Hn) f380003d).a(str);
    }

    @Override // com.yandex.metrica.IReporter
    public void reportEvent(@j.N String str, @j.P String str2) {
        ((Hn) f380001b).a(str);
    }

    @Override // com.yandex.metrica.IReporter
    public void reportError(@j.N String str, @j.P String str2, @j.P Throwable th2) {
        ((Hn) f380003d).a(str);
    }

    @Override // com.yandex.metrica.IReporter
    public void reportEvent(@j.N String str, @j.P Map<String, Object> map) {
        ((Hn) f380001b).a(str);
    }

    @Override // com.yandex.metrica.IReporter
    public void pauseSession() {
    }

    @Override // com.yandex.metrica.IReporter
    public void resumeSession() {
    }

    @Override // com.yandex.metrica.IReporter
    public void setStatisticsSending(boolean z12) {
    }

    @Override // com.yandex.metrica.IReporter
    public void setUserProfileID(@j.P String str) {
    }
}
