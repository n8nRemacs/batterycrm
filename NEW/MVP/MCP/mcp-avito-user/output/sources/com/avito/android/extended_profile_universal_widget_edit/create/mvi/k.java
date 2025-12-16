package com.avito.android.extended_profile_universal_widget_edit.create.mvi;

import com.avito.android.extended_profile_universal_widget_edit.UniversalWidgetCreateArguments;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: UniversalWidgetCreateReducer_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class k implements dagger.internal.h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final l f153774a;

    public k(l lVar) {
        this.f153774a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new j((UniversalWidgetCreateArguments) this.f153774a.f393949a);
    }
}
