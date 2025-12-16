package com.yandex.metrica;

import com.yandex.metrica.YandexMetricaConfig;
import com.yandex.metrica.impl.ob.A2;
import j.N;
import j.P;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes7.dex */
public class j extends YandexMetricaConfig {

    /* renamed from: a, reason: collision with root package name */
    @P
    public final Map<String, String> f382342a;

    /* renamed from: b, reason: collision with root package name */
    @P
    public final List<String> f382343b;

    /* renamed from: c, reason: collision with root package name */
    @P
    public final Integer f382344c;

    /* renamed from: d, reason: collision with root package name */
    @P
    public final Integer f382345d;

    /* renamed from: e, reason: collision with root package name */
    @P
    public final Integer f382346e;

    /* renamed from: f, reason: collision with root package name */
    @P
    public final Map<String, String> f382347f;

    /* renamed from: g, reason: collision with root package name */
    @P
    public final Boolean f382348g;

    /* renamed from: h, reason: collision with root package name */
    @P
    public final Boolean f382349h;

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        @N
        public final YandexMetricaConfig.Builder f382350a;

        /* renamed from: b, reason: collision with root package name */
        @P
        public List<String> f382351b;

        /* renamed from: c, reason: collision with root package name */
        @P
        public Integer f382352c;

        /* renamed from: d, reason: collision with root package name */
        @P
        public Map<String, String> f382353d;

        /* renamed from: e, reason: collision with root package name */
        @P
        public Integer f382354e;

        /* renamed from: f, reason: collision with root package name */
        @P
        public Integer f382355f;

        /* renamed from: g, reason: collision with root package name */
        @N
        public final LinkedHashMap<String, String> f382356g = new LinkedHashMap<>();

        /* renamed from: h, reason: collision with root package name */
        @P
        public Boolean f382357h;

        /* renamed from: i, reason: collision with root package name */
        @P
        public Boolean f382358i;

        public b(@N String str) {
            this.f382350a = YandexMetricaConfig.newConfigBuilder(str);
        }
    }

    public j(b bVar, a aVar) {
        super(bVar.f382350a);
        this.f382344c = bVar.f382352c;
        List<String> list = bVar.f382351b;
        this.f382343b = list == null ? null : A2.c(list);
        Map<String, String> map = bVar.f382353d;
        this.f382342a = map != null ? A2.e(map) : null;
        this.f382346e = bVar.f382355f;
        this.f382345d = bVar.f382354e;
        this.f382347f = A2.e(bVar.f382356g);
        this.f382348g = bVar.f382357h;
        this.f382349h = bVar.f382358i;
    }

    @N
    public static b a(@N YandexMetricaConfig yandexMetricaConfig) {
        b bVar = new b(yandexMetricaConfig.apiKey);
        if (A2.a((Object) yandexMetricaConfig.appVersion)) {
            bVar.f382350a.withAppVersion(yandexMetricaConfig.appVersion);
        }
        if (A2.a(yandexMetricaConfig.sessionTimeout)) {
            bVar.f382350a.withSessionTimeout(yandexMetricaConfig.sessionTimeout.intValue());
        }
        if (A2.a(yandexMetricaConfig.crashReporting)) {
            bVar.f382350a.withCrashReporting(yandexMetricaConfig.crashReporting.booleanValue());
        }
        if (A2.a(yandexMetricaConfig.nativeCrashReporting)) {
            bVar.f382350a.withNativeCrashReporting(yandexMetricaConfig.nativeCrashReporting.booleanValue());
        }
        if (A2.a(yandexMetricaConfig.location)) {
            bVar.f382350a.withLocation(yandexMetricaConfig.location);
        }
        if (A2.a(yandexMetricaConfig.locationTracking)) {
            bVar.f382350a.withLocationTracking(yandexMetricaConfig.locationTracking.booleanValue());
        }
        if (A2.a(yandexMetricaConfig.logs) && yandexMetricaConfig.logs.booleanValue()) {
            bVar.f382350a.withLogs();
        }
        if (A2.a(yandexMetricaConfig.preloadInfo)) {
            bVar.f382350a.withPreloadInfo(yandexMetricaConfig.preloadInfo);
        }
        if (A2.a(yandexMetricaConfig.firstActivationAsUpdate)) {
            bVar.f382350a.handleFirstActivationAsUpdate(yandexMetricaConfig.firstActivationAsUpdate.booleanValue());
        }
        if (A2.a(yandexMetricaConfig.statisticsSending)) {
            bVar.f382350a.withStatisticsSending(yandexMetricaConfig.statisticsSending.booleanValue());
        }
        if (A2.a(yandexMetricaConfig.maxReportsInDatabaseCount)) {
            bVar.f382350a.withMaxReportsInDatabaseCount(yandexMetricaConfig.maxReportsInDatabaseCount.intValue());
        }
        if (A2.a((Object) yandexMetricaConfig.errorEnvironment)) {
            for (Map.Entry<String, String> entry : yandexMetricaConfig.errorEnvironment.entrySet()) {
                bVar.f382350a.withErrorEnvironmentValue(entry.getKey(), entry.getValue());
            }
        }
        if (A2.a((Object) yandexMetricaConfig.userProfileID)) {
            bVar.f382350a.withUserProfileID(yandexMetricaConfig.userProfileID);
        }
        if (A2.a(yandexMetricaConfig.revenueAutoTrackingEnabled)) {
            bVar.f382350a.withRevenueAutoTrackingEnabled(yandexMetricaConfig.revenueAutoTrackingEnabled.booleanValue());
        }
        if (A2.a(yandexMetricaConfig.sessionsAutoTrackingEnabled)) {
            bVar.f382350a.withSessionsAutoTrackingEnabled(yandexMetricaConfig.sessionsAutoTrackingEnabled.booleanValue());
        }
        if (A2.a(yandexMetricaConfig.appOpenTrackingEnabled)) {
            bVar.f382350a.withAppOpenTrackingEnabled(yandexMetricaConfig.appOpenTrackingEnabled.booleanValue());
        }
        if (yandexMetricaConfig instanceof j) {
            List<String> list = ((j) yandexMetricaConfig).f382343b;
            if (A2.a((Object) list)) {
                bVar.f382351b = list;
            }
            A2.a((Object) null);
            A2.a((Object) null);
        }
        return bVar;
    }

    public j(@N YandexMetricaConfig yandexMetricaConfig) {
        super(yandexMetricaConfig);
        this.f382342a = null;
        this.f382344c = null;
        this.f382345d = null;
        this.f382346e = null;
        this.f382347f = null;
        this.f382348g = null;
        this.f382343b = null;
        this.f382349h = null;
    }
}
