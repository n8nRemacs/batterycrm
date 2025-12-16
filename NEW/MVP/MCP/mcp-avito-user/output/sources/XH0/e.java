package XH0;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import lD.C43617a;

/* compiled from: PublishCsatUxFeedbackGenericHelperImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class e implements dagger.internal.h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final u f18817a;

    /* renamed from: b, reason: collision with root package name */
    public final u f18818b;

    /* renamed from: c, reason: collision with root package name */
    public final u f18819c;

    public e(u uVar, u uVar2, u uVar3) {
        this.f18817a = uVar;
        this.f18818b = uVar2;
        this.f18819c = uVar3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new d((f) this.f18817a.get(), (SK0.b) this.f18818b.get(), (C43617a) this.f18819c.get());
    }
}
