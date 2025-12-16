package com.google.android.gms.internal.common;

import I41.a;
import androidx.appcompat.app.r;
import androidx.camera.core.Q;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jspecify.nullness.NullMarked;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
@NullMarked
/* loaded from: classes6.dex */
public final class zzy {
    public static String zza(@a String str, @a Object... objArr) {
        int length;
        int length2;
        int iIndexOf;
        String strA;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            length = objArr.length;
            if (i13 >= length) {
                break;
            }
            Object obj = objArr[i13];
            if (obj == null) {
                strA = "null";
            } else {
                try {
                    strA = obj.toString();
                } catch (Exception e12) {
                    String strR = r.r(obj.getClass().getName(), "@", Integer.toHexString(System.identityHashCode(obj)));
                    Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(strR), (Throwable) e12);
                    strA = Q.a("<", strR, " threw ", e12.getClass().getName(), ">");
                }
            }
            objArr[i13] = strA;
            i13++;
        }
        StringBuilder sb2 = new StringBuilder(str.length() + (length * 16));
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
}
