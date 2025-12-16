package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes8.dex */
final class mh0 implements t71 {

    /* renamed from: a, reason: collision with root package name */
    private final List<vm> f388008a;

    public mh0(ArrayList arrayList) {
        this.f388008a = Collections.unmodifiableList(arrayList);
    }

    @Override // com.yandex.mobile.ads.impl.t71
    public final int a() {
        return 1;
    }

    @Override // com.yandex.mobile.ads.impl.t71
    public final List<vm> b(long j12) {
        return j12 >= 0 ? this.f388008a : Collections.emptyList();
    }

    @Override // com.yandex.mobile.ads.impl.t71
    public final int a(long j12) {
        return j12 < 0 ? 0 : -1;
    }

    @Override // com.yandex.mobile.ads.impl.t71
    public final long a(int i12) {
        db.a(i12 == 0);
        return 0L;
    }
}
