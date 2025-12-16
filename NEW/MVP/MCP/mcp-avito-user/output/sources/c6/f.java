package c6;

import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: MortgageCalculationFilter_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class f implements h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC26946a> f57647a;

    public f(Provider<InterfaceC26946a> provider) {
        this.f57647a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new e(this.f57647a.get());
    }
}
