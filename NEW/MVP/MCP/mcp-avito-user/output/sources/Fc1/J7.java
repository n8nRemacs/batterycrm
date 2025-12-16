package Fc1;

@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes9.dex */
public final class J7 implements dagger.internal.h<C13720r7> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.h f5046a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.h f5047b;

    public J7(dagger.internal.l lVar, dagger.internal.l lVar2) {
        this.f5046a = lVar;
        this.f5047b = lVar2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C13720r7((L3) this.f5046a.get(), (InterfaceC13753v4) this.f5047b.get());
    }
}
