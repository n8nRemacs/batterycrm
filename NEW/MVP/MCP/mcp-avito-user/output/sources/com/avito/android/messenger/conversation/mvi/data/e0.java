package com.avito.android.messenger.conversation.mvi.data;

import com.avito.android.persistence.messenger.InterfaceC33043a0;
import com.avito.android.persistence.messenger.InterfaceC33140y2;
import com.avito.android.persistence.messenger.R1;
import com.avito.android.persistence.messenger.Y0;
import javax.inject.Provider;

/* compiled from: MessageRepoImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes15.dex */
public final class e0 implements dagger.internal.h<d0> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<Y0> f190464a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<R1> f190465b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC33140y2> f190466c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<InterfaceC33043a0> f190467d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<InterfaceC32021j> f190468e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<InterfaceC32012a> f190469f;

    public e0(Provider<Y0> provider, Provider<R1> provider2, Provider<InterfaceC33140y2> provider3, Provider<InterfaceC33043a0> provider4, Provider<InterfaceC32021j> provider5, Provider<InterfaceC32012a> provider6) {
        this.f190464a = provider;
        this.f190465b = provider2;
        this.f190466c = provider3;
        this.f190467d = provider4;
        this.f190468e = provider5;
        this.f190469f = provider6;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d0(this.f190464a.get(), this.f190465b.get(), this.f190466c.get(), this.f190467d.get(), this.f190468e.get(), this.f190469f.get());
    }
}
