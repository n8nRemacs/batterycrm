package com.avito.android.publish.screen.step.params.di;

import com.avito.android.publish.C0;
import com.avito.android.publish.screen.step.params.di.a;
import com.avito.android.remote.model.category_parameters.slot.images_groups.ImagesGroupsSlot;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: PublishDetailsModule_ProvideImagesGroupsParameterProviderFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class i implements dagger.internal.h<ImagesGroupsSlot.ParameterProvider> {

    /* renamed from: a, reason: collision with root package name */
    public final d f241118a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<C0> f241119b;

    public i(d dVar, Provider<C0> provider) {
        this.f241118a = dVar;
        this.f241119b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C0 c02 = (C0) ((a.c.i0) this.f241119b).get();
        this.f241118a.getClass();
        return new e(c02);
    }
}
