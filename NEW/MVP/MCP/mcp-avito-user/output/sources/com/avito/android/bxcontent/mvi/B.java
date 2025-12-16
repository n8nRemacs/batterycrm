package com.avito.android.bxcontent.mvi;

import com.avito.android.bxcontent.BxContentArguments;
import com.avito.android.util.C35838l3;
import javax.inject.Provider;

/* compiled from: BxContentInitialStateBuilder_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes12.dex */
public final class B implements dagger.internal.h<A> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.bxcontent.U0> f111201a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f111202b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.l f111203c;

    public B(dagger.internal.l lVar, dagger.internal.l lVar2, Provider provider) {
        this.f111201a = provider;
        this.f111202b = lVar;
        this.f111203c = lVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new A(this.f111201a.get(), (BxContentArguments) this.f111202b.f393949a, (C35838l3) this.f111203c.f393949a);
    }
}
