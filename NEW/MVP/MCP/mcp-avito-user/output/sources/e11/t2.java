package e11;

import android.content.Context;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class t2 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    public final Context f394846a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    public final C39882k1 f394847b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    public final C39901r0 f394848c;

    /* renamed from: d, reason: collision with root package name */
    @j.P
    public String f394849d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f394850e = true;

    public t2(@j.N C39882k1 c39882k1, @j.N C39901r0 c39901r0, @j.N Context context) {
        this.f394847b = c39882k1;
        this.f394848c = c39901r0;
        this.f394846a = context;
    }

    @j.P
    public static C39865f a(@j.N JSONObject jSONObject, @j.N String str, float f12) {
        C39865f c39865f = new C39865f("playheadReachedValue", str);
        c39865f.f394592d = -1.0f;
        c39865f.f394593e = -1.0f;
        if (jSONObject.has("pvalue")) {
            float fOptDouble = (float) jSONObject.optDouble("pvalue", c39865f.f394593e);
            if (fOptDouble >= 0.0f && fOptDouble <= 100.0f) {
                if (f12 > 0.0f) {
                    c39865f.f394592d = (fOptDouble * f12) / 100.0f;
                } else {
                    c39865f.f394593e = fOptDouble;
                }
                return c39865f;
            }
        }
        if (!jSONObject.has("value")) {
            return null;
        }
        float fOptDouble2 = (float) jSONObject.optDouble("value", c39865f.f394592d);
        if (fOptDouble2 < 0.0f) {
            return null;
        }
        c39865f.f394592d = fOptDouble2;
        return c39865f;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00e0  */
    @j.P
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public e11.X1 b(@j.N org.json.JSONObject r13, float r14) {
        /*
            Method dump skipped, instructions count: 300
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e11.t2.b(org.json.JSONObject, float):e11.X1");
    }

    public final void c(@j.N e2 e2Var, @j.N JSONObject jSONObject, @j.N String str, float f12) {
        int length;
        X1 x1B;
        e2Var.c(this.f394847b.f394647e, f12);
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("statistics");
        if (jSONArrayOptJSONArray != null && (length = jSONArrayOptJSONArray.length()) > 0) {
            this.f394849d = str;
            for (int i12 = 0; i12 < length; i12++) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i12);
                if (jSONObjectOptJSONObject != null && (x1B = b(jSONObjectOptJSONObject, f12)) != null) {
                    e2Var.b(x1B);
                }
            }
        }
    }

    public final void d(@j.N String str, @j.N String str2) {
        if (this.f394850e) {
            C39882k1 c39882k1 = this.f394847b;
            String str3 = c39882k1.f394643a;
            C39866f0 c39866f0 = new C39866f0(str);
            c39866f0.f394595b = str2;
            c39866f0.f394596c = this.f394848c.f394772i;
            c39866f0.f394598e = this.f394849d;
            if (str3 == null) {
                str3 = c39882k1.f394644b;
            }
            c39866f0.f394597d = str3;
            c39866f0.a(this.f394846a);
        }
    }
}
