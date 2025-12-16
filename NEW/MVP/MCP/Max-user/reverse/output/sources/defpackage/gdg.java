package defpackage;

import android.util.Log;
import java.util.Arrays;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class gdg {
    public static final Pattern d = Pattern.compile("[a-zA-Z0-9-_.~%]{1,900}");
    public final String a;
    public final String b;
    public final String c;

    public gdg(String str, String str2) {
        String strSubstring;
        if (str2 == null || !str2.startsWith("/topics/")) {
            strSubstring = str2;
        } else {
            Log.w("FirebaseMessaging", "Format /topics/topic-name is deprecated. Only 'topic-name' should be used in " + str + ".");
            strSubstring = str2.substring(8);
        }
        if (strSubstring == null || !d.matcher(strSubstring).matches()) {
            throw new IllegalArgumentException(ho7.i("Invalid topic name: ", strSubstring, " does not match the allowed format [a-zA-Z0-9-_.~%]{1,900}."));
        }
        this.a = strSubstring;
        this.b = str;
        this.c = u45.k(str, "!", str2);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof gdg)) {
            return false;
        }
        gdg gdgVar = (gdg) obj;
        return this.a.equals(gdgVar.a) && this.b.equals(gdgVar.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.a});
    }
}
