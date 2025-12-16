package com.yandex.div.core.timer;

import com.yandex.div.core.C37916k;
import com.yandex.div.core.C37919n;
import dagger.internal.u;

/* compiled from: DivTimerEventDispatcherProvider_Factory.java */
@dagger.internal.e
/* loaded from: classes7.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final C37919n f367709a;

    /* renamed from: b, reason: collision with root package name */
    public final u f367710b;

    public c(C37919n c37919n, u uVar) {
        this.f367709a = c37919n;
        this.f367710b = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new b((C37916k) this.f367709a.get(), (com.yandex.div.core.view2.errors.f) this.f367710b.get());
    }
}
