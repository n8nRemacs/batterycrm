package com.avito.android.extended_profile_universal_widget_edit.edit.mvi;

import com.avito.android.extended_profile_universal_widget_edit.UniversalWidgetEditArguments;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: UniversalWidgetEditActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class c implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f153938a;

    /* renamed from: b, reason: collision with root package name */
    public final u f153939b;

    public c(dagger.internal.l lVar, u uVar) {
        this.f153938a = lVar;
        this.f153939b = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new a((UniversalWidgetEditArguments) this.f153938a.f393949a, (com.avito.android.extended_profile_universal_widget_edit.edit.interactor.a) this.f153939b.get());
    }
}
