package FK;

import com.avito.android.ab_tests.InterfaceC27642e;
import com.avito.android.ab_tests.c0;
import com.avito.android.ab_tests.e0;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: IacDialerAbTestsImpl_Factory.java */
@e
@y
@x
/* loaded from: classes14.dex */
public final class c implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.iac_dialer.impl_module.splitter.features.c f4676a;

    /* renamed from: b, reason: collision with root package name */
    public final e0 f4677b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC27642e> f4678c;

    public c(com.avito.android.iac_dialer.impl_module.splitter.features.c cVar, e0 e0Var, Provider provider) {
        this.f4676a = cVar;
        this.f4677b = e0Var;
        this.f4678c = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((com.avito.android.iac_dialer.impl_module.splitter.features.a) this.f4676a.get(), (c0) this.f4677b.get(), this.f4678c.get());
    }
}
