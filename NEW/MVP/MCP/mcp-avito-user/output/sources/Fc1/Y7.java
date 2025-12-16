package Fc1;

@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes9.dex */
public final class Y7 implements dagger.internal.h<DialogC13657k6> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.h f5342a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f5343b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.u f5344c;

    public Y7(dagger.internal.l lVar, dagger.internal.u uVar, dagger.internal.u uVar2) {
        this.f5342a = lVar;
        this.f5343b = uVar;
        this.f5344c = uVar2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new DialogC13657k6((L3) this.f5342a.get(), (V1) this.f5343b.get(), (U6) this.f5344c.get());
    }
}
