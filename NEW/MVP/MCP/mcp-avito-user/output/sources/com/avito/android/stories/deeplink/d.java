package com.avito.android.stories.deeplink;

import com.avito.android.L;
import com.avito.android.O;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.stories.InterfaceC35060i;
import com.avito.android.stories.k;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: StoriesDeepLinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class d implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final dv.b f285092a;

    /* renamed from: b, reason: collision with root package name */
    public final k f285093b;

    /* renamed from: c, reason: collision with root package name */
    public final O f285094c;

    /* renamed from: d, reason: collision with root package name */
    public final dv.b f285095d;

    public d(dv.b bVar, k kVar, O o12, dv.b bVar2) {
        this.f285092a = bVar;
        this.f285093b = kVar;
        this.f285094c = o12;
        this.f285095d = bVar2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((a.b) this.f285092a.get(), (InterfaceC35060i) this.f285093b.get(), (L) this.f285094c.get(), (a.InterfaceC4053a) this.f285095d.get());
    }
}
