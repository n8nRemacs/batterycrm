package Fc1;

import feedback.shared.sdk.api.network.entities.CampaignInfo;

@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: Fc1.l1, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C13661l1 implements dagger.internal.h<F0> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.h f5644a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f5645b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.h f5646c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.u f5647d;

    /* renamed from: e, reason: collision with root package name */
    public final dagger.internal.u f5648e;

    /* renamed from: f, reason: collision with root package name */
    public final dagger.internal.u f5649f;

    /* renamed from: g, reason: collision with root package name */
    public final dagger.internal.u f5650g;

    public C13661l1(dagger.internal.l lVar, dagger.internal.u uVar, dagger.internal.l lVar2, dagger.internal.u uVar2, dagger.internal.u uVar3, dagger.internal.u uVar4, dagger.internal.u uVar5) {
        this.f5644a = lVar;
        this.f5645b = uVar;
        this.f5646c = lVar2;
        this.f5647d = uVar2;
        this.f5648e = uVar3;
        this.f5649f = uVar4;
        this.f5650g = uVar5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new F0((CampaignInfo) this.f5644a.get(), (U7) this.f5645b.get(), (InterfaceC13715r2) this.f5646c.get(), (io.reactivex.rxjava3.disposables.c) this.f5647d.get(), (F4) this.f5648e.get(), (J2) this.f5649f.get(), (kotlinx.coroutines.T) this.f5650g.get());
    }
}
