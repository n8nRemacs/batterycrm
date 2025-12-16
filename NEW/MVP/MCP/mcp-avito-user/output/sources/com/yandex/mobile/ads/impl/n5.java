package com.yandex.mobile.ads.impl;

import android.net.Uri;
import android.text.TextUtils;
import com.huawei.hms.framework.common.ContainerUtils;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes8.dex */
public final class n5 {
    @j.P
    public static HashMap a(@j.P Map map) {
        if (map == null || map.isEmpty()) {
            return null;
        }
        HashMap map2 = new HashMap();
        StringBuilder sb2 = new StringBuilder();
        for (Map.Entry entry : map.entrySet()) {
            sb2.append(ContainerUtils.FIELD_DELIMITER);
            sb2.append(Uri.encode((String) entry.getKey()));
            sb2.append(ContainerUtils.KEY_VALUE_DELIMITER);
            sb2.append(Uri.encode((String) entry.getValue()));
            if (sb2.length() > 61440) {
                gw0.a("Exceeded the length of the parameter! The maximum size of the parameter is %s bytes. First %s bytes of the parameter will be used", 61440, 61440);
                return map2;
            }
            map2.put((String) entry.getKey(), (String) entry.getValue());
        }
        return map2;
    }

    @j.P
    public static String a(@j.P String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            int length = Uri.encode(str).length();
            if (length <= 1024) {
                return str;
            }
            gw0.a("Exceeded the length of the parameter! The maximum size of the parameter is %s bytes. Current size is %s bytes", 1024, Integer.valueOf(length));
            return null;
        } catch (Exception unused) {
            return null;
        }
    }
}
