package sM;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ClearRunOnceStorageAuthorizationPlugin_Factory.java */
@dagger.internal.e
@y
@x
/* renamed from: sM.c, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C48071c implements dagger.internal.h<C48069a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f437613a;

    public C48071c(u uVar) {
        this.f437613a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C48069a((i) this.f437613a.get());
    }
}
