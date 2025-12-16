package com.avito.android.messenger.di;

import com.google.gson.Gson;
import h91.C40790f;
import javax.inject.Provider;

/* compiled from: MessengerModule_ProvideGetChannelsApicoResponseConverter$_avito_messenger_implFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.messenger.di.f1, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C32436f1 implements dagger.internal.h<C40790f> {

    /* renamed from: a, reason: collision with root package name */
    public final U0 f195775a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<Gson> f195776b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.f f195777c;

    public C32436f1(U0 u02, Provider provider, dagger.internal.f fVar) {
        this.f195775a = u02;
        this.f195776b = provider;
        this.f195777c = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        Gson gson = this.f195776b.get();
        com.avito.android.deep_linking.x xVar = (com.avito.android.deep_linking.x) this.f195777c.get();
        this.f195775a.getClass();
        return new C40790f(xVar, gson);
    }
}
