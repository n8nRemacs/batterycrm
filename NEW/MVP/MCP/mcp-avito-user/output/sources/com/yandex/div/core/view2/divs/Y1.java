package com.yandex.div.core.view2.divs;

import com.yandex.div.core.C37920o;

/* compiled from: DivSliderBinder_Factory.java */
@dagger.internal.e
/* loaded from: classes7.dex */
public final class Y1 implements dagger.internal.h<M1> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f368277a;

    /* renamed from: b, reason: collision with root package name */
    public final com.yandex.div.core.r f368278b;

    /* renamed from: c, reason: collision with root package name */
    public final com.yandex.div.core.D f368279c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.u f368280d;

    /* renamed from: e, reason: collision with root package name */
    public final dagger.internal.u f368281e;

    /* renamed from: f, reason: collision with root package name */
    public final C37920o f368282f;

    public Y1(dagger.internal.u uVar, com.yandex.div.core.r rVar, com.yandex.div.core.D d12, dagger.internal.u uVar2, dagger.internal.u uVar3, C37920o c37920o) {
        this.f368277a = uVar;
        this.f368278b = rVar;
        this.f368279c = d12;
        this.f368280d = uVar2;
        this.f368281e = uVar3;
        this.f368282f = c37920o;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new M1((C38006w) this.f368277a.get(), com.yandex.div.core.r.a(this.f368278b.f367640a), (com.yandex.div.core.font.a) this.f368279c.get(), (com.yandex.div.core.expression.variables.f) this.f368280d.get(), (com.yandex.div.core.view2.errors.f) this.f368281e.get(), ((Boolean) this.f368282f.get()).booleanValue());
    }
}
