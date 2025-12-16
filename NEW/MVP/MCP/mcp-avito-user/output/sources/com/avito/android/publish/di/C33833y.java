package com.avito.android.publish.di;

import androidx.view.P0;
import com.avito.android.publish.PublishActivity;
import com.avito.android.publish.di.C33810a;
import javax.inject.Provider;
import ke0.C42676b;
import ke0.C42677c;
import ke0.InterfaceC42675a;

/* compiled from: PublishModule_ProvidePublishIdempotencyKeyHolderFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.publish.di.y, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C33833y implements dagger.internal.h<InterfaceC42675a> {

    /* renamed from: a, reason: collision with root package name */
    public final C33824o f235298a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f235299b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.server_time.h> f235300c;

    public C33833y(C33824o c33824o, dagger.internal.l lVar, Provider provider) {
        this.f235298a = c33824o;
        this.f235299b = lVar;
        this.f235300c = provider;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        PublishActivity publishActivity = (PublishActivity) this.f235299b.f393949a;
        com.avito.android.server_time.h hVar = (com.avito.android.server_time.h) ((C33810a.c.w) this.f235300c).get();
        this.f235298a.getClass();
        return (InterfaceC42675a) new P0(publishActivity, new C42677c(publishActivity, hVar)).a(C42676b.class);
    }
}
