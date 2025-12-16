package x01;

import android.content.Context;
import android.text.TextUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: x01.B, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C49715B implements N {

    /* renamed from: b, reason: collision with root package name */
    public Context f441940b;

    /* renamed from: c, reason: collision with root package name */
    public String f441941c;

    /* renamed from: d, reason: collision with root package name */
    public JSONObject f441942d;

    /* renamed from: e, reason: collision with root package name */
    public String f441943e;

    /* renamed from: f, reason: collision with root package name */
    public String f441944f;

    /* renamed from: g, reason: collision with root package name */
    public String f441945g;

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        JSONArray jSONArray;
        m0.b("Begin to run EventRecordTask...");
        C49714A.a().f441939a.getClass();
        String str = this.f441943e;
        String str2 = this.f441944f;
        G gA2 = AbstractC49725j.a(str, str2);
        int i12 = gA2 != null ? gA2.f441958g : 10;
        Context context = this.f441940b;
        if (W.a(context, "stat_v2_1", 5242880)) {
            m0.b("stat sp file reach max limited size, discard new event");
            C49736v.a().d("", "alltype");
            return;
        }
        X x12 = new X();
        x12.f442014b = this.f441941c;
        x12.f442015c = this.f441942d.toString();
        x12.f442013a = str2;
        x12.f442016d = this.f441945g;
        x12.f442017e = null;
        x12.f442018f = null;
        try {
            JSONObject jSONObjectC = x12.c();
            String strA = e0.a(str, str2);
            String strB = C49733s.b(context, "stat_v2_1", strA);
            try {
                jSONArray = !TextUtils.isEmpty(strB) ? new JSONArray(strB) : new JSONArray();
            } catch (JSONException unused) {
                m0.c("Cached data corrupted: stat_v2_1");
                jSONArray = new JSONArray();
            }
            jSONArray.put(jSONObjectC);
            C49733s.e(context, "stat_v2_1", strA, jSONArray.toString());
            if (jSONArray.toString().length() > i12 * 1024) {
                C49736v.a().d(str, str2);
            }
        } catch (JSONException unused2) {
            m0.d("hmsSdk", "eventRecord toJson error! The record failed.");
        }
    }
}
