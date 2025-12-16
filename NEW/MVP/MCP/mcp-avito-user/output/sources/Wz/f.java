package Wz;

import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: FilesWiperImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class f implements h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.photo_cache.b> f18095a;

    public f(Provider<com.avito.android.photo_cache.b> provider) {
        this.f18095a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new e(this.f18095a.get());
    }
}
