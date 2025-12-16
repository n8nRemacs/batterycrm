package com.yandex.div.core.dagger;

import com.yandex.div.core.E;
import com.yandex.div.core.O;
import com.yandex.div.internal.viewpool.i;
import j.P;

/* compiled from: Div2Module_ProvideViewPoolProfilerFactory.java */
@dagger.internal.e
/* loaded from: classes7.dex */
public final class i implements dagger.internal.h<com.yandex.div.internal.viewpool.i> {

    /* renamed from: a, reason: collision with root package name */
    public final O f367411a;

    /* renamed from: b, reason: collision with root package name */
    public final E f367412b;

    public i(O o12, E e12) {
        this.f367411a = o12;
        this.f367412b = e12;
    }

    @Override // javax.inject.Provider
    @P
    public final Object get() {
        boolean zBooleanValue = ((Boolean) this.f367411a.get()).booleanValue();
        i.b bVar = (i.b) this.f367412b.get();
        if (zBooleanValue) {
            return new com.yandex.div.internal.viewpool.i(bVar);
        }
        return null;
    }
}
