package wM;

import android.content.Context;
import com.avito.android.di.module.C30102l3;
import com.avito.android.photo_picker.converter.ImageConvertOptions;
import com.avito.android.photo_storage.j;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ImageEnhanceAppModule_ProvideUploadConverterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class h implements dagger.internal.h<com.avito.android.photo_picker.converter.f> {

    /* renamed from: a, reason: collision with root package name */
    public final C30102l3 f441420a;

    /* renamed from: b, reason: collision with root package name */
    public final N70.d f441421b;

    public h(C30102l3 c30102l3, N70.d dVar) {
        this.f441420a = c30102l3;
        this.f441421b = dVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        Context context = (Context) this.f441420a.get();
        N70.b bVar = (N70.b) this.f441421b.get();
        C49536a.f441408a.getClass();
        return new com.avito.android.photo_picker.converter.d(new com.avito.android.photo_picker.converter.c(context, new j(context)), new ImageConvertOptions(1440, 1920, 80, 4194304), bVar);
    }
}
