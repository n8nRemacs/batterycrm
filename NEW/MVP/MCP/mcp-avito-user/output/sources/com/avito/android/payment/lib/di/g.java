package com.avito.android.payment.lib.di;

import com.avito.android.payment.di.module.C32975b;
import com.avito.android.payment.lib.A;
import com.avito.android.payment.lib.C33020e;
import com.avito.android.payment.lib.D;
import com.avito.android.payment.lib.PaymentSessionType;
import com.avito.android.payment.lib.di.a;
import com.avito.android.payment.lib.di.d;
import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: PaymentMethodsModule_Declarations_BindViewModuleFactoryFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class g implements dagger.internal.h<A> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f214624a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<D> f214625b;

    /* renamed from: c, reason: collision with root package name */
    public final C32975b f214626c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<C33020e> f214627d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<com.avito.android.payment.processing.y> f214628e;

    /* renamed from: f, reason: collision with root package name */
    public final dagger.internal.l f214629f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<com.avito.android.remote.error.f> f214630g;

    /* renamed from: h, reason: collision with root package name */
    public final Provider<com.avito.android.deep_linking.x> f214631h;

    /* renamed from: i, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f214632i;

    /* renamed from: j, reason: collision with root package name */
    public final dagger.internal.l f214633j;

    public g(Provider provider, Provider provider2, C32975b c32975b, Provider provider3, Provider provider4, dagger.internal.l lVar, Provider provider5, Provider provider6, Provider provider7, dagger.internal.l lVar2) {
        this.f214624a = provider;
        this.f214625b = provider2;
        this.f214626c = c32975b;
        this.f214627d = provider3;
        this.f214628e = provider4;
        this.f214629f = lVar;
        this.f214630g = provider5;
        this.f214631h = provider6;
        this.f214632i = provider7;
        this.f214633j = lVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC35745a5 interfaceC35745a5 = (InterfaceC35745a5) ((a.c.e) this.f214624a).get();
        D d12 = this.f214625b.get();
        com.avito.android.payment.e eVar = (com.avito.android.payment.e) this.f214626c.get();
        C33020e c33020e = this.f214627d.get();
        com.avito.android.payment.processing.y yVar = this.f214628e.get();
        PaymentSessionType paymentSessionType = (PaymentSessionType) this.f214629f.f393949a;
        com.avito.android.remote.error.f fVar = (com.avito.android.remote.error.f) ((a.c.f) this.f214630g).get();
        com.avito.android.deep_linking.x xVar = (com.avito.android.deep_linking.x) ((a.c.b) this.f214631h).get();
        com.avito.android.deeplink_handler.handler.composite.a aVar = (com.avito.android.deeplink_handler.handler.composite.a) ((a.c.C6437c) this.f214632i).get();
        boolean zBooleanValue = ((Boolean) this.f214633j.f393949a).booleanValue();
        int i12 = d.a.f214620a;
        return new A(interfaceC35745a5, d12, eVar, c33020e, yVar, paymentSessionType, fVar, xVar, aVar, zBooleanValue);
    }
}
