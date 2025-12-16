package com.yandex.metrica.impl.ob;

import java.util.Map;

@Deprecated
/* loaded from: classes7.dex */
public class Z1 {

    /* renamed from: a, reason: collision with root package name */
    @j.P
    public final Map<String, String> f379978a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f379979b;

    public Z1(@j.P Map<String, String> map, boolean z12) {
        this.f379978a = map;
        this.f379979b = z12;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("SatelliteClidsInfo{clids=");
        sb2.append(this.f379978a);
        sb2.append(", checked=");
        return androidx.appcompat.app.r.x(sb2, this.f379979b, '}');
    }
}
