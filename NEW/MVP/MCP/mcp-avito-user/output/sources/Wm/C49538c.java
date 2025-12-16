package wM;

import android.content.Context;
import com.avito.android.di.module.C30102l3;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ImageEnhanceAppModule_ProvideImageEnhanceFileConverterFactory.java */
@dagger.internal.e
@y
@x
/* renamed from: wM.c, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C49538c implements dagger.internal.h<com.avito.android.image.enhancement.files.b> {

    /* renamed from: a, reason: collision with root package name */
    public final C30102l3 f441409a;

    /* renamed from: b, reason: collision with root package name */
    public final u f441410b;

    public C49538c(C30102l3 c30102l3, u uVar) {
        this.f441409a = c30102l3;
        this.f441410b = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        Context context = (Context) this.f441409a.get();
        com.avito.android.photo_picker.converter.f fVar = (com.avito.android.photo_picker.converter.f) this.f441410b.get();
        C49536a.f441408a.getClass();
        return new com.avito.android.image.enhancement.files.b(context, fVar);
    }
}
