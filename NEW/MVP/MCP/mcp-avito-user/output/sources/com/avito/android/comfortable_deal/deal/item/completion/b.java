package com.avito.android.comfortable_deal.deal.item.completion;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: CompletionBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final f f121345a;

    public b(f fVar) {
        this.f121345a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((e) this.f121345a.get());
    }
}
