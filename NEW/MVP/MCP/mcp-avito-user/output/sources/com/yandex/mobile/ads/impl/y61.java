package com.yandex.mobile.ads.impl;

/* loaded from: classes8.dex */
final class y61 extends xw {

    /* renamed from: b, reason: collision with root package name */
    private final long f391946b;

    public y61(to toVar, long j12) {
        super(toVar);
        db.a(toVar.getPosition() >= j12);
        this.f391946b = j12;
    }

    @Override // com.yandex.mobile.ads.impl.xw, com.yandex.mobile.ads.impl.su
    public final long a() {
        return super.a() - this.f391946b;
    }

    @Override // com.yandex.mobile.ads.impl.xw, com.yandex.mobile.ads.impl.su
    public final long e() {
        return super.e() - this.f391946b;
    }

    @Override // com.yandex.mobile.ads.impl.xw, com.yandex.mobile.ads.impl.su
    public final long getPosition() {
        return super.getPosition() - this.f391946b;
    }
}
