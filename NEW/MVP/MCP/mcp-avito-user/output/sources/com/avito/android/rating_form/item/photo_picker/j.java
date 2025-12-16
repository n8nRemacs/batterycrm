package com.avito.android.rating_form.item.photo_picker;

import com.avito.android.photo_list_view.C33210d;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: RatingFormPhotoPickerRedesignBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class j implements dagger.internal.h<i> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<e> f248544a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f248545b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.l f248546c;

    public j(dagger.internal.l lVar, dagger.internal.u uVar, Provider provider) {
        this.f248544a = provider;
        this.f248545b = uVar;
        this.f248546c = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new i(this.f248544a.get(), (C33210d.a) this.f248545b.get(), ((Boolean) this.f248546c.f393949a).booleanValue());
    }
}
