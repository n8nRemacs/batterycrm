package com.avito.android.extended_profile_universal_widget_edit.edit_block.mvi;

import com.avito.android.extended_profile_universal_widget_edit.edit_block.UniversalWidgetEditBlockArguments;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: UniversalWidgetEditBlockReducer_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class n implements dagger.internal.h<m> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.extended_profile_universal_widget_edit.edit_block.d f154109a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f154110b;

    public n(com.avito.android.extended_profile_universal_widget_edit.edit_block.d dVar, dagger.internal.l lVar) {
        this.f154109a = dVar;
        this.f154110b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new m((com.avito.android.extended_profile_universal_widget_edit.edit_block.c) this.f154109a.get(), (UniversalWidgetEditBlockArguments) this.f154110b.f393949a);
    }
}
