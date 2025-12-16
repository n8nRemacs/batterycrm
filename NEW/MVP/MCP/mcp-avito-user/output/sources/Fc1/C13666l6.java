package Fc1;

@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: Fc1.l6, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C13666l6 implements dagger.internal.h<T5> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f5660a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f5661b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.u f5662c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.u f5663d;

    public C13666l6(dagger.internal.u uVar, dagger.internal.u uVar2, dagger.internal.u uVar3, dagger.internal.u uVar4) {
        this.f5660a = uVar;
        this.f5661b = uVar2;
        this.f5662c = uVar3;
        this.f5663d = uVar4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new T5((C13607f1) this.f5660a.get(), (U3) this.f5661b.get(), (C13611f5) this.f5662c.get(), (kotlinx.coroutines.T) this.f5663d.get());
    }
}
