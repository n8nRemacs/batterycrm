package com.yandex.mobile.ads.impl;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes8.dex */
final class mb1 implements t71 {

    /* renamed from: a, reason: collision with root package name */
    private final ib1 f387903a;

    /* renamed from: b, reason: collision with root package name */
    private final long[] f387904b;

    /* renamed from: c, reason: collision with root package name */
    private final Map<String, lb1> f387905c;

    /* renamed from: d, reason: collision with root package name */
    private final Map<String, jb1> f387906d;

    /* renamed from: e, reason: collision with root package name */
    private final Map<String, String> f387907e;

    public mb1(ib1 ib1Var, HashMap map, HashMap map2, HashMap map3) {
        this.f387903a = ib1Var;
        this.f387906d = map2;
        this.f387907e = map3;
        this.f387905c = Collections.unmodifiableMap(map);
        this.f387904b = ib1Var.b();
    }

    @Override // com.yandex.mobile.ads.impl.t71
    public final int a(long j12) {
        int iA2 = pc1.a(this.f387904b, j12, false);
        if (iA2 < this.f387904b.length) {
            return iA2;
        }
        return -1;
    }

    @Override // com.yandex.mobile.ads.impl.t71
    public final List<vm> b(long j12) {
        return this.f387903a.a(j12, this.f387905c, this.f387906d, this.f387907e);
    }

    @Override // com.yandex.mobile.ads.impl.t71
    public final int a() {
        return this.f387904b.length;
    }

    @Override // com.yandex.mobile.ads.impl.t71
    public final long a(int i12) {
        return this.f387904b[i12];
    }
}
