package com.avito.android.publish.details.adapter.historical_suggest;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: HistoricalSuggestItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<c> f233232a;

    /* renamed from: b, reason: collision with root package name */
    public final u f233233b;

    public b(u uVar, Provider provider) {
        this.f233232a = provider;
        this.f233233b = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new a(this.f233232a.get(), (u3.l) this.f233233b.get());
    }
}
