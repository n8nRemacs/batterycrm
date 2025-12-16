package Nu0;

import Pu0.InterfaceC14839a;
import com.avito.android.service_orders.ServiceOrdersArguments;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ServiceListPreloadable_Factory.java */
@e
@y
@x
/* renamed from: Nu0.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C14614b implements h<C14613a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC14839a> f11800a;

    /* renamed from: b, reason: collision with root package name */
    public final l f11801b;

    public C14614b(l lVar, Provider provider) {
        this.f11800a = provider;
        this.f11801b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new C14613a(this.f11800a.get(), (ServiceOrdersArguments) this.f11801b.f393949a);
    }
}
