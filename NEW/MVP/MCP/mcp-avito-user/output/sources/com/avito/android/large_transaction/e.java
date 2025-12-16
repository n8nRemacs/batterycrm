package com.avito.android.large_transaction;

import android.app.Application;
import android.os.Handler;
import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: LargeTransactionDetector_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class e implements h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final l f175073a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f175074b;

    /* renamed from: c, reason: collision with root package name */
    public final u f175075c;

    public e(l lVar, u uVar, Provider provider) {
        this.f175073a = lVar;
        this.f175074b = provider;
        this.f175075c = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new d((Application) this.f175073a.f393949a, this.f175074b.get(), (Handler) this.f175075c.get());
    }
}
