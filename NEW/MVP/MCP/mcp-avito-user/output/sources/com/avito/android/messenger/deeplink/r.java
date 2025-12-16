package com.avito.android.messenger.deeplink;

import com.avito.android.C30277e1;
import com.avito.android.C30713g1;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.util.InterfaceC35741a1;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.S3;
import javax.inject.Provider;
import ru.avito.messenger.InterfaceC47842z;

/* compiled from: ChannelCallDeepLinkHandler_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes15.dex */
public final class r implements dagger.internal.h<C32402q> {

    /* renamed from: a, reason: collision with root package name */
    public final dv.b f195554a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f195555b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f195556c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.f f195557d;

    /* renamed from: e, reason: collision with root package name */
    public final dagger.internal.f f195558e;

    /* renamed from: f, reason: collision with root package name */
    public final S3 f195559f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<InterfaceC35741a1> f195560g;

    /* renamed from: h, reason: collision with root package name */
    public final C30713g1 f195561h;

    public r(dv.b bVar, dv.b bVar2, Provider provider, dagger.internal.f fVar, dagger.internal.f fVar2, S3 s32, Provider provider2, C30713g1 c30713g1) {
        this.f195554a = bVar;
        this.f195555b = bVar2;
        this.f195556c = provider;
        this.f195557d = fVar;
        this.f195558e = fVar2;
        this.f195559f = s32;
        this.f195560g = provider2;
        this.f195561h = c30713g1;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        a.d dVar = (a.d) this.f195554a.get();
        a.i iVar = (a.i) this.f195555b.get();
        InterfaceC35745a5 interfaceC35745a5 = this.f195556c.get();
        com.avito.android.deeplink_handler.handler.composite.a aVar = (com.avito.android.deeplink_handler.handler.composite.a) this.f195557d.get();
        InterfaceC47842z interfaceC47842z = (InterfaceC47842z) this.f195558e.get();
        this.f195559f.getClass();
        return new C32402q(dVar, iVar, interfaceC35745a5, aVar, interfaceC47842z, S3.a(), this.f195560g.get(), (C30277e1) this.f195561h.get());
    }
}
