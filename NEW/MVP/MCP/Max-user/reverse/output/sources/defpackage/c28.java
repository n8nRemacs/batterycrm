package defpackage;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* loaded from: classes.dex */
public final class c28 {
    public static String a(Date date) {
        String str;
        synchronized (ml6.u) {
            if (ml6.t == null) {
                ml6.t = new SimpleDateFormat("yyyyMMdd_HHmmss_SSS", Locale.ENGLISH);
            }
            str = ml6.t.format(date);
        }
        return str;
    }
}
