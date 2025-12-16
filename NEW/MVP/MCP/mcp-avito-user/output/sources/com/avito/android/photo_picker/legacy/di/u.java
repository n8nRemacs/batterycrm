package com.avito.android.photo_picker.legacy.di;

import com.avito.konveyor.a;
import com.avito.konveyor.exception.BlueprintCollisionException;

/* compiled from: PhotoPickerModule_ProvideThumbnailsItemBinder$_avito_photo_picker_implFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes14.dex */
public final class u implements dagger.internal.h<com.avito.konveyor.a> {

    /* renamed from: a, reason: collision with root package name */
    public final f f219774a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f219775b;

    public u(f fVar, dagger.internal.u uVar) {
        this.f219774a = fVar;
        this.f219775b = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() throws BlueprintCollisionException {
        TV0.b bVar = (TV0.b) this.f219775b.get();
        this.f219774a.getClass();
        a.C10493a c10493a = new a.C10493a();
        c10493a.b(bVar);
        return c10493a.a();
    }
}
