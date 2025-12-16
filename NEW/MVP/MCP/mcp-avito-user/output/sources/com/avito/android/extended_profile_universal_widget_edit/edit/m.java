package com.avito.android.extended_profile_universal_widget_edit.edit;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: UniversalWidgetEditViewModel_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class m implements dagger.internal.h<l> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.extended_profile_universal_widget_edit.edit.mvi.h f153930a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.extended_profile_universal_widget_edit.edit.interactor.a> f153931b;

    public m(com.avito.android.extended_profile_universal_widget_edit.edit.mvi.h hVar, Provider provider) {
        this.f153930a = hVar;
        this.f153931b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new l((com.avito.android.extended_profile_universal_widget_edit.edit.mvi.g) this.f153930a.get(), this.f153931b.get());
    }
}
