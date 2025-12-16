package oG0;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.remote.model.ParametrizedEvent;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: UniversalMapViewModelFactory_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.universal_map.map.common.marker.j> f419668a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f419669b;

    /* renamed from: c, reason: collision with root package name */
    public final l f419670c;

    public h(l lVar, Provider provider, Provider provider2) {
        this.f419668a = provider;
        this.f419669b = provider2;
        this.f419670c = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new g(this.f419668a.get(), this.f419669b.get(), (ParametrizedEvent) this.f419670c.f393949a);
    }
}
