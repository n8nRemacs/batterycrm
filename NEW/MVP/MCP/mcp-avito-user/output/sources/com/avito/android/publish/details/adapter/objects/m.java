package com.avito.android.publish.details.adapter.objects;

import com.avito.android.Q1;
import com.avito.android.util.InterfaceC35807h4;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: MultiStateObjectsModule_ProvideObjectsItemPresenterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class m implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final u f233347a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC35807h4> f233348b;

    /* renamed from: c, reason: collision with root package name */
    public final u f233349c;

    public m(u uVar, u uVar2, Provider provider) {
        this.f233347a = uVar;
        this.f233348b = provider;
        this.f233349c = uVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.util.text.a aVar = (com.avito.android.util.text.a) this.f233347a.get();
        InterfaceC35807h4 interfaceC35807h4 = this.f233348b.get();
        Q1 q12 = (Q1) this.f233349c.get();
        k.f233343a.getClass();
        return new g(aVar, interfaceC35807h4, q12);
    }
}
