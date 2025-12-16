package com.avito.android.verification.list_items.icon_text;

import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: IconTextItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class c implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final f f324805a;

    public c(f fVar) {
        this.f324805a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((e) this.f324805a.get());
    }
}
