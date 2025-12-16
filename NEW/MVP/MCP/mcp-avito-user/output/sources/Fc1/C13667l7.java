package Fc1;

import android.content.Context;

@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: Fc1.l7, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C13667l7 implements dagger.internal.h<S5> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f5664a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f5665b;

    public C13667l7(N5 n52, dagger.internal.l lVar, dagger.internal.l lVar2) {
        this.f5664a = lVar;
        this.f5665b = lVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new S5((Context) this.f5664a.f393949a, (InterfaceC13753v4) this.f5665b.f393949a);
    }
}
