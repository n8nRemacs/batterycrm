package ru.avito.messenger.internal.di;

import ru.avito.messenger.C47727a;
import ru.avito.messenger.C47838v;
import ru.avito.messenger.MessengerApi;
import ru.avito.messenger.MessengerApiService;

/* compiled from: MessengerClientModule_ProvideMessengerFallbackApi$_avito_discouraged_messengerFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: ru.avito.messenger.internal.di.w, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47820w implements dagger.internal.h<MessengerApi> {

    /* renamed from: a, reason: collision with root package name */
    public final C47817t f431684a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f431685b;

    public C47820w(C47817t c47817t, dagger.internal.u uVar) {
        this.f431684a = c47817t;
        this.f431685b = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        MessengerApiService messengerApiService = (MessengerApiService) this.f431685b.get();
        C47727a c47727a = this.f431684a.f431667a;
        return new C47838v(messengerApiService);
    }
}
