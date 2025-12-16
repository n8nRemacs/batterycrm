package Zd0;

import com.avito.android.account.G;
import com.avito.android.remote.H;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: PublishSessionIdGeneratorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class e implements h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.server_time.h> f20323a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<G> f20324b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<H> f20325c;

    public e(Provider<com.avito.android.server_time.h> provider, Provider<G> provider2, Provider<H> provider3) {
        this.f20323a = provider;
        this.f20324b = provider2;
        this.f20325c = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d(this.f20323a.get(), this.f20324b.get(), this.f20325c.get());
    }
}
