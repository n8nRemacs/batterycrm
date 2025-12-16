package com.avito.android.publish.premoderation;

import com.avito.android.Q1;
import com.avito.android.remote.H0;
import com.avito.android.remote.model.category_parameters.CategoryParametersConverter;
import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.x;
import dagger.internal.y;
import yc.C50213a;

/* compiled from: AdvertProactiveModerationInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class m implements dagger.internal.h<l> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f238320a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f238321b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.u f238322c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.u f238323d;

    /* renamed from: e, reason: collision with root package name */
    public final dagger.internal.u f238324e;

    public m(dagger.internal.u uVar, dagger.internal.u uVar2, dagger.internal.u uVar3, dagger.internal.u uVar4, dagger.internal.u uVar5) {
        this.f238320a = uVar;
        this.f238321b = uVar2;
        this.f238322c = uVar3;
        this.f238323d = uVar4;
        this.f238324e = uVar5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new l((H0) this.f238320a.get(), (InterfaceC35745a5) this.f238321b.get(), (CategoryParametersConverter) this.f238322c.get(), (C50213a) this.f238323d.get(), (Q1) this.f238324e.get());
    }
}
