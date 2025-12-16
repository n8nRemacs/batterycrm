package com.yandex.metrica;

import com.yandex.metrica.impl.ob.A2;
import com.yandex.metrica.impl.ob.Hn;
import com.yandex.metrica.impl.ob.Ln;
import j.N;
import j.P;

/* loaded from: classes7.dex */
public class ReporterConfig {

    @N
    public final String apiKey;

    @P
    public final Boolean logs;

    @P
    public final Integer maxReportsInDatabaseCount;

    @P
    public final Integer sessionTimeout;

    @P
    public final Boolean statisticsSending;

    @P
    public final String userProfileID;

    public static class Builder {

        /* renamed from: g, reason: collision with root package name */
        public static final Hn f377516g = new Hn(new Ln());

        /* renamed from: a, reason: collision with root package name */
        public final String f377517a;

        /* renamed from: b, reason: collision with root package name */
        @P
        public Integer f377518b;

        /* renamed from: c, reason: collision with root package name */
        @P
        public Boolean f377519c;

        /* renamed from: d, reason: collision with root package name */
        @P
        public Boolean f377520d;

        /* renamed from: e, reason: collision with root package name */
        @P
        public Integer f377521e;

        /* renamed from: f, reason: collision with root package name */
        @P
        public String f377522f;

        public Builder(@N String str) {
            f377516g.a(str);
            this.f377517a = str;
        }

        @N
        public ReporterConfig build() {
            return new ReporterConfig(this);
        }

        @N
        public Builder withLogs() {
            this.f377519c = Boolean.TRUE;
            return this;
        }

        @N
        public Builder withMaxReportsInDatabaseCount(int i12) {
            this.f377521e = Integer.valueOf(i12);
            return this;
        }

        @N
        public Builder withSessionTimeout(int i12) {
            this.f377518b = Integer.valueOf(i12);
            return this;
        }

        @N
        public Builder withStatisticsSending(boolean z12) {
            this.f377520d = Boolean.valueOf(z12);
            return this;
        }

        @N
        public Builder withUserProfileID(@P String str) {
            this.f377522f = str;
            return this;
        }
    }

    public ReporterConfig(@N Builder builder) {
        this.apiKey = builder.f377517a;
        this.sessionTimeout = builder.f377518b;
        this.logs = builder.f377519c;
        this.statisticsSending = builder.f377520d;
        this.maxReportsInDatabaseCount = builder.f377521e;
        this.userProfileID = builder.f377522f;
    }

    public static Builder createBuilderFromConfig(@N ReporterConfig reporterConfig) {
        Builder builderNewConfigBuilder = newConfigBuilder(reporterConfig.apiKey);
        if (A2.a(reporterConfig.sessionTimeout)) {
            builderNewConfigBuilder.withSessionTimeout(reporterConfig.sessionTimeout.intValue());
        }
        if (A2.a(reporterConfig.logs) && reporterConfig.logs.booleanValue()) {
            builderNewConfigBuilder.withLogs();
        }
        if (A2.a(reporterConfig.statisticsSending)) {
            builderNewConfigBuilder.withStatisticsSending(reporterConfig.statisticsSending.booleanValue());
        }
        if (A2.a(reporterConfig.maxReportsInDatabaseCount)) {
            builderNewConfigBuilder.withMaxReportsInDatabaseCount(reporterConfig.maxReportsInDatabaseCount.intValue());
        }
        if (A2.a((Object) reporterConfig.userProfileID)) {
            builderNewConfigBuilder.withUserProfileID(reporterConfig.userProfileID);
        }
        return builderNewConfigBuilder;
    }

    @N
    public static Builder newConfigBuilder(@N String str) {
        return new Builder(str);
    }

    public ReporterConfig(@N ReporterConfig reporterConfig) {
        this.apiKey = reporterConfig.apiKey;
        this.sessionTimeout = reporterConfig.sessionTimeout;
        this.logs = reporterConfig.logs;
        this.statisticsSending = reporterConfig.statisticsSending;
        this.maxReportsInDatabaseCount = reporterConfig.maxReportsInDatabaseCount;
        this.userProfileID = reporterConfig.userProfileID;
    }
}
