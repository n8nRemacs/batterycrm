package com.yandex.mobile.ads.impl;

import android.os.Build;

/* loaded from: classes8.dex */
public final class h81 implements kc1 {
    @Override // com.yandex.mobile.ads.impl.kc1
    @Y61.k
    public final String a() {
        String property;
        String property2 = null;
        try {
            property = System.getProperty("http.agent");
        } catch (Exception unused) {
            property = null;
        }
        if (property != null && property.length() != 0) {
            return property;
        }
        StringBuilder sbQ = androidx.compose.ui.graphics.colorspace.e.q(64, "Dalvik/");
        try {
            property2 = System.getProperty("java.vm.version");
        } catch (Exception unused2) {
        }
        if (property2 == null || property2.length() == 0) {
            property2 = "1.0.0";
        }
        sbQ.append(property2);
        sbQ.append(" (Linux; U; Android ");
        String str = Build.VERSION.RELEASE;
        if (str.length() == 0) {
            str = "1.0";
        }
        sbQ.append(str);
        if ("REL".equals(Build.VERSION.CODENAME)) {
            String str2 = Build.MODEL;
            if (str2.length() > 0) {
                sbQ.append("; ");
                sbQ.append(str2);
            }
        }
        String str3 = Build.ID;
        if (str3.length() > 0) {
            sbQ.append(" Build/");
            sbQ.append(str3);
        }
        sbQ.append(")");
        return sbQ.toString();
    }
}
