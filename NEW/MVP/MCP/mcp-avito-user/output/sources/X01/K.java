package x01;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class K implements N {

    /* renamed from: b, reason: collision with root package name */
    public String f441980b;

    /* renamed from: c, reason: collision with root package name */
    public String f441981c;

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        C49720e c49720eB;
        String str;
        G gA2 = AbstractC49725j.a(this.f441980b, this.f441981c);
        try {
            c49720eB = com.huawei.hms.hatool.a0.b("{url}/getPublicKey?keytype=2".replace("{url}", gA2 != null ? gA2.f441952a : ""), new byte[0], org.webrtc.h.g("App-Id", AbstractC49722g.a()));
        } catch (Exception e12) {
            m0.d("GetPublicKey", "get pubKey response Exception :" + e12.getMessage());
            c49720eB = null;
        }
        if (c49720eB != null) {
            int i12 = c49720eB.f442027a;
            if (i12 == 200) {
                String str2 = c49720eB.f442028b;
                if (TextUtils.isEmpty(str2)) {
                    return;
                }
                try {
                    JSONObject jSONObject = new JSONObject(str2);
                    String strOptString = jSONObject.optString("publicKey");
                    String strOptString2 = jSONObject.optString("publicKeyOM");
                    String strOptString3 = jSONObject.optString("pubkey_version");
                    String str3 = System.currentTimeMillis() + "";
                    String strOptString4 = jSONObject.optString("timeInterval");
                    C49733s.e(AbstractC49722g.b(), "Privacy_MY", "public_key_oper", P01.b.d("HiAnalytics_Sdk_Public_Sp_Key", strOptString));
                    C49733s.e(AbstractC49722g.b(), "Privacy_MY", "public_key_maint", P01.b.d("HiAnalytics_Sdk_Public_Sp_Key", strOptString2));
                    C49733s.e(AbstractC49722g.b(), "Privacy_MY", "public_key_time_interval", strOptString4);
                    C49733s.e(AbstractC49722g.b(), "Privacy_MY", "public_key_version", strOptString3);
                    C49733s.e(AbstractC49722g.b(), "Privacy_MY", "public_key_time_last", str3);
                    C49714A.a().f441939a.f441975h = strOptString;
                    C49714A.a().f441939a.f441976i = strOptString2;
                    C49714A.a().f441939a.f441979l = strOptString3;
                    C49714A.a().f441939a.f441978k = str3;
                    C49714A.a().f441939a.f441977j = strOptString4;
                    return;
                } catch (JSONException e13) {
                    m0.d("GetPublicKey", "get pubKey parse json JSONException :" + e13.getMessage());
                    return;
                }
            }
            str = "get pubKey fail HttpCode :" + i12;
        } else {
            str = "get pubKey response is null";
        }
        m0.d("GetPublicKey", str);
    }
}
