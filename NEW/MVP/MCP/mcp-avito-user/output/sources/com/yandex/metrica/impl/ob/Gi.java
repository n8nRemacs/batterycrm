package com.yandex.metrica.impl.ob;

import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.yandex.metrica.impl.ob.If;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class Gi {

    /* renamed from: a, reason: collision with root package name */
    private final C9 f378191a;

    @j.k0
    public Gi(@Y61.k C9 c92) {
        this.f378191a = c92;
    }

    public final void a(@Y61.k Ui ui2, @Y61.k JSONObject jSONObject) {
        If.h hVar = new If.h();
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("egress");
        if (jSONObjectOptJSONObject != null) {
            hVar.f378357a = jSONObjectOptJSONObject.optString(ContextActionHandler.Link.URL, hVar.f378357a);
            hVar.f378358b = jSONObjectOptJSONObject.optInt("repeated_delay", hVar.f378358b);
            hVar.f378359c = jSONObjectOptJSONObject.optInt("random_delay_window", hVar.f378359c);
            hVar.f378360d = jSONObjectOptJSONObject.optBoolean("background_allowed", hVar.f378360d);
            hVar.f378361e = jSONObjectOptJSONObject.optBoolean("diagnostic_enabled", hVar.f378361e);
        }
        ui2.a(this.f378191a.toModel(hVar));
    }

    public Gi() {
        this(new C9());
    }
}
