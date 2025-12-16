package com.yandex.metrica.impl.ob;

import java.lang.reflect.Field;
import kotlin.text.C43066x;

/* renamed from: com.yandex.metrica.impl.ob.f3, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38793f3 {
    @X41.n
    @Y61.k
    public static final com.yandex.metrica.billing_interface.b a() {
        Field field;
        String str = null;
        try {
            Class clsB = C38842h2.b("com.android.billingclient.BuildConfig");
            str = (String) ((clsB == null || (field = clsB.getField("VERSION_NAME")) == null) ? null : field.get(null));
        } catch (Throwable unused) {
        }
        if (str == null) {
            return com.yandex.metrica.billing_interface.b.f377608d;
        }
        boolean zH02 = C43066x.h0(str, "2.", false);
        com.yandex.metrica.billing_interface.b bVar = com.yandex.metrica.billing_interface.b.f377606b;
        if (zH02 || C43066x.h0(str, "3.", false)) {
            return bVar;
        }
        C43066x.h0(str, "4.", false);
        return com.yandex.metrica.billing_interface.b.f377607c;
    }
}
