package com.huawei.hms.framework.common.grs;

import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.huawei.hms.framework.common.StringUtils;
import java.util.Locale;

/* loaded from: classes7.dex */
public class GrsUtils {
    public static String fixResult(String[] strArr, String str) {
        if (strArr.length <= 2) {
            return str;
        }
        if (str.endsWith("/")) {
            StringBuilder sbR = H.r(str);
            sbR.append(strArr[2]);
            return sbR.toString();
        }
        StringBuilder sbZ = r.z(str, "/");
        sbZ.append(strArr[2]);
        return sbZ.toString();
    }

    public static boolean isGRSSchema(String str) {
        return str != null && str.startsWith("grs://");
    }

    public static String[] parseGRSSchema(String str) {
        String[] strArrSplit = StringUtils.substring(str, str.toLowerCase(Locale.ENGLISH).indexOf("grs://") + 6).split("/", 3);
        return strArrSplit.length == 1 ? new String[]{strArrSplit[0], "ROOT"} : strArrSplit;
    }

    public static String[] parseParams(String str) {
        if (str.endsWith("/")) {
            str = StringUtils.substring(str, str.indexOf("grs://"), str.length() - 1);
        }
        return parseGRSSchema(str);
    }
}
