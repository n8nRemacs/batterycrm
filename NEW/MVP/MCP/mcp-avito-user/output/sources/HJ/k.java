package hJ;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: HtmlRendererImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class k implements dagger.internal.h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final u f397164a;

    public k(u uVar) {
        this.f397164a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new j((g) this.f397164a.get());
    }
}
