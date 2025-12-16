package Ds;

import com.avito.android.V;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: CreditBrokerViewModelFactoryImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class d implements h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<V> f3499a;

    /* renamed from: b, reason: collision with root package name */
    public final u f3500b;

    /* renamed from: c, reason: collision with root package name */
    public final l f3501c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f3502d;

    public d(l lVar, u uVar, Provider provider, Provider provider2) {
        this.f3499a = provider;
        this.f3500b = uVar;
        this.f3501c = lVar;
        this.f3502d = provider2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new c(this.f3499a.get(), (com.avito.android.credits.x) this.f3500b.get(), (String) this.f3501c.f393949a, this.f3502d.get());
    }
}
