package com.avito.android.confirm_documents_bottom_sheet.mvi;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ConfirmDocumentsBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class j implements dagger.internal.h<i> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.confirm_documents_bottom_sheet.domain.a> f125647a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f125648b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.l f125649c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.l f125650d;

    /* renamed from: e, reason: collision with root package name */
    public final dagger.internal.l f125651e;

    /* renamed from: f, reason: collision with root package name */
    public final dagger.internal.l f125652f;

    public j(dagger.internal.l lVar, dagger.internal.l lVar2, dagger.internal.l lVar3, dagger.internal.l lVar4, Provider provider, Provider provider2) {
        this.f125647a = provider;
        this.f125648b = provider2;
        this.f125649c = lVar;
        this.f125650d = lVar2;
        this.f125651e = lVar3;
        this.f125652f = lVar4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new i(this.f125647a.get(), this.f125648b.get(), (String) this.f125649c.f393949a, (String) this.f125650d.f393949a, (String) this.f125651e.f393949a, (String) this.f125652f.f393949a);
    }
}
