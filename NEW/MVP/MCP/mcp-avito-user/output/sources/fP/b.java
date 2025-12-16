package Fp;

import dagger.internal.A;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import java.util.Set;

/* compiled from: DealPayloadProvider_Factory.java */
@e
@y
@x
/* loaded from: classes12.dex */
public final class b implements h<C13824a> {

    /* renamed from: a, reason: collision with root package name */
    public final A f5992a;

    public b(A a12) {
        this.f5992a = a12;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C13824a((Set) this.f5992a.get());
    }
}
