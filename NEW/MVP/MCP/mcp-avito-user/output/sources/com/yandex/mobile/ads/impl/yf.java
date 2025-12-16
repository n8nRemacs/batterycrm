package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.ky0;
import java.util.HashMap;

/* loaded from: classes8.dex */
public final class yf {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final wb f392008a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final ny0 f392009b;

    public yf(@j.N Context context, @j.N t3 t3Var, @j.N y6 y6Var, @j.P String str) {
        this.f392008a = new wb(t3Var, y6Var, str);
        this.f392009b = m9.a(context);
    }

    public final void a(@j.N ky0.a aVar) {
        this.f392008a.a(aVar);
    }

    public final void a(@j.P String str) {
        ly0 ly0Var = new ly0(new HashMap());
        ly0Var.b(str, "asset_name");
        ly0 ly0Var2 = new ly0(this.f392008a.a());
        ly0Var2.b("no_view_for_asset", "reason");
        ly0Var.a(ly0Var2.a());
        ky0.b bVar = ky0.b.f387288I;
        this.f392009b.a(new ky0(bVar.a(), ly0Var.a()));
    }
}
