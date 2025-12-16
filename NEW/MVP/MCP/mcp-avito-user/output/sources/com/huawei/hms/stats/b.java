package com.huawei.hms.stats;

import android.content.Context;
import com.huawei.hianalytics.process.HiAnalyticsInstance;
import com.huawei.hms.utils.HMSBIInitializer;
import java.util.LinkedHashMap;

/* compiled from: HiAnalyticsOfCpUtils.java */
/* loaded from: classes7.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public static HiAnalyticsInstance f363610a;

    public static HiAnalyticsInstance a(Context context) {
        HiAnalyticsInstance analyticsInstance = HMSBIInitializer.getInstance(context).getAnalyticsInstance();
        f363610a = analyticsInstance;
        return analyticsInstance;
    }

    public static void a(Context context, String str, String str2) {
        if (a(context) != null) {
            f363610a.onEvent(context, str, str2);
        }
    }

    public static void a(Context context, int i12, String str, LinkedHashMap<String, String> linkedHashMap) {
        if (a(context) != null) {
            f363610a.onEvent(i12, str, linkedHashMap);
        }
    }

    public static void a(Context context, int i12) {
        if (a(context) != null) {
            f363610a.onReport(i12);
        }
    }
}
