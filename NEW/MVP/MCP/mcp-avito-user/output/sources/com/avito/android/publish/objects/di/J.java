package com.avito.android.publish.objects.di;

import com.avito.android.publish.C0;
import com.avito.android.publish.objects.di.C33894a;
import com.avito.android.remote.model.category_parameters.slot.images_groups.ImagesGroupsSlot;
import javax.inject.Provider;

/* compiled from: ObjectFillFormModule_ProvideImagesGroupsParameterProviderFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes16.dex */
public final class J implements dagger.internal.h<ImagesGroupsSlot.ParameterProvider> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<C0> f237617a;

    public J(Provider<C0> provider) {
        this.f237617a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C0 c02 = (C0) ((C33894a.c.Q) this.f237617a).get();
        C33939w.f238031a.getClass();
        return new C33941y(c02);
    }
}
