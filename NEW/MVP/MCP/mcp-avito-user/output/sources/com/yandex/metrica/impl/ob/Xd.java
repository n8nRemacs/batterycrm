package com.yandex.metrica.impl.ob;

import android.content.ContentValues;
import android.text.TextUtils;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class Xd implements W<C38779ee> {
    @Override // com.yandex.metrica.impl.ob.W, Y41.l
    public Object invoke(ContentValues contentValues) {
        ContentValues contentValues2 = contentValues;
        String asString = contentValues2.getAsString("tracking_id");
        C38779ee c38779ee = null;
        if (TextUtils.isEmpty(asString)) {
            C38842h2.b("Tracking id is empty", new Object[0]);
        } else {
            try {
                String asString2 = contentValues2.getAsString("additional_params");
                if (TextUtils.isEmpty(asString2)) {
                    C38842h2.b("No additional params", new Object[0]);
                } else {
                    JSONObject jSONObject = new JSONObject(asString2);
                    if (jSONObject.length() == 0) {
                        C38842h2.b("Additional params are empty", new Object[0]);
                    } else {
                        C38842h2.a("Successfully parsed preload info. Tracking id = %s, additionalParams = %s", asString, jSONObject);
                        c38779ee = new C38779ee(asString, jSONObject, true, false, EnumC39158u0.RETAIL);
                    }
                }
            } catch (Throwable th2) {
                C38842h2.a(th2, "Could not parse additional parameters", new Object[0]);
            }
        }
        return c38779ee;
    }
}
