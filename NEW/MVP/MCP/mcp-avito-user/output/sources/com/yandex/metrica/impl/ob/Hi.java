package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.If;
import com.yandex.metrica.impl.ob.Sh;
import com.yandex.metrica.impl.ob.Tl;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class Hi {
    public void a(@j.N Ui ui2, @j.N Tl.a aVar) {
        If.i iVar = new If.i();
        try {
            Object jSONObject = new JSONObject();
            try {
                jSONObject = aVar.get("features");
            } catch (Throwable unused) {
            }
            JSONObject jSONObjectOptJSONObject = ((JSONObject) jSONObject).optJSONObject("list");
            if (jSONObjectOptJSONObject != null) {
                Sh sh2 = new Sh(new Sh.a().d(a(jSONObjectOptJSONObject, "easy_collecting", iVar.f378362a)).e(a(jSONObjectOptJSONObject, "egress", iVar.f378384w)).m(a(jSONObjectOptJSONObject, "package_info", iVar.f378363b)).n(a(jSONObjectOptJSONObject, "permissions_collecting", iVar.f378364c)).f(a(jSONObjectOptJSONObject, "features_collecting", iVar.f378365d)).o(a(jSONObjectOptJSONObject, "sdk_list", iVar.f378371j)).g(a(jSONObjectOptJSONObject, "google_aid", iVar.f378366e)).q(a(jSONObjectOptJSONObject, "throttling", iVar.f378379r)).v(a(jSONObjectOptJSONObject, "wifi_around", iVar.f378367f)).w(a(jSONObjectOptJSONObject, "wifi_connected", iVar.f378368g)).c(a(jSONObjectOptJSONObject, "cells_around", iVar.f378369h)).p(a(jSONObjectOptJSONObject, "sim_info", iVar.f378370i)).j(a(jSONObjectOptJSONObject, "identity_light_collecting", iVar.f378372k)).l(a(jSONObjectOptJSONObject, "location_collecting", iVar.f378373l)).k(a(jSONObjectOptJSONObject, "lbs_collecting", iVar.f378374m)).h(a(jSONObjectOptJSONObject, "gpl_collecting", iVar.f378375n)).t(a(jSONObjectOptJSONObject, "ui_parsing", iVar.f378376o)).s(a(jSONObjectOptJSONObject, "ui_event_sending", iVar.f378377p)).u(a(jSONObjectOptJSONObject, "ui_raw_event_sending", iVar.f378377p)).r(a(jSONObjectOptJSONObject, "ui_collecting_for_bridge", iVar.f378378q)).a(a(jSONObjectOptJSONObject, "cell_additional_info", iVar.f378380s)).b(a(jSONObjectOptJSONObject, "cell_additional_info_connected_only", iVar.f378381t)).i(a(jSONObjectOptJSONObject, "huawei_oaid", iVar.f378383v)).a(jSONObjectOptJSONObject.has("ssl_pinning") ? Boolean.valueOf(jSONObjectOptJSONObject.getJSONObject("ssl_pinning").getBoolean("enabled")) : null));
                ui2.a(a(jSONObjectOptJSONObject, "socket", false));
                ui2.a(sh2);
            }
        } catch (Throwable unused2) {
        }
    }

    private boolean a(JSONObject jSONObject, String str, boolean z12) {
        Boolean boolValueOf = jSONObject.has(str) ? Boolean.valueOf(jSONObject.getJSONObject(str).getBoolean("enabled")) : null;
        Boolean boolValueOf2 = Boolean.valueOf(z12);
        if (boolValueOf == null) {
            boolValueOf = boolValueOf2;
        }
        return boolValueOf.booleanValue();
    }
}
