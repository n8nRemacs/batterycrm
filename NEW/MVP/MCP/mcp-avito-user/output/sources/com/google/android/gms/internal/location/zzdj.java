package com.google.android.gms.internal.location;

import j.B;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* compiled from: com.google.android.gms:play-services-location@@21.0.1 */
/* loaded from: classes6.dex */
public final class zzdj {

    /* renamed from: a, reason: collision with root package name */
    @B
    public static final StringBuilder f350520a;

    static {
        Locale locale = Locale.ROOT;
        new SimpleDateFormat("MM-dd HH:mm:ss.SSS", locale);
        new SimpleDateFormat("MM-dd HH:mm:ss", locale);
        f350520a = new StringBuilder(33);
    }

    public static String zza(long j12) {
        String string;
        StringBuilder sb2 = f350520a;
        synchronized (sb2) {
            sb2.setLength(0);
            zzb(j12, sb2);
            string = sb2.toString();
        }
        return string;
    }

    public static void zzb(long j12, StringBuilder sb2) {
        if (j12 == 0) {
            sb2.append("0s");
            return;
        }
        sb2.ensureCapacity(sb2.length() + 27);
        boolean z12 = false;
        if (j12 < 0) {
            sb2.append("-");
            if (j12 != Long.MIN_VALUE) {
                j12 = -j12;
            } else {
                j12 = Long.MAX_VALUE;
                z12 = true;
            }
        }
        if (j12 >= 86400000) {
            sb2.append(j12 / 86400000);
            sb2.append("d");
            j12 %= 86400000;
        }
        if (true == z12) {
            j12 = 25975808;
        }
        if (j12 >= 3600000) {
            sb2.append(j12 / 3600000);
            sb2.append("h");
            j12 %= 3600000;
        }
        if (j12 >= 60000) {
            sb2.append(j12 / 60000);
            sb2.append("m");
            j12 %= 60000;
        }
        if (j12 >= 1000) {
            sb2.append(j12 / 1000);
            sb2.append("s");
            j12 %= 1000;
        }
        if (j12 > 0) {
            sb2.append(j12);
            sb2.append("ms");
        }
    }
}
