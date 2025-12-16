package com.avito.android.safety.safety_settings.deeplink;

import com.avito.android.deeplink_handler.view.a;
import com.avito.android.util.InterfaceC35745a5;
import javax.inject.Provider;

/* compiled from: SessionDeleteAsyncLinkHandler_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes3.dex */
public final class t implements dagger.internal.h<s> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.safety.sessions.f f257595a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f257596b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f257597c;

    public t(com.avito.android.safety.sessions.f fVar, dv.b bVar, Provider provider) {
        this.f257595a = fVar;
        this.f257596b = bVar;
        this.f257597c = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new s((com.avito.android.safety.sessions.a) this.f257595a.get(), (a.g) this.f257596b.get(), this.f257597c.get());
    }
}
