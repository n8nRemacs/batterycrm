package com.huawei.hms.utils;

import android.content.Context;
import android.os.AsyncTask;
import android.text.TextUtils;
import com.huawei.hianalytics.process.HiAnalyticsConfig;
import com.huawei.hianalytics.process.HiAnalyticsInstance;
import com.huawei.hianalytics.process.HiAnalyticsManager;
import com.huawei.hms.framework.network.grs.GrsApp;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.huawei.hms.framework.network.grs.GrsClient;
import com.huawei.hms.framework.network.grs.IQueryUrlCallBack;
import com.huawei.hms.stats.c;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.huawei.hms.support.log.HMSLog;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import x01.C49716a;

/* loaded from: classes7.dex */
public class HMSBIInitializer {

    /* renamed from: d, reason: collision with root package name */
    public static final Object f363685d = new Object();

    /* renamed from: e, reason: collision with root package name */
    public static HMSBIInitializer f363686e;

    /* renamed from: f, reason: collision with root package name */
    public static HiAnalyticsInstance f363687f;

    /* renamed from: a, reason: collision with root package name */
    public final Context f363688a;

    /* renamed from: b, reason: collision with root package name */
    public AtomicBoolean f363689b = new AtomicBoolean(false);

    /* renamed from: c, reason: collision with root package name */
    public boolean f363690c = c.a();

    public class a implements IQueryUrlCallBack {
        public a() {
        }

        @Override // com.huawei.hms.framework.network.grs.IQueryUrlCallBack
        public void onCallBackFail(int i12) {
            HMSLog.e("HMSBIInitializer", "get grs failed, the errorcode is " + i12);
            HMSBIInitializer.this.f363689b.set(false);
        }

        @Override // com.huawei.hms.framework.network.grs.IQueryUrlCallBack
        public void onCallBackSuccess(String str) {
            if (!TextUtils.isEmpty(str)) {
                if (HMSBIInitializer.this.f363690c) {
                    HiAnalyticsConfig hiAnalyticsConfigBuild = new HiAnalyticsConfig.Builder().setEnableImei(false).setEnableUDID(false).setEnableSN(false).setCollectURL(str).build();
                    HiAnalyticsInstance unused = HMSBIInitializer.f363687f = new HiAnalyticsInstance.Builder(HMSBIInitializer.this.f363688a).setOperConf(hiAnalyticsConfigBuild).setMaintConf(new HiAnalyticsConfig.Builder().setEnableImei(false).setEnableUDID(false).setEnableSN(false).setCollectURL(str).build()).create(HiAnalyticsConstant.HA_SERVICE_TAG);
                    HMSBIInitializer.f363687f.setAppid("com.huawei.hwid");
                } else {
                    C49716a.c(HMSBIInitializer.this.f363688a, str);
                }
                HMSLog.i("HMSBIInitializer", "BI URL acquired successfully");
            }
            HMSBIInitializer.this.f363689b.set(false);
        }
    }

    public class b extends AsyncTask<String, Integer, Void> {
        public b() {
        }

        @Override // android.os.AsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void doInBackground(String... strArr) {
            HMSBIInitializer.this.a(strArr[0]);
            return null;
        }

        public /* synthetic */ b(HMSBIInitializer hMSBIInitializer, a aVar) {
            this();
        }
    }

    public HMSBIInitializer(Context context) {
        this.f363688a = context;
    }

    public static HMSBIInitializer getInstance(Context context) {
        synchronized (f363685d) {
            try {
                if (f363686e == null) {
                    Context applicationContext = context.getApplicationContext();
                    if (applicationContext != null) {
                        f363686e = new HMSBIInitializer(applicationContext);
                    } else {
                        f363686e = new HMSBIInitializer(context);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f363686e;
    }

    public HiAnalyticsInstance getAnalyticsInstance() {
        return f363687f;
    }

    public void initBI() {
        boolean zB2 = !this.f363690c ? C49716a.b() : HiAnalyticsManager.getInitFlag(HiAnalyticsConstant.HA_SERVICE_TAG);
        HMSLog.i("HMSBIInitializer", "Builder->biInitFlag :" + zB2);
        if (zB2 || com.huawei.hms.stats.a.c(this.f363688a) || !this.f363689b.compareAndSet(false, true)) {
            return;
        }
        String issueCountryCode = GrsApp.getInstance().getIssueCountryCode(this.f363688a);
        if (!TextUtils.isEmpty(issueCountryCode)) {
            issueCountryCode = issueCountryCode.toUpperCase(Locale.ENGLISH);
        }
        if (!GrsBaseInfo.CountryCodeSource.UNKNOWN.equalsIgnoreCase(issueCountryCode) && !TextUtils.isEmpty(issueCountryCode)) {
            new b(this, null).execute(issueCountryCode);
        } else {
            HMSLog.e("HMSBIInitializer", "Failed to get device issue country");
            this.f363689b.set(false);
        }
    }

    public boolean isInit() {
        return !this.f363690c ? C49716a.b() : HiAnalyticsManager.getInitFlag(HiAnalyticsConstant.HA_SERVICE_TAG);
    }

    public final void a(String str) {
        HMSLog.i("HMSBIInitializer", "Start to query GRS");
        GrsBaseInfo grsBaseInfo = new GrsBaseInfo();
        grsBaseInfo.setIssueCountry(str);
        new GrsClient(this.f363688a, grsBaseInfo).ayncGetGrsUrl("com.huawei.cloud.opensdkhianalytics", "ROOT", new a());
    }
}
