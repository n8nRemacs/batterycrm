package com.avito.android.loyalty.ui.criteria.items.tab;

import com.avito.android.loyalty.di.criteria.l;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: TabItemPresenter_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class e implements h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final l f183517a;

    public e(l lVar) {
        this.f183517a = lVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d(this.f183517a);
    }
}
