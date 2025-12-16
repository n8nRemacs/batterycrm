package com.yandex.mobile.ads.impl;

import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes8.dex */
public final class p71 {
    public static String a(@I41.a String str, @I41.a Object... objArr) {
        int iIndexOf;
        String string;
        int i12 = 0;
        for (int i13 = 0; i13 < objArr.length; i13++) {
            Object obj = objArr[i13];
            if (obj == null) {
                string = "null";
            } else {
                try {
                    string = obj.toString();
                } catch (Exception e12) {
                    String str2 = obj.getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(obj));
                    Logger.getLogger("com.google.common.base.Strings").log(Level.WARNING, "Exception during lenientFormat for " + str2, (Throwable) e12);
                    StringBuilder sbA = androidx.appcompat.app.r.A("<", str2, " threw ");
                    sbA.append(e12.getClass().getName());
                    sbA.append(">");
                    string = sbA.toString();
                }
            }
            objArr[i13] = string;
        }
        StringBuilder sb2 = new StringBuilder((objArr.length * 16) + str.length());
        int i14 = 0;
        while (i12 < objArr.length && (iIndexOf = str.indexOf("%s", i14)) != -1) {
            sb2.append((CharSequence) str, i14, iIndexOf);
            sb2.append(objArr[i12]);
            i14 = iIndexOf + 2;
            i12++;
        }
        sb2.append((CharSequence) str, i14, str.length());
        if (i12 < objArr.length) {
            sb2.append(" [");
            sb2.append(objArr[i12]);
            for (int i15 = i12 + 1; i15 < objArr.length; i15++) {
                sb2.append(", ");
                sb2.append(objArr[i15]);
            }
            sb2.append(']');
        }
        return sb2.toString();
    }
}
