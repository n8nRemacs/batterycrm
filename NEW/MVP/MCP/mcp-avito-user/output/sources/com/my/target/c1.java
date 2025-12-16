package com.my.target;

import android.content.Context;
import android.text.TextUtils;
import com.my.target.p1;
import e11.AbstractC39858c1;
import e11.C39882k1;
import e11.C39901r0;
import e11.G1;
import e11.T1;
import e11.e2;
import e11.j2;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class c1 extends AbstractC37789h0<T1> {
    @Override // com.my.target.AbstractC37789h0
    @j.P
    public final AbstractC39858c1 b(@j.N String str, @j.N C39882k1 c39882k1, @j.P AbstractC39858c1 abstractC39858c1, @j.N C39901r0 c39901r0, @j.N p1.a aVar, @j.N p1 p1Var, @j.P ArrayList arrayList, @j.N Context context) {
        JSONObject jSONObjectOptJSONObject;
        JSONArray jSONArrayOptJSONArray;
        JSONObject jSONObjectOptJSONObject2;
        JSONObject jSONObjectC = AbstractC37789h0.c(str, aVar, p1Var, arrayList);
        if (jSONObjectC == null || (jSONObjectOptJSONObject = jSONObjectC.optJSONObject(c39901r0.f394773j)) == null || (jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("banners")) == null || jSONArrayOptJSONArray.length() <= 0 || (jSONObjectOptJSONObject2 = jSONArrayOptJSONArray.optJSONObject(0)) == null) {
            return null;
        }
        G1 g12 = new G1();
        String strOptString = jSONObjectOptJSONObject2.optString("id");
        if (TextUtils.isEmpty(strOptString)) {
            strOptString = jSONObjectOptJSONObject2.optString("bannerID", g12.f394726y);
        }
        g12.f394726y = strOptString;
        String strOptString2 = jSONObjectOptJSONObject2.optString("type");
        if (!TextUtils.isEmpty(strOptString2)) {
            g12.f394725x = strOptString2;
        }
        if (jSONObjectOptJSONObject2.optJSONArray("statistics") != null) {
            new j2(c39882k1, c39901r0, context).c(g12.f394702a, jSONObjectOptJSONObject2, strOptString, 0);
        }
        e2 e2Var = g12.f394702a;
        if (e2Var.f394585a.isEmpty() && e2Var.f394586b.isEmpty() && e2Var.f394589e.isEmpty() && e2Var.f394590f.isEmpty()) {
            return null;
        }
        T1 t12 = new T1();
        t12.f394481b = g12;
        return t12;
    }
}
