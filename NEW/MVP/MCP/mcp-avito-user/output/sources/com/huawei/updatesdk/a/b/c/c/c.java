package com.huawei.updatesdk.a.b.c.c;

import androidx.compose.ui.graphics.colorspace.e;
import androidx.media3.exoplayer.analytics.m;
import com.huawei.hms.framework.common.ContainerUtils;
import com.huawei.updatesdk.a.a.d.g;
import com.huawei.updatesdk.a.a.d.h;
import com.huawei.updatesdk.service.appmgr.bean.SDKNetTransmission;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes7.dex */
public class c {
    public static final String CLIENT_API = "clientApi";
    private static final String END_FLAG = "_";
    private static String url;

    @SDKNetTransmission
    private String method;

    @SDKNetTransmission
    private String ver = "1.1";

    public String a() throws IllegalAccessException, SecurityException, IllegalArgumentException {
        e();
        Map<String, Field> mapC = c();
        int size = mapC.size();
        String[] strArr = new String[size];
        mapC.keySet().toArray(strArr);
        Arrays.sort(strArr);
        StringBuilder sb2 = new StringBuilder();
        int i12 = 0;
        do {
            String strA = a(mapC.get(strArr[i12]));
            if (strA != null) {
                m.p(sb2, strArr[i12], ContainerUtils.KEY_VALUE_DELIMITER, h.a(strA), ContainerUtils.FIELD_DELIMITER);
            }
            i12++;
        } while (i12 < size);
        int length = sb2.length();
        if (length > 0) {
            int i13 = length - 1;
            if (sb2.charAt(i13) == '&') {
                sb2.deleteCharAt(i13);
            }
        }
        return sb2.toString();
    }

    public String b() {
        return this.method;
    }

    public Map<String, Field> c() throws SecurityException {
        HashMap map = new HashMap();
        for (Field field : g.a(getClass())) {
            field.setAccessible(true);
            String name = field.getName();
            if (name.endsWith(END_FLAG) || field.isAnnotationPresent(SDKNetTransmission.class)) {
                if (name.endsWith(END_FLAG)) {
                    name = e.h(1, 0, name);
                }
                map.put(name, field);
            }
        }
        return map;
    }

    public String d() {
        return AK.c.s(new StringBuilder(), url, CLIENT_API);
    }

    public void b(String str) {
        this.ver = str;
    }

    public static void c(String str) {
        url = str;
    }

    private String a(Field field) throws IllegalAccessException, IllegalArgumentException {
        Object obj = field.get(this);
        if (obj instanceof b) {
            return ((b) obj).toJson();
        }
        if (obj != null) {
            return String.valueOf(obj);
        }
        return null;
    }

    public void a(String str) {
        this.method = str;
    }

    public void e() {
    }
}
