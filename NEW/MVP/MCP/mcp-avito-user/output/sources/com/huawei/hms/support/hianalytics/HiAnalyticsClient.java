package com.huawei.hms.support.hianalytics;

import H01.a;
import android.content.Context;
import com.huawei.hms.common.internal.TransactionIdCreater;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.huawei.hms.utils.Util;
import java.util.Map;

/* loaded from: classes7.dex */
public class HiAnalyticsClient extends a {
    @Deprecated
    public static String reportEntry(Context context, String str) {
        return reportEntry(context, str, Util.getAppId(context), 0);
    }

    public static void reportExit(Context context, String str, String str2, int i12, int i13) {
        reportExit(context, str, str2, Util.getAppId(context), i12, i13, 0);
    }

    public static String reportEntry(Context context, String str, int i12) {
        return reportEntry(context, str, Util.getAppId(context), i12);
    }

    public static void reportExit(Context context, String str, String str2, int i12, int i13, int i14) {
        reportExit(context, str, str2, Util.getAppId(context), i12, i13, i14);
    }

    public static String reportEntry(Context context, String str, String str2, int i12) {
        String id2 = TransactionIdCreater.getId(str2, str);
        Map<String, String> mapForBi = a.getMapForBi(context, str);
        mapForBi.put(HiAnalyticsConstant.HaKey.BI_KEY_APPID, str2);
        mapForBi.put(HiAnalyticsConstant.HaKey.BI_KEY_TRANSID, id2);
        mapForBi.put("direction", HiAnalyticsConstant.Direction.REQUEST);
        mapForBi.put("version", HiAnalyticsUtil.versionCodeToName(String.valueOf(i12)));
        mapForBi.put(HiAnalyticsConstant.HaKey.BI_KEY_PHONETYPE, Util.getSystemProperties("ro.logsystem.usertype", ""));
        HiAnalyticsUtil.getInstance().onNewEvent(context, HiAnalyticsConstant.HMS_SDK_KIT_API_CALLED, mapForBi);
        return id2;
    }

    public static void reportExit(Context context, String str, String str2, String str3, int i12, int i13, int i14) {
        Map<String, String> mapForBi = a.getMapForBi(context, str);
        mapForBi.put(HiAnalyticsConstant.HaKey.BI_KEY_APPID, str3);
        mapForBi.put(HiAnalyticsConstant.HaKey.BI_KEY_TRANSID, str2);
        mapForBi.put("direction", HiAnalyticsConstant.Direction.RESPONSE);
        mapForBi.put(HiAnalyticsConstant.HaKey.BI_KEY_RESULT, String.valueOf(i12));
        mapForBi.put("result", String.valueOf(i13));
        mapForBi.put("version", HiAnalyticsUtil.versionCodeToName(String.valueOf(i14)));
        mapForBi.put(HiAnalyticsConstant.HaKey.BI_KEY_PHONETYPE, Util.getSystemProperties("ro.logsystem.usertype", ""));
        HiAnalyticsUtil.getInstance().onNewEvent(context, HiAnalyticsConstant.HMS_SDK_KIT_API_CALLED, mapForBi);
    }
}
