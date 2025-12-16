package com.yandex.div.core.view2;

import com.yandex.div.core.C37921p;

/* compiled from: DivTypefaceResolver_Factory.java */
@dagger.internal.e
/* loaded from: classes7.dex */
public final class K implements dagger.internal.h<J> {

    /* renamed from: a, reason: collision with root package name */
    public final com.yandex.div.core.D f367862a;

    /* renamed from: b, reason: collision with root package name */
    public final C37921p f367863b;

    public K(com.yandex.div.core.D d12, C37921p c37921p) {
        this.f367862a = d12;
        this.f367863b = c37921p;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new J((com.yandex.div.core.font.a) this.f367862a.get(), (com.yandex.div.core.font.a) this.f367863b.get());
    }
}
