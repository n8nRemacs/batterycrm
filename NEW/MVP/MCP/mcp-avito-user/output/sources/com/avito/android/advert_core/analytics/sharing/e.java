package com.avito.android.advert_core.analytics.sharing;

import com.avito.android.C29640d;
import com.avito.android.account.E;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: AdvertSharingEventTrackerImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class e implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final u f82861a;

    /* renamed from: b, reason: collision with root package name */
    public final u f82862b;

    /* renamed from: c, reason: collision with root package name */
    public final u f82863c;

    /* renamed from: d, reason: collision with root package name */
    public final u f82864d;

    public e(u uVar, u uVar2, u uVar3, u uVar4) {
        this.f82861a = uVar;
        this.f82862b = uVar2;
        this.f82863c = uVar3;
        this.f82864d = uVar4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new b((InterfaceC28373a) this.f82861a.get(), (E) this.f82862b.get(), (InterfaceC35745a5) this.f82863c.get(), (C29640d) this.f82864d.get());
    }
}
