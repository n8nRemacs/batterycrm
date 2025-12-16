package com.avito.android.messenger.conversation.mvi.message_menu;

import android.content.Context;
import javax.inject.Provider;

/* compiled from: MessageContextDataFactoryImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes15.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<Context> f191743a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f191744b;

    public g(dagger.internal.u uVar, Provider provider) {
        this.f191743a = provider;
        this.f191744b = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new f(this.f191743a.get(), (com.avito.android.util.text.a) this.f191744b.get());
    }
}
