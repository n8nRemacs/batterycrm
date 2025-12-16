package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.impl.ns0;

/* loaded from: classes8.dex */
public abstract class ne<T> implements ns0.a {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    protected final Context f388227a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final ns0 f388228b = ns0.a();

    /* renamed from: c, reason: collision with root package name */
    @j.N
    protected final AdResponse<T> f388229c;

    public ne(@j.N Context context, @j.N AdResponse<T> adResponse) {
        this.f388227a = context;
        this.f388229c = adResponse;
    }

    @j.N
    public final AdResponse<T> a() {
        return this.f388229c;
    }

    @j.N
    public final Context b() {
        return this.f388227a;
    }

    public final boolean c() {
        return !this.f388228b.b(this.f388227a);
    }

    public final void d() {
        getClass().toString();
        this.f388228b.a(this.f388227a, this);
    }

    public final void e() {
        getClass().toString();
        this.f388228b.b(this.f388227a, this);
    }
}
