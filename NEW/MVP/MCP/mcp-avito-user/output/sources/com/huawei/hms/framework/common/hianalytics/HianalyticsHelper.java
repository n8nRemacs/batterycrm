package com.huawei.hms.framework.common.hianalytics;

import android.annotation.SuppressLint;
import android.content.Context;
import android.provider.Settings;
import com.huawei.hianalytics.process.HiAnalyticsInstance;
import com.huawei.hianalytics.process.HiAnalyticsManager;
import com.huawei.hms.framework.common.ContextHolder;
import com.huawei.hms.framework.common.ExecutorsUtils;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.common.StringUtils;
import com.huawei.hms.support.hianalytics.HiAnalyticsUtils;
import com.huawei.hms.utils.HMSBIInitializer;
import java.util.LinkedHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;

/* loaded from: classes7.dex */
public class HianalyticsHelper {

    /* renamed from: h, reason: collision with root package name */
    @SuppressLint({"StaticFieldLeak"})
    public static volatile HianalyticsHelper f363475h;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f363476a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f363477b;

    /* renamed from: c, reason: collision with root package name */
    public String f363478c = "hms_hwid";

    /* renamed from: d, reason: collision with root package name */
    public HiAnalyticsInstance f363479d = null;

    /* renamed from: e, reason: collision with root package name */
    public HiAnalyticsInstance f363480e = null;

    /* renamed from: f, reason: collision with root package name */
    public boolean f363481f = false;

    /* renamed from: g, reason: collision with root package name */
    public final ExecutorService f363482g = ExecutorsUtils.newSingleThreadExecutor("report_ha");

    public HianalyticsHelper() {
        try {
            HiAnalyticsManager.getInitFlag("_default_config_tag");
            this.f363476a = true;
        } catch (Throwable unused) {
            Logger.i("HianalyticsHelper", "Hianalytics sdk not found");
            this.f363476a = false;
        }
        if (!this.f363476a) {
            Context appContext = ContextHolder.getAppContext();
            if (appContext == null) {
                Logger.i("HianalyticsHelper", "the appContext hasn't init");
            } else {
                try {
                    HMSBIInitializer.getInstance(appContext).initBI();
                    this.f363477b = true;
                } catch (NoClassDefFoundError unused2) {
                    Logger.w("HianalyticsHelper", "maybe you need add base sdk!");
                } catch (Throwable unused3) {
                    Logger.w("HianalyticsHelper", "the hms base has other error!");
                }
            }
        }
        Logger.v("HianalyticsHelper", "this time the ha %s, mini %s", Boolean.valueOf(this.f363476a), Boolean.valueOf(this.f363477b));
    }

    public static HianalyticsHelper getInstance() {
        if (f363475h == null) {
            synchronized (HianalyticsHelper.class) {
                try {
                    if (f363475h == null) {
                        f363475h = new HianalyticsHelper();
                    }
                } finally {
                }
            }
        }
        return f363475h;
    }

    public final boolean a() {
        if (HiAnalyticsManager.getInitFlag("_default_config_tag")) {
            if (this.f363480e == null) {
                this.f363480e = HiAnalyticsManager.getInstanceByTag("_default_config_tag");
            }
            return this.f363480e != null;
        }
        if (this.f363479d == null) {
            this.f363479d = HiAnalyticsManager.getInstanceByTag(this.f363478c);
        }
        return this.f363479d != null;
    }

    public void enablePrivacyPolicy(boolean z12) {
        this.f363481f = z12;
    }

    public ExecutorService getReportExecutor() {
        return this.f363482g;
    }

    public boolean isEnableReport(Context context) {
        if (this.f363477b) {
            return true;
        }
        if (this.f363476a) {
            return isEnableReportNoSeed(context);
        }
        return false;
    }

