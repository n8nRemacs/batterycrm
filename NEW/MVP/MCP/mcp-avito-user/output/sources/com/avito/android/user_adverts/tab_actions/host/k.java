package com.avito.android.user_adverts.tab_actions.host;

import androidx.view.InterfaceC23487e;
import com.avito.android.user_adverts.tab_actions.host.j;
import com.avito.android.user_adverts.tab_actions.host.mvi.E;
import com.avito.android.user_adverts.tab_actions.host.mvi.F;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: UserAdvertsActionsViewModel_Factory_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class k implements dagger.internal.h<j.a> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f314371a;

    /* renamed from: b, reason: collision with root package name */
    public final F f314372b;

    public k(dagger.internal.l lVar, F f12) {
        this.f314371a = lVar;
        this.f314372b = f12;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new j.a((InterfaceC23487e) this.f314371a.f393949a, (E) this.f314372b.get());
    }
}
