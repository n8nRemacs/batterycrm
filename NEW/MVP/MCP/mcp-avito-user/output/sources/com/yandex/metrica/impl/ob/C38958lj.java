package com.yandex.metrica.impl.ob;

import com.yandex.metrica.AdRevenue;
import com.yandex.metrica.Revenue;
import com.yandex.metrica.ecommerce.ECommerceEvent;
import com.yandex.metrica.plugins.IPluginReporter;
import com.yandex.metrica.profile.UserProfile;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.lj, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
class C38958lj implements M0 {

    /* renamed from: a, reason: collision with root package name */
    private final C38933kj f380986a = new C38933kj();

    public void a(@j.N H6 h62) {
    }

    @Override // com.yandex.metrica.impl.ob.M0
    public void b() {
    }

    @Override // com.yandex.metrica.IReporter
    @j.N
    public IPluginReporter getPluginExtension() {
        return this.f380986a;
    }

    @Override // com.yandex.metrica.IReporter
    public void reportError(@j.N String str, @j.P String str2) {
    }

    @Override // com.yandex.metrica.IReporter
    public void reportEvent(@j.N String str) {
    }

    public void a(@j.N C39212w6 c39212w6) {
    }

    @Override // com.yandex.metrica.impl.ob.M0, com.yandex.metrica.e
    public void b(@j.P String str, @j.P String str2) {
    }

    @Override // com.yandex.metrica.IReporter
    public void reportError(@j.N String str, @j.P String str2, @j.P Throwable th2) {
    }

    @Override // com.yandex.metrica.IReporter
    public void reportEvent(@j.N String str, @j.P String str2) {
    }

    @Override // com.yandex.metrica.impl.ob.M0
    public void a(@j.N String str, @j.N JSONObject jSONObject) {
    }

    @Override // com.yandex.metrica.IReporter
    public void reportError(@j.N String str, @j.P Throwable th2) {
    }

    @Override // com.yandex.metrica.IReporter
    public void reportEvent(@j.N String str, @j.P Map<String, Object> map) {
    }

    @Override // com.yandex.metrica.IReporter
    public void pauseSession() {
    }

    @Override // com.yandex.metrica.IReporter
    public void resumeSession() {
    }

    @Override // com.yandex.metrica.IReporter
    public void sendEventsBuffer() {
    }

    @Override // com.yandex.metrica.IReporter
    public void reportAdRevenue(@j.N AdRevenue adRevenue) {
    }

    @Override // com.yandex.metrica.IReporter
    public void reportECommerce(@j.N ECommerceEvent eCommerceEvent) {
    }

    @Override // com.yandex.metrica.IReporter
    public void reportRevenue(@j.N Revenue revenue) {
    }

    @Override // com.yandex.metrica.IReporter
    public void reportUnhandledException(@j.N Throwable th2) {
    }

    @Override // com.yandex.metrica.IReporter
    public void reportUserProfile(@j.N UserProfile userProfile) {
    }

    @Override // com.yandex.metrica.IReporter
    public void setStatisticsSending(boolean z12) {
    }

    @Override // com.yandex.metrica.IReporter
    public void setUserProfileID(@j.P String str) {
    }

    @Override // com.yandex.metrica.impl.ob.M0, com.yandex.metrica.e
    public void d(@j.N String str, @j.P String str2) {
    }
}
