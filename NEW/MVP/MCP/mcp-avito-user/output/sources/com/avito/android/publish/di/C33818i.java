package com.avito.android.publish.di;

import com.avito.android.publish.C0;
import com.avito.android.publish.details.C33787s0;
import com.avito.android.publish.details.S0;
import com.avito.android.publish.details.U0;

/* compiled from: PublishDetailsInfoModule_ProvidePublishDetailsInfoProviderFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.publish.di.i, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C33818i implements dagger.internal.h<S0> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f235276a;

    /* renamed from: b, reason: collision with root package name */
    public final U0 f235277b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.l f235278c;

    public C33818i(dagger.internal.u uVar, U0 u02, dagger.internal.l lVar) {
        this.f235276a = uVar;
        this.f235277b = u02;
        this.f235278c = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        C0 c02 = (C0) this.f235276a.get();
        String str = (String) this.f235278c.f393949a;
        C33817h.f235275a.getClass();
        return str != null ? new C33787s0(c02, str) : (S0) this.f235277b.get();
    }
}
