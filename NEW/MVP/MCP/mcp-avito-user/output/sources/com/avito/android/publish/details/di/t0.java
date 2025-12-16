package com.avito.android.publish.details.di;

import com.avito.android.publish.details.di.C33697f;
import com.avito.android.remote.model.category_parameters.slot.images_groups.ImagesGroupsSlot;
import javax.inject.Provider;

/* compiled from: PublishDetailsModule_ProvideImagesGroupsParameterProviderFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes16.dex */
public final class t0 implements dagger.internal.h<ImagesGroupsSlot.ParameterProvider> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.publish.C0> f234594a;

    public t0(Provider<com.avito.android.publish.C0> provider) {
        this.f234594a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.publish.C0 c02 = (com.avito.android.publish.C0) ((C33697f.c.i0) this.f234594a).get();
        n0.f234577a.getClass();
        return new o0(c02);
    }
}
