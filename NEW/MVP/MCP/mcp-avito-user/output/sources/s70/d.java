package s70;

import AK0.l;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: PhoneConfirmationTimeStorageImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class d implements h<C48009c> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<l> f437491a;

    public d(Provider<l> provider) {
        this.f437491a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C48009c(this.f437491a.get());
    }
}
