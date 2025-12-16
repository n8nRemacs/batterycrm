package ZH0;

import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import lD.C43617a;

/* compiled from: PublishMotoUxFeedbackHelperImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class d implements h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final u f20077a;

    /* renamed from: b, reason: collision with root package name */
    public final u f20078b;

    public d(u uVar, u uVar2) {
        this.f20077a = uVar;
        this.f20078b = uVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new c((SK0.b) this.f20077a.get(), (C43617a) this.f20078b.get());
    }
}
