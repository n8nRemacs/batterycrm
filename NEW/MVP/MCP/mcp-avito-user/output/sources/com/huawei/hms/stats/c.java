package com.huawei.hms.stats;

import com.huawei.hms.support.log.HMSLog;

/* compiled from: HianalyticsExist.java */
/* loaded from: classes7.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f363611a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static boolean f363612b = false;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f363613c = false;

    public static boolean a() {
        synchronized (f363611a) {
            if (!f363612b) {
                try {
                    Class.forName("com.huawei.hianalytics.process.HiAnalyticsInstance");
                } catch (ClassNotFoundException unused) {
                    HMSLog.i("HianalyticsExist", "In isHianalyticsExist, Failed to find class HiAnalyticsConfig.");
                }
                f363612b = true;
                HMSLog.i("HianalyticsExist", "hianalytics exist: " + f363613c);
            }
        }
        return f363613c;
    }
}
