package I6;

import AK0.l;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AdvertSafeDealStorageImpl_Factory.java */
@e
@y
@x
/* loaded from: classes10.dex */
public final class c implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<l> f7953a;

    public c(Provider<l> provider) {
        this.f7953a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b(this.f7953a.get());
    }
}
