package e11;

import android.content.Context;
import android.text.TextUtils;
import org.json.JSONObject;

/* renamed from: e11.d, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C39859d {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    public final C39882k1 f394559a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    public final C39901r0 f394560b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    public final Context f394561c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    public final R1 f394562d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f394563e = true;

    public C39859d(@j.N C39882k1 c39882k1, @j.N C39901r0 c39901r0, @j.N Context context) {
        this.f394559a = c39882k1;
        this.f394560b = c39901r0;
        this.f394561c = context;
        this.f394562d = new R1(c39882k1, c39901r0, context);
    }

    /* JADX WARN: Removed duplicated region for block: B:147:0x01ab A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01a8  */
    @j.P
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final e11.p2 a(@j.P java.lang.String r17, @j.N org.json.JSONObject r18) {
        /*
            Method dump skipped, instructions count: 800
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e11.C39859d.a(java.lang.String, org.json.JSONObject):e11.p2");
    }

    public final void b(@j.N String str, @j.N String str2) {
        if (this.f394563e) {
            C39882k1 c39882k1 = this.f394559a;
            String str3 = c39882k1.f394643a;
            C39866f0 c39866f0 = new C39866f0("Required field");
            c39866f0.f394595b = str;
            c39866f0.f394596c = this.f394560b.f394772i;
            c39866f0.f394598e = str2;
            if (str3 == null) {
                str3 = c39882k1.f394644b;
            }
            c39866f0.f394597d = str3;
            c39866f0.a(this.f394561c);
        }
    }

    public final void c(@j.N JSONObject jSONObject, @j.N p2 p2Var) {
        this.f394562d.c(jSONObject, p2Var);
        this.f394563e = p2Var.f394701G;
        Boolean bool = this.f394559a.f394637F;
        p2Var.f394744K = bool != null ? bool.booleanValue() : jSONObject.optBoolean("allowBackButton", p2Var.f394744K);
        p2Var.f394742I = (float) jSONObject.optDouble("allowCloseDelay", p2Var.f394742I);
        String strOptString = jSONObject.optString("close_icon_hd");
        if (TextUtils.isEmpty(strOptString)) {
            return;
        }
        p2Var.f394741H = new com.my.target.common.models.b(strOptString);
    }
}
