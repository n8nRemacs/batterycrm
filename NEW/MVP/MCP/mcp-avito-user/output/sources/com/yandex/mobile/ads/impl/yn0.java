package com.yandex.mobile.ads.impl;

/* loaded from: classes8.dex */
public final class yn0 implements sf1 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final String f392026a;

    /* renamed from: b, reason: collision with root package name */
    private final int f392027b;

    /* renamed from: c, reason: collision with root package name */
    private final int f392028c;

    public yn0(int i12, int i13, @j.N String str) {
        this.f392026a = str;
        this.f392027b = i12;
        this.f392028c = i13;
    }

    public final int getAdHeight() {
        return this.f392028c;
    }

    public final int getAdWidth() {
        return this.f392027b;
    }

    @Override // com.yandex.mobile.ads.impl.sf1
    public final String getUrl() {
        return this.f392026a;
    }
}
