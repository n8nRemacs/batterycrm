package xo0;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: TfaEnableCodeCheckScenarioBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* renamed from: xo0.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C49976b implements dagger.internal.h<C49975a> {

    /* renamed from: a, reason: collision with root package name */
    public final h f442654a;

    public C49976b(h hVar) {
        this.f442654a = hVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C49975a((f) this.f442654a.get());
    }
}
