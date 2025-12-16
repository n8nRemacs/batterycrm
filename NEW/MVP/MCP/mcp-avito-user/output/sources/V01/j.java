package V01;

import android.content.Context;
import android.content.pm.PackageManager;

/* loaded from: classes7.dex */
public class j {
    public static String a(String str) {
        Context context = e.f16866a;
        if (context == null) {
            return "";
        }
        try {
            return context.getPackageManager().getPackageInfo(str, 0).versionName;
        } catch (PackageManager.NameNotFoundException e12) {
            e12.getMessage();
            return "";
        } catch (Exception e13) {
            e13.getMessage();
            return "";
        } catch (Throwable unused) {
            return "";
        }
    }
}
