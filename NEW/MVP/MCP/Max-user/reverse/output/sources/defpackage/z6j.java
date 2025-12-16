package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public abstract class z6j {
    public static final x74 a(x74 x74Var, x74 x74Var2, boolean z) {
        Boolean bool = Boolean.FALSE;
        boolean zBooleanValue = ((Boolean) x74Var.fold(bool, new cj0(12))).booleanValue();
        boolean zBooleanValue2 = ((Boolean) x74Var2.fold(bool, new cj0(12))).booleanValue();
        if (!zBooleanValue && !zBooleanValue2) {
            return x74Var.plus(x74Var2);
        }
        cj0 cj0Var = new cj0(13);
        bd5 bd5Var = bd5.a;
        x74 x74Var3 = (x74) x74Var.fold(bd5Var, cj0Var);
        Object objFold = x74Var2;
        if (zBooleanValue2) {
            objFold = x74Var2.fold(bd5Var, new cj0(14));
        }
        return x74Var3.plus((x74) objFold);
    }

    public static void b(Context context) {
        Context applicationContext;
        PackageManager packageManager;
        ApplicationInfo applicationInfo;
        Bundle bundle;
        if (a7j.b(context).getBoolean("proxy_notification_initialized", false)) {
            return;
        }
        try {
            applicationContext = context.getApplicationContext();
            packageManager = applicationContext.getPackageManager();
        } catch (PackageManager.NameNotFoundException unused) {
        }
        boolean z = (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(applicationContext.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_messaging_notification_delegation_enabled")) ? true : applicationInfo.metaData.getBoolean("firebase_messaging_notification_delegation_enabled");
        if (Build.VERSION.SDK_INT >= 29) {
            new dj(context, z, new n2g(), 3).run();
        } else {
            n5e.f(null);
        }
    }

    public static final x74 c(f84 f84Var, x74 x74Var) {
        x74 x74VarA = a(f84Var.getCoroutineContext(), x74Var, true);
        ep4 ep4Var = gy4.a;
        return (x74VarA == ep4Var || x74VarA.get(jbe.t0) != null) ? x74VarA : x74VarA.plus(ep4Var);
    }

    public static final lqg d(Continuation continuation, x74 x74Var, Object obj) {
        lqg lqgVar = null;
        if (!(continuation instanceof h84)) {
            return null;
        }
        if (x74Var.get(mqg.a) != null) {
            h84 callerFrame = (h84) continuation;
            while (true) {
                if ((callerFrame instanceof dy4) || (callerFrame = callerFrame.getCallerFrame()) == null) {
                    break;
                }
                if (callerFrame instanceof lqg) {
                    lqgVar = (lqg) callerFrame;
                    break;
                }
            }
            if (lqgVar != null) {
                lqgVar.E(x74Var, obj);
            }
        }
        return lqgVar;
    }
}
