package Zh;

import dagger.internal.e;
import dagger.internal.f;
import dagger.internal.g;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: BeduinPromoBlockContainerFactory_Factory.java */
@e
@y
@x
/* renamed from: Zh.c, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C19557c implements h<C19556b> {

    /* renamed from: a, reason: collision with root package name */
    public final f f20383a;

    public C19557c(f fVar) {
        this.f20383a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C19556b(g.b(this.f20383a));
    }
}
