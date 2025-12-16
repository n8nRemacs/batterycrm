package com.avito.android.inline_filters.category_nodes;

import com.avito.android.inline_filters.C31045e;
import com.avito.android.inline_filters.InterfaceC30996c;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: CategoryTreeLinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class e implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final C31045e f171075a;

    public e(C31045e c31045e) {
        this.f171075a = c31045e;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c((InterfaceC30996c) this.f171075a.get());
    }
}
