package com.avito.android.user_advert.advert;

import com.avito.android.util.InterfaceC35745a5;
import javax.inject.Provider;
import lI0.InterfaceC43640a;

/* compiled from: MyDraftActionsInteractorImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes4.dex */
public final class H1 implements dagger.internal.h<G1> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC43640a> f308241a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f308242b;

    /* renamed from: c, reason: collision with root package name */
    public final com.avito.android.remote.error.i f308243c;

    public H1(com.avito.android.remote.error.i iVar, Provider provider, Provider provider2) {
        this.f308241a = provider;
        this.f308242b = provider2;
        this.f308243c = iVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        h31.e eVarB = dagger.internal.g.b(this.f308241a);
        return new G1((com.avito.android.remote.error.f) this.f308243c.get(), this.f308242b.get(), eVarB);
    }
}
