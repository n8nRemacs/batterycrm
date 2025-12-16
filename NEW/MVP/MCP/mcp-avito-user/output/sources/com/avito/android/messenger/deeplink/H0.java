package com.avito.android.messenger.deeplink;

import com.avito.android.deeplink_handler.view.a;
import com.avito.android.util.InterfaceC35741a1;
import com.avito.android.util.InterfaceC35745a5;
import javax.inject.Provider;
import ru.avito.messenger.InterfaceC47842z;

/* compiled from: PinChannelDeeplinkHandler_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes15.dex */
public final class H0 implements dagger.internal.h<G0> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.f f195339a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f195340b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC35741a1> f195341c;

    /* renamed from: d, reason: collision with root package name */
    public final dv.b f195342d;

    /* renamed from: e, reason: collision with root package name */
    public final dv.b f195343e;

    public H0(dagger.internal.f fVar, dv.b bVar, dv.b bVar2, Provider provider, Provider provider2) {
        this.f195339a = fVar;
        this.f195340b = provider;
        this.f195341c = provider2;
        this.f195342d = bVar;
        this.f195343e = bVar2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new G0((InterfaceC47842z) this.f195339a.get(), this.f195340b.get(), this.f195341c.get(), (a.i) this.f195342d.get(), (a.d) this.f195343e.get());
    }
}
