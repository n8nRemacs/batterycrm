package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.ky0;

/* loaded from: classes8.dex */
public final class bo {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final oy0 f384004a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final br0 f384005b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final com.yandex.mobile.ads.nativeads.k f384006c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    private final qu0 f384007d = new qu0();

    public bo(@j.N oy0 oy0Var, @j.N rm0 rm0Var, @j.N com.yandex.mobile.ads.nativeads.k kVar) {
        this.f384004a = oy0Var;
        this.f384005b = rm0Var;
        this.f384006c = kVar;
    }

    public final void a(@j.N Context context, @j.N yn ynVar) {
        if (!this.f384007d.a(context, ynVar.c())) {
            this.f384005b.a(ynVar.b());
        } else {
            ((dj) this.f384004a).a(ky0.b.f387283D);
            this.f384006c.d();
        }
    }
}
