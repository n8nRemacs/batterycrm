package com.avito.android.profile_settings_extended.adapter.universal.section;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: UniversalWidgetSectionItemPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class i implements dagger.internal.h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final u f229943a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f229944b;

    public i(dagger.internal.l lVar, u uVar) {
        this.f229943a = uVar;
        this.f229944b = lVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d((com.avito.android.extended_profile_ui_components.universal_widget.a) this.f229943a.get(), (Y41.l) this.f229944b.f393949a);
    }
}
