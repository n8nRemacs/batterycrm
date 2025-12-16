package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.C39176ui;
import com.yandex.metrica.impl.ob.If;
import com.yandex.metrica.impl.ob.Tl;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class Wi {

    /* renamed from: a, reason: collision with root package name */
    private static final If.u f379821a = new If.u();

    public C39176ui a(@j.N Tl.a aVar, @j.N String str) {
        C39176ui.a aVar2;
        JSONObject jSONObjectOptJSONObject = aVar.optJSONObject(str);
        C39176ui.a aVar3 = null;
        if (jSONObjectOptJSONObject == null) {
            return null;
        }
        JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("cell");
        if (jSONObjectOptJSONObject2 != null) {
            If.u uVar = f379821a;
            aVar2 = new C39176ui.a(jSONObjectOptJSONObject2.optInt("refresh_event_count", uVar.f378456a), jSONObjectOptJSONObject2.optLong("refresh_period_seconds", uVar.f378457b));
        } else {
            aVar2 = null;
        }
        JSONObject jSONObjectOptJSONObject3 = jSONObjectOptJSONObject.optJSONObject("wifi");
        if (jSONObjectOptJSONObject3 != null) {
            If.u uVar2 = f379821a;
            aVar3 = new C39176ui.a(jSONObjectOptJSONObject3.optInt("refresh_event_count", uVar2.f378456a), jSONObjectOptJSONObject3.optLong("refresh_period_seconds", uVar2.f378457b));
        }
        return new C39176ui(aVar2, aVar3);
    }
}
