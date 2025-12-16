package com.avito.android.publish.screen.objects.di;

import com.avito.android.publish.C0;
import com.avito.android.publish.screen.objects.di.C33986a;
import com.avito.android.remote.model.category_parameters.slot.images_groups.ImagesGroupsSlot;
import javax.inject.Provider;

/* compiled from: ObjectFillFormModule_ProvideImagesGroupsParameterProviderFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes16.dex */
public final class r implements dagger.internal.h<ImagesGroupsSlot.ParameterProvider> {

    /* renamed from: a, reason: collision with root package name */
    public final C34019j f239931a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<C0> f239932b;

    public r(C34019j c34019j, Provider<C0> provider) {
        this.f239931a = c34019j;
        this.f239932b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C0 c02 = (C0) ((C33986a.c.Q) this.f239932b).get();
        this.f239931a.getClass();
        return new l(c02);
    }
}
