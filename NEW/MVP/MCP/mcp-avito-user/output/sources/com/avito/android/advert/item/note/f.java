package com.avito.android.advert.item.note;

import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AdvertDetailsNotePresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f77821a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.advert_core.analytics.a> f77822b;

    /* renamed from: c, reason: collision with root package name */
    public final l f77823c;

    public f(l lVar, Provider provider, Provider provider2) {
        this.f77821a = provider;
        this.f77822b = provider2;
        this.f77823c = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new e(this.f77821a.get(), this.f77822b.get(), (String) this.f77823c.f393949a);
    }
}
