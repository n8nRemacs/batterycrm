package Fc1;

@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: Fc1.w5, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C13763w5 implements dagger.internal.h<C13611f5> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f5873a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f5874b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.h f5875c;

    public C13763w5(dagger.internal.l lVar, dagger.internal.l lVar2, dagger.internal.l lVar3) {
        this.f5873a = lVar;
        this.f5874b = lVar2;
        this.f5875c = lVar3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new C13611f5((InterfaceC13753v4) this.f5873a.f393949a, (Z0) this.f5874b.f393949a, (String) this.f5875c.get());
    }
}
