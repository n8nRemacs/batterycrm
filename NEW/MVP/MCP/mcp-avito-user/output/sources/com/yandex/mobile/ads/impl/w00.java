package com.yandex.mobile.ads.impl;

/* loaded from: classes8.dex */
public final class w00 extends k81 {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ u00 f391241e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ int f391242f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ int f391243g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w00(String str, u00 u00Var, int i12, int i13) {
        super(str, true);
        this.f391241e = u00Var;
        this.f391242f = i12;
        this.f391243g = i13;
    }

    @Override // com.yandex.mobile.ads.impl.k81
    public final long e() {
        this.f391241e.a(this.f391242f, this.f391243g, true);
        return -1L;
    }
}
