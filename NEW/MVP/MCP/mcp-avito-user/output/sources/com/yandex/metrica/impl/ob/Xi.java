package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.If;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class Xi {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private C38725ca f379930a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final Zi f379931b;

    public Xi() {
        this(new C38725ca(), new Zi());
    }

    @j.N
    public C38861hl a(@j.N JSONObject jSONObject, @j.N String str, @j.N If.v vVar) {
        C38725ca c38725ca = this.f379930a;
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(str);
        if (jSONObjectOptJSONObject != null) {
            vVar.f378458a = jSONObjectOptJSONObject.optBoolean("text_size_collecting", vVar.f378458a);
            vVar.f378459b = jSONObjectOptJSONObject.optBoolean("relative_text_size_collecting", vVar.f378459b);
            vVar.f378460c = jSONObjectOptJSONObject.optBoolean("text_visibility_collecting", vVar.f378460c);
            vVar.f378461d = jSONObjectOptJSONObject.optBoolean("text_style_collecting", vVar.f378461d);
            vVar.f378466i = jSONObjectOptJSONObject.optBoolean("info_collecting", vVar.f378466i);
            vVar.f378467j = jSONObjectOptJSONObject.optBoolean("non_content_view_collecting", vVar.f378467j);
            vVar.f378468k = jSONObjectOptJSONObject.optBoolean("text_length_collecting", vVar.f378468k);
            vVar.f378469l = jSONObjectOptJSONObject.optBoolean("view_hierarchical", vVar.f378469l);
            vVar.f378471n = jSONObjectOptJSONObject.optBoolean("ignore_filtered", vVar.f378471n);
            vVar.f378472o = jSONObjectOptJSONObject.optBoolean("web_view_urls_collecting", vVar.f378472o);
            vVar.f378462e = jSONObjectOptJSONObject.optInt("too_long_text_bound", vVar.f378462e);
            vVar.f378463f = jSONObjectOptJSONObject.optInt("truncated_text_bound", vVar.f378463f);
            vVar.f378464g = jSONObjectOptJSONObject.optInt("max_entities_count", vVar.f378464g);
            vVar.f378465h = jSONObjectOptJSONObject.optInt("max_full_content_length", vVar.f378465h);
            vVar.f378473p = jSONObjectOptJSONObject.optInt("web_view_url_limit", vVar.f378473p);
            vVar.f378470m = this.f379931b.a(jSONObjectOptJSONObject.optJSONArray("filters"));
        }
        return c38725ca.toModel(vVar);
    }

    @j.k0
    public Xi(@j.N C38725ca c38725ca, @j.N Zi zi2) {
        this.f379930a = c38725ca;
        this.f379931b = zi2;
    }
}
