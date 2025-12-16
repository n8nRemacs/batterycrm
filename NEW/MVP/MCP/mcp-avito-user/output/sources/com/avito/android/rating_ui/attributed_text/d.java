package com.avito.android.rating_ui.attributed_text;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: RatingAttributedTextItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class d implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final u f249942a;

    public d(u uVar) {
        this.f249942a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c((e) this.f249942a.get());
    }
}
