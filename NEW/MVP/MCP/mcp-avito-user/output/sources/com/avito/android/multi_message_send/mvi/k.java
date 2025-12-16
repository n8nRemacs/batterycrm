package com.avito.android.multi_message_send.mvi;

import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: MultiMessageSendActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class k implements dagger.internal.h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.multi_message_send.domain.f f206786a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.multi_message_send.domain.m f206787b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.l f206788c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f206789d;

    public k(com.avito.android.multi_message_send.domain.f fVar, com.avito.android.multi_message_send.domain.m mVar, dagger.internal.l lVar, Provider provider) {
        this.f206786a = fVar;
        this.f206787b = mVar;
        this.f206788c = lVar;
        this.f206789d = provider;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new j((com.avito.android.multi_message_send.domain.e) this.f206786a.get(), (com.avito.android.multi_message_send.domain.l) this.f206787b.get(), (String) this.f206788c.f393949a, this.f206789d.get());
    }
}
