package com.avito.android.beduin.common.component.photo_picker;

import Ui.InterfaceC15523b;
import com.avito.android.util.InterfaceC35745a5;
import javax.inject.Provider;

/* compiled from: BeduinPhotoPickerViewModel_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes11.dex */
public final class r implements dagger.internal.h<p> {

    /* renamed from: a, reason: collision with root package name */
    public final v f102070a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.beduin.common.form.store.b> f102071b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.f f102072c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f102073d;

    /* renamed from: e, reason: collision with root package name */
    public final com.avito.android.beduin.common.component.photo_picker.data.h f102074e;

    public r(v vVar, Provider provider, dagger.internal.f fVar, Provider provider2, com.avito.android.beduin.common.component.photo_picker.data.h hVar) {
        this.f102070a = vVar;
        this.f102071b = provider;
        this.f102072c = fVar;
        this.f102073d = provider2;
        this.f102074e = hVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new p((s) this.f102070a.get(), this.f102071b.get(), (InterfaceC15523b) this.f102072c.get(), this.f102073d.get(), (com.avito.android.beduin.common.component.photo_picker.data.d) this.f102074e.get());
    }
}
