package com.yandex.metrica;

import android.location.Location;
import com.yandex.metrica.impl.ob.A2;
import com.yandex.metrica.impl.ob.C38965m1;
import com.yandex.metrica.impl.ob.Hn;
import com.yandex.metrica.impl.ob.Ln;
import j.N;
import j.P;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes7.dex */
public class YandexMetricaConfig {

    @N
    public final String apiKey;

    @P
    public final Boolean appOpenTrackingEnabled;

    @P
    public final String appVersion;

    @P
    public final Boolean crashReporting;

    @P
    public final Map<String, String> errorEnvironment;

    @P
    public final Boolean firstActivationAsUpdate;

    @P
    public final Location location;

    @P
    public final Boolean locationTracking;

    @P
    public final Boolean logs;

    @P
    public final Integer maxReportsInDatabaseCount;

    @P
    public final Boolean nativeCrashReporting;

    @P
    public final PreloadInfo preloadInfo;

    @P
    public final Boolean revenueAutoTrackingEnabled;

    @P
    public final Integer sessionTimeout;

    @P
    public final Boolean sessionsAutoTrackingEnabled;

    @P
    public final Boolean statisticsSending;

    @P
    public final String userProfileID;

    public static class Builder {

        /* renamed from: r, reason: collision with root package name */
        public static final Hn f377533r = new Hn(new Ln());

        /* renamed from: a, reason: collision with root package name */
        @N
        public final String f377534a;

        /* renamed from: b, reason: collision with root package name */
        @P
        public String f377535b;

        /* renamed from: c, reason: collision with root package name */
        @P
        public Integer f377536c;

        /* renamed from: d, reason: collision with root package name */
        @P
        public Boolean f377537d;

        /* renamed from: e, reason: collision with root package name */
        @P
        public Boolean f377538e;

        /* renamed from: f, reason: collision with root package name */
        @P
        public Location f377539f;

        /* renamed from: g, reason: collision with root package name */
        @P
        public Boolean f377540g;

        /* renamed from: h, reason: collision with root package name */
        @P
        public Boolean f377541h;

        /* renamed from: i, reason: collision with root package name */
        @P
        public PreloadInfo f377542i;

        /* renamed from: j, reason: collision with root package name */
        @P
        public Boolean f377543j;

        /* renamed from: k, reason: collision with root package name */
        @P
        public Boolean f377544k;

        /* renamed from: l, reason: collision with root package name */
        @P
        public Integer f377545l;

        /* renamed from: m, reason: collision with root package name */
        @N
        public final LinkedHashMap<String, String> f377546m = new LinkedHashMap<>();

        /* renamed from: n, reason: collision with root package name */
        @P
        public String f377547n;

        /* renamed from: o, reason: collision with root package name */
        @P
        public Boolean f377548o;

        /* renamed from: p, reason: collision with root package name */
        @P
        public Boolean f377549p;

        /* renamed from: q, reason: collision with root package name */
        @P
        public Boolean f377550q;

        public Builder(@N String str) {
            f377533r.a(str);
            this.f377534a = str;
        }

        @N
        public YandexMetricaConfig build() {
            return new YandexMetricaConfig(this);
        }

        @N
        public Builder handleFirstActivationAsUpdate(boolean z12) {
            this.f377543j = Boolean.valueOf(z12);
            return this;
        }

        @N
        public Builder withAppOpenTrackingEnabled(boolean z12) {
            this.f377550q = Boolean.valueOf(z12);
            return this;
        }

        @N
        public Builder withAppVersion(@P String str) {
            this.f377535b = str;
            return this;
        }

        @N
        public Builder withCrashReporting(boolean z12) {
            this.f377537d = Boolean.valueOf(z12);
            return this;
        }

        @N
        public Builder withErrorEnvironmentValue(@N String str, @P String str2) {
            this.f377546m.put(str, str2);
            return this;
        }

        @N
        public Builder withLocation(@P Location location) {
            this.f377539f = location;
            return this;
        }

