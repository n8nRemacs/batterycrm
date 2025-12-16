package com.avito.android.str_booking.ui.gallery;

import androidx.fragment.app.FragmentManager;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: StrBookingGalleryBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final f f286031a;

    /* renamed from: b, reason: collision with root package name */
    public final l f286032b;

    public b(f fVar, l lVar) {
        this.f286031a = fVar;
        this.f286032b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new a((e) this.f286031a.get(), (FragmentManager) this.f286032b.f393949a);
    }
}
