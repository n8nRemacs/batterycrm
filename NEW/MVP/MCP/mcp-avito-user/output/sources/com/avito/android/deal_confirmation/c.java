package com.avito.android.deal_confirmation;

import com.avito.android.remote.InterfaceC34398y;
import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: DealConfirmationInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC34398y> f132738a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f132739b;

    public c(Provider<InterfaceC34398y> provider, Provider<InterfaceC35745a5> provider2) {
        this.f132738a = provider;
        this.f132739b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b(this.f132739b.get(), dagger.internal.g.b(this.f132738a));
    }
}
