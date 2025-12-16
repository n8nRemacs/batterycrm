package com.yandex.mobile.ads.impl;

import android.graphics.Bitmap;
import android.util.LruCache;
import com.yandex.mobile.ads.impl.kp0;

/* loaded from: classes8.dex */
final class zb1 implements kp0.c {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final LruCache<String, Bitmap> f392216a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final p20 f392217b;

    public zb1(@j.N LruCache<String, Bitmap> lruCache, @j.N p20 p20Var) {
        this.f392216a = lruCache;
        this.f392217b = p20Var;
    }

    @Override // com.yandex.mobile.ads.impl.kp0.c
    @j.P
    public final Bitmap a(@j.N String str) {
        this.f392217b.getClass();
        return this.f392216a.get(p20.a(str));
    }

    @Override // com.yandex.mobile.ads.impl.kp0.c
    public final void a(@j.N String str, @j.N Bitmap bitmap) {
        this.f392217b.getClass();
        this.f392216a.put(p20.a(str), bitmap);
    }
}
