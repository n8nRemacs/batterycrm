package y01;

import android.text.TextUtils;

/* compiled from: StringUtils.java */
/* loaded from: classes7.dex */
public class x {
    public static boolean a(String... strArr) {
        for (String str : strArr) {
            if (TextUtils.isEmpty(str)) {
                return false;
            }
        }
        return true;
    }
}
