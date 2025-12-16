package com.avito.android.photo_picker.edit;

import com.avito.android.analytics.b0;
import com.avito.android.photo_picker.PhotoPickerIntentFactory;
import com.avito.android.photo_storage.SharedPhotosStorage;
import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import w80.C49468b;

/* compiled from: EditPhotoViewModelFactory_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class r implements dagger.internal.h<q> {

    /* renamed from: a, reason: collision with root package name */
    public final C49468b f219435a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f219436b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<b0> f219437c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<t> f219438d;

    /* renamed from: e, reason: collision with root package name */
    public final dagger.internal.l f219439e;

    public r(C49468b c49468b, Provider provider, Provider provider2, Provider provider3, dagger.internal.l lVar) {
        this.f219435a = c49468b;
        this.f219436b = provider;
        this.f219437c = provider2;
        this.f219438d = provider3;
        this.f219439e = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new q((SharedPhotosStorage) this.f219435a.get(), this.f219436b.get(), this.f219437c.get(), this.f219438d.get(), (PhotoPickerIntentFactory.PhotoPickerMode) this.f219439e.f393949a);
    }
}
