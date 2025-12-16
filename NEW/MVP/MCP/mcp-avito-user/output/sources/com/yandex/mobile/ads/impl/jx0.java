package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.ky0;
import java.util.HashMap;

/* loaded from: classes8.dex */
public final class jx0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final ny0 f386992a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    private final wb f386993b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f386994c = true;

    public jx0(@Y61.k Context context, @Y61.k t3 t3Var, @Y61.k y6 y6Var, @Y61.l String str) {
        this.f386992a = m9.a(context);
        this.f386993b = new wb(t3Var, y6Var, str);
    }

    public final void a(@Y61.k ky0.a aVar) {
        this.f386993b.a(aVar);
    }

    public final void a() {
        if (this.f386994c) {
            this.f386994c = false;
            return;
        }
        ly0 ly0Var = new ly0(new HashMap());
        ly0Var.a(this.f386993b.a());
        this.f386992a.a(new ky0(ky0.b.f387287H, ly0Var.a()));
    }
}
