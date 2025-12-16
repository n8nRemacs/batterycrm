package com.avito.android.profile_phones.add_phone.mvi;

import com.avito.android.account.E;
import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import xb0.InterfaceC49919a;

/* compiled from: AddPhoneActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.profile_phones.add_phone.n> f226917a;

    /* renamed from: b, reason: collision with root package name */
    public final u f226918b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.l f226919c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<com.avito.android.code_confirmation.code_confirmation.phone_confirm.f> f226920d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<E> f226921e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f226922f;

    public f(dagger.internal.l lVar, u uVar, Provider provider, Provider provider2, Provider provider3, Provider provider4) {
        this.f226917a = provider;
        this.f226918b = uVar;
        this.f226919c = lVar;
        this.f226920d = provider2;
        this.f226921e = provider3;
        this.f226922f = provider4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new e(this.f226917a.get(), (InterfaceC49919a) this.f226918b.get(), (String) this.f226919c.f393949a, this.f226920d.get(), this.f226921e.get(), this.f226922f.get());
    }
}
