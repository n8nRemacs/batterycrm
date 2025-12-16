package com.yandex.mobile.ads.impl;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.C42745f0;

/* loaded from: classes8.dex */
public final class a4 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final Object f383398a = new Object();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    private final ls0 f383399b = new ls0();

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    private final LinkedHashMap f383400c = new LinkedHashMap();

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    private final ArrayList f383401d = new ArrayList();

    public final void a(@Y61.k n7 n7Var) {
        a(z3.f392161a, n7Var, null);
    }

    @Y61.k
    public final List<y3> b() {
        List<y3> listM0;
        synchronized (this.f383398a) {
            listM0 = C42745f0.M0(this.f383401d);
        }
        return listM0;
    }

    public final void a(@Y61.k z3 z3Var, @Y61.l Object obj) {
        synchronized (this.f383398a) {
            try {
                Map linkedHashMap = (Map) this.f383400c.get(z3Var);
                if (linkedHashMap == null) {
                    linkedHashMap = new LinkedHashMap();
                }
                this.f383400c.put(z3Var, linkedHashMap);
                linkedHashMap.put(obj, Long.valueOf(SystemClock.elapsedRealtime()));
                kotlin.G0 g02 = kotlin.G0.f406611a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void b(@Y61.k z3 z3Var) {
        a(z3Var, null);
    }

    public final void a(@Y61.k z3 z3Var) {
        a(z3Var, this.f383399b, null);
    }

    public final void a(@Y61.k z3 z3Var, @Y61.k ms0 ms0Var, @Y61.l md1 md1Var) {
        Long l12;
        synchronized (this.f383398a) {
            try {
                Map map = (Map) this.f383400c.get(z3Var);
                Long lValueOf = (map == null || (l12 = (Long) map.get(md1Var)) == null) ? null : Long.valueOf(SystemClock.elapsedRealtime() - l12.longValue());
                if (lValueOf != null) {
                    this.f383401d.add(new y3(z3Var, ms0Var.a(lValueOf.longValue())));
                }
                Map map2 = (Map) this.f383400c.get(z3Var);
                if (map2 != null) {
                }
                kotlin.G0 g02 = kotlin.G0.f406611a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void a() {
        synchronized (this.f383398a) {
            this.f383400c.clear();
            this.f383401d.clear();
            kotlin.G0 g02 = kotlin.G0.f406611a;
        }
    }
}
