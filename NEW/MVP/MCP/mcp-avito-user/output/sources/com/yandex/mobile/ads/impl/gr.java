package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.net.Uri;
import java.util.HashMap;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public final class gr {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final ny0 f385813a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    private final l80 f385814b;

    public gr(@Y61.k Context context, @Y61.k ny0 ny0Var, @Y61.k l80 l80Var) {
        this.f385813a = ny0Var;
        this.f385814b = l80Var;
    }

    public final void a(@Y61.k Uri uri, @Y61.l JSONObject jSONObject) {
        HashMap map;
        String queryParameter = uri.getQueryParameter("eventName");
        if (queryParameter != null) {
            if (queryParameter.length() == 0) {
                queryParameter = null;
            }
            if (queryParameter != null) {
                if (jSONObject != null) {
                    this.f385814b.getClass();
                    map = l80.a(jSONObject);
                } else {
                    map = new HashMap();
                }
                this.f385813a.a(new ky0(queryParameter, map));
            }
        }
    }

    public /* synthetic */ gr(Context context) {
        this(context, m9.a(context), new l80());
    }
}
