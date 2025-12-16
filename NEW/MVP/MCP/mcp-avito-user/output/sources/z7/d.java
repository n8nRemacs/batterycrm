package z7;

import com.avito.android.Z0;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AdvertDetailsTopBarPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class d implements h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final u f443840a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<Z0> f443841b;

    public d(u uVar, Provider provider) {
        this.f443840a = uVar;
        this.f443841b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c((com.avito.android.advert.item.anchor_trust_factors.topbar.a) this.f443840a.get(), this.f443841b.get());
    }
}
