package com.avito.android.photo_picker.legacy.di;

import com.avito.konveyor.a;
import com.avito.konveyor.exception.BlueprintCollisionException;

/* compiled from: PhotoPickerModule_ProvideDetailsItemBinder$_avito_photo_picker_implFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes14.dex */
public final class i implements dagger.internal.h<com.avito.konveyor.a> {

    /* renamed from: a, reason: collision with root package name */
    public final f f219732a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f219733b;

    public i(f fVar, dagger.internal.u uVar) {
        this.f219732a = fVar;
        this.f219733b = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() throws BlueprintCollisionException {
        com.avito.android.photo_picker.legacy.details_list.a aVar = (com.avito.android.photo_picker.legacy.details_list.a) this.f219733b.get();
        this.f219732a.getClass();
        a.C10493a c10493a = new a.C10493a();
        c10493a.b(aVar.a());
        return c10493a.a();
    }
}
