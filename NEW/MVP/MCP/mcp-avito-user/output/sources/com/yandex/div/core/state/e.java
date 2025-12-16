package com.yandex.div.core.state;

import com.yandex.div.core.C38051x;
import dagger.internal.u;

/* compiled from: DivStateManager_Factory.java */
@dagger.internal.e
/* loaded from: classes7.dex */
public final class e implements dagger.internal.h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final C38051x f367659a;

    /* renamed from: b, reason: collision with root package name */
    public final u f367660b;

    public e(C38051x c38051x, u uVar) {
        this.f367659a = c38051x;
        this.f367660b = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new d((com.yandex.div.state.a) this.f367659a.get(), (n) this.f367660b.get());
    }
}
