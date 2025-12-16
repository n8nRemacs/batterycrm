package com.avito.android.social_management.deep_linking;

import com.avito.android.deeplink_handler.view.a;
import com.avito.android.social_management.C35042i;
import com.avito.android.social_management.InterfaceC35040g;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import l90.o;
import l90.q;

/* compiled from: SocialsListAsyncLinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class d implements h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final q f284577a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f284578b;

    /* renamed from: c, reason: collision with root package name */
    public final dv.b f284579c;

    /* renamed from: d, reason: collision with root package name */
    public final C35042i f284580d;

    public d(q qVar, dv.b bVar, dv.b bVar2, C35042i c35042i) {
        this.f284577a = qVar;
        this.f284578b = bVar;
        this.f284579c = bVar2;
        this.f284580d = c35042i;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c((o) this.f284577a.get(), (a.b) this.f284578b.get(), (a.InterfaceC4053a) this.f284579c.get(), (InterfaceC35040g) this.f284580d.get());
    }
}
