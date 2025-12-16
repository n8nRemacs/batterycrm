package com.avito.android.virtual_deal_room_client_creation.create.interactor;

import com.avito.android.util.R0;
import com.avito.android.util.S3;
import dagger.internal.e;
import dagger.internal.g;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.w;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: CreateInteractorImpl_Factory.java */
@e
@y
@x
/* loaded from: classes5.dex */
public final class c implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<UN0.a> f326816a;

    /* renamed from: b, reason: collision with root package name */
    public final S3 f326817b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.virtual_deal_room_client_creation.create.mvi.validator.a> f326818c;

    /* renamed from: d, reason: collision with root package name */
    public final u f326819d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<R0> f326820e;

    public c(Provider provider, S3 s32, Provider provider2, u uVar, Provider provider3) {
        this.f326816a = provider;
        this.f326817b = s32;
        this.f326818c = provider2;
        this.f326819d = uVar;
        this.f326820e = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        h31.e eVarA = g.a(w.a(this.f326816a));
        this.f326817b.getClass();
        return new b(eVarA, S3.a(), this.f326818c.get(), (ON0.a) this.f326819d.get(), this.f326820e.get());
    }
}
