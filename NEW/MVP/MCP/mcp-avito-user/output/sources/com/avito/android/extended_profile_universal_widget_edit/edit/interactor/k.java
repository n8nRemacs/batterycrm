package com.avito.android.extended_profile_universal_widget_edit.edit.interactor;

import android.content.Context;
import com.avito.android.photo_storage.SharedPhotosStorage;
import com.avito.android.util.R0;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import w80.C49468b;

/* compiled from: UniversalWidgetImageCropper_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class k implements dagger.internal.h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<Context> f153922a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<R0> f153923b;

    /* renamed from: c, reason: collision with root package name */
    public final C49468b f153924c;

    public k(Provider provider, Provider provider2, C49468b c49468b) {
        this.f153922a = provider;
        this.f153923b = provider2;
        this.f153924c = c49468b;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new j(this.f153922a.get(), this.f153923b.get(), (SharedPhotosStorage) this.f153924c.get());
    }
}
