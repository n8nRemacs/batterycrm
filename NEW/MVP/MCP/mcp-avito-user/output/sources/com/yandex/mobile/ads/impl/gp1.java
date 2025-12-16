package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.view.WindowManager;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public final class gp1 {

    /* renamed from: a, reason: collision with root package name */
    private static WindowManager f385804a;

    /* renamed from: b, reason: collision with root package name */
    private static String[] f385805b = {"x", "y", "width", "height"};

    /* renamed from: c, reason: collision with root package name */
    static float f385806c = Resources.getSystem().getDisplayMetrics().density;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f385807d = 0;

    public static float a(int i12) {
        return i12 / f385806c;
    }

    public static JSONObject a(int i12, int i13, int i14, int i15) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("x", a(i12));
            jSONObject.put("y", a(i13));
            jSONObject.put("width", a(i14));
            jSONObject.put("height", a(i15));
        } catch (JSONException e12) {
            np1.a("Error with creating viewStateObject", e12);
        }
        return jSONObject;
    }

    public static void a(Context context) {
        if (context != null) {
            f385806c = context.getResources().getDisplayMetrics().density;
            f385804a = (WindowManager) context.getSystemService("window");
        }
    }

    public static void a(JSONObject jSONObject, String str, Object obj) throws JSONException {
        try {
            jSONObject.put(str, obj);
        } catch (JSONException e12) {
            np1.a("JSONException during JSONObject.put for name [" + str + "]", e12);
        }
    }

    public static void a(JSONObject jSONObject) throws JSONException {
        float fA2;
        float fA3;
        if (f385804a != null) {
            Point point = new Point(0, 0);
            f385804a.getDefaultDisplay().getRealSize(point);
            fA2 = a(point.x);
            fA3 = a(point.y);
        } else {
            fA2 = 0.0f;
            fA3 = 0.0f;
        }
        try {
            jSONObject.put("width", fA2);
            jSONObject.put("height", fA3);
        } catch (JSONException unused) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x00b3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean a(@j.N org.json.JSONObject r9, @j.P org.json.JSONObject r10) {
        /*
            r0 = 1
            if (r9 != 0) goto L6
            if (r10 != 0) goto L6
            return r0
        L6:
            r1 = 0
            if (r9 == 0) goto Lc7
            if (r10 != 0) goto Ld
            goto Lc7
        Ld:
            java.lang.String[] r2 = com.yandex.mobile.ads.impl.gp1.f385805b
            r3 = r1
        L10:
            r4 = 4
            if (r3 >= r4) goto L26
            r4 = r2[r3]
            double r5 = r9.optDouble(r4)
            double r7 = r10.optDouble(r4)
            int r4 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r4 == 0) goto L23
            goto Lc5
        L23:
            int r3 = r3 + 1
            goto L10
        L26:
            java.lang.String r2 = "adSessionId"
            java.lang.String r3 = ""
            java.lang.String r4 = r9.optString(r2, r3)
            java.lang.String r2 = r10.optString(r2, r3)
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto Lc5
            java.lang.String r2 = "hasWindowFocus"
            boolean r4 = r9.optBoolean(r2)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            boolean r2 = r10.optBoolean(r2)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            if (r4 != r2) goto Lc5
            java.lang.String r2 = "isFriendlyObstructionFor"
            org.json.JSONArray r4 = r9.optJSONArray(r2)
            org.json.JSONArray r2 = r10.optJSONArray(r2)
            if (r4 != 0) goto L5b
            if (r2 != 0) goto L5b
            goto L89
        L5b:
            if (r4 != 0) goto L60
            if (r2 != 0) goto L60
            goto L70
        L60:
            if (r4 == 0) goto Lc5
            if (r2 != 0) goto L66
            goto Lc5
        L66:
            int r5 = r4.length()
            int r6 = r2.length()
            if (r5 != r6) goto Lc5
        L70:
            r5 = r1
        L71:
            int r6 = r4.length()
            if (r5 >= r6) goto L89
            java.lang.String r6 = r4.optString(r5, r3)
            java.lang.String r7 = r2.optString(r5, r3)
            boolean r6 = r6.equals(r7)
            if (r6 != 0) goto L86
            goto Lc5
        L86:
            int r5 = r5 + 1
            goto L71
        L89:
            java.lang.String r2 = "childViews"
            org.json.JSONArray r9 = r9.optJSONArray(r2)
            org.json.JSONArray r10 = r10.optJSONArray(r2)
            if (r9 != 0) goto L98
            if (r10 != 0) goto L98
            goto Lc6
        L98:
            if (r9 != 0) goto L9d
            if (r10 != 0) goto L9d
            goto Lac
        L9d:
            if (r9 == 0) goto Lc5
            if (r10 != 0) goto La2
            goto Lc5
        La2:
            int r2 = r9.length()
            int r3 = r10.length()
            if (r2 != r3) goto Lc5
        Lac:
            r2 = r1
        Lad:
            int r3 = r9.length()
            if (r2 >= r3) goto Lc6
            org.json.JSONObject r3 = r9.optJSONObject(r2)
            org.json.JSONObject r4 = r10.optJSONObject(r2)
            boolean r3 = a(r3, r4)
            if (r3 != 0) goto Lc2
            goto Lc5
        Lc2:
            int r2 = r2 + 1
            goto Lad
        Lc5:
            r0 = r1
        Lc6:
            return r0
        Lc7:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.gp1.a(org.json.JSONObject, org.json.JSONObject):boolean");
    }
}
