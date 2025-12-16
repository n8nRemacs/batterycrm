package com.avito.android.rating_form.item.photo_picker;

import com.avito.android.photo_list_view.C33210d;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: RatingFormPhotoPickerBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<e> f248505a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f248506b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.l f248507c;

    public c(dagger.internal.l lVar, dagger.internal.u uVar, Provider provider) {
        this.f248505a = provider;
        this.f248506b = uVar;
        this.f248507c = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new b(this.f248505a.get(), (C33210d.a) this.f248506b.get(), ((Boolean) this.f248507c.f393949a).booleanValue());
    }
}
