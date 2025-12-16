package Fc1;

import android.content.Context;

@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: Fc1.x1, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C13768x1 implements dagger.internal.h<C13607f1> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.h f5881a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f5882b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.l f5883c;

    public C13768x1(dagger.internal.l lVar, dagger.internal.l lVar2, dagger.internal.l lVar3) {
        this.f5881a = lVar;
        this.f5882b = lVar2;
        this.f5883c = lVar3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        C13607f1 c13607f1 = new C13607f1();
        c13607f1.f5493a = (T1) this.f5881a.get();
        c13607f1.f5494b = (InterfaceC13753v4) this.f5882b.f393949a;
        c13607f1.f5495c = (Context) this.f5883c.f393949a;
        return c13607f1;
    }
}
