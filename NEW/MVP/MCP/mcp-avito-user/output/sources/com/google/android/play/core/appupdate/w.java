package com.google.android.play.core.appupdate;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import android.os.Bundle;
import android.util.Base64;
import android.util.Log;
import com.google.android.play.core.appupdate.internal.C37101c;
import com.yandex.metrica.plugins.PluginErrorDetails;
import j.P;
import j.k0;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.play:app-update@@2.1.0 */
/* loaded from: classes6.dex */
final class w {

    /* renamed from: e, reason: collision with root package name */
    public static final com.google.android.play.core.appupdate.internal.s f358078e = new com.google.android.play.core.appupdate.internal.s("AppUpdateService");

    /* renamed from: f, reason: collision with root package name */
    public static final Intent f358079f = new Intent("com.google.android.play.core.install.BIND_UPDATE_SERVICE").setPackage("com.android.vending");

    /* renamed from: a, reason: collision with root package name */
    @k0
    @P
    public final com.google.android.play.core.appupdate.internal.D f358080a;

    /* renamed from: b, reason: collision with root package name */
    public final String f358081b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f358082c;

    /* renamed from: d, reason: collision with root package name */
    public final y f358083d;

    public w(Context context, y yVar) throws NoSuchAlgorithmException {
        String strEncodeToString;
        this.f358081b = context.getPackageName();
        this.f358082c = context;
        this.f358083d = yVar;
        com.google.android.play.core.appupdate.internal.s sVar = C37101c.f358032a;
        try {
            if (context.getPackageManager().getApplicationInfo("com.android.vending", 0).enabled) {
                Signature[] signatureArr = context.getPackageManager().getPackageInfo("com.android.vending", 64).signatures;
                if (signatureArr == null || (signatureArr.length) == 0) {
                    Object[] objArr = new Object[0];
                    com.google.android.play.core.appupdate.internal.s sVar2 = C37101c.f358032a;
                    sVar2.getClass();
                    if (Log.isLoggable("PlayCore", 5)) {
                        com.google.android.play.core.appupdate.internal.s.d(sVar2.f358045a, "Phonesky package is not signed -- possibly self-built package. Could not verify.", objArr);
                        return;
                    }
                    return;
                }
                for (Signature signature : signatureArr) {
                    byte[] byteArray = signature.toByteArray();
                    try {
                        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                        messageDigest.update(byteArray);
                        strEncodeToString = Base64.encodeToString(messageDigest.digest(), 11);
                    } catch (NoSuchAlgorithmException unused) {
                        strEncodeToString = "";
                    }
                    if (!"8P1sW0EPJcslw7UzRsiXL64w-O50Ed-RBICtay1g24M".equals(strEncodeToString)) {
                        String str = Build.TAGS;
                        if ((!str.contains("dev-keys") && !str.contains("test-keys")) || !"GXWy8XF3vIml3_MfnmSmyuKBpT3B0dWbHRR_4cgq-gA".equals(strEncodeToString)) {
                        }
                    }
                    Context applicationContext = context.getApplicationContext();
                    context = applicationContext != null ? applicationContext : context;
                    int i12 = q.f358067a;
                    this.f358080a = new com.google.android.play.core.appupdate.internal.D(context, f358078e, f358079f);
                    return;
                }
            }
        } catch (PackageManager.NameNotFoundException unused2) {
        }
    }

    public static Bundle a(w wVar, String str) {
        Integer numValueOf;
        Bundle bundle = new Bundle();
        bundle.putAll(b());
        bundle.putString("package.name", str);
        try {
            numValueOf = Integer.valueOf(wVar.f358082c.getPackageManager().getPackageInfo(wVar.f358082c.getPackageName(), 0).versionCode);
        } catch (PackageManager.NameNotFoundException unused) {
            Object[] objArr = new Object[0];
            com.google.android.play.core.appupdate.internal.s sVar = f358078e;
            sVar.getClass();
            if (Log.isLoggable("PlayCore", 6)) {
                com.google.android.play.core.appupdate.internal.s.d(sVar.f358045a, "The current version of the app could not be retrieved", objArr);
            }
            numValueOf = null;
        }
        if (numValueOf != null) {
            bundle.putInt("app.version.code", numValueOf.intValue());
        }
        return bundle;
    }

    public static Bundle b() {
        Map map;
        Bundle bundle = new Bundle();
        Bundle bundle2 = new Bundle();
        HashMap map2 = com.google.android.play.core.appupdate.internal.o.f358038a;
        synchronized (com.google.android.play.core.appupdate.internal.o.class) {
            try {
                HashMap map3 = com.google.android.play.core.appupdate.internal.o.f358038a;
                if (!map3.containsKey("app_update")) {
                    HashMap map4 = new HashMap();
                    map4.put("java", 11004);
                    map3.put("app_update", map4);
                }
                map = (Map) map3.get("app_update");
            } catch (Throwable th2) {
                throw th2;
            }
        }
        bundle2.putInt("playcore_version_code", ((Integer) map.get("java")).intValue());
        if (map.containsKey("native")) {
            bundle2.putInt("playcore_native_version", ((Integer) map.get("native")).intValue());
        }
        if (map.containsKey(PluginErrorDetails.Platform.UNITY)) {
            bundle2.putInt("playcore_unity_version", ((Integer) map.get(PluginErrorDetails.Platform.UNITY)).intValue());
        }
        bundle.putAll(bundle2);
        bundle.putInt("playcore.version.code", 11004);
        return bundle;
    }
}
