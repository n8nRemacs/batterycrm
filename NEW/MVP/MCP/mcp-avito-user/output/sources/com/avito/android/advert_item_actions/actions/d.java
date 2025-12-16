package com.avito.android.advert_item_actions.actions;

import com.avito.android.remote.V0;
import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: HiddenAdvertsInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class d implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<V0> f85831a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<La.d> f85832b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f85833c;

    public d(Provider<V0> provider, Provider<La.d> provider2, Provider<InterfaceC35745a5> provider3) {
        this.f85831a = provider;
        this.f85832b = provider2;
        this.f85833c = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c(dagger.internal.g.b(this.f85831a), this.f85832b.get(), this.f85833c.get());
    }
}
