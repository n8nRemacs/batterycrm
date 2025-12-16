package wM;

import android.content.Context;
import com.avito.android.di.module.C30102l3;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ImageEnhanceAppModule_ProvideImageEnhanceFileStorageFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class e implements dagger.internal.h<com.avito.android.image.enhancement.files.f> {

    /* renamed from: a, reason: collision with root package name */
    public final C30102l3 f441412a;

    public e(C30102l3 c30102l3) {
        this.f441412a = c30102l3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        Context context = (Context) this.f441412a.get();
        C49536a.f441408a.getClass();
        return new com.avito.android.image.enhancement.files.f(context);
    }
}
