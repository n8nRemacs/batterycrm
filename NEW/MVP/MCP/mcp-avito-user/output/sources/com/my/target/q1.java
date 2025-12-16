package com.my.target;

import android.content.Context;
import android.util.LruCache;
import com.my.target.f1;
import com.my.target.p1;
import e11.AbstractC39858c1;
import e11.C39862e;
import e11.C39882k1;
import e11.C39901r0;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class q1 extends AbstractC37789h0<C39862e> implements f1.a {
    @Override // com.my.target.f1.a
    @j.P
    public final AbstractC39858c1 a(@j.N JSONObject jSONObject, @j.N C39882k1 c39882k1, @j.N C39901r0 c39901r0, @j.N Context context) {
        C39862e c39862e = new C39862e();
        e11.Y0 y02 = new e11.Y0(c39882k1, c39901r0, context);
        e11.Q0 q02 = new e11.Q0();
        y02.b(jSONObject, q02);
        c39862e.f394575b.add(q02);
        LruCache<String, String> lruCache = C39862e.f394574c;
        String str = q02.f394726y;
        lruCache.put(str, str);
        return c39862e;
    }

    @Override // com.my.target.AbstractC37789h0
    @j.P
    public final AbstractC39858c1 b(@j.N String str, @j.N C39882k1 c39882k1, @j.P AbstractC39858c1 abstractC39858c1, @j.N C39901r0 c39901r0, @j.N p1.a aVar, @j.N p1 p1Var, @j.P ArrayList arrayList, @j.N Context context) {
        JSONObject jSONObjectOptJSONObject;
        e11.X0 x0B;
        C39862e c39862e = (C39862e) abstractC39858c1;
        JSONObject jSONObjectC = AbstractC37789h0.c(str, aVar, p1Var, arrayList);
        if (jSONObjectC == null) {
            return null;
        }
        if (c39862e == null) {
            c39862e = new C39862e();
        }
        JSONObject jSONObjectOptJSONObject2 = jSONObjectC.optJSONObject(c39901r0.f394773j);
        if (jSONObjectOptJSONObject2 != null) {
            JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject2.optJSONArray("banners");
            if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() <= 0) {
                return null;
            }
            e11.Y0 y02 = new e11.Y0(c39882k1, c39901r0, context);
            JSONObject jSONObjectOptJSONObject3 = jSONArrayOptJSONArray.optJSONObject(0);
            if (jSONObjectOptJSONObject3 != null) {
                e11.Q0 q02 = new e11.Q0();
                y02.b(jSONObjectOptJSONObject3, q02);
                c39862e.f394575b.add(q02);
                LruCache<String, String> lruCache = C39862e.f394574c;
                String str2 = q02.f394726y;
                lruCache.put(str2, str2);
            }
            if (c39862e.f394575b.size() <= 0) {
                return null;
            }
        } else {
            if (!c39901r0.f394767d || (jSONObjectOptJSONObject = jSONObjectC.optJSONObject("mediation")) == null || (x0B = new f1(this, c39882k1, c39901r0, context).b(jSONObjectOptJSONObject)) == null) {
                return null;
            }
            c39862e.f394557a = x0B;
        }
        return c39862e;
    }
}
