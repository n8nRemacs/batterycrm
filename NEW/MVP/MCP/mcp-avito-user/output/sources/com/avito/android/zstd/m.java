package com.avito.android.zstd;

import com.avito.android.I1;
import com.avito.android.K1;
import com.avito.android.ab_tests.configs.ZstdTestGroup;
import dagger.internal.x;
import dagger.internal.y;
import t3.d0;

/* compiled from: ZstdStrategy_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class m implements dagger.internal.h<l> {

    /* renamed from: a, reason: collision with root package name */
    public final d0 f331394a;

    /* renamed from: b, reason: collision with root package name */
    public final K1 f331395b;

    public m(d0 d0Var, K1 k12) {
        this.f331394a = d0Var;
        this.f331395b = k12;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new l((ZstdTestGroup) this.f331394a.get(), (I1) this.f331395b.get());
    }
}
