package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;

/* loaded from: classes.dex */
public abstract class ri3 {
    public static final hl4 a = new hl4("CommonUtils", "", 1);

    public static String a(Context context) {
        try {
            return String.valueOf(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
        } catch (PackageManager.NameNotFoundException e) {
            String strConcat = "Exception thrown when trying to get app version ".concat(e.toString());
            hl4 hl4Var = a;
            if (!Log.isLoggable(hl4Var.b, 6)) {
                return "";
            }
            Log.e("CommonUtils", hl4Var.b(strConcat));
            return "";
        }
    }
}
