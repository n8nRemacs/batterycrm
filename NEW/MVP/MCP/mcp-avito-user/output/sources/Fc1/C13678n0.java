package Fc1;

@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: Fc1.n0, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C13678n0 implements dagger.internal.h<V> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f5688a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f5689b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.h f5690c;

    public C13678n0(dagger.internal.l lVar, dagger.internal.u uVar, dagger.internal.u uVar2) {
        this.f5688a = uVar;
        this.f5689b = uVar2;
        this.f5690c = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new V((V7) this.f5688a.get(), (C13724s2) this.f5689b.get(), (L3) this.f5690c.get());
    }
}
