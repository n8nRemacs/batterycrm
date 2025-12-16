package com.avito.android.captcha;

import com.avito.android.captcha.q;
import com.avito.android.captcha.y;
import com.avito.android.captcha.z;
import com.avito.android.remote.captcha.model.CaptchaType;
import com.geetest.captcha.GTCaptcha4Client;
import org.json.JSONObject;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes12.dex */
public final /* synthetic */ class A implements GTCaptcha4Client.OnSuccessListener, GTCaptcha4Client.OnFailureListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ B f114912a;

    @Override // com.geetest.captcha.GTCaptcha4Client.OnFailureListener
    public void onFailure(String str) {
        z.d dVarI;
        B b12 = this.f114912a;
        int i12 = B.f114913p;
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("desc");
            String strOptString = jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optString("description") : null;
            if (strOptString != null) {
                str = strOptString;
            }
            String strOptString2 = jSONObject.optString("code");
            b12.getClass();
            dVarI = new z.d(new q.c(str, B.k(strOptString2), CaptchaType.GEETEST));
        } catch (Throwable unused) {
            b12.getClass();
            dVarI = B.i("Geetest error json parsing failed");
        }
        b12.f(dVarI);
    }

    /* JADX WARN: Type inference failed for: r8v4, types: [Y41.l, kotlin.jvm.internal.N] */
    @Override // com.geetest.captcha.GTCaptcha4Client.OnSuccessListener
    public void onSuccess(boolean z12, String str) {
        B b12 = this.f114912a;
        int i12 = B.f114913p;
        if (z12) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                y.b bVar = new y.b(jSONObject.getString("captcha_id"), jSONObject.getString("lot_number"), jSONObject.getString("captcha_output"), jSONObject.getString("pass_token"), jSONObject.getString("gen_time"));
                ?? r82 = b12.f114923k;
                if (r82 != 0) {
                    r82.invoke(bVar);
                }
                b12.g();
            } catch (Throwable unused) {
                b12.getClass();
                b12.f(B.i("Geetest success json parsing failed"));
            }
        }
    }
}
