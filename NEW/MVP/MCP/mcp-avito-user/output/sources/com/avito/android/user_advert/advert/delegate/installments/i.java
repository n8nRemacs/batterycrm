package com.avito.android.user_advert.advert.delegate.installments;

import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: InstallmentsStateChangeInteractor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final u f308623a;

    /* renamed from: b, reason: collision with root package name */
    public final u f308624b;

    public i(u uVar, u uVar2) {
        this.f308623a = uVar;
        this.f308624b = uVar2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new h((SV0.a) this.f308623a.get(), (InterfaceC35745a5) this.f308624b.get());
    }
}
