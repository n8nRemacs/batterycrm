package com.yandex.mobile.ads.impl;

import java.util.Collections;
import java.util.List;

/* loaded from: classes8.dex */
final class ob1 implements t71 {

    /* renamed from: b, reason: collision with root package name */
    public static final ob1 f388482b = new ob1();

    /* renamed from: a, reason: collision with root package name */
    private final List<vm> f388483a;

    public ob1(vm vmVar) {
        this.f388483a = Collections.singletonList(vmVar);
    }

    @Override // com.yandex.mobile.ads.impl.t71
    public final int a() {
        return 1;
    }

    @Override // com.yandex.mobile.ads.impl.t71
    public final List<vm> b(long j12) {
        return j12 >= 0 ? this.f388483a : Collections.emptyList();
    }

    @Override // com.yandex.mobile.ads.impl.t71
    public final int a(long j12) {
        return j12 < 0 ? 0 : -1;
    }

    private ob1() {
        this.f388483a = Collections.emptyList();
    }

    @Override // com.yandex.mobile.ads.impl.t71
    public final long a(int i12) {
        db.a(i12 == 0);
        return 0L;
    }
}
