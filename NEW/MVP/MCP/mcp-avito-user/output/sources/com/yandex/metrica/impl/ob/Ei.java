package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.If;
import com.yandex.metrica.impl.ob.Tl;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class Ei {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final C39287z9 f378079a;

    public Ei() {
        this(new C39287z9());
    }

    public void a(@j.N Ui ui2, @j.N Tl.a aVar) {
        JSONArray jSONArrayOptJSONArray;
        JSONObject jSONObjectOptJSONObject = aVar.optJSONObject("diagnostics");
        if (jSONObjectOptJSONObject == null || (jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("functionalities")) == null) {
            return;
        }
        C39073qa c39073qa = null;
        C39073qa c39073qa2 = null;
        C39073qa c39073qa3 = null;
        for (int i12 = 0; i12 < jSONArrayOptJSONArray.length(); i12++) {
            try {
                JSONObject jSONObject = jSONArrayOptJSONArray.getJSONObject(i12);
                String string = jSONObject.getString("tag");
                C39287z9 c39287z9 = this.f378079a;
                If.e eVar = new If.e();
                eVar.f378351a = jSONObject.getLong("expiration_timestamp");
                eVar.f378352b = jSONObject.optInt("interval", eVar.f378352b);
                C39073qa model = c39287z9.toModel(eVar);
                if ("activation".equals(string)) {
                    c39073qa = model;
                } else if ("clids_info".equals(string)) {
                    c39073qa3 = model;
                } else if ("preload_info".equals(string)) {
                    c39073qa2 = model;
                }
            } catch (Throwable unused) {
            }
        }
        ui2.a(new C39096ra(c39073qa, c39073qa3, c39073qa2));
    }

    @j.k0
    public Ei(@j.N C39287z9 c39287z9) {
        this.f378079a = c39287z9;
    }
}
