package com.yandex.div.core.tooltip;

import com.yandex.div.core.C;
import com.yandex.div.core.h0;
import com.yandex.div.core.l0;
import com.yandex.div.core.view2.X;
import dagger.internal.u;

/* compiled from: DivTooltipController_Factory.java */
@dagger.internal.e
/* loaded from: classes7.dex */
public final class i implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.f f367770a;

    /* renamed from: b, reason: collision with root package name */
    public final C f367771b;

    /* renamed from: c, reason: collision with root package name */
    public final u f367772c;

    /* renamed from: d, reason: collision with root package name */
    public final u f367773d;

    public i(dagger.internal.f fVar, C c12, u uVar, u uVar2) {
        this.f367770a = fVar;
        this.f367771b = c12;
        this.f367772c = uVar;
        this.f367773d = uVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new g(this.f367770a, (l0) this.f367771b.get(), (X) this.f367772c.get(), (h0) this.f367773d.get());
    }
}
