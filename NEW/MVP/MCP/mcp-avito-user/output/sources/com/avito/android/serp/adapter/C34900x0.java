package com.avito.android.serp.adapter;

import com.avito.android.C29640d;
import com.avito.android.analytics.InterfaceC28373a;

/* compiled from: SerpAdapterCallLinkGetterImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.serp.adapter.x0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C34900x0 implements dagger.internal.h<C34881w0> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f273901a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f273902b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.u f273903c;

    public C34900x0(dagger.internal.u uVar, dagger.internal.u uVar2, dagger.internal.u uVar3) {
        this.f273901a = uVar;
        this.f273902b = uVar2;
        this.f273903c = uVar3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new C34881w0((com.avito.android.permissions.z) this.f273901a.get(), (InterfaceC28373a) this.f273902b.get(), (C29640d) this.f273903c.get());
    }
}
