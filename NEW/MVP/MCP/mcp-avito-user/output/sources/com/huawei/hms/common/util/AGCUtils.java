package com.huawei.hms.common.util;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import com.huawei.agconnect.c;
import com.huawei.agconnect.config.a.b;
import com.huawei.agconnect.core.a.e;
import com.huawei.agconnect.g;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.HMSPackageManager;
import java.io.IOException;

/* loaded from: classes7.dex */
public class AGCUtils {
    /* JADX WARN: Removed duplicated region for block: B:17:0x006a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String a(android.content.Context r7, java.lang.String r8) throws java.io.IOException {
        /*
            java.lang.String r0 = "AGCUtils"
            java.lang.String r1 = "Get "
            java.lang.String r2 = ""
            r3 = 0
            com.huawei.agconnect.g r4 = new com.huawei.agconnect.g     // Catch: java.lang.Throwable -> L2a java.lang.NullPointerException -> L2c java.io.IOException -> L2e
            r4.<init>()     // Catch: java.lang.Throwable -> L2a java.lang.NullPointerException -> L2c java.io.IOException -> L2e
            android.content.res.Resources r5 = r7.getResources()     // Catch: java.lang.Throwable -> L2a java.lang.NullPointerException -> L2c java.io.IOException -> L2e
            android.content.res.AssetManager r5 = r5.getAssets()     // Catch: java.lang.Throwable -> L2a java.lang.NullPointerException -> L2c java.io.IOException -> L2e
            java.lang.String r6 = "agconnect-services.json"
            java.io.InputStream r3 = r5.open(r6)     // Catch: java.lang.Throwable -> L2a java.lang.NullPointerException -> L2c java.io.IOException -> L2e
            r4.f363168a = r3     // Catch: java.lang.Throwable -> L2a java.lang.NullPointerException -> L2c java.io.IOException -> L2e
            com.huawei.agconnect.config.a.b r5 = new com.huawei.agconnect.config.a.b     // Catch: java.lang.Throwable -> L2a java.lang.NullPointerException -> L2c java.io.IOException -> L2e
            java.util.HashMap r6 = r4.f363169b     // Catch: java.lang.Throwable -> L2a java.lang.NullPointerException -> L2c java.io.IOException -> L2e
            java.util.ArrayList r4 = r4.f363170c     // Catch: java.lang.Throwable -> L2a java.lang.NullPointerException -> L2c java.io.IOException -> L2e
            r5.<init>(r7, r3, r6, r4)     // Catch: java.lang.Throwable -> L2a java.lang.NullPointerException -> L2c java.io.IOException -> L2e
            java.lang.String r7 = r5.getString(r8)     // Catch: java.lang.Throwable -> L2a java.lang.NullPointerException -> L2c java.io.IOException -> L2e
            goto L61
        L2a:
            r7 = move-exception
            goto L82
        L2c:
            r7 = move-exception
            goto L30
        L2e:
            r7 = move-exception
            goto L49
        L30:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2a
            r4.<init>(r1)     // Catch: java.lang.Throwable -> L2a
            r4.append(r8)     // Catch: java.lang.Throwable -> L2a
            java.lang.String r1 = " with AGConnectServicesConfig failed: "
            r4.append(r1)     // Catch: java.lang.Throwable -> L2a
            r4.append(r7)     // Catch: java.lang.Throwable -> L2a
            java.lang.String r7 = r4.toString()     // Catch: java.lang.Throwable -> L2a
            com.huawei.hms.support.log.HMSLog.e(r0, r7)     // Catch: java.lang.Throwable -> L2a
        L47:
            r7 = r2
            goto L61
        L49:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2a
            r4.<init>(r1)     // Catch: java.lang.Throwable -> L2a
            r4.append(r8)     // Catch: java.lang.Throwable -> L2a
            java.lang.String r1 = " failed: "
            r4.append(r1)     // Catch: java.lang.Throwable -> L2a
            r4.append(r7)     // Catch: java.lang.Throwable -> L2a
            java.lang.String r7 = r4.toString()     // Catch: java.lang.Throwable -> L2a
            com.huawei.hms.support.log.HMSLog.e(r0, r7)     // Catch: java.lang.Throwable -> L2a
            goto L47
        L61:
            com.huawei.hms.utils.IOUtils.closeQuietly(r3)
            boolean r1 = android.text.TextUtils.isEmpty(r7)
            if (r1 != 0) goto L6b
            return r7
        L6b:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r1 = "The "
            r7.<init>(r1)
            r7.append(r8)
            java.lang.String r8 = " is null."
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            com.huawei.hms.support.log.HMSLog.e(r0, r7)
            return r2
        L82:
            com.huawei.hms.utils.IOUtils.closeQuietly(r3)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.common.util.AGCUtils.a(android.content.Context, java.lang.String):java.lang.String");
    }

    public static String b(Context context) {
        Bundle bundle;
        Object obj;
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null) {
            HMSLog.e("AGCUtils", "In getMetaDataCpId, Failed to get 'PackageManager' instance.");
            return "";
        }
        try {
            ApplicationInfo applicationInfo = packageManager.getPackageInfo(context.getPackageName(), 128).applicationInfo;
            if (applicationInfo == null || (bundle = applicationInfo.metaData) == null || (obj = bundle.get("com.huawei.hms.client.cpid")) == null) {
                HMSLog.i("AGCUtils", "In getMetaDataCpId, Failed to read meta data for the CpId.");
                return "";
            }
            String strValueOf = String.valueOf(obj);
            return strValueOf.startsWith("cpid=") ? strValueOf.substring(5) : strValueOf;
        } catch (PackageManager.NameNotFoundException unused) {
            HMSLog.e("AGCUtils", "In getMetaDataCpId, Failed to read meta data for the CpId.");
            return "";
        } catch (RuntimeException e12) {
            HMSLog.e("AGCUtils", "In getMetaDataCpId, Failed to read meta data for the CpId.", e12);
            return "";
        }
    }

    public static boolean c(Context context) {
        return context.getPackageName().equals(HMSPackageManager.getInstance(context).getHMSPackageNameForMultiService());
    }

    public static String getAppId(Context context) throws IOException {
        String string;
        if (c(context)) {
            string = a(context, "client/app_id");
            if (!TextUtils.isEmpty(string)) {
                return string;
            }
        } else {
            string = null;
        }
        try {
            c cVarB = c.b();
            if (cVarB.a() != context) {
                g gVar = new g();
                cVarB = e.d(new b(context, gVar.f363168a, gVar.f363169b, gVar.f363170c), false);
            }
            string = cVarB.c().getString("client/app_id");
        } catch (NullPointerException unused) {
            HMSLog.e("AGCUtils", "Get appId with AGConnectServicesConfig failed");
        }
        if (!TextUtils.isEmpty(string)) {
            return string;
        }
        String strA = a(context);
        return !TextUtils.isEmpty(strA) ? strA : a(context, "client/app_id");
    }

    public static String getCpId(Context context) {
        String string;
        if (c(context)) {
            return a(context, "client/cp_id");
        }
        try {
            c cVarB = c.b();
            if (cVarB.a() != context) {
                g gVar = new g();
                cVarB = e.d(new b(context, gVar.f363168a, gVar.f363169b, gVar.f363170c), false);
            }
            string = cVarB.c().getString("client/cp_id");
        } catch (NullPointerException unused) {
            HMSLog.e("AGCUtils", "Get cpid with AGConnectServicesConfig failed");
            string = null;
        }
        if (!TextUtils.isEmpty(string)) {
            return string;
        }
        String strB = b(context);
        return !TextUtils.isEmpty(strB) ? strB : a(context, "client/cp_id");
    }

    public static String a(Context context) {
        Bundle bundle;
        Object obj;
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null) {
            HMSLog.e("AGCUtils", "In getMetaDataAppId, Failed to get 'PackageManager' instance.");
            return "";
        }
        try {
            ApplicationInfo applicationInfo = packageManager.getPackageInfo(context.getPackageName(), 128).applicationInfo;
            if (applicationInfo != null && (bundle = applicationInfo.metaData) != null && (obj = bundle.get("com.huawei.hms.client.appid")) != null) {
                String strValueOf = String.valueOf(obj);
                return strValueOf.startsWith("appid=") ? strValueOf.substring(6) : strValueOf;
            }
            HMSLog.e("AGCUtils", "In getMetaDataAppId, Failed to read meta data for the AppID.");
            return "";
        } catch (PackageManager.NameNotFoundException unused) {
            HMSLog.e("AGCUtils", "In getMetaDataAppId, Failed to read meta data for the AppID.");
            return "";
        } catch (RuntimeException e12) {
            HMSLog.e("AGCUtils", "In getMetaDataAppId, Failed to read meta data for the AppID.", e12);
            return "";
        }
    }
}
