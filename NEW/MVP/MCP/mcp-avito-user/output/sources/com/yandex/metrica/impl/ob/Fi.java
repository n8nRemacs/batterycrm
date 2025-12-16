package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.If;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class Fi {

    /* renamed from: a, reason: collision with root package name */
    private final B9 f378150a;

    @j.k0
    public Fi(@Y61.k B9 b92) {
        this.f378150a = b92;
    }

    public final void a(@Y61.k Ui ui2, @Y61.k JSONObject jSONObject) {
        If.g gVar = new If.g();
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("easy_collecting");
        if (jSONObjectOptJSONObject != null) {
            gVar.f378356a = jSONObjectOptJSONObject.optLong("first_delay_seconds", gVar.f378356a);
        }
        ui2.a(this.f378150a.toModel(gVar));
    }

    public Fi() {
        this(new B9());
    }
}
