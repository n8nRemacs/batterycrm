package com.yandex.metrica.impl.ob;

import com.avito.android.remote.model.SearchParamsConverterKt;
import com.yandex.metrica.impl.ob.Ud;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.xa, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C39240xa implements InterfaceC39120sa<Ud> {
    @Override // com.yandex.metrica.impl.ob.InterfaceC39120sa
    @j.N
    public JSONObject a(@j.P Ud ud2) {
        Ud ud3 = ud2;
        JSONObject jSONObject = new JSONObject();
        if (ud3 != null) {
            try {
                JSONArray jSONArray = new JSONArray();
                Iterator<Ud.a> it = ud3.f379612b.iterator();
                while (it.hasNext()) {
                    Ud.a next = it.next();
                    jSONArray.put(next == null ? null : new JSONObject().putOpt("tracking_id", next.f379613a).put("additional_parameters", next.f379614b).put(SearchParamsConverterKt.SOURCE, next.f379615c.a()));
                }
                JSONObject jSONObjectPut = jSONObject.put("candidates", jSONArray);
                C38779ee c38779ee = ud3.f379611a;
                jSONObjectPut.put("chosen", new JSONObject().putOpt("tracking_id", c38779ee.f380481a).put("additional_parameters", c38779ee.f380482b).put(SearchParamsConverterKt.SOURCE, c38779ee.f380485e.a()).put("auto_tracking_enabled", c38779ee.f380484d));
            } catch (Throwable unused) {
            }
        }
        return jSONObject;
    }
}
