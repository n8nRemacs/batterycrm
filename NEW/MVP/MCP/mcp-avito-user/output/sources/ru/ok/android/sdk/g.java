package ru.ok.android.sdk;

import android.text.TextUtils;
import com.avito.android.social.C35031x;
import java.io.IOException;
import kotlin.Metadata;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: Odnoklassniki.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 0})
/* loaded from: classes9.dex */
final class g implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f436697b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C35031x f436698c;

    public g(f fVar, C35031x c35031x) {
        this.f436697b = fVar;
        this.f436698c = c35031x;
    }

    @Override // java.lang.Runnable
    public final void run() throws JSONException {
        C35031x c35031x = this.f436698c;
        f fVar = this.f436697b;
        try {
            f fVar2 = f.f436688h;
            OkRequestMode.f436672g.getClass();
            String strC = fVar.c("users.getLoggedInUser", null, OkRequestMode.f436671f);
            if (strC == null || strC.length() <= 2 || !TextUtils.isDigitsOnly(strC.substring(1, strC.length() - 1))) {
                try {
                    JSONObject jSONObject = new JSONObject(strC);
                    if (jSONObject.has("error_msg")) {
                        f.b(c35031x, jSONObject.getString("error_msg"));
                        return;
                    }
                } catch (JSONException unused) {
                }
                f.b(c35031x, strC);
                return;
            }
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("access_token", fVar.f436690a);
                jSONObject2.put("session_secret_key", fVar.f436691b);
                jSONObject2.put("logged_in_user", strC);
            } catch (JSONException unused2) {
            }
            fVar.f436693d.b();
            ru.ok.android.sdk.util.e eVar = ru.ok.android.sdk.util.e.f436721b;
            i iVar = new i(c35031x, jSONObject2);
            eVar.getClass();
            ru.ok.android.sdk.util.e.a(iVar);
        } catch (IOException e12) {
            String message = e12.getMessage();
            fVar.getClass();
            f.b(c35031x, message);
        }
    }
}
