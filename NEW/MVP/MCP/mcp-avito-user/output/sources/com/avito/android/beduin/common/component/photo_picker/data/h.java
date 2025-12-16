package com.avito.android.beduin.common.component.photo_picker.data;

import com.avito.android.beduin.common.component.photo_picker.B;
import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: BeduinPhotoPickerInteractor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class h implements dagger.internal.h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<B> f101971a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<a> f101972b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f101973c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<com.avito.android.remote.error.f> f101974d;

    /* renamed from: e, reason: collision with root package name */
    public final com.avito.android.photo_info.d f101975e;

    public h(Provider provider, Provider provider2, Provider provider3, Provider provider4, com.avito.android.photo_info.d dVar) {
        this.f101971a = provider;
        this.f101972b = provider2;
        this.f101973c = provider3;
        this.f101974d = provider4;
        this.f101975e = dVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d(this.f101971a.get(), dagger.internal.g.b(this.f101972b), this.f101973c.get(), this.f101974d.get(), (com.avito.android.photo_info.b) this.f101975e.get());
    }
}
