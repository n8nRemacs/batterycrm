package com.avito.android.user_advert.advert.items.auto_publish;

import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: AutoPublishItemPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final u f309255a;

    public h(u uVar) {
        this.f309255a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new g((InterfaceC28373a) this.f309255a.get());
    }
}
