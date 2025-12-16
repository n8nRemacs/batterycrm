package com.yandex.div.core.view2;

import com.yandex.div.core.C37922q;
import com.yandex.div.core.InterfaceC37914i;
import java.util.concurrent.ExecutorService;

/* compiled from: DivPlaceholderLoader_Factory.java */
@dagger.internal.e
/* loaded from: classes7.dex */
public final class G implements dagger.internal.h<D> {

    /* renamed from: a, reason: collision with root package name */
    public final C37922q f367853a;

    /* renamed from: b, reason: collision with root package name */
    public final com.yandex.div.core.c0 f367854b;

    public G(C37922q c37922q, com.yandex.div.core.c0 c0Var) {
        this.f367853a = c37922q;
        this.f367854b = c0Var;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new D((InterfaceC37914i) this.f367853a.get(), (ExecutorService) this.f367854b.get());
    }
}
