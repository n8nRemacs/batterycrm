package com.avito.android.messenger.channels.mvi.header_feature;

import com.avito.android.messenger.conversation.mvi.send.InterfaceC32208e;
import com.avito.android.util.R0;
import javax.inject.Provider;
import ru.avito.messenger.InterfaceC47842z;

/* compiled from: ChannelsHeaderActor_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.messenger.channels.mvi.header_feature.h, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C31756h implements dagger.internal.h<C31755g> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC47842z> f187548a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC32208e> f187549b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<R0> f187550c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<com.avito.android.messenger.channels.filter.j> f187551d;

    public C31756h(Provider<InterfaceC47842z> provider, Provider<InterfaceC32208e> provider2, Provider<R0> provider3, Provider<com.avito.android.messenger.channels.filter.j> provider4) {
        this.f187548a = provider;
        this.f187549b = provider2;
        this.f187550c = provider3;
        this.f187551d = provider4;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C31755g(this.f187548a.get(), this.f187549b.get(), this.f187550c.get(), this.f187551d.get());
    }
}
