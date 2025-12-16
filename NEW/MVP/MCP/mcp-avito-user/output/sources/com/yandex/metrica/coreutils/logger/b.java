package com.yandex.metrica.coreutils.logger;

import androidx.appcompat.app.r;
import java.util.Locale;

/* compiled from: DebugLogger.java */
/* loaded from: classes7.dex */
class b extends a {
    @Override // com.yandex.metrica.coreutils.logger.a
    public final String formatMessage(String str, Object[] objArr) {
        String string;
        if (objArr != null && objArr.length != 0) {
            str = String.format(Locale.US, str, objArr);
        }
        StackTraceElement[] stackTrace = new Throwable().fillInStackTrace().getStackTrace();
        int i12 = 5;
        while (true) {
            if (i12 >= stackTrace.length) {
                string = "<unknown>";
                break;
            }
            if (!p.f377636a.contains(stackTrace[i12].getClassName())) {
                String className = stackTrace[i12].getClassName();
                String strSubstring = className.substring(className.lastIndexOf(46) + 1);
                StringBuilder sbZ = r.z(strSubstring.substring(strSubstring.lastIndexOf(36) + 1), ".");
                sbZ.append(stackTrace[i12].getMethodName());
                string = sbZ.toString();
                break;
            }
            i12++;
        }
        Locale locale = Locale.US;
        long id2 = Thread.currentThread().getId();
        StringBuilder sb2 = new StringBuilder("[");
        sb2.append(id2);
        sb2.append("] ");
        sb2.append(string);
        return AK.c.s(sb2, ": ", str);
    }

    @Override // com.yandex.metrica.coreutils.logger.a
    public final String getPrefix() {
        return "";
    }

    @Override // com.yandex.metrica.coreutils.logger.a
    public final String getTag() {
        return "AppMetricaDebug";
    }
}
