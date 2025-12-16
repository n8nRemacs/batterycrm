package com.avito.android.brandspace.interactor;

import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.g;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import java.util.Set;
import javax.inject.Provider;
import nk.InterfaceC44436a;

/* compiled from: BrandspaceInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class f implements h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final l f107756a;

    /* renamed from: b, reason: collision with root package name */
    public final l f107757b;

    /* renamed from: c, reason: collision with root package name */
    public final l f107758c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<InterfaceC44436a> f107759d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f107760e;

    /* renamed from: f, reason: collision with root package name */
    public final u f107761f;

    public f(l lVar, l lVar2, l lVar3, Provider provider, Provider provider2, u uVar) {
        this.f107756a = lVar;
        this.f107757b = lVar2;
        this.f107758c = lVar3;
        this.f107759d = provider;
        this.f107760e = provider2;
        this.f107761f = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new e((String) this.f107756a.f393949a, (String) this.f107757b.f393949a, (String) this.f107758c.f393949a, g.b(this.f107759d), this.f107760e.get(), (Set) this.f107761f.get());
    }
}
