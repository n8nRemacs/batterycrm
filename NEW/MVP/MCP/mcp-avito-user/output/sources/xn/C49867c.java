package xN;

import com.avito.android.remote.InterfaceC34322j0;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import hD.C40806a;
import javax.inject.Provider;

/* compiled from: InfoInteractorImpl_Factory.java */
@e
@y
@x
/* renamed from: xN.c, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C49867c implements h<C49866b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC34322j0> f442454a;

    /* renamed from: b, reason: collision with root package name */
    public final l f442455b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<C40806a> f442456c;

    public C49867c(l lVar, Provider provider, Provider provider2) {
        this.f442454a = provider;
        this.f442455b = lVar;
        this.f442456c = provider2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new C49866b(this.f442454a.get(), (String) this.f442455b.f393949a, this.f442456c.get());
    }
}
