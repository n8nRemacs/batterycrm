package com.yandex.metrica.impl.ob;

import android.content.ContentValues;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.t3, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39137t3 implements W<Map<String, ? extends String>> {
    @Override // com.yandex.metrica.impl.ob.W, Y41.l
    public Object invoke(ContentValues contentValues) {
        String asString = contentValues.getAsString("clids");
        HashMap<String, String> mapD = Tl.d(asString);
        if (Tl.d(mapD)) {
            return mapD;
        }
        C38842h2.b(AK.c.k("Passed clids (", asString, ") are invalid."), new Object[0]);
        return null;
    }
}
