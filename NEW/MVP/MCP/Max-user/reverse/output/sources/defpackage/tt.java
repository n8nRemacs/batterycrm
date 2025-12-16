package defpackage;

import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class tt {
    public final y6d a;

    public /* synthetic */ tt(y6d y6dVar, kk4 kk4Var) {
        this.a = y6dVar;
    }

    public static h0f a(JSONObject jSONObject) {
        ti1 ti1VarA = ti1.a(jSONObject.getString("initiator"));
        long j = jSONObject.getLong("recordMovieId");
        String string = jSONObject.getString("recordType");
        return new h0f(j, string.equals("STREAM") ? pgd.c : string.equals("RECORD") ? pgd.b : pgd.a, ti1VarA, jSONObject.optLong("recordStartTime", System.currentTimeMillis()), yni.g(jSONObject, "recordExternalMovieId"), yni.g(jSONObject, "recordExternalOwnerId"));
    }

    public static k21 b(JSONObject jSONObject) {
        ti1 ti1VarA;
        try {
            ti1VarA = ti1.a(jSONObject.optString("initiatorId"));
        } catch (Exception unused) {
            ti1VarA = null;
        }
        if (ti1VarA == null) {
            return null;
        }
        return new k21(ti1VarA, jSONObject.has("movieId") ? Long.valueOf(jSONObject.optLong("movieId")) : null);
    }
}
