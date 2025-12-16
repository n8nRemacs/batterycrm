package com.iab.omid.library.corpmailru.d;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.WindowManager;
import com.iab.omid.library.corpmailru.walking.a;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class b {

    /* renamed from: b, reason: collision with root package name */
    private static WindowManager f364003b;

    /* renamed from: c, reason: collision with root package name */
    private static String[] f364004c = {"x", "y", "width", "height"};

    /* renamed from: a, reason: collision with root package name */
    public static float f364002a = Resources.getSystem().getDisplayMetrics().density;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final float f364005a;

        /* renamed from: b, reason: collision with root package name */
        public final float f364006b;

        public a(float f12, float f13) {
            this.f364005a = f12;
            this.f364006b = f13;
        }
    }

    public static float a(int i12) {
        return i12 / f364002a;
    }

    private static a b(JSONObject jSONObject) {
        float fA2;
        float fA3;
        if (f364003b != null) {
            Point point = new Point(0, 0);
            f364003b.getDefaultDisplay().getRealSize(point);
            fA2 = a(point.x);
            fA3 = a(point.y);
        } else {
            fA2 = 0.0f;
            fA3 = 0.0f;
        }
        return new a(fA2, fA3);
    }

    private static boolean c(JSONObject jSONObject, JSONObject jSONObject2) {
        for (String str : f364004c) {
            if (jSONObject.optDouble(str) != jSONObject2.optDouble(str)) {
                return false;
            }
        }
        return true;
    }

    private static boolean d(JSONObject jSONObject, JSONObject jSONObject2) {
        return jSONObject.optString("adSessionId", "").equals(jSONObject2.optString("adSessionId", ""));
    }

    private static boolean e(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("isFriendlyObstructionFor");
        JSONArray jSONArrayOptJSONArray2 = jSONObject2.optJSONArray("isFriendlyObstructionFor");
        if (jSONArrayOptJSONArray == null && jSONArrayOptJSONArray2 == null) {
            return true;
        }
        if (!a(jSONArrayOptJSONArray, jSONArrayOptJSONArray2)) {
            return false;
        }
        for (int i12 = 0; i12 < jSONArrayOptJSONArray.length(); i12++) {
            if (!jSONArrayOptJSONArray.optString(i12, "").equals(jSONArrayOptJSONArray2.optString(i12, ""))) {
                return false;
            }
        }
        return true;
    }

    private static boolean f(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("childViews");
        JSONArray jSONArrayOptJSONArray2 = jSONObject2.optJSONArray("childViews");
        if (jSONArrayOptJSONArray == null && jSONArrayOptJSONArray2 == null) {
            return true;
        }
        if (!a(jSONArrayOptJSONArray, jSONArrayOptJSONArray2)) {
            return false;
        }
        for (int i12 = 0; i12 < jSONArrayOptJSONArray.length(); i12++) {
            if (!b(jSONArrayOptJSONArray.optJSONObject(i12), jSONArrayOptJSONArray2.optJSONObject(i12))) {
                return false;
            }
        }
        return true;
    }

    public static JSONObject a(int i12, int i13, int i14, int i15) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("x", a(i12));
            jSONObject.put("y", a(i13));
            jSONObject.put("width", a(i14));
            jSONObject.put("height", a(i15));
        } catch (JSONException e12) {
            c.a("Error with creating viewStateObject", e12);
        }
        return jSONObject;
    }

    public static void b(JSONObject jSONObject, String str) throws JSONException {
        try {
            jSONObject.put("notVisibleReason", str);
        } catch (JSONException e12) {
            c.a("Error with setting not visible reason", e12);
        }
    }

    public static void a(Context context) {
        if (context != null) {
            f364002a = context.getResources().getDisplayMetrics().density;
            f364003b = (WindowManager) context.getSystemService("window");
        }
    }

    public static boolean b(@NonNull JSONObject jSONObject, @Nullable JSONObject jSONObject2) {
        if (jSONObject == null && jSONObject2 == null) {
            return true;
        }
        if (jSONObject == null || jSONObject2 == null) {
            return false;
        }
        return c(jSONObject, jSONObject2) && d(jSONObject, jSONObject2) && e(jSONObject, jSONObject2) && f(jSONObject, jSONObject2);
    }

    public static void a(JSONObject jSONObject) throws JSONException {
        a aVarB = b(jSONObject);
        try {
            jSONObject.put("width", aVarB.f364005a);
            jSONObject.put("height", aVarB.f364006b);
        } catch (JSONException e12) {
            e12.printStackTrace();
        }
    }

    public static void a(JSONObject jSONObject, a.C10765a c10765a) throws JSONException {
        com.iab.omid.library.corpmailru.b.c cVarA = c10765a.a();
        JSONArray jSONArray = new JSONArray();
        Iterator<String> it = c10765a.b().iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next());
        }
        try {
            jSONObject.put("isFriendlyObstructionFor", jSONArray);
            jSONObject.put("friendlyObstructionClass", cVarA.b());
            jSONObject.put("friendlyObstructionPurpose", cVarA.c());
            jSONObject.put("friendlyObstructionReason", cVarA.d());
        } catch (JSONException e12) {
            c.a("Error with setting friendly obstruction", e12);
        }
    }

    public static void a(JSONObject jSONObject, String str) throws JSONException {
        try {
            jSONObject.put("adSessionId", str);
        } catch (JSONException e12) {
            c.a("Error with setting ad session id", e12);
        }
    }

    public static void a(JSONObject jSONObject, String str, Object obj) throws JSONException {
        try {
            jSONObject.put(str, obj);
        } catch (JSONException e12) {
            c.a("JSONException during JSONObject.put for name [" + str + "]", e12);
        }
    }

    public static void a(JSONObject jSONObject, JSONObject jSONObject2) throws JSONException {
        try {
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("childViews");
            if (jSONArrayOptJSONArray == null) {
                jSONArrayOptJSONArray = new JSONArray();
                jSONObject.put("childViews", jSONArrayOptJSONArray);
            }
            jSONArrayOptJSONArray.put(jSONObject2);
        } catch (JSONException e12) {
            e12.printStackTrace();
        }
    }

    private static boolean a(JSONArray jSONArray, JSONArray jSONArray2) {
        if (jSONArray == null && jSONArray2 == null) {
            return true;
        }
        return (jSONArray == null || jSONArray2 == null || jSONArray.length() != jSONArray2.length()) ? false : true;
    }
}
