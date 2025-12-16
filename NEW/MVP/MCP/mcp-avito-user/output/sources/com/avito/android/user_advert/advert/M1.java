package com.avito.android.user_advert.advert;

import com.avito.android.util.InterfaceC35745a5;

/* compiled from: MyDraftAdvertDetailsInteractorImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes4.dex */
public final class M1 implements dagger.internal.h<L1> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f308260a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f308261b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.u f308262c;

    public M1(dagger.internal.u uVar, dagger.internal.u uVar2, dagger.internal.u uVar3) {
        this.f308260a = uVar;
        this.f308261b = uVar2;
        this.f308262c = uVar3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new L1(dagger.internal.g.b(this.f308260a), (InterfaceC35745a5) this.f308261b.get(), (com.jakewharton.rxrelay3.c) this.f308262c.get());
    }
}
