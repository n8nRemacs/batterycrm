package com.avito.android.code_check.phone_list.adapter.phone;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: PhoneItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f118952a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.util.text.a> f118953b;

    public b(u uVar, Provider provider) {
        this.f118952a = uVar;
        this.f118953b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((c) this.f118952a.get(), this.f118953b.get());
    }
}
