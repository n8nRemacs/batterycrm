package com.avito.android.comfortable_deal.stages_transition.item.datetime;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: DateTimeBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final g f122875a;

    public b(g gVar) {
        this.f122875a = gVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((f) this.f122875a.get());
    }
}
