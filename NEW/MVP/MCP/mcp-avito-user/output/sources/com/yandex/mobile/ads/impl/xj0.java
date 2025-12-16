package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.impl.ky0;

/* loaded from: classes8.dex */
public final class xj0 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final Context f391734a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final n2 f391735b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final AdResponse f391736c;

    /* renamed from: d, reason: collision with root package name */
    @j.P
    private ky0.a f391737d;

    public xj0(@j.N Context context, @j.N AdResponse adResponse, @j.N n2 n2Var) {
        this.f391734a = context.getApplicationContext();
        this.f391735b = n2Var;
        this.f391736c = adResponse;
    }

    public final void a(@j.N ky0.a aVar) {
        this.f391737d = aVar;
    }

    @j.N
    public final dj a(@j.N String str, @j.N String str2) {
        return new dj(this.f391734a, this.f391736c, this.f391735b, new yj0(str, str2, this.f391737d));
    }
}
