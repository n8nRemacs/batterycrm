package com.yandex.metrica.impl.ob;

import android.app.Activity;
import android.location.Location;
import com.yandex.metrica.AdRevenue;
import com.yandex.metrica.Revenue;
import com.yandex.metrica.ecommerce.ECommerceEvent;
import com.yandex.metrica.impl.ob.C39062q;
import com.yandex.metrica.plugins.PluginErrorDetails;
import com.yandex.metrica.profile.UserProfile;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.jj, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C38908jj extends C38958lj implements K0 {
    @Override // com.yandex.metrica.impl.ob.I0
    public void a(int i12, @j.P String str, @j.P String str2, @j.P Map<String, String> map, @j.P Map<String, byte[]> map2) {
    }

    @Override // com.yandex.metrica.impl.ob.C38958lj, com.yandex.metrica.impl.ob.M0
    public void b() {
    }

    @Override // com.yandex.metrica.impl.ob.I0
    public void c(@j.P String str) {
    }

    @Override // com.yandex.metrica.plugins.IPluginReporter
    public void reportError(@j.N PluginErrorDetails pluginErrorDetails, @j.P String str) {
    }

    @Override // com.yandex.metrica.impl.ob.C38958lj, com.yandex.metrica.IReporter
    public void reportEvent(@j.N String str) {
    }

    @Override // com.yandex.metrica.plugins.IPluginReporter
    public void reportUnhandledException(@j.N PluginErrorDetails pluginErrorDetails) {
    }

    @Override // com.yandex.metrica.impl.ob.K0
    public void a(@j.P Activity activity) {
    }

    @Override // com.yandex.metrica.impl.ob.K0
    public void b(@j.P Activity activity) {
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC38990n1
    public void c(String str, String str2) {
    }

    @Override // com.yandex.metrica.impl.ob.C38958lj, com.yandex.metrica.IReporter
    public void reportError(@j.N String str, @j.P String str2) {
    }

    @Override // com.yandex.metrica.impl.ob.C38958lj, com.yandex.metrica.IReporter
    public void reportEvent(@j.N String str, @j.P String str2) {
    }

    @Override // com.yandex.metrica.impl.ob.C38958lj, com.yandex.metrica.IReporter
    public void reportUnhandledException(@j.N Throwable th2) {
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC38990n1
    public void a(@j.P Location location) {
    }

    @Override // com.yandex.metrica.impl.ob.I0
    public void b(@j.N String str) {
    }

    @Override // com.yandex.metrica.plugins.IPluginReporter
    public void reportError(@j.N String str, @j.P String str2, @j.P PluginErrorDetails pluginErrorDetails) {
    }

    @Override // com.yandex.metrica.impl.ob.C38958lj, com.yandex.metrica.IReporter
    public void reportEvent(@j.N String str, @j.P Map map) {
    }

    @Override // com.yandex.metrica.impl.ob.K0
    public void a(@j.N D2 d22) {
    }

    @Override // com.yandex.metrica.impl.ob.C38958lj, com.yandex.metrica.impl.ob.M0, com.yandex.metrica.e
    public void b(@j.P String str, @j.P String str2) {
    }

    @Override // com.yandex.metrica.impl.ob.C38958lj, com.yandex.metrica.IReporter
    public void reportError(@j.N String str, @j.P String str2, @j.P Throwable th2) {
    }

    @Override // com.yandex.metrica.impl.ob.C38958lj, com.yandex.metrica.impl.ob.R0
    public void a(@j.N H6 h62) {
    }

    @Override // com.yandex.metrica.impl.ob.El
    public void b(@j.N JSONObject jSONObject) {
    }

    @Override // com.yandex.metrica.impl.ob.C38958lj, com.yandex.metrica.IReporter
    public void reportError(@j.N String str, @j.P Throwable th2) {
    }

    @Override // com.yandex.metrica.impl.ob.K0
    public void a(@j.N C39062q.c cVar) {
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC38990n1
    public void b(boolean z12) {
    }

    @Override // com.yandex.metrica.impl.ob.C38958lj, com.yandex.metrica.impl.ob.R0
    public void a(@j.N C39212w6 c39212w6) {
    }

    @Override // com.yandex.metrica.impl.ob.K0
    public void a(@j.N String str) {
    }

    @Override // com.yandex.metrica.impl.ob.I0
    public void a(@j.N String str, @j.P String str2) {
    }

    @Override // com.yandex.metrica.impl.ob.C38958lj, com.yandex.metrica.impl.ob.M0
    public void a(@j.N String str, @j.N JSONObject jSONObject) {
    }

    @Override // com.yandex.metrica.impl.ob.K0
    public void a(@j.N String str, boolean z12) {
    }

    @Override // com.yandex.metrica.impl.ob.I0
    public void a(String str, byte[] bArr) {
    }

    @Override // com.yandex.metrica.impl.ob.El
    public void a(@j.N JSONObject jSONObject) {
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC38990n1
    public void a(boolean z12) {
    }

    @Override // com.yandex.metrica.impl.ob.K0
    public void a(@j.N InterfaceC38960ll interfaceC38960ll, boolean z12) {
        interfaceC38960ll.onError("Device user is in locked state");
    }

    @Override // com.yandex.metrica.impl.ob.C38958lj, com.yandex.metrica.IReporter
    public void pauseSession() {
    }

    @Override // com.yandex.metrica.impl.ob.C38958lj, com.yandex.metrica.IReporter
    public void resumeSession() {
    }

    @Override // com.yandex.metrica.impl.ob.C38958lj, com.yandex.metrica.IReporter
    public void sendEventsBuffer() {
    }

    @Override // com.yandex.metrica.impl.ob.C38958lj, com.yandex.metrica.IReporter
    public void reportAdRevenue(@j.N AdRevenue adRevenue) {
    }

    @Override // com.yandex.metrica.impl.ob.C38958lj, com.yandex.metrica.IReporter
    public void reportECommerce(@j.N ECommerceEvent eCommerceEvent) {
    }

    @Override // com.yandex.metrica.impl.ob.C38958lj, com.yandex.metrica.IReporter
    public void reportRevenue(@j.N Revenue revenue) {
    }

    @Override // com.yandex.metrica.impl.ob.C38958lj, com.yandex.metrica.IReporter
    public void reportUserProfile(@j.N UserProfile userProfile) {
    }

    @Override // com.yandex.metrica.impl.ob.C38958lj, com.yandex.metrica.IReporter
    public void setStatisticsSending(boolean z12) {
    }

    @Override // com.yandex.metrica.impl.ob.C38958lj, com.yandex.metrica.IReporter
    public void setUserProfileID(@j.P String str) {
    }

    @Override // com.yandex.metrica.impl.ob.C38958lj, com.yandex.metrica.impl.ob.M0, com.yandex.metrica.e
    public void d(@j.N String str, @j.P String str2) {
    }
}
