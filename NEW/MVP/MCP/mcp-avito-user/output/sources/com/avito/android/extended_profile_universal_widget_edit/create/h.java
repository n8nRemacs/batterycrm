package com.avito.android.extended_profile_universal_widget_edit.create;

import dagger.internal.x;
import dagger.internal.y;
import kotlinx.coroutines.flow.i2;

/* compiled from: UniversalWidgetCreateViewModel_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.extended_profile_universal_widget_edit.create.mvi.g f153726a;

    public h(com.avito.android.extended_profile_universal_widget_edit.create.mvi.g gVar) {
        this.f153726a = gVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.extended_profile_universal_widget_edit.create.mvi.f fVar = (com.avito.android.extended_profile_universal_widget_edit.create.mvi.f) this.f153726a.get();
        i2.f411430a.getClass();
        return new g(fVar, i2.a.f411433c);
    }
}
