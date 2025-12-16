package com.huawei.updatesdk.b.h;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.ProviderInfo;
import android.graphics.Typeface;
import android.net.Uri;
import android.text.TextUtils;
import android.widget.TextView;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.List;

/* loaded from: classes7.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private static Typeface f363869a;

    public static int a(long j12, long j13) {
        if (j13 <= 0) {
            return 0;
        }
        return Math.min((int) Math.round((j12 / j13) * 100.0d), 100);
    }

    public static String a(int i12) {
        NumberFormat percentInstance = NumberFormat.getPercentInstance();
        percentInstance.setMinimumFractionDigits(0);
        return percentInstance.format(i12 / 100.0d);
    }

    public static String a(Context context, long j12) {
        if (j12 == 0) {
            return context.getString(c.c(context, "upsdk_storage_utils"), "0");
        }
        DecimalFormat decimalFormat = j12 > 104857 ? new DecimalFormat("###.#") : j12 > 10485 ? new DecimalFormat("###.##") : null;
        return decimalFormat != null ? context.getString(c.c(context, "upsdk_storage_utils"), decimalFormat.format(j12 / 1048576.0d)) : context.getString(c.c(context, "upsdk_storage_utils"), "0.01");
    }

    public static void a(TextView textView) {
        try {
            if (a.f().b() > 0) {
                if (f363869a == null) {
                    f363869a = Typeface.create("HnChinese-medium", 0);
                }
                Typeface typeface = f363869a;
                if (typeface != null) {
                    textView.setTypeface(typeface);
                }
            }
        } catch (Exception e12) {
            com.huawei.updatesdk.a.a.c.a.a.a.b("TextTypefaceUtil", "setSubTextType TextView Exception" + e12.toString());
        }
    }

    public static boolean a(Context context, Uri uri, String str) {
        if (uri == null || TextUtils.isEmpty(str)) {
            return false;
        }
        ProviderInfo providerInfoResolveContentProvider = context.getPackageManager().resolveContentProvider(uri.getAuthority(), 0);
        if (providerInfoResolveContentProvider == null) {
            com.huawei.updatesdk.a.a.a.a("ProviderCheck", "invalid provider: " + uri.toString());
            return false;
        }
        ApplicationInfo applicationInfo = providerInfoResolveContentProvider.applicationInfo;
        if (applicationInfo == null || !TextUtils.equals(str, applicationInfo.packageName)) {
            return false;
        }
        com.huawei.updatesdk.a.a.a.b("ProviderCheck", "valid provider: " + uri.toString());
        return true;
    }

    public static boolean a(List list) {
        return list == null || list.size() <= 0;
    }
}
