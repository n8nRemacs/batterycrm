package com.avito.android.user_adverts.tab_screens.advert_list.disclaimer;

import android.content.res.Resources;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: DisclaimerItemDecorator_Factory.java */
@e
@y
@x
/* loaded from: classes5.dex */
public final class d implements h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final l f314733a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f314734b;

    public d(l lVar, Provider provider) {
        this.f314733a = lVar;
        this.f314734b = provider;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new c((Resources) this.f314733a.f393949a, this.f314734b.get());
    }
}
