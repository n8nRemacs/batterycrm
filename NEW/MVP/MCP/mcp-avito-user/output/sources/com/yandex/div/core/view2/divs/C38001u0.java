package com.yandex.div.core.view2.divs;

import com.yandex.div.core.C37923s;
import com.yandex.div.core.C37924t;
import u21.C48774a;

/* compiled from: DivCustomBinder_Factory.java */
@dagger.internal.e
/* renamed from: com.yandex.div.core.view2.divs.u0, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38001u0 implements dagger.internal.h<C37998t0> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f368825a;

    /* renamed from: b, reason: collision with root package name */
    public final C37924t f368826b;

    /* renamed from: c, reason: collision with root package name */
    public final C37923s f368827c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.u f368828d;

    public C38001u0(dagger.internal.u uVar, C37924t c37924t, C37923s c37923s, dagger.internal.u uVar2) {
        this.f368825a = uVar;
        this.f368826b = c37924t;
        this.f368827c = c37923s;
        this.f368828d = uVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new C37998t0((C38006w) this.f368825a.get(), (com.yandex.div.core.W) this.f368826b.get(), this.f368827c.f367651a.f367579j, (C48774a) this.f368828d.get());
    }
}
