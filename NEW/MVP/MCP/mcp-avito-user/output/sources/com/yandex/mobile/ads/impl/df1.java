package com.yandex.mobile.ads.impl;

import android.view.View;

/* loaded from: classes8.dex */
public final class df1 {

    /* renamed from: d, reason: collision with root package name */
    static final /* synthetic */ kotlin.reflect.n<Object>[] f384593d = {kotlin.jvm.internal.m0.f406844a.e(new kotlin.jvm.internal.Y(df1.class, "view", "getView()Landroid/view/View;", 0))};

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final a f384594a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    private final String f384595b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    private final kx0 f384596c;

    public enum a {
        f384597a,
        f384598b,
        f384599c,
        f384600d;

        a() {
        }
    }

    public df1(@Y61.k View view, @Y61.k a aVar, @Y61.l String str) {
        this.f384594a = aVar;
        this.f384595b = str;
        this.f384596c = lx0.a(view);
    }

    @Y61.l
    public final String a() {
        return this.f384595b;
    }

    @Y61.k
    public final a b() {
        return this.f384594a;
    }

    @Y61.l
    public final View c() {
        return (View) this.f384596c.getValue(this, f384593d[0]);
    }
}
