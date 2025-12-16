package com.avito.android.comfortable_deal.deal.item.actions;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ActionsBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final g f121146a;

    public c(g gVar) {
        this.f121146a = gVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((f) this.f121146a.get());
    }
}
