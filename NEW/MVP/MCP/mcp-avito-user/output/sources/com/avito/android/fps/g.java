package com.avito.android.fps;

import Bc.C13134b;
import Bc.InterfaceC13133a;
import android.app.Application;
import android.os.Handler;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: FramesListener_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class g implements h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final l f158632a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<l41.g<a>> f158633b;

    /* renamed from: c, reason: collision with root package name */
    public final C13134b f158634c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<Handler> f158635d;

    public g(l lVar, Provider provider, C13134b c13134b, Provider provider2) {
        this.f158632a = lVar;
        this.f158633b = provider;
        this.f158634c = c13134b;
        this.f158635d = provider2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new e((Application) this.f158632a.f393949a, this.f158633b.get(), (InterfaceC13133a) this.f158634c.get(), this.f158635d.get());
    }
}
