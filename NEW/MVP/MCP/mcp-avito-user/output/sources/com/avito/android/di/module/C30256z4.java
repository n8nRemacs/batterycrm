package com.avito.android.di.module;

import android.app.Activity;
import com.avito.android.util.InterfaceC35745a5;
import javax.inject.Provider;

/* compiled from: DefaultSearchLocationModule_ProvideDefaultLocationNotificationInteractor$_avito_serp_implFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.di.module.z4, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C30256z4 implements dagger.internal.h<com.avito.android.home.default_search_location.c> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f144738a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f144739b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.u f144740c;

    public C30256z4(dagger.internal.l lVar, dagger.internal.u uVar, Provider provider) {
        this.f144738a = provider;
        this.f144739b = lVar;
        this.f144740c = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC35745a5 interfaceC35745a5 = this.f144738a.get();
        Activity activity = (Activity) this.f144739b.f393949a;
        com.avito.android.location.find.l lVar = (com.avito.android.location.find.l) this.f144740c.get();
        int i12 = C30245y4.f144719a;
        return new com.avito.android.home.default_search_location.d(interfaceC35745a5, activity, lVar);
    }
}
