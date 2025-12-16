package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.ky0;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes8.dex */
public final class yj0 implements ky0.a {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final String f392017a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final String f392018b;

    /* renamed from: c, reason: collision with root package name */
    @j.P
    private final ky0.a f392019c;

    public yj0(@j.N String str, @j.N String str2, @j.P ky0.a aVar) {
        this.f392017a = str;
        this.f392018b = str2;
        this.f392019c = aVar;
    }

    @Override // com.yandex.mobile.ads.impl.ky0.a
    @j.N
    public final Map<String, Object> a() {
        HashMap map = new HashMap();
        map.put("asset_name", this.f392017a);
        map.put("action_type", this.f392018b);
        ky0.a aVar = this.f392019c;
        if (aVar != null) {
            map.putAll(aVar.a());
        }
        return map;
    }
}
