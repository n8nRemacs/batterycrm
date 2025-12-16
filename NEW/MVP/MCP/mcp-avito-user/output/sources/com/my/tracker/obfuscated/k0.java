package com.my.tracker.obfuscated;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.text.TextUtils;
import com.my.tracker.obfuscated.y0;

/* loaded from: classes7.dex */
public final class k0 {
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(Context context, f2 f2Var, C37848w c37848w, g1 g1Var) {
        String string;
        String str;
        char c12;
        String str2;
        Context context2;
        f2 f2Var2;
        long jB2;
        PackageInfo packageInfoA = AbstractC37840n.a(context);
        if (packageInfoA != null) {
            string = Build.VERSION.SDK_INT >= 28 ? Long.toString(packageInfoA.getLongVersionCode()) : Integer.toString(packageInfoA.versionCode);
            str = packageInfoA.versionName;
        } else {
            string = "";
            str = string;
        }
        z0 z0VarA = z0.a(context);
        String strA = z0VarA.a();
        String strG = f2Var.g();
        if (!strG.equals(z0VarA.c())) {
            e2.a("InstallHandler: tracking install");
            if (packageInfoA != null) {
                jB2 = c2.b(packageInfoA.firstInstallTime);
                context2 = context;
                f2Var2 = f2Var;
            } else {
                context2 = context;
                f2Var2 = f2Var;
                jB2 = 0;
            }
            y0 y0VarA = y0.a(c37848w, f2Var2, context2);
            y0.a aVarA = y0VarA.a();
            c37848w.a(jB2, AbstractC37840n.b(context), aVarA);
            if (aVarA == null) {
                y0VarA.c();
            }
            z0VarA.e(strG);
            c12 = 1;
        } else if (string.equals(strA)) {
            c12 = 0;
        } else {
            if (strA.isEmpty()) {
                str2 = "InstallHandler: tracking update";
            } else {
                str2 = "InstallHandler: tracking update from" + strA + " to " + string;
            }
            e2.a(str2);
            c37848w.a(z0VarA.e(), strA, str, string, AbstractC37840n.b(context));
            c12 = 2;
        }
        long jI2 = z0VarA.i();
        long jA2 = c2.a();
        String strB = f2Var.b();
        if (!TextUtils.isEmpty(strB)) {
            if (jA2 - jI2 < 604800 || jI2 == 0) {
                e2.a("InstallHandler: tracking apkPreinstallParams");
                c37848w.b(strB);
            } else {
                e2.a("InstallHandler: can't track apkPreinstallParams, tracking period has ended");
            }
        }
        if (c12 == 0) {
            e2.a("InstallHandler: no install/update");
            g1Var.a(jI2);
            return;
        }
        if (c12 == 1) {
            z0VarA.b(jA2);
            g1Var.a(jA2);
        } else if (c12 == 2) {
            g1Var.a(jI2);
        }
        z0VarA.d(string);
        z0VarA.g(str);
        z0VarA.c(jA2);
    }

    public static void a(f2 f2Var, C37848w c37848w, g1 g1Var, Context context) {
        C37835i.a(new FX0.a(context, f2Var, c37848w, g1Var, 7));
    }
}
