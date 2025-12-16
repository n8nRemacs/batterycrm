package com.avito.android.beduin.common.component.photo_picker.data;

import com.avito.android.remote.R0;
import dagger.internal.t;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: BeduinPhotoPickerApi_Module_ProvideBeduinPhotoPickerApiFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class c implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.f f101961a;

    public c(dagger.internal.f fVar) {
        this.f101961a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        R0 r02 = (R0) this.f101961a.get();
        b.f101960a.getClass();
        a aVar = (a) r02.create(a.class);
        t.d(aVar);
        return aVar;
    }
}
