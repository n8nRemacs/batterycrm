package com.avito.android.rating.details.deep_linking.revert_ratings_deletion;

import com.avito.android.rating.details.interactor.s;
import com.avito.android.rating.details.interactor.v;
import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: RevertRatingsDeletionLinkAsyncHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class d implements h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final v f246979a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f246980b;

    public d(v vVar, Provider provider) {
        this.f246979a = vVar;
        this.f246980b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c((s) this.f246979a.get(), this.f246980b.get());
    }
}
