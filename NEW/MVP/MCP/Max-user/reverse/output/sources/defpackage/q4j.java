package defpackage;

import android.text.TextUtils;
import org.apache.http.HttpStatus;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.android.api.json.JsonStateException;
import ru.ok.android.api.json.JsonTypeMismatchException;

/* loaded from: classes.dex */
public abstract class q4j {
    public static Class a(String str, boolean z) {
        if (z && TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return Class.forName(str);
        } catch (Exception e) {
            StringBuilder sbN = az1.n("An exception occurred while finding class for name ", str, ". ");
            sbN.append(e.getMessage());
            throw new RuntimeException(sbN.toString());
        }
    }

    public static JSONObject b(xx7 xx7Var) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            xx7Var.p();
            while (xx7Var.peek() != 125) {
                jSONObject.put(xx7Var.name(), c(xx7Var, JSONObject.NULL));
            }
            xx7Var.n();
            return jSONObject;
        } catch (JSONException e) {
            throw new AssertionError(e);
        }
    }

    public static Object c(xx7 xx7Var, Object obj) throws NumberFormatException {
        try {
            int iPeek = xx7Var.peek();
            if (iPeek == 34) {
                return xx7Var.B();
            }
            if (iPeek == 49) {
                String strR = xx7Var.R();
                if (strR.indexOf(46) >= 0 || strR.indexOf(HttpStatus.SC_SWITCHING_PROTOCOLS) >= 0 || strR.indexOf(69) >= 0) {
                    return Double.valueOf(Double.parseDouble(strR));
                }
                long j = Long.parseLong(strR);
                return (j < -2147483648L || j > 2147483647L) ? Long.valueOf(j) : Integer.valueOf((int) j);
            }
            if (iPeek == 91) {
                JSONArray jSONArray = new JSONArray();
                xx7Var.r();
                while (xx7Var.peek() != 93) {
                    jSONArray.put(c(xx7Var, null));
                }
                xx7Var.q();
                return jSONArray;
            }
            if (iPeek == 98) {
                return Boolean.valueOf(xx7Var.W());
            }
            if (iPeek == 110) {
                xx7Var.v();
                return obj;
            }
            if (iPeek == 123) {
                return b(xx7Var);
            }
            throw JsonStateException.d(iPeek);
        } catch (JsonTypeMismatchException e) {
            throw new AssertionError(e);
        }
    }
}
