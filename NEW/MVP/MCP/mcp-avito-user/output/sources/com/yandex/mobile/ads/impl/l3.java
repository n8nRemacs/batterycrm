package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;

/* loaded from: classes8.dex */
public final class l3 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final o3 f387366a = o3.b();

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final m3 f387367b = new m3();

    @j.N
    public final String a(@j.N Context context) {
        ArrayList arrayListA = this.f387366a.a();
        this.f387367b.getClass();
        v11 v11VarA = q21.b().a(context);
        return TextUtils.join(",", arrayListA.subList(arrayListA.size() - Math.min((v11VarA == null || v11VarA.c() == 0) ? 5 : v11VarA.c(), arrayListA.size()), arrayListA.size()));
    }

    @j.N
    public final String b(@j.N Context context) {
        ArrayList arrayListC = this.f387366a.c();
        this.f387367b.getClass();
        v11 v11VarA = q21.b().a(context);
        return TextUtils.join(",", arrayListC.subList(arrayListC.size() - Math.min((v11VarA == null || v11VarA.c() == 0) ? 5 : v11VarA.c(), arrayListC.size()), arrayListC.size()));
    }
}
