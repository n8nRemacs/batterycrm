package com.avito.android.messenger.support;

import com.avito.android.util.InterfaceC35741a1;
import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: SupportChatFormPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class m implements dagger.internal.h<k> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f197417a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f197418b;

    /* renamed from: c, reason: collision with root package name */
    public final i f197419c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<InterfaceC35741a1> f197420d;

    public m(dagger.internal.l lVar, Provider provider, i iVar, Provider provider2) {
        this.f197417a = lVar;
        this.f197418b = provider;
        this.f197419c = iVar;
        this.f197420d = provider2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new k(((Integer) this.f197417a.f393949a).intValue(), this.f197418b.get(), (c) this.f197419c.get(), this.f197420d.get());
    }
}
