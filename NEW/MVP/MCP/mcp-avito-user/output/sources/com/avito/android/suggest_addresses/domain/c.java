package com.avito.android.suggest_addresses.domain;

import com.avito.android.suggest_addresses.entity.SuggestAddressesParams;
import com.avito.android.util.R0;
import dagger.internal.e;
import dagger.internal.g;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.w;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import lA0.InterfaceC43610a;

/* compiled from: SuggestAddressesInteractorImpl_Factory.java */
@e
@y
@x
/* loaded from: classes4.dex */
public final class c implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC43610a> f291886a;

    /* renamed from: b, reason: collision with root package name */
    public final l f291887b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<R0> f291888c;

    public c(l lVar, Provider provider, Provider provider2) {
        this.f291886a = provider;
        this.f291887b = lVar;
        this.f291888c = provider2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new b(g.a(w.a(this.f291886a)), (SuggestAddressesParams) this.f291887b.f393949a, this.f291888c.get());
    }
}
