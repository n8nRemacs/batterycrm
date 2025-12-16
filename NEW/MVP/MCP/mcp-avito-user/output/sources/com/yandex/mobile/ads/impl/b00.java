package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.base.AdResponse;

/* loaded from: classes8.dex */
public abstract class b00 extends re<String> {
    public b00(@j.N Context context, @j.N y6 y6Var, @j.N a4 a4Var) {
        super(context, y6Var, a4Var);
    }

    @Override // com.yandex.mobile.ads.impl.re
    @j.N
    public final oe<String> a(String str, String str2) {
        return new u2(this.f389494b, this.f389498f, str, str2, this);
    }

    @Override // com.yandex.mobile.ads.impl.re, com.yandex.mobile.ads.impl.kz0.b
    public /* bridge */ /* synthetic */ void a(@j.N Object obj) {
        a((AdResponse) obj);
    }
}
