package com.avito.android.extended_profile_universal_widget_edit.edit_block.mvi;

import com.avito.android.extended_profile_universal_widget_edit.edit_block.UniversalWidgetEditBlockArguments;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: UniversalWidgetEditBlockActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class e implements dagger.internal.h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f154094a;

    /* renamed from: b, reason: collision with root package name */
    public final u f154095b;

    public e(dagger.internal.l lVar, u uVar) {
        this.f154094a = lVar;
        this.f154095b = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new d((UniversalWidgetEditBlockArguments) this.f154094a.f393949a, (com.avito.android.profile_management_core.images.a) this.f154095b.get());
    }
}
