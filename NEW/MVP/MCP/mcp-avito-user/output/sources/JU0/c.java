package Ju0;

import AK0.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ServiceBookingOrdersActionsStorageImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<l> f9173a;

    public c(Provider<l> provider) {
        this.f9173a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b(this.f9173a.get());
    }
}
