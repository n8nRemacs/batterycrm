package com.avito.android.messenger.deeplink;

import com.avito.android.deeplink_handler.view.a;
import com.avito.android.util.InterfaceC35741a1;
import com.avito.android.util.InterfaceC35745a5;
import javax.inject.Provider;
import ru.avito.messenger.InterfaceC47842z;

/* compiled from: UnpinChannelDeeplinkHandler_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes15.dex */
public final class X0 implements dagger.internal.h<W0> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.f f195442a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f195443b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC35741a1> f195444c;

    /* renamed from: d, reason: collision with root package name */
    public final dv.b f195445d;

    public X0(dagger.internal.f fVar, dv.b bVar, Provider provider, Provider provider2) {
        this.f195442a = fVar;
        this.f195443b = provider;
        this.f195444c = provider2;
        this.f195445d = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new W0((InterfaceC47842z) this.f195442a.get(), this.f195443b.get(), this.f195444c.get(), (a.i) this.f195445d.get());
    }
}
