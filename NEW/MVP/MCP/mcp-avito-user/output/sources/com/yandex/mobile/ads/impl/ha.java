package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.metrica.IIdentifierCallback;
import java.util.List;

/* loaded from: classes8.dex */
public final class ha {
    public static void a(@Y61.k Context context, boolean z12) {
        try {
            com.yandex.metrica.p.slte(context, z12);
        } catch (Throwable unused) {
        }
    }

    @Y61.l
    public static String b(@Y61.k Context context) {
        try {
            return com.yandex.metrica.p.guid(context);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void a(@Y61.k Context context, @Y61.k IIdentifierCallback iIdentifierCallback, @Y61.k List list) {
        com.yandex.metrica.p.a(context, iIdentifierCallback, (List<String>) list);
    }

    @Y61.l
    public static String a(@Y61.k Context context) {
        try {
            return com.yandex.metrica.p.gdid(context);
        } catch (Throwable unused) {
            return null;
        }
    }
}
