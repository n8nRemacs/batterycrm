package com.yandex.mobile.ads.impl;

/* loaded from: classes8.dex */
public final class ru0 implements dc1 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final oy0 f389671a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    private final j81 f389672b;

    /* renamed from: c, reason: collision with root package name */
    private String f389673c;

    public ru0(@Y61.k oy0 oy0Var, @Y61.k j81 j81Var) {
        this.f389671a = oy0Var;
        this.f389672b = j81Var;
    }

    @Override // com.yandex.mobile.ads.impl.dc1
    public final void a(@Y61.k String str) {
        this.f389673c = str;
        if (str.length() == 0) {
            return;
        }
        j81 j81Var = this.f389672b;
        oy0 oy0Var = this.f389671a;
        String str2 = this.f389673c;
        if (str2 == null) {
            str2 = null;
        }
        j81Var.a(oy0Var, str2);
    }
}
