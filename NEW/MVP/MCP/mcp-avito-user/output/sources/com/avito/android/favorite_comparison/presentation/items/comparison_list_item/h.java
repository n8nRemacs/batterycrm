package com.avito.android.favorite_comparison.presentation.items.comparison_list_item;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ComparisonListItemPresenter_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final u f155336a;

    public h(u uVar) {
        this.f155336a = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new g((io.reactivex.rxjava3.subjects.e) this.f155336a.get());
    }
}
