package com.my.target;

import android.content.Context;
import com.my.target.p1;
import e11.AbstractC39858c1;
import e11.C39882k1;
import e11.C39901r0;
import java.util.ArrayList;

/* renamed from: com.my.target.h0, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC37789h0<T extends AbstractC39858c1> {
    /* JADX WARN: Removed duplicated region for block: B:23:0x0049  */
    @j.P
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static org.json.JSONObject c(@j.P java.lang.String r7, @j.N com.my.target.p1.a r8, @j.N com.my.target.p1 r9, @j.P java.util.List<java.lang.String> r10) {
        /*
            if (r7 == 0) goto L6
            java.lang.String r7 = r7.trim()
        L6:
            r0 = 0
            if (r7 == 0) goto L7f
            java.lang.String r1 = ""
            boolean r1 = r1.equals(r7)
            if (r1 == 0) goto L13
            goto L7f
        L13:
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L7b
            r1.<init>(r7)     // Catch: java.lang.Throwable -> L7b
            boolean r7 = e11.C39909u.f394851a     // Catch: java.lang.Throwable -> L7b
            r2 = 1
            r3 = 0
            if (r7 == 0) goto L1f
            goto L29
        L1f:
            java.lang.String r7 = "sdk_debug_mode"
            boolean r7 = r1.optBoolean(r7, r3)     // Catch: java.lang.Throwable -> L7b
            if (r7 == 0) goto L29
            e11.C39909u.f394851a = r2     // Catch: java.lang.Throwable -> L7b
        L29:
            java.lang.String r7 = "version"
            java.lang.String r7 = r1.getString(r7)     // Catch: java.lang.Throwable -> L45
            java.lang.String r4 = "."
            int r4 = r7.indexOf(r4)     // Catch: java.lang.Throwable -> L45
            if (r4 <= 0) goto L49
            java.lang.String r7 = r7.substring(r3, r4)     // Catch: java.lang.Throwable -> L45
            r4 = 10
            int r7 = java.lang.Integer.parseInt(r7, r4)     // Catch: java.lang.Throwable -> L45
            r4 = 2
            if (r7 != r4) goto L49
            goto L4a
        L45:
            r7 = move-exception
            r7.getMessage()     // Catch: java.lang.Throwable -> L7b
        L49:
            r2 = r3
        L4a:
            if (r2 != 0) goto L4d
            return r0
        L4d:
            if (r10 != 0) goto L50
            goto L70
        L50:
            java.lang.String r7 = "hosts"
            org.json.JSONArray r7 = r1.optJSONArray(r7)     // Catch: java.lang.Throwable -> L70
            if (r7 == 0) goto L70
            int r2 = r7.length()     // Catch: java.lang.Throwable -> L70
            r4 = r3
        L5d:
            if (r4 >= r2) goto L70
            java.lang.String r5 = r7.optString(r4, r0)     // Catch: java.lang.Throwable -> L70
            boolean r6 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Throwable -> L70
            if (r6 == 0) goto L6a
            goto L6d
        L6a:
            r10.add(r5)     // Catch: java.lang.Throwable -> L70
        L6d:
            int r4 = r4 + 1
            goto L5d
        L70:
            java.lang.String r7 = "sdk_ms"
            boolean r7 = r1.optBoolean(r7, r3)     // Catch: java.lang.Throwable -> L7b
            r8.f365075b = r7     // Catch: java.lang.Throwable -> L7b
            r9.f365073e = r7     // Catch: java.lang.Throwable -> L7b
            return r1
        L7b:
            r7 = move-exception
            r7.getMessage()
        L7f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.my.target.AbstractC37789h0.c(java.lang.String, com.my.target.p1$a, com.my.target.p1, java.util.List):org.json.JSONObject");
    }

    public static boolean d(@j.N String str) {
        String strTrim = str.trim();
        return strTrim.startsWith("<VAST") || strTrim.startsWith("<?xml");
    }

    @j.P
    public abstract AbstractC39858c1 b(@j.N String str, @j.N C39882k1 c39882k1, @j.P AbstractC39858c1 abstractC39858c1, @j.N C39901r0 c39901r0, @j.N p1.a aVar, @j.N p1 p1Var, @j.P ArrayList arrayList, @j.N Context context);
}
