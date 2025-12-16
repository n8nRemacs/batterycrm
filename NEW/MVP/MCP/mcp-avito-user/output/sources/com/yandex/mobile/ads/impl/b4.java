package com.yandex.mobile.ads.impl;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* loaded from: classes8.dex */
public final class b4 {

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private static final Map<z3, String> f383779b = new a();

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final a4 f383780a;

    public class a extends HashMap<z3, String> {
        public a() {
            put(z3.f392163c, "ad_loading_duration");
            put(z3.f392167g, "identifiers_loading_duration");
            put(z3.f392162b, "advertising_info_loading_duration");
            put(z3.f392165e, "autograb_loading_duration");
            put(z3.f392166f, "bidding_data_loading_duration");
            put(z3.f392170j, "network_request_durations");
            put(z3.f392168h, "image_loading_duration");
            put(z3.f392169i, "video_caching_duration");
            put(z3.f392161a, "adapter_loading_duration");
            put(z3.f392171k, "vast_loading_durations");
            put(z3.f392174n, "vmap_loading_duration");
        }
    }

    public b4(@j.N a4 a4Var) {
        this.f383780a = a4Var;
    }

    @j.N
    public final HashMap a() {
        HashMap map = new HashMap();
        for (y3 y3Var : this.f383780a.b()) {
            String str = (String) ((HashMap) f383779b).get(y3Var.a());
            if (str != null) {
                List list = (List) map.get(str);
                if (list != null) {
                    list.add(y3Var.b());
                } else {
                    LinkedList linkedList = new LinkedList();
                    linkedList.add(y3Var.b());
                    map.put(str, linkedList);
                }
            }
        }
        HashMap map2 = new HashMap();
        map2.put("durations", map);
        return map2;
    }

    @j.N
    public final Map<String, Object> b() {
        ly0 ly0Var = new ly0(new HashMap());
        for (y3 y3Var : this.f383780a.b()) {
            if (y3Var.a().ordinal() == 3) {
                ly0Var.b(y3Var.b(), "ad_rendering_duration");
            }
        }
        return ly0Var.a();
    }
}
