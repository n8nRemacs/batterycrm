package com.vk.push.core.network.utils;

import kotlin.Metadata;
import m21.C43868a;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: ResponseError.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"sdk-public-push-core-network_release"}, k = 2, mv = {1, 7, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class l {
    public static final boolean a(@Y61.l String str) {
        if (str == null) {
            return false;
        }
        try {
            return new JSONObject(str).has("error");
        } catch (JSONException unused) {
            return false;
        }
    }

    @Y61.k
    public static final C43868a b(@Y61.k String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str).getJSONObject("error");
        return new C43868a(jSONObject.getInt("code"), jSONObject.getString("message"), jSONObject.optString("status"));
    }
}
