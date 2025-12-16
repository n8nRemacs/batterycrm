package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.pd0;
import okio.InterfaceC44804n;

/* loaded from: classes8.dex */
public final class ix0 extends mz0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    private final String f386695a;

    /* renamed from: b, reason: collision with root package name */
    private final long f386696b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    private final InterfaceC44804n f386697c;

    public ix0(@Y61.l String str, long j12, @Y61.k InterfaceC44804n interfaceC44804n) {
        this.f386695a = str;
        this.f386696b = j12;
        this.f386697c = interfaceC44804n;
    }

    @Override // com.yandex.mobile.ads.impl.mz0
    public final long b() {
        return this.f386696b;
    }

    @Override // com.yandex.mobile.ads.impl.mz0
    @Y61.l
    public final pd0 c() {
        String str = this.f386695a;
        if (str == null) {
            return null;
        }
        int i12 = pd0.f388787d;
        return pd0.a.b(str);
    }

    @Override // com.yandex.mobile.ads.impl.mz0
    @Y61.k
    public final InterfaceC44804n d() {
        return this.f386697c;
    }
}
