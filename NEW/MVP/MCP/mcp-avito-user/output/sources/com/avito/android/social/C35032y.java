package com.avito.android.social;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.webkit.CookieManager;
import com.avito.android.R;
import com.avito.android.social.D;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.text.C43066x;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: OdnoklassnikiSocialManager.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/social/y;", "Lcom/avito/android/social/v;", "_common_social_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.social.y, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C35032y implements InterfaceC35029v {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final ru.ok.android.sdk.f f284430a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f284431b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public String f284432c;

    @Inject
    public C35032y(@Y61.k Context context) {
        ru.ok.android.sdk.f fVar;
        this.f284431b = context.getString(R.string.authorization_canceled);
        ru.ok.android.sdk.f.f436689i.getClass();
        if (ru.ok.android.sdk.f.f436688h != null) {
            Context applicationContext = context.getApplicationContext();
            fVar = ru.ok.android.sdk.f.f436688h;
            if (fVar == null) {
                fVar = new ru.ok.android.sdk.f(applicationContext, null, null, 6, null);
            }
        } else {
            Context applicationContext2 = context.getApplicationContext();
            String string = context.getString(R.string.okAppId);
            String string2 = context.getString(R.string.okAppKey);
            if (C43066x.K(string) || C43066x.K(string2)) {
                throw new IllegalArgumentException(applicationContext2.getString(R.string.no_application_data));
            }
            fVar = new ru.ok.android.sdk.f(applicationContext2.getApplicationContext(), string, string2);
        }
        this.f284430a = fVar;
    }

    @Override // com.avito.android.social.D
    public final void a() {
        this.f284432c = null;
        ru.ok.android.sdk.f fVar = this.f284430a;
        fVar.f436690a = null;
        fVar.f436691b = null;
        fVar.f436692c = null;
        ru.ok.android.sdk.t.f436705a.getClass();
        SharedPreferences.Editor editorEdit = fVar.f436696g.getSharedPreferences("oksdkprefs", 0).edit();
        editorEdit.remove("acctkn");
        editorEdit.remove("ssk");
        editorEdit.remove("ok_sdk_tkn");
        editorEdit.apply();
        CookieManager.getInstance().removeAllCookies(null);
    }

    @Override // com.avito.android.social.D
    @Y61.l
    /* renamed from: c, reason: from getter */
    public final String getF284323b() {
        return this.f284432c;
    }

    @Override // com.avito.android.social.D
    @Y61.l
    public final String d() {
        return null;
    }

    @Override // com.avito.android.social.D
    public final void e(@Y61.k SocialActivity socialActivity, @Y61.l Y41.l lVar) {
        a();
        this.f284430a.a(new C35031x(this, lVar, socialActivity));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.social.D
    public final boolean g(int i12, int i13, @Y61.l Intent intent, @Y61.l Y41.l<? super D.b, G0> lVar) throws JSONException {
        C35030w c35030w = new C35030w(this, lVar);
        ru.ok.android.sdk.f fVar = this.f284430a;
        fVar.getClass();
        if (i12 == 22890) {
            if (i12 != 22890) {
                return false;
            }
            if (intent == null) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("activity_result", i13);
                } catch (JSONException unused) {
                }
                c35030w.a(jSONObject.toString());
            } else {
                String stringExtra = intent.getStringExtra("access_token");
                if (stringExtra == null) {
                    String stringExtra2 = intent.getStringExtra("error");
                    if (i13 == 3 && (c35030w instanceof ru.ok.android.sdk.n)) {
                        ((ru.ok.android.sdk.n) c35030w).q(stringExtra2);
                    } else {
                        c35030w.a(stringExtra2);
                    }
                } else {
                    String stringExtra3 = intent.getStringExtra("session_secret_key");
                    String stringExtra4 = intent.getStringExtra("refresh_token");
                    long longExtra = intent.getLongExtra("expires_in", 0L);
                    fVar.f436690a = stringExtra;
                    if (stringExtra3 == null) {
                        stringExtra3 = stringExtra4;
                    }
                    fVar.f436691b = stringExtra3;
                    JSONObject jSONObject2 = new JSONObject();
                    try {
                        jSONObject2.put("access_token", fVar.f436690a);
                        jSONObject2.put("session_secret_key", fVar.f436691b);
                        if (longExtra > 0) {
                            jSONObject2.put("expires_in", longExtra);
                        }
                    } catch (JSONException unused2) {
                    }
                    fVar.f436693d.b();
                    c35030w.b(jSONObject2);
                }
            }
        } else {
            if (i12 != 22891 && i12 != 22892 && i12 != 22893) {
                return false;
            }
            if (intent == null) {
                JSONObject jSONObject3 = new JSONObject();
                try {
                    jSONObject3.put("activity_result", i13);
                } catch (JSONException unused3) {
                }
                c35030w.a(jSONObject3.toString());
            } else if (intent.hasExtra("error")) {
                c35030w.a(intent.getStringExtra("error"));
            } else {
                try {
                    c35030w.b(new JSONObject(intent.getStringExtra("result")));
                } catch (JSONException unused4) {
                    c35030w.a(intent.getStringExtra("result"));
                }
            }
        }
        return true;
    }

    @Override // com.avito.android.social.InterfaceC35021m
    @Y61.k
    public final SocialType getType() {
        return SocialType.f284282e;
    }
}
