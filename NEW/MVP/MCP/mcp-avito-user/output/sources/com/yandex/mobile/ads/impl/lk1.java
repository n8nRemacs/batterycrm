package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.yandex.mobile.ads.impl.tk1;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes8.dex */
public final class lk1 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final n5 f387559a = new n5();

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final nk1 f387560b = new nk1();

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final wy0 f387561c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    private final ck f387562d;

    /* renamed from: e, reason: collision with root package name */
    @j.N
    private final ps f387563e;

    /* renamed from: f, reason: collision with root package name */
    @j.N
    private final e31 f387564f;

    public lk1() {
        wy0 wy0Var = new wy0();
        this.f387561c = wy0Var;
        this.f387562d = new ck(wy0Var);
        this.f387563e = new ps();
        this.f387564f = new e31();
    }

    @j.N
    public final ik1 a(@j.N Context context, @j.N n2 n2Var, @j.N jk1 jk1Var, @j.N Object obj, @j.N mk1 mk1Var) {
        String strA = jk1Var.a();
        String strC = jk1Var.c();
        String strB = jk1Var.b();
        n5 n5Var = this.f387559a;
        Map<String, String> mapD = jk1Var.d();
        n5Var.getClass();
        HashMap mapA = n5.a(mapD);
        ts tsVarJ = n2Var.j();
        String strF = tsVarJ.f();
        String strD = tsVarJ.d();
        String strA2 = tsVarJ.a();
        if (TextUtils.isEmpty(strA2)) {
            strA2 = "https://mobile.yandexadexchange.net";
        }
        Uri.Builder builderAppendQueryParameter = Uri.parse(strA2).buildUpon().appendPath(strA).appendPath("vmap").appendPath(strC).appendQueryParameter("video-category-id", strB);
        this.f387564f.getClass();
        if (!e31.a(context)) {
            this.f387561c.getClass();
            wy0.a(builderAppendQueryParameter, "uuid", strF);
            this.f387561c.getClass();
            wy0.a(builderAppendQueryParameter, "mauid", strD);
        }
        this.f387562d.a(context, builderAppendQueryParameter);
        if (mapA != null) {
            for (Map.Entry entry : mapA.entrySet()) {
                builderAppendQueryParameter.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
            }
        }
        new vs(context, n2Var).a(context, builderAppendQueryParameter);
        ik1 ik1Var = new ik1(context, this.f387563e.a(context, builderAppendQueryParameter.build().toString()), new tk1.b(mk1Var), jk1Var, this.f387560b);
        ik1Var.b(obj);
        return ik1Var;
    }
}
