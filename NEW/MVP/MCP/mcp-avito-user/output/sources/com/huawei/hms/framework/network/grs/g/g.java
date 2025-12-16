package com.huawei.hms.framework.network.grs.g;

import com.huawei.hms.framework.common.ExceptionCode;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.common.StringUtils;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import com.huawei.hms.framework.common.hianalytics.LinkedHashMapPack;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.LinkedHashMap;

/* loaded from: classes7.dex */
public class g {
    public static LinkedHashMap a(e eVar) {
        LinkedHashMapPack linkedHashMapPack = new LinkedHashMapPack();
        IOException iOException = eVar.f363570m;
        if (iOException != null) {
            linkedHashMapPack.put("error_code", ExceptionCode.getErrorCodeFromException(iOException));
            linkedHashMapPack.put(CrashHianalyticsData.EXCEPTION_NAME, iOException.getClass().getSimpleName());
            linkedHashMapPack.put("message", StringUtils.anonymizeMessage(iOException.getMessage()));
        } else {
            linkedHashMapPack.put("error_code", eVar.f363560c);
            linkedHashMapPack.put(CrashHianalyticsData.EXCEPTION_NAME, eVar.f363566i);
        }
        try {
            linkedHashMapPack.put("domain", new URL(eVar.f363571n).getHost());
        } catch (MalformedURLException e12) {
            Logger.w("HaReportHelper", "report host MalformedURLException", e12);
        }
        linkedHashMapPack.put("req_start_time", eVar.f363562e);
        linkedHashMapPack.put("req_end_time", eVar.f363563f);
        linkedHashMapPack.put("req_total_time", eVar.f363561d);
        return linkedHashMapPack.getAll();
    }
}
