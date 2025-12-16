package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.If;
import org.json.JSONObject;

/* loaded from: classes7.dex */
class Ci {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final C39143t9 f377917a;

    public Ci() {
        this(new C39143t9());
    }

    public void a(@j.N Ui ui2, @j.N JSONObject jSONObject) {
        C39143t9 c39143t9 = this.f377917a;
        If.b bVar = new If.b();
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("auto_inapp_collecting");
        if (jSONObjectOptJSONObject != null) {
            bVar.f378342a = jSONObjectOptJSONObject.optInt("send_frequency_seconds", bVar.f378342a);
            bVar.f378343b = jSONObjectOptJSONObject.optInt("first_collecting_inapp_max_age_seconds", bVar.f378343b);
        }
        ui2.a(c39143t9.toModel(bVar));
    }

    @j.k0
    public Ci(@j.N C39143t9 c39143t9) {
        this.f377917a = c39143t9;
    }
}
