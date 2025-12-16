package com.avito.android.social;

import com.avito.android.social.D;
import kotlin.G0;
import kotlin.Metadata;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: OdnoklassnikiSocialManager.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/social/x;", "Lru/ok/android/sdk/o;", "_common_social_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.social.x, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C35031x implements ru.ok.android.sdk.o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C35032y f284427a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Y41.l<D.b, G0> f284428b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ SocialActivity f284429c;

    public C35031x(C35032y c35032y, Y41.l lVar, SocialActivity socialActivity) {
        this.f284427a = c35032y;
        this.f284428b = lVar;
        this.f284429c = socialActivity;
    }

    public final void a(@Y61.k JSONObject jSONObject) throws JSONException {
        String string;
        C35032y c35032y = this.f284427a;
        c35032y.getClass();
        try {
            string = jSONObject.getString("access_token");
        } catch (JSONException unused) {
            string = null;
        }
        c35032y.f284432c = string;
        ((J) this.f284428b).invoke(D.b.c.f284271a);
    }
}
