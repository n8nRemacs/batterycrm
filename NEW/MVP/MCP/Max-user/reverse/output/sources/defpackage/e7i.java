package defpackage;

/* loaded from: classes2.dex */
public final class e7i implements xzf {
    public final lzf a;
    public final String b;
    public final k18 c;

    public e7i(k18 k18Var, lzf lzfVar, String str) {
        this.a = lzfVar;
        this.b = str;
        this.c = k18Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object d(defpackage.e7i r4, double r5, double r7, defpackage.q44 r9) {
        /*
            boolean r0 = r9 instanceof defpackage.c7i
            if (r0 == 0) goto L13
            r0 = r9
            c7i r0 = (defpackage.c7i) r0
            int r1 = r0.X
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.X = r1
            goto L18
        L13:
            c7i r0 = new c7i
            r0.<init>(r4, r9)
        L18:
            java.lang.Object r9 = r0.d
            int r1 = r0.X
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L2e
            if (r1 != r2) goto L26
            defpackage.g8j.b(r9)
            goto L7a
        L26:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2e:
            defpackage.g8j.b(r9)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r1 = "https://geocode-maps.yandex.ru/v1?lang=ru_RU&results=1&format=json&geocode="
            r9.<init>(r1)
            r9.append(r7)
            r7 = 44
            r9.append(r7)
            r9.append(r5)
            java.lang.String r5 = "&apikey="
            r9.append(r5)
            java.lang.String r5 = r4.b
            r9.append(r5)
            java.lang.String r5 = r9.toString()
            kw6 r6 = new kw6
            r6.<init>()
            java.lang.String r7 = "GET"
            r6.e(r7, r3)
            r6.m(r5)
            zmd r5 = r6.a()
            lzf r6 = r4.a
            q2b r6 = (defpackage.q2b) r6
            z74 r6 = r6.d()
            d7i r7 = new d7i
            r7.<init>(r4, r5, r3)
            r0.X = r2
            java.lang.Object r9 = defpackage.svi.i(r6, r7, r0)
            g84 r4 = defpackage.g84.a
            if (r9 != r4) goto L7a
            return r4
        L7a:
            org.json.JSONObject r9 = (org.json.JSONObject) r9
            if (r9 != 0) goto L7f
            goto Lad
        L7f:
            java.lang.String r4 = "response"
            org.json.JSONObject r4 = r9.optJSONObject(r4)
            if (r4 == 0) goto Lad
            java.lang.String r5 = "GeoObjectCollection"
            org.json.JSONObject r4 = r4.optJSONObject(r5)
            if (r4 == 0) goto Lad
            java.lang.String r5 = "featureMember"
            org.json.JSONArray r4 = r4.optJSONArray(r5)
            if (r4 == 0) goto Lad
            r5 = 0
            org.json.JSONObject r4 = r4.optJSONObject(r5)
            if (r4 == 0) goto Lad
            java.lang.String r5 = "GeoObject"
            org.json.JSONObject r4 = r4.optJSONObject(r5)
            if (r4 == 0) goto Lad
            java.lang.String r5 = "name"
            java.lang.String r4 = r4.optString(r5)
            return r4
        Lad:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e7i.d(e7i, double, double, q44):java.lang.Object");
    }

    @Override // defpackage.xzf
    public final float a(double d, double d2, double d3, double d4) {
        return (float) jca.b(d, d2, d3, d4);
    }

    @Override // defpackage.xzf
    public final Object b(double d, double d2, double d3, double d4, q44 q44Var) {
        return svi.i(((q2b) this.a).b(), new b7i(this, d, d2, null), q44Var);
    }

    @Override // defpackage.xzf
    public final boolean c(double d, double d2, double d3, double d4) {
        return jca.b(d, d2, d3, d4) < 10.0d;
    }
}
