package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import org.json.JSONArray;

/* loaded from: classes8.dex */
public final class w4 {
    @X41.n
    @Y61.k
    public static final ArrayList a(@Y61.k JSONArray jSONArray) {
        int length = jSONArray.length();
        ArrayList arrayList = new ArrayList(length);
        for (int i12 = 0; i12 < length; i12++) {
            arrayList.add(new v4(jSONArray.optJSONObject(i12).optLong("duration")));
        }
        return arrayList;
    }
}
