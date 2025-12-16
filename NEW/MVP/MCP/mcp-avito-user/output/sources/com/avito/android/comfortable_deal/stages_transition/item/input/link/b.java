package com.avito.android.comfortable_deal.stages_transition.item.input.link;

import com.avito.android.comfortable_deal.stages_transition.item.input.d;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: InputLinkBlueprint_Factory.java */
@e
@y
@x
/* loaded from: classes12.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final d f122901a;

    public b(d dVar) {
        this.f122901a = dVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((com.avito.android.comfortable_deal.stages_transition.item.input.c) this.f122901a.get());
    }
}
