package com.avito.android.tariff.cpa.prepaid_expense.items.extra_info;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ExtraInfoItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final u f295040a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.util.text.a> f295041b;

    public c(u uVar, Provider provider) {
        this.f295040a = uVar;
        this.f295041b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((d) this.f295040a.get(), this.f295041b.get());
    }
}
