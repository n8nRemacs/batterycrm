package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import kotlin.collections.C42745f0;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public final class l51 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final j51 f387380a = new j51();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    private final od f387381b = new od();

    @Y61.k
    public final k51 a(@Y61.k JSONObject jSONObject) {
        c51 c51VarA;
        nd ndVarA;
        Object objOpt = jSONObject.opt("ColorWizButton");
        ArrayList arrayList = null;
        String str = objOpt instanceof String ? (String) objOpt : null;
        Object objOpt2 = jSONObject.opt("ColorWizButtonText");
        String str2 = objOpt2 instanceof String ? (String) objOpt2 : null;
        Object objOpt3 = jSONObject.opt("ColorWizBack");
        String str3 = objOpt3 instanceof String ? (String) objOpt3 : null;
        Object objOpt4 = jSONObject.opt("ColorWizBackRight");
        String str4 = objOpt4 instanceof String ? (String) objOpt4 : null;
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("backgroundColors");
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("smart-center");
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("smart-centers");
        if (jSONObjectOptJSONObject2 != null) {
            this.f387380a.getClass();
            c51VarA = j51.a(jSONObjectOptJSONObject2);
        } else {
            c51VarA = null;
        }
        if (jSONObjectOptJSONObject != null) {
            this.f387381b.getClass();
            ndVarA = od.a(jSONObjectOptJSONObject);
        } else {
            ndVarA = null;
        }
        if (jSONArrayOptJSONArray != null) {
            kotlin.ranges.l lVarR = kotlin.ranges.s.r(0, jSONArrayOptJSONArray.length());
            arrayList = new ArrayList(C42745f0.q(lVarR, 10));
            kotlin.ranges.k it = lVarR.iterator();
            while (it.f406910d) {
                int iA2 = it.a();
                j51 j51Var = this.f387380a;
                JSONObject jSONObjectOptJSONObject3 = jSONArrayOptJSONArray.optJSONObject(iA2);
                j51Var.getClass();
                arrayList.add(j51.a(jSONObjectOptJSONObject3));
            }
        }
        return new k51(str, str2, str3, str4, ndVarA, c51VarA, arrayList);
    }
}
