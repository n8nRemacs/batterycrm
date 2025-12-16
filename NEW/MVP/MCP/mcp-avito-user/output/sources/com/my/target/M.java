package com.my.target;

import android.content.Context;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import e11.C39866f0;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class M {
    /* JADX WARN: Removed duplicated region for block: B:21:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0197 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    @j.P
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.my.target.C37788h a(@j.P org.json.JSONObject r26, @j.P java.lang.String r27, @j.P java.lang.String r28, int r29, boolean r30, @j.N android.content.Context r31) {
        /*
            Method dump skipped, instructions count: 469
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.my.target.M.a(org.json.JSONObject, java.lang.String, java.lang.String, int, boolean, android.content.Context):com.my.target.h");
    }

    @j.P
    public static String b(@j.N JSONObject jSONObject, @j.P String str, boolean z12, @j.P String str2, @j.P String str3, int i12, boolean z13, @j.N Context context) {
        String strOptString = jSONObject.optString(ContextActionHandler.Link.URL);
        if (e11.F.c(strOptString)) {
            return strOptString;
        }
        if (!strOptString.isEmpty()) {
            c("Bad value", "Invalid url in adChoices option", str2, str3, i12, z13, context);
        }
        if (str == null || !z12) {
            return null;
        }
        String strConcat = str.concat("&reason=");
        boolean zIsNull = jSONObject.isNull("id");
        int iOptInt = jSONObject.optInt("id");
        if (zIsNull) {
            return strConcat;
        }
        if (iOptInt < 1) {
            c("Bad value", "Invalid id in adChoices option", str2, str3, i12, z13, context);
            return strConcat;
        }
        return strConcat + iOptInt;
    }

    public static void c(@j.N String str, @j.N String str2, @j.P String str3, @j.P String str4, int i12, boolean z12, @j.N Context context) {
        if (z12) {
            C39866f0 c39866f0 = new C39866f0(str);
            c39866f0.f394595b = str2;
            c39866f0.f394596c = i12;
            c39866f0.f394597d = str4;
            c39866f0.f394598e = str3;
            c39866f0.a(context);
        }
    }
}
