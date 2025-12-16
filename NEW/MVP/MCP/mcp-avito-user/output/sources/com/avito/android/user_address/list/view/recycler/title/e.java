package com.avito.android.user_address.list.view.recycler.title;

import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: TitleListItemPresenter_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class e implements h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final u f307486a;

    public e(u uVar) {
        this.f307486a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d((com.avito.android.user_address.list.e) this.f307486a.get());
    }
}
