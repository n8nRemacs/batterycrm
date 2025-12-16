package x01;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;

/* renamed from: x01.u, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC49735u {
    public static String a(Context context, String str, String str2) throws PackageManager.NameNotFoundException {
        Bundle bundle;
        Object obj;
        if (!TextUtils.isEmpty(AbstractC49725j.a(str, str2) != null ? null : "")) {
            if (AbstractC49725j.a(str, str2) != null) {
                return null;
            }
            return "";
        }
        J j12 = C49714A.a().f441939a;
        if (TextUtils.isEmpty(j12.f441973f)) {
            String str3 = "Unknown";
            try {
                ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
                if (applicationInfo != null && (bundle = applicationInfo.metaData) != null && (obj = bundle.get("CHANNEL")) != null) {
                    String string = obj.toString();
                    if (string.length() <= 256) {
                        str3 = string;
                    }
                }
            } catch (PackageManager.NameNotFoundException unused) {
                m0.e("hmsSdk", "getChannel(): The packageName is not correct!");
            }
            j12.f441973f = a0.a(256, "channel", str3) ? str3 : "";
        }
        return j12.f441973f;
    }
}
