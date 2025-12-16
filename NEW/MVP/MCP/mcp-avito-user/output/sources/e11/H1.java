package e11;

import android.content.Context;
import android.text.TextUtils;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class H1 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f394364a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    public final C39901r0 f394365b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    public final String f394366c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    public final Context f394367d;

    public H1(@j.N C39901r0 c39901r0, @j.N String str, boolean z12, @j.N Context context) {
        this.f394365b = c39901r0;
        this.f394366c = str;
        this.f394364a = z12;
        this.f394367d = context;
    }

    @j.N
    public final C1 a(@j.P C1 c12, @j.N JSONObject jSONObject) {
        U u12;
        Context context = this.f394367d;
        String str = this.f394366c;
        C39901r0 c39901r0 = this.f394365b;
        boolean z12 = this.f394364a;
        if (c12 == null) {
            String strOptString = jSONObject.optString("customReferenceData", null);
            if (strOptString != null && strOptString.length() > 256) {
                if (z12) {
                    C39866f0 c39866f0 = new C39866f0("Bad value");
                    c39866f0.f394595b = "customReferenceData more then 256 symbols";
                    c39866f0.f394596c = c39901r0.f394772i;
                    c39866f0.f394597d = str;
                    c39866f0.a(context);
                }
                strOptString = null;
            }
            c12 = new C1(jSONObject.optString("contentUrl", null), strOptString);
        }
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("resources");
        if (jSONArrayOptJSONArray != null) {
            int length = jSONArrayOptJSONArray.length();
            for (int i12 = 0; i12 < length; i12++) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i12);
                if (jSONObjectOptJSONObject != null) {
                    if (jSONObjectOptJSONObject.has(ContextActionHandler.Link.URL)) {
                        String strOptString2 = jSONObjectOptJSONObject.optString(ContextActionHandler.Link.URL);
                        if (jSONObjectOptJSONObject.has("vendorKey") && jSONObjectOptJSONObject.has("params")) {
                            String strOptString3 = jSONObjectOptJSONObject.optString("vendorKey");
                            String strOptString4 = jSONObjectOptJSONObject.optString("params");
                            if (!TextUtils.isEmpty(strOptString3) && !TextUtils.isEmpty(strOptString4)) {
                                u12 = new U(strOptString2, strOptString3, strOptString4);
                            }
                        } else {
                            u12 = new U(strOptString2, null, null);
                        }
                        c12.f394295c.add(u12);
                    } else if (z12) {
                        C39866f0 c39866f02 = new C39866f0("Required field");
                        c39866f02.f394595b = "VerificationScriptResource has no url";
                        c39866f02.f394596c = c39901r0.f394772i;
                        c39866f02.f394597d = str;
                        c39866f02.a(context);
                    }
                }
            }
        }
        return c12;
    }
}
