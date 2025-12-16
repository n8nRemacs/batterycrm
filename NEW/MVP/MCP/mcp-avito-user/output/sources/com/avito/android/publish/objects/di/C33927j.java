package com.avito.android.publish.objects.di;

import com.avito.android.photo_list_view.s;
import com.avito.android.photo_picker.b0;

/* compiled from: ImageListUploadModule_ProvideImageListUploadingInteractor$_avito_publish_implFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.publish.objects.di.j, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C33927j implements dagger.internal.h<s.b> {

    /* renamed from: a, reason: collision with root package name */
    public final C33921d f238008a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f238009b;

    public C33927j(C33921d c33921d, dagger.internal.u uVar) {
        this.f238008a = c33921d;
        this.f238009b = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        b0 b0Var = (b0) this.f238009b.get();
        this.f238008a.getClass();
        return new C33920c(b0Var);
    }
}
