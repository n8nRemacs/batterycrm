package com.avito.android.advert.item.autoteka.teaser;

import com.avito.android.advert_core.contactbar.InterfaceC28265d;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AdvertAutotekaPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28265d> f73013a;

    public c(Provider<InterfaceC28265d> provider) {
        this.f73013a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b(this.f73013a.get());
    }
}
