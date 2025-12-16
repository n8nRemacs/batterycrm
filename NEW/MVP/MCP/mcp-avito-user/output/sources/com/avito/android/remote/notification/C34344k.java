package com.avito.android.remote.notification;

import android.content.Context;
import com.avito.android.di.module.C30102l3;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.L0;
import javax.inject.Provider;

/* compiled from: NotificationBitmapInteractorImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.remote.notification.k, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C34344k implements dagger.internal.h<C34343j> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f254062a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f254063b;

    /* renamed from: c, reason: collision with root package name */
    public final C30102l3 f254064c;

    public C34344k(C30102l3 c30102l3, dagger.internal.u uVar, Provider provider) {
        this.f254062a = uVar;
        this.f254063b = provider;
        this.f254064c = c30102l3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C34343j((L0) this.f254062a.get(), this.f254063b.get(), (Context) this.f254064c.get());
    }
}
