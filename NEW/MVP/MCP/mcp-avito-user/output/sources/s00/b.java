package S00;

import dagger.internal.A;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import java.util.Set;

/* compiled from: PreApprovalDiffCallback_Factory.java */
@e
@y
@x
/* loaded from: classes15.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final A f14787a;

    public b(A a12) {
        this.f14787a = a12;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((Set) this.f14787a.get());
    }
}
