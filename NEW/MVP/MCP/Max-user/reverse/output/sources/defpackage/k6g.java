package defpackage;

import io.michaelrocks.libphonenumber.android.NumberParseException;
import java.util.Collections;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public abstract class k6g {
    public static final /* synthetic */ int a = 0;

    static {
        Pattern.compile("#(?i)([\\p{L}0-9_]+)");
    }

    public static String a(aub aubVar, String str, String str2, String str3) throws NumberFormatException {
        rub rubVarU;
        if (l8g.c(str2)) {
            str2 = str3;
        }
        String str4 = "RU";
        if (!l8g.c(str2)) {
            String upperCase = str2.toUpperCase();
            if (Collections.unmodifiableSet(aubVar.f).contains(upperCase)) {
                str4 = upperCase;
            }
        }
        try {
            rubVarU = aubVar.u(!str.startsWith("+") ? "+".concat(str) : str, str4);
        } catch (NumberParseException unused) {
            rubVarU = null;
        }
        return rubVarU == null ? str : aubVar.d(rubVarU, 2);
    }
}
