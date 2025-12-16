package com.avito.android.messenger.di;

import com.google.gson.Gson;
import javax.inject.Provider;

/* compiled from: MessengerModule_ProvideGetUserVisibleMessagesApicoResponseConverter$_avito_messenger_implFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.messenger.di.g1, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C32439g1 implements dagger.internal.h<h91.h> {

    /* renamed from: a, reason: collision with root package name */
    public final U0 f195791a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<Gson> f195792b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.f f195793c;

    public C32439g1(U0 u02, Provider provider, dagger.internal.f fVar) {
        this.f195791a = u02;
        this.f195792b = provider;
        this.f195793c = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        Gson gson = this.f195792b.get();
        com.avito.android.deep_linking.x xVar = (com.avito.android.deep_linking.x) this.f195793c.get();
        this.f195791a.getClass();
        return new h91.h(xVar, gson);
    }
}
