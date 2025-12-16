package com.avito.android.select.bottom_sheet.blueprints.chips;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: CheckableChipsItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final f f265071a;

    public c(f fVar) {
        this.f265071a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((d) this.f265071a.get());
    }
}
