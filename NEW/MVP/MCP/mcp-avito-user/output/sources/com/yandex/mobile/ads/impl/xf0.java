package com.yandex.mobile.ads.impl;

import android.text.TextUtils;
import com.yandex.mobile.ads.base.model.MediationData;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public final class xf0 implements uz0<MediationData> {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final cp0 f391714a = new cp0();

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final dg0 f391715b = new dg0();

    @Override // com.yandex.mobile.ads.impl.uz0
    @j.P
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final MediationData a(@j.N jz0 jz0Var) throws JSONException {
        String strA = this.f391714a.a(jz0Var);
        if (TextUtils.isEmpty(strA)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(strA);
            try {
                JSONObject jSONObject2 = jSONObject.getJSONObject("passback_parameters");
                HashMap map = new HashMap();
                Iterator<String> itKeys = jSONObject2.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    map.put(next, jSONObject2.getString(next));
                }
                if (map.isEmpty()) {
                    return null;
                }
                JSONArray jSONArray = jSONObject.getJSONArray("networks");
                ArrayList arrayList = new ArrayList();
                for (int i12 = 0; i12 < jSONArray.length(); i12++) {
                    zf0 zf0VarA = this.f391715b.a(jSONArray.getJSONObject(i12));
                    if (zf0VarA != null) {
                        arrayList.add(zf0VarA);
                    }
                }
                if (arrayList.isEmpty()) {
                    return null;
                }
                return new MediationData(arrayList, map);
            } catch (JSONException e12) {
                throw new JSONException(e12.getMessage());
            }
        } catch (JSONException unused) {
            return null;
        }
    }
}
