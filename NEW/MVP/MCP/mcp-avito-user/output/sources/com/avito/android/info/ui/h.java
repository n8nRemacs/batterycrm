package com.avito.android.info.ui;

import android.os.Bundle;
import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import xN.InterfaceC49865a;

/* compiled from: InfoPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f170969a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC49865a> f170970b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f170971c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.l f170972d;

    public h(dagger.internal.l lVar, dagger.internal.l lVar2, Provider provider, Provider provider2) {
        this.f170969a = lVar;
        this.f170970b = provider;
        this.f170971c = provider2;
        this.f170972d = lVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new g((String) this.f170969a.f393949a, this.f170970b.get(), this.f170971c.get(), (Bundle) this.f170972d.f393949a);
    }
}
