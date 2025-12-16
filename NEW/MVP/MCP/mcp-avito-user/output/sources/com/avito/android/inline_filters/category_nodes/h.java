package com.avito.android.inline_filters.category_nodes;

import com.avito.android.B2;
import com.avito.android.D2;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: CategoryTreeLinkParser_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final D2 f171077a;

    public h(D2 d22) {
        this.f171077a = d22;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new g((B2) this.f171077a.get());
    }
}
