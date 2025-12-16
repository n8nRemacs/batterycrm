package defpackage;

import java.io.Closeable;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class r4j {
    public static final void a(Closeable closeable, Throwable th) {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th2) {
                saj.a(th, th2);
            }
        }
    }

    public static void b(gy7 gy7Var, Object obj) {
        if (obj == null || (obj instanceof String)) {
            ((e2) gy7Var).d((String) obj);
            return;
        }
        if (obj == JSONObject.NULL) {
            gy7Var.X();
            return;
        }
        if (obj instanceof Boolean) {
            boolean zBooleanValue = ((Boolean) obj).booleanValue();
            e2 e2Var = (e2) gy7Var;
            e2Var.getClass();
            e2Var.c(String.valueOf(zBooleanValue));
            return;
        }
        if ((obj instanceof Double) || (obj instanceof Float)) {
            ((e2) gy7Var).i(((Number) obj).doubleValue());
            return;
        }
        if ((obj instanceof Integer) || (obj instanceof Long) || (obj instanceof Short) || (obj instanceof Byte)) {
            long jLongValue = ((Number) obj).longValue();
            e2 e2Var2 = (e2) gy7Var;
            e2Var2.getClass();
            e2Var2.c(Long.toString(jLongValue));
            return;
        }
        if (obj instanceof JSONObject) {
            c(gy7Var, (JSONObject) obj);
            return;
        }
        if (!(obj instanceof JSONArray)) {
            throw new IllegalArgumentException("Don't know how to write " + obj);
        }
        JSONArray jSONArray = (JSONArray) obj;
        gy7Var.r();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            b(gy7Var, jSONArray.opt(i));
        }
        gy7Var.q();
    }

    public static void c(gy7 gy7Var, JSONObject jSONObject) {
        gy7Var.p();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            gy7Var.b0(next);
            b(gy7Var, jSONObject.opt(next));
        }
        gy7Var.n();
    }
}
