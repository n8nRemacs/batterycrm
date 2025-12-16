package com.avito.android.messenger.service.direct_reply;

import com.avito.android.analytics.H;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import ru.avito.messenger.MessengerApi;

/* compiled from: DirectReplyServiceInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class k implements dagger.internal.h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<MessengerApi> f197247a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.server_time.h> f197248b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f197249c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f197250d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<H> f197251e;

    public k(Provider<MessengerApi> provider, Provider<com.avito.android.server_time.h> provider2, Provider<InterfaceC35745a5> provider3, Provider<InterfaceC28373a> provider4, Provider<H> provider5) {
        this.f197247a = provider;
        this.f197248b = provider2;
        this.f197249c = provider3;
        this.f197250d = provider4;
        this.f197251e = provider5;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new j(this.f197247a.get(), this.f197248b.get(), this.f197249c.get(), this.f197250d.get(), this.f197251e.get());
    }
}
