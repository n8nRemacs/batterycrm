package com.avito.android.messenger.di;

import com.google.gson.Gson;
import h91.C40788d;
import javax.inject.Provider;

/* compiled from: MessengerModule_ProvideGetChannelByIdApicoResponseConverter$_avito_messenger_implFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.messenger.di.e1, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C32433e1 implements dagger.internal.h<C40788d> {

    /* renamed from: a, reason: collision with root package name */
    public final U0 f195766a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<Gson> f195767b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.f f195768c;

    public C32433e1(U0 u02, Provider provider, dagger.internal.f fVar) {
        this.f195766a = u02;
        this.f195767b = provider;
        this.f195768c = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        Gson gson = this.f195767b.get();
        com.avito.android.deep_linking.x xVar = (com.avito.android.deep_linking.x) this.f195768c.get();
        this.f195766a.getClass();
        return new C40788d(xVar, gson);
    }
}
