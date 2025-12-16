package AZ0;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import androidx.core.content.d;
import tZ0.InterfaceC48623c;

/* compiled from: DataCollectionConfigStorage.java */
/* loaded from: classes6.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC48623c f446a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f447b;

    public a(Context context, String str, InterfaceC48623c interfaceC48623c) {
        boolean z12;
        ApplicationInfo applicationInfo;
        Bundle bundle;
        Context contextCreateDeviceProtectedStorageContext = d.createDeviceProtectedStorageContext(context);
        SharedPreferences sharedPreferences = contextCreateDeviceProtectedStorageContext.getSharedPreferences("com.google.firebase.common.prefs:" + str, 0);
        this.f446a = interfaceC48623c;
        boolean z13 = true;
        if (sharedPreferences.contains("firebase_data_collection_default_enabled")) {
            z12 = sharedPreferences.getBoolean("firebase_data_collection_default_enabled", true);
        } else {
            try {
                PackageManager packageManager = contextCreateDeviceProtectedStorageContext.getPackageManager();
                if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(contextCreateDeviceProtectedStorageContext.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("firebase_data_collection_default_enabled")) {
                    z13 = applicationInfo.metaData.getBoolean("firebase_data_collection_default_enabled");
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
            z12 = z13;
        }
        this.f447b = z12;
    }
}
