package com.avito.android.messenger.di;

import com.google.gson.Gson;
import javax.inject.Provider;

/* compiled from: MessengerModule_ProvideSendTextMessageApicoResponseConverter$_avito_messenger_implFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes15.dex */
public final class B1 implements dagger.internal.h<h91.n> {

    /* renamed from: a, reason: collision with root package name */
    public final U0 f195604a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<Gson> f195605b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.f f195606c;

    public B1(U0 u02, Provider provider, dagger.internal.f fVar) {
        this.f195604a = u02;
        this.f195605b = provider;
        this.f195606c = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        Gson gson = this.f195605b.get();
        com.avito.android.deep_linking.x xVar = (com.avito.android.deep_linking.x) this.f195606c.get();
        this.f195604a.getClass();
        return new h91.n(xVar, gson);
    }
}
