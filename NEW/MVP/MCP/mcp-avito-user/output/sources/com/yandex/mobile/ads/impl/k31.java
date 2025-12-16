package com.yandex.mobile.ads.impl;

/* loaded from: classes8.dex */
public final class k31 implements j31 {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    private final w90 f387042b;

    public k31(@Y61.k w90 w90Var) {
        this.f387042b = w90Var;
    }

    @Override // com.yandex.mobile.ads.impl.j31
    @Y61.l
    public final String a() {
        return this.f387042b.b("SessionData");
    }

    @Override // com.yandex.mobile.ads.impl.j31
    public final void a(@Y61.l String str) {
        this.f387042b.putString("SessionData", str);
    }
}
