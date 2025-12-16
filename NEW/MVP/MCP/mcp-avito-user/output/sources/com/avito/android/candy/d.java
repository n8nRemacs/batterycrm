package com.avito.android.candy;

import android.content.Context;
import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: CandyCarImageUploader_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class d implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<Context> f114880a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f114881b;

    public d(Provider<Context> provider, Provider<InterfaceC35745a5> provider2) {
        this.f114880a = provider;
        this.f114881b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c(this.f114880a.get(), this.f114881b.get());
    }
}
