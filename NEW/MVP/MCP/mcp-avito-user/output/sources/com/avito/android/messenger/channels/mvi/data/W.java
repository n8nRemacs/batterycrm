package com.avito.android.messenger.channels.mvi.data;

import com.avito.android.messenger.conversation.mvi.data.InterfaceC32012a;
import com.avito.android.messenger.di.Q1;
import com.avito.android.persistence.messenger.G0;
import javax.inject.Provider;

/* compiled from: DraftRepoImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes15.dex */
public final class W implements dagger.internal.h<V> {

    /* renamed from: a, reason: collision with root package name */
    public final Q1 f187200a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC32012a> f187201b;

    public W(Q1 q12, Provider provider) {
        this.f187200a = q12;
        this.f187201b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new V((G0) this.f187200a.get(), this.f187201b.get());
    }
}
