package defpackage;

import android.net.Uri;
import android.text.TextUtils;

/* loaded from: classes2.dex */
public final class he7 {
    public final z7c a;
    public final k18 b;
    public final k18 c;
    public final k18 d;

    public he7(z7c z7cVar, k18 k18Var, k18 k18Var2, k18 k18Var3) {
        this.a = z7cVar;
        this.b = k18Var;
        this.c = k18Var2;
        this.d = k18Var3;
    }

    public static String a(Uri uri) {
        if (!uri.isHierarchical()) {
            return uri.toString();
        }
        String queryParameter = uri.getQueryParameter("bid");
        String queryParameter2 = uri.getQueryParameter("t");
        return (TextUtils.isEmpty(queryParameter) || TextUtils.isEmpty(queryParameter2)) ? uri.toString() : wy1.i("ok-image-cache:bid=", queryParameter, "&t=", queryParameter2);
    }
}
