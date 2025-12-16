package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import java.util.List;

/* loaded from: classes2.dex */
public final class j98 {
    public final String a(String str) {
        return new Uri.Builder().scheme("https").authority("max.ru").appendPath(str.replace("@", "")).build().toString();
    }

    public final i98 b(Uri uri, m7c m7cVar) {
        boolean zTest;
        int i;
        List<String> pathSegments = c(uri).getPathSegments();
        int i2 = 0;
        String str = !pathSegments.isEmpty() ? pathSegments.get(0) : null;
        if (TextUtils.isEmpty(str)) {
            zTest = false;
        } else {
            try {
                zTest = m7cVar.test(str);
            } catch (Throwable th) {
                wqi.e("j98", "getLinkEntity: privacyPredicate fail", th);
            }
        }
        if (zTest) {
            while (true) {
                if (i2 >= pathSegments.size()) {
                    i = -1;
                    break;
                }
                if (pathSegments.get(i2).equals("join")) {
                    i = i2 + 1;
                    break;
                }
                i2++;
            }
            if (i != -1 && i < pathSegments.size()) {
                str = pathSegments.get(i);
            }
        }
        return new i98(str, zTest);
    }

    public final Uri c(Uri uri) {
        String string = uri.toString();
        if (string.endsWith("/") && string.length() > 1) {
            string = string.substring(0, string.length() - 1);
        }
        if (string.startsWith(":") || string.startsWith("max://:")) {
            return m8j.b(string.replace("max://:", ":"));
        }
        if (string.startsWith("@")) {
            return uri;
        }
        if (!string.contains("://") && TextUtils.isEmpty(uri.getScheme())) {
            return Uri.parse("https://".concat(string));
        }
        return Uri.parse(string);
    }
}
