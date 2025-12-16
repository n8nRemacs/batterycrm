package com.avito.android.extended_profile_universal_widget_edit.edit.mvi;

import com.avito.android.extended_profile_universal_widget_edit.UniversalWidgetEditArguments;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: UniversalWidgetEditReducer_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class o implements dagger.internal.h<n> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f153957a;

    /* renamed from: b, reason: collision with root package name */
    public final u f153958b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.extended_profile_universal_widget_edit.f> f153959c;

    public o(dagger.internal.l lVar, u uVar, Provider provider) {
        this.f153957a = lVar;
        this.f153958b = uVar;
        this.f153959c = provider;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new n((UniversalWidgetEditArguments) this.f153957a.f393949a, (com.avito.android.extended_profile_ui_components.universal_widget.a) this.f153958b.get(), this.f153959c.get());
    }
}
