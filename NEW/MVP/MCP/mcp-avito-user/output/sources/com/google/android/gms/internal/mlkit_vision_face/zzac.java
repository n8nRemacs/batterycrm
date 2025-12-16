package com.google.android.gms.internal.mlkit_vision_face;

import I41.a;
import androidx.appcompat.app.r;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: com.google.android.gms:play-services-mlkit-face-detection@@17.1.0 */
/* loaded from: classes6.dex */
public final class zzac {
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
                    String str2 = obj.getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(obj));
                    Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(str2), (Throwable) e12);
                    StringBuilder sbA = r.A("<", str2, " threw ");
                    sbA.append(e12.getClass().getName());
                    sbA.append(">");
                    string = sbA.toString();
                }
            }
            objArr[i13] = string;
            i13++;
        }
        StringBuilder sb2 = new StringBuilder((length * 16) + str.length());
        int i14 = 0;
        while (true) {
            length2 = objArr.length;
            if (i12 >= length2 || (iIndexOf = str.indexOf("%s", i14)) == -1) {
                break;
            }
            sb2.append((CharSequence) str, i14, iIndexOf);
            sb2.append(objArr[i12]);
            i14 = iIndexOf + 2;
            i12++;
        }
        sb2.append((CharSequence) str, i14, str.length());
        if (i12 < length2) {
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

    public static boolean zzb(@a String str) {
        int i12 = zzaa.f352939a;
        return str == null || str.isEmpty();
    }
}
