package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;

/* loaded from: classes.dex */
public final /* synthetic */ class ul3 implements rpc {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ul3(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.rpc
    public final Object get() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        switch (this.a) {
            case 0:
                vl3 vl3Var = (vl3) this.b;
                cl3 cl3Var = (cl3) this.c;
                return cl3Var.f.j(new v6d(cl3Var, vl3Var));
            case 1:
                return new y17((Context) this.b, (String) this.c);
            default:
                h06 h06Var = (h06) this.b;
                Context context = (Context) this.c;
                String strC = h06Var.c();
                de4 de4Var = new de4();
                Context contextA = t34.a(context);
                SharedPreferences sharedPreferences = contextA.getSharedPreferences("com.google.firebase.common.prefs:" + strC, 0);
                boolean z = true;
                if (sharedPreferences.contains("firebase_data_collection_default_enabled")) {
                    z = sharedPreferences.getBoolean("firebase_data_collection_default_enabled", true);
                } else {
                    try {
                        PackageManager packageManager = contextA.getPackageManager();
                        if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(contextA.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("firebase_data_collection_default_enabled")) {
                            z = applicationInfo.metaData.getBoolean("firebase_data_collection_default_enabled");
                        }
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
                }
                de4Var.a = z;
                return de4Var;
        }
    }
}
