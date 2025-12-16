package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.If;
import com.yandex.metrica.impl.ob.Tl;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class Ji {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final J9 f378649a;

    public Ji() {
        this(new J9());
    }

    public void a(@j.N Ui ui2, @j.N Tl.a aVar) {
        if (ui2.e().f379397f) {
            If.j jVar = new If.j();
            JSONObject jSONObjectOptJSONObject = aVar.optJSONObject("identity_light_collecting");
            if (jSONObjectOptJSONObject != null) {
                jVar.f378386a = jSONObjectOptJSONObject.optLong("min_interval_seconds", jVar.f378386a);
            }
            ui2.a(this.f378649a.toModel(jVar));
        }
    }

    @j.k0
    public Ji(@j.N J9 j92) {
        this.f378649a = j92;
    }
}
