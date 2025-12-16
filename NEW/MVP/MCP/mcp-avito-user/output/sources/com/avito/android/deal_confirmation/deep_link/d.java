package com.avito.android.deal_confirmation.deep_link;

import android.content.Context;
import com.avito.android.di.module.C30102l3;
import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: DealConfirmationLinkHandler_Factory.java */
@e
@y
@x
/* loaded from: classes12.dex */
public final class d implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f132748a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f132749b;

    /* renamed from: c, reason: collision with root package name */
    public final C30102l3 f132750c;

    public d(C30102l3 c30102l3, u uVar, Provider provider) {
        this.f132748a = uVar;
        this.f132749b = provider;
        this.f132750c = c30102l3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((com.avito.android.deal_confirmation.a) this.f132748a.get(), this.f132749b.get(), (Context) this.f132750c.get());
    }
}
