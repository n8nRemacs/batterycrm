package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.If;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes7.dex */
class Zi {
    @j.N
    public If.y[] a(@j.P JSONArray jSONArray) {
        int i12;
        if (jSONArray == null) {
            return new If.y[0];
        }
        ArrayList arrayList = new ArrayList();
        for (int i13 = 0; i13 < jSONArray.length(); i13++) {
            try {
                JSONObject jSONObject = jSONArray.getJSONObject(i13);
                Integer num = null;
                Integer numA = Tl.a(jSONObject, "type", (Integer) null);
                if (numA != null) {
                    int iIntValue = numA.intValue();
                    if (iIntValue == 0) {
                        i12 = 0;
                    } else if (iIntValue == 1) {
                        i12 = 1;
                    } else if (iIntValue == 2) {
                        i12 = 2;
                    } else if (iIntValue == 3) {
                        i12 = 3;
                    }
                    num = i12;
                }
                String strB = Tl.b(jSONObject, "value");
                if (num != null && strB != null) {
                    If.y yVar = new If.y();
                    yVar.f378485a = num.intValue();
                    yVar.f378486b = strB;
                    arrayList.add(yVar);
                }
            } catch (Throwable unused) {
            }
        }
        return (If.y[]) arrayList.toArray(new If.y[0]);
    }
}
