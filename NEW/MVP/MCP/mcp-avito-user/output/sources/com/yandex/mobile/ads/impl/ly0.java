package com.yandex.mobile.ads.impl;

import java.util.List;
import java.util.Map;

/* loaded from: classes8.dex */
public final class ly0 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final Map<String, Object> f387782a;

    public ly0(@j.N Map<String, Object> map) {
        this.f387782a = map;
    }

    public final void a(@j.P List list) {
        if (list == null || list.size() <= 0) {
            return;
        }
        this.f387782a.put("active_experiments", list);
    }

    public final void b(@j.P Object obj, @j.N String str) {
        if (obj == null) {
            a(str);
        } else {
            this.f387782a.put(str, obj);
        }
    }

    public final void a(@j.P Object obj, @j.N String str) {
        if (obj != null) {
            this.f387782a.put(str, obj);
        }
    }

    public final void a(@j.N String str) {
        this.f387782a.put(str, "undefined");
    }

    public final void a(@j.N Map<String, Object> map) {
        this.f387782a.putAll(map);
    }

    @j.N
    public final Map<String, Object> a() {
        return this.f387782a;
    }
}
