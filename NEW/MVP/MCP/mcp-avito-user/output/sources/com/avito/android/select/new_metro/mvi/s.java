package com.avito.android.select.new_metro.mvi;

import com.avito.android.select.new_metro.ItemsHolder;
import com.avito.android.select.new_metro.SelectMetroParams;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: SelectMetroReducer_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class s implements dagger.internal.h<o> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f266304a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<ItemsHolder> f266305b;

    public s(dagger.internal.l lVar, Provider provider) {
        this.f266304a = lVar;
        this.f266305b = provider;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new o((SelectMetroParams) this.f266304a.f393949a, this.f266305b.get());
    }
}
