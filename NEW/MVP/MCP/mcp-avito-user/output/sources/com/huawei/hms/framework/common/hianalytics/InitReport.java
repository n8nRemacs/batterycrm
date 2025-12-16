package com.huawei.hms.framework.common.hianalytics;

import com.huawei.hms.framework.common.Logger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.RejectedExecutionException;

/* loaded from: classes7.dex */
public class InitReport {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f363483a = false;

    /* renamed from: b, reason: collision with root package name */
    public static ArrayList f363484b;

    public static void access$000() {
        try {
            Iterator it = f363484b.iterator();
            while (it.hasNext()) {
                HianalyticsHelper.getInstance().getReportExecutor().submit((Runnable) it.next());
            }
        } catch (NullPointerException unused) {
            Logger.e("HaReport", "event is null occured");
        } catch (RejectedExecutionException unused2) {
            Logger.e("HaReport", "submit failed of rejected execution exception");
        } catch (Exception unused3) {
            Logger.e("HaReport", "submit failed because of some exception");
        }
    }

    public static void enableConnectNet() {
        if (f363483a) {
            return;
        }
        f363483a = true;
        try {
            HianalyticsHelper.getInstance().getReportExecutor().submit(new Runnable() { // from class: com.huawei.hms.framework.common.hianalytics.InitReport.1
                @Override // java.lang.Runnable
                public void run() {
                    InitReport.access$000();
                }
            });
        } catch (RejectedExecutionException unused) {
            Logger.e("HaReport", "submit failed of rejected execution exception");
        }
    }

    public static void reportWhenInit(Runnable runnable) {
        if (f363483a) {
            HianalyticsHelper.getInstance().getReportExecutor().execute(runnable);
            return;
        }
        if (f363484b == null) {
            f363484b = new ArrayList();
        }
        if (f363484b.size() > 10) {
            Logger.e("TAG", "the event to be report when init exceed the limit!");
        } else {
            f363484b.add(runnable);
        }
    }
}
