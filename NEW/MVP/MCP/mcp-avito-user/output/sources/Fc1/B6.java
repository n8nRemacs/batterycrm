package Fc1;

import android.app.Application;

@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes9.dex */
public final class B6 implements dagger.internal.h<H3> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f4828a;

    public B6(U5 u52, dagger.internal.l lVar) {
        this.f4828a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new H3((Application) this.f4828a.f393949a);
    }
}
