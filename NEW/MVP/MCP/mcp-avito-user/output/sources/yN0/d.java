package Yn0;

import com.avito.android.remote.E;
import dagger.internal.e;
import dagger.internal.g;
import dagger.internal.h;
import dagger.internal.w;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: DeliveryUniversalCheckoutRepositoryImpl_Factory.java */
@e
@y
@x
/* loaded from: classes3.dex */
public final class d implements h<C18305b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<E> f19660a;

    public d(Provider<E> provider) {
        this.f19660a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C18305b(g.a(w.a(this.f19660a)));
    }
}
