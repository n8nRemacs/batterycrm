package defpackage;

import android.text.TextUtils;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class i98 {
    public final String a;
    public final boolean b;

    public i98(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof i98) {
            i98 i98Var = (i98) obj;
            String str = this.a;
            if (!TextUtils.isEmpty(str)) {
                String str2 = i98Var.a;
                if (!TextUtils.isEmpty(str2)) {
                    if (this.b) {
                        return str.equals(str2);
                    }
                    Pattern pattern = m6g.a;
                    if (str.length() == str2.length() && str2.regionMatches(true, 0, str, 0, str.length())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
