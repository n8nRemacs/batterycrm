package com.avito.android.rating_form.item.photo_picker;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: RatingFormPhotoPickerPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f248538a;

    public h(dagger.internal.u uVar) {
        this.f248538a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new g((com.avito.android.photo_list_view.s) this.f248538a.get());
    }
}
