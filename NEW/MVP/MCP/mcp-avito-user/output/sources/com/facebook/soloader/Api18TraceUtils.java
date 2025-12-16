package com.facebook.soloader;

import android.annotation.TargetApi;
import android.os.Trace;
import androidx.compose.foundation.H;

@InterfaceC36428e
@TargetApi(18)
/* loaded from: classes16.dex */
class Api18TraceUtils {
    public static void a(String str, @I41.h String str2, String str3) {
        String strR = androidx.appcompat.app.r.r(str, str2, str3);
        if (strR.length() > 127 && str2 != null) {
            int length = (127 - str.length()) - str3.length();
            StringBuilder sbR = H.r(str);
            sbR.append(str2.substring(0, length));
            sbR.append(str3);
            strR = sbR.toString();
        }
        Trace.beginSection(strR);
    }
}
