package com.yandex.mobile.ads.impl;

import java.util.List;

/* loaded from: classes8.dex */
public final class bs extends d41 {

    /* renamed from: m, reason: collision with root package name */
    private final cs f384072m;

    public bs(List<byte[]> list) {
        pr0 pr0Var = new pr0(list.get(0));
        this.f384072m = new cs(pr0Var.z(), pr0Var.z());
    }

    @Override // com.yandex.mobile.ads.impl.d41
    public final t71 a(byte[] bArr, int i12, boolean z12) {
        if (z12) {
            this.f384072m.d();
        }
        return new ds(this.f384072m.a(i12, bArr));
    }
}
