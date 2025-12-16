package com.avito.android.autoteka.deeplinks.previewsearch;

import android.content.Context;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.di.module.C30102l3;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: AutotekaPreviewSearchDeepLinkHandler_Factory.java */
@e
@y
@x
/* loaded from: classes11.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final C30102l3 f96296a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f96297b;

    /* renamed from: c, reason: collision with root package name */
    public final dv.b f96298c;

    public b(C30102l3 c30102l3, dv.b bVar, dv.b bVar2) {
        this.f96296a = c30102l3;
        this.f96297b = bVar;
        this.f96298c = bVar2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((Context) this.f96296a.get(), (a.InterfaceC4053a) this.f96297b.get(), (a.b) this.f96298c.get());
    }
}
