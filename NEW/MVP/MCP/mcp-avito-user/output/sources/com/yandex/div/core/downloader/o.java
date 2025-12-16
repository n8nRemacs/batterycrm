package com.yandex.div.core.downloader;

import dagger.internal.u;

/* compiled from: DivPatchManager_Factory.java */
@dagger.internal.e
/* loaded from: classes7.dex */
public final class o implements dagger.internal.h<n> {

    /* renamed from: a, reason: collision with root package name */
    public final u f367433a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.f f367434b;

    public o(dagger.internal.f fVar, u uVar) {
        this.f367433a = uVar;
        this.f367434b = fVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new n((k) this.f367433a.get(), this.f367434b);
    }
}
