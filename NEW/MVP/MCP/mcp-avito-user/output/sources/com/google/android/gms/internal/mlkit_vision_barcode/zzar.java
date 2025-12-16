package com.google.android.gms.internal.mlkit_vision_barcode;

import I41.a;
import androidx.compose.foundation.H;
import androidx.media3.exoplayer.analytics.m;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.0.0 */
/* loaded from: classes6.dex */
public final class zzar {
    public static String zza(@a String str, @a Object... objArr) {
        int length;
        int length2;
        int iIndexOf;
        String string;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            length = objArr.length;
            if (i13 >= length) {
                break;
            }
            Object obj = objArr[i13];
            if (obj == null) {
                string = "null";
            } else {
                try {
                    string = obj.toString();
                } catch (Exception e12) {
                    String name = obj.getClass().getName();
                    String hexString = Integer.toHexString(System.identityHashCode(obj));
                    String strO = H.o(new StringBuilder(name.length() + 1 + String.valueOf(hexString).length()), name, '@', hexString);
                    Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", strO.length() != 0 ? "Exception during lenientFormat for ".concat(strO) : new String("Exception during lenientFormat for "), (Throwable) e12);
                    String name2 = e12.getClass().getName();
                    StringBuilder sb2 = new StringBuilder(strO.length() + 9 + name2.length());
                    m.p(sb2, "<", strO, " threw ", name2);
                    sb2.append(">");
                    string = sb2.toString();
                }
            }
            objArr[i13] = string;
            i13++;
        }
        StringBuilder sb3 = new StringBuilder((length * 16) + str.length());
        int i14 = 0;
        while (true) {
            length2 = objArr.length;
            if (i12 >= length2 || (iIndexOf = str.indexOf("%s", i14)) == -1) {
                break;
            }
            sb3.append((CharSequence) str, i14, iIndexOf);
            sb3.append(objArr[i12]);
            i14 = iIndexOf + 2;
            i12++;
        }
        sb3.append((CharSequence) str, i14, str.length());
        if (i12 < length2) {
            sb3.append(" [");
            sb3.append(objArr[i12]);
            for (int i15 = i12 + 1; i15 < objArr.length; i15++) {
                sb3.append(", ");
                sb3.append(objArr[i15]);
            }
            sb3.append(']');
        }
        return sb3.toString();
    }

    public static boolean zzb(@a String str) {
        int i12 = zzap.f351753a;
        return str == null || str.isEmpty();
    }
}
