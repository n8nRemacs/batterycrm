package com.avito.android.user_advert.advert.items.job_list_item;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: JobListItemPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final u f309554a;

    public g(u uVar) {
        this.f309554a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new f((com.avito.android.deeplink_handler.handler.composite.a) this.f309554a.get());
    }
}
