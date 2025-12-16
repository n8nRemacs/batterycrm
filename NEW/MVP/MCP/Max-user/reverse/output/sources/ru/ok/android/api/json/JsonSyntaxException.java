package ru.ok.android.api.json;

import defpackage.ctd;
import defpackage.ho7;
import defpackage.qoi;
import defpackage.xrf;
import java.io.IOException;
import java.util.Locale;

/* loaded from: classes2.dex */
public class JsonSyntaxException extends IOException {
    public static JsonSyntaxException a(long j, String str, int i) {
        if (i >= 0) {
            return i < 31 ? new JsonSyntaxException(String.format(Locale.US, "Unexpected char (U+%04x) at pos %d near `%s`", Integer.valueOf(i), Long.valueOf(j), str)) : new JsonSyntaxException(String.format(Locale.US, "Unexpected char '%s' (U+%04x) at pos %d near `%s`", Character.valueOf((char) i), Integer.valueOf(i), Long.valueOf(j), str));
        }
        Locale locale = Locale.US;
        StringBuilder sbN = ho7.n("Unexpected EOF at pos ", j, " after `", str);
        sbN.append("`");
        return new JsonSyntaxException(sbN.toString());
    }

    public static JsonSyntaxException b(long j, String str, int i) {
        if (i != 0) {
            String strD = qoi.d(i);
            Locale locale = Locale.US;
            return new JsonSyntaxException(ctd.j(xrf.q("Unexpected ", j, strD, " at pos "), " near `", str, "`"));
        }
        Locale locale2 = Locale.US;
        StringBuilder sbN = ho7.n("Unexpected eof at pos ", j, " after `", str);
        sbN.append("`");
        return new JsonSyntaxException(sbN.toString());
    }
}
