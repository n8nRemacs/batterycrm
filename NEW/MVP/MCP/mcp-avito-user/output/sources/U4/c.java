package u4;

import com.avito.android.ab_tests.InterfaceC27642e;
import com.avito.android.ab_tests.c0;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AdvertDetailsAutoMediaAbTestsProviderImpl_Factory.java */
@e
@y
@x
/* loaded from: classes10.dex */
public final class c implements h<C48791b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<c0> f439767a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC27642e> f439768b;

    public c(Provider<c0> provider, Provider<InterfaceC27642e> provider2) {
        this.f439767a = provider;
        this.f439768b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C48791b(this.f439768b.get(), this.f439767a.get());
    }
}
