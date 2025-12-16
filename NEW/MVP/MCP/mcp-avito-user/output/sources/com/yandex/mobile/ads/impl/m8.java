package com.yandex.mobile.ads.impl;

/* loaded from: classes8.dex */
public final class m8 implements g8 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final String f387874a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final Runnable f387875b;

    public m8(@j.N String str, @j.N Runnable runnable) {
        this.f387874a = str;
        this.f387875b = runnable;
    }

    @Override // com.yandex.mobile.ads.impl.g8
    public final boolean a(@j.P String str, @j.P String str2) {
        return "mobileads".equals(str) && this.f387874a.equals(str2);
    }

    @Override // com.yandex.mobile.ads.impl.g8
    public final void a() {
        this.f387875b.run();
    }
}
