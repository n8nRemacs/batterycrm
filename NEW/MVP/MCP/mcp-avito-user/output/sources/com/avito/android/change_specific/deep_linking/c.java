package com.avito.android.change_specific.deep_linking;

import com.avito.android.change_specific.f;
import com.avito.android.change_specific.i;
import com.avito.android.deeplink_handler.view.a;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ProfileChangeSpecificAsyncLinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class c implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final i f117929a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f117930b;

    /* renamed from: c, reason: collision with root package name */
    public final dv.b f117931c;

    public c(i iVar, dv.b bVar, dv.b bVar2) {
        this.f117929a = iVar;
        this.f117930b = bVar;
        this.f117931c = bVar2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((f) this.f117929a.get(), (a.InterfaceC4053a) this.f117930b.get(), (a.b) this.f117931c.get());
    }
}
