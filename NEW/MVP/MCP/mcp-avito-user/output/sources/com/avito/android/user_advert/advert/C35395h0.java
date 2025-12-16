package com.avito.android.user_advert.advert;

import com.avito.android.B2;
import com.avito.android.util.InterfaceC35745a5;

/* compiled from: MyAdvertDetailsInteractorImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.user_advert.advert.h0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C35395h0 implements dagger.internal.h<C35392g0> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f308938a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f308939b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.u f308940c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.u f308941d;

    /* renamed from: e, reason: collision with root package name */
    public final r f308942e;

    public C35395h0(dagger.internal.u uVar, dagger.internal.u uVar2, dagger.internal.u uVar3, dagger.internal.u uVar4, r rVar) {
        this.f308938a = uVar;
        this.f308939b = uVar2;
        this.f308940c = uVar3;
        this.f308941d = uVar4;
        this.f308942e = rVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new C35392g0(dagger.internal.g.b(this.f308938a), (InterfaceC35745a5) this.f308939b.get(), (com.avito.android.remote.error.f) this.f308940c.get(), (B2) this.f308941d.get(), (C35446q) this.f308942e.get());
    }
}
