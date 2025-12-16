package com.avito.android.messenger.search;

import com.avito.android.C30277e1;
import com.avito.android.messenger.channels.mvi.interactor.I;
import com.avito.android.util.InterfaceC35741a1;
import com.avito.android.util.InterfaceC35745a5;
import fZ.InterfaceC40378b;
import javax.inject.Provider;

/* compiled from: ChannelsSearchPresenterImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes15.dex */
public final class w implements dagger.internal.h<t> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC32569e> f197210a;

    /* renamed from: b, reason: collision with root package name */
    public final fZ.d f197211b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC35741a1> f197212c;

    /* renamed from: d, reason: collision with root package name */
    public final I f197213d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<C30277e1> f197214e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f197215f;

    public w(Provider provider, fZ.d dVar, Provider provider2, I i12, Provider provider3, Provider provider4) {
        this.f197210a = provider;
        this.f197211b = dVar;
        this.f197212c = provider2;
        this.f197213d = i12;
        this.f197214e = provider3;
        this.f197215f = provider4;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new t(this.f197210a.get(), (InterfaceC40378b) this.f197211b.get(), this.f197212c.get(), (com.avito.android.messenger.channels.mvi.interactor.A) this.f197213d.get(), this.f197214e.get(), this.f197215f.get());
    }
}
