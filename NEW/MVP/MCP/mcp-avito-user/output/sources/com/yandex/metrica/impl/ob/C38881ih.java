package com.yandex.metrica.impl.ob;

import android.text.TextUtils;
import com.yandex.metrica.impl.ob.Tl;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.ih, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C38881ih {
    @j.N
    public List<C38857hh> a(@j.N String str) {
        ArrayList arrayList = new ArrayList();
        try {
            JSONArray jSONArrayOptJSONArray = new Tl.a(str).optJSONArray("sdk_list");
            if (jSONArrayOptJSONArray != null) {
                for (int i12 = 0; i12 < jSONArrayOptJSONArray.length(); i12++) {
                    JSONObject jSONObject = jSONArrayOptJSONArray.getJSONObject(i12);
                    String strOptString = jSONObject.optString("name");
                    if (!TextUtils.isEmpty(strOptString)) {
                        JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("classes");
                        ArrayList arrayList2 = new ArrayList();
                        if (jSONArrayOptJSONArray2 != null) {
                            for (int i13 = 0; i13 < jSONArrayOptJSONArray2.length(); i13++) {
                                try {
                                    String strOptString2 = jSONArrayOptJSONArray2.getJSONObject(i13).optString("name");
                                    if (!TextUtils.isEmpty(strOptString2)) {
                                        arrayList2.add(strOptString2);
                                    }
                                } catch (Throwable unused) {
                                }
                            }
                        }
                        if (!A2.b(arrayList2)) {
                            arrayList.add(new C38857hh(strOptString, arrayList2));
                        }
                    }
                }
            }
        } catch (Throwable unused2) {
        }
        return arrayList;
    }
}
