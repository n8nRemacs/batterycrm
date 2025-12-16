package dI0;

import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import lD.C43617a;

/* compiled from: PublishWaterUxFeedbackHelperImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class d implements h<C39587c> {

    /* renamed from: a, reason: collision with root package name */
    public final u f393780a;

    /* renamed from: b, reason: collision with root package name */
    public final u f393781b;

    public d(u uVar, u uVar2) {
        this.f393780a = uVar;
        this.f393781b = uVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new C39587c((SK0.b) this.f393780a.get(), (C43617a) this.f393781b.get());
    }
}
