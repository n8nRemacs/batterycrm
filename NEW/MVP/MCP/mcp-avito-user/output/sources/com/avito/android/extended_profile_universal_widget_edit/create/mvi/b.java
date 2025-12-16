package com.avito.android.extended_profile_universal_widget_edit.create.mvi;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: UniversalWidgetCreateActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.extended_profile_universal_widget_edit.create.interactor.c f153753a;

    public b(com.avito.android.extended_profile_universal_widget_edit.create.interactor.c cVar) {
        this.f153753a = cVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((com.avito.android.extended_profile_universal_widget_edit.create.interactor.a) this.f153753a.get());
    }
}
