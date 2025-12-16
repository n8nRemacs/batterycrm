package com.yandex.div.core.view2;

/* compiled from: DivAccessibilityBinder_Factory.java */
@dagger.internal.e
/* renamed from: com.yandex.div.core.view2.u, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38038u implements dagger.internal.h<C38037t> {

    /* renamed from: a, reason: collision with root package name */
    public final com.yandex.div.core.F f369180a;

    public C38038u(com.yandex.div.core.F f12) {
        this.f369180a = f12;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C38037t(((Boolean) this.f369180a.get()).booleanValue());
    }
}
