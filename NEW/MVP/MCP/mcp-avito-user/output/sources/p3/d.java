package P3;

import com.avito.android.ab_tests.InterfaceC27642e;
import com.avito.android.ab_tests.c0;
import com.avito.android.ab_tests.e0;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ImageLoaderAbTestsProviderImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class d implements h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.adaptive.image.ab_test.di.d f12798a;

    /* renamed from: b, reason: collision with root package name */
    public final e0 f12799b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC27642e> f12800c;

    public d(com.avito.android.adaptive.image.ab_test.di.d dVar, e0 e0Var, Provider provider) {
        this.f12798a = dVar;
        this.f12799b = e0Var;
        this.f12800c = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c((e) this.f12798a.get(), (c0) this.f12799b.get(), this.f12800c.get());
    }
}
