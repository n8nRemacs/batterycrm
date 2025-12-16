package com.avito.android.profile_phones.validation;

import com.avito.android.remote.InterfaceC34401z0;
import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: PhoneValidationInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class f implements h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final u f228355a;

    /* renamed from: b, reason: collision with root package name */
    public final u f228356b;

    /* renamed from: c, reason: collision with root package name */
    public final u f228357c;

    public f(u uVar, u uVar2, u uVar3) {
        this.f228355a = uVar;
        this.f228356b = uVar2;
        this.f228357c = uVar3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new e((InterfaceC34401z0) this.f228355a.get(), (InterfaceC35745a5) this.f228356b.get(), (com.avito.android.remote.error.f) this.f228357c.get());
    }
}
