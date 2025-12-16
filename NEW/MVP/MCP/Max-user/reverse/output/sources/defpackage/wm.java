package defpackage;

import android.net.Uri;

/* loaded from: classes2.dex */
public abstract class wm {
    public static final Uri a = Uri.parse("https://api.ok.ru");

    public static final Uri a(String str) {
        return Uri.parse("ok://api/api/".concat(dnf.p(str, '.', '/', false)));
    }

    public static final String b(Uri uri) {
        String string = uri.toString();
        if (dnf.r(string, "ok://api/api/", false)) {
            return dnf.p(string.substring(13), '/', '.', false);
        }
        throw new IllegalArgumentException(ctd.i(uri, "Unknown uri "));
    }
}
