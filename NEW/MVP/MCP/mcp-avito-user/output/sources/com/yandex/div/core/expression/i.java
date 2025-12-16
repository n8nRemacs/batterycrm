package com.yandex.div.core.expression;

import com.yandex.div.core.C37916k;
import com.yandex.div.core.C37919n;
import com.yandex.div.core.r;
import dagger.internal.l;
import dagger.internal.u;

/* compiled from: ExpressionsRuntimeProvider_Factory.java */
@dagger.internal.e
/* loaded from: classes7.dex */
public final class i implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final l f367470a;

    /* renamed from: b, reason: collision with root package name */
    public final C37919n f367471b;

    /* renamed from: c, reason: collision with root package name */
    public final u f367472c;

    /* renamed from: d, reason: collision with root package name */
    public final r f367473d;

    public i(l lVar, C37919n c37919n, u uVar, r rVar) {
        this.f367470a = lVar;
        this.f367471b = c37919n;
        this.f367472c = uVar;
        this.f367473d = rVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new g((com.yandex.div.core.expression.variables.e) this.f367470a.f393949a, (C37916k) this.f367471b.get(), (com.yandex.div.core.view2.errors.f) this.f367472c.get(), r.a(this.f367473d.f367640a));
    }
}
