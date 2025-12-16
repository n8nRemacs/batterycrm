package com.avito.android.virtual_deal_room_client_creation.clients.interactor;

import com.avito.android.util.R0;
import com.avito.android.util.S3;
import dagger.internal.e;
import dagger.internal.g;
import dagger.internal.h;
import dagger.internal.w;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ClientsInteractorImpl_Factory.java */
@e
@y
@x
/* loaded from: classes5.dex */
public final class c implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<UN0.a> f326570a;

    /* renamed from: b, reason: collision with root package name */
    public final S3 f326571b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<R0> f326572c;

    public c(S3 s32, Provider provider, Provider provider2) {
        this.f326570a = provider;
        this.f326571b = s32;
        this.f326572c = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        h31.e eVarA = g.a(w.a(this.f326570a));
        this.f326571b.getClass();
        return new b(eVarA, S3.a(), this.f326572c.get());
    }
}
