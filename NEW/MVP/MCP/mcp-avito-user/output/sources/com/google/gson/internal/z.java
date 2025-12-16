package com.google.gson.internal;

import java.text.SimpleDateFormat;
import java.util.Locale;

/* compiled from: PreJava9DateFormatProvider.java */
/* loaded from: classes6.dex */
public class z {
    public static SimpleDateFormat a(int i12, int i13) {
        String str;
        String str2;
        StringBuilder sb2 = new StringBuilder();
        if (i12 == 0) {
            str = "EEEE, MMMM d, yyyy";
        } else if (i12 == 1) {
            str = "MMMM d, yyyy";
        } else if (i12 == 2) {
            str = "MMM d, yyyy";
        } else {
            if (i12 != 3) {
                throw new IllegalArgumentException(AK.c.g(i12, "Unknown DateFormat style: "));
            }
            str = "M/d/yy";
        }
        sb2.append(str);
        sb2.append(" ");
        if (i13 == 0 || i13 == 1) {
            str2 = "h:mm:ss a z";
        } else if (i13 == 2) {
            str2 = "h:mm:ss a";
        } else {
            if (i13 != 3) {
                throw new IllegalArgumentException(AK.c.g(i13, "Unknown DateFormat style: "));
            }
            str2 = "h:mm a";
        }
        sb2.append(str2);
        return new SimpleDateFormat(sb2.toString(), Locale.US);
    }
}
