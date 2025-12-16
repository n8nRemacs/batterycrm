package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.impl.ky0;

/* loaded from: classes8.dex */
public final class yh1 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final ny0 f392014a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final wf1 f392015b;

    public yh1(@j.N Context context, @j.N AdResponse adResponse, @j.N n2 n2Var) {
        this.f392014a = m9.a(context);
        this.f392015b = new wf1(n2Var, adResponse);
    }

    public final void a(@j.P String str) {
        ly0 ly0Var = new ly0(this.f392015b.a());
        ly0Var.b(str, "error_message");
        this.f392014a.a(new ky0(ky0.b.f387317r.a(), ly0Var.a()));
    }
}
