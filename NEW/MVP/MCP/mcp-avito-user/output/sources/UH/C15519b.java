package Uh;

import dagger.internal.e;
import dagger.internal.f;
import dagger.internal.g;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: BeduinStatusLineContainerFactory_Factory.java */
@e
@y
@x
/* renamed from: Uh.b, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C15519b implements h<C15518a> {

    /* renamed from: a, reason: collision with root package name */
    public final f f16553a;

    public C15519b(f fVar) {
        this.f16553a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C15518a(g.b(this.f16553a));
    }
}
