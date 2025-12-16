package com.avito.android.search.filter.adapter.bottom_sheet_group;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import ur.InterfaceC49101b;

/* compiled from: BottomSheetGroupItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f261999a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC49101b> f262000b;

    public b(u uVar, Provider provider) {
        this.f261999a = uVar;
        this.f262000b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((c) this.f261999a.get(), this.f262000b.get());
    }
}
