package x01;

import android.text.TextUtils;

/* loaded from: classes7.dex */
public class a0 {
    public static boolean a(int i12, String str, String str2) {
        String str3;
        if (TextUtils.isEmpty(str2)) {
            str3 = "checkString() Parameter is empty : ";
        } else {
            if (str2.length() <= i12) {
                return true;
            }
            str3 = "checkString() Failure of parameter length check! Parameter:";
        }
        m0.e("hmsSdk", str3.concat(str));
        return false;
    }
}
