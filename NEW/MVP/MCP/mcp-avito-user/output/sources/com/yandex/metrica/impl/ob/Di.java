package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.If;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class Di {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final C39215w9 f377981a;

    public Di() {
        this(new C39215w9());
    }

    @j.N
    public Ph a(@j.N JSONObject jSONObject) {
        If.c cVar = new If.c();
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("cache_control");
        if (jSONObjectOptJSONObject != null) {
            Long lA2 = Tl.a(jSONObjectOptJSONObject, "cells_around_ttl", (Long) null);
            TimeUnit timeUnit = TimeUnit.SECONDS;
            cVar.f378344a = Tl.a(lA2, timeUnit, cVar.f378344a);
            cVar.f378345b = Tl.a(Tl.a(jSONObjectOptJSONObject, "wifi_networks_ttl", (Long) null), timeUnit, cVar.f378345b);
            cVar.f378346c = Tl.a(Tl.a(jSONObjectOptJSONObject, "last_known_location_ttl", (Long) null), timeUnit, cVar.f378346c);
            cVar.f378347d = Tl.a(Tl.a(jSONObjectOptJSONObject, "net_interfaces_ttl", (Long) null), timeUnit, cVar.f378347d);
        }
        return this.f377981a.toModel(cVar);
    }

    @j.k0
    public Di(@j.N C39215w9 c39215w9) {
        this.f377981a = c39215w9;
    }
}
