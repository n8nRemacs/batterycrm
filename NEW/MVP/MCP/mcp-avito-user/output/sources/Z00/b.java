package Z00;

import dagger.internal.A;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import java.util.Set;

/* compiled from: MortgageRootDiffCallback_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final A f19757a;

    public b(A a12) {
        this.f19757a = a12;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((Set) this.f19757a.get());
    }
}
