package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.If;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class Vi {

    /* renamed from: a, reason: collision with root package name */
    private final Y9 f379788a;

    @j.k0
    public Vi(@Y61.k Y9 y92) {
        this.f379788a = y92;
    }

    public final void a(@Y61.k Ui ui2, @Y61.k JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("startup_update");
        If.r rVar = new If.r();
        Integer numA = Tl.a(jSONObjectOptJSONObject, "interval_seconds", (Integer) null);
        if (numA != null) {
            rVar.f378452a = numA.intValue();
        }
        ui2.a(this.f379788a.toModel(rVar));
    }

    public Vi() {
        this(new Y9());
    }
}
