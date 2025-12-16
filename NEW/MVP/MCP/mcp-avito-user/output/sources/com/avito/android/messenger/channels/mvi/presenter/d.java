package com.avito.android.messenger.channels.mvi.presenter;

import com.avito.android.ab_tests.groups.MessengerFolderTabsTestGroup;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.messenger.channels.mvi.di.w;
import com.avito.android.messenger.channels.mvi.interactor.k;
import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import u3.g;

/* compiled from: FoldersPresenterImpl_Factory.java */
@e
@y
@x
/* loaded from: classes15.dex */
public final class d implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f188304a;

    /* renamed from: b, reason: collision with root package name */
    public final w f188305b;

    /* renamed from: c, reason: collision with root package name */
    public final com.avito.android.messenger.channels.mvi.di.x f188306c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<g<MessengerFolderTabsTestGroup>> f188307d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f188308e;

    public d(Provider provider, w wVar, com.avito.android.messenger.channels.mvi.di.x xVar, Provider provider2, Provider provider3) {
        this.f188304a = provider;
        this.f188305b = wVar;
        this.f188306c = xVar;
        this.f188307d = provider2;
        this.f188308e = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b(this.f188304a.get(), (k) this.f188305b.get(), (com.avito.android.messenger.folders.c) this.f188306c.get(), this.f188307d.get(), this.f188308e.get());
    }
}
