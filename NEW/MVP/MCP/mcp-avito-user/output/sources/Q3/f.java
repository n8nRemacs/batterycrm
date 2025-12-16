package q3;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AbExperimentsInteractor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC47190b> f429005a;

    public f(Provider<InterfaceC47190b> provider) {
        this.f429005a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new e(this.f429005a.get());
    }
}
