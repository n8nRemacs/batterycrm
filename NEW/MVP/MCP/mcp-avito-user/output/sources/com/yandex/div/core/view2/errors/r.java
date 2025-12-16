package com.yandex.div.core.view2.errors;

import com.yandex.div.core.C37920o;
import com.yandex.div.core.view2.e0;
import dagger.internal.u;

/* compiled from: ErrorVisualMonitor_Factory.java */
@dagger.internal.e
/* loaded from: classes7.dex */
public final class r implements dagger.internal.h<p> {

    /* renamed from: a, reason: collision with root package name */
    public final u f369103a;

    /* renamed from: b, reason: collision with root package name */
    public final C37920o f369104b;

    /* renamed from: c, reason: collision with root package name */
    public final u f369105c;

    public r(u uVar, C37920o c37920o, u uVar2) {
        this.f369103a = uVar;
        this.f369104b = c37920o;
        this.f369105c = uVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new p((f) this.f369103a.get(), ((Boolean) this.f369104b.get()).booleanValue(), (e0) this.f369105c.get());
    }
}
