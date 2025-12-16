package com.avito.android.rating.details.answer.photo.picker.di;

import com.avito.android.photo_list_view.s;
import com.avito.android.photo_picker.b0;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: RatingAddAnswerPhotoPickerModule_ProvideImageListPresenterUploadingInteractorFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class f implements dagger.internal.h<s.b> {

    /* renamed from: a, reason: collision with root package name */
    public final u f246791a;

    public f(u uVar) {
        this.f246791a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        b0 b0Var = (b0) this.f246791a.get();
        a.f246778a.getClass();
        return new b(b0Var);
    }
}
