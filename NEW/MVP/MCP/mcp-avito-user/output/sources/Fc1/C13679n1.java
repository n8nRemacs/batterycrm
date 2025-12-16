package Fc1;

@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: Fc1.n1, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C13679n1 implements dagger.internal.h<V0> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f5691a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f5692b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.u f5693c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.l f5694d;

    /* renamed from: e, reason: collision with root package name */
    public final dagger.internal.u f5695e;

    /* renamed from: f, reason: collision with root package name */
    public final dagger.internal.u f5696f;

    /* renamed from: g, reason: collision with root package name */
    public final dagger.internal.l f5697g;

    /* renamed from: h, reason: collision with root package name */
    public final dagger.internal.u f5698h;

    public C13679n1(dagger.internal.u uVar, dagger.internal.u uVar2, dagger.internal.u uVar3, dagger.internal.l lVar, dagger.internal.u uVar4, dagger.internal.u uVar5, dagger.internal.l lVar2, dagger.internal.u uVar6) {
        this.f5691a = uVar;
        this.f5692b = uVar2;
        this.f5693c = uVar3;
        this.f5694d = lVar;
        this.f5695e = uVar4;
        this.f5696f = uVar5;
        this.f5697g = lVar2;
        this.f5698h = uVar6;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        V0 v02 = new V0();
        v02.f5244a = (C13611f5) this.f5691a.get();
        v02.f5245b = (U3) this.f5692b.get();
        v02.f5246c = (U1) this.f5693c.get();
        v02.f5247d = (I4) this.f5694d.f393949a;
        v02.f5248e = (N1) this.f5695e.get();
        v02.f5249f = (J2) this.f5696f.get();
        v02.f5250g = (InterfaceC13753v4) this.f5697g.f393949a;
        v02.f5251h = (kotlinx.coroutines.T) this.f5698h.get();
        return v02;
    }
}
