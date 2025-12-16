package p80;

import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: PhotoPickerFilesWiperImpl_Factory.java */
@e
@y
@x
/* renamed from: p80.c, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C46918c implements h<C46917b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.photo_cache.b> f428205a;

    public C46918c(Provider<com.avito.android.photo_cache.b> provider) {
        this.f428205a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C46917b(this.f428205a.get());
    }
}
