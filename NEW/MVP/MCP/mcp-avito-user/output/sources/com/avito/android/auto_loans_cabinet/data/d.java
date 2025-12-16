package com.avito.android.auto_loans_cabinet.data;

import Ie.InterfaceC14063a;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AutoLoanBlanksDataSourceImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class d implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC14063a> f95350a;

    public d(Provider<InterfaceC14063a> provider) {
        this.f95350a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b(this.f95350a.get());
    }
}
