package com.avito.android.search.subscriptions.adapter;

import com.avito.android.util.InterfaceC35945t1;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SearchSubscriptionItemPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class j implements dagger.internal.h<i> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.f f263881a;

    /* renamed from: b, reason: collision with root package name */
    public final u f263882b;

    public j(dagger.internal.f fVar, u uVar) {
        this.f263881a = fVar;
        this.f263882b = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new i(dagger.internal.g.b(this.f263881a), (InterfaceC35945t1) this.f263882b.get());
    }
}
