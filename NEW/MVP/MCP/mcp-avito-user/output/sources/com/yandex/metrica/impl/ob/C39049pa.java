package com.yandex.metrica.impl.ob;

import com.avito.android.remote.model.SearchParamsConverterKt;
import com.yandex.metrica.impl.ob.C39185v3;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.pa, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C39049pa implements InterfaceC39120sa<C39185v3> {
    @Override // com.yandex.metrica.impl.ob.InterfaceC39120sa
    @j.N
    public JSONObject a(@j.P C39185v3 c39185v3) {
        C39185v3 c39185v32 = c39185v3;
        JSONObject jSONObject = new JSONObject();
        if (c39185v32 != null) {
            try {
                JSONArray jSONArray = new JSONArray();
                Iterator<C39185v3.a> it = c39185v32.a().iterator();
                while (it.hasNext()) {
                    jSONArray.put(a(it.next()));
                }
                jSONObject.putOpt("chosen", a(c39185v32.c())).putOpt("candidates", jSONArray);
            } catch (Throwable unused) {
            }
        }
        return jSONObject;
    }

    @j.P
    private JSONObject a(@j.P C39185v3.a aVar) {
        if (aVar == null) {
            return null;
        }
        return new JSONObject().putOpt("clids", Tl.e(aVar.b())).putOpt(SearchParamsConverterKt.SOURCE, aVar.a().a());
    }
}
