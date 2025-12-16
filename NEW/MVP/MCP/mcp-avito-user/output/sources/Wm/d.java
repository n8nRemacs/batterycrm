package wM;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import okhttp3.OkHttpClient;

/* compiled from: ImageEnhanceAppModule_ProvideImageEnhanceFileLoaderFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class d implements dagger.internal.h<com.avito.android.image.enhancement.files.d> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<OkHttpClient> f441411a;

    public d(Provider<OkHttpClient> provider) {
        this.f441411a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        OkHttpClient okHttpClient = this.f441411a.get();
        C49536a.f441408a.getClass();
        return new com.avito.android.image.enhancement.files.d(okHttpClient);
    }
}
