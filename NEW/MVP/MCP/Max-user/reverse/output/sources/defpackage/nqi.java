package defpackage;

import android.net.Uri;
import android.webkit.MimeTypeMap;
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes.dex */
public abstract class nqi {
    public static final void a(int i, int i2, int i3, int i4, int[] iArr) {
        if (iArr.length <= 1) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        float f = i4;
        float f2 = i3;
        int i5 = (int) ((f / f2) * i);
        if (1 > i2 || i2 >= i5) {
            i2 = i5;
        } else {
            i = (int) ((f2 / f) * i2);
        }
        iArr[0] = i;
        iArr[1] = i2;
    }

    public static pd8 b(vd8 vd8Var) {
        int i;
        int iOrdinal = vd8Var.v0.ordinal();
        if (iOrdinal != 0) {
            i = 1;
            if (iOrdinal != 1 && iOrdinal != 2) {
                i = 3;
                if (iOrdinal != 3) {
                    throw new NoWhenBranchMatchedException();
                }
            }
        } else {
            i = 0;
        }
        long j = vd8Var.a;
        String string = vd8Var.b.toString();
        String str = vd8Var.c;
        long j2 = vd8Var.o;
        Integer num = vd8Var.X;
        int iIntValue = num != null ? num.intValue() : 0;
        Long l = vd8Var.Y;
        return new pd8(i, j, string, vd8Var.u0.toString(), iIntValue, l != null ? l.longValue() : 0L, str, j2, vd8Var.b);
    }

    public static final vd8 c(pd8 pd8Var) {
        Uri uri;
        int iH;
        uz9 uz9Var;
        Object next;
        Uri uri2;
        String str = pd8Var.c;
        String str2 = pd8Var.d;
        if (str2 == null || (uri = Uri.parse(str2)) == null) {
            uri = Uri.parse(str);
        }
        Uri uri3 = uri;
        long j = pd8Var.b;
        Uri uri4 = (str == null || (uri2 = Uri.parse(str)) == null) ? uri3 : uri2;
        String str3 = pd8Var.Y;
        if (str3 == null) {
            uz9 uz9Var2 = uz9.d;
            if (str != null && (iH = vmf.H(".", str, 6)) != -1) {
                try {
                    String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(str.substring(iH, str.length()).toLowerCase(Locale.getDefault()));
                    if (mimeTypeFromExtension != null && mimeTypeFromExtension.length() != 0) {
                        f2 f2Var = new f2(0, uz9.w0);
                        while (true) {
                            uz9Var = null;
                            if (!f2Var.hasNext()) {
                                next = null;
                                break;
                            }
                            next = f2Var.next();
                            if (((uz9) next).a.equalsIgnoreCase(mimeTypeFromExtension)) {
                                break;
                            }
                        }
                        uz9 uz9Var3 = (uz9) next;
                        if (uz9Var3 == null) {
                            uz9Var3 = uz9.c;
                        }
                        String str4 = uz9Var3.a;
                        if ((str4.length() != 0 && dnf.r(str4, "image/", true) && !vmf.s(str4, "djvu", true)) || (str4.length() != 0 && dnf.r(str4, "video/", true))) {
                            uz9Var = uz9Var3;
                        }
                        if (uz9Var != null) {
                            uz9Var2 = uz9Var;
                        }
                    }
                } catch (Throwable unused) {
                }
            }
            str3 = uz9Var2.a;
        }
        return new vd8(j, uri4, str3, -1, pd8Var.Z, Integer.valueOf(pd8Var.o), Long.valueOf(pd8Var.X), 0, 0, 0L, uri3);
    }
}
