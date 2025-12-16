package com.my.tracker.obfuscated;

import android.content.Context;
import android.text.TextUtils;
import java.util.UUID;

/* loaded from: classes7.dex */
public final class g2 {

    /* renamed from: a, reason: collision with root package name */
    private static volatile String f365648a;

    public static String a(Context context) {
        String strJ = f365648a;
        if (strJ == null) {
            synchronized (g2.class) {
                try {
                    strJ = f365648a;
                    if (strJ == null) {
                        strJ = z0.a(context).j();
                        if (TextUtils.isEmpty(strJ)) {
                            strJ = UUID.randomUUID().toString();
                            z0.a(context).k(strJ);
                            f365648a = strJ;
                        }
                    }
                } finally {
                }
            }
        }
        return strJ;
    }
}
