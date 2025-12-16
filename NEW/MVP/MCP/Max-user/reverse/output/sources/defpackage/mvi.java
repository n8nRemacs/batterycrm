package defpackage;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public abstract class mvi {
    public static Drawable a(Context context, int i, float f, boolean z) {
        return z ? new wq0(context, i, f, true) : new ColorDrawable(i);
    }

    public static final int b(int i, int i2, int i3) {
        return Math.min(Math.max(0, i3 - i), i2);
    }

    public static final void c(int i, int i2, int i3, int i4, int i5) {
        l5j.c(i4 >= 0, "count (%d) ! >= 0", Integer.valueOf(i4));
        l5j.c(i >= 0, "offset (%d) ! >= 0", Integer.valueOf(i));
        l5j.c(i3 >= 0, "otherOffset (%d) ! >= 0", Integer.valueOf(i3));
        l5j.c(i + i4 <= i5, "offset (%d) + count (%d) ! <= %d", Integer.valueOf(i), Integer.valueOf(i4), Integer.valueOf(i5));
        l5j.c(i3 + i4 <= i2, "otherOffset (%d) + count (%d) ! <= %d", Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i2));
    }

    public static String d(String str, Object... objArr) {
        int length;
        int length2;
        int iIndexOf;
        String strJ;
        int i = 0;
        int i2 = 0;
        while (true) {
            length = objArr.length;
            if (i2 >= length) {
                break;
            }
            Object obj = objArr[i2];
            if (obj == null) {
                strJ = "null";
            } else {
                try {
                    strJ = obj.toString();
                } catch (Exception e) {
                    String strK = u45.k(obj.getClass().getName(), "@", Integer.toHexString(System.identityHashCode(obj)));
                    Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(strK), (Throwable) e);
                    strJ = wy1.j("<", strK, " threw ", e.getClass().getName(), ">");
                }
            }
            objArr[i2] = strJ;
            i2++;
        }
        StringBuilder sb = new StringBuilder(str.length() + (length * 16));
        int i3 = 0;
        while (true) {
            length2 = objArr.length;
            if (i >= length2 || (iIndexOf = str.indexOf("%s", i3)) == -1) {
                break;
            }
            sb.append((CharSequence) str, i3, iIndexOf);
            sb.append(objArr[i]);
            i++;
            i3 = iIndexOf + 2;
        }
        sb.append((CharSequence) str, i3, str.length());
        if (i < length2) {
            sb.append(" [");
            sb.append(objArr[i]);
            for (int i4 = i + 1; i4 < objArr.length; i4++) {
                sb.append(", ");
                sb.append(objArr[i4]);
            }
            sb.append(']');
        }
        return sb.toString();
    }
}
