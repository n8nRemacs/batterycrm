package com.avito.android.publish.details.adapter.historical_suggest.new_suggest;

import com.avito.android.publish.C0;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: HistoricalSuggestNewItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<d> f233261a;

    /* renamed from: b, reason: collision with root package name */
    public final u f233262b;

    /* renamed from: c, reason: collision with root package name */
    public final u f233263c;

    public c(u uVar, u uVar2, Provider provider) {
        this.f233261a = provider;
        this.f233262b = uVar;
        this.f233263c = uVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new b(this.f233261a.get(), (com.avito.android.historical_suggests.provider.a) this.f233262b.get(), (C0) this.f233263c.get());
    }
}
