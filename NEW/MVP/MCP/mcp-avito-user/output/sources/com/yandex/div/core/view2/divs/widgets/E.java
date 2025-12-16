package com.yandex.div.core.view2.divs.widgets;

import com.yandex.div.core.C37923s;
import com.yandex.div.core.view2.C38029k;
import u21.C48774a;

/* compiled from: ReleaseViewVisitor_Factory.java */
@dagger.internal.e
/* loaded from: classes7.dex */
public final class E implements dagger.internal.h<D> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f368874a;

    /* renamed from: b, reason: collision with root package name */
    public final C37923s f368875b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.u f368876c;

    public E(dagger.internal.l lVar, C37923s c37923s, dagger.internal.u uVar) {
        this.f368874a = lVar;
        this.f368875b = c37923s;
        this.f368876c = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new D((C38029k) this.f368874a.f393949a, this.f368875b.f367651a.f367579j, (C48774a) this.f368876c.get());
    }
}
