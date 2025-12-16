package com.avito.android.advert.item.auto_media;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: AdvertDetailsAutoMediaPresenter_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final l f72924a;

    /* renamed from: b, reason: collision with root package name */
    public final u f72925b;

    public g(l lVar, u uVar) {
        this.f72924a = lVar;
        this.f72925b = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new f((j) this.f72924a.get(), (u3.g) this.f72925b.get());
    }
}
