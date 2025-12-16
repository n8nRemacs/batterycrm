package com.yandex.metrica.impl.ob;

import android.text.TextUtils;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class He implements Ge {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final C39053pe f378261a;

    public He() {
        this(new C39053pe());
    }

    @Override // com.yandex.metrica.impl.ob.Ge
    @j.N
    public byte[] a(@j.N C39077qe c39077qe, @j.N Lg lg2) {
        if (!lg2.T() && !TextUtils.isEmpty(c39077qe.f381470b)) {
            try {
                JSONObject jSONObject = new JSONObject(c39077qe.f381470b);
                jSONObject.remove("preloadInfo");
                c39077qe.f381470b = jSONObject.toString();
            } catch (Throwable unused) {
            }
        }
        return this.f378261a.a(c39077qe, lg2);
    }

    @j.k0
    public He(@j.N C39053pe c39053pe) {
        this.f378261a = c39053pe;
    }
}
