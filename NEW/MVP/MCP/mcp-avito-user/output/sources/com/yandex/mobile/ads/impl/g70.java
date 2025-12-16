package com.yandex.mobile.ads.impl;

/* loaded from: classes8.dex */
public final class g70 extends RuntimeException {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final String f385603a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    private final String f385604b;

    public /* synthetic */ g70(String str) {
        this(str, str);
    }

    @Y61.k
    public final String a() {
        return this.f385604b;
    }

    @Override // java.lang.Throwable
    @Y61.k
    public final String getMessage() {
        return this.f385603a;
    }

    @X41.j
    public g70(@Y61.k String str, @Y61.k String str2) {
        super(str);
        this.f385603a = str;
        this.f385604b = str2;
    }
}
