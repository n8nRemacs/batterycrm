package com.yandex.div.core.view2;

import com.yandex.div.core.C37916k;
import com.yandex.div.core.C37919n;
import com.yandex.div.core.C38053z;
import com.yandex.div.core.p0;
import com.yandex.div.core.view2.divs.C37935b;

/* compiled from: DivVisibilityActionDispatcher_Factory.java */
@dagger.internal.e
/* loaded from: classes7.dex */
public final class W implements dagger.internal.h<U> {

    /* renamed from: a, reason: collision with root package name */
    public final com.yandex.div.core.r f367885a;

    /* renamed from: b, reason: collision with root package name */
    public final C38053z f367886b;

    /* renamed from: c, reason: collision with root package name */
    public final C37919n f367887c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.u f367888d;

    public W(com.yandex.div.core.r rVar, C38053z c38053z, C37919n c37919n, dagger.internal.u uVar) {
        this.f367885a = rVar;
        this.f367886b = c38053z;
        this.f367887c = c37919n;
        this.f367888d = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new U(com.yandex.div.core.r.a(this.f367885a.f367640a), (p0) this.f367886b.get(), (C37916k) this.f367887c.get(), (C37935b) this.f367888d.get());
    }
}
