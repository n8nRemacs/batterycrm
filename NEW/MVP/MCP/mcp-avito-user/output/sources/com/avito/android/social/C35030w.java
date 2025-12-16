package com.avito.android.social;

import com.avito.android.social.D;
import com.avito.android.social.I;
import kotlin.G0;
import kotlin.Metadata;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: OdnoklassnikiSocialManager.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/social/w;", "Lru/ok/android/sdk/o;", "_common_social_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.social.w, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C35030w implements ru.ok.android.sdk.o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C35032y f284425a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Y41.l<D.b, G0> f284426b;

    /* JADX WARN: Multi-variable type inference failed */
    public C35030w(C35032y c35032y, Y41.l<? super D.b, G0> lVar) {
        this.f284425a = c35032y;
        this.f284426b = lVar;
    }

    public final void a(@Y61.l String str) {
        boolean zF2 = kotlin.jvm.internal.L.f(str, this.f284425a.f284431b);
        Y41.l<D.b, G0> lVar = this.f284426b;
        if (zF2) {
            if (lVar != null) {
                lVar.invoke(D.b.a.f284269a);
            }
        } else if (lVar != null) {
            lVar.invoke(D.b.C8495b.f284270a);
        }
    }

    public final void b(@Y61.k JSONObject jSONObject) {
        String string;
        C35032y c35032y = this.f284425a;
        c35032y.getClass();
        try {
            string = jSONObject.getString("access_token");
        } catch (JSONException unused) {
            string = null;
        }
        c35032y.f284432c = string;
        ((I.a) this.f284426b).invoke(D.b.c.f284271a);
    }
}
