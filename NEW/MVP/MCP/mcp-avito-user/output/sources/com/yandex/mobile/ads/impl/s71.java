package com.yandex.mobile.ads.impl;

import java.util.Collections;
import java.util.List;

/* loaded from: classes8.dex */
final class s71 implements t71 {

    /* renamed from: a, reason: collision with root package name */
    private final vm[] f389807a;

    /* renamed from: b, reason: collision with root package name */
    private final long[] f389808b;

    public s71(vm[] vmVarArr, long[] jArr) {
        this.f389807a = vmVarArr;
        this.f389808b = jArr;
    }

    @Override // com.yandex.mobile.ads.impl.t71
    public final int a(long j12) {
        int iA2 = pc1.a(this.f389808b, j12, false);
        if (iA2 < this.f389808b.length) {
            return iA2;
        }
        return -1;
    }

    @Override // com.yandex.mobile.ads.impl.t71
    public final List<vm> b(long j12) {
        vm vmVar;
        int iB2 = pc1.b(this.f389808b, j12, false);
        return (iB2 == -1 || (vmVar = this.f389807a[iB2]) == vm.f390910r) ? Collections.emptyList() : Collections.singletonList(vmVar);
    }

    @Override // com.yandex.mobile.ads.impl.t71
    public final int a() {
        return this.f389808b.length;
    }

    @Override // com.yandex.mobile.ads.impl.t71
    public final long a(int i12) {
        db.a(i12 >= 0);
        db.a(i12 < this.f389808b.length);
        return this.f389808b[i12];
    }
}
