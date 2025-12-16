package com.avito.android.code_confirmation.code_confirmation;

import com.avito.android.authorization.analytics.CodeConfirmationSource;
import com.avito.android.util.InterfaceC35745a5;
import javax.inject.Provider;

/* compiled from: CodeConfirmationInteractorImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.code_confirmation.code_confirmation.s, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C29405s implements dagger.internal.h<r> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f119625a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f119626b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<W> f119627c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.u f119628d;

    /* renamed from: e, reason: collision with root package name */
    public final dagger.internal.l f119629e;

    /* renamed from: f, reason: collision with root package name */
    public final dagger.internal.l f119630f;

    public C29405s(dagger.internal.u uVar, dagger.internal.u uVar2, Provider provider, dagger.internal.u uVar3, dagger.internal.l lVar, dagger.internal.l lVar2) {
        this.f119625a = uVar;
        this.f119626b = uVar2;
        this.f119627c = provider;
        this.f119628d = uVar3;
        this.f119629e = lVar;
        this.f119630f = lVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new r(dagger.internal.g.a(dagger.internal.w.a(this.f119625a)), (InterfaceC35745a5) this.f119626b.get(), this.f119627c.get(), (com.avito.android.remote.error.f) this.f119628d.get(), ((Boolean) this.f119629e.f393949a).booleanValue(), (CodeConfirmationSource) this.f119630f.f393949a);
    }
}
