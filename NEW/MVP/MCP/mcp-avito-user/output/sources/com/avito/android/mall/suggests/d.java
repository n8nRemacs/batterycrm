package com.avito.android.mall.suggests;

import com.avito.android.remote.V0;
import com.avito.android.remote.model.SuggestParamsConverter;
import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.e;
import dagger.internal.g;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: MallSuggestsInteractorImpl_Factory.java */
@e
@y
@x
/* loaded from: classes14.dex */
public final class d implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<V0> f184352a;

    /* renamed from: b, reason: collision with root package name */
    public final u f184353b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f184354c;

    public d(u uVar, Provider provider, Provider provider2) {
        this.f184352a = provider;
        this.f184353b = uVar;
        this.f184354c = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b(g.b(this.f184352a), (SuggestParamsConverter) this.f184353b.get(), this.f184354c.get());
    }
}
