package com.avito.android.advert_core.discount.item.contact;

import com.avito.android.advert_core.contactbar.InterfaceC28265d;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ContactItemPresenter_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28265d> f83359a;

    public f(Provider<InterfaceC28265d> provider) {
        this.f83359a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new e(this.f83359a.get());
    }
}
