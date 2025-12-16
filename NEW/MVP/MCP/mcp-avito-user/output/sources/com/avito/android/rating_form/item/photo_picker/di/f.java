package com.avito.android.rating_form.item.photo_picker.di;

import com.avito.android.photo_list_view.s;
import com.avito.android.photo_picker.b0;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: RatingFormPhotoPickerModule_Companion_ProvideImageListPresenterUploadingInteractorFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class f implements dagger.internal.h<s.b> {

    /* renamed from: a, reason: collision with root package name */
    public final u f248527a;

    public f(u uVar) {
        this.f248527a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        b0 b0Var = (b0) this.f248527a.get();
        b.f248514a.getClass();
        return new a(b0Var);
    }
}
