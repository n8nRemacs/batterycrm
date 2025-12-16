package com.yandex.metrica.impl.ob;

import android.location.Location;
import com.yandex.metrica.j;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.l0, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C38939l0 implements InterfaceC38990n1 {

    /* renamed from: a, reason: collision with root package name */
    private Location f380932a;

    /* renamed from: b, reason: collision with root package name */
    private Boolean f380933b;

    /* renamed from: c, reason: collision with root package name */
    private Boolean f380934c;

    /* renamed from: d, reason: collision with root package name */
    private Boolean f380935d;

    /* renamed from: e, reason: collision with root package name */
    private Map<String, String> f380936e = new LinkedHashMap();

    /* renamed from: f, reason: collision with root package name */
    private Map<String, String> f380937f = new LinkedHashMap();

    /* renamed from: g, reason: collision with root package name */
    @j.P
    private String f380938g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f380939h;

    /* renamed from: i, reason: collision with root package name */
    private T1 f380940i;

    private static boolean a(Object obj) {
        return obj == null;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC38990n1
    public void b(boolean z12) {
        this.f380933b = Boolean.valueOf(z12);
        b();
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC38990n1
    public void c(String str, String str2) {
        this.f380937f.put(str, str2);
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC38990n1
    public void setStatisticsSending(boolean z12) {
        this.f380935d = Boolean.valueOf(z12);
        b();
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC38990n1
    public void setUserProfileID(@j.P String str) {
        this.f380938g = str;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC38990n1
    public void a(boolean z12) {
        this.f380934c = Boolean.valueOf(z12);
        b();
    }

    private void b(@j.P Map<String, String> map, @j.N j.b bVar) {
        if (A2.b(map)) {
            return;
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            bVar.f382350a.withErrorEnvironmentValue(entry.getKey(), entry.getValue());
        }
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC38990n1
    public void a(@j.P Location location) {
        this.f380932a = location;
    }

    public com.yandex.metrica.j a(com.yandex.metrica.j jVar) {
        if (this.f380939h) {
            return jVar;
        }
        j.b bVar = new j.b(jVar.apiKey);
        bVar.f382353d = jVar.f382342a;
        bVar.f382350a.withPreloadInfo(jVar.preloadInfo);
        bVar.f382350a.withLocation(jVar.location);
        List<String> list = jVar.f382343b;
        if (A2.a((Object) list)) {
            bVar.f382351b = list;
        }
        if (A2.a((Object) jVar.appVersion)) {
            bVar.f382350a.withAppVersion(jVar.appVersion);
        }
        Integer num = jVar.f382345d;
        if (A2.a(num)) {
            num.getClass();
            bVar.f382354e = num;
        }
        Integer num2 = jVar.f382344c;
        if (A2.a(num2)) {
            if (num2.intValue() >= 0) {
                bVar.f382352c = num2;
            } else {
                throw new IllegalArgumentException(String.format(Locale.US, "Invalid %1$s. %1$s should be positive.", "App Build Number"));
            }
        }
        Integer num3 = jVar.f382346e;
        if (A2.a(num3)) {
            num3.getClass();
            bVar.f382355f = num3;
        }
        if (A2.a(jVar.logs) && jVar.logs.booleanValue()) {
            bVar.f382350a.withLogs();
        }
        if (A2.a(jVar.sessionTimeout)) {
            bVar.f382350a.withSessionTimeout(jVar.sessionTimeout.intValue());
        }
        if (A2.a(jVar.crashReporting)) {
            bVar.f382350a.withCrashReporting(jVar.crashReporting.booleanValue());
        }
        if (A2.a(jVar.nativeCrashReporting)) {
            bVar.f382350a.withNativeCrashReporting(jVar.nativeCrashReporting.booleanValue());
        }
        if (A2.a(jVar.locationTracking)) {
            bVar.f382350a.withLocationTracking(jVar.locationTracking.booleanValue());
        }
        A2.a((Object) null);
        if (A2.a(jVar.firstActivationAsUpdate)) {
            bVar.f382350a.handleFirstActivationAsUpdate(jVar.firstActivationAsUpdate.booleanValue());
        }
        if (A2.a(jVar.statisticsSending)) {
            bVar.f382350a.withStatisticsSending(jVar.statisticsSending.booleanValue());
        }
        Boolean bool = jVar.f382349h;
        if (A2.a(bool)) {
            bool.getClass();
            bVar.f382358i = bool;
        }
        if (A2.a(jVar.maxReportsInDatabaseCount)) {
            bVar.f382350a.withMaxReportsInDatabaseCount(jVar.maxReportsInDatabaseCount.intValue());
        }
        A2.a((Object) null);
        if (A2.a((Object) jVar.userProfileID)) {
            bVar.f382350a.withUserProfileID(jVar.userProfileID);
        }
        if (A2.a(jVar.revenueAutoTrackingEnabled)) {
            bVar.f382350a.withRevenueAutoTrackingEnabled(jVar.revenueAutoTrackingEnabled.booleanValue());
        }
        if (A2.a(jVar.appOpenTrackingEnabled)) {
            bVar.f382350a.withAppOpenTrackingEnabled(jVar.appOpenTrackingEnabled.booleanValue());
        }
        a(this.f380936e, bVar);
        a(jVar.f382347f, bVar);
        b(this.f380937f, bVar);
        b(jVar.errorEnvironment, bVar);
        Boolean bool2 = this.f380933b;
        if (a(jVar.locationTracking) && A2.a(bool2)) {
            bVar.f382350a.withLocationTracking(bool2.booleanValue());
        }
        Location location = this.f380932a;
        if (a((Object) jVar.location) && A2.a(location)) {
            bVar.f382350a.withLocation(location);
        }
        Boolean bool3 = this.f380935d;
        if (a(jVar.statisticsSending) && A2.a(bool3)) {
            bVar.f382350a.withStatisticsSending(bool3.booleanValue());
        }
        if (!A2.a((Object) jVar.userProfileID) && A2.a((Object) this.f380938g)) {
            bVar.f382350a.withUserProfileID(this.f380938g);
        }
        this.f380939h = true;
        this.f380932a = null;
        this.f380933b = null;
        this.f380935d = null;
        this.f380936e.clear();
        this.f380937f.clear();
        this.f380938g = null;
        return new com.yandex.metrica.j(bVar, null);
    }

    private void b() {
        T1 t12 = this.f380940i;
        if (t12 != null) {
            t12.a(this.f380933b, this.f380935d, this.f380934c);
        }
    }

    private void a(@j.P Map<String, String> map, @j.N j.b bVar) {
        if (A2.b(map)) {
            return;
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            bVar.f382356g.put(entry.getKey(), entry.getValue());
        }
    }

    public void a(T1 t12) {
        this.f380940i = t12;
    }
}
