package com.avito.android.messenger.conversation.mvi.data;

import android.content.Context;
import com.avito.android.C30277e1;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.persistence.messenger.MessengerDatabase;
import com.avito.android.util.InterfaceC35745a5;
import javax.inject.Provider;

/* compiled from: DatabaseErrorHandlerImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.messenger.conversation.mvi.data.f, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C32017f implements dagger.internal.h<C32016e> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f190470a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<MessengerDatabase> f190471b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f190472c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.u f190473d;

    /* renamed from: e, reason: collision with root package name */
    public final dagger.internal.u f190474e;

    public C32017f(dagger.internal.u uVar, dagger.internal.u uVar2, dagger.internal.u uVar3, Provider provider, Provider provider2) {
        this.f190470a = uVar;
        this.f190471b = provider;
        this.f190472c = provider2;
        this.f190473d = uVar2;
        this.f190474e = uVar3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new C32016e((Context) this.f190470a.get(), this.f190471b.get(), this.f190472c.get(), (C30277e1) this.f190473d.get(), (InterfaceC28373a) this.f190474e.get());
    }
}