    public boolean isEnableReportNoSeed(Context context) {
        if (this.f363477b) {
            return true;
        }
        if (!this.f363476a) {
            Logger.i("HianalyticsHelper", "Hianalytics sdk need to be initialized");
            return false;
        }
        if (context == null) {
            Logger.i("HianalyticsHelper", "HianalyticsHelper context can't be null");
            return false;
        }
        if (this.f363481f) {
            return a();
        }
        if (Settings.Secure.getInt(context.getContentResolver(), "user_experience_involved", -1) == 1) {
            return a();
        }
        Logger.i("HianalyticsHelper", "user experience involved needs to be opened");
        return false;
    }

    public void onEvent(LinkedHashMap<String, String> linkedHashMap, String str) {
        onEvent(linkedHashMap, str, 1);
    }

    public void reportException(final Throwable th2, final String str) {
        if (getInstance().isEnableReport(ContextHolder.getAppContext())) {
            final String name = Thread.currentThread().getName();
            try {
                this.f363482g.submit(new Runnable() { // from class: com.huawei.hms.framework.common.hianalytics.HianalyticsHelper.1
                    @Override // java.lang.Runnable
                    public void run() {
                        CrashHianalyticsData crashHianalyticsData = new CrashHianalyticsData();
                        crashHianalyticsData.put(HianalyticsBaseData.SDK_VERSION, "5.0.8.301");
                        crashHianalyticsData.put(CrashHianalyticsData.CRASH_TYPE, "exception");
                        crashHianalyticsData.put(CrashHianalyticsData.THREAD_NAME, name);
                        crashHianalyticsData.put(CrashHianalyticsData.EXCEPTION_NAME, th2.getClass().getName());
                        crashHianalyticsData.put("message", StringUtils.anonymizeMessage(th2.getMessage()));
                        crashHianalyticsData.put(CrashHianalyticsData.STACK_TRACE, StringUtils.getTraceInfo(th2));
                        HianalyticsHelper.getInstance().onEvent(crashHianalyticsData.get(), str);
                    }
                });
            } catch (RejectedExecutionException unused) {
                Logger.i("HianalyticsHelper", "reportException error RejectedExecutionException");
            } catch (Exception unused2) {
                Logger.i("HianalyticsHelper", "reportException error!", th2);
            }
        }
    }

    public void setHaTag(String str) {
        this.f363478c = str;
    }

    public void onEvent(LinkedHashMap<String, String> linkedHashMap, String str, int i12) {
        HiAnalyticsInstance hiAnalyticsInstance;
        if (this.f363477b) {
            Context appContext = ContextHolder.getAppContext();
            if (appContext != null && linkedHashMap != null) {
                Logger.v("HianalyticsHelper", "data = %s", linkedHashMap);
                try {
                    HiAnalyticsUtils.getInstance().onNewEvent(appContext, str, linkedHashMap, i12);
                } catch (NoSuchMethodError unused) {
                    Logger.w("HianalyticsHelper", "may be you need upgrade stats sdk");
                } catch (Throwable unused2) {
                    Logger.i("HianalyticsHelper", "the stats has other error,pls check it");
                }
            }
        } else if (i12 == 0) {
            Logger.v("HianalyticsHelper", "the base sdk isn't exsit, and reportType is %s", Integer.valueOf(i12));
            return;
        }
        if (this.f363476a && linkedHashMap != null) {
            Logger.v("HianalyticsHelper", "data = %s", linkedHashMap);
            if (HiAnalyticsManager.getInitFlag("_default_config_tag") && (hiAnalyticsInstance = this.f363480e) != null) {
                hiAnalyticsInstance.onEvent(1, str, linkedHashMap);
                return;
            }
            HiAnalyticsInstance hiAnalyticsInstance2 = this.f363479d;
            if (hiAnalyticsInstance2 != null) {
                hiAnalyticsInstance2.onEvent(1, str, linkedHashMap);
            } else {
                Logger.e("HianalyticsHelper", "the has has error,has init but is null!");
            }
        }
    }

    public void onEvent(LinkedHashMap<String, String> linkedHashMap) {
        onEvent(linkedHashMap, HianalyticsBaseData.EVENT_ID);
    }
}
