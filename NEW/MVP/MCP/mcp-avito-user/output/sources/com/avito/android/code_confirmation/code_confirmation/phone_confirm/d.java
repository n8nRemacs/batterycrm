package com.avito.android.code_confirmation.code_confirmation.phone_confirm;

import com.avito.android.remote.r;
import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: PhoneConfirmInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class d implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final u f119607a;

    /* renamed from: b, reason: collision with root package name */
    public final u f119608b;

    /* renamed from: c, reason: collision with root package name */
    public final u f119609c;

    /* renamed from: d, reason: collision with root package name */
    public final u f119610d;

    public d(u uVar, u uVar2, u uVar3, u uVar4) {
        this.f119607a = uVar;
        this.f119608b = uVar2;
        this.f119609c = uVar3;
        this.f119610d = uVar4;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c((r) this.f119607a.get(), (InterfaceC35745a5) this.f119608b.get(), (com.avito.android.remote.error.f) this.f119609c.get(), (f) this.f119610d.get());
    }
}
