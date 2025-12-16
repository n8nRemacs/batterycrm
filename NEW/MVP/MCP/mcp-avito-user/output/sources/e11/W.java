package e11;

import android.content.Context;
import android.text.TextUtils;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class W {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    public final C39882k1 f394494a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    public final C39901r0 f394495b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    public final Context f394496c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f394497d = true;

    public W(@j.N C39882k1 c39882k1, @j.N C39901r0 c39901r0, @j.N Context context) {
        this.f394494a = c39882k1;
        this.f394495b = c39901r0;
        this.f394496c = context;
    }

    @j.P
    public final com.my.target.common.models.b a(@j.N String str, @j.N JSONObject jSONObject) {
        String strOptString = jSONObject.optString("imageLink");
        if (TextUtils.isEmpty(strOptString)) {
            b("InterstitialAdImageBanner no imageLink for image", str);
            return null;
        }
        int iOptInt = jSONObject.optInt("width");
        int iOptInt2 = jSONObject.optInt("height");
        if (iOptInt <= 0 || iOptInt2 <= 0) {
            b(androidx.compose.foundation.H.j(iOptInt, iOptInt2, "InterstitialAdImageBanner  image has wrong dimensions, w = ", ", h = "), str);
            return null;
        }
        com.my.target.common.models.b bVar = new com.my.target.common.models.b(strOptString);
        bVar.f394305b = iOptInt;
        bVar.f394306c = iOptInt2;
        return bVar;
    }

    public final void b(@j.N String str, @j.N String str2) {
        if (this.f394497d) {
            C39882k1 c39882k1 = this.f394494a;
            String str3 = c39882k1.f394643a;
            C39866f0 c39866f0 = new C39866f0("Required field");
            c39866f0.f394595b = str;
            c39866f0.f394596c = this.f394495b.f394772i;
            c39866f0.f394598e = str2;
            if (str3 == null) {
                str3 = c39882k1.f394644b;
            }
            c39866f0.f394597d = str3;
            c39866f0.a(this.f394496c);
        }
    }
}
