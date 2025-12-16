package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.If;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class Yi {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final C38750da f379971a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final Zi f379972b;

    public Yi() {
        this(new C38750da(), new Zi());
    }

    @j.N
    public void a(@j.N Ui ui2, @j.N JSONObject jSONObject) {
        C38750da c38750da = this.f379971a;
        If.w wVar = new If.w();
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("ui_parsing");
        if (jSONObjectOptJSONObject != null) {
            wVar.f378474a = jSONObjectOptJSONObject.optInt("too_long_text_bound", wVar.f378474a);
            wVar.f378475b = jSONObjectOptJSONObject.optInt("truncated_text_bound", wVar.f378475b);
            wVar.f378476c = jSONObjectOptJSONObject.optInt("max_visited_children_in_level", wVar.f378476c);
            wVar.f378477d = Tl.a(Tl.a(jSONObjectOptJSONObject, "after_create_timeout", (Long) null), TimeUnit.SECONDS, wVar.f378477d);
            wVar.f378478e = jSONObjectOptJSONObject.optBoolean("relative_text_size_calculation", wVar.f378478e);
            wVar.f378479f = jSONObjectOptJSONObject.optBoolean("error_reporting", wVar.f378479f);
            wVar.f378480g = jSONObjectOptJSONObject.optBoolean("parsing_allowed_by_default", wVar.f378480g);
            wVar.f378481h = this.f379972b.a(jSONObjectOptJSONObject.optJSONArray("filters"));
        }
        ui2.a(c38750da.toModel(wVar));
    }

    @j.k0
    public Yi(@j.N C38750da c38750da, @j.N Zi zi2) {
        this.f379971a = c38750da;
        this.f379972b = zi2;
    }
}
