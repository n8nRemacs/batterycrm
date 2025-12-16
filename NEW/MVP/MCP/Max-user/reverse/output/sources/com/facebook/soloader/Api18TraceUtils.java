package com.facebook.soloader;

import android.annotation.TargetApi;
import android.os.Trace;
import defpackage.az1;
import defpackage.ez4;
import defpackage.u45;

@ez4
@TargetApi(18)
/* loaded from: classes.dex */
class Api18TraceUtils {
    public static void a(String str, String str2, String str3) {
        String strK = u45.k(str, str2, str3);
        if (strK.length() > 127 && str2 != null) {
            int length = (127 - str.length()) - str3.length();
            StringBuilder sbM = az1.m(str);
            sbM.append(str2.substring(0, length));
            sbM.append(str3);
            strK = sbM.toString();
        }
        Trace.beginSection(strK);
    }
}
