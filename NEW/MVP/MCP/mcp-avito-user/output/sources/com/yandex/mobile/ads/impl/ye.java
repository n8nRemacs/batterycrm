package com.yandex.mobile.ads.impl;

/* loaded from: classes8.dex */
public class ye implements k00 {

    /* renamed from: a, reason: collision with root package name */
    private final nr0 f392002a;

    public ye(@j.N nr0 nr0Var) {
        this.f392002a = nr0Var;
        nr0Var.setId(2);
    }

    @Override // com.yandex.mobile.ads.impl.k00
    public void a(@j.N String str) {
        this.f392002a.a(str);
    }

    @Override // com.yandex.mobile.ads.impl.k00
    public void invalidate() {
        this.f392002a.e();
    }

    public void a(@j.N q00 q00Var) {
        this.f392002a.setHtmlWebViewListener(q00Var);
    }
}
