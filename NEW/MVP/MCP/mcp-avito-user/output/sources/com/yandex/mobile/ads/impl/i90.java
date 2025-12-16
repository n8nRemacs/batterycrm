package com.yandex.mobile.ads.impl;

import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.yandex.mobile.ads.base.tracker.interaction.model.FalseClick;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public final class i90 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final r f386386a = new r();

    @j.N
    public final h90 a(@j.N JSONObject jSONObject) throws JSONException {
        ArrayList arrayList;
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("actions");
        if (jSONArrayOptJSONArray != null) {
            ArrayList arrayList2 = new ArrayList();
            for (int i12 = 0; i12 < jSONArrayOptJSONArray.length(); i12++) {
                JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(i12);
                InterfaceC39353p interfaceC39353pA = this.f386386a.a(jSONObject2);
                if (interfaceC39353pA != null) {
                    arrayList2.add(interfaceC39353pA.a(jSONObject2));
                }
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        String strA = jSONObject.has("falseClickUrl") ? mm0.a("falseClickUrl", jSONObject) : null;
        return new h90(arrayList, strA != null ? new FalseClick(strA, jSONObject.optLong("falseClickInterval", 0L)) : null, jSONObject.has("trackingUrl") ? mm0.a("trackingUrl", jSONObject) : null, jSONObject.has(ContextActionHandler.Link.URL) ? mm0.a(ContextActionHandler.Link.URL, jSONObject) : null, jSONObject.optLong("clickableDelay", 0L));
    }
}
