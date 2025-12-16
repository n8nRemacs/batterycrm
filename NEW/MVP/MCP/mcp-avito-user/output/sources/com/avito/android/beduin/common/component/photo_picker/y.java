package com.avito.android.beduin.common.component.photo_picker;

import com.avito.android.photo_picker.PhotoPickerIntentFactory;
import javax.inject.Provider;

/* compiled from: PhotoPickerActivityContract_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes11.dex */
public final class y implements dagger.internal.h<w> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<PhotoPickerIntentFactory> f102094a;

    public y(Provider<PhotoPickerIntentFactory> provider) {
        this.f102094a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new w(this.f102094a.get());
    }
}
