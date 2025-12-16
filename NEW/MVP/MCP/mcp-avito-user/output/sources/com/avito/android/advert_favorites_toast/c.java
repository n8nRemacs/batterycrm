package com.avito.android.advert_favorites_toast;

import com.avito.android.account.E;
import com.avito.android.util.R0;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: AdvertFavoritesToastHandlerImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class c implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final u f85797a;

    /* renamed from: b, reason: collision with root package name */
    public final u f85798b;

    /* renamed from: c, reason: collision with root package name */
    public final u f85799c;

    /* renamed from: d, reason: collision with root package name */
    public final u f85800d;

    public c(u uVar, u uVar2, u uVar3, u uVar4) {
        this.f85797a = uVar;
        this.f85798b = uVar2;
        this.f85799c = uVar3;
        this.f85800d = uVar4;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((E) this.f85797a.get(), (com.avito.android.deeplink_handler.handler.composite.a) this.f85798b.get(), (com.avito.android.util.text.a) this.f85799c.get(), (R0) this.f85800d.get());
    }
}
