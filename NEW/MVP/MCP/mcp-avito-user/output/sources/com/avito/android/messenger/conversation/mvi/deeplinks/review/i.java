package com.avito.android.messenger.conversation.mvi.deeplinks.review;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: RequestReviewLinkDeeplinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class i implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final e f190665a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f190666b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.f f190667c;

    /* renamed from: d, reason: collision with root package name */
    public final dv.b f190668d;

    public i(e eVar, Provider provider, dagger.internal.f fVar, dv.b bVar) {
        this.f190665a = eVar;
        this.f190666b = provider;
        this.f190667c = fVar;
        this.f190668d = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new f((b) this.f190665a.get(), this.f190666b.get(), (InterfaceC28373a) this.f190667c.get(), (a.i) this.f190668d.get());
    }
}
