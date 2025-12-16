package TC;

import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: CategoryOnboardingManagerImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class c implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final u f15499a;

    public c(u uVar) {
        this.f15499a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((d) this.f15499a.get());
    }
}
