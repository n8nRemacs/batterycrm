package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.ky0;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes8.dex */
public final class fu {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final wb f385506a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final ny0 f385507b;

    public fu(@j.N Context context, @j.N t3 t3Var, @j.N y6 y6Var, @j.P String str) {
        this.f385506a = new wb(t3Var, y6Var, str);
        this.f385507b = m9.a(context);
    }

    public final void a(@j.N ky0.a aVar) {
        this.f385506a.a(aVar);
    }

    public final void a(@j.N ArrayList arrayList) {
        ly0 ly0Var = new ly0(new HashMap());
        ly0Var.b(arrayList, "assets");
        ly0 ly0Var2 = new ly0(this.f385506a.a());
        ly0Var2.b("no_view_for_asset", "reason");
        ly0Var.a(ly0Var2.a());
        ky0.b bVar = ky0.b.f387289J;
        this.f385507b.a(new ky0(bVar.a(), ly0Var.a()));
    }
}
