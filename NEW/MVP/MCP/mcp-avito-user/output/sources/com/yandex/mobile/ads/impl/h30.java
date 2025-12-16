package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import org.json.JSONArray;

/* loaded from: classes8.dex */
public final class h30 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final v20 f385898a = new v20(new bc1());

    @Y61.k
    public final ArrayList a(@Y61.k JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        for (int i12 = 0; i12 < length; i12++) {
            arrayList.add(this.f385898a.a(jSONArray.getJSONObject(i12)));
        }
        return arrayList;
    }
}
