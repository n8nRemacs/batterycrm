package com.avito.android.loyalty.ui.items.attributed_text;

import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: AttributedTextItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class c implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final f f183659a;

    public c(f fVar) {
        this.f183659a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((e) this.f183659a.get());
    }
}
