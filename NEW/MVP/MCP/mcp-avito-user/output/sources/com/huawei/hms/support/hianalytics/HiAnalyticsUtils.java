package com.huawei.hms.support.hianalytics;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hianalytics.process.HiAnalyticsManager;
import com.huawei.hianalytics.util.HiAnalyticTools;
import com.huawei.hms.stats.a;
import com.huawei.hms.stats.b;
import com.huawei.hms.stats.c;
import com.huawei.hms.support.log.HMSLog;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import shark.AndroidResourceIdNames;
import x01.C;
import x01.C49716a;
import x01.C49736v;
import x01.C49740z;
import x01.I;
import x01.a0;
import x01.m0;

/* loaded from: classes7.dex */
public class HiAnalyticsUtils {

    /* renamed from: c, reason: collision with root package name */
    public static final Object f363649c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public static final Object f363650d = new Object();

    /* renamed from: e, reason: collision with root package name */
    public static HiAnalyticsUtils f363651e;

    /* renamed from: a, reason: collision with root package name */
    public int f363652a = 0;

    /* renamed from: b, reason: collision with root package name */
    public boolean f363653b = c.a();

    public static LinkedHashMap<String, String> a(Map<String, String> map) {
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
        if (map != null && map.size() > 0) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    public static HiAnalyticsUtils getInstance() {
        HiAnalyticsUtils hiAnalyticsUtils;
        synchronized (f363649c) {
            try {
                if (f363651e == null) {
                    f363651e = new HiAnalyticsUtils();
                }
                hiAnalyticsUtils = f363651e;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return hiAnalyticsUtils;
    }

    public static String versionCodeToName(String str) throws NumberFormatException {
        if (!TextUtils.isEmpty(str) && (str.length() == 8 || str.length() == 9)) {
            try {
                Integer.parseInt(str);
                return Integer.parseInt(str.substring(0, str.length() - 7)) + "." + Integer.parseInt(str.substring(str.length() - 7, str.length() - 5)) + "." + Integer.parseInt(str.substring(str.length() - 5, str.length() - 3)) + "." + Integer.parseInt(str.substring(str.length() - 3));
            } catch (NumberFormatException unused) {
            }
        }
        return "";
    }

    public void enableLog(Context context) {
        HMSLog.i("HiAnalyticsUtils", "Enable Log");
        if (this.f363653b) {
            HiAnalyticTools.enableLog(context);
        } else {
            C49716a.a();
        }
    }

    public boolean getInitFlag() {
        return !this.f363653b ? C49716a.b() : HiAnalyticsManager.getInitFlag(HiAnalyticsConstant.HA_SERVICE_TAG);
    }

    public boolean hasError(Context context) {
        return a.c(context);
    }

    public void onBuoyEvent(Context context, String str, String str2) throws JSONException {
        if (hasError(context) || context == null) {
            return;
        }
        onEvent2(context, str, str2);
    }

    public void onEvent(Context context, String str, Map<String, String> map) {
        if (hasError(context) || map == null || map.isEmpty() || context == null || !getInitFlag()) {
            return;
        }
        if (this.f363653b) {
            b.a(context, 0, str, a(map));
            b.a(context, 1, str, a(map));
        } else {
            C49716a.d(a(map), str, 0);
            C49716a.d(a(map), str, 1);
        }
        a(context);
    }

    public void onEvent2(Context context, String str, String str2) throws JSONException {
        if (hasError(context) || context == null || !getInitFlag()) {
            return;
        }
        if (this.f363653b) {
            b.a(context, str, str2);
            return;
        }
        if (I.a() != null) {
            C c12 = I.f441967a;
            StringBuilder sb2 = new StringBuilder("HiAnalyticsInstance.onEvent(eventId, mapValue) is execute.TAG : ");
            String str3 = c12.f441946a;
            sb2.append(str3);
            sb2.append(", eventId : ");
            sb2.append(str);
            m0.c(sb2.toString());
            if (!a0.a(256, "eventId", str) || !c12.a(0)) {
                m0.d("hmsSdk", "onEvent() parameters check fail. Nothing will be recorded.TAG: " + str3);
                return;
            }
            if (!a0.a(AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR, "value", str2)) {
                m0.d("hmsSdk", "onEvent() parameter VALUE is overlong, content will be cleared.TAG: " + str3);
                str2 = "";
            }
            C49740z.a().getClass();
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("_constants", str2);
                C49736v.a().getClass();
                C49736v.c(str3, 0, str, jSONObject);
            } catch (JSONException unused) {
                m0.e("hmsSdk", "onEvent():JSON structure Exception!");
            }
        }
    }

    public void onNewEvent(Context context, String str, Map map) throws JSONException {
        if (hasError(context) || map == null || map.isEmpty() || context == null || !getInitFlag()) {
            return;
        }
        if (this.f363653b) {
            b.a(context, 0, str, a((Map<String, String>) map));
            b.a(context, 1, str, a((Map<String, String>) map));
        } else {
            C49716a.d(a((Map<String, String>) map), str, 0);
            C49716a.d(a((Map<String, String>) map), str, 1);
        }
        a(context);
    }

    public void onReport(Context context, String str, Map map) throws JSONException {
        if (hasError(context) || map == null || map.isEmpty() || context == null || !getInitFlag()) {
            return;
        }
        if (!this.f363653b) {
            C49716a.d(a((Map<String, String>) map), str, 0);
            C49716a.d(a((Map<String, String>) map), str, 1);
            C49716a.e();
        } else {
            b.a(context, 0, str, a((Map<String, String>) map));
            b.a(context, 1, str, a((Map<String, String>) map));
            b.a(context, 0);
            b.a(context, 1);
        }
    }

    public void enableLog() {
        HMSLog.i("HiAnalyticsUtils", "Enable Log");
        if (!this.f363653b) {
            C49716a.a();
        } else {
            HMSLog.i("HiAnalyticsUtils", "cp needs to pass in the context, this method is not supported");
        }
    }

    public final void a(Context context) {
        synchronized (f363650d) {
            try {
                int i12 = this.f363652a;
                if (i12 < 60) {
                    this.f363652a = i12 + 1;
                } else {
                    this.f363652a = 0;
                    if (!this.f363653b) {
                        C49716a.e();
                    } else {
                        b.a(context, 0);
                        b.a(context, 1);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void onNewEvent(Context context, String str, Map map, int i12) throws JSONException {
        if (hasError(context)) {
            return;
        }
        if (i12 != 0 && i12 != 1) {
            HMSLog.e("HiAnalyticsUtils", "Data reporting type is not supported");
            return;
        }
        if (map == null || map.isEmpty() || context == null || !getInitFlag()) {
            return;
        }
        if (!this.f363653b) {
            C49716a.d(a((Map<String, String>) map), str, i12);
        } else {
            b.a(context, i12, str, a((Map<String, String>) map));
        }
        a(context);
    }

    public void onReport(Context context, String str, Map map, int i12) throws JSONException {
        if (hasError(context)) {
            return;
        }
        if (i12 != 0 && i12 != 1) {
            HMSLog.e("HiAnalyticsUtils", "Data reporting type is not supported");
            return;
        }
        if (map == null || map.isEmpty() || context == null || !getInitFlag()) {
            return;
        }
        if (!this.f363653b) {
            C49716a.d(a((Map<String, String>) map), str, i12);
            C49716a.e();
        } else {
            b.a(context, i12, str, a((Map<String, String>) map));
            b.a(context, i12);
        }
    }
}
