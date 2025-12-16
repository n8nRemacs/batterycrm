package com.avito.android.analytics.coverage.di;

import com.avito.android.I1;
import com.avito.android.K1;
import com.avito.android.analytics.coverage.d;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.t;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import kotlin.reflect.n;

/* compiled from: PerformanceScreenCoverageModule_ProvideScreenCoverageFactory.java */
@e
@y
@x
/* loaded from: classes11.dex */
public final class c implements h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final K1 f89869a;

    /* renamed from: b, reason: collision with root package name */
    public final u f89870b;

    public c(K1 k12, u uVar) {
        this.f89869a = k12;
        this.f89870b = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        I1 i12 = (I1) this.f89869a.get();
        int i13 = a.f89867a;
        n<Object> nVar = I1.f67278k0[17];
        Object obj = (((Boolean) i12.f67331r.a().invoke()).booleanValue() && i12.w().invoke().booleanValue()) ? (d) this.f89870b.get() : d.f89865a;
        t.d(obj);
        return obj;
    }
}
