package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.base.model.AdUnitIdBiddingSettings;
import com.yandex.mobile.ads.base.model.BiddingSettings;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public final class sf {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final dg0 f389925a = new dg0();

    @j.P
    public final AdUnitIdBiddingSettings a(@j.N JSONObject jSONObject) throws JSONException {
        String strB;
        try {
            try {
                strB = m80.b("ad_unit_id", jSONObject);
            } catch (JSONException unused) {
                strB = m80.b("block_id", jSONObject);
            }
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("networks");
            if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
                ArrayList arrayList = new ArrayList(jSONArrayOptJSONArray.length());
                for (int i12 = 0; i12 < jSONArrayOptJSONArray.length(); i12++) {
                    zf0 zf0VarA = this.f389925a.a(jSONArrayOptJSONArray.getJSONObject(i12));
                    if (zf0VarA != null) {
                        arrayList.add(zf0VarA);
                    }
                }
                if (!arrayList.isEmpty()) {
                    return new AdUnitIdBiddingSettings(strB, jSONObject.toString(), arrayList);
                }
            }
        } catch (JSONException unused2) {
        }
        return null;
    }

    @j.P
    public final BiddingSettings b(@j.N JSONObject jSONObject) {
        try {
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("ad_unit_id_settings");
            if (jSONArrayOptJSONArray == null) {
                jSONArrayOptJSONArray = jSONObject.optJSONArray("block_id_settings");
            }
            if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
                ArrayList arrayList = new ArrayList();
                for (int i12 = 0; i12 < jSONArrayOptJSONArray.length(); i12++) {
                    AdUnitIdBiddingSettings adUnitIdBiddingSettingsA = a(jSONArrayOptJSONArray.getJSONObject(i12));
                    if (adUnitIdBiddingSettingsA != null) {
                        arrayList.add(adUnitIdBiddingSettingsA);
                    }
                }
                if (!arrayList.isEmpty()) {
                    return new BiddingSettings(arrayList);
                }
            }
        } catch (JSONException unused) {
        }
        return null;
    }
}
