package com.avito.android.confirm_documents_bottom_sheet.domain;

import com.avito.android.account.E;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.remote.H;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ConfirmDocumentsInteractorImpl_Factory.java */
@e
@y
@x
/* loaded from: classes12.dex */
public final class d implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<XO.a> f125567a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f125568b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<E> f125569c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<H> f125570d;

    public d(Provider<XO.a> provider, Provider<InterfaceC28373a> provider2, Provider<E> provider3, Provider<H> provider4) {
        this.f125567a = provider;
        this.f125568b = provider2;
        this.f125569c = provider3;
        this.f125570d = provider4;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b(this.f125567a.get(), this.f125568b.get(), this.f125569c.get(), this.f125570d.get());
    }
}
