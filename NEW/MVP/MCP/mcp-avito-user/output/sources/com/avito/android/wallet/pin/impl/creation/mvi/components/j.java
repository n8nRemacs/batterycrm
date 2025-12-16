package com.avito.android.wallet.pin.impl.creation.mvi.components;

import android.app.Activity;
import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.x;
import dagger.internal.y;
import gj.InterfaceC40691b;
import javax.inject.Provider;

/* compiled from: WalletPinCreationActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class j implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.wallet.pin.impl.creation.mvi.b f328575a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f328576b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f328577c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<InterfaceC40691b> f328578d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<com.avito.android.wallet_biometry.f> f328579e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f328580f;

    /* renamed from: g, reason: collision with root package name */
    public final dagger.internal.l f328581g;

    public j(com.avito.android.wallet.pin.impl.creation.mvi.b bVar, dagger.internal.l lVar, Provider provider, Provider provider2, Provider provider3, Provider provider4, dagger.internal.l lVar2) {
        this.f328575a = bVar;
        this.f328576b = lVar;
        this.f328577c = provider;
        this.f328578d = provider2;
        this.f328579e = provider3;
        this.f328580f = provider4;
        this.f328581g = lVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new a((com.avito.android.wallet.pin.impl.creation.mvi.a) this.f328575a.get(), (String) this.f328576b.f393949a, this.f328577c.get(), this.f328578d.get(), this.f328579e.get(), this.f328580f.get(), (Activity) this.f328581g.f393949a);
    }
}
