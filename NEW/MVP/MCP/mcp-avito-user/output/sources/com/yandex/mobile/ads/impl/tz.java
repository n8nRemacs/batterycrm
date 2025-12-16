package com.yandex.mobile.ads.impl;

import java.util.concurrent.Callable;

/* loaded from: classes8.dex */
public final class tz implements Callable<rz> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final String f390340a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    private final uz f390341b;

    public tz(@Y61.k String str, @Y61.k uz uzVar) {
        this.f390340a = str;
        this.f390341b = uzVar;
    }

    @Override // java.util.concurrent.Callable
    public final rz call() {
        return new rz(this.f390341b.a().a(this.f390340a));
    }

    public /* synthetic */ tz(String str) {
        this(str, new uz());
    }
}