        @N
        public Builder withLocationTracking(boolean z12) {
            this.f377540g = Boolean.valueOf(z12);
            return this;
        }

        @N
        public Builder withLogs() {
            this.f377541h = Boolean.TRUE;
            return this;
        }

        @N
        public Builder withMaxReportsInDatabaseCount(int i12) {
            this.f377545l = Integer.valueOf(i12);
            return this;
        }

        @N
        public Builder withNativeCrashReporting(boolean z12) {
            this.f377538e = Boolean.valueOf(z12);
            return this;
        }

        @N
        public Builder withPreloadInfo(@P PreloadInfo preloadInfo) {
            this.f377542i = preloadInfo;
            return this;
        }

        @N
        public Builder withRevenueAutoTrackingEnabled(boolean z12) {
            this.f377548o = Boolean.valueOf(z12);
            return this;
        }

        @N
        public Builder withSessionTimeout(int i12) {
            this.f377536c = Integer.valueOf(i12);
            return this;
        }

        @N
        public Builder withSessionsAutoTrackingEnabled(boolean z12) {
            this.f377549p = Boolean.valueOf(z12);
            return this;
        }

        @N
        public Builder withStatisticsSending(boolean z12) {
            this.f377544k = Boolean.valueOf(z12);
            return this;
        }

        @N
        public Builder withUserProfileID(@P String str) {
            this.f377547n = str;
            return this;
        }
    }

    public YandexMetricaConfig(@N Builder builder) {
        this.apiKey = builder.f377534a;
        this.appVersion = builder.f377535b;
        this.sessionTimeout = builder.f377536c;
        this.crashReporting = builder.f377537d;
        this.nativeCrashReporting = builder.f377538e;
        this.location = builder.f377539f;
        this.locationTracking = builder.f377540g;
        this.logs = builder.f377541h;
        this.preloadInfo = builder.f377542i;
        this.firstActivationAsUpdate = builder.f377543j;
        this.statisticsSending = builder.f377544k;
        this.maxReportsInDatabaseCount = builder.f377545l;
        this.errorEnvironment = A2.e(builder.f377546m);
        this.userProfileID = builder.f377547n;
        this.revenueAutoTrackingEnabled = builder.f377548o;
        this.sessionsAutoTrackingEnabled = builder.f377549p;
        this.appOpenTrackingEnabled = builder.f377550q;
    }

