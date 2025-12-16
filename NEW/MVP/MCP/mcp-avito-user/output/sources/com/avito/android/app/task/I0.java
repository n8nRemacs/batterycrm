package com.avito.android.app.task;

import com.avito.android.messenger.conversation.mvi.send.InterfaceC32200a;
import com.avito.android.util.InterfaceC35745a5;
import javax.inject.Provider;

/* compiled from: MessengerPhotosCleanerImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes11.dex */
public final class I0 implements dagger.internal.h<H0> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.server_time.h> f91462a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC32200a> f91463b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.photo_cache.b> f91464c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f91465d;

    public I0(Provider<com.avito.android.server_time.h> provider, Provider<InterfaceC32200a> provider2, Provider<com.avito.android.photo_cache.b> provider3, Provider<InterfaceC35745a5> provider4) {
        this.f91462a = provider;
        this.f91463b = provider2;
        this.f91464c = provider3;
        this.f91465d = provider4;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new H0(this.f91462a.get(), this.f91463b.get(), this.f91464c.get(), this.f91465d.get());
    }
}
