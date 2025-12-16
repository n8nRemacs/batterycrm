package com.avito.android.messenger.di;

import android.content.res.Resources;
import com.avito.android.messenger.di.C32453l0;
import com.avito.android.util.InterfaceC35945t1;
import java.util.Locale;
import javax.inject.Provider;
import ru.avito.messenger.api.entity.UserLastActivity;

/* compiled from: ChannelFragmentModule_ProvideUserOnlineStatusFormatterFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.messenger.di.b0, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C32423b0 implements dagger.internal.h<InterfaceC35945t1<UserLastActivity>> {

    /* renamed from: a, reason: collision with root package name */
    public final C32431e f195738a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f195739b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.server_time.f> f195740c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<Locale> f195741d;

    public C32423b0(C32431e c32431e, dagger.internal.l lVar, Provider provider, Provider provider2) {
        this.f195738a = c32431e;
        this.f195739b = lVar;
        this.f195740c = provider;
        this.f195741d = provider2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Resources resources = (Resources) this.f195739b.f393949a;
        com.avito.android.server_time.f fVar = (com.avito.android.server_time.f) ((C32453l0.b.i0) this.f195740c).get();
        Locale locale = (Locale) ((C32453l0.b.E) this.f195741d).get();
        this.f195738a.getClass();
        return new LY.e(resources, fVar, locale);
    }
}
