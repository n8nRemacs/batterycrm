package e11;

import android.graphics.Color;
import android.text.TextUtils;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class X {
    public static int a(@j.N JSONObject jSONObject, @j.N String str, int i12) {
        String strOptString = jSONObject.optString(str);
        if (TextUtils.isEmpty(strOptString)) {
            return i12;
        }
        try {
            return Color.parseColor(strOptString);
        } catch (Throwable unused) {
            return i12;
        }
    }
}
