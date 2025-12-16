package com.yandex.metrica;

import com.yandex.metrica.ReporterConfig;
import com.yandex.metrica.impl.ob.A2;
import j.N;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes7.dex */
public class f extends ReporterConfig {

    /* renamed from: a, reason: collision with root package name */
    public final Map<String, String> f377689a;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final ReporterConfig.Builder f377690a;

        /* renamed from: b, reason: collision with root package name */
        public final LinkedHashMap<String, String> f377691b = new LinkedHashMap<>();

        public a(String str) {
            this.f377690a = ReporterConfig.newConfigBuilder(str);
        }
    }

    public f(@N a aVar) {
        super(aVar.f377690a);
        LinkedHashMap<String, String> linkedHashMap = aVar.f377691b;
        this.f377689a = linkedHashMap == null ? null : A2.e(linkedHashMap);
    }

    public f(ReporterConfig reporterConfig) {
        super(reporterConfig);
        if (reporterConfig instanceof f) {
            this.f377689a = ((f) reporterConfig).f377689a;
        } else {
            this.f377689a = null;
        }
    }
}
