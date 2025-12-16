package com.google.firebase.messaging;

import android.content.res.Resources;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import com.avito.android.remote.model.search.InlineFilterValue;
import java.util.Arrays;
import java.util.MissingFormatArgumentException;
import org.json.JSONArray;
import org.json.JSONException;

/* compiled from: NotificationParams.java */
/* loaded from: classes6.dex */
public class v {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    public final Bundle f361940a;

    public v(@j.N Bundle bundle) {
        this.f361940a = new Bundle(bundle);
    }

    public static boolean j(Bundle bundle) {
        return "1".equals(bundle.getString("gcm.n.e")) || "1".equals(bundle.getString("gcm.n.e".replace("gcm.n.", "gcm.notification.")));
    }

    public static void l(String str) {
        if (str.startsWith("gcm.n.")) {
            str.substring(6);
        }
    }

    public final boolean a(String str) {
        String strH = h(str);
        return "1".equals(strH) || Boolean.parseBoolean(strH);
    }

    public final Integer b(String str) {
        String strH = h(str);
        if (TextUtils.isEmpty(strH)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt(strH));
        } catch (NumberFormatException unused) {
            l(str);
            return null;
        }
    }

    @j.P
    public final JSONArray c(String str) {
        String strH = h(str);
        if (TextUtils.isEmpty(strH)) {
            return null;
        }
        try {
            return new JSONArray(strH);
        } catch (JSONException unused) {
            l(str);
            return null;
        }
    }

    @j.P
    public final int[] d() throws JSONException {
        JSONArray jSONArrayC = c("gcm.n.light_settings");
        if (jSONArrayC == null) {
            return null;
        }
        int[] iArr = new int[3];
        try {
            if (jSONArrayC.length() != 3) {
                throw new JSONException("lightSettings don't have all three fields");
            }
            int color = Color.parseColor(jSONArrayC.optString(0));
            if (color == -16777216) {
                throw new IllegalArgumentException("Transparent color is invalid");
            }
            iArr[0] = color;
            iArr[1] = jSONArrayC.optInt(1);
            iArr[2] = jSONArrayC.optInt(2);
            return iArr;
        } catch (IllegalArgumentException e12) {
            jSONArrayC.toString();
            e12.getMessage();
            return null;
        } catch (JSONException unused) {
            jSONArrayC.toString();
            return null;
        }
    }

    @j.P
    public final Object[] e(String str) {
        JSONArray jSONArrayC = c(str.concat("_loc_args"));
        if (jSONArrayC == null) {
            return null;
        }
        int length = jSONArrayC.length();
        String[] strArr = new String[length];
        for (int i12 = 0; i12 < length; i12++) {
            strArr[i12] = jSONArrayC.optString(i12);
        }
        return strArr;
    }

    @j.P
    public final String f(String str) {
        return h(str.concat("_loc_key"));
    }

    public final String g(Resources resources, String str, String str2) {
        String strH = h(str2);
        if (!TextUtils.isEmpty(strH)) {
            return strH;
        }
        String strF = f(str2);
        if (TextUtils.isEmpty(strF)) {
            return null;
        }
        int identifier = resources.getIdentifier(strF, "string", str);
        if (identifier == 0) {
            l(str2.concat("_loc_key"));
            return null;
        }
        Object[] objArrE = e(str2);
        if (objArrE == null) {
            return resources.getString(identifier);
        }
        try {
            return resources.getString(identifier, objArrE);
        } catch (MissingFormatArgumentException unused) {
            l(str2);
            Arrays.toString(objArrE);
            return null;
        }
    }

    public final String h(String str) {
        Bundle bundle = this.f361940a;
        if (!bundle.containsKey(str) && str.startsWith("gcm.n.")) {
            String strReplace = !str.startsWith("gcm.n.") ? str : str.replace("gcm.n.", "gcm.notification.");
            if (bundle.containsKey(strReplace)) {
                str = strReplace;
            }
        }
        return bundle.getString(str);
    }

    @j.P
    public final long[] i() throws JSONException {
        JSONArray jSONArrayC = c("gcm.n.vibrate_timings");
        if (jSONArrayC == null) {
            return null;
        }
        try {
            if (jSONArrayC.length() <= 1) {
                throw new JSONException("vibrateTimings have invalid length");
            }
            int length = jSONArrayC.length();
            long[] jArr = new long[length];
            for (int i12 = 0; i12 < length; i12++) {
                jArr[i12] = jSONArrayC.optLong(i12);
            }
            return jArr;
        } catch (NumberFormatException | JSONException unused) {
            jSONArrayC.toString();
            return null;
        }
    }

    public final Bundle k() {
        Bundle bundle = this.f361940a;
        Bundle bundle2 = new Bundle(bundle);
        for (String str : bundle.keySet()) {
            if (!str.startsWith("google.c.a.") && !str.equals(InlineFilterValue.InlineFilterDateRangeValue.FROM_PARAM_NAME)) {
                bundle2.remove(str);
            }
        }
        return bundle2;
    }
}
