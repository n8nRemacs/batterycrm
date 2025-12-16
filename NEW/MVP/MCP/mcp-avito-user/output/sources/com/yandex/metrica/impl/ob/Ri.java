package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.If;
import com.yandex.metrica.impl.ob.Tl;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class Ri {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final U9 f379325a;

    public Ri() {
        this(new U9());
    }

    public void a(@j.N Ui ui2, @j.N Tl.a aVar) {
        If.p pVar = new If.p();
        JSONObject jSONObjectOptJSONObject = aVar.optJSONObject("sdk_list");
        if (jSONObjectOptJSONObject != null) {
            Long lA2 = Tl.a(jSONObjectOptJSONObject, "min_collecting_interval_seconds", (Long) null);
            TimeUnit timeUnit = TimeUnit.SECONDS;
            pVar.f378438a = Tl.a(lA2, timeUnit, pVar.f378438a);
            pVar.f378439b = Tl.a(Tl.a(jSONObjectOptJSONObject, "min_first_collecting_delay_seconds", (Long) null), timeUnit, pVar.f378439b);
            pVar.f378440c = Tl.a(Tl.a(jSONObjectOptJSONObject, "min_collecting_delay_after_launch_seconds", (Long) null), timeUnit, pVar.f378440c);
            pVar.f378441d = Tl.a(Tl.a(jSONObjectOptJSONObject, "min_request_retry_interval_seconds", (Long) null), timeUnit, pVar.f378441d);
        }
        ui2.a(this.f379325a.toModel(pVar));
    }

    @j.k0
    public Ri(@j.N U9 u92) {
        this.f379325a = u92;
    }
}
