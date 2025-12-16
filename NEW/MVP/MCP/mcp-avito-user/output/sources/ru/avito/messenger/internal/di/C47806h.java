package ru.avito.messenger.internal.di;

import com.google.gson.Gson;
import javax.inject.Provider;
import l91.C43605a;

/* compiled from: GsonModule_ProvideGsonDeserializerFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: ru.avito.messenger.internal.di.h, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47806h implements dagger.internal.h<C43605a> {

    /* renamed from: a, reason: collision with root package name */
    public final C47805g f431636a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<Gson> f431637b;

    public C47806h(C47805g c47805g, Provider<Gson> provider) {
        this.f431636a = c47805g;
        this.f431637b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        Gson gson = this.f431637b.get();
        this.f431636a.getClass();
        return new C43605a(gson);
    }
}
