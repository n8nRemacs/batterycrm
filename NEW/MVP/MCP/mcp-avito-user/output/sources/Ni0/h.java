package nI0;

import cJ0.InterfaceC27050d;
import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: UserAdvertsListToastHelperImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final u f414993a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f414994b;

    public h(u uVar, Provider provider) {
        this.f414993a = uVar;
        this.f414994b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new g((InterfaceC27050d) this.f414993a.get(), this.f414994b.get());
    }
}
