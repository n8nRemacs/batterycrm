package Fc1;

import java.util.Map;

@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: Fc1.j2, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C13644j2 implements dagger.internal.h<U1> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f5593a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f5594b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.l f5595c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.u f5596d;

    /* renamed from: e, reason: collision with root package name */
    public final dagger.internal.u f5597e;

    public C13644j2(dagger.internal.u uVar, dagger.internal.u uVar2, dagger.internal.l lVar, dagger.internal.u uVar3, dagger.internal.u uVar4) {
        this.f5593a = uVar;
        this.f5594b = uVar2;
        this.f5595c = lVar;
        this.f5596d = uVar3;
        this.f5597e = uVar4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new U1((C13747u7) this.f5593a.get(), (C13611f5) this.f5594b.get(), (I4) this.f5595c.f393949a, (Map) this.f5596d.get(), (kotlinx.coroutines.T) this.f5597e.get());
    }
}
