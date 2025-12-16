package Wh;

import dagger.internal.g;
import dagger.internal.h;
import dagger.internal.w;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SingleChildOwnerExtractionStrategy_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class f implements h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.f f18013a;

    public f(dagger.internal.f fVar) {
        this.f18013a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new e(g.a(w.a(this.f18013a)));
    }
}
