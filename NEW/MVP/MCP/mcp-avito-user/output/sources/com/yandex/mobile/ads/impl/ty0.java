package com.yandex.mobile.ads.impl;

import okio.InterfaceC44803m;

/* loaded from: classes8.dex */
public final class ty0 extends uy0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ pd0 f390336a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ int f390337b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ byte[] f390338c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ int f390339d;

    public ty0(pd0 pd0Var, byte[] bArr, int i12, int i13) {
        this.f390336a = pd0Var;
        this.f390337b = i12;
        this.f390338c = bArr;
        this.f390339d = i13;
    }

    @Override // com.yandex.mobile.ads.impl.uy0
    public final long a() {
        return this.f390337b;
    }

    @Override // com.yandex.mobile.ads.impl.uy0
    @Y61.l
    public final pd0 b() {
        return this.f390336a;
    }

    @Override // com.yandex.mobile.ads.impl.uy0
    public final void a(@Y61.k InterfaceC44803m interfaceC44803m) {
        interfaceC44803m.k6(this.f390339d, this.f390337b, this.f390338c);
    }
}
