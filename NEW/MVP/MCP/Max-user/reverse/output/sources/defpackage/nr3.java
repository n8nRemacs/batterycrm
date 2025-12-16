package defpackage;

import org.apache.http.cookie.ClientCookie;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.rate.connection.CandidateTypeHintConfig;

/* loaded from: classes2.dex */
public final class nr3 {
    public final String a;
    public final String b;
    public final boolean c;
    public final bwf d = new bwf(new hk1(22, this));

    public nr3(String str, String str2, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = z;
    }

    public static final nr3 a(JSONObject jSONObject) {
        try {
            return new nr3(jSONObject.optString(CandidateTypeHintConfig.TYPE_HOST), jSONObject.optString(ClientCookie.PORT_ATTR), jSONObject.optBoolean("tls", true));
        } catch (JSONException unused) {
            return null;
        }
    }

    public final int b() {
        return ((Number) this.d.getValue()).intValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nr3)) {
            return false;
        }
        nr3 nr3Var = (nr3) obj;
        return fni.a(this.a, nr3Var.a) && fni.a(this.b, nr3Var.b) && this.c == nr3Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + u45.e(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return az1.k(wy1.l("ConnectionHost{host=", this.a, "|port=", this.b, "|tls="), this.c, "}");
    }
}
