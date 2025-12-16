package com.yandex.mobile.ads.impl;

import com.yandex.metrica.IReporter;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.C42756l;

/* loaded from: classes8.dex */
public final class mg0 implements ny0 {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    private static final Object f387997b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f387998c = 0;

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    private final IReporter f387999a;

    public static final class a {
        @Y61.k
        public static Object a() {
            return mg0.f387997b;
        }
    }

    public mg0(@Y61.l IReporter iReporter) {
        this.f387999a = iReporter;
    }

    @Override // com.yandex.mobile.ads.impl.ny0
    public final void a(@Y61.k ky0 ky0Var) {
        if (this.f387999a != null) {
            String strB = ky0Var.b();
            Map<String, Object> mapA = ky0Var.a();
            try {
                a(mapA);
                this.f387999a.reportEvent(strB, mapA);
            } catch (Throwable unused) {
            }
        }
    }

    private static void a(Map map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.collections.P0.f(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey(), C42756l.j(new Object[]{entry.getValue()}));
        }
        linkedHashMap.toString();
    }
}
