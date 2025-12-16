package s80;

import com.avito.android.util.C;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: PhotoContentUriProviderImpl_Factory.java */
@e
@y
@x
/* loaded from: classes14.dex */
public final class c implements h<com.avito.android.photo_picker.legacy.provider.b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<C> f437495a;

    public c(Provider<C> provider) {
        this.f437495a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new com.avito.android.photo_picker.legacy.provider.b(this.f437495a.get());
    }
}
