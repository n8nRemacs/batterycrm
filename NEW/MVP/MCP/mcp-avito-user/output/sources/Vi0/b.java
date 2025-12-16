package VI0;

import AK0.l;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: UserAdvertsActionsStorage_Factory.java */
@e
@y
@x
/* loaded from: classes5.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<l> f17066a;

    public b(Provider<l> provider) {
        this.f17066a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a(this.f17066a.get());
    }
}
