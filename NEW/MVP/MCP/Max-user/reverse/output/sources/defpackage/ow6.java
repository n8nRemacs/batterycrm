package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.util.Log;

/* loaded from: classes.dex */
public final class ow6 {
    public static ow6 b;
    public final Context a;

    public ow6(Context context, int i) {
        switch (i) {
            case 1:
                this.a = context;
                break;
            default:
                this.a = context.getApplicationContext();
                break;
        }
    }

    public static ow6 a(Context context) {
        s5j.g(context);
        synchronized (ow6.class) {
            if (b == null) {
                rli rliVar = b2j.a;
                synchronized (b2j.class) {
                    if (b2j.c == null) {
                        b2j.c = context.getApplicationContext();
                    } else {
                        Log.w("GoogleCertificates", "GoogleCertificates has been initialized already");
                    }
                }
                b = new ow6(context, 0);
            }
        }
        return b;
    }

    public static final wti b(PackageInfo packageInfo, wti... wtiVarArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr != null) {
            if (signatureArr.length != 1) {
                Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
                return null;
            }
            bwi bwiVar = new bwi(packageInfo.signatures[0].toByteArray());
            for (int i = 0; i < wtiVarArr.length; i++) {
                if (wtiVarArr[i].equals(bwiVar)) {
                    return wtiVarArr[i];
                }
            }
        }
        return null;
    }

    public static final boolean c(PackageInfo packageInfo, boolean z) {
        PackageInfo packageInfo2;
        if (!z) {
            packageInfo2 = packageInfo;
        } else if (packageInfo != null) {
            if ("com.android.vending".equals(packageInfo.packageName) || "com.google.android.gms".equals(packageInfo.packageName)) {
                ApplicationInfo applicationInfo = packageInfo.applicationInfo;
                z = (applicationInfo == null || (applicationInfo.flags & 129) == 0) ? false : true;
            }
            packageInfo2 = packageInfo;
        } else {
            packageInfo2 = null;
        }
        if (packageInfo != null && packageInfo2.signatures != null) {
            if ((z ? b(packageInfo2, j0j.a) : b(packageInfo2, j0j.a[0])) != null) {
                return true;
            }
        }
        return false;
    }
}
