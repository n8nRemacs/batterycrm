package com.avito.android.user_advert.deeplink;

import com.avito.android.user_advert.advert.E1;
import com.avito.android.user_advert.advert.H1;
import com.avito.android.util.InterfaceC35745a5;
import javax.inject.Provider;

/* compiled from: MyDraftDeletionLinkHandler_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes4.dex */
public final class G implements dagger.internal.h<F> {

    /* renamed from: a, reason: collision with root package name */
    public final H1 f310691a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f310692b;

    public G(H1 h12, Provider provider) {
        this.f310691a = h12;
        this.f310692b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new F((E1) this.f310691a.get(), this.f310692b.get());
    }
}