    @N
    public static Builder createBuilderFromConfig(@N YandexMetricaConfig yandexMetricaConfig) {
        Builder builderNewConfigBuilder = newConfigBuilder(yandexMetricaConfig.apiKey);
        if (A2.a((Object) yandexMetricaConfig.appVersion)) {
            builderNewConfigBuilder.withAppVersion(yandexMetricaConfig.appVersion);
        }
        if (A2.a(yandexMetricaConfig.sessionTimeout)) {
            builderNewConfigBuilder.withSessionTimeout(yandexMetricaConfig.sessionTimeout.intValue());
        }
        if (A2.a(yandexMetricaConfig.crashReporting)) {
            builderNewConfigBuilder.withCrashReporting(yandexMetricaConfig.crashReporting.booleanValue());
        }
        if (A2.a(yandexMetricaConfig.nativeCrashReporting)) {
            builderNewConfigBuilder.withNativeCrashReporting(yandexMetricaConfig.nativeCrashReporting.booleanValue());
        }
        if (A2.a(yandexMetricaConfig.location)) {
            builderNewConfigBuilder.withLocation(yandexMetricaConfig.location);
        }
        if (A2.a(yandexMetricaConfig.locationTracking)) {
            builderNewConfigBuilder.withLocationTracking(yandexMetricaConfig.locationTracking.booleanValue());
        }
        if (A2.a(yandexMetricaConfig.logs) && yandexMetricaConfig.logs.booleanValue()) {
            builderNewConfigBuilder.withLogs();
        }
        if (A2.a(yandexMetricaConfig.preloadInfo)) {
            builderNewConfigBuilder.withPreloadInfo(yandexMetricaConfig.preloadInfo);
        }
        if (A2.a(yandexMetricaConfig.firstActivationAsUpdate)) {
            builderNewConfigBuilder.handleFirstActivationAsUpdate(yandexMetricaConfig.firstActivationAsUpdate.booleanValue());
        }
        if (A2.a(yandexMetricaConfig.statisticsSending)) {
            builderNewConfigBuilder.withStatisticsSending(yandexMetricaConfig.statisticsSending.booleanValue());
        }
        if (A2.a(yandexMetricaConfig.maxReportsInDatabaseCount)) {
            builderNewConfigBuilder.withMaxReportsInDatabaseCount(yandexMetricaConfig.maxReportsInDatabaseCount.intValue());
        }
        if (A2.a((Object) yandexMetricaConfig.errorEnvironment)) {
            for (Map.Entry<String, String> entry : yandexMetricaConfig.errorEnvironment.entrySet()) {
                builderNewConfigBuilder.withErrorEnvironmentValue(entry.getKey(), entry.getValue());
            }
        }
        if (A2.a((Object) yandexMetricaConfig.userProfileID)) {
            builderNewConfigBuilder.withUserProfileID(yandexMetricaConfig.userProfileID);
        }
        if (A2.a(yandexMetricaConfig.revenueAutoTrackingEnabled)) {
            builderNewConfigBuilder.withRevenueAutoTrackingEnabled(yandexMetricaConfig.revenueAutoTrackingEnabled.booleanValue());
        }
        if (A2.a(yandexMetricaConfig.sessionsAutoTrackingEnabled)) {
            builderNewConfigBuilder.withSessionsAutoTrackingEnabled(yandexMetricaConfig.sessionsAutoTrackingEnabled.booleanValue());
        }
        if (A2.a(yandexMetricaConfig.appOpenTrackingEnabled)) {
            builderNewConfigBuilder.withAppOpenTrackingEnabled(yandexMetricaConfig.appOpenTrackingEnabled.booleanValue());
        }
        return builderNewConfigBuilder;
    }

    public static YandexMetricaConfig fromJson(String str) {
        return new C38965m1().a(str);
    }

    @N
    public static Builder newConfigBuilder(@N String str) {
        return new Builder(str);
    }

    public String toJson() {
        return new C38965m1().a(this);
    }

    public YandexMetricaConfig(@N YandexMetricaConfig yandexMetricaConfig) {
        this.apiKey = yandexMetricaConfig.apiKey;
        this.appVersion = yandexMetricaConfig.appVersion;
        this.sessionTimeout = yandexMetricaConfig.sessionTimeout;
        this.crashReporting = yandexMetricaConfig.crashReporting;
        this.nativeCrashReporting = yandexMetricaConfig.nativeCrashReporting;
        this.location = yandexMetricaConfig.location;
        this.locationTracking = yandexMetricaConfig.locationTracking;
        this.logs = yandexMetricaConfig.logs;
        this.preloadInfo = yandexMetricaConfig.preloadInfo;
        this.firstActivationAsUpdate = yandexMetricaConfig.firstActivationAsUpdate;
        this.statisticsSending = yandexMetricaConfig.statisticsSending;
        this.maxReportsInDatabaseCount = yandexMetricaConfig.maxReportsInDatabaseCount;
        this.errorEnvironment = yandexMetricaConfig.errorEnvironment;
        this.userProfileID = yandexMetricaConfig.userProfileID;
        this.revenueAutoTrackingEnabled = yandexMetricaConfig.revenueAutoTrackingEnabled;
        this.sessionsAutoTrackingEnabled = yandexMetricaConfig.sessionsAutoTrackingEnabled;
        this.appOpenTrackingEnabled = yandexMetricaConfig.appOpenTrackingEnabled;
    }
}
